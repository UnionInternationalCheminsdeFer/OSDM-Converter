package Gtm.converter.tests;

import org.junit.Before;
import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;

import Gtm.BasePriceClassType;
import Gtm.ClassId;
import Gtm.FareElement;
import Gtm.FareTemplate;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.LegacyConversionType;
import Gtm.LegacyRouteFare;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.GtmUtils;

                     
public class BasePriceDogTest {
	
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
		
		tool.getConversionFromLegacy().getLegacy108().setLegacyRouteFares(GtmFactory.eINSTANCE.createLegacyRouteFares());
		tool.getConversionFromLegacy().getLegacy108().setLegacySeriesList(GtmFactory.eINSTANCE.createLegacySeriesList());
		LegacyDataFactory.addRouteBasedSeries(tool, 1, 100, 1, 7);		
		LegacyDataFactory.addRouteFare(tool, "20190101", "20990101", 10000, 5000, 1, 1);	

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
		
		FareTemplate t1r1 = TestUtils.clone(t1);
		FareTemplate t1r2 = TestUtils.clone(t2);
		t1r1.setPriceFactor(0.5F);
		t1r2.setPriceFactor(0.5F);
		t1r2.setBasePriceClass(BasePriceClassType.FIRST);
		t1r1.setLegacyConversion(LegacyConversionType.NO);
		t1r2.setLegacyConversion(LegacyConversionType.NO);
		t1r1.setLegacyAccountingTariffId(2);
		t1r2.setLegacyAccountingTariffId(2);
		
		FareTemplate t2r1 = TestUtils.clone(t1);
		FareTemplate t2r2 = TestUtils.clone(t2);
		t2r1.setPriceFactor(0.3F);
		t2r2.setPriceFactor(0.3F);
		t2r1.setBasePriceClass(BasePriceClassType.SECOND);
		t2r1.setLegacyConversion(LegacyConversionType.NO);
		t2r2.setLegacyConversion(LegacyConversionType.NO);
		t2r1.setLegacyAccountingTariffId(3);
		t2r2.setLegacyAccountingTariffId(3);
		
		
		tool.getConversionFromLegacy().getParams().setLegacyFareTemplates(GtmFactory.eINSTANCE.createLegacyFareTemplates());;
		tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates().add(t1);
		tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates().add(t2);
		tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates().add(t1r1);
		tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates().add(t2r1);
		tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates().add(t1r2);
		tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates().add(t2r2);
		
		
		
		
		//gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converterFromLegacy = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converterFromLegacy.initializeConverter();
		
		//convert
		converterFromLegacy.convertToGtmTest(new MockedProgressMonitor());
			
	}
	
	@Test 
	public void testBasePriceDogConversion() {
		
		
		//validate fares
		
		assert(tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements().size() == 12);
		
		for (FareElement f : tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements()) {
			
			if (f.getLegacyAccountingIdentifier().getTariffId() == 1) {
				if (f.getServiceClass().getId() == ClassId.B) {
					assert(f.getPrice().getCurrencies().get(0).getAmount() == 100.0F);
				} else if(f.getServiceClass().getId() == ClassId.D) {
					assert(f.getPrice().getCurrencies().get(0).getAmount() == 50.0F);
				} 
			}
			
			if (f.getLegacyAccountingIdentifier().getTariffId() == 2) {
				if (f.getServiceClass().getId() == ClassId.B) {
					assert(f.getPrice().getCurrencies().get(0).getAmount() == 50.0F);
				} else if(f.getServiceClass().getId() == ClassId.D) {
					assert(f.getPrice().getCurrencies().get(0).getAmount() == 50.0F);
				} 

			}
			if (f.getLegacyAccountingIdentifier().getTariffId() == 3) {
				if (f.getServiceClass().getId() == ClassId.B) {
					assert(f.getPrice().getCurrencies().get(0).getAmount() == 15.0F);
				} else if(f.getServiceClass().getId() == ClassId.D) {
					assert(f.getPrice().getCurrencies().get(0).getAmount() == 15.0F);
				} 

			}
			
		}
		
		//prepare for return conversion		
		TestUtils.resetLegacy(tool);
		
		tool.getGeneralTariffModel().setDelivery(GtmFactory.eINSTANCE.createDelivery());
		tool.getGeneralTariffModel().getDelivery().setProvider(TestUtils.findCarrier(tool, "9999"));
		
		
		converterToLegacy = new ConverterToLegacy(tool, null, new MockedEditingDomain());
		
		//convert
		converterToLegacy.convertTest(new MockedProgressMonitor());
		
		//validate Route Fare

		assert(tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares() != null);
		
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares().getRouteFare().size() == 1);
		
		LegacyRouteFare lf = tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares().getRouteFare().get(0);
		
		assert(lf.getSeriesNumber() == 1);
		assert(lf.getFare1st() == 10000);
		assert(lf.getFare2nd() == 5000);
		assert(lf.getReturnFare1st() == 20000);
		assert(lf.getReturnFare2nd() == 10000);
	}
}
