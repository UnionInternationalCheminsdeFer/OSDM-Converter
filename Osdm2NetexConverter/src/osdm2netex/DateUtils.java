package osdm2netex;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateUtils {

    public static XMLGregorianCalendar toXMLGregorianCalendar(Date date) {
        if (date == null) {
            return null; // Handle null safely
        }
        try {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(date);
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
        } catch (DatatypeConfigurationException e) {
            // Log or rethrow as needed
            e.printStackTrace();
            return null;
        }
    }
	
    

	public static Duration toDayPeriod(int days) {
	
		try {
			return DatatypeFactory.newInstance().newDuration(days*24*60*60*1000);
		} catch (DatatypeConfigurationException e) {
			return null;
		}
	
 	}
	

	public static Duration toDuration(boolean isPositive, int days, int hours, int minutes, int seconds) {
	
		try {
			return DatatypeFactory.newInstance().newDurationDayTime(isPositive, days, hours, minutes, seconds);
		} catch (DatatypeConfigurationException e) {
			return null;
		}
	
 	}
}
