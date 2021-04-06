package Gtm.converter;

import java.util.Comparator;
import Gtm.ServiceBrand;

public class ServiceBrandComparator implements Comparator<ServiceBrand> {

	@Override
	public int compare(ServiceBrand o1, ServiceBrand o2) {
		
		int i = o1.getAbbreviation().compareTo(o2.getAbbreviation());
		if (i != 0) return i;
				
		i = o1.getDescription().compareTo(o2.getDescription());
		
		if (i != 0) return i;
		
		return o1.getName().compareTo(o2.getName());

	}

}
