package Gtm.converter.tests;

import org.junit.Before;
import org.junit.Test;

import Gtm.BasePriceClassType;
import Gtm.ClassId;
import Gtm.ClassicClassType;
import Gtm.CurrencyPrice;
import Gtm.FareElement;
import Gtm.FareTemplate;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.LegacyConversionType;
import Gtm.MinimalPrice;
import Gtm.ServiceClass;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.GtmUtils;

                     
public class MinimalPriceTest {
	
	GTMTool tool = null;
	
//	@Mock
	GtmUtils gtmUtilsMock;
	
//	@InjectMocks 
	ConverterFromLegacy converterFromLegacy;	
	
//	@InjectMocks 
	ConverterToLegacy converterToLegacy;	
	
	@Before 
	public void initialize() {
		
//		MockitoAnnotations.initMocks(this);
				
		tool = LegacyDataFactory.createBasicData();	
		
		tool.getConversionFromLegacy().getLegacy108().setLegacyRouteFares(GtmFactory.eINSTANCE.createLegacyRouteFares());
		tool.getConversionFromLegacy().getLegacy108().setLegacySeriesList(GtmFactory.eINSTANCE.createLegacySeriesList());
		LegacyDataFactory.addRouteBasedSeries(tool, 1, 100, 1, 7);		
		LegacyDataFactory.addRouteFare(tool, "20190101", "20990101", 10000, 5000, 1, 1);	

		
		ServiceClass sc =  GtmFactory.eINSTANCE.createServiceClass();
		sc.setClassicClass(ClassicClassType.ANY_CLASS);
		sc.setId(ClassId.ANY_CLASS);
		
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
		t1.setBasePriceClass(BasePriceClassType.SECOND);
		t1.setServiceClass(sc);
		t1.setPriceFactor(0.5F);
		t1.setLegacyConversion(LegacyConversionType.NO);
		
		t2.setLegacyConversion(LegacyConversionType.NO);		
		t2.setLegacyAccountingTariffId(2);
		t2.setBasePriceClass(BasePriceClassType.SECOND);
		t2.setServiceClass(sc);
		t2.setPriceFactor(0.5F);
		t2.setLegacyConversion(LegacyConversionType.NO);
		
		MinimalPrice mp = GtmFactory.eINSTANCE.createMinimalPrice();
		CurrencyPrice cp = GtmFactory.eINSTANCE.createCurrencyPrice();
		cp.setAmount((float) 55.5);
		cp.setCurrency(tool.getCodeLists().getCurrencies().getCurrencies().get(0));
		mp.getCurrencies().add(cp);
		t2.setMinimalPrice(mp);

		
		tool.getConversionFromLegacy().getParams().setLegacyFareTemplates(GtmFactory.eINSTANCE.createLegacyFareTemplates());
		tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates().add(t1);
		tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates().add(t2);


//		gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converterFromLegacy = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converterFromLegacy.initializeConverter();
		
		//convert
		converterFromLegacy.convertToGtmTest(new MockedProgressMonitor());
			
	}
	
	@Test 
	public void testBasicConversion() {
		
		
		//validate fares
		
		assert(tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements().size() == 4);
		
		for (FareElement f : tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements()) {
			
			if (f.getLegacyAccountingIdentifier().getTariffId() == 1) {
				if (f.getServiceClass().getId() == ClassId.ANY_CLASS) {
					assert(f.getPrice().getCurrencies().get(0).getAmount() == 25.0F);
				} 
			}
			
			if (f.getLegacyAccountingIdentifier().getTariffId() == 2) {
				if (f.getServiceClass().getId() == ClassId.ANY_CLASS) {
					assert(f.getPrice().getCurrencies().get(0).getAmount() == 55.5F);
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

		
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares().getRouteFare().size() == 0);
		
		
	}
}
