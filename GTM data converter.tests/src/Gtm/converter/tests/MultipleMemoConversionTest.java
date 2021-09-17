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
import Gtm.LegacySeries;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.GtmUtils;

                     
public class MultipleMemoConversionTest {
	
	
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
		
		
		tool.getConversionFromLegacy().getLegacy108().setLegacyMemos(GtmFactory.eINSTANCE.createLegacy108Memos());
		Legacy108Memo memo = GtmFactory.eINSTANCE.createLegacy108Memo();
		memo.setNumber(1);
		memo.setEnglish("English");
		memo.setFrench("French");
		memo.setLocal("Memo1");
		memo.setGerman("German");
		tool.getConversionFromLegacy().getLegacy108().getLegacyMemos().getLegacyMemos().add(memo);
		LegacySeries s = TestUtils.getLegacySeries(tool, 1);
		s.setMemoNumber(memo.getNumber());
		
		Legacy108Memo memo2 = GtmFactory.eINSTANCE.createLegacy108Memo();
		memo2.setNumber(2);
		memo2.setEnglish("English");
		memo2.setFrench("French");
		memo2.setLocal("Local");
		memo2.setGerman("German");
		tool.getConversionFromLegacy().getLegacy108().getLegacyMemos().getLegacyMemos().add(memo2);
		LegacySeries s2 = TestUtils.getLegacySeries(tool, 2);
		s2.setMemoNumber(memo2.getNumber());
		
		gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converterFromLegacy = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converterFromLegacy.initializeConverter();
		
		//convert
		converterFromLegacy.convertToGtmTest(new MockedProgressMonitor());
			
	}
	
	@Test 
	public void testMultipleMemoConversion() {
		
		
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
					
			
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacyMemos().getLegacyMemos().size() == 2);
		
		Legacy108Memo memo = tool.getConversionFromLegacy().getLegacy108().getLegacyMemos().getLegacyMemos().get(0);
		
		LegacySeries s = null;
		
		if (memo.getLocal().equals("Memo1")) {
		
			assert(memo.getEnglish().equals("English"));
			assert(memo.getFrench().equals("French"));
			assert(memo.getGerman().equals("German"));
				
			s = TestUtils.getLegacySeries(tool,1);
			assert(s.getMemoNumber() == memo.getNumber());

		} else {
			
			assert(memo.getLocal().equals("Local"));
			assert(memo.getEnglish().equals("English"));
			assert(memo.getFrench().equals("French"));
			assert(memo.getGerman().equals("German"));
				
			s = TestUtils.getLegacySeries(tool,2);
			assert(s.getMemoNumber() == memo.getNumber());
			
		}
		
		s = TestUtils.getLegacySeries(tool,3);
		assert(s.getMemoNumber() == 0);
	}

	
	

}
