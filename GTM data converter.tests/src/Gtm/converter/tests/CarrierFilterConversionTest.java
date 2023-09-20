package Gtm.converter.tests;

import org.junit.Before;
import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;

import Gtm.ClassId;
import Gtm.FareElement;
import Gtm.FareTemplate;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.LegacyCarrier;
import Gtm.LegacySeries;
import Gtm.RegulatoryCondition;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.GtmUtils;

                     
public class CarrierFilterConversionTest {
	
	
	GTMTool tool = null;
	
	int expectedFaresC9999 = 0;
	int expectedFaresC9998 = 0;
	
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
				expectedFaresC9998++;
				
			} else {
				ls.setCarrierCode("9999");
				expectedFaresC9999++;
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
			
		expectedFaresC9998 = expectedFaresC9998 * 4;
		expectedFaresC9999 = expectedFaresC9999 * 4;
		
		//gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converterFromLegacy = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converterFromLegacy.initializeConverter();
		
		//convert
		converterFromLegacy.convertToGtmTest(new MockedProgressMonitor());
			
	}
	
	@Test 
	public void testCarrierFilterConversion() {
		
		
		//validate basics	
		
		//one calendar
		assert(tool.getGeneralTariffModel().getFareStructure().getCalendars().getCalendars().size() == 1);
			
		// number of prices
		assert(tool.getGeneralTariffModel().getFareStructure().getPrices().getPrices().size() == 2);
		 		 
		//number of fares
		assert(tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements().size() == expectedFaresC9998 + expectedFaresC9999);
		
		int fares9999 = 0;
		int fares9998 = 0;
		
		for (FareElement f : tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements()) {
		
			if (f.getLegacyAccountingIdentifier().getTariffId() == 1) {
				assert(!f.getRegulatoryConditions().contains(RegulatoryCondition.MC));
				assert(f.getRegulatoryConditions().contains(RegulatoryCondition.CIV));
				fares9999++;
			} else {
				assert(f.getRegulatoryConditions().contains(RegulatoryCondition.MC));	
				assert(f.getRegulatoryConditions().contains(RegulatoryCondition.CIV));
				fares9998++;
			}
			
		}
		
		assert(fares9999 == expectedFaresC9999);
		assert(fares9998 == expectedFaresC9998);
		
		//prepare for return conversion		
		TestUtils.resetLegacy(tool);
				
		tool.getGeneralTariffModel().setDelivery(GtmFactory.eINSTANCE.createDelivery());
		tool.getGeneralTariffModel().getDelivery().setProvider(TestUtils.findCarrier(tool, "9999"));
		

		converterToLegacy = new ConverterToLegacy(tool, null, new MockedEditingDomain());
			
		//convert
		converterToLegacy.convertTest(new MockedProgressMonitor());
		
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacyCarriers() != null);
		
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacyCarriers().getLegacyCarrier().size() == 2);
		
		LegacyCarrier c = TestUtils.findLegacyCarrier(tool, "9999");
		assert (c != null);
		assert (c.getCarrierName().equals("Wonderland Railways"));
		assert(c.getCarrierShortName().equals("RAIL-W"));
		
		c = TestUtils.findLegacyCarrier(tool, "9998");
		assert (c != null);
		assert (c.getCarrierName().equals("RAILWAY TWO"));
		assert(c.getCarrierShortName().equals("RAIL-2"));
		
		LegacySeries s = TestUtils.getLegacySeries(tool, 1);
		assert(s.getCarrierCode().equals("9998"));
		
		s = TestUtils.getLegacySeries(tool, 2);
		assert(s.getCarrierCode().equals("9999"));
		
		
	}

	
	

}
