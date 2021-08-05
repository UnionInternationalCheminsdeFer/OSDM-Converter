package Gtm.converter.tests;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import Gtm.FareStationSetDefinition;
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

	@Mock
	GtmUtils gtmUtilsMock;

	@InjectMocks 
	ConverterFromLegacy converterFromLegacy;	

	@InjectMocks 
	ConverterToLegacy converterToLegacy;	

	@Before 
	public void initialize() {

		MockitoAnnotations.initMocks(this);

		tool = LegacyDataFactory.createBasicData();
		
		LegacyDataFactory.addLegacyStation(tool, 500, "SET1", "S1", "S1", 0, 500);
		Legacy108Station ls = TestUtils.findLegacyStation(tool, 3);
		ls.setFareReferenceStationCode(500);
		ls = TestUtils.findLegacyStation(tool, 4);
		ls.setFareReferenceStationCode(500);
		

		gtmUtilsMock = Mockito.mock(GtmUtils.class);				

		converterFromLegacy = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);

		//prepare codelists
		converterFromLegacy.initializeConverter();

		//convert
		converterFromLegacy.convertToGtmTest(new MockedProgressMonitor());

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


		converterToLegacy = new ConverterToLegacy(tool, null, new MockedEditingDomain());

		//convert
		converterToLegacy.convertTest(new MockedProgressMonitor());

		Legacy108Station s = TestUtils.findLegacyStation(tool,500);
		assert(s.getFareReferenceStationCode() == 500);
		assert(s.getShortName().equals("S1"));

		s = TestUtils.findLegacyStation(tool,3);
		assert(s.getFareReferenceStationCode() == 500);

		s = TestUtils.findLegacyStation(tool,4);
		assert(s.getFareReferenceStationCode() == 500);

	}




}