package Gtm.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import Gtm.Calendar;

public class CalendarUtils {
	
	private static DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd"); //$NON-NLS-1$
	
	public static boolean overlap(Calendar c1, Calendar c2) {
		
		if (c1 == null || c2 == null) return true;
		
		if (c1.getDates() != null && !c1.getDates().isEmpty()) {
			if (c2.getDates() != null && !c2.getDates().isEmpty()) {
				for (Date d1 : c1.getDates()) {
					for (Date d2: c2.getDates()) {
						if (checkDateOnlyEqual(d1,d2)) {
							return true;
						}
					}
				}
			}
		}
		
		if (c1.getFromDateTime() != null 
				&& c1.getUntilDateTime() != null 
				&& c2.getDates() != null 
				&& !c2.getDates().isEmpty() ) {
			for (Date d : c2.getDates()) {
				if (d.after(c1.getFromDateTime()) &&  (d.before(c1.getUntilDateTime())) ) {
					return true;
				}
			}
		}
				
		if (c2.getFromDateTime() != null 
			&& c2.getUntilDateTime() != null 
			&& c1.getDates() != null 
			&& !c1.getDates().isEmpty() ) {
			for (Date d : c1.getDates()) {
				if (d.after(c2.getFromDateTime()) &&  (d.before(c2.getUntilDateTime())) ) {
					return true;
				}
			}
		}
			
		if (c2.getFromDateTime() != null 
			&& c2.getUntilDateTime() != null 
			&& c1.getFromDateTime() != null
			&& c1.getUntilDateTime() != null ) {
			if (c1.getFromDateTime().after(c2.getFromDateTime()) 
				&&  (c1.getFromDateTime().before(c2.getUntilDateTime())) ) {
				return true;
			}
			if (c1.getUntilDateTime().after(c2.getFromDateTime()) 
				&&  (c1.getUntilDateTime().before(c2.getUntilDateTime())) ) {
				return true;
			}
			if (c2.getFromDateTime().after(c1.getFromDateTime()) 
					&&  (c2.getFromDateTime().before(c1.getUntilDateTime())) ) {
					return true;
			}
			if (c2.getUntilDateTime().after(c1.getFromDateTime()) 
				&&  (c2.getUntilDateTime().before(c1.getUntilDateTime())) ) {
				return true;
			}			
		}	
		
		return false;
	}

	
	public static boolean checkDateOnlyEqual(Date date1, Date date2) {
		
		String d1 = dateFormat.format(date1);
		String d2 = dateFormat.format(date2);
		
		return d1.equals(d2);

	}


	
}
