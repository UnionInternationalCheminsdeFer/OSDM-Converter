package Gtm.converter.tests;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.Legacy108Memo;
import Gtm.Legacy108Station;
import Gtm.LegacyFareDetailMap;
import Gtm.LegacySeries;
import Gtm.StationFareDetailType;
import Gtm.Text;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.GtmUtils;

                     
public class Station2MemoOnArrivalConversionTest {
	
	
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
		
		
		tool.getConversionFromLegacy().getLegacy108().setLegacyStations(GtmFactory.eINSTANCE.createLegacy108Stations());
		LegacyDataFactory.addLegacyStation(tool, 1, "A", "A", "A", 0, 0);
		LegacyDataFactory.addLegacyStation(tool, 2, "B", "B", "B", 0, 0);
		LegacyDataFactory.addLegacyStation(tool, 3, "C", "C", "C", 0, 0);
		LegacyDataFactory.addLegacyStation(tool, 4, "D", "D", "D", 0, 0);
		LegacyDataFactory.addLegacyStation(tool, 5, "E", "E", "E", 0, 0);
		
		Text memo = LegacyDataFactory.addText(tool, "Diabolo");
		
		tool.getConversionFromLegacy().getParams().setLegacyStationToFareDetailMappings(GtmFactory.eINSTANCE.createLegacyFareDetailMaps());
		LegacyFareDetailMap map = GtmFactory.eINSTANCE.createLegacyFareDetailMap();
		tool.getConversionFromLegacy().getParams().getLegacyStationToFareDetailMappings().getLegacyFareDetailMaps().add(map);
		map.setFareDetailDescription(memo);
		map.setLegacyCode(3);
		map.setFareDetailMappingType(StationFareDetailType.ON_ARRIVAL);

		LegacyFareDetailMap map2 = GtmFactory.eINSTANCE.createLegacyFareDetailMap();
		tool.getConversionFromLegacy().getParams().getLegacyStationToFareDetailMappings().getLegacyFareDetailMaps().add(map2);
		map2.setFareDetailDescription(memo);
		map2.setLegacyCode(1);
		map2.setFareDetailMappingType(StationFareDetailType.ON_DEPARTURE);
		
		LegacyFareDetailMap map3 = GtmFactory.eINSTANCE.createLegacyFareDetailMap();
		tool.getConversionFromLegacy().getParams().getLegacyStationToFareDetailMappings().getLegacyFareDetailMaps().add(map3);
		map3.setFareDetailDescription(memo);
		map3.setLegacyCode(5);
		map3.setFareDetailMappingType(StationFareDetailType.ON_ARRIVAL_ON_DEPARTURE);

		
		tool.getConversionFromLegacy().getLegacy108().setLegacySeriesList(GtmFactory.eINSTANCE.createLegacySeriesList());;
		LegacyDataFactory.addRouteBasedSeries(tool, 1, 100, 1, 2);
		LegacyDataFactory.addRouteBasedSeries(tool, 2, 100, 2, 3);
		LegacyDataFactory.addRouteBasedSeries(tool, 3, 100, 1, 3);
		LegacyDataFactory.addRouteBasedSeries(tool, 4, 100, 2, 4);
		LegacyDataFactory.addRouteBasedSeries(tool, 5, 100, 2, 5);
		
		gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converterFromLegacy = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converterFromLegacy.initializeConverter();
		
		//convert
		converterFromLegacy.convertToGtmTest(new MockedProgressMonitor());
			
	}
	
	@Test 
	public void testMemoOnArrivalConversion() {
		
		
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

		//prepare for return conversion		
		TestUtils.resetLegacy(tool);
		
		
		tool.getGeneralTariffModel().setDelivery(GtmFactory.eINSTANCE.createDelivery());
		tool.getGeneralTariffModel().getDelivery().setProvider(TestUtils.findCarrier(tool, "9999"));
		

		converterToLegacy = new ConverterToLegacy(tool, null, new MockedEditingDomain());
			
		//convert
		converterToLegacy.convertTest(new MockedProgressMonitor());
		
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacyStations() != null);
		
		assert(TestUtils.getLegacyStation(tool.getConversionFromLegacy().getLegacy108().getLegacyStations(), 1) != null);
				
		
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList() != null);
		
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries() != null);
					
			
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacyMemos().getLegacyMemos().size() == 1);
		
		Legacy108Memo memo = tool.getConversionFromLegacy().getLegacy108().getLegacyMemos().getLegacyMemos().get(0);
		
		assert(memo.getLocal().equals("Diabolo"));
		assert(memo.getEnglish().equals("Diaboloen"));
		assert(memo.getFrench().equals("Diabolofr"));
		assert(memo.getGerman().equals("Diabolode"));
				
	    LegacySeries s = TestUtils.getLegacySeries(tool,1);
		assert(s.getMemoNumber() == memo.getNumber());
		
	    s = TestUtils.getLegacySeries(tool,2);
		assert(s.getMemoNumber() == memo.getNumber());
		
	    s = TestUtils.getLegacySeries(tool,3);
		assert(s.getMemoNumber() == memo.getNumber());

	    s = TestUtils.getLegacySeries(tool,4);
		assert(s.getMemoNumber() == 0);
		
	    s = TestUtils.getLegacySeries(tool,5);
		assert(s.getMemoNumber() == memo.getNumber());
	}

	
	

}
