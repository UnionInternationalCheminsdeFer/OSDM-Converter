package Gtm.converter.tests;

import org.junit.Before;
import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.LegacyBorderPoint;
import Gtm.LegacyBorderSide;
import Gtm.LegacySeries;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.GtmUtils;


public class StationSetStartBorderEndConversionTest {


	GTMTool tool = null;

//	@Mock
	GtmUtils gtmUtilsMock;

//	@InjectMocks 
	ConverterFromLegacy converterFromLegacy;	

//	@InjectMocks 
	ConverterToLegacy converterToLegacy;	
	
	int borderPointCode;
	int legacyBorderStationCode;

	@Before 
	public void initialize() {

//		MockitoAnnotations.initMocks(this);

		tool = LegacyDataFactory.createBasicData();
		
		borderPointCode = 123;
		legacyBorderStationCode = 900;
		
		tool.getConversionFromLegacy().getLegacy108().setLegacyStations(GtmFactory.eINSTANCE.createLegacy108Stations());;
		LegacyDataFactory.addLegacyStation(tool,1,"A-Stadt","A-Stadt","A", 0,100);
		LegacyDataFactory.addLegacyStation(tool,100,"A-Area","A-area","A-ar", 0,100);
		LegacyDataFactory.addLegacyStation(tool,2,"B-Stadt","B-Stadt","B", 0,0);
		LegacyDataFactory.addLegacyStation(tool,7,"G-Stadt","G-Stadt","G", 0,legacyBorderStationCode);
		LegacyDataFactory.addLegacyStation(tool,8,"H-Main","H-Main","H", 0,legacyBorderStationCode);
		LegacyDataFactory.addLegacyStation(tool,legacyBorderStationCode,"H-Stadt","H-area","H-ar", borderPointCode,legacyBorderStationCode);
		
		//set border point
		tool.getConversionFromLegacy().getLegacy108().setLegacyBorderPoints(GtmFactory.eINSTANCE.createLegacyBorderPoints());
		LegacyBorderPoint border = GtmFactory.eINSTANCE.createLegacyBorderPoint();
		
		tool.getConversionFromLegacy().getLegacy108().getLegacyBorderPoints().getLegacyBorderPoints().add(border);
		border.setBorderPointCode(borderPointCode);
		//our side
		LegacyBorderSide side1 = GtmFactory.eINSTANCE.createLegacyBorderSide();
		side1.setStations(GtmFactory.eINSTANCE.createStationSet());
		side1.getStations().getStations().add(TestUtils.findStation(tool, 99,"00001")); //A-Town
		side1.setCarrier(TestUtils.findCarrier(tool, "9999")); //Wonderland rail
		side1.setLegacyStationCode(legacyBorderStationCode);
		border.getBorderSides().add(side1);
		//the other side
		LegacyBorderSide side2 = GtmFactory.eINSTANCE.createLegacyBorderSide();
		side2.setStations(GtmFactory.eINSTANCE.createStationSet());
		side2.getStations().getStations().add(TestUtils.findStation(tool, 98,"10000"));
		side2.setCarrier(TestUtils.findCarrier(tool, "9995"));
		side2.setLegacyStationCode(2);
		border.getBorderSides().add(side2);
		

		
		tool.getConversionFromLegacy().getLegacy108().setLegacySeriesList(GtmFactory.eINSTANCE.createLegacySeriesList());
		LegacyDataFactory.addRouteBasedSeries(tool,1,1,100,900);	
			

//		gtmUtilsMock = Mockito.mock(GtmUtils.class);				

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
		
		assert (ls.getFromStation() == legacyBorderStationCode);
		assert (ls.getToStation() == 100);
		
		assert (ls.getFromStationName().equals("H-ar"));
		assert (ls.getToStationName().equals("A-ar"));
	}

}