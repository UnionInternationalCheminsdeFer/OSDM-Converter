package Gtm.utils;

import java.util.ArrayList;
import java.util.List;

import Gtm.AlternativeRoute;
import Gtm.Carrier;
import Gtm.ClassId;
import Gtm.ClassicClassType;
import Gtm.Clusters;
import Gtm.CombinationModel;
import Gtm.FareCombinationModel;
import Gtm.FareElement;
import Gtm.FareStationSetDefinition;
import Gtm.LegacyConversionType;
import Gtm.RegionalConstraint;
import Gtm.RegionalValidity;
import Gtm.ServiceConstraint;
import Gtm.Station;
import Gtm.TravelValidityType;
import Gtm.TravelerType;
import Gtm.ViaStation;

public class GtmValidator {
	
	
	/**
	 * Checks if is convertable.
	 *
	 * @param fare the fare
	 * @return true, if is convertable
	 */
	public static String checkConvertability(FareElement fare, Carrier carrier) {
		
		//fare excluded from conversion
		if (fare.getLegacyConversion() == LegacyConversionType.NO) return null;

		//only ADULT
		if (fare.getPassengerConstraint().getTravelerType() != TravelerType.ADULT)  return null;
		
		//multi-yourney fares are not convertable
		if (fare.getTravelValidity() != null && 
			fare.getTravelValidity().getValidityType() != null &&
			(fare.getTravelValidity().getValidityType().equals(TravelValidityType.MULTIPLE_TRIPS) || 
			 fare.getTravelValidity().getValidityType().equals(TravelValidityType.UNRESTRICTED)		)
				) {
			return null;
		}

		//only FULL_FLEX combination
		if (!isFullFlexCombi(fare, carrier))  return null;
		
		//no reductions
		if (fare.getReductionConstraint() != null)  return null;
		
		//service classes B and D are converted
		
		if (fare.getServiceClass() == null) {
			return "Service class is missing! Fare " + GtmUtils.getLabelText(fare) + " will not be converted";
		}
			
		if (fare.getServiceClass().getId() == ClassId.A) {
			return "Service Class A will not be converted";
		}
		if (fare.getServiceClass().getId() == ClassId.C) {
			return "Service Class C will not be converted";
		}
		
		//classic classes not matching
		if ( (fare.getServiceClass().getId() == ClassId.B && !(fare.getServiceClass().getClassicClass() == null || fare.getServiceClass().getClassicClass() == ClassicClassType.FIRST) )
				||
			 (fare.getServiceClass().getId() == ClassId.D && !(fare.getServiceClass().getClassicClass() == null || fare.getServiceClass().getClassicClass() == ClassicClassType.SECOND) )	
				){
			return "Service class / Classic class mismatch. " + GtmUtils.getLabelText(fare) + " will not be converted";
		}
		
		//must have one sales availability 
		if (fare.getFareConstraintBundle() == null ||
			fare.getFareConstraintBundle().getSalesAvailability() == null) {
			return "Sales availability is missing";
		}
		if (fare.getFareConstraintBundle().getSalesAvailability().getRestrictions() == null) {
			return "Sales availability restrictions are missing";
		}
		if (fare.getFareConstraintBundle().getSalesAvailability().getRestrictions().isEmpty()) {
			return "Sales availability restrictions are empty";
		}
		if (fare.getFareConstraintBundle().getSalesAvailability().getRestrictions().size() == 0) {
			return "Sales availability restrictions are empty";
		}

		//must be convertible in legacy series
		if (!hasSimpleRegionalValidity(fare)) {
			return "Regional validity too complex for conversion";
		}		
		
		// there must be a route description
		if (fare.getRegionalConstraint() == null ||
			fare.getRegionalConstraint().getRegionalValidity()== null || 
			fare.getRegionalConstraint().getRegionalValidity().isEmpty() || 
			fare.getRegionalConstraint().getRegionalValidity().get(0).getViaStation() == null) {
			return "Route is missing";
		}
		
		//regional service constraints can convert
		String error = serviceConstraintConvertable(fare.getRegionalConstraint());
		if (error != null){
			return error;
		}

		//series can convert
		error = checkConvertToSeries(fare);

		return error;
	}
	
