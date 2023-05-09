package Gtm.converter.tests;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import Gtm.AlternativeRoute;
import Gtm.Calendar;
import Gtm.FareElement;
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

                     
public class RouteTechnicalEntriesBasicConversionTest {
	
	private static DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd:HHmm"); //$NON-NLS-1$
	
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
		
		
		
		/*
		 *  mark vias as technical
		 * 	seriesId == 1
		 * 	"G*F*[E]*D*C*B*A"
			"A*B*C*D*[E]*F*G"
		 */
		setTechnicalVia(tool, 1,"E");
		
		/*
			seriesId == 2) {   
			"G*F*E*D*(C/[B])*A"
			"A*([B]/C)*D*E*F*G"
				
		 */
		setTechnicalVia(tool, 2,"B");
		
		/*			
				
			seriesId == 3
			"G*F*([E]*D/C)*B*A" 
			"A*B*(C/D*[E])*F*G" 
		 */

		setTechnicalVia(tool, 3,"E");
		
		/*
            seriesId == 4 
            "G*F*(E/[D]*C)*B*A";
            "A*B*(C*[D]/E)*F*G";
		 */
		setTechnicalVia(tool, 4,"D");
		setTechnicalVia(tool, 4,"D");
		
		/*
           seriesId == 5
           "G*(F/E)*D*[(C/B)]*A"
           "A*[(B/C)]*D*(E/F)*G"
        */
		setTechnicalVia(tool, 5,"B");
		setTechnicalVia(tool, 5,"C");
		
