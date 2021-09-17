package Gtm.converter;

import java.util.Comparator;

import Gtm.Station;

public class StationByNumberComparator implements Comparator<Station> {


		@Override
		public int compare(Station o1, Station o2) {
			
			if (o2 == null || o2.getCountry() == null || o2.getCode() == null) return 1;
			if (o1 == null || o1.getCountry() == null || o1.getCode() == null) return 1;
			
			int i = Integer.compare(o1.getCountry().getCode(), o2.getCountry().getCode());
			
			if (i!= 0) return i;
								
			return o1.getCode().compareTo(o2.getCode());
		}

		
}
