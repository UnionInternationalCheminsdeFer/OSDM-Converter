package Gtm.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFormatValidator {
	
	// printable ASCII codes: "^[ -~]*$"
	

   private static Pattern stationUTFForbiddenPattern = Pattern.compile("\\*");
   private static Pattern stationASCPattern = Pattern.compile("[\\x20-\\x7E]+");
   private static Pattern ASCPattern = Pattern.compile("[\\x20-\\x7E]+");
	
	public static boolean isASCII(String s) {
		if (s == null) return false;
		if (s.length() < 1) return false;
		Matcher mtch = ASCPattern.matcher(s);
	    return mtch.matches();
	}

	
	public static boolean isStationASCII(String s) {
		if (s == null) return false;
		if (s.length() < 1) return false;
	    Matcher mtch = stationASCPattern.matcher(s);
	    return mtch.matches();
	}
	
	public static boolean isStationUTF8(String s) {
		if (s == null) return false;
		if (s.length() < 1) return false;
	    Matcher mtch = stationUTFForbiddenPattern.matcher(s);		
	    return !mtch.matches();
	}	
	
	public static boolean isUTF8(String s) {
		if (s == null) return false;
		if (s.length() < 1) return false;
		return true;
	}
	
	
}
