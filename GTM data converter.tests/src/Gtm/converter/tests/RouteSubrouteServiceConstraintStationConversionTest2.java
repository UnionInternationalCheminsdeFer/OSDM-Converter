package Gtm.converter.tests;

import org.junit.Before;
import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;

import Gtm.CarrierConstraint;
import Gtm.FareElement;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.Legacy108Station;
import Gtm.LegacySeries;
import Gtm.RegionalConstraint;
import Gtm.RegionalValidity;
import Gtm.Route;
import Gtm.ServiceConstraint;
import Gtm.ViaStation;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.OsdmDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.GtmUtils;

                     
public class RouteSubrouteServiceConstraintStationConversionTest2 {
	
	
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
				
		tool = OsdmDataFactory.createBasicData();
		
		RegionalConstraint rc = addRegionalConstraintWithSubroute(tool, tool.getGeneralTariffModel().getFareStructure().getCarrierConstraints().getCarrierConstraints().get(0), tool.getGeneralTariffModel().getFareStructure().getServiceConstraints().getServiceConstraints().get(0));
		tool.getGeneralTariffModel().getFareStructure().setRegionalConstraints(GtmFactory.eINSTANCE.createRegionalConstraints());
		tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints().add(rc);
		
		for (FareElement f : tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements()) {
			f.setRegionalConstraint(rc);
		}
		
		
		//gtmUtilsMock = Mockito.mock(GtmUtils.class);				
	
			
	}
	
	private static RegionalConstraint addRegionalConstraintWithSubroute(GTMTool tool, CarrierConstraint cc, ServiceConstraint sc) {
		
		RegionalConstraint rc = GtmFactory.eINSTANCE.createRegionalConstraint(); 
		RegionalValidity rv = GtmFactory.eINSTANCE.createRegionalValidity();
		ViaStation main = GtmFactory.eINSTANCE.createViaStation();
		
		main.setCarrierConstraint(cc);

		ViaStation v1 = GtmFactory.eINSTANCE.createViaStation();
		Route subroute = GtmFactory.eINSTANCE.createRoute();
		v1.setRoute(subroute);
		v1.setServiceConstraint(sc);
		
		ViaStation v2 = GtmFactory.eINSTANCE.createViaStation();
		v2.setStation(tool.getCodeLists().getStations().getStations().get(0));
		subroute.getStations().add(v2);
		
		ViaStation v3 = GtmFactory.eINSTANCE.createViaStation();
		v3.setStation(tool.getCodeLists().getStations().getStations().get(1));
		subroute.getStations().add(v3);
		
		
		
		
		ViaStation v4 = GtmFactory.eINSTANCE.createViaStation();
		v4.setStation(tool.getCodeLists().getStations().getStations().get(2));
						
		ViaStation v5 = GtmFactory.eINSTANCE.createViaStation();
		v5.setStation(tool.getCodeLists().getStations().getStations().get(3));
	

		
		Route mainroute = GtmFactory.eINSTANCE.createRoute();
		mainroute.getStations().add(v1);
		mainroute.getStations().add(v4);
		mainroute.getStations().add(v5);
		main.setRoute(mainroute);
		
		rv.setViaStation(main);
		
		
		rc.getRegionalValidity().add(rv);
		
		tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints().add(rc);
		return rc;
	}
	
	@Test 
	public void testFareServiceConstraintConversion() {
		
		
		//validate basics	
		

		//prepare for return conversion		
		TestUtils.resetLegacy(tool);
			
		tool.getGeneralTariffModel().setDelivery(GtmFactory.eINSTANCE.createDelivery());
		tool.getGeneralTariffModel().getDelivery().setProvider(tool.getCodeLists().getCarriers().getCarriers().get(0));
		

		converter2legacy = new ConverterToLegacy(tool, null, new MockedEditingDomain());
			
		//convert
		converter2legacy.convertTest(new MockedProgressMonitor());
		
		assert(tool.getConversionFromLegacy().getLegacy108().getCarrier().getCode().equals("9999"));
		
		LegacySeries ls = tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries().get(0);
		
		assert (ls != null);

		assert (ls.getRouteDescription().equals("ship*B-T*C-T"));
		
		assert(tool.getConversionFromLegacy().getLegacy108().getLegacyStations() != null);
		
		assert (ls.getFromStation() == 1);
		
		assert (ls.getToStation() == 4);
		
		assert (ls.getViastations() != null);
		
		assert(ls.getViastations().size() == 3);
		
		assert(ls.getViastations().get(0).getCode() == tool.getGeneralTariffModel().getFareStructure().getServiceConstraints().getServiceConstraints().get(0).getLegacy108Code());
			
		assert(ls.getViastations().get(1).getCode() == 2);
		
		assert(ls.getViastations().get(2).getCode() == 3);
		
		boolean serviceConstraintStationNameProvided = false;
		
		for ( Legacy108Station sn : tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations()) {
			
			if (sn.getStationCode() ==  tool.getGeneralTariffModel().getFareStructure().getServiceConstraints().getServiceConstraints().get(0).getLegacy108Code()) {
				serviceConstraintStationNameProvided = true;
			}
			
		}
		
		assert(serviceConstraintStationNameProvided);
		
		
		
		
	}
	

}
