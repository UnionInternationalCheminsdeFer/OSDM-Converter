package Gtm.jsonImportExport;

import java.util.Comparator;

import Gtm.FareStationSetDefinition;

public class FareStationSetComparator implements Comparator<FareStationSetDefinition> {

	@Override
	public int compare(FareStationSetDefinition o1, FareStationSetDefinition o2) {
		
		if (o1.getName() == null) return 1;
		if (o2.getName() == null) return -1;
		
		return o1.getName().compareTo(o2.getName());
		

	}

}
