package Gtm.converter.tests;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import Gtm.AddCarrierRule;
import Gtm.AddCarrierRules;
import Gtm.AddCarrierScope;
import Gtm.Carrier;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.RegionalConstraint;
import Gtm.RegionalValidity;
import Gtm.ViaStation;
import Gtm.converter.AddCarrierRuleEngine;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.utils.TestUtils;

public class AddCarrierRuleEngineTest {
	
	GTMTool tool = null;
	
	
	@Before 
	public void initialize() {
		
				
		tool = LegacyDataFactory.createBasicData();	
		
				

			
	}
	
	@Test 
	public void testAddCarrierFromRoute() {
			
		RegionalConstraint r = createRegionalConstraintWithRoute();
		
		addCarrierRules(tool);
		
		AddCarrierRuleEngine.addCarriers(tool, r);
		
		assert(r.getRegionalValidity() != null);
		assert(r.getRegionalValidity().get(0).getViaStation() != null);
		assert(r.getRegionalValidity().get(0).getViaStation() != null);
		assert(r.getRegionalValidity().get(0).getViaStation().getCarrierConstraint() != null);
		assert(r.getRegionalValidity().get(0).getViaStation().getCarrierConstraint().getIncludedCarriers() != null);
		assert(r.getRegionalValidity().get(0).getViaStation().getCarrierConstraint().getIncludedCarriers().contains(TestUtils.findCarrier(tool, "9999")));
		assert(r.getRegionalValidity().get(0).getViaStation().getCarrierConstraint().getIncludedCarriers().contains(TestUtils.findCarrier(tool, "9997")));
		assert(!r.getRegionalValidity().get(0).getViaStation().getCarrierConstraint().getIncludedCarriers().contains(TestUtils.findCarrier(tool, "9995")));

		}
	
	@Test 
	public void testAddTcosFromRoute() {		
		
		RegionalConstraint r = createRegionalConstraintWithRoute();
		
		addTcoRules(tool);
		
		Set<Carrier> carriers = AddCarrierRuleEngine.getAdditionalTCOs(tool, r);
		
		assert(carriers != null);
		assert(!carriers.isEmpty());
		assert(carriers.contains(TestUtils.findCarrier(tool, "9999")));
		assert(!carriers.contains(TestUtils.findCarrier(tool, "9995")));

	}
	
	@Test 
	public void testAddCarrierFromAltRoute() {
			
		RegionalConstraint r = createRegionalConstraintWithAlteernativeRoutes();
		
		addCarrierRules(tool);
		
		AddCarrierRuleEngine.addCarriers(tool, r);
		
		assert(r.getRegionalValidity() != null);
		assert(r.getRegionalValidity().get(0).getViaStation() != null);
		assert(r.getRegionalValidity().get(0).getViaStation() != null);
		assert(r.getRegionalValidity().get(0).getViaStation().getCarrierConstraint() != null);
		assert(r.getRegionalValidity().get(0).getViaStation().getCarrierConstraint().getIncludedCarriers() != null);
		assert(r.getRegionalValidity().get(0).getViaStation().getCarrierConstraint().getIncludedCarriers().contains(TestUtils.findCarrier(tool, "9999")));
		assert(r.getRegionalValidity().get(0).getViaStation().getCarrierConstraint().getIncludedCarriers().contains(TestUtils.findCarrier(tool, "9997")));
		assert(!r.getRegionalValidity().get(0).getViaStation().getCarrierConstraint().getIncludedCarriers().contains(TestUtils.findCarrier(tool, "9995")));

		}
	
	@Test 
	public void testAddTcosFromAltRoute() {		
		
		RegionalConstraint r = createRegionalConstraintWithAlteernativeRoutes();
		
		addTcoRules(tool);
		
		Set<Carrier> carriers = AddCarrierRuleEngine.getAdditionalTCOs(tool, r);
		
		assert(carriers != null);
		assert(!carriers.isEmpty());
		assert(carriers.contains(TestUtils.findCarrier(tool, "9999")));
		assert(!carriers.contains(TestUtils.findCarrier(tool, "9995")));

	}
		
