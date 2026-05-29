package osdm2netex;

import Gtm.TravelerType;
import uk.org.netex.netex.UserTypeEnumeration;

public class Osdm2PassengerType {

	public static UserTypeEnumeration convertPassengerType(TravelerType travelerType) {
		
		if (travelerType.equals(TravelerType.ACCOMP_DOG)){
			return UserTypeEnumeration.GUIDE_DOG;
		} else if (travelerType.equals(TravelerType.ACCOMP_PRM)){
			return UserTypeEnumeration.DISABLED_COMPANION;
		} else if (travelerType.equals(TravelerType.ADULT)){
			return UserTypeEnumeration.ADULT;
		} else if (travelerType.equals(TravelerType.BICYCLE)){
			return UserTypeEnumeration.OTHER;
		} else if (travelerType.equals(TravelerType.CAR)){
			return UserTypeEnumeration.OTHER;
		} else if (travelerType.equals(TravelerType.CHILD)){
			return UserTypeEnumeration.CHILD;
		} else if (travelerType.equals(TravelerType.DOG)){
			return UserTypeEnumeration.OTHER;
		} else if (travelerType.equals(TravelerType.FAMILY_CHILD)){
			return UserTypeEnumeration.OTHER;
		} else if (travelerType.equals(TravelerType.LUGGAGE)){
			return UserTypeEnumeration.OTHER;
		} else if (travelerType.equals(TravelerType.MOTOCYCLE)){
			return UserTypeEnumeration.OTHER;
		} else if (travelerType.equals(TravelerType.PRM_CHILD)){
			return UserTypeEnumeration.OTHER;
		} else if(travelerType.equals(TravelerType.SENIOR)){
			return UserTypeEnumeration.SENIOR;
		} else if(travelerType.equals(TravelerType.TRAILER)){
			return UserTypeEnumeration.OTHER;
		} else if(travelerType.equals(TravelerType.YOUNG_CHILD)){
			return UserTypeEnumeration.INFANT;
		} else if(travelerType.equals(TravelerType.YOUTH)){
			return UserTypeEnumeration.YOUNG_PERSON;
		} 
		return null;
	}
}
