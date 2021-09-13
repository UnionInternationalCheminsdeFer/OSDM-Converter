package Gtm.legacyImport.test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import Gtm.GTMTool;
import Gtm.LegacyDistanceFare;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.legacyImportExport.LegacyImporter;
import Gtm.utils.GtmUtils;

                     
public class ImportTCVdistancePricetest {
	
	String line = "1153100100030000005600000088000001120000017600202012130120251213"; 
	
	@Mock
	GtmUtils gtmUtilsMock;
	
	GTMTool tool = null;
	
	//@InjectMocks 
	LegacyImporter importer;
	
	@Before 
	public void initialize() {
		
		MockitoAnnotations.initMocks(this);
				
		tool = LegacyDataFactory.createBasicData();
		
		importer = new LegacyImporter(tool, null, null, null);
					
	}
	
	@Test 
	public void testImportTCVM() {
		
		LegacyDistanceFare fare = importer.decodeLineDistanceFare(line, "UTC");
		
		assert(fare != null);
		
		assert(fare.getFareTableNumber() == 1001);
		
		assert(fare.getDistance() == 30);
	
		assert(fare.getFare1st() == 880);
		
		assert(fare.getFare2nd() == 560);
		
		assert(fare.getReturnFare1st() == 1760);
		
		assert(fare.getReturnFare2nd() == 1120);
		
		assert(TestUtils.getDateString(fare.getValidFrom()).equals("20201213"));
		
		assert(TestUtils.getDateString(fare.getValidUntil()).equals("20251213"));
		

	}
}