	private RegionalConstraint createRegionalConstraintWithRoute() {
		
		RegionalConstraint r = GtmFactory.eINSTANCE.createRegionalConstraint();
		RegionalValidity rv = GtmFactory.eINSTANCE.createRegionalValidity();
		r.getRegionalValidity().add(rv);
		
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
		v.getRoute().getStations().get(1).setStation(TestUtils.findStation(tool,99,"00002"));
		v.getRoute().getStations().get(2).setStation(TestUtils.findStation(tool,99,"00003"));
		v.getRoute().getStations().get(2).setStation(TestUtils.findStation(tool,99,"00004"));
		
		return r;
	}
	
	private RegionalConstraint createRegionalConstraintWithAlteernativeRoutes() {
		
		RegionalConstraint r = GtmFactory.eINSTANCE.createRegionalConstraint();
		RegionalValidity rv = GtmFactory.eINSTANCE.createRegionalValidity();
		r.getRegionalValidity().add(rv);
		
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
		v.getRoute().getStations().get(2).getAlternativeRoutes().get(1).getStations().add(GtmFactory.eINSTANCE.createViaStation());
		v.getRoute().getStations().get(2).getAlternativeRoutes().get(1).getStations().get(0).setStation(TestUtils.findStation(tool,99,"00006"));
		v.getRoute().getStations().get(2).getAlternativeRoutes().get(1).getStations().get(1).setStation(TestUtils.findStation(tool,99,"00002"));

		return r;
	}

	private void addCarrierRules(GTMTool tool2) {
		AddCarrierRules rules = GtmFactory.eINSTANCE.createAddCarrierRules();
		AddCarrierRule rule = GtmFactory.eINSTANCE.createAddCarrierRule();
		rules.getAddCarrierRule().add(rule);
		rule.getStations().add(TestUtils.findStation(tool, 99,"00001"));
		rule.getStations().add(TestUtils.findStation(tool, 99,"00002"));
		rule.setScope(AddCarrierScope.CARRIER);
		rule.setCarrier(TestUtils.findCarrier(tool, "9999"));
		AddCarrierRule rule2 = GtmFactory.eINSTANCE.createAddCarrierRule();
		rules.getAddCarrierRule().add(rule2);
		rule2.getStations().add(TestUtils.findStation(tool, 99,"00001"));
		rule2.getStations().add(TestUtils.findStation(tool, 99,"00002"));
		rule2.setScope(AddCarrierScope.TCO);
		rule2.setCarrier(TestUtils.findCarrier(tool, "9995"));
				
		tool.getConversionFromLegacy().getParams().setAddCarrierRules(rules);
	}



	private void addTcoRules(GTMTool tool) {
		AddCarrierRules rules = GtmFactory.eINSTANCE.createAddCarrierRules();
		AddCarrierRule rule = GtmFactory.eINSTANCE.createAddCarrierRule();
		rules.getAddCarrierRule().add(rule);
		rule.getStations().add(TestUtils.findStation(tool, 99,"00001"));
		rule.getStations().add(TestUtils.findStation(tool, 99,"00002"));
		rule.setScope(AddCarrierScope.TCO);
		rule.setCarrier(TestUtils.findCarrier(tool, "9999"));
		AddCarrierRule rule2 = GtmFactory.eINSTANCE.createAddCarrierRule();
		rules.getAddCarrierRule().add(rule2);
		rule2.getStations().add(TestUtils.findStation(tool, 99,"00001"));
		rule2.getStations().add(TestUtils.findStation(tool, 99,"00002"));
		rule2.setScope(AddCarrierScope.CARRIER);
		rule2.setCarrier(TestUtils.findCarrier(tool, "9995"));
		tool.getConversionFromLegacy().getParams().setAddCarrierRules(rules);
	}

}
