package Gtm.converter.tests;

import org.junit.Before;
import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;

import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.Legacy108Station;
import Gtm.LegacySeries;
import Gtm.LegacyStationToServiceConstraintMapping;
import Gtm.ServiceConstraint;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.GtmUtils;

                     
public class Station2ServiceConstraintInViaConversionTest {
	
	
	GTMTool tool = null;
	
//	@Mock
	GtmUtils gtmUtilsMock;
	
//	@InjectMocks 
	ConverterFromLegacy converter2osdm;	
	
//	@InjectMocks 
	ConverterToLegacy converter2legacy;	

	@Before
	public void setUp() throws Exception {
		
//		MockitoAnnotations.initMocks(this);
				
		tool = LegacyDataFactory.createBasicData();
		
		tool.getConversionFromLegacy().getParams().setLegacyStationToServiceBrandMappings(GtmFactory.eINSTANCE.createLegacyStationToServiceConstraintMappings());
		LegacyStationToServiceConstraintMapping map = GtmFactory.eINSTANCE.createLegacyStationToServiceConstraintMapping();
		tool.getConversionFromLegacy().getParams().getLegacyStationToServiceBrandMappings().getLegacyStationToServiceBrandMappings().add(map);
		map.setCode(3);
		map.setDescription("test");
		
		tool.getGeneralTariffModel().getFareStructure().setServiceConstraints(GtmFactory.eINSTANCE.createServiceConstraints());
		ServiceConstraint sc = GtmFactory.eINSTANCE.createServiceConstraint();
		tool.getGeneralTariffModel().getFareStructure().getServiceConstraints().getServiceConstraints().add(sc);
		map.setServiceConstraint(sc);
		sc.setDescription(LegacyDataFactory.addText(tool, "by steampunk airship"));
		sc.setLegacy108Code(3);
		sc.getIncludedServiceBrands().add(tool.getCodeLists().getServiceBrands().getServiceBrands().get(0));
			
		//gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converter2osdm = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converter2osdm.initializeConverter();
		
		//convert
		converter2osdm.convertToGtmTest(new MockedProgressMonitor());
			
	}
	
	@Test 
	public void testFirstStationToServiceConstraintInViaConversion() {
		
		
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
		

		converter2legacy = new ConverterToLegacy(tool, null, new MockedEditingDomain());
			
		//convert
		converter2legacy.convertTest(new MockedProgressMonitor());
		
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacyStations() != null);
		
		assert(TestUtils.getLegacyStation(tool.getConversionFromLegacy().getLegacy108().getLegacyStations(), 1) != null);
				
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList() != null);
		
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries() != null);
									
	    LegacySeries s = TestUtils.getLegacySeries(tool,1);
		assert(s.getRouteDescription().equals("B*by steampunk airship*D*E*F"));
		assert(s.getFromStationName().equals("A-Town"));
				
		Legacy108Station st = TestUtils.getLegacyStation(tool.getConversionFromLegacy().getLegacy108().getLegacyStations(), 3);
		assert(st.getName().equals("by steampunk airship"));
	}
	

}
