package export;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import gtm.FareDelivery;

public class ImportFareDelivery {
	
	
	public static FareDelivery importFareDelivery(File file) throws JsonParseException, JsonMappingException, IOException {
	
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
		
		FareDelivery fareDelivery = null;

		//JSON file to Java object
		fareDelivery  = mapper.readValue(file, FareDelivery.class);
		
		return fareDelivery;
		
	}

}
