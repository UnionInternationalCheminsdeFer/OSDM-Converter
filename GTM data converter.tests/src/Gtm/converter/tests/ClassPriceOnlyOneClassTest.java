package Gtm.converter.tests;

import org.junit.Before;
import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;

import Gtm.ClassId;
import Gtm.FareElement;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.LegacySeries;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.GtmUtils;

                     
public class ClassPriceOnlyOneClassTest {
	
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
		
		for (LegacySeries s : tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
			
			if (s.getNumber() == 2) {
				s.setDistance1(0);
			}
			if (s.getNumber() == 3) {
				s.setDistance2(0);
			}
			
		}
		
		//gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converterFromLegacy = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converterFromLegacy.initializeConverter();
		
		//convert
		converterFromLegacy.convertToGtmTest(new MockedProgressMonitor());
			
	}
	
	@Test 
	public void testBasicConversion() {
		
		
		//validate fares
		
		for (FareElement f : tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements()) {
			
			if (f.getLegacyAccountingIdentifier().getSeriesId() == 2) {
				assert(f.getServiceClass().getId().equals(ClassId.D));
			}
			if (f.getLegacyAccountingIdentifier().getSeriesId() == 3) {
				assert(f.getServiceClass().getId().equals(ClassId.B));
			}
			
		}
		
		//prepare for return conversion		
		TestUtils.resetLegacy(tool);
		
		tool.getGeneralTariffModel().setDelivery(GtmFactory.eINSTANCE.createDelivery());
		tool.getGeneralTariffModel().getDelivery().setProvider(TestUtils.findCarrier(tool, "9999"));
		
		converterToLegacy = new ConverterToLegacy(tool, null, new MockedEditingDomain());
		
		//convert
		converterToLegacy.convertTest(new MockedProgressMonitor());
		
		//validate Series
		for (LegacySeries s : tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
			
			if (s.getNumber() == 2) {
				assert(s.getDistance1() == 0);
				assert(s.getDistance2() > 0);
			} else if (s.getNumber() == 3) {
				assert(s.getDistance1() > 0);
				assert(s.getDistance2() == 0);
			} else {
				assert(s.getDistance1() > 0);
				assert(s.getDistance2() > 0);
			}	
		}
	}
}
