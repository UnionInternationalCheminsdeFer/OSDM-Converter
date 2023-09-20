package Gtm.converter.tests;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;

import Gtm.FareTemplate;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.Legacy108FareDescription;
import Gtm.Legacy108Station;
import Gtm.LegacySeries;
import Gtm.Text;
import Gtm.Translation;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.GtmUtils;

                     
public class MultipleFareTextConversionTest {
	
	
	GTMTool tool = null;
	
	//@Mock
	GtmUtils gtmUtilsMock;
	
	//@InjectMocks 
	ConverterFromLegacy converterFromLegacy;	
	
	//@InjectMocks 
	ConverterToLegacy converterToLegacy;	
	
	@Before 
	public void initialize() {
		
		//MockitoAnnotations.initMocks(this);
				
		tool = LegacyDataFactory.createBasicData();
		
		for (LegacySeries ls : tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
			if (ls.getNumber() == 1) {
				ls.setCarrierCode("9998");
			} else {
				ls.setCarrierCode("9999");
			}
		}
		
		
		Text text = GtmFactory.eINSTANCE.createText();
		text.setTextICAO("Local");
		text.setShortTextICAO("Local");
		text.setTextUTF8("Local");
		text.setShortTextUTF8("Local");
		Translation tr = GtmFactory.eINSTANCE.createTranslation();
		tr.setLanguage(TestUtils.getLanguage(tool,"en"));
		tr.setTextICAO("English");
		tr.setShortTextICAO("English");
		tr.setTextUTF8("English");
		tr.setShortTextUTF8("English");
		text.getTranslations().add(tr);
		Translation tr2 = GtmFactory.eINSTANCE.createTranslation();
		tr2.setLanguage(TestUtils.getLanguage(tool,"fr"));
		tr2.setTextICAO("French");
		tr2.setTextUTF8("French");
		tr2.setShortTextICAO("French");
		tr2.setShortTextUTF8("French");
		text.getTranslations().add(tr2);
		Translation tr3 = GtmFactory.eINSTANCE.createTranslation();
		tr3.setLanguage(TestUtils.getLanguage(tool,"de"));
		tr3.setTextICAO("German");
		tr3.setShortTextICAO("German");
		tr3.setTextUTF8("German");
		tr3.setShortTextUTF8("German");
		text.getTranslations().add(tr3);
		tool.getGeneralTariffModel().getFareStructure().getTexts().getTexts().add(text);
			
		HashSet<FareTemplate> newTemplates = new HashSet<FareTemplate>();
		for (FareTemplate ft : tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates()) {
			FareTemplate ft2 = LegacyDataFactory.cloneTemplate(ft);
			ft2.getCarrierFilter().add(TestUtils.findCarrier(tool, "9998"));
			ft.getCarrierFilter().add(TestUtils.findCarrier(tool, "9999"));
			ft2.setText(text);
			newTemplates.add(ft2);
		}
		tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates().addAll(newTemplates);		
	
		//gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converterFromLegacy = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converterFromLegacy.initializeConverter();
		
		//convert
		converterFromLegacy.convertToGtmTest(new MockedProgressMonitor());
			
	}
	
	@Test 
	public void testFareTextConversion() {
		
		
		//validate basics	
		
		//one calendar
		assert(tool.getGeneralTariffModel().getFareStructure().getCalendars().getCalendars().size() == 1);
			
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
					
			
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacyFareDescriptions() != null);
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacyFareDescriptions().getLegacyFares().size() == 2);
	
		LegacySeries s = TestUtils.getLegacySeries(tool, 1);
		Legacy108FareDescription fd = TestUtils.findFareDescription(tool, s.getFareTableNumber());
		assert(fd.getDescriptionLocal().equals("Local"));
		assert(fd.getDescriptionEn().equals("English"));
		assert(fd.getDescriptionFr().equals("French"));
		assert(fd.getDescriptionGe().equals("German"));
		
		s = TestUtils.getLegacySeries(tool, 2);
		fd = TestUtils.findFareDescription(tool, s.getFareTableNumber());
		assert(fd.getDescriptionLocal().equals("Standard"));
		assert(fd.getDescriptionEn().equals(""));
		assert(fd.getDescriptionFr().equals(""));
		assert(fd.getDescriptionGe().equals(""));
		
		
	}

	
	

}
