package Gtm.converter.tests;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.LegacyCalculationType;
import Gtm.LegacyRouteFare;
import Gtm.LegacySeries;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.GtmUtils;

                     
public class FareStationSetConversionTest {
	
	
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
				
		tool = LegacyDataFactory.createBasicDistanceFareData();
		
		gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converterFromLegacy = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converterFromLegacy.initializeConverter();
		
		//convert
		converterFromLegacy.convertToGtmTest(new MockedProgressMonitor());
			
	}
	
	@Test 
	public void testBasicConversion() {
		
		
		//validate fare station sets
		assert(tool.getGeneralTariffModel().getFareStructure().getFareStationSetDefinitions() != null);
		
		assert(tool.getGeneralTariffModel().getFareStructure().getFareStationSetDefinitions().getFareStationSetDefinitions().size() == 2);		
		
		//prepare for return conversion		
		TestUtils.resetLegacy(tool);
		
		
		tool.getGeneralTariffModel().setDelivery(GtmFactory.eINSTANCE.createDelivery());
		tool.getGeneralTariffModel().getDelivery().setProvider(TestUtils.findCarrier(tool, "9999"));
		
	
		converterToLegacy = new ConverterToLegacy(tool, null, new MockedEditingDomain());
			
		//convert
		converterToLegacy.convertTest(new MockedProgressMonitor());
		
		LegacySeries s = TestUtils.getLegacySeries(tool, 1);
		LegacyRouteFare f = TestUtils.findLegacyRouteFare(tool, s.getFareTableNumber(), s.getNumber());
		assert(s.getDistance1() == 2);
		assert(s.getDistance2() == 2);
		assert(s.getPricetype().equals(LegacyCalculationType.ROUTE_BASED));
		assert(f.getFare1st() == 8);
		assert(f.getFare2nd() == 4);
		assert(f.getReturnFare1st() == 16);
		assert(f.getReturnFare2nd() == 8);
		
		s = TestUtils.getLegacySeries(tool, 2);
		f = TestUtils.findLegacyRouteFare(tool, s.getFareTableNumber(), s.getNumber());
		assert(s.getDistance1() == 10);
		assert(s.getDistance2() == 10);
		assert(s.getPricetype().equals(LegacyCalculationType.ROUTE_BASED));
		assert(f.getFare1st() == 16);
		assert(f.getFare2nd() == 8);
		assert(f.getReturnFare1st() == 32);
		assert(f.getReturnFare2nd() == 16);
		
		s = TestUtils.getLegacySeries(tool, 3);
		f = TestUtils.findLegacyRouteFare(tool, s.getFareTableNumber(), s.getNumber());
		assert(s.getDistance1() == 22);
		assert(s.getDistance2() == 22);
		assert(s.getPricetype().equals(LegacyCalculationType.ROUTE_BASED));
		assert(f.getFare1st() == 40);
		assert(f.getFare2nd() == 20);
		assert(f.getReturnFare1st() == 80);
		assert(f.getReturnFare2nd() == 40);
		
		s = TestUtils.getLegacySeries(tool, 4);
		f = TestUtils.findLegacyRouteFare(tool, s.getFareTableNumber(), s.getNumber());
		assert(s.getDistance1() == 24);
		assert(s.getDistance2() == 24);
		assert(s.getPricetype().equals(LegacyCalculationType.ROUTE_BASED));
		assert(f.getFare1st() == 40);
		assert(f.getFare2nd() == 20);
		assert(f.getReturnFare1st() == 80);
		assert(f.getReturnFare2nd() == 40);
		
		s = TestUtils.getLegacySeries(tool, 5);
		f = TestUtils.findLegacyRouteFare(tool, s.getFareTableNumber(), s.getNumber());
		assert(s.getDistance1() == 45);
		assert(s.getDistance2() == 45);
		assert(s.getPricetype().equals(LegacyCalculationType.ROUTE_BASED));
		assert(f.getFare1st() == 72);
		assert(f.getFare2nd() == 36);
		assert(f.getReturnFare1st() == 144);
		assert(f.getReturnFare2nd() == 72);
		
		s = TestUtils.getLegacySeries(tool, 6);
		assert( s == null); // distance too big

	}

	
	

}
