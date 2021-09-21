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

                     
public class DistanceFarePartialFirstClassConversionTest {
	
	
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
		
		for (LegacySeries ls : tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
			ls.setDistance2(ls.getDistance1() * 3);
		}
		
		gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converterFromLegacy = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converterFromLegacy.initializeConverter();
		
		//convert
		converterFromLegacy.convertToGtmTest(new MockedProgressMonitor());
			
	}
	
	@Test 
	public void testDistanceFareConversion() {
		
		
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
		assert(s.getDistance1() == 6);
		assert(s.getDistance2() == 6);
		assert(s.getPricetype().equals(LegacyCalculationType.ROUTE_BASED));
		assert(f.getFare1st() == 12);
		assert(f.getFare2nd() == 8);
		assert(f.getReturnFare1st() == 24);
		assert(f.getReturnFare2nd() == 16);
		
		s = TestUtils.getLegacySeries(tool, 2);
		f = TestUtils.findLegacyRouteFare(tool, s.getFareTableNumber(), s.getNumber());
		assert(s.getDistance1() == 30);
		assert(s.getDistance2() == 30);
		assert(s.getPricetype().equals(LegacyCalculationType.ROUTE_BASED));
		assert(f.getFare1st() == 32);
		assert(f.getFare2nd() == 24);
		assert(f.getReturnFare1st() == 64);
		assert(f.getReturnFare2nd() == 48);
		
		s = TestUtils.getLegacySeries(tool, 3);
		f = TestUtils.findLegacyRouteFare(tool, s.getFareTableNumber(), s.getNumber());
		assert(s.getDistance1() == 66);
		assert(s.getDistance2() == 66);
		assert(s.getPricetype().equals(LegacyCalculationType.ROUTE_BASED));
		assert(f.getFare1st() == 76);
		assert(f.getFare2nd() == 56);
		assert(f.getReturnFare1st() == 152);
		assert(f.getReturnFare2nd() == 112);
		
		s = TestUtils.getLegacySeries(tool, 4);
		f = TestUtils.findLegacyRouteFare(tool, s.getFareTableNumber(), s.getNumber());
		assert(s.getDistance1() == 72);
		assert(s.getDistance2() == 72);
		assert(s.getPricetype().equals(LegacyCalculationType.ROUTE_BASED));
		assert(f.getFare1st() == 80);
		assert(f.getFare2nd() == 60);
		assert(f.getReturnFare1st() == 160);
		assert(f.getReturnFare2nd() == 120);
		
		//distance too long, no price found
		s = TestUtils.getLegacySeries(tool, 5);
		assert (s == null); 
		
		s = TestUtils.getLegacySeries(tool, 6);
		assert( s == null);
		

	}

	
	

}
