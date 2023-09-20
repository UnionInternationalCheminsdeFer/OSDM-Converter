package Gtm.legacyExport.test;

import org.junit.Before;
import org.junit.Test;


import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.LegacyCarrier;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.legacyImportExport.LegacyExporter;
import Gtm.utils.GtmUtils;

                     
public class ExportTCVCtest {
	
	String line = "9999<9990>1ABC              0ABC Rail                                          "
			+ "          0                                                                        "
			+ "                                                                                   "
			+ "                                   0<0000>0201901010120990101"; 
	
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
		
		
		LegacyCarrier sc = GtmFactory.eINSTANCE.createLegacyCarrier();
		sc.setCarrierCode("9990");
		sc.setCarrierShortName("ABC");
		sc.setCarrierName("ABC Rail");

		
		exporter.init();
		String line2 = exporter.getCarrierLine(sc);
		
		assert(line.equals(line2));
		

	}
}
