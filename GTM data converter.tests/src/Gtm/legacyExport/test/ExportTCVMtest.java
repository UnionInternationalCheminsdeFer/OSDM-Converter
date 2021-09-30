package Gtm.legacyExport.test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.Legacy108Memo;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.legacyImportExport.LegacyExporter;
import Gtm.utils.GtmUtils;

                     
public class ExportTCVMtest {
	
	String line = "999901001                                                  Loc"
			+ "al text                                                           "
			+ "                                                                  "
			+ "                                                                  "
			+ "                                      French text                 "
			+ "                                                                  "
			+ "                                                                  "
			+ "                                                                  "
			+ "              German text                                         "
			+ "                                                                  "
			+ "                                                                  "
			+ "        EnglishText EnglishText EnglishText EnglishText EnglishTex"
			+ "t                                                                 "
			+ "                                                                  "
			+ "                                                                  "
			+ "                                                                  "
			+ "                                                                  "
			+ "                                                                  "
			+ "                         1201901010120990101"; 
	
	@Mock
	GtmUtils gtmUtilsMock;
	
	GTMTool tool = null;
	
	//@InjectMocks 
	LegacyExporter exporter;
	
	@Before 
	public void initialize() {
		
		MockitoAnnotations.initMocks(this);
				
		tool = LegacyDataFactory.createBasicData();
	
		tool.getConversionFromLegacy().getLegacy108().setStartDate(TestUtils.getFromDate());
		tool.getConversionFromLegacy().getLegacy108().setEndDate(TestUtils.getUntilDate());
	
		exporter = new LegacyExporter(tool, null, null);
					
	}
	
	@Test 
	public void testExportTCVMlong() {
		
		
		Legacy108Memo sc = GtmFactory.eINSTANCE.createLegacy108Memo();
		sc.setEnglish("EnglishText EnglishText EnglishText EnglishText EnglishText English second line");
		sc.setFrench("French text");
		sc.setLocal("Local text");
		sc.setGerman("German text");
		sc.setNumber(100);

		
		exporter.init();
		String line2 = exporter.getMemoLine(sc);
		
		assert(line.equals(line2));
		

	}
}
