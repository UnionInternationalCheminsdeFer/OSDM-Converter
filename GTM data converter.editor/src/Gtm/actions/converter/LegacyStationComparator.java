package Gtm.actions.converter;

import java.util.Comparator;

import Gtm.Legacy108Station;

public class LegacyStationComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {

		if (((Legacy108Station)o1).getName() == null) return -1;
		if (((Legacy108Station)o2).getName() == null) return 1;
		
		return ((Legacy108Station)o1).getName().compareTo(((Legacy108Station)o2).getName());

	}

}
