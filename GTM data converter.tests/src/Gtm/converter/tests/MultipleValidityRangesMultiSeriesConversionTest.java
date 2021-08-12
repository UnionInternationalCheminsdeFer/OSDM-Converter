package Gtm.converter.tests;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import Gtm.DataSource;
import Gtm.FareConstraintBundle;
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

                     
public class MultipleValidityRangesMultiSeriesConversionTest {
	
	
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
		
		for (LegacySeries ls : tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
			if (ls.getNumber() == 1) {
				ls.setFareTableNumber(2);
				LegacyDataFactory.addRouteFare(tool,"20190101", "20980101", 80, 40, 2, ls.getNumber());
			} else {
				LegacyDataFactory.addRouteFare(tool,"20190101", "20990101", 100, 50, 1, ls.getNumber());
			}
		}
		
			
		gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converterFromLegacy = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converterFromLegacy.initializeConverter();
		
		//convert
		converterFromLegacy.convertToGtmTest(new MockedProgressMonitor());
			
	}
	
	@Test 
	public void testMultipleValidityRangesConversion() {
		
		
		//two sales availabilities	
		assert(tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints().getSalesAvailabilityConstraints().size() == 2);
		
		//two calendar
		assert(tool.getGeneralTariffModel().getFareStructure().getCalendars().getCalendars().size() == 2);
		
		//prepare for return conversion		
		TestUtils.resetLegacy(tool);
		HashSet<FareConstraintBundle> bundels = new HashSet<FareConstraintBundle>();
		for (FareConstraintBundle b : tool.getGeneralTariffModel().getFareStructure().getFareConstraintBundles().getFareConstraintBundles()) {
			if (DataSource.CONVERTED.equals(b.getDataSource())) {
				bundels.add(b);
			}
		}
		tool.getGeneralTariffModel().getFareStructure().setFareConstraintBundles(GtmFactory.eINSTANCE.createFareConstraintBundles());;
		tool.getGeneralTariffModel().getFareStructure().getFareConstraintBundles().getFareConstraintBundles().addAll(bundels);
		
	
		
		tool.getGeneralTariffModel().setDelivery(GtmFactory.eINSTANCE.createDelivery());
		tool.getGeneralTariffModel().getDelivery().setProvider(TestUtils.findCarrier(tool, "9999"));
		
		converterToLegacy = new ConverterToLegacy(tool, null, new MockedEditingDomain());
			
		//convert
		converterToLegacy.convertTest(new MockedProgressMonitor());
			
		//only one fare table		
		for (LegacySeries s : tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
		
			if (s.getNumber() == 1) {
				LegacyRouteFare rf = TestUtils.findLegacyRouteFare(tool, TestUtils.getDate("20190101"), s.getFareTableNumber(), s.getNumber());
				assert(rf.getFare1st() == 80);
				assert(rf.getFare2nd() == 40);
				assert(TestUtils.getDateString(rf.getValidFrom()).equals("20190101"));
				assert(TestUtils.getDateString(rf.getValidUntil()).equals("20980101"));				
			} else {	
				LegacyRouteFare rf = TestUtils.findLegacyRouteFare(tool,s.getFareTableNumber(), s.getNumber());
				assert(rf.getFare1st() == 100);
				assert(rf.getFare2nd() == 50);
				assert(TestUtils.getDateString(rf.getValidFrom()).equals("20190101"));
				assert(TestUtils.getDateString(rf.getValidUntil()).equals("20990101"));
			}
		}
		
	}

	
	

}
