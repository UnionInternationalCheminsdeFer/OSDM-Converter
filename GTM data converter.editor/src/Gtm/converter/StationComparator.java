package Gtm.converter;

import java.util.Comparator;

import Gtm.Station;

public class StationComparator implements Comparator<Station> {


		@Override
		public int compare(Station o1, Station o2) {
			
			if (o1.getName() == null) return 1;
			if (o2.getName() == null) return -1;
			
			return o1.getName().compareTo(o2.getName());
		}

		
}
