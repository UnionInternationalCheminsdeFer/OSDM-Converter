package Gtm.legacyImport.test;

import org.junit.Before;
import org.junit.Test;


import Gtm.GTMTool;
import Gtm.LegacySeparateContractSeries;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.legacyImportExport.LegacyImporter;
import Gtm.utils.GtmUtils;

                     
public class ImportTCVLtest {
	
	String line = "1153010010202012130120251213"
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
	public void testImportTCVL() {
		
		LegacySeparateContractSeries separateSeries = importer.decodeTCVLLine(line, null);
		
		assert(separateSeries != null);
		
		assert(separateSeries.getSeriesNumber() == 1001);
		
		assert(TestUtils.getDateString(separateSeries.getValidFrom()).equals("20201213"));
		
		assert(TestUtils.getDateString(separateSeries.getValidUntil()).equals("20251213"));
		

	}
}
