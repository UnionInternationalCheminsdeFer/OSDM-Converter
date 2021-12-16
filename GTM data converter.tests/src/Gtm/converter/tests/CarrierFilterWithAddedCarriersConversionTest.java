package Gtm.converter.tests;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import Gtm.AddCarrierRule;
import Gtm.AddCarrierScope;
import Gtm.ClassId;
import Gtm.FareTemplate;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.LegacySeries;
import Gtm.RegulatoryCondition;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.GtmUtils;

                     
public class CarrierFilterWithAddedCarriersConversionTest {
	
	
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
		
		for (LegacySeries ls : tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
			if (ls.getNumber() == 1) {
				ls.setCarrierCode("9998");
			} else {
				ls.setCarrierCode("9999");
			}
		}
		
		FareTemplate t1 = null;
		FareTemplate t2 = null;
		for (FareTemplate f : tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates()) {
			if (f.getServiceClass().getId() == ClassId.B) {
				t1 = f;
			} else if (f.getServiceClass().getId() == ClassId.D) {
				t2 = f;
			}
		}
		t1.setLegacyAccountingTariffId(1);
		t2.setLegacyAccountingTariffId(1);
		
		t1.getCarrierFilter().add(TestUtils.findCarrier(tool, "9999"));
		t2.getCarrierFilter().add(TestUtils.findCarrier(tool, "9999"));
		
		tool.getConversionFromLegacy().getParams().setLegacyFareTemplates(GtmFactory.eINSTANCE.createLegacyFareTemplates());;
		tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates().add(t1);
		tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates().add(t2);

		FareTemplate t1c = TestUtils.clone(t1);
		FareTemplate t2c = TestUtils.clone(t2);
		t1c.getRegulatoryConditions().add(RegulatoryCondition.MC);
		t2c.getRegulatoryConditions().add(RegulatoryCondition.MC);
		
		t1c.getCarrierFilter().add(TestUtils.findCarrier(tool, "9998"));
		t2c.getCarrierFilter().add(TestUtils.findCarrier(tool, "9998"));
		t1c.setLegacyAccountingTariffId(2);
		t2c.setLegacyAccountingTariffId(2);
		
		tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates().add(t1c);
		tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates().add(t2c);
				
		
		AddCarrierRule addCarrier = GtmFactory.eINSTANCE.createAddCarrierRule();
		addCarrier.setScope(AddCarrierScope.CARRIER);
		addCarrier.setCarrier(TestUtils.findCarrier(tool, "9997"));
		addCarrier.getStations().add(TestUtils.findStation(tool,99, "00006"));
		addCarrier.getStations().add(TestUtils.findStation(tool,99, "00007"));
		tool.getConversionFromLegacy().getParams().setAddCarrierRules(GtmFactory.eINSTANCE.createAddCarrierRules());
		tool.getConversionFromLegacy().getParams().getAddCarrierRules().getAddCarrierRule().add(addCarrier);
		
		
		gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converterFromLegacy = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converterFromLegacy.initializeConverter();
		
		//convert
		converterFromLegacy.convertToGtmTest(new MockedProgressMonitor());
			
	}
	
	@Test 
	public void testCarrierFilterConversion() {
		
		
		//one calendar
		assert(tool.getGeneralTariffModel().getFareStructure().getCalendars().getCalendars().size() == 1);
			
		// number of prices
		assert(tool.getGeneralTariffModel().getFareStructure().getPrices().getPrices().size() == 2);
		 		 	
		//no fares due to the additional carrier
		assert(tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements().isEmpty());
		
	
		
	}

	
	

}
