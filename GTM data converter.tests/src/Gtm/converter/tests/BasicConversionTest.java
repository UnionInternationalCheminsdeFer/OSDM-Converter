package Gtm.converter.tests;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import Gtm.FareElement;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.Legacy108Station;
import Gtm.LegacyCalculationType;
import Gtm.LegacySeries;
import Gtm.LegacySeriesType;
import Gtm.RegionalConstraint;
import Gtm.RouteDescriptionBuilder;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.GtmUtils;

                     
public class BasicConversionTest {
	
	
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
		
		// number of fare station sets
		HashSet<Integer> fareStations = new HashSet<Integer>();
		for (Legacy108Station s : tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations())	{
			if (s.getFareReferenceStationCode() > 0) {
				fareStations.add(s.getFareReferenceStationCode());
			}
		}
		assert(tool.getGeneralTariffModel().getFareStructure().getFareStationSetDefinitions().getFareStationSetDefinitions().size() == fareStations.size());

		for (FareElement fare : tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements()) {
			assert(fare.getServiceClass() != null);
			assert(!fare.getRegulatoryConditions().isEmpty());
			assert(fare.getPrice() != null);
			assert(fare.getLegacyAccountingIdentifier() != null);
			assert(fare.getLegacyAccountingIdentifier().getTariffId() > 0);
			assert(fare.getLegacyAccountingIdentifier().getSeriesId() > 0);
			assert(fare.getFareConstraintBundle() != null);
		}
		
		//prepare for return conversion		
		TestUtils.resetLegacy(tool);
		
		
		tool.getGeneralTariffModel().setDelivery(GtmFactory.eINSTANCE.createDelivery());
		tool.getGeneralTariffModel().getDelivery().setProvider(TestUtils.findCarrier(tool, "9999"));
		
		//validate Routes
		for (RegionalConstraint r : tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints()) {
			// one regional validity
			assert(r.getRegionalValidity().size() == 1);
			
			//route description contained
			assert(r.getRegionalValidity().get(0).getViaStation() != null);
			
			assert(r.getRegionalValidity().get(0).getViaStation().getRoute() != null);
			
			String description = RouteDescriptionBuilder.getRouteDescription( r.getRegionalValidity().get(0).getViaStation());
			boolean isReturnRoute = TestUtils.isReturnRoute(r);		
			int seriesId = TestUtils.getSeriesId(tool, r);
				
			if (seriesId == 1) {
				if (isReturnRoute) {
					assert(description.equals("G*F*E*D*C*B*A"));
				} else {
					assert(description.equals("A*B*C*D*E*F*G"));
				}
			} else if (seriesId == 2) {   
				if (isReturnRoute) {
					assert(description.equals("G*F*E*D*(C/B)*A"));
				} else {
					assert(description.equals("A*(B/C)*D*E*F*G"));
				}
			} else if (seriesId == 3) {
				if (isReturnRoute) {
					assert(description.equals("G*F*(E*D/C)*B*A")); 
				} else {
					assert(description.equals("A*B*(C/D*E)*F*G")); 
				}
			} else if (seriesId == 4) {
				if (isReturnRoute) {
					assert(description.equals("G*F*(E/D*C)*B*A"));
				} else {
					assert(description.equals("A*B*(C*D/E)*F*G"));
				}
			} else if (seriesId == 5) {
				if (isReturnRoute) {
					assert(description.equals("G*(F/E)*D*(C/B)*A"));
				} else {
					assert(description.equals("A*(B/C)*D*(E/F)*G"));
				}
			} else if (seriesId == 6) {
				if (isReturnRoute) {
					assert(description.equals("G*F*(E/D)*(C/B)*A"));
				} else {
					assert(description.equals("A*(B/C)*(D/E)*F*G"));
				}
			} 
		}
		
		converterToLegacy = new ConverterToLegacy(tool, null, new MockedEditingDomain());
			
		//convert
		converterToLegacy.convertTest(new MockedProgressMonitor());
		
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacyStations() != null);
		
		assert(TestUtils.getLegacyStation(tool.getConversionFromLegacy().getLegacy108().getLegacyStations(), 1) != null);
				
		
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList() != null);
		
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries() != null);
		
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries().size() == 6);

		assert(tool.getConversionFromLegacy().getLegacy108().getLegacyFareDescriptions() != null);

		assert(tool.getConversionFromLegacy().getLegacy108().getLegacyFareDescriptions().getLegacyFares().size() == 1);
		
		int fareTableNumber = tool.getConversionFromLegacy().getLegacy108().getLegacyFareDescriptions().getLegacyFares().get(0).getTableId();
		
		//check for unique route numbers as all series go from A to F
		HashSet<Integer> routeNumbers = new HashSet<Integer>(); 
			
		for (LegacySeries s : tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {;
		
			int seriesId = s.getNumber();
			String description = s.getRouteDescription();
			if (seriesId == 1) {
				assert(s.getFromStationName().equals("A-Town"));
				assert(description.equals("B*C*D*E*F"));
				assert(s.getToStationName().equals("G-Town"));
				assert(s.getDistance1() == 10);
				assert(s.getDistance2() == 10);
				assert(s.getCarrierCode().equals("9999"));
				assert(s.getFareTableNumber() == fareTableNumber);
				assert(s.getPricetype().equals(LegacyCalculationType.ROUTE_BASED));
				assert(s.getRouteNumber() == 1);
				assert(s.getSupplyingCarrierCode().equals("9999"));
				assert(s.getValidFrom().equals(TestUtils.getFromDate()));
				assert(s.getValidUntil().equals(TestUtils.getUntilDate()));	
				assert(s.getType().equals(LegacySeriesType.STATION_STATION));
				assert(!routeNumbers.contains(s.getRouteNumber()));
				routeNumbers.add(s.getRouteNumber());
				
			} else if (seriesId == 2) {   
				assert(description.equals("(B/C)*D*E*F"));
				assert(!routeNumbers.contains(s.getRouteNumber()));
				routeNumbers.add(s.getRouteNumber());
			} else if (seriesId == 3) {
				assert(description.equals("B*(C/D*E)*F")); 
				assert(!routeNumbers.contains(s.getRouteNumber()));
				routeNumbers.add(s.getRouteNumber());
			} else if (seriesId == 4) {
				assert(description.equals("B*(C*D/E)*F"));
				assert(!routeNumbers.contains(s.getRouteNumber()));
				routeNumbers.add(s.getRouteNumber());
			} else if (seriesId == 5) {
				assert(description.equals("(B/C)*D*(E/F)"));
				assert(!routeNumbers.contains(s.getRouteNumber()));
				routeNumbers.add(s.getRouteNumber());
			} else if (seriesId == 6) {
				assert(description.equals("(B/C)*(D/E)*F"));
				assert(!routeNumbers.contains(s.getRouteNumber()));
				routeNumbers.add(s.getRouteNumber());
			} 
			
			
		}
		
		
	
	}

	
	

}
