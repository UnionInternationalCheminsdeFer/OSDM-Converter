package osdm2netex;

import Gtm.ClassId;
import uk.org.netex.netex.FareClassEnumeration;

public class Osdm2FareClass {

	
	public static FareClassEnumeration convert(ClassId serviceClass) {
		
		if (serviceClass.equals(ClassId.ANY_CLASS)) {
			return FareClassEnumeration.ANY;
		} else if (serviceClass.equals(ClassId.A)) {
			return FareClassEnumeration.PREMIUM_CLASS;
		} else if (serviceClass.equals(ClassId.B)) {
			return FareClassEnumeration.FIRST_CLASS;
		} else if (serviceClass.equals(ClassId.C)) {
			return FareClassEnumeration.ECONOMY_CLASS;
		} else if (serviceClass.equals(ClassId.D)) {
			return FareClassEnumeration.SECOND_CLASS;
		} 
		return null;
	}
}
