package Gtm.converter.tests;

import org.junit.Before;
import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;

import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.LegacyRouteFare;
import Gtm.LegacySeries;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.GtmUtils;

                     
public class ClassPriceMergeTest {
	
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
			
		//gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converterFromLegacy = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converterFromLegacy.initializeConverter();
		
		//convert
		converterFromLegacy.convertToGtmTest(new MockedProgressMonitor());
			
	}
	
	@Test 
	public void testBasicConversion() {
		
			
		//prepare for return conversion		
		TestUtils.resetLegacy(tool);
		
		
		tool.getGeneralTariffModel().setDelivery(GtmFactory.eINSTANCE.createDelivery());
		tool.getGeneralTariffModel().getDelivery().setProvider(TestUtils.findCarrier(tool, "9999"));
		
		converterToLegacy = new ConverterToLegacy(tool, null, new MockedEditingDomain());
		
		//convert
		converterToLegacy.convertTest(new MockedProgressMonitor());
		
		
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares().getRouteFare().size() == 6);
		
		int fareTable = 0;
		
		for (LegacyRouteFare f : tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares().getRouteFare()) {
			
			assert(f.getFare1st() == 100);
			assert(f.getFare2nd() == 50);
			assert(f.getReturnFare1st() == 200);
			assert(f.getReturnFare2nd() == 100);
			
			fareTable = f.getFareTableNumber();
			
		}
		
		for (LegacySeries s : tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
			
			assert(TestUtils.findLegacyRouteFare(tool, fareTable, s.getNumber()) != null);
			
		}

	}
}
