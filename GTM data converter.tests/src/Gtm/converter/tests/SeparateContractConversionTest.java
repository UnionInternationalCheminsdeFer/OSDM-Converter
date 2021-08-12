package Gtm.converter.tests;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import Gtm.FulfillmentConstraint;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.Legacy108Station;
import Gtm.LegacySeparateContractSeries;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.GtmUtils;
import Gtm.FareConstraintBundle;
import Gtm.FareTemplate;

                     
public class SeparateContractConversionTest {
	
	
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
		
		tool.getConversionFromLegacy().getLegacy108().setLegacySeparateContractSeries(GtmFactory.eINSTANCE.createLegacySeparateContractSeriesList());
		LegacySeparateContractSeries s = GtmFactory.eINSTANCE.createLegacySeparateContractSeries();
		s.setSeriesNumber(1);
		tool.getConversionFromLegacy().getLegacy108().getLegacySeparateContractSeries().getSeparateContractSeries().add(s);
		
		FareConstraintBundle bundle1 = tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates().get(0).getFareConstraintBundle();
		FareConstraintBundle bundle2 = TestUtils.clone(bundle1);
		for (FareTemplate template : tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates()) {
			template.setSeparateContractFareConstraintBundle(bundle2);
		}
		FulfillmentConstraint fc = GtmFactory.eINSTANCE.createFulfillmentConstraint();
		bundle2.setFulfillmentConstraint(fc);
		tool.getGeneralTariffModel().getFareStructure().getFareConstraintBundles().getFareConstraintBundles().add(bundle2);
		fc.setSeparateFulFillmentRequired(true);
		tool.getGeneralTariffModel().getFareStructure().setFulfillmentConstraints(GtmFactory.eINSTANCE.createFulfillmentConstraints());
		tool.getGeneralTariffModel().getFareStructure().getFulfillmentConstraints().getFulfillmentConstraints().add(fc);
			
		gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converterFromLegacy = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converterFromLegacy.initializeConverter();
		
		//convert
		converterFromLegacy.convertToGtmTest(new MockedProgressMonitor());
			
	}
	
	@Test 
	public void testSeparateContractConversion() {
		
		
		//validate basics	
		
		//one calendar
		assert(tool.getGeneralTariffModel().getFareStructure().getCalendars().getCalendars().size() == 1);
			
		// number of prices
		assert(tool.getGeneralTariffModel().getFareStructure().getPrices().getPrices().size() == 2);
		
		// number of fare station sets
		HashSet<Integer> fareStations = new HashSet<Integer>();
		for (Legacy108Station s : tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations())	{
			if (s.getFareReferenceStationCode() > 0) {
				fareStations.add(s.getFareReferenceStationCode());
			}
		}
		assert(tool.getGeneralTariffModel().getFareStructure().getFareStationSetDefinitions().getFareStationSetDefinitions().size() == fareStations.size());

		//prepare for return conversion		
		TestUtils.resetLegacy(tool);
		
		
		tool.getGeneralTariffModel().setDelivery(GtmFactory.eINSTANCE.createDelivery());
		tool.getGeneralTariffModel().getDelivery().setProvider(TestUtils.findCarrier(tool, "9999"));
		

		converterToLegacy = new ConverterToLegacy(tool, null, new MockedEditingDomain());
			
		//convert
		converterToLegacy.convertTest(new MockedProgressMonitor());
		
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacySeparateContractSeries() != null);
		
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacySeparateContractSeries().getSeparateContractSeries().size() == 1);
		
		LegacySeparateContractSeries scs = tool.getConversionFromLegacy().getLegacy108().getLegacySeparateContractSeries().getSeparateContractSeries().get(0);
		
		assert(scs.getSeriesNumber() == 1);
		
		assert(TestUtils.checkDateOnlyEqual(scs.getValidFrom(),TestUtils.getFromDate()));
		assert(TestUtils.checkDateOnlyEqual(scs.getValidUntil(),TestUtils.getUntilDate()));


		
	}

	
	

}