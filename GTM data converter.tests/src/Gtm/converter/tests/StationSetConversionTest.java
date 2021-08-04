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


public class StationSetConversionTest {


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

		assert(tool.getGeneralTariffModel().getFareStructure().getFareStationSetDefinitions().getFareStationSetDefinitions().size() == 2);

		int i = 0;
		for (FareStationSetDefinition fs : tool.getGeneralTariffModel().getFareStructure().getFareStationSetDefinitions().getFareStationSetDefinitions()) {

			if (fs.getLegacyCode() == 100) {
				i++;
				assert(fs.getName().equals("A-ar"));
				assert(fs.getStations().size() == 2);				
			} else if  (fs.getLegacyCode() == 900) {
				i++;
				assert(fs.getName().equals("H-ar"));
				assert(fs.getStations().size() == 3);
			}
		}
		assert(i == 2);


		//prepare for return conversion		
		TestUtils.resetLegacy(tool);


		tool.getGeneralTariffModel().setDelivery(GtmFactory.eINSTANCE.createDelivery());
		tool.getGeneralTariffModel().getDelivery().setProvider(TestUtils.findCarrier(tool, "9999"));


		converterToLegacy = new ConverterToLegacy(tool, null, new MockedEditingDomain());

		//convert
		converterToLegacy.convertTest(new MockedProgressMonitor());

		Legacy108Station s = TestUtils.findLegacyStation(tool,100);
		assert(s.getFareReferenceStationCode() == 100);

		s = TestUtils.findLegacyStation(tool,900);
		assert(s.getFareReferenceStationCode() == 900);
		assert(s.getShortName().equals("H-ar"));

		s = TestUtils.findLegacyStation(tool,1);
		assert(s.getFareReferenceStationCode() == 100);

		s = TestUtils.findLegacyStation(tool,1);
		assert(s.getFareReferenceStationCode() == 100);

		s = TestUtils.findLegacyStation(tool,2);
		assert(s.getFareReferenceStationCode() == 100);

		s = TestUtils.findLegacyStation(tool,7);
		assert(s.getFareReferenceStationCode() == 900);

		s = TestUtils.findLegacyStation(tool,8);
		assert(s.getFareReferenceStationCode() == 900);

		s = TestUtils.findLegacyStation(tool,3);
		assert(s.getFareReferenceStationCode() == 0);

		s = TestUtils.findLegacyStation(tool,4);
		assert(s.getFareReferenceStationCode() == 0);
	}




}