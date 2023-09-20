package Gtm.converter.tests;

import org.junit.Before;
import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;

import Gtm.FareElement;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.LegacySeries;
import Gtm.ServiceBrand;
import Gtm.ServiceConstraint;
import Gtm.TransportMode;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.GtmUtils;

                     
public class Bus2ServiceConstraintConversionTest {
	
	
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
		
		tool.getCodeLists().setServiceBrands(GtmFactory.eINSTANCE.createServiceBrands());
		
		ServiceBrand bus = GtmFactory.eINSTANCE.createServiceBrand();
		bus.setTransportMode(TransportMode.BUS);
		ServiceBrand ship = GtmFactory.eINSTANCE.createServiceBrand();
		ship.setTransportMode(TransportMode.SHIP);
		tool.getCodeLists().getServiceBrands().getServiceBrands().add(bus);
		tool.getCodeLists().getServiceBrands().getServiceBrands().add(ship);
		
		LegacySeries ls = TestUtils.findLegacySeries(tool, 1);
		ls.setBusCode("B");
		ls.setFerryCode("S");

		LegacySeries ls2 = TestUtils.findLegacySeries(tool, 2);
		ls2.setBusCode("B");

		LegacySeries ls3 = TestUtils.findLegacySeries(tool, 3);
		ls3.setFerryCode("S");

		
		tool.getConversionFromLegacy().getParams().setBusFerryMapping(GtmFactory.eINSTANCE.createLegacyBusFerryMapping());

		ServiceConstraint scbf = GtmFactory.eINSTANCE.createServiceConstraint();
		tool.getConversionFromLegacy().getParams().getBusFerryMapping().setBusFerryConstraint(scbf);		
		tool.getGeneralTariffModel().getFareStructure().getServiceConstraints().getServiceConstraints().add(scbf);
		scbf.getIncludedServiceBrands().add(bus);
		scbf.getIncludedServiceBrands().add(ship);	

		ServiceConstraint scb = GtmFactory.eINSTANCE.createServiceConstraint();
		tool.getGeneralTariffModel().getFareStructure().getServiceConstraints().getServiceConstraints().add(scb);
		tool.getConversionFromLegacy().getParams().getBusFerryMapping().setBusServiceConstraint(scb);		
		scb.getIncludedServiceBrands().add(bus);

		ServiceConstraint scf = GtmFactory.eINSTANCE.createServiceConstraint();
		tool.getGeneralTariffModel().getFareStructure().getServiceConstraints().getServiceConstraints().add(scf);
		tool.getConversionFromLegacy().getParams().getBusFerryMapping().setFerryConstraint(scf);		
		scf.getIncludedServiceBrands().add(ship);

		
		//gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converterFromLegacy = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converterFromLegacy.initializeConverter();
		
		//convert
		converterFromLegacy.convertToGtmTest(new MockedProgressMonitor());
			
	}
	
	@Test 
	public void testBusFerryFlagConversion() {
		
		
		//validate basics	
		
		assert(tool.getGeneralTariffModel().getFareStructure().getServiceConstraints().getServiceConstraints().size() == 3);
				
		for (FareElement f : tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements()) {
			
			if (f.getLegacyAccountingIdentifier().getSeriesId() == 1) {
				assert(f.getServiceConstraint() != null);		
				assert(f.getServiceConstraint().getIncludedServiceBrands().size() == 2);
			} else if (f.getLegacyAccountingIdentifier().getSeriesId() == 2) {
				assert(f.getServiceConstraint() != null);		
				assert(f.getServiceConstraint().getIncludedServiceBrands().size() == 1);
				assert(f.getServiceConstraint().getIncludedServiceBrands().get(0).getTransportMode().equals(TransportMode.BUS));
			} else if (f.getLegacyAccountingIdentifier().getSeriesId() == 3) {
				assert(f.getServiceConstraint() != null);		
				assert(f.getServiceConstraint().getIncludedServiceBrands().size() == 1);
				assert(f.getServiceConstraint().getIncludedServiceBrands().get(0).getTransportMode().equals(TransportMode.SHIP));
			} else {
				assert(f.getServiceConstraint() == null);	
			}
			
		}
		
		
		//prepare for return conversion		
		TestUtils.resetLegacy(tool);
		
		
		tool.getGeneralTariffModel().setDelivery(GtmFactory.eINSTANCE.createDelivery());
		tool.getGeneralTariffModel().getDelivery().setProvider(TestUtils.findCarrier(tool, "9999"));
		

		converterToLegacy = new ConverterToLegacy(tool, null, new MockedEditingDomain());
			
		//convert
		converterToLegacy.convertTest(new MockedProgressMonitor());
				
	    LegacySeries s = TestUtils.getLegacySeries(tool,1);
		assert(s.getBusCode().equals("B"));
		assert(s.getFerryCode().equals("S"));
		
	    s = TestUtils.getLegacySeries(tool,2);
		assert(s.getBusCode().equals("B"));
	
	    s = TestUtils.getLegacySeries(tool,3);
		assert(s.getFerryCode().equals("S"));
		
	    s = TestUtils.getLegacySeries(tool,4);
		assert(s.getBusCode() == null);
		
	    s = TestUtils.getLegacySeries(tool,5);
		assert(s.getBusCode() == null);
	}

	
	

}
