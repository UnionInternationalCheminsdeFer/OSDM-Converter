package Gtm.legacyExport.test;

import org.junit.Before;
import org.junit.Test;


import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.LegacySeparateContractSeries;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.legacyImportExport.LegacyExporter;
import Gtm.utils.GtmUtils;

                     
public class ExportTCVLtest {
	
	String line = "9999010010201901010120990101"; 
	
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
		
		
		LegacySeparateContractSeries sc = GtmFactory.eINSTANCE.createLegacySeparateContractSeries();
		sc.setSeriesNumber(1001);

		
		exporter.init();
		String line2 = exporter.getSeparateTicketLine(sc);
		
		assert(line.equals(line2));
		

	}
}
