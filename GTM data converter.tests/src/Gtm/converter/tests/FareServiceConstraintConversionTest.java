package Gtm.converter.tests;

import org.junit.Before;
import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;

import Gtm.FareTemplate;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.Legacy108FareDescription;
import Gtm.LegacySeries;
import Gtm.ServiceConstraint;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.GtmUtils;

                     
public class FareServiceConstraintConversionTest {
	
	
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
		
		tool.getConversionFromLegacy().getParams().setConvertServiceConstraints(true);
				
		tool.getGeneralTariffModel().getFareStructure().setServiceConstraints(GtmFactory.eINSTANCE.createServiceConstraints());
		ServiceConstraint sc = GtmFactory.eINSTANCE.createServiceConstraint();
		tool.getGeneralTariffModel().getFareStructure().getServiceConstraints().getServiceConstraints().add(sc);
	
		sc.setDescription(LegacyDataFactory.addText(tool, "by steampunk airship"));
		sc.setLegacy108Code(0);
		sc.getIncludedServiceBrands().add(tool.getCodeLists().getServiceBrands().getServiceBrands().get(0));
		
		for (FareTemplate ft : tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates()) {
			
			ft.setServiceConstraint(sc);
			
		}
		
		
			
		//gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converterFromLegacy = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converterFromLegacy.initializeConverter();
		
		//convert
		converterFromLegacy.convertToGtmTest(new MockedProgressMonitor());
			
	}
	
	@Test 
	public void testFareServiceConstraintConversion() {
		
		
		//validate basics	
		
		//one calendar
		assert(tool.getGeneralTariffModel().getFareStructure().getCalendars().getCalendars().size() == 1);
		
		//one regional constraint per series * 2
		assert(tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints().size()
				== tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries().size()
				* 2 //route and return route
		);


		//prepare for return conversion		
		TestUtils.resetLegacy(tool);
		
		
		tool.getGeneralTariffModel().setDelivery(GtmFactory.eINSTANCE.createDelivery());
		tool.getGeneralTariffModel().getDelivery().setProvider(TestUtils.findCarrier(tool, "9999"));
		

		converterToLegacy = new ConverterToLegacy(tool, null, new MockedEditingDomain());
			
		//convert
		converterToLegacy.convertTest(new MockedProgressMonitor());
		
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacyStations() != null);
		
		assert(TestUtils.getLegacyStation(tool.getConversionFromLegacy().getLegacy108().getLegacyStations(), 1) != null);
				
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList() != null);
		
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries() != null);
									
	    LegacySeries s = TestUtils.getLegacySeries(tool,1);
		assert(s.getRouteDescription().equals("B*C*D*E*F"));
		assert(s.getFromStationName().equals("A-Town"));
		
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacyFareDescriptions().getLegacyFares().get(0) != null);
		
		Legacy108FareDescription fd = tool.getConversionFromLegacy().getLegacy108().getLegacyFareDescriptions().getLegacyFares().get(0);
		
		assert(fd.getDescriptionLocal().equals("Standard,by steampunk airship"));
		assert(fd.getDescriptionGe().equals("by steampunk airshipde"));
		assert(fd.getDescriptionFr().equals("by steampunk airshipfr"));
		assert(fd.getDescriptionEn().equals("by steampunk airshipen"));
		
		
				
		
		
	}
	

}
