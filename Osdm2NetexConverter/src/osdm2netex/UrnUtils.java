package osdm2netex;

public class UrnUtils {
	
    public static String getStationUri (long l) {
    	StringBuilder sb = new StringBuilder();
    	sb.append("urn:uic:stn:").append(l);
    	return sb.toString();
    }

	public static String getStationUri(String code) {
		return "urn:uic:stn:" + code;
	}
    
    


}
