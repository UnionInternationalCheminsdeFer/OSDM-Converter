package Gtm.converter.tests;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.LegacySeries;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.GtmUtils;


public class StationSetStartEndConversionTest {


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
		
		tool.getConversionFromLegacy().getLegacy108().setLegacyStations(GtmFactory.eINSTANCE.createLegacy108Stations());;
		LegacyDataFactory.addLegacyStation(tool,1,"A-Stadt","A-Stadt","A", 0,100);
		LegacyDataFactory.addLegacyStation(tool,100,"A-Area","A-area","A-ar", 0,100);
		LegacyDataFactory.addLegacyStation(tool,2,"B-Stadt","B-Stadt","B", 0,100);
		LegacyDataFactory.addLegacyStation(tool,7,"G-Stadt","G-Stadt","G", 0,900);
		LegacyDataFactory.addLegacyStation(tool,8,"H-Main","H-Main","H", 0,900);
		LegacyDataFactory.addLegacyStation(tool,900,"H-Stadt","H-area","H-ar", 0,900);

		
		tool.getConversionFromLegacy().getLegacy108().setLegacySeriesList(GtmFactory.eINSTANCE.createLegacySeriesList());
		LegacyDataFactory.addRouteBasedSeries(tool,1,1,100,900);	
			

		gtmUtilsMock = Mockito.mock(GtmUtils.class);				

		converterFromLegacy = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);

		//prepare codelists
		converterFromLegacy.initializeConverter();

		//convert
		converterFromLegacy.convertToGtmTest(new MockedProgressMonitor());

	}

	@Test 
	public void testStationSetStartEndConversion() {


		//validate fare station sets
		assert(tool.getGeneralTariffModel().getFareStructure().getFareStationSetDefinitions() != null);

		assert(tool.getGeneralTariffModel().getFareStructure().getFareStationSetDefinitions().getFareStationSetDefinitions().size() == 2);

		
		//prepare for return conversion		
		TestUtils.resetLegacy(tool);


		tool.getGeneralTariffModel().setDelivery(GtmFactory.eINSTANCE.createDelivery());
		tool.getGeneralTariffModel().getDelivery().setProvider(TestUtils.findCarrier(tool, "9999"));


		converterToLegacy = new ConverterToLegacy(tool, null, new MockedEditingDomain());

		//convert
		converterToLegacy.convertTest(new MockedProgressMonitor());

		LegacySeries ls = TestUtils.getLegacySeries(tool,1);
		
		assert (ls != null);
		
		assert (ls.getFromStation() == 100);
		assert (ls.getToStation() == 900);
		
		assert (ls.getFromStationName().equals("A-ar"));
		assert (ls.getToStationName().equals("H-ar"));
	}

}