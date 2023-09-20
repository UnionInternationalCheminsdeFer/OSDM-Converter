package Gtm.converter.tests;

import org.junit.Before;
import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;

import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.Legacy108Station;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.GtmUtils;


public class StationSetVirtualConversionTest {


	GTMTool tool = null;

//	@Mock
	GtmUtils gtmUtilsMock;
	
//	@InjectMocks 
	ConverterFromLegacy converter2osdm;	
	
//	@InjectMocks 
	ConverterToLegacy converter2legacy;	

	@Before
	public void setUp() throws Exception {
//		MockitoAnnotations.initMocks(this);

		tool = LegacyDataFactory.createBasicData();
		
		LegacyDataFactory.addLegacyStation(tool, 500, "SET1", "S1", "S1", 0, 500);
		Legacy108Station ls = TestUtils.findLegacyStation(tool, 3);
		ls.setFareReferenceStationCode(500);
		ls = TestUtils.findLegacyStation(tool, 4);
		ls.setFareReferenceStationCode(500);
		

//		gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converter2osdm = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converter2osdm.initializeConverter();
		
		//convert
		converter2osdm.convertToGtmTest(new MockedProgressMonitor());

	}

	@Test 
	public void testBasicConversion() {


		//validate fare station sets
		assert(tool.getGeneralTariffModel().getFareStructure().getFareStationSetDefinitions() != null);

		assert(tool.getGeneralTariffModel().getFareStructure().getFareStationSetDefinitions().getFareStationSetDefinitions().size() == 3);


		//prepare for return conversion		
		TestUtils.resetLegacy(tool);


		tool.getGeneralTariffModel().setDelivery(GtmFactory.eINSTANCE.createDelivery());
		tool.getGeneralTariffModel().getDelivery().setProvider(TestUtils.findCarrier(tool, "9999"));


		converter2legacy = new ConverterToLegacy(tool, null, new MockedEditingDomain());

		//convert
		converter2legacy.convertTest(new MockedProgressMonitor());

		Legacy108Station s = TestUtils.findLegacyStation(tool,500);
		assert(s.getFareReferenceStationCode() == 500);
		assert(s.getShortName().equals("S1"));

		s = TestUtils.findLegacyStation(tool,3);
		assert(s.getFareReferenceStationCode() == 500);

		s = TestUtils.findLegacyStation(tool,4);
		assert(s.getFareReferenceStationCode() == 500);

	}




}