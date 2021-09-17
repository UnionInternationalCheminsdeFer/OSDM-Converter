package Gtm.legacyExport.test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.LegacyRouteFare;
import Gtm.LegacySeries;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.legacyImportExport.LegacyExporter;
import Gtm.utils.GtmUtils;

                     
public class ExportTCVrouteFareTest {
	
	String line = "999911110999912345departure        154321arrival          0<8888>r"
			+ "oute                                                     0000123400012"
			+ "34500023456000345670201901010120990101";

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
	public void testExportTCVrouteFare() {
		
		LegacySeries s = GtmFactory.eINSTANCE.createLegacySeries();
		s.setNumber(9999);
		s.setFromStation(12345);
		s.setToStation(54321);
		s.setFromStationName("departure");
		s.setToStationName("arrival");
		s.setRouteDescription("route");
		s.setCarrierCode("8888");
		
		LegacyRouteFare fare = GtmFactory.eINSTANCE.createLegacyRouteFare();
		fare.setSeriesNumber(9999);
		fare.setSeries(s);
		fare.setFare1st(12345);
		fare.setFare2nd(1234);
		fare.setFareTableNumber(1111);
		fare.setReturnFare1st(34567);
		fare.setReturnFare2nd(23456);
		fare.setValidFrom(TestUtils.getFromDate());
		fare.setValidUntil(TestUtils.getUntilDate());
		

		
		exporter.init();
		String line2 = exporter.getFareLine(fare);

		
		assert(line.equals(line2));;
		

	}
}
