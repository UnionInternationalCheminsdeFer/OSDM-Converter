package Gtm.converter.tests;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import Gtm.Country;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.Legacy108Station;
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

public class FareStationSetInViaConversionTest {
	
	GTMTool tool = null;
	
	@Mock
	GtmUtils gtmUtilsMock;
	
	@InjectMocks 
	ConverterFromLegacy converter2osdm;	
	
	@InjectMocks 
	ConverterToLegacy converter2legacy;	

	@Before
	public void setUp() throws Exception {
		
		MockitoAnnotations.initMocks(this);
		
		tool = LegacyDataFactory.createBasicData();
			
		//set legacy stations
		tool.getConversionFromLegacy().getLegacy108().setLegacyStations(GtmFactory.eINSTANCE.createLegacy108Stations());	
		tool.getCodeLists().setStations(GtmFactory.eINSTANCE.createStations());	
		
		//legacy stations
		LegacyDataFactory.addLegacyStation(tool,"A-Town","A-Town","A",1,0,0);
		LegacyDataFactory.addLegacyStation(tool,"B-Town","B-Town","B-Set",2,0,2);
		LegacyDataFactory.addLegacyStation(tool,"C-Town","C-Town","C",3,0,0);
		LegacyDataFactory.addLegacyStation(tool,"D-Town","D-Town","D",4,0,0);
		LegacyDataFactory.addLegacyStation(tool,"E-Town","E-Town","E",5,0,0);
		LegacyDataFactory.addLegacyStation(tool,"F-Town","F-Town","F",6,0,0);
		LegacyDataFactory.addLegacyStation(tool,"G-Town","G-Town","G",7,0,0);
		LegacyDataFactory.addLegacyStation(tool,"H-Town","H-Town","H",8,0,2);
		
		//MERITS stations 
		Country c = TestUtils.findCountry(tool,99);
		LegacyDataFactory.addStation(tool,"A","00001",c);
		LegacyDataFactory.addStation(tool,"B","00002",c);
		LegacyDataFactory.addStation(tool,"C","00003",c);
		LegacyDataFactory.addStation(tool,"D","00004",c);
		LegacyDataFactory.addStation(tool,"E","00005",c);
		LegacyDataFactory.addStation(tool,"F","00006",c);
		LegacyDataFactory.addStation(tool,"G","00007",c);
		LegacyDataFactory.addStation(tool,"H","00008",c);
	

		
		
		//series A-Town to A-Town (GR)
		tool.getConversionFromLegacy().getLegacy108().setLegacySeriesList(GtmFactory.eINSTANCE.createLegacySeriesList());
		LegacySeries s = GtmFactory.eINSTANCE.createLegacySeries();
		s.setCarrierCode("9999");
		s.setDistance1(10);
		s.setDistance2(10);
		s.setFareTableNumber(1);
		s.setFromStation(1);
		s.setToStation(7);
		s.setNumber(1);
		s.setPricetype(LegacyCalculationType.ROUTE_BASED);
		s.getViastations().add(LegacyDataFactory.createViaStation(2,1,false));
		s.getViastations().add(LegacyDataFactory.createViaStation(4,1,false));
		s.getViastations().add(LegacyDataFactory.createViaStation(5,1,false));
		s.getViastations().add(LegacyDataFactory.createViaStation(6,1,false));
		s.setSupplyingCarrierCode("9999");
		s.setType(LegacySeriesType.STATION_STATION);
		
		
		s.setValidFrom(TestUtils.getFromDate());
		s.setValidUntil(TestUtils.getUntilDate());	
		tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries().add(s);
		
		gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converter2osdm = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converter2osdm.initializeConverter();
		
		//convert
		converter2osdm.convertToGtmTest(new MockedProgressMonitor());
		
	}

	@Test 
	public void testFareStationSetConversion() {
		
		
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
			
		
		for (RegionalConstraint r : tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints()) {

			if (!TestUtils.isReturnRoute(r)) {
				
				assert(r.getEntryConnectionPoint().getConnectedStationSets().get(0).getStations().size() == 1);

				ViaStation route = r.getRegionalValidity().get(0).getViaStation();
				
				assert(r.getEntryConnectionPoint().getConnectedStationSets().size() == 1);

				assert(r.getExitConnectionPoint().getConnectedStationSets().size() == 1);
				
				assert (route.getRoute().getStations().size() == 6);
				
			} else {
				
				assert(r.getExitConnectionPoint().getConnectedStationSets().get(0).getStations().size() == 1);

				ViaStation route = r.getRegionalValidity().get(0).getViaStation();
				
				assert(r.getEntryConnectionPoint().getConnectedStationSets().size() == 1);

				assert(r.getExitConnectionPoint().getConnectedStationSets().size() == 1);
				
				assert (route.getRoute().getStations().size() == 6);
				
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
				assert(description.equals("G*F*E*D*B-Set*A"));
			} else {
				assert(description.equals("A*B-Set*D*E*F*G"));
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
		
		assert(s.getFromStation() == 1);
		assert(s.getToStation() == 7);
		
		Legacy108Station setStation = TestUtils.findLegacyStation(tool,2);
		assert(setStation != null);		
		assert(setStation.getNameUTF8().equals("B-Town"));
		assert(setStation.getName().equals("B-Town"));
		assert(setStation.getShortName().equals("B-Set"));
		
		assert(s.getFromStationName().equals("A-Town"));
		assert(s.getRouteDescription().equals("B-Set*D*E*F"));
		assert(s.getToStationName().equals("G-Town"));
		assert(s.getDistance1() == 10);
		assert(s.getDistance2() == 10);
		assert(s.getCarrierCode().equals("9999"));
		assert(s.getPricetype().equals(LegacyCalculationType.ROUTE_BASED));
		assert(s.getRouteNumber() == 1);
		assert(s.getSupplyingCarrierCode().equals("9999"));
											
	}
		

}
