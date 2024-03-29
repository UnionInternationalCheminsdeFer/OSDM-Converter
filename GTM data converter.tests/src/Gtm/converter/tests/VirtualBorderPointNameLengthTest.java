package Gtm.converter.tests;

import org.junit.Before;
import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;

import Gtm.ConnectionPoint;
import Gtm.Country;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.Legacy108Station;
import Gtm.LegacyBorderPoint;
import Gtm.LegacyBorderSide;
import Gtm.LegacyCalculationType;
import Gtm.LegacySeries;
import Gtm.LegacySeriesType;
import Gtm.RegionalConstraint;
import Gtm.RouteDescriptionBuilder;
import Gtm.ViaStation;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.GtmUtils;

public class VirtualBorderPointNameLengthTest {
	
	GTMTool tool = null;
	
	int borderPointCode = 10;
	int legacyBorderStationCode = 1000;  //A-Town (GR)

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
			
		//set legacy stations
		tool.getConversionFromLegacy().getLegacy108().setLegacyStations(GtmFactory.eINSTANCE.createLegacy108Stations());	
		tool.getCodeLists().setStations(GtmFactory.eINSTANCE.createStations());	
		
		//border station without corresponding MERITS station
		LegacyDataFactory.addLegacyStation(tool,"A-Town (GR)","A-Town (GR)","A (GR)",legacyBorderStationCode,borderPointCode,0);
		
		//legacy stations
		LegacyDataFactory.addLegacyStation(tool,"A-Town-long--","A-tool-long--","A-tool-long--",1,0,0);
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
		
//		gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converter2osdm = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converter2osdm.initializeConverter();
		
		//convert
		converter2osdm.convertToGtmTest(new MockedProgressMonitor());
		
	}

	@Test 
	public void testVirtualNonMeritsBorderStationLongNameConversion() {
		
		
		//one calendar
		assert(tool.getGeneralTariffModel().getFareStructure().getCalendars().getCalendars().size() == 1);
		
		//one regional constraint per series * 2
		assert(tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints().size()
				== tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries().size()
				* 2 //route and return route
		);

		// number of fares = number of series * 2 * number of templates
		assert(tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements().size() 
				==
			   tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries().size()
			   * 2 // route and return route
			   * tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates().size()
		);
		
		// number of prices
		assert(tool.getGeneralTariffModel().getFareStructure().getPrices().getPrices().size() == 2);
		
		
		assert(tool.getGeneralTariffModel().getFareStructure().getConnectionPoints() != null);
		assert(tool.getGeneralTariffModel().getFareStructure().getConnectionPoints().getConnectionPoints().size() == 2);
		
		for (ConnectionPoint p : tool.getGeneralTariffModel().getFareStructure().getConnectionPoints().getConnectionPoints()) {
			
			if (p.getConnectedStationSets().size() == 2) {
				assert(p.getLegacyBorderPointCode() == borderPointCode);
			} else {
				assert(p.getLegacyBorderPointCode() == 0);
			}
		}

		
		
		for (RegionalConstraint r : tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints()) {

			if (!TestUtils.isReturnRoute(r)) {
				
				assert(r.getExitConnectionPoint().getLegacyBorderPointCode() == 0);

				assert(r.getEntryConnectionPoint().getLegacyBorderPointCode() == borderPointCode);

				ViaStation route = r.getRegionalValidity().get(0).getViaStation();
				
				assert (route.getRoute().getStations().size() == 7);
				
			} else {
				
				assert(r.getExitConnectionPoint().getLegacyBorderPointCode() == borderPointCode);

				assert(r.getEntryConnectionPoint().getLegacyBorderPointCode() == 0);

				ViaStation route = r.getRegionalValidity().get(0).getViaStation();
				
				assert (route.getRoute().getStations().size() == 7);
				
			}
		}
		
		//validate Routes
		for (RegionalConstraint r : tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints()) {
			// one regional validity
			assert(r.getRegionalValidity().size() == 1);
			
			//route description contained
			assert(r.getRegionalValidity().get(0).getViaStation() != null);
			
			assert(r.getRegionalValidity().get(0).getViaStation().getRoute() != null);
			
			String description = RouteDescriptionBuilder.getRouteDescription( r.getRegionalValidity().get(0).getViaStation());
			boolean isReturnRoute = TestUtils.isReturnRoute(r);		
							
			if (isReturnRoute) {
				assert(description.equals("G*F*E*D*C*B*A-tool-long--"));
			} else {
				assert(description.equals("A-tool-long--*B*C*D*E*F*G"));
			}
		}
		
		
		//prepare for return conversion		
		TestUtils.resetLegacy(tool);
		
		
		tool.getGeneralTariffModel().setDelivery(GtmFactory.eINSTANCE.createDelivery());
		tool.getGeneralTariffModel().getDelivery().setProvider(TestUtils.findCarrier(tool, "9999"));
		
		
		converter2legacy = new ConverterToLegacy(tool, null, new MockedEditingDomain());
			
		//convert
		converter2legacy.convertTest(new MockedProgressMonitor());
		
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList() != null);
		
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries() != null);
		
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries().size() == 1);
		
		LegacySeries s = tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries().get(0);
		
		assert(s.getFromStation() == legacyBorderStationCode);
		assert(s.getToStation() == 7);
		assert(s.getType().equals(LegacySeriesType.BORDER_DESTINATION));
		
		Legacy108Station borderStation = TestUtils.findLegacyStation(tool,legacyBorderStationCode);
		Legacy108Station nonBorderStation = TestUtils.findLegacyStation(tool,7);
		
		assert(borderStation != null);	
		assert(nonBorderStation.getStationCode() == 7);
		assert(nonBorderStation.getBorderPointCode() == 0);
		assert(nonBorderStation.getName().equals("G-Town"));
		
		assert(nonBorderStation != null);
		assert(borderStation.getStationCode() == legacyBorderStationCode);	
		assert(borderStation.getBorderPointCode() == borderPointCode);
		assert(borderStation.getName().equals("A-Town-long--(GR)"));
		assert(borderStation.getShortName().equals("A-tool-long--(GR)"));
		assert(borderStation.getNameUTF8().equals("A-tool-long--(GR)"));

		assert(s.getFromStationName().equals("A-Town-long--(GR)"));
		assert(s.getRouteDescription().equals("B*C*D*E*F"));
		assert(s.getToStationName().equals("G-Town"));
		assert(s.getDistance1() == 10);
		assert(s.getDistance2() == 10);
		assert(s.getCarrierCode().equals("9999"));
		assert(s.getPricetype().equals(LegacyCalculationType.ROUTE_BASED));
		assert(s.getRouteNumber() == 1);
		assert(s.getSupplyingCarrierCode().equals("9999"));
		
	}
		

}
