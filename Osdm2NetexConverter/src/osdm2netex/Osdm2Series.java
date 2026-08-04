package osdm2netex;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import Gtm.AlternativeRoute;
import Gtm.ConnectionPoint;
import Gtm.FareStationSetDefinition;
import Gtm.FareStructure;
import Gtm.RegionalConstraint;
import Gtm.RegionalValidity;
import Gtm.Route;
import Gtm.Station;
import Gtm.ViaStation;
import Gtm.util.RouteDescriptionBuilder;
import uk.org.netex.netex.AlternativeName;
import uk.org.netex.netex.BorderPoint;
import uk.org.netex.netex.ConnectionRefStructure;
import uk.org.netex.netex.DistanceMatrixElement;
import uk.org.netex.netex.DistanceMatrixElementsRelStructure;
import uk.org.netex.netex.FareBasisEnumeration;
import uk.org.netex.netex.FareFrame;
import uk.org.netex.netex.FareStructureElement;
import uk.org.netex.netex.FareZone;
import uk.org.netex.netex.ObjectFactory;
import uk.org.netex.netex.PointRefsRelStructure;
import uk.org.netex.netex.PublicCodeStructure;
import uk.org.netex.netex.ScheduledStopPointRefStructure;
import uk.org.netex.netex.SeriesConstraint;
import uk.org.netex.netex.SeriesConstraintsRelStructure;
import uk.org.netex.netex.SiteFrame;
import uk.org.netex.netex.StopPlace;

public class Osdm2Series {
	
	
	public static void convertRegionalValidity(FareStructure osdmFares, FareFrame fareFrameNrt, SiteFrame siteFrame, ObjectFactory factory) {

		for (Gtm.RegionalConstraint rc : osdmFares.getRegionalConstraints().getRegionalConstraints()) {

			if (NeTExSplitter.getInstance().selectRegionalConstraint(rc)) {
			
				FareStructureElement se = factory.createFareStructureElement();
				se.setId(IdFactory.getFareStructureElementRegionId(rc));
				NeTExUtils.setTypeOf(se,"efp:access");
				
				DistanceMatrixElementsRelStructure dmr = factory.createDistanceMatrixElementsRelStructure();			
				DistanceMatrixElement dm = factory.createDistanceMatrixElement();
				dmr.getDistanceMatrixElementRefOrDistanceMatrixElement().add(dm);
				se.setDistanceMatrixElements(dmr);
				
				dm.setId(IdFactory.getFareStructureElementRegionId(rc));
				dm.setDistance(BigDecimal.valueOf(rc.getDistance()));
	
				
				String startCode = RouteDescriptionBuilder.getFirstStationCode(rc.getRegionalValidity());
				String endCode = RouteDescriptionBuilder.getLastStationCode(rc.getRegionalValidity());
				String startCodeUrn = UrnUtils.getStationUri(RouteDescriptionBuilder.getFirstStationCode(rc.getRegionalValidity()));
				String endCodeUrn = UrnUtils.getStationUri(RouteDescriptionBuilder.getLastStationCode(rc.getRegionalValidity()));
				
				if (startCode.length() < 8) {
					ScheduledStopPointRefStructure spr = factory.createScheduledStopPointRefStructure();
					spr.setRef(startCodeUrn);
					dm.setStartStopPointRef(spr);
				} else {
					ScheduledStopPointRefStructure spr = factory.createScheduledStopPointRefStructure();
					spr.setRef(startCode);
					dm.setStartStopPointRef(spr);
				}
	
				if (endCode.length() < 8) {
					ScheduledStopPointRefStructure spr = factory.createScheduledStopPointRefStructure();
					spr.setRef(endCodeUrn);
					dm.setEndStopPointRef(spr);
				}	else {
					ScheduledStopPointRefStructure spr = factory.createScheduledStopPointRefStructure();
					spr.setRef(endCode);
					dm.setEndStopPointRef(spr);				
				}
	
				
				SeriesConstraint sc = factory.createSeriesConstraint();
				SeriesConstraintsRelStructure scr = factory.createSeriesConstraintsRelStructure();
				scr.getSeriesConstraintRefOrSeriesConstraint().add(sc);
				dm.setSeriesConstraints(scr);
				
				sc.setFareBasis(FareBasisEnumeration.ROUTE);
				String routeDescription = RouteDescriptionBuilder.getRouteDescription(rc);
				sc.setItinerary(Osdm2MultiLanguageString.getMultiLanguageString(routeDescription));	
				sc.setId(IdFactory.getFareStructureElementRegionId(rc));
				
				if (rc.getEntryConnectionPoint() != null && rc.getEntryConnectionPoint().getLegacyBorderPointCode() > 0) {
					ConnectionRefStructure fcr = factory.createConnectionRefStructure();
					fcr.setRef(getRef(rc.getEntryConnectionPoint()));
					addBorderPointToFrame(fareFrameNrt,rc.getEntryConnectionPoint(),factory );
					sc.setFromConnectionRef(fcr);
				}
				
				if (rc.getExitConnectionPoint() != null && rc.getExitConnectionPoint().getLegacyBorderPointCode() > 0) {
					ConnectionRefStructure tcr = factory.createConnectionRefStructure();
					tcr.setRef(getRef(rc.getExitConnectionPoint()));		
					addBorderPointToFrame(fareFrameNrt,rc.getExitConnectionPoint(),factory );
					sc.setToConnectionRef(tcr);
				}
				
				fareFrameNrt.getFareStructureElements().getFareStructureElement().add(se);
			
				
				HashSet<Station> stations = new HashSet<Station>(); 
				HashSet<FareStationSetDefinition> stationSets = new HashSet<FareStationSetDefinition>(); 
				initLists(rc,stations,stationSets);
				
				addStationsToSiteFrame(siteFrame,stations, factory);
				
				addZonesToFareFrame(fareFrameNrt, stationSets, factory);
				
			}

		}
	}

