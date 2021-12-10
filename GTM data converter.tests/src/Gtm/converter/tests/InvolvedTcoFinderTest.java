package Gtm.converter.tests;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import Gtm.Carrier;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.RegionalConstraint;
import Gtm.RegionalValidity;
import Gtm.ViaStation;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.utils.InvolvedTcoFinder;

public class InvolvedTcoFinderTest {
	
	GTMTool tool = null;
	
	
	@Before 
	public void initialize() {
		
				
		tool = LegacyDataFactory.createBasicData();	
		
				

			
	}
	

	
	@Test 
	public void testFindTcosFromRoute() {		
		
		RegionalConstraint r = createRegionalConstraintWithRoute();
		
		Set<Carrier> carriers = InvolvedTcoFinder.getInvolvedCarriers(r);
		
		assert(carriers != null);
		assert(!carriers.isEmpty());
		assert(carriers.contains(TestUtils.findCarrier(tool, "9999")));
		assert(carriers.contains(TestUtils.findCarrier(tool, "9997")));
		assert(carriers.contains(TestUtils.findCarrier(tool, "9995")));

	}
	

	
	@Test 
	public void testAddTcosFromAltRoute() {		
		
		RegionalConstraint r = createRegionalConstraintWithAlteernativeRoutes();
			
		Set<Carrier> carriers = InvolvedTcoFinder.getInvolvedCarriers(r);
		
		assert(carriers != null);
		assert(!carriers.isEmpty());
		assert(carriers.contains(TestUtils.findCarrier(tool, "9999")));
		assert(carriers.contains(TestUtils.findCarrier(tool, "9997")));
		assert(carriers.contains(TestUtils.findCarrier(tool, "9995")));

	}
		
	private RegionalConstraint createRegionalConstraintWithRoute() {
		
		RegionalConstraint r = GtmFactory.eINSTANCE.createRegionalConstraint();
		RegionalValidity rv = GtmFactory.eINSTANCE.createRegionalValidity();
		r.getRegionalValidity().add(rv);
		
		rv.setCarrierConstraint(GtmFactory.eINSTANCE.createCarrierConstraint());
		rv.getCarrierConstraint().getIncludedCarriers().add(TestUtils.findCarrier(tool, "9999"));
		
		ViaStation v = 	GtmFactory.eINSTANCE.createViaStation();	
		rv.setViaStation(v);
		
		v.setCarrierConstraint(GtmFactory.eINSTANCE.createCarrierConstraint());
		v.getCarrierConstraint().getIncludedCarriers().add(TestUtils.findCarrier(tool, "9997"));
		
		v.setRoute(GtmFactory.eINSTANCE.createRoute());
		v.getRoute().getStations().add(GtmFactory.eINSTANCE.createViaStation());
		v.getRoute().getStations().add(GtmFactory.eINSTANCE.createViaStation());
		v.getRoute().getStations().add(GtmFactory.eINSTANCE.createViaStation());
		v.getRoute().getStations().add(GtmFactory.eINSTANCE.createViaStation());
		
		v.getRoute().getStations().get(0).setStation(TestUtils.findStation(tool,99,"00001"));
		v.getRoute().getStations().get(0).setCarrierConstraint(GtmFactory.eINSTANCE.createCarrierConstraint());
		v.getRoute().getStations().get(0).getCarrierConstraint().getIncludedCarriers().add(TestUtils.findCarrier(tool, "9995"));
		v.getRoute().getStations().get(1).setStation(TestUtils.findStation(tool,99,"00002"));
		v.getRoute().getStations().get(2).setStation(TestUtils.findStation(tool,99,"00003"));
		v.getRoute().getStations().get(2).setStation(TestUtils.findStation(tool,99,"00004"));
		
		return r;
	}
	
	private RegionalConstraint createRegionalConstraintWithAlteernativeRoutes() {
		
		RegionalConstraint r = GtmFactory.eINSTANCE.createRegionalConstraint();
		RegionalValidity rv = GtmFactory.eINSTANCE.createRegionalValidity();
		r.getRegionalValidity().add(rv);
		
		rv.setCarrierConstraint(GtmFactory.eINSTANCE.createCarrierConstraint());
		rv.getCarrierConstraint().getIncludedCarriers().add(TestUtils.findCarrier(tool, "9999"));
		
		ViaStation v = 	GtmFactory.eINSTANCE.createViaStation();	
		rv.setViaStation(v);
		
		v.setCarrierConstraint(GtmFactory.eINSTANCE.createCarrierConstraint());
		v.getCarrierConstraint().getIncludedCarriers().add(TestUtils.findCarrier(tool, "9997"));
		
		v.setRoute(GtmFactory.eINSTANCE.createRoute());
		v.getRoute().getStations().add(GtmFactory.eINSTANCE.createViaStation());
		v.getRoute().getStations().add(GtmFactory.eINSTANCE.createViaStation());
		v.getRoute().getStations().add(GtmFactory.eINSTANCE.createViaStation());
		v.getRoute().getStations().add(GtmFactory.eINSTANCE.createViaStation());
		
		v.getRoute().getStations().get(0).setStation(TestUtils.findStation(tool,99,"00001"));
		v.getRoute().getStations().get(2).setStation(TestUtils.findStation(tool,99,"00003"));
		
		v.getRoute().getStations().get(2).getAlternativeRoutes().add(GtmFactory.eINSTANCE.createAlternativeRoute());
		v.getRoute().getStations().get(2).getAlternativeRoutes().add(GtmFactory.eINSTANCE.createAlternativeRoute());
		
		v.getRoute().getStations().get(2).getAlternativeRoutes().get(0).getStations().add(GtmFactory.eINSTANCE.createViaStation());
		v.getRoute().getStations().get(2).getAlternativeRoutes().get(0).getStations().add(GtmFactory.eINSTANCE.createViaStation());
		v.getRoute().getStations().get(2).getAlternativeRoutes().get(0).getStations().get(0).setStation(TestUtils.findStation(tool,99,"00004"));
		v.getRoute().getStations().get(2).getAlternativeRoutes().get(0).getStations().get(1).setStation(TestUtils.findStation(tool,99,"00005"));
	
		
		v.getRoute().getStations().get(2).getAlternativeRoutes().get(1).getStations().add(GtmFactory.eINSTANCE.createViaStation());
		v.getRoute().getStations().get(2).getAlternativeRoutes().get(1).getStations().get(0).setCarrierConstraint(GtmFactory.eINSTANCE.createCarrierConstraint());
		v.getRoute().getStations().get(2).getAlternativeRoutes().get(1).getStations().get(0).getCarrierConstraint().getIncludedCarriers().add(TestUtils.findCarrier(tool, "9995"));
		v.getRoute().getStations().get(2).getAlternativeRoutes().get(1).getStations().add(GtmFactory.eINSTANCE.createViaStation());
		v.getRoute().getStations().get(2).getAlternativeRoutes().get(1).getStations().get(0).setStation(TestUtils.findStation(tool,99,"00006"));
		v.getRoute().getStations().get(2).getAlternativeRoutes().get(1).getStations().get(1).setStation(TestUtils.findStation(tool,99,"00002"));

		return r;
	}


}
