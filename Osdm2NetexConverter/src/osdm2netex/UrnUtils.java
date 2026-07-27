package osdm2netex;

import Gtm.Carrier;
import Gtm.ReductionCard;
import Gtm.ServiceClass;
import Gtm.Station;
import Gtm.TravelerType;

public class UrnUtils {
	
    public static String getStationUri (long l) {
    	StringBuilder sb = new StringBuilder();
    	sb.append("urn:uic:stn:").append(l);
    	return sb.toString();
    }

	public static String getStationUri(String code) {
		if (code.startsWith("urn")) return code;
		
		if (code.length() > 7) {
			return "zone_" + code;
		}
		
		return "urn:uic:stn:" + code;
	}
	
	public static String getStationUri (Station s) {
		if (s == null || (s.getCode() == null && s.getStationCode() == 0) ) return "missing code";
		
		if (s.getCode() != null && s.getCode().startsWith("urn")) return s.getCode();
		
		if (s.getStationCode() > 99999) {
	    	StringBuilder sb = new StringBuilder();
	    	sb.append("urn:uic:stn:").append(s.getStationCode());
	    	return sb.toString();
		}
		

		return "urn:uic:stn:" + s.getCode();
	}
	
    
	public static String getCompanyUri(Carrier ca) {
		if (ca == null || ca.getCode() == null) return "missing code";
		if (ca.getCode().startsWith("urn")) return ca.getCode();
		return "urn:uic:rics:" + ca.getCode().trim();
	}

	public static String getClassUri(ServiceClass sc) {
		if (sc == null || sc.getId() == null) return "missing code";
		return "urn:uic:osdm:serviceClass:" + sc.getId().getLiteral().trim();
	}
	
	public static String getCardUri(ReductionCard rc) {
		if (rc == null || rc.getId() == null) return "missing code";
		return "urn:uic:osdm:card:" + rc.getId().trim();
	}

	public static String getPassengerTypeUri(TravelerType travelerType) {
		if (travelerType == null) return "missing code";
		return "urn:uic:osdm:travelerType:" + travelerType.getLiteral().trim();
	}

	public static String getCompanyUri(String string) {
		return "urn:uic:osdm:company:" + string.trim();
	}	
	
	public static String getServiceBrandUri(String string) {
		return "urn:uic:sbr:" + string.trim();
	}		

}
