package Gtm.legacyImport.test;

import org.junit.Before;
import org.junit.Test;

import Gtm.GTMTool;
import Gtm.LegacyRouteFare;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.legacyImportExport.LegacyImporter;
import Gtm.utils.GtmUtils;

                     
public class ImportTCVroutePricetest {
	
	String line = "108020005542315345Aachen           002140Augsburg         0<1080>Limburg*(Fra"
			+ "nkfurt(M)*Nuernberg/Karlsruhe*Stuttgart)      00016600300280003003320030056000320"
			+ "1912150120991231" 
			+ '\r' 
			+ '\n'; 
	
	//@Mock
	GtmUtils gtmUtilsMock;
	
	GTMTool tool = null;
	
	//@InjectMocks 
	LegacyImporter importer;
	
	@Before 
	public void initialize() {
		
		//MockitoAnnotations.initMocks(this);
				
		tool = LegacyDataFactory.createBasicData();
		
		importer = new LegacyImporter(tool, null, null, null);
					
	}
	
	@Test 
	public void testImportTCVroutePrice() {
		
		LegacyRouteFare fare = importer.decodeLineRouteFare(line, "UTC");
		
		assert(fare != null);
		
		assert(fare.getFareTableNumber() == 2000);
		
		assert(fare.getFare1st() == 28000);
	
		assert(fare.getFare2nd() == 16600);
		
		assert(fare.getReturnFare1st() == 56000);
		
		assert(fare.getReturnFare2nd() == 33200);
		
		assert(fare.getSeriesNumber() == 55423);
		
		assert(TestUtils.getDateString(fare.getValidFrom()).equals("20191215"));
		
		assert(TestUtils.getDateString(fare.getValidUntil()).equals("20991231"));
		
		

	}
}
