package osdm2netex;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

import Gtm.ConnectionPoint;
import Gtm.FareStructure;
import Gtm.util.RouteDescriptionBuilder;
import uk.org.netex.netex.BorderPoint;
import uk.org.netex.netex.ConnectionRefStructure;
import uk.org.netex.netex.DistanceMatrixElement;
import uk.org.netex.netex.DistanceMatrixElementsRelStructure;
import uk.org.netex.netex.FareBasisEnumeration;
import uk.org.netex.netex.FareFrame;
import uk.org.netex.netex.FareStructureElement;
import uk.org.netex.netex.ObjectFactory;
import uk.org.netex.netex.ScheduledStopPointRefStructure;
import uk.org.netex.netex.SeriesConstraint;
import uk.org.netex.netex.SeriesConstraintsRelStructure;

public class Osdm2Series {
	
	
	public static void convertRegionalValidity(FareStructure osdmFares, FareFrame fareFrameNrt, ObjectFactory factory) {

		for (Gtm.RegionalConstraint rc : osdmFares.getRegionalConstraints().getRegionalConstraints()) {

			if (TestFareSelector.selectRegionalConstraint(rc)) {
			
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
			
			}

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
