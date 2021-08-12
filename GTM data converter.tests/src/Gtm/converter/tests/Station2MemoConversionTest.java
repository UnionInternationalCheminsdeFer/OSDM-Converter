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
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.GtmUtils;

                     
public class Station2MemoConversionTest {
	
	
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
		
		tool.getConversionFromLegacy().getParams().setLegacyStationToFareDetailMappings(GtmFactory.eINSTANCE.createLegacyFareDetailMaps());
		LegacyFareDetailMap map = GtmFactory.eINSTANCE.createLegacyFareDetailMap();
		tool.getConversionFromLegacy().getParams().getLegacyStationToFareDetailMappings().getLegacyFareDetailMaps().add(map);
		map.setFareDetailDescription(LegacyDataFactory.addText(tool, "Diabolo") );
		map.setLegacyCode(1);
		map.setFareDetailMappingType(StationFareDetailType.ON_ARRIVAL_ON_DEPARTURE);

		
		gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converterFromLegacy = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converterFromLegacy.initializeConverter();
		
		//convert
		converterFromLegacy.convertToGtmTest(new MockedProgressMonitor());
			
	}
	
	@Test 
	public void testMemoConversion() {
		
		
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
		
	}

	
	

}
