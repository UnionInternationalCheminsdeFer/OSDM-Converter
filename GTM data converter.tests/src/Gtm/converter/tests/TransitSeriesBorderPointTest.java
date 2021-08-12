package Gtm.converter.tests;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import Gtm.ConnectionPoint;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.Legacy108Station;
import Gtm.LegacyCalculationType;
import Gtm.LegacySeries;
import Gtm.LegacySeriesType;
import Gtm.RegionalConstraint;
import Gtm.ViaStation;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.GtmUtils;

public class TransitSeriesBorderPointTest {
	
	GTMTool tool = null;
	
	int borderPointCodeA = 10;
	int borderPointCodeG = 20;
	int legacyBorderStationCodeA = 1000;  //A-Town (GR)
	int legacyBorderStationCodeG = 2000;  //G-Town (GR)
	int legacyNonBorderStationCodeA = 1; //A-Town
	int legacyNonBorderStationCodeG = 7; //G-Town
	
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
		Legacy108Station ls1 = GtmFactory.eINSTANCE.createLegacy108Station();
		ls1 = LegacyDataFactory.createStation("A-Town","A-Town","A",legacyNonBorderStationCodeA,0,0);
		tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations().add(ls1);
		Legacy108Station ls2 = GtmFactory.eINSTANCE.createLegacy108Station();
		ls2 = LegacyDataFactory.createStation("A-Town (GR)","A-Town (GR)","A (GR)",legacyBorderStationCodeA,borderPointCodeA,0);
		tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations().add(ls2);
		
		Legacy108Station ls3 = GtmFactory.eINSTANCE.createLegacy108Station();
		ls3 = LegacyDataFactory.createStation("G-Town","G-Town","G",legacyNonBorderStationCodeG,0,0);
		tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations().add(ls3);
		Legacy108Station ls4 = GtmFactory.eINSTANCE.createLegacy108Station();
		ls4 = LegacyDataFactory.createStation("G-Town (GR)","G-Town (GR)","G (GR)",legacyBorderStationCodeG,borderPointCodeG,0);
		tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations().add(ls4);
		
		LegacyDataFactory.addStation(tool, "A-TOWN", "10000",TestUtils.findCountry(tool,99));
		LegacyDataFactory.addStation(tool, "G-TOWN", "20000",TestUtils.findCountry(tool,99));
		
		//set border point 1
		tool.getConversionFromLegacy().getLegacy108().setLegacyBorderPoints(GtmFactory.eINSTANCE.createLegacyBorderPoints());
		LegacyDataFactory.addBorderPoint(tool,borderPointCodeA,"9999",99,legacyBorderStationCodeA,"00001","9995",98,10000,"10000");
		//set border point 2
		LegacyDataFactory.addBorderPoint(tool,borderPointCodeG,"9999",99,legacyBorderStationCodeG,"00007","9996",97,20000,"20000");
		
		
		//series A-Town to A-Town (GR)
		tool.getConversionFromLegacy().getLegacy108().setLegacySeriesList(GtmFactory.eINSTANCE.createLegacySeriesList());
		LegacySeries s = GtmFactory.eINSTANCE.createLegacySeries();
		s.setCarrierCode("9999");
		s.setDistance1(10);
		s.setDistance2(10);
		s.setFareTableNumber(1);
		s.setFromStation(legacyBorderStationCodeA);
		s.setToStation(legacyBorderStationCodeG);
		s.setNumber(1);
		s.setPricetype(LegacyCalculationType.ROUTE_BASED);
		s.setSupplyingCarrierCode("9999");
		s.setType(LegacySeriesType.TRANSIT);
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
	public void testTransitNonMeritsBorderStationConversion() {
		
		
		//validate basics	
		
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
			
			assert(p.getConnectedStationSets().size() == 2);
			
			assert(p.getLegacyBorderPointCode() == borderPointCodeA || p.getLegacyBorderPointCode() == borderPointCodeG);

		}

		
		
		for (RegionalConstraint r : tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints()) {
			if (!TestUtils.isReturnRoute(r)) {
				
				assert(r.getExitConnectionPoint().getLegacyBorderPointCode() == borderPointCodeG);

				assert(r.getEntryConnectionPoint().getLegacyBorderPointCode() == borderPointCodeA);

				ViaStation route = r.getRegionalValidity().get(0).getViaStation();
				
				assert (route.getRoute().getStations().size() == 2);
				
			} else {
				
				assert(r.getExitConnectionPoint().getLegacyBorderPointCode() == borderPointCodeA);

				assert(r.getEntryConnectionPoint().getLegacyBorderPointCode() == borderPointCodeG);

				ViaStation route = r.getRegionalValidity().get(0).getViaStation();
				
				assert (route.getRoute().getStations().size() == 2);
				
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
		
		assert(s.getFromStation() == legacyBorderStationCodeA);
		assert(s.getToStation() == legacyBorderStationCodeG);
		assert(s.getType().equals(LegacySeriesType.TRANSIT));
		
		Legacy108Station borderStation1 = TestUtils.findLegacyStation(tool,s.getFromStation());
		Legacy108Station borderStation2 = TestUtils.findLegacyStation(tool,s.getToStation());
		
		assert(borderStation1 != null);	
		assert(borderStation1.getStationCode() == legacyBorderStationCodeA);	
		assert(borderStation1.getBorderPointCode() == borderPointCodeA);
		assert(borderStation1.getName().equals("A (GR)"));
		
		assert(borderStation2 != null);
		assert(borderStation2.getStationCode() == legacyBorderStationCodeG);
		assert(borderStation2.getBorderPointCode() == borderPointCodeG);
		assert(borderStation2.getName().equals("G (GR)"));

		
	}
	

	



}
