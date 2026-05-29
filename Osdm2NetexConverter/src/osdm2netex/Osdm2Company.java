package osdm2netex;

public class Osdm2Company {
	
    public static String getCompanyUri (String code) {
    	return "urn:uic:rics:" + code.trim();
    }

}
