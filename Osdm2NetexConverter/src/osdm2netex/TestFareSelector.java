package osdm2netex;

import Gtm.FareStationSetDefinition;
import Gtm.FareStationSetDefinitions;
import Gtm.RegionalConstraint;
import Gtm.Station;
import Gtm.StationNames;

public class TestFareSelector {
	
	private static String regionalConstraintId = "1080_2024.01_K__12";
	
	private static boolean test = false;
	
	
	public static boolean selectRegionalConstraint(RegionalConstraint rc) {
		
		if (test) {
			return regionalConstraintId.equals(rc.getId());
		} 
		return true;
	}


	public static boolean selectStation(Station s, StationNames stationNames) {

		if (test) {
		  return stationNames.getStationName().indexOf(s) == 0;
		} 
		return true;
		
	}


	public static boolean selectStationSets(FareStationSetDefinition stationSet,
			FareStationSetDefinitions fareStationSetDefinitions) {
	
		if (test) {
		  return fareStationSetDefinitions.getFareStationSetDefinitions().indexOf(stationSet) == 0;
	    } 
	    return true;
	}

}
