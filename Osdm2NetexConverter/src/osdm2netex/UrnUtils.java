package osdm2netex;

public class UrnUtils {
	
    public static String getStationUri (String code) {
    	return "urn:uic:stn:" + code.trim();
    }


}
