package Gtm.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import Gtm.AlternativeRoute;
import Gtm.Carrier;
import Gtm.FareElement;
import Gtm.GTMTool;
import Gtm.Line;
import Gtm.RegionalConstraint;
import Gtm.RegionalValidity;
import Gtm.ViaStation;
import Gtm.Zone;
import Gtm.converter.AddCarrierRuleEngine;

public class InvolvedTcoFinder {
	
	public static Set<Carrier> getInvolvedTcos(FareElement f) {
		 
		Set<Carrier>	tcos = new HashSet<Carrier>();	
		
		if (f.getRegionalConstraint() != null) {
			
			Set<Carrier> cs = getInvolvedCarriers(f.getRegionalConstraint());
			
			if (cs != null && !cs.isEmpty()) {
				tcos.addAll(cs);
			}
			
			
		}
		
		return tcos;
	}
	
	public static Set<Carrier> getInvolvedCarriers(RegionalConstraint rc) {
		
		Set<Carrier>	tcos = new HashSet<Carrier>();	
		
		if (rc != null 
			&& rc.getRegionalValidity() != null 
			&& !rc.getRegionalValidity().isEmpty()) {
			
		}
		for (RegionalValidity rv : rc.getRegionalValidity()) {
			
			Set<Carrier> cs = getInvolvedCarriers(rv);
			if (cs != null && !cs.isEmpty()) {
				tcos.addAll(cs);
			}
			
		}
		
		return tcos;
		
		
	}
	


	private static Set<Carrier> getInvolvedCarriers(RegionalValidity rv) {
		
		Set<Carrier>	tcos = new HashSet<Carrier>();	
		
		if (rv.getCarrierConstraint() != null 
			&& rv.getCarrierConstraint().getIncludedCarriers() != null
			&& !rv.getCarrierConstraint().getIncludedCarriers().isEmpty() ) {
			
			tcos.addAll(rv.getCarrierConstraint().getIncludedCarriers());
		}

		if (rv.getViaStation() != null) {
			
			Set<Carrier> cs = getInvolvedTcos(rv.getViaStation());
			if (cs != null && !cs.isEmpty()) {
				tcos.addAll(cs);
			}
		}
		
		if (rv.getLine() != null) {
			tcos.addAll(getInvolvedTcos(rv.getLine()));
		}
		
		if (rv.getZone() != null) {
			tcos.addAll(getInvolvedTcos(rv.getZone()));
		}
		
		return tcos;
	}


	private static Set<Carrier> getInvolvedTcos(Zone zone) {
		
		Set<Carrier>	tcos = new HashSet<Carrier>();	
		
		if (zone.getCarrier() != null) tcos.add(zone.getCarrier());
		
		return tcos;
	}


	private static Set<Carrier> getInvolvedTcos(Line line) {
		
		Set<Carrier>	tcos = new HashSet<Carrier>();	
		
		if (line.getCarrier() != null) tcos.add(line.getCarrier());
		
		return tcos;
	}


	private static Set<Carrier> getInvolvedTcos(ViaStation v) {
		
		Set<Carrier>	tcos = new HashSet<Carrier>();	
		
		if (v.getCarrierConstraint() != null 
			&& v.getCarrierConstraint().getIncludedCarriers() != null 
			&& !v.getCarrierConstraint().getIncludedCarriers().isEmpty()) {
			
			tcos.addAll(v.getCarrierConstraint().getIncludedCarriers());
		}
		
		if (v.getCarrier() != null) {
			tcos.add(v.getCarrier());
		}
		
		if (v.getRoute() != null 
			&& v.getRoute().getStations() != null 
			&& !v.getRoute().getStations().isEmpty()) {
			
			for (ViaStation vs : v.getRoute().getStations()) {
				Set<Carrier> cs = getInvolvedTcos(vs);
				if (cs != null && !cs.isEmpty()) {
					tcos.addAll(cs);
				}
			}
		}
		
		if (v.getAlternativeRoutes() != null 
			&& !v.getAlternativeRoutes().isEmpty()) {
			
			for (AlternativeRoute ar : v.getAlternativeRoutes()) {
				
				if (ar.getStations() != null && !ar.getStations().isEmpty()) {
					
					for (ViaStation vs : ar.getStations()) {
						Set<Carrier> cs = getInvolvedTcos(vs);
						if (cs != null && !cs.isEmpty()) {
							tcos.addAll(cs);
						}
					}
				}
			}
		}
		
		return tcos;
	}

	public static Collection<? extends Carrier> getInvolvedTcos(GTMTool tool, RegionalConstraint regionalConstraint) {
		
		Set<Carrier> carriers = getInvolvedCarriers(regionalConstraint);
		
		if (tool.getConversionFromLegacy().getParams().getAddCarrierRules() != null) {
			
			Set<Carrier> add = AddCarrierRuleEngine.getAdditionalTCOs(tool, regionalConstraint);
		
			carriers.addAll(add);
		}
		
		return carriers;
	}




}
