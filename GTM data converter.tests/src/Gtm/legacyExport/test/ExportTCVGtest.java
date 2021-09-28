package Gtm.legacyExport.test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.Legacy108Station;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.legacyImportExport.LegacyExporter;
import Gtm.utils.GtmUtils;

                     
public class ExportTCVGtest {
	
	String line = 
			"999989765100000München                            0Munchen          0M"
			+ "u               00000001230   000000000000000010          0034560000"
			+ "000001234567800004567890201901010120990101";
		
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
	public void testExportTCVG() {
		
		
		Legacy108Station sc = GtmFactory.eINSTANCE.createLegacy108Station();
		sc.setBorderPointCode(123);
		sc.setFareReferenceStationCode(3456);
		sc.setLatitude(12345678);
		sc.setLongitude(456789);
		sc.setName("Munchen");
		sc.setNameUTF8("München");
		sc.setShortName("Mu");
		sc.setShortNameUtf8("Mü");
		sc.setStationCode(89765);

		
		exporter.init();
		String line2 = exporter.getStationLine(sc);
		
		assert(line.equals(line2));;
		

	}
}
