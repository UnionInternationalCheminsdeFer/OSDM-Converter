package Gtm.utils;

import Gtm.Station;
import Gtm.StationSet;

public class StationSelector {

	
	public static Station selectStation(String name, StationSet set) {
		
		String search = name.toUpperCase().trim();
		
		int distance = 99999;
		
		Station foundStation = null;
		
		for (Station station: set.getStations()) {
			
			String s = station.getNameCaseASCII().toUpperCase().trim();
			
			int d = LevenshteinDistance.calculate(search, s);
			
			if (d == 0) return station;
			
			if (d < distance) {
				foundStation = station;
				distance = d;		
			}
		}
		
		return foundStation;
	}
	
}
