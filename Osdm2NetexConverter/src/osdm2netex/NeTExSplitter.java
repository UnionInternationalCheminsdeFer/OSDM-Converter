package osdm2netex;

import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;

import Gtm.AlternativeRoute;
import Gtm.FareStationSetDefinition;
import Gtm.FareStationSetDefinitions;
import Gtm.FareStructure;
import Gtm.RegionalConstraint;
import Gtm.RegionalValidity;
import Gtm.Route;
import Gtm.Station;
import Gtm.StationNames;
import Gtm.ViaStation;
import Gtm.util.GtmUtils;
import Gtm.util.RouteDescriptionBuilder;

public class NeTExSplitter {

	private static NeTExSplitter me = null;
	
	private String filterLetter = null;
	
	private static String regionalConstraintId = "1080_2024.01_K__1";
	//private static String regionalConstraintId2= "1080_2024.01_K__12";
	//private static String regionalConstraintId3 = "1080_2024.01_K__13009";
	
	private static boolean test = false;
	
	private static HashSet<Long> stations = new HashSet<Long>(); 

	private static HashSet<String> stationSets = new HashSet<String>(); 
	
	private NeTExSplitter() {
		
	}
	
	public static NeTExSplitter getInstance() {
		if (me == null) {
			me = new NeTExSplitter();
			stations = new HashSet<Long>(); 
			stationSets = new HashSet<String>(); 
		}
		return me;
	}
	
	public void setFilterLetter(String filterLetter) {
		this.filterLetter = filterLetter;
		stations = new HashSet<Long>(); 
		stationSets = new HashSet<String>(); 
	}

	public String getFilterLetter() {
		return this.filterLetter; 
	}
	
	public boolean selectRegionalConstraint(RegionalConstraint rc) {
		
		if (test) {
			
			initLists(rc,stations, stationSets);
			
			return (rc.getId().startsWith(regionalConstraintId) ) ;
			
		} else if (filterLetter != null && filterLetter.length() > 0) {
			
			String start = RouteDescriptionBuilder.getFirstStationName(rc);

			String firstLetter = GtmUtils.toPrintableAscII(start.substring(0,1));	
			
			boolean includeRegionalConstraint = filterLetter.equals(firstLetter);
			
			if (includeRegionalConstraint) {
					initLists(rc,stations, stationSets);
			}
					
			return includeRegionalConstraint;
			
		} 
		
		return true;
	}


	private static void initLists(RegionalConstraint rc, HashSet<Long> stations, HashSet<String> stationSets) {
		
		if (rc == null) return;
		
		for (RegionalValidity rv : rc.getRegionalValidity()) {
			
			initLists(rv,stations, stationSets);
			
		}

		
	}


	private static void initLists(RegionalValidity rv, HashSet<Long> stations,	HashSet<String> stationSets) {
		
		if (rv == null) return;
		initLists(rv.getViaStation(),stations, stationSets);
		
	}


	private static void initLists(ViaStation vs, HashSet<Long> stations, HashSet<String> stationSets) {
		if (vs == null) return;
		
		initLists(vs.getFareStationSet(),stations, stationSets);
		initLists(vs.getRoute(),stations, stationSets);
		
		if (vs.getAlternativeRoutes() != null && !vs.getAlternativeRoutes().isEmpty()) {
			for ( AlternativeRoute ar : vs.getAlternativeRoutes()) {
				initLists(ar,stations, stationSets);
			}
		}
		
		initLists(vs.getStation(),stations, stationSets);
		initLists(vs.getFareStationSet(),stations, stationSets);
		
	}



	private static void initLists(AlternativeRoute ar, HashSet<Long> stations, HashSet<String> stationSets) {
		
		if (ar == null) return;
		for (ViaStation vs : ar.getStations()) {
			initLists(vs,stations, stationSets);
		}
		
	}


	private static void initLists(Station station, HashSet<Long> stations, HashSet<String> stationSets) {
		
		if (station == null) return;
		stations.add(Long.valueOf(station.getStationCode()));
		
	}


	private static void initLists(Route route, HashSet<Long> stations,	HashSet<String> stationSets) {
		
		if (route == null) return;
		for (ViaStation vs : route.getStations()) {
			initLists(vs,stations, stationSets);
		}
	}


	private static void initLists(FareStationSetDefinition set, HashSet<Long> stations,	HashSet<String> stationSets) {
		
		if (set == null) return;
		stationSets.add(set.getId());
		
		for (Station s : set.getStations()) {
			stations.add(s.getStationCode());
		}

	}
	
	private void initLists(EObject o) {
		
		if (!stations.isEmpty()) return;
		
		  FareStructure fs = GtmUtils.getFareStructure(o);
			  
		  for (RegionalConstraint rc :  fs.getRegionalConstraints().getRegionalConstraints()) {
			  if (selectRegionalConstraint(rc)) {
				  initLists(rc,stations, stationSets  );
			  }
		  }
			  
	}


	public boolean selectStation(Station s, StationNames stationNames) {

		if (test) {
			
			initLists(stationNames);
			
			return (stations.contains(s.getStationCode()));
		  	
		} 
		return true;
		
	}


	public boolean selectStationSets(FareStationSetDefinition stationSet,
			FareStationSetDefinitions fareStationSetDefinitions) {
	
		if (test) {

			initLists(fareStationSetDefinitions);
			
			return (stationSets.contains(stationSet.getId()));
			
	    } 
	    return true;
	}

}
