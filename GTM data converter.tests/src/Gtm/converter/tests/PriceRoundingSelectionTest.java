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
import Gtm.LegacyConversionType;
import Gtm.LegacyRouteFare;
import Gtm.RoundingType;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.GtmUtils;

                     
public class PriceRoundingSelectionTest {
	
	GTMTool tool = null;
	
	//@Mock
	GtmUtils gtmUtilsMock;
	
	//@InjectMocks 
	ConverterFromLegacy converterFromLegacy;	
	
	//@InjectMocks 
	ConverterToLegacy converterToLegacy;	
	
	int expectedFares = 0;
	
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
		tool.getConversionFromLegacy().getParams().setLegacyFareTemplates(GtmFactory.eINSTANCE.createLegacyFareTemplates());;
		tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates().add(t1);
		tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates().add(t2);
		
		cloneWithRounding(t1,t2,2,RoundingType.DOWN10CENT );
		cloneWithRounding(t1,t2,3,RoundingType.DOWN20CENT );
		cloneWithRounding(t1,t2,4,RoundingType.DOWN2CENT );
		cloneWithRounding(t1,t2,5,RoundingType.DOWN5CENT );
		cloneWithRounding(t1,t2,6,RoundingType.DOWN );
		cloneWithRounding(t1,t2,7,RoundingType.HALFDOWN );
		cloneWithRounding(t1,t2,8,RoundingType.HALFDOWN10 );
		cloneWithRounding(t1,t2,9,RoundingType.HALFEVEN );
		cloneWithRounding(t1,t2,10,RoundingType.HALFEVEN10 );
		cloneWithRounding(t1,t2,11,RoundingType.HALFUP );
		cloneWithRounding(t1,t2,12,RoundingType.HALFUP10 );
		cloneWithRounding(t1,t2,13,RoundingType.UP );
		cloneWithRounding(t1,t2,14,RoundingType.UP10CENT);
		cloneWithRounding(t1,t2,15,RoundingType.UP20CENT );
		cloneWithRounding(t1,t2,16,RoundingType.UP5CENT );
		cloneWithRounding(t1,t2,17,RoundingType.UP2CENT);
	
		
		expectedFares = tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates().size() * 2;
		
		//gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converterFromLegacy = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converterFromLegacy.initializeConverter();
		
		//convert
		converterFromLegacy.convertToGtmTest(new MockedProgressMonitor());
			
	}
	
	private void cloneWithRounding(FareTemplate t1, FareTemplate t2, int tariffId, RoundingType rounding) {
		FareTemplate t1c = TestUtils.clone(t1);
		FareTemplate t2c = TestUtils.clone(t2);
		t1c.setRoundingMode(rounding);
		t2c.setRoundingMode(rounding);
		t1c.setLegacyAccountingTariffId(tariffId);
		t2c.setLegacyAccountingTariffId(tariffId);
		t1c.setLegacyConversion(LegacyConversionType.NO);
		t2c.setLegacyConversion(LegacyConversionType.NO);
		tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates().add(t1c);
		tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates().add(t2c);
	}

	@Test 
	public void testPriceRoundingSelection() {
		
		//validate fares
		
		assert(tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements().size() == expectedFares);
		
		for (FareElement f : tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements()) {
			
			assert(f.getLegacyAccountingIdentifier().getTariffId() > 0);
			
			if (f.getServiceClass().getId() == ClassId.B) {
				assert(f.getPrice().getCurrencies().get(0).getAmount() > 0F);
			} else if(f.getServiceClass().getId() == ClassId.D) {
				assert(f.getPrice().getCurrencies().get(0).getAmount() > 0F);
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
