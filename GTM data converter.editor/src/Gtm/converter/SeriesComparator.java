package Gtm.converter;

import java.util.Comparator;
import Gtm.LegacySeries;

public class SeriesComparator implements Comparator<LegacySeries> {

	@Override
	public int compare(LegacySeries o1, LegacySeries o2) {
		
		int i = Integer.compare(o1.getType().getValue(),o2.getType().getValue());
		if (i != 0) return i;
				
		i = o1.getFromStationName().compareTo(o2.getFromStationName());
		
		if (i != 0) return i;
		
		i = o1.getToStationName().compareTo(o2.getToStationName());
		
		if (i != 0) return i;
		
		return Integer.compare(o1.getRouteNumber(),o2.getRouteNumber());

	}

}
