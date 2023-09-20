package Gtm.legacyExport.test;

import org.junit.Before;
import org.junit.Test;


import Gtm.GTMTool;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.legacyImportExport.LegacyExporter;
import Gtm.utils.GtmUtils;

                     
public class ExportTCVtest {
	
	String line = "1234Test                          fileName.txt0000120000120000000000"
			+ "000000000000000000000000000000000000000000000000000000000000000000000000"
			+ "00000000201901010120990101"; 
	
	//@Mock
	GtmUtils gtmUtilsMock;
	
	GTMTool tool = null;
	
	//@InjectMocks 
	LegacyExporter exporter;
	
	@Before 
	public void initialize() {
		
		//MockitoAnnotations.initMocks(this);
				
		tool = LegacyDataFactory.createBasicData();
	
		tool.getConversionFromLegacy().getLegacy108().setStartDate(TestUtils.getFromDate());
		tool.getConversionFromLegacy().getLegacy108().setEndDate(TestUtils.getUntilDate());
	
		exporter = new LegacyExporter(tool, null, null);
					
	}
	
	@Test 
	public void testExportTCVL() {
		
		
		
		exporter.init();
		String line2 = exporter.getHeaderLine("fileName.txt", "1234", "Test", 12, TestUtils.getFromDate(), TestUtils.getUntilDate());
		
		assert(line.equals(line2));
		

	}
}
