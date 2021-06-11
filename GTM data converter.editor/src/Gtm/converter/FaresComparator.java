package Gtm.converter;

import java.util.Comparator;

import Gtm.LegacyRouteFare;

public class FaresComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		
		LegacyRouteFare f1 = (LegacyRouteFare)o1;
		LegacyRouteFare f2 = (LegacyRouteFare)o2;

		int r = f1.getSeries().getFromStationName().compareTo(f2.getSeries().getFromStationName());
			
		if (r != 0) return r;
			
		r = f1.getSeries().getToStationName().compareTo(f2.getSeries().getToStationName());
			
		if (r != 0) return r;
		
		r = Integer.compare(f1.getFare2nd(),f2.getFare2nd());
		
		if (r != 0) return r;
		
		return r;
	}

}
