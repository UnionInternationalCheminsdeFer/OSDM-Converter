package Gtm.converter;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import Gtm.AddCarrierRule;
import Gtm.AddCarrierRules;
import Gtm.AddCarrierScope;
import Gtm.AlternativeRoute;
import Gtm.Carrier;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.RegionalConstraint;
import Gtm.RegionalValidity;
import Gtm.Station;
import Gtm.ViaStation;

public class AddCarrierRuleEngine {
	
	public static void addCarriers(GTMTool tool, RegionalConstraint regionalConstraint) {
		
		if (tool.getConversionFromLegacy().getParams().getAddCarrierRules() == null 
			|| tool.getConversionFromLegacy().getParams().getAddCarrierRules().getAddCarrierRule().isEmpty()) {
			return;
		}
		
		if (regionalConstraint == null 
			|| regionalConstraint.getRegionalValidity() == null
			|| regionalConstraint.getRegionalValidity().isEmpty()
			) {
			return;
		}
					
		AddCarrierRules rules = tool.getConversionFromLegacy().getParams().getAddCarrierRules();
		
		for (AddCarrierRule rule : rules.getAddCarrierRule()) {
			
			if (rule.getCarrier() != null &&
				(rule.getScope().equals(AddCarrierScope.CARRIER)
				|| rule.getScope().equals(AddCarrierScope.TCO_AND_CARRIER))) {
		
				
				    for (RegionalValidity v : regionalConstraint.getRegionalValidity()) {
				    	
				    	ViaStation via = v.getViaStation();
				    	
				    	if (via != null) {
				
				    		boolean ruleApplies = checkContainsTwoStations(via, rule.getStations()) ;
		
				    		if (ruleApplies) {
				    			if (via.getCarrierConstraint() == null) {
				    				via.setCarrierConstraint(GtmFactory.eINSTANCE.createCarrierConstraint());
				    			} 
				    							    			
				    			if (!via.getCarrierConstraint().getIncludedCarriers().contains(rule.getCarrier())) {
				    				via.getCarrierConstraint().getIncludedCarriers().add(rule.getCarrier());
				    			}
				    		}
						
						}
				    }
			}
		}
		
		
	}

	private static boolean checkContainsTwoStations(ViaStation viaStation, EList<Station> stations) {
		int count = 0;
		
		for (Station station: stations) {
						
			if (viaStation != null) {
				
				if (contains(viaStation, station)) {
					count++;
				}
				if (count > 1) return true;
					
			}
				
		}
		
		return false;
	}

	private static boolean checkContainsTwoStations(RegionalConstraint regionalConstraint, EList<Station> stations) {

		int count = 0;
		
		for (Station station: stations) {
			
			for (RegionalValidity v : regionalConstraint.getRegionalValidity()) {
				
				if (v.getViaStation() != null) {
					
					if (contains(v.getViaStation(), station)) {
						count++;
					}
					if (count > 1) return true;
					
				}
				
			}
			
		}
		
		return false;
	}



	

	

	
	private static boolean contains(ViaStation v, Station s) {
		
		if (v.getStation() != null && v.getStation().equals(s)) return true;
		if (v.getFareStationSet() != null && v.getFareStationSet().getStations().contains(s)) return true;
		if (v.getRoute() != null && v.getRoute().getStations() != null) {
			for (ViaStation v1 :v.getRoute().getStations()) {
				if (contains(v1,s)) return true;
			}
		}
		if (v.getAlternativeRoutes() != null) {
			for (AlternativeRoute ar : v.getAlternativeRoutes()) {
				if (ar.getStations() != null) {
					for (ViaStation v1: ar.getStations()) {
						if (contains(v1,s)) return true;
					}
				}
			}
		}
		
		return false;
	}

	public static Set<Carrier> getAdditionalTCOs(GTMTool tool, RegionalConstraint regionalConstraint) {
		
		HashSet<Carrier> tcos = new HashSet<Carrier>();
		
		if (tool.getConversionFromLegacy().getParams().getAddCarrierRules() == null 
				|| tool.getConversionFromLegacy().getParams().getAddCarrierRules().getAddCarrierRule().isEmpty()) {
				return tcos;
		}
			
		if (regionalConstraint == null 
			|| regionalConstraint.getRegionalValidity() == null
			|| regionalConstraint.getRegionalValidity().isEmpty()
			) {
			return tcos;
		}
						
		AddCarrierRules rules = tool.getConversionFromLegacy().getParams().getAddCarrierRules();
		
		for (AddCarrierRule rule : rules.getAddCarrierRule()) {
				
			if (rule.getCarrier() != null &&
				(rule.getScope().equals(AddCarrierScope.TCO)
				|| rule.getScope().equals(AddCarrierScope.TCO_AND_CARRIER))) {
			
				boolean ruleApplies = checkContainsTwoStations(regionalConstraint, rule.getStations()) ;
		
				if (ruleApplies) {
					tcos.add(rule.getCarrier());
				}
			}
		}
			
		return tcos;
	}

}
