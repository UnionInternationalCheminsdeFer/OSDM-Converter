package Gtm.legacyExport.test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.LegacyCalculationType;
import Gtm.LegacySeries;
import Gtm.LegacySeriesType;
import Gtm.LegacyViastation;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.legacyImportExport.LegacyExporter;
import Gtm.utils.GtmUtils;

                     
public class ExportTCVStest {
	
	String line = "9999123451201234500Munchen          05432100Destin"
			+ "ation      010000 0B0S0<1234>route description        "
			+ "                                 000012000011020111100"
			+ "000011000000000001234410123431012342201234130123401002"
			+ "01901010120990101";
	
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
	public void testExportTCVS() {
		
		LegacySeries sc = GtmFactory.eINSTANCE.createLegacySeries();
		sc.setBusCode("B");
		sc.setCarrierCode("1234");
		sc.setDistance1(11);
		sc.setDistance2(12);
		sc.setFareTableNumber(1111);
		sc.setFerryCode("S");
		sc.setFromStation(12345);
		sc.setFromStationName("Munchen");
		sc.setMemoNumber(11);
		sc.setNumber(12345);
		sc.setPricetype(LegacyCalculationType.ROUTE_BASED);
		sc.setRouteDescription("route description");
		sc.setRouteNumber(1);
		sc.setSupplyingCarrierCode("2345");
		sc.setToStation(54321);
		sc.setToStationName("Destination");
		sc.setType(LegacySeriesType.BORDER_DESTINATION);
		sc.setValidFrom(TestUtils.getFromDate());
		sc.setValidUntil(TestUtils.getUntilDate());
		LegacyViastation v1 = GtmFactory.eINSTANCE.createLegacyViastation();
		v1.setCode(12344);
		v1.setPosition(1);
		v1.setOptional(false);
		sc.getViastations().add(v1);
		LegacyViastation v2 = GtmFactory.eINSTANCE.createLegacyViastation();
		v2.setCode(12343);
		v2.setPosition(1);
		v2.setOptional(false);
		sc.getViastations().add(v2);
		LegacyViastation v3 = GtmFactory.eINSTANCE.createLegacyViastation();
		v3.setCode(12342);
		v3.setPosition(2);
		v3.setOptional(false);
		sc.getViastations().add(v3);
		LegacyViastation v4 = GtmFactory.eINSTANCE.createLegacyViastation();
		v4.setCode(12341);
		v4.setPosition(3);
		v4.setOptional(false);
		sc.getViastations().add(v4);
		LegacyViastation v5 = GtmFactory.eINSTANCE.createLegacyViastation();
		v5.setCode(12340);
		v5.setPosition(1);
		v5.setOptional(false);
		sc.getViastations().add(v5);

		exporter.init();
		String line2 = exporter.getSeriesLine(sc);
		
		assert(line.equals(line2));
		

	}
}
