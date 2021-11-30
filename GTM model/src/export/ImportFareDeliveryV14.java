package export;

import java.io.File;
import java.io.IOException;
import java.util.TimeZone;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import gtmV14.FareDelivery;

public class ImportFareDeliveryV14 {
	
	
	public static FareDelivery importFareDelivery(File file) throws Exception, IOException {
	
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, false);

		StdDateFormat df = new StdDateFormat();
		df.setTimeZone(TimeZone.getTimeZone("UTC"));
		mapper.setDateFormat(df);
		
		FareDelivery fareDelivery = null;

		//JSON file to Java object
		fareDelivery  = mapper.readValue(file, FareDelivery.class);
		
		return fareDelivery;
		
	}

}
