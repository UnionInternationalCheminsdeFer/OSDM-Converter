package export;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;

import gtmV20.FareDelivery;

public class ExportFareDeliveryV20 {
	
	public static void exportFareDelivery (FareDelivery fares, File file) throws IOException, Exception {
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(JsonInclude.Include.NON_DEFAULT);
		//mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		//mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);

		
		if (!file.exists()) {
				file.createNewFile();
		}
	
		BufferedWriter writer = new BufferedWriter (new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
		mapper.writeValue(writer, fares);
		writer.close();

		return;
	}

}