	/**
	 * Checks for simple regional validity.
	 *
	 * @param fare the fare
	 * @return true, if successful
	 */
	private static boolean hasSimpleRegionalValidity(FareElement fare) {
		if (fare.getRegionalConstraint() == null) return false;
		if (fare.getRegionalConstraint().getRegionalValidity() == null || fare.getRegionalConstraint().getRegionalValidity().isEmpty()) return false;
		//only via stations allowed
		if (fare.getRegionalConstraint().getRegionalValidity().size() > 1) return false;
				
		//contains only 
		RegionalValidity v = fare.getRegionalConstraint().getRegionalValidity().get(0);
		if (v.getViaStation() == null) return false;
		if (v.getLine() != null || v.getPolygone()!= null || v.getZone()!= null) return false;
		
		ViaStation via = v.getViaStation();
		//no main route
		if (via.getRoute() == null) {
			return false;
		}

		List<Station> stations = new ArrayList<Station>();
		List<FareStationSetDefinition> fareStations = new ArrayList<FareStationSetDefinition>();
		checkAddStations(via,stations, fareStations);
		
		//too many stations
		if (stations.size() + fareStations.size() > 7) {
			return false;
		}
				
		return true;
	}
	
	/**
	 * Adds the stations.
	 *
	 * @param via the via
	 * @param stations the stations
	 * @param fareStations the fare stations
	 */
	private static void checkAddStations(ViaStation via, List<Station> stations, List<FareStationSetDefinition> fareStations) {
		
		if (via == null) return;
		if (via.isTechnicalViaOnly()) return;
		if (via.getStation() != null) stations.add(via.getStation());
		if (via.getFareStationSet()!= null) fareStations.add(via.getFareStationSet());
		
		if (via.getRoute() != null) {
			for (ViaStation via2 :via.getRoute().getStations()) {
				checkAddStations(via2, stations, fareStations);
			}
		}
		
		for (AlternativeRoute route: via.getAlternativeRoutes()) {
			for (ViaStation via3 : route.getStations()) {
				checkAddStations(via3, stations,fareStations);
			}
		}
		
	}

	/**
	 * Checks if is full flex combi.
	 *
	 * @param fare the fare
	 * @return true, if is full flex combi
	 */
	private static boolean isFullFlexCombi(FareElement fare, Carrier carrier) {
		if (fare.getFareConstraintBundle() == null || 
			fare.getFareConstraintBundle().getCombinationConstraint() ==  null) return false;
		for (FareCombinationModel model : fare.getFareConstraintBundle().getCombinationConstraint().getCombinationModels()) {
			
			//must allow clustering in full flex
			if (model.getModel() == CombinationModel.CLUSTERING &&
				model.getReferenceCluster() == Clusters.FULLFLEX) {
				if (model.getCombinableCarriers().isEmpty() || 
					model.getCombinableCarriers().contains(carrier)) {
					if (model.getAllowedAllocators().isEmpty() || 
						model.getAllowedAllocators().contains(carrier)) {	
						return true;
					}
				}
			}
		}
		return false;
	}

	private static String serviceConstraintConvertable(RegionalConstraint regionalConstraint) {
		
		if (regionalConstraint.getRegionalValidity() == null || regionalConstraint.getRegionalValidity().size() != 1) {
			return "Regional validity missing";
		}
		RegionalValidity regionalValidity = regionalConstraint.getRegionalValidity().get(0);
		if (regionalValidity.getServiceConstraint() != null) {
			
			String error = isConvertable(regionalValidity.getServiceConstraint());
			if (error != null) {
				return error;
			}
		}
		if (regionalValidity.getViaStation() == null) {
			String error = isConvertable(regionalValidity.getViaStation());
			if (error != null) {
				return error;
			}
		}
		
		return null;
	}

	private static String isConvertable(ViaStation viaStation) {
		
		if (viaStation.getServiceConstraint() != null) {
			String error = isConvertable(viaStation.getServiceConstraint());
			if (error != null) {
				return error;
			}
		}
		if (viaStation.getRoute() != null && !viaStation.getRoute().getStations().isEmpty()) {
			for (ViaStation v : viaStation.getRoute().getStations()) {
				String error = isConvertable(v);
				if (error != null) {
					return error;
				}
			}
		}
		if (viaStation.getAlternativeRoutes() != null && !viaStation.getAlternativeRoutes().isEmpty()) {
			
			for ( AlternativeRoute ar:  viaStation.getAlternativeRoutes()) {
				if (ar.getStations() != null && !ar.getStations().isEmpty()) {
					for (ViaStation v : ar.getStations()) {
						String error = isConvertable(v);
						if (error != null) {
							return error;
						}
					}
				}
			}
			
		}
		return null;
	}

