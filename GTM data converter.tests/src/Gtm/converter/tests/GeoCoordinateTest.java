package Gtm.converter.tests;

import org.junit.Before;
import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;

import Gtm.Country;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.Legacy108Station;
import Gtm.LegacyBorderPoint;
import Gtm.LegacyBorderSide;
import Gtm.LegacyCalculationType;
import Gtm.LegacySeries;
import Gtm.LegacySeriesType;
import Gtm.Station;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.GtmUtils;

public class GeoCoordinateTest {
	
	GTMTool tool = null;
	
	int borderPointCode = 10;
	int legacyBorderStationCode = 1000;  //A-Town (GR)

	//@Mock
	GtmUtils gtmUtilsMock;
	
	//@InjectMocks 
	ConverterFromLegacy converter2osdm;	
	
	//@InjectMocks 
	ConverterToLegacy converter2legacy;	

	@Before
	public void setUp() throws Exception {
		
		//MockitoAnnotations.initMocks(this);
		
		tool = LegacyDataFactory.createBasicData();
			
		//set legacy stations
		tool.getConversionFromLegacy().getLegacy108().setLegacyStations(GtmFactory.eINSTANCE.createLegacy108Stations());	
		tool.getCodeLists().setStations(GtmFactory.eINSTANCE.createStations());	
		
		//border station without corresponding MERITS station
		LegacyDataFactory.addLegacyStation(tool,"A-Town (GR)","A-Town (GR)","A (GR)",legacyBorderStationCode,borderPointCode,0);
		
		//legacy stations
		LegacyDataFactory.addLegacyStation(tool,"A-Town","A-Town","A",1,0,0);
		LegacyDataFactory.addLegacyStation(tool,"B-Town","B-Town","B",2,0,0);
		LegacyDataFactory.addLegacyStation(tool,"C-Town","C-Town","C",3,0,0);
		LegacyDataFactory.addLegacyStation(tool,"D-Town","D-Town","D",4,0,0);
		LegacyDataFactory.addLegacyStation(tool,"E-Town","E-Town","E",5,0,0);
		LegacyDataFactory.addLegacyStation(tool,"F-Town","F-Town","F",6,0,0);
		LegacyDataFactory.addLegacyStation(tool,"G-Town","G-Town","G",7,0,0);
		
		//MERITS stations 
		Country c = TestUtils.findCountry(tool,99);
		LegacyDataFactory.addStation(tool,"A","00001",c);
		LegacyDataFactory.addStation(tool,"B","00002",c);
		LegacyDataFactory.addStation(tool,"C","00003",c);
		LegacyDataFactory.addStation(tool,"D","00004",c);
		LegacyDataFactory.addStation(tool,"E","00005",c);
		LegacyDataFactory.addStation(tool,"F","00006",c);
		LegacyDataFactory.addStation(tool,"G","00007",c);
		LegacyDataFactory.addStation(tool,"Z","10000",TestUtils.findCountry(tool,98));
		

		Station station = TestUtils.findStation(tool, 99, "00003");
		station.setLatitude(10.123456F);
		station.setLongitude(12.34567F);
		
		
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
		
		
		//series A-Town to A-Town (GR)
		tool.getConversionFromLegacy().getLegacy108().setLegacySeriesList(GtmFactory.eINSTANCE.createLegacySeriesList());
		LegacySeries s = GtmFactory.eINSTANCE.createLegacySeries();
		s.setCarrierCode("9999");
		s.setDistance1(10);
		s.setDistance2(10);
		s.setFareTableNumber(1);
		s.setFromStation(legacyBorderStationCode);
		s.setToStation(7);
		s.setNumber(1);
		s.setPricetype(LegacyCalculationType.ROUTE_BASED);
		s.getViastations().add(LegacyDataFactory.createViaStation(2,1,false));
		s.getViastations().add(LegacyDataFactory.createViaStation(3,1,false));
		s.getViastations().add(LegacyDataFactory.createViaStation(4,1,false));
		s.getViastations().add(LegacyDataFactory.createViaStation(5,1,false));
		s.getViastations().add(LegacyDataFactory.createViaStation(6,1,false));
		s.setSupplyingCarrierCode("9999");
		s.setType(LegacySeriesType.STATION_STATION);
		
		
		s.setValidFrom(TestUtils.getFromDate());
		s.setValidUntil(TestUtils.getUntilDate());	
		tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries().add(s);
		
		//gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converter2osdm = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converter2osdm.initializeConverter();
		
		//convert
		converter2osdm.convertToGtmTest(new MockedProgressMonitor());
		
	}

	@Test 
	public void testGeoCoordinatesConversion() {
		
		//prepare for return conversion		
		TestUtils.resetLegacy(tool);
		
		
		tool.getGeneralTariffModel().setDelivery(GtmFactory.eINSTANCE.createDelivery());
		tool.getGeneralTariffModel().getDelivery().setProvider(TestUtils.findCarrier(tool, "9999"));
	
		converter2legacy = new ConverterToLegacy(tool, null, new MockedEditingDomain());
			
		//convert
		converter2legacy.convertTest(new MockedProgressMonitor());
		
		
		Legacy108Station s = TestUtils.findLegacyStation(tool, 3);
		assert( s.getLatitude() == 10123456);
		assert(s.getLongitude() == 12345670);
									
	}
		

}