	private static void addZonesToFareFrame(FareFrame fareFrameNrt, HashSet<FareStationSetDefinition> stationSets,
			ObjectFactory factory) {
		
		if (stationSets == null || stationSets.isEmpty()) return;
		
		for (FareStationSetDefinition stationSet : stationSets) {
			
			FareZone zone = factory.createFareZone();
				
			zone.setId(IdFactory.getId(stationSet));
			zone.setName(Osdm2MultiLanguageString.getMultiLanguageString(stationSet.getNameUtf8()));
			PointRefsRelStructure stationList = factory.createPointRefsRelStructure();
				
			for (  Station station : stationSet.getStations()) {
				String stationUrn = UrnUtils.getStationUri(station);
				ScheduledStopPointRefStructure sp = factory.createScheduledStopPointRefStructure();
				sp.setUri(stationUrn);						
				stationList.getPointRef().add(factory.createScheduledStopPointRef(sp));
			}
				
			zone.setMembers(stationList);
				
			fareFrameNrt.getFareZones().getFareZone().add(zone);

		}
	
	}

	private static void addStationsToSiteFrame(SiteFrame siteFrame, HashSet<Station> stations, ObjectFactory factory) {

		if (stations == null || stations.isEmpty()) return;
		
		for ( Gtm.Station s : stations) {
			
			StopPlace stop = factory.createStopPlace();
			
			stop.setId(UrnUtils.getStationUri(s));
			stop.setName(Osdm2MultiLanguageString.getMultiLanguageString(s.getNameCaseUTF8()));
			stop.setShortName(Osdm2MultiLanguageString.getMultiLanguageString(s.getShortNameCaseUTF8()));
			
			stop.setAlternativeNames(factory.createAlternativeNamesRelStructure());
			AlternativeName an1 = factory.createAlternativeName();
			an1.setName(Osdm2MultiLanguageString.getMultiLanguageString(s.getName()));
			stop.getAlternativeNames().getAlternativeName().add(an1);
				
			PublicCodeStructure pcs = factory.createPublicCodeStructure();
			pcs.setType("UIC");		
			pcs.setValue(UrnUtils.getStationUri(s.getStationCode()));		
			stop.setPublicCode(pcs);
			stop.setCentroid(factory.createSimplePointVersionStructure());
			stop.getCentroid().setLocation(factory.createLocationStructure());
			String lat = Float.toString(s.getLatitude());
			stop.getCentroid().getLocation().setLatitude(new BigDecimal(lat));
			String lon = Float.toString(s.getLongitude());
			stop.getCentroid().getLocation().setLongitude(new BigDecimal(lon));
					
			siteFrame.getStopPlaces().getStopPlace().add(stop);
				
		}
		
	}

	private static void initLists(RegionalConstraint rc, HashSet<Station> stations, HashSet<FareStationSetDefinition> stationSets) {
		
		if (rc == null) return;
		
		for (RegionalValidity rv : rc.getRegionalValidity()) {
			
			initLists(rv,stations, stationSets);
			
		}

		
	}


	private static void initLists(RegionalValidity rv, HashSet<Station> stations, HashSet<FareStationSetDefinition> stationSets) {
		
		if (rv == null) return;
		initLists(rv.getViaStation(),stations, stationSets);
		
	}


	private static void initLists(ViaStation vs, HashSet<Station> stations, HashSet<FareStationSetDefinition> stationSets) {
		if (vs == null) return;
		
		initLists(vs.getFareStationSet(), stations, stationSets);
		initLists(vs.getRoute(),stations, stationSets);
		
		if (vs.getAlternativeRoutes() != null && !vs.getAlternativeRoutes().isEmpty()) {
			for ( AlternativeRoute ar : vs.getAlternativeRoutes()) {
				initLists(ar,stations, stationSets);
			}
		}
		
		initLists(vs.getStation(),stations, stationSets);
		initLists(vs.getFareStationSet(),stations, stationSets);
		
	}

	private static void initLists(AlternativeRoute ar, HashSet<Station> stations, HashSet<FareStationSetDefinition> stationSets) {
		
		if (ar == null) return;
		for (ViaStation vs : ar.getStations()) {
			initLists(vs,stations, stationSets);
		}
		
	}


	private static void initLists(Station station, HashSet<Station> stations, HashSet<FareStationSetDefinition> stationSets) {
		
		if (station == null) return;
		stations.add(station);
		
	}


	private static void initLists(Route route, HashSet<Station> stations, HashSet<FareStationSetDefinition> stationSets) {
		
		if (route == null) return;
		for (ViaStation vs : route.getStations()) {
			initLists(vs,stations, stationSets);
		}
	}


	private static void initLists(FareStationSetDefinition set, HashSet<Station> stations, HashSet<FareStationSetDefinition> stationSets) {
		
		if (set == null) return;
		stationSets.add(set);
		
		for (Station s : set.getStations()) {
			stations.add(s);
		}

	}
	
	private static void addBorderPointToFrame(FareFrame fareFrameNrt, ConnectionPoint cp, ObjectFactory factory) {

		if (fareFrameNrt.getBorderPoints() == null) {
			fareFrameNrt.setBorderPoints(factory.createBorderPointsInFrameRelStructure());
		}
		
		String ref = getRef(cp);
		
		for (BorderPoint b : fareFrameNrt.getBorderPoints().getBorderPoint()) {
			if (b.getId().equals(ref)) {
				return;
			}
		}

		BorderPoint b = factory.createBorderPoint();
		b.setId(ref);
		if (cp.getNameUtf8() != null) {
			b.setName(Osdm2MultiLanguageString.getMultiLanguageString(cp.getNameUtf8()));
		} else {
			try {
				String name = cp.getConnectedStationSets().getFirst().getStations().getFirst().getNameCaseUTF8();
				if (name.endsWith("(GR)") || name.endsWith("(FR)")  ) {
					//
				} else {
					name = name + " (FR)";
				}
				if (name != null) {
					b.setName(Osdm2MultiLanguageString.getMultiLanguageString(name));
				}
			} catch (Exception e) {
				//
			}
		}
		fareFrameNrt.getBorderPoints().getBorderPoint().add(b);
	}	
	
	
	
	public static String getRef(ConnectionPoint connectionPoint) {
		ArrayList<String> scs = new ArrayList<String>();
		for (Gtm.StationSet ss : connectionPoint.getConnectedStationSets()) {
			
			for (Gtm.Station st : ss.getStations()) {
				
				scs.add(Long.toString(st.getStationCode()));
			}
			
		}
		
		Collections.sort(scs);
		
		StringBuilder sb = new StringBuilder();
		
		boolean first = true;
		for (String s : scs) {
			if (first) {
				first = false;
			} else {
				sb.append("-");
			}
			sb.append(s);
		}
		
		return sb.toString();
	}
	
	
	


}