	private static String isConvertable(ServiceConstraint serviceConstraint) {
		
		if (serviceConstraint.getLegacy108Code() < 0 || serviceConstraint.getLegacy108Code() > 99999) {
			return "service constrain legacy code < 0 or > 99999 ";
		}
		if (serviceConstraint.getExcludedServiceBrands() != null && !serviceConstraint.getExcludedServiceBrands().isEmpty()) {
			return "ServiceConstraint with excluded Service Brands is not convertable! Legacy Code: " +  Integer.toString(serviceConstraint.getLegacy108Code());
		}
		if (serviceConstraint.getIncludedServiceBrands() != null || serviceConstraint.getIncludedServiceBrands().isEmpty()) {
			return "ServiceConstraint without included Service Brands is not convertable! ";
		}		
		return null;
	}
	
	/**
	 * Convert to series.
	 *
	 * @param fare the fare
	 * @return the legacy series
	 */
	private static String checkConvertToSeries(FareElement fare) {
		
		if (fare.getRegionalConstraint() == null ||
				fare.getFareConstraintBundle() == null ||
				fare.getRegionalConstraint().getRegionalValidity() == null ||
				fare.getRegionalConstraint().getRegionalValidity().isEmpty() ||
				fare.getRegionalConstraint().getRegionalValidity().get(0).getViaStation() == null ) {
				return "Route is missing";
		}
			
		RegionalConstraint regionalConstraint = fare.getRegionalConstraint();
		
		if (regionalConstraint == null ||
			regionalConstraint.getRegionalValidity().isEmpty() ||
			regionalConstraint.getRegionalValidity().get(0).getViaStation() == null ||
			regionalConstraint.getRegionalValidity().get(0).getViaStation().getRoute() == null) {
			return "Route is missing";
		}

		RegionalValidity regionalValidity =  regionalConstraint.getRegionalValidity().get(0);
				
		ViaStation mainVia = regionalValidity.getViaStation();
					
		if (mainVia.getRoute() != null) {
			
			ViaStation firstVia = mainVia.getRoute().getStations().get(0);
			ViaStation lastVia = mainVia.getRoute().getStations().get(mainVia.getRoute().getStations().size() - 1);
			
			if (firstVia.getStation() != null && noNames(firstVia.getStation())) {
				return "Station names missing for: " + GtmUtils.getLabelText(firstVia.getStation());
			}
			
			if (firstVia.getFareStationSet() != null && noNames(firstVia.getFareStationSet())) {
				return "Fare Station Set Names missing for: " + GtmUtils.getLabelText(firstVia.getFareStationSet());
			}

			if (lastVia.getStation() != null && noNames(lastVia.getStation())) {
				return "Station names missing for: " + GtmUtils.getLabelText(lastVia.getStation());
			}
			
			if (lastVia.getFareStationSet() != null && noNames(lastVia.getFareStationSet())) {
				return "Fare Station Set Names missing for: " + GtmUtils.getLabelText(lastVia.getFareStationSet());
			}
			
		}
		
		return null;
	}

	private static boolean noNames(FareStationSetDefinition fareStationSet) {
		
		if (      (fareStationSet.getName() == null || fareStationSet.getName().length()== 0)
			  &&  (fareStationSet.getNameUtf8() == null || fareStationSet.getNameUtf8().length() == 0)){
			  return true;
		  }
		return false;
	}

	private static boolean noNames(Station station) {
		
		if (   (station.getNameCaseASCII() == null || station.getNameCaseASCII().length() == 0)
			&& (station.getNameCaseUTF8() == null  || station.getNameCaseUTF8().length() == 0)
			&& (station.getShortNameCaseASCII() == null  || station.getShortNameCaseASCII().length() == 0)
			&& (station.getShortNameCaseUTF8() == null || station.getShortNameCaseUTF8().length() == 0)    ) {
			return true;
		}
		
		return false;
	}


}
