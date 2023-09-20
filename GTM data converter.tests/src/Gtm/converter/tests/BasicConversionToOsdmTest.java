package Gtm.converter.tests;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;

import Gtm.FareElement;
import Gtm.GTMTool;
import Gtm.Legacy108Station;
import Gtm.LegacyRouteFare;
import Gtm.Price;
import Gtm.RegionalConstraint;
import Gtm.RouteDescriptionBuilder;
import Gtm.ViaStation;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.utils.GtmUtils;

                     
public class BasicConversionToOsdmTest {
	
	
	GTMTool tool = null;
	
	//@Mock
	GtmUtils gtmUtilsMock;
	
	//@InjectMocks 
	ConverterFromLegacy converter;	
	
	@Before 
	public void initialize() {
		
		//MockitoAnnotations.initMocks(this);
				
		tool = LegacyDataFactory.createBasicData();
		
		//gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converter = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converter.initializeConverter();
		
		//convert
		converter.convertToGtmTest(new MockedProgressMonitor());
			
	}
	
	@Test 
	public void testConversion108toOdsmBasic() {
		
		
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
	}
	
	@Test 
	public void testConversion108toOdsmRoutes() {
						
		//validate Routes
		for (RegionalConstraint r : tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints()) {
			// one regional validity
			assert(r.getRegionalValidity().size() == 1);
			
			//route description contained
			assert(r.getRegionalValidity().get(0).getViaStation() != null);
			
			assert(r.getRegionalValidity().get(0).getViaStation().getRoute() != null);
			
			String description = RouteDescriptionBuilder.getRouteDescription( r.getRegionalValidity().get(0).getViaStation());
			boolean isReturnRoute = isReturnRoute(r);		
			int seriesId = getSeriesId(r);
			
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
		
		//validate Price
		HashSet<Integer> prices = new HashSet<Integer>();
		for (LegacyRouteFare lrf :tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares().getRouteFare()) {
			prices.add(lrf.getFare1st());
			prices.add(lrf.getFare2nd());
		}
		for (Price p : tool.getGeneralTariffModel().getFareStructure().getPrices().getPrices()) {
			assert(p.getCurrencies().size() == 1);
			int value = GtmUtils.getEuroCent(p.getCurrencies().get(0).getAmount());
			assert(prices.contains(value));
		}
		
	}

	@Test 
	public void testConversion108toOdsmPrices() {
							
		//validate Price
		HashSet<Integer> prices = new HashSet<Integer>();
		for (LegacyRouteFare lrf :tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares().getRouteFare()) {
			prices.add(lrf.getFare1st());
			prices.add(lrf.getFare2nd());
		}
		for (Price p : tool.getGeneralTariffModel().getFareStructure().getPrices().getPrices()) {
			assert(p.getCurrencies().size() == 1);
			int value = GtmUtils.getEuroCent(p.getCurrencies().get(0).getAmount());
			assert(prices.contains(value));
		}
		
	}
	
	private boolean isReturnRoute(RegionalConstraint r) {
		ViaStation via = r.getRegionalValidity().get(0).getViaStation();
		
		ViaStation firstVia = via.getRoute().getStations().get(0);
		ViaStation lastVia = via.getRoute().getStations().get(via.getRoute().getStations().size() -1);
		String firstName = getName(firstVia);
		String lastName = getName(lastVia);
		int comp = firstName.compareTo(lastName);
		boolean returnRoute = false;
		if (comp > 0) {
			returnRoute = true;
		}
		return returnRoute;
	}

	private String getName(ViaStation via) {
		
		if (via.getStation() != null) {
			return via.getStation().getName();
		}
		if (via.getFareStationSet() != null) {
			return via.getFareStationSet().getName();
		}
		return "";
	}

	private int getSeriesId(RegionalConstraint r) {
		
		for (FareElement f : tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements()) {
			if (f.getRegionalConstraint().equals(r)) {
				return f.getLegacyAccountingIdentifier().getSeriesId();
			}
		}
		return 0;
	}
	
	
	

}
