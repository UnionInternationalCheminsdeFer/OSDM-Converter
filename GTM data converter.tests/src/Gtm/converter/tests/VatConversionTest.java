package Gtm.converter.tests;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import Gtm.ClassId;
import Gtm.CurrencyPrice;
import Gtm.FareElement;
import Gtm.FareTemplate;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.LegacyConversionType;
import Gtm.LegacyRouteFare;
import Gtm.TaxScope;
import Gtm.VATDetail;
import Gtm.VatTemplate;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.GtmUtils;

                     
public class VatConversionTest {
	
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
		
		tool.getConversionFromLegacy().getLegacy108().setLegacyRouteFares(GtmFactory.eINSTANCE.createLegacyRouteFares());
		tool.getConversionFromLegacy().getLegacy108().setLegacySeriesList(GtmFactory.eINSTANCE.createLegacySeriesList());
		LegacyDataFactory.addRouteBasedSeries(tool, 1, 100, 1, 7);		
		LegacyDataFactory.addRouteFare(tool, "20190101", "20990101", 10000, 5000, 1, 1);	

		tool.getConversionFromLegacy().getParams().setVatTemplates(GtmFactory.eINSTANCE.createVatTemplates());
		VatTemplate vat = GtmFactory.eINSTANCE.createVatTemplate();
		vat.setCountry(TestUtils.findCountry(tool,99));
		vat.setPercentage(0.07F);
		vat.setScope(TaxScope.NATIONAL);
		vat.setTaxId("MyTaxId");
		tool.getConversionFromLegacy().getParams().getVatTemplates().getVatTemplates().add(vat);
		
		VatTemplate vat2 = GtmFactory.eINSTANCE.createVatTemplate();
		vat2.setCountry(TestUtils.findCountry(tool,99));
		vat2.setPercentage(0.14F);
		vat2.setScope(TaxScope.INTERNATIONAL);
		vat2.setTaxId("MyTaxId");
		tool.getConversionFromLegacy().getParams().getVatTemplates().getVatTemplates().add(vat2);
		
		
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
		t1r1.setLegacyConversion(LegacyConversionType.NO);
		t1r2.setLegacyConversion(LegacyConversionType.NO);
		t1r1.setLegacyAccountingTariffId(2);
		t1r2.setLegacyAccountingTariffId(2);
		
		FareTemplate t2r1 = TestUtils.clone(t1);
		FareTemplate t2r2 = TestUtils.clone(t2);
		t2r1.setPriceFactor(0.3F);
		t2r2.setPriceFactor(0.3F);
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
		
		
		
		
		gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converterFromLegacy = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converterFromLegacy.initializeConverter();
		
		//convert
		converterFromLegacy.convertToGtmTest(new MockedProgressMonitor());
			
	}
	
	@Test 
	public void testVatConversion() {
		
		//validate fares
		
		assert(tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements().size() == 12);
		
		for (FareElement f : tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements()) {
			
			assert(f.getPrice() != null);
			
			assert(f.getPrice().getCurrencies() != null);
			
			assert  (f.getPrice().getCurrencies().size() == 1);
			
			CurrencyPrice p = f.getPrice().getCurrencies().get(0);
			
			assert(p.getCurrency().getIsoCode().equals("EUR"));
			
			assert(p.getVATdetails() != null);
			
			assert(p.getVATdetails().size() == 2);
			
			int checked = 0;
			
			for (VATDetail vd : p.getVATdetails()) {
				
				assert(vd.getCountry().getCode() == 99);
				
				assert(vd.getTaxId().equals("MyTaxId"));
				
				if (vd.getScope().equals(TaxScope.INTERNATIONAL)) {
					checked++;
					assert(vd.getPercentage() == 0.14F);
				} else if (vd.getScope().equals(TaxScope.NATIONAL)) {
					checked++;
					assert(vd.getPercentage() == 0.07F);
				}
				
			}
			
			assert (checked == 2);
			
			
			if (f.getLegacyAccountingIdentifier().getTariffId() == 1) {
				if (f.getServiceClass().getId() == ClassId.B) {
					for (VATDetail vd : p.getVATdetails()) {						
						if (vd.getScope().equals(TaxScope.INTERNATIONAL)) {
							assert(vd.getAmount() == 0.15F);
						} else if (vd.getScope().equals(TaxScope.NATIONAL)) {
							assert(vd.getAmount() == 0.08F);
						}
					}
				} else if(f.getServiceClass().getId() == ClassId.D) {
					for (VATDetail vd : p.getVATdetails()) {						
						if (vd.getScope().equals(TaxScope.INTERNATIONAL)) {
							assert(vd.getAmount() == 0.08F);
						} else if (vd.getScope().equals(TaxScope.NATIONAL)) {
							assert(vd.getAmount() == 0.04F);
						}
					}
				} 		
			}
			
			if (f.getLegacyAccountingIdentifier().getTariffId() == 2) {
				if (f.getServiceClass().getId() == ClassId.B) {
					for (VATDetail vd : p.getVATdetails()) {						
						if (vd.getScope().equals(TaxScope.INTERNATIONAL)) {
							assert(vd.getAmount() == 0.08F);
						} else if (vd.getScope().equals(TaxScope.NATIONAL)) {
							assert(vd.getAmount() == 0.04F);
						}
					}
				} else if(f.getServiceClass().getId() == ClassId.D) {
					for (VATDetail vd : p.getVATdetails()) {						
						if (vd.getScope().equals(TaxScope.INTERNATIONAL)) {
							assert(vd.getAmount() == 0.04F);
						} else if (vd.getScope().equals(TaxScope.NATIONAL)) {
							assert(vd.getAmount() == 0.02F);
						}
					}
				} 		
			}
			if (f.getLegacyAccountingIdentifier().getTariffId() == 3) {
				if (f.getServiceClass().getId() == ClassId.B) {
					for (VATDetail vd : p.getVATdetails()) {						
						if (vd.getScope().equals(TaxScope.INTERNATIONAL)) {
							assert(vd.getAmount() == 0.05F);
						} else if (vd.getScope().equals(TaxScope.NATIONAL)) {
							assert(vd.getAmount() == 0.03F);
						}
					}
				} else if(f.getServiceClass().getId() == ClassId.D) {
					for (VATDetail vd : p.getVATdetails()) {						
						if (vd.getScope().equals(TaxScope.INTERNATIONAL)) {
							assert(vd.getAmount() == 0.03F);
						} else if (vd.getScope().equals(TaxScope.NATIONAL)) {
							assert(vd.getAmount() == 0.02F);
						}
					}
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
