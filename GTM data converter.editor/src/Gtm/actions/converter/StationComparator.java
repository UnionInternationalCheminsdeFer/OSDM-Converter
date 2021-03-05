package Gtm.actions.converter;

import java.util.Comparator;

import Gtm.Station;

public class StationComparator implements Comparator<Station> {


		@Override
		public int compare(Station o1, Station o2) {
			return o1.getNameCaseASCII().compareTo(o2.getName());
		}

		
}