		/*
		   seriesId == 6
		   "G*F*([E]/D)*(C/B)*A"
           "A*(B/C)*(D/[E])*F*G";
		 */
		setTechnicalVia(tool, 6,"E");	
			
	}
	
	private void setTechnicalVia(GTMTool tool, int seriesId, String station) {
		
		HashSet<ViaStation> mainRoutes = getRegionalConstarints(tool, seriesId);
		
		Iterator<ViaStation> it = mainRoutes.iterator();
		
      while (it.hasNext()) {
    	  
    	  ViaStation main = it.next();
    	     	  
    	  ViaStation via = getViaStation(main,station);
    	  
    	  via.setTechnicalViaOnly(true);
    	  
      }
	}

	private ViaStation getViaStation(ViaStation via, String stationName) {
		
		if (via.getStation() != null && via.getStation().getName().startsWith(stationName)) {
			return via;
		}
		
		if (via.getFareStationSet() != null && via.getFareStationSet().getName().startsWith(stationName)) {
			return via;
		}
		
		if (via.getRoute() != null) {
			
			for (ViaStation via2 : via.getRoute().getStations()) {
				ViaStation via3 = getViaStation(via2, stationName);
				if (via3 != null) {
					return via3;
				}
			}
		}
		
		if (via.getAlternativeRoutes() != null) {
			for (AlternativeRoute ar : via.getAlternativeRoutes()) {
				
				for (ViaStation via2 : ar.getStations()) {
					ViaStation via3 = getViaStation(via2, stationName);
					if (via3 != null) {
						return via3;
					}
				}
				
			}
		}
		
		return null;
	}

	private HashSet<ViaStation> getRegionalConstarints(GTMTool tool, int seriesId) {
		
		HashSet<ViaStation> mainRoutes = new HashSet<ViaStation>();
		
		for (FareElement f : tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements()) {
			if (f.getLegacyAccountingIdentifier().getSeriesId() == seriesId) {
				mainRoutes.add(f.getRegionalConstraint().getRegionalValidity().get(0).getViaStation());
			}
		}
		
		return mainRoutes;
	}

	@Test 
	public void testBasicConversion() {
		
		
		//validate basics	
		
		//one calendar
		assert(tool.getGeneralTariffModel().getFareStructure().getCalendars().getCalendars().size() == 1);
		
		Calendar cal = tool.getGeneralTariffModel().getFareStructure().getCalendars().getCalendars().get(0);
		
		TimeZone local = TimeZone.getDefault();
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		String fromDate = dateFormat.format(cal.getFromDateTime());
		String untilDate = dateFormat.format(cal.getUntilDateTime()); 
		assert("20190101:0000".equals(fromDate));
		assert("20990101:2359".equals(untilDate));
		TimeZone.setDefault(local);
		
		
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
			
			String description = RouteDescriptionBuilder.getRouteDescription( r.getRegionalValidity().get(0).getViaStation(),null);
			boolean isReturnRoute = TestUtils.isReturnRoute(r);		
			int seriesId = TestUtils.getSeriesId(tool, r);
				
			if (seriesId == 1) {
				if (isReturnRoute) {
					assert(description.equals("G*F*D*C*B*A"));
				} else {
					assert(description.equals("A*B*C*D*F*G"));
				}
			} else if (seriesId == 2) {   
				if (isReturnRoute) {
					assert(description.equals("G*F*E*D*C*A"));
				} else {
					assert(description.equals("A*C*D*E*F*G"));
				}
			} else if (seriesId == 3) {
				if (isReturnRoute) {
					assert(description.equals("G*F*(D/C)*B*A")); 
				} else {
					assert(description.equals("A*B*(C/D)*F*G")); 
				}
			} else if (seriesId == 4) {
				if (isReturnRoute) {
					assert(description.equals("G*F*(E/C)*B*A"));
				} else {
					assert(description.equals("A*B*(C/E)*F*G"));
				}
			} else if (seriesId == 5) {
				if (isReturnRoute) {
					assert(description.equals("G*(F/E)*D*A"));
				} else {
					assert(description.equals("A*D*(E/F)*G"));
				}
			} else if (seriesId == 6) {
				if (isReturnRoute) {
					assert(description.equals("G*F*D*(C/B)*A"));
				} else {
					assert(description.equals("A*(B/C)*D*F*G"));
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
				assert(description.equals("B*C*D*F"));
				assert(s.getToStationName().equals("G-Town"));
				assert(s.getDistance1() == 10);
				assert(s.getDistance2() == 10);
				assert(s.getCarrierCode().equals("9999"));
				assert(s.getFareTableNumber() == fareTableNumber);
				assert(s.getPricetype().equals(LegacyCalculationType.ROUTE_BASED));
				assert(s.getRouteNumber() == 1);
				assert(s.getSupplyingCarrierCode().equals("9999"));
				assert(TestUtils.checkDateOnlyEqual(s.getValidFrom(), TestUtils.getFromDate()));
				assert(TestUtils.checkDateOnlyEqual(s.getValidUntil(), TestUtils.getUntilDate()));
				assert(s.getType().equals(LegacySeriesType.STATION_STATION));
				assert(!routeNumbers.contains(s.getRouteNumber()));
				routeNumbers.add(s.getRouteNumber());
				
			} else if (seriesId == 2) {   
				assert(description.equals("C*D*E*F"));
				assert(!routeNumbers.contains(s.getRouteNumber()));
				routeNumbers.add(s.getRouteNumber());
			} else if (seriesId == 3) {
				assert(description.equals("B*(C/D)*F")); 
				assert(!routeNumbers.contains(s.getRouteNumber()));
				routeNumbers.add(s.getRouteNumber());
			} else if (seriesId == 4) {
				assert(description.equals("B*(C/E)*F"));
				assert(!routeNumbers.contains(s.getRouteNumber()));
				routeNumbers.add(s.getRouteNumber());
			} else if (seriesId == 5) {
				assert(description.equals("D*(E/F)"));
				assert(!routeNumbers.contains(s.getRouteNumber()));
				routeNumbers.add(s.getRouteNumber());
			} else if (seriesId == 6) {
				assert(description.equals("(B/C)*D*F"));
				assert(!routeNumbers.contains(s.getRouteNumber()));
				routeNumbers.add(s.getRouteNumber());
			} 	
		}
	}
}