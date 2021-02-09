package Gtm.utils;

import java.util.ArrayList;
import java.util.Collection;

import Gtm.FareConstraintBundle;
import Gtm.FareElement;
import Gtm.FareStructure;
import Gtm.FareTemplate;
import Gtm.GtmFactory;
import Gtm.LegacyFareTemplates;
import Gtm.PassengerConstraint;
import Gtm.TotalPassengerCombinationConstraint;

public class ConstraintBundleFactory {
	
	public static ArrayList<FareConstraintBundle> createFareConstraintBundles(FareStructure model, ArrayList<TotalPassengerCombinationConstraint> tpcs){
		
		
		ArrayList<FareConstraintBundle> bundles = new ArrayList<FareConstraintBundle>();
		
		
		for (FareElement fare : model.getFareElements().getFareElements()) {
			
			FareConstraintBundle bundle = createBundle(fare,bundles, tpcs);
			if (bundle != null) {
				bundles.add(bundle);
			}
		}
		
		return bundles;
	}
	
	
	public static FareConstraintBundle createBundle(FareElement fare, ArrayList<FareConstraintBundle> bundles, ArrayList<TotalPassengerCombinationConstraint> tpcs) {
		
		if (!isContained(fare,bundles)) {
			
			FareConstraintBundle bundle = GtmFactory.eINSTANCE.createFareConstraintBundle();
			
			bundle.setCombinationConstraint(fare.getCombinationConstraint());	
			bundle.setTravelValidity(fare.getTravelValidity());
			bundle.setCarrierConstraint(fare.getCarrierConstraint());
			bundle.setFulfillmentConstraint(fare.getFulfillmentConstraint());
			bundle.setPersonalDataConstraint(fare.getPersonalDataConstraint());
			bundle.setTotalPassengerConstraint(findTotalPassengerConstraint(fare, tpcs));

			return bundle;
		}

		return null;
		
	}

	
	private static TotalPassengerCombinationConstraint findTotalPassengerConstraint(FareElement fare,
			ArrayList<TotalPassengerCombinationConstraint> tpcs) {
		
		for (TotalPassengerCombinationConstraint tpc : tpcs) {
			if (fare.getPassengerConstraint() != null &&
				tpc.getMaxTotalPassengerWeight() == fare.getPassengerConstraint().getMaxTotalPassengerWeight() &&
				tpc.getMinTotalPassengerWeight() == fare.getPassengerConstraint().getMinTotalPassengerWeight()) {
				return tpc;
			}
		}
		return null;
	}


	public static boolean isContained(FareElement fare,ArrayList<FareConstraintBundle> bundles ) {
		
		for (FareConstraintBundle bundle : bundles) {
			
			if (bundle.getCarrierConstraint() == fare.getCarrierConstraint() &&
				bundle.getCombinationConstraint() == fare.getCombinationConstraint() &&
				bundle.getFulfillmentConstraint() == fare.getFulfillmentConstraint() &&
				bundle.getPersonalDataConstraint() == fare.getPersonalDataConstraint() &&
				bundle.getTravelValidity() == fare.getTravelValidity() &&
				bundle.getSalesAvailability() == fare.getSalesAvailability()
				) {
				return true;
			}
		}
		
		return false;
	}
	
	public static FareConstraintBundle findFittingBundle(FareElement fare, Collection<FareConstraintBundle> bundles) {
		
		for (FareConstraintBundle bundle : bundles) {
			
			if (fare.getFareConstraintBundle() != null) return null;
			
			if (bundle.getCarrierConstraint() == fare.getCarrierConstraint() &&
			    bundle.getCombinationConstraint() == fare.getCombinationConstraint() &&
				bundle.getFulfillmentConstraint() == fare.getFulfillmentConstraint() &&
				bundle.getPersonalDataConstraint() == fare.getPersonalDataConstraint() &&
				bundle.getTravelValidity() == fare.getTravelValidity() &&
				bundle.getSalesAvailability() == fare.getSalesAvailability()
				) {
				return bundle;
			}

		}
		return null;
		
	}


	public static ArrayList<FareConstraintBundle> createFareConstraintBundles(FareStructure model,
			LegacyFareTemplates legacyFareTemplates, ArrayList<TotalPassengerCombinationConstraint> tpcs) {
		
		ArrayList<FareConstraintBundle> bundles = new ArrayList<FareConstraintBundle>();
		
		
		for (FareElement fare : model.getFareElements().getFareElements()) {
			
			FareConstraintBundle bundle = createBundle(fare,bundles, tpcs);
			if (bundle != null) {
				bundles.add(bundle);
			}
		}
		
		for (FareTemplate fareTemplate : legacyFareTemplates.getFareTemplates()) {
			
			FareConstraintBundle bundle = createBundle(fareTemplate,bundles);
			if (bundle != null) {
				bundles.add(bundle);
			}
		}
		
		for (FareTemplate fareTemplate : legacyFareTemplates.getFareTemplates()) {
			
			if (fareTemplate.getSeparateContractCombinationConstraint() != null) {
			
				FareConstraintBundle bundle = createSeparateContractBundle(fareTemplate,bundles);
				if (bundle != null) {
					bundles.add(bundle);
				}
			}
		}
		
		
		
		

		
		return bundles;		
	}


	private static FareConstraintBundle createBundle(FareTemplate fareTemplate,	ArrayList<FareConstraintBundle> bundles) {

		if (!isContained(fareTemplate,bundles)) {
			
			FareConstraintBundle bundle = GtmFactory.eINSTANCE.createFareConstraintBundle();
			
			bundle.setCombinationConstraint(fareTemplate.getCombinationConstraint());	
			bundle.setTravelValidity(fareTemplate.getTravelValidity());
			bundle.setCarrierConstraint(fareTemplate.getCarrierConstraint());
			bundle.setFulfillmentConstraint(fareTemplate.getFulfillmentConstraint());
			bundle.setPersonalDataConstraint(fareTemplate.getPersonalDataConstraint());

			return bundle;
		}

		return null;
	}
	
	private static FareConstraintBundle createSeparateContractBundle(FareTemplate fareTemplate,	ArrayList<FareConstraintBundle> bundles) {

		if (fareTemplate.getSeparateContractCombinationConstraint() != null &&  !isContainedSeparateContract(fareTemplate,bundles) ) {
			
			FareConstraintBundle bundle = GtmFactory.eINSTANCE.createFareConstraintBundle();
			
			bundle.setCombinationConstraint(fareTemplate.getSeparateContractCombinationConstraint());	
			bundle.setTravelValidity(fareTemplate.getTravelValidity());
			bundle.setCarrierConstraint(fareTemplate.getCarrierConstraint());
			bundle.setFulfillmentConstraint(fareTemplate.getFulfillmentConstraint());
			bundle.setPersonalDataConstraint(fareTemplate.getPersonalDataConstraint());

			return bundle;
		}

		return null;
	}


	private static boolean isContained(FareTemplate fareTemplate, ArrayList<FareConstraintBundle> bundles) {
		
		for (FareConstraintBundle bundle : bundles) {
			
			if (bundle.getCarrierConstraint() == fareTemplate.getCarrierConstraint() &&
				bundle.getCombinationConstraint() == fareTemplate.getCombinationConstraint() &&
				bundle.getFulfillmentConstraint() == fareTemplate.getFulfillmentConstraint() &&
				bundle.getPersonalDataConstraint() == fareTemplate.getPersonalDataConstraint() &&
				bundle.getTravelValidity() == fareTemplate.getTravelValidity() &&
				bundle.getSalesAvailability() == fareTemplate.getSalesAvailability()
				) {
				return true;
			}
		}
		
		return false;
	}

	
	private static boolean isContainedSeparateContract(FareTemplate fareTemplate, ArrayList<FareConstraintBundle> bundles) {
		
		for (FareConstraintBundle bundle : bundles) {
			
			if (bundle.getCarrierConstraint() == fareTemplate.getCarrierConstraint() &&
				bundle.getCombinationConstraint() == fareTemplate.getSeparateContractCombinationConstraint() &&
				bundle.getFulfillmentConstraint() == fareTemplate.getFulfillmentConstraint() &&
				bundle.getPersonalDataConstraint() == fareTemplate.getPersonalDataConstraint() &&
				bundle.getTravelValidity() == fareTemplate.getTravelValidity() &&
				bundle.getSalesAvailability() == fareTemplate.getSalesAvailability()
				) {
				return true;
			}
		}
		
		return false;
	}

	public static FareConstraintBundle findFittingBundle(FareTemplate fareTemplate,
			ArrayList<FareConstraintBundle> bundles) {
		for (FareConstraintBundle bundle : bundles) {
			
			if (fareTemplate.getFareConstraintBundle() != null) return null;
			
			if (bundle.getCarrierConstraint() == fareTemplate.getCarrierConstraint() &&
			    bundle.getCombinationConstraint() == fareTemplate.getCombinationConstraint() &&
				bundle.getFulfillmentConstraint() == fareTemplate.getFulfillmentConstraint() &&
				bundle.getPersonalDataConstraint() == fareTemplate.getPersonalDataConstraint() &&
				bundle.getTravelValidity() == fareTemplate.getTravelValidity() &&
				bundle.getSalesAvailability() == fareTemplate.getSalesAvailability()
				) {
				return bundle;
			}

		}
		return null;
	}
	
	public static FareConstraintBundle findFittingSeparateTicketBundle(FareTemplate fareTemplate,
			ArrayList<FareConstraintBundle> bundles) {
		for (FareConstraintBundle bundle : bundles) {
			
			if (fareTemplate.getFareConstraintBundle() != null) return null;
			
			if (bundle.getCarrierConstraint() == fareTemplate.getCarrierConstraint() &&
			    bundle.getCombinationConstraint() == fareTemplate.getSeparateContractCombinationConstraint() &&
				bundle.getFulfillmentConstraint() == fareTemplate.getFulfillmentConstraint() &&
				bundle.getPersonalDataConstraint() == fareTemplate.getPersonalDataConstraint() &&
				bundle.getTravelValidity() == fareTemplate.getTravelValidity() &&
				bundle.getSalesAvailability() == fareTemplate.getSalesAvailability()
				) {
				return bundle;
			}

		}
		return null;
	}
	

	
	public static ArrayList<TotalPassengerCombinationConstraint> createTotalPassengerCombinationConstraints(FareStructure model){
		
		
		ArrayList<TotalPassengerCombinationConstraint> tpcs = new ArrayList<TotalPassengerCombinationConstraint>();
		
		for (PassengerConstraint pc : model.getPassengerConstraints().getPassengerConstraints()) {
			
			TotalPassengerCombinationConstraint tpc = create(pc,tpcs);
			if (tpc != null) {
				tpcs.add(tpc);
			}
		}
		
		return tpcs;
	}


	private static TotalPassengerCombinationConstraint create(PassengerConstraint pc,
			ArrayList<TotalPassengerCombinationConstraint> tpcs) {
		
		for (TotalPassengerCombinationConstraint tpc : tpcs) {
			if (tpc.getMaxTotalPassengerWeight() == pc.getMaxTotalPassengerWeight() &&
				tpc.getMinTotalPassengerWeight() == pc.getMinTotalPassengerWeight()) {
				return null;
			}
		}
		TotalPassengerCombinationConstraint tpc = GtmFactory.eINSTANCE.createTotalPassengerCombinationConstraint();
		tpc.setMaxTotalPassengerWeight(pc.getMaxTotalPassengerWeight());
		tpc.setMinTotalPassengerWeight(pc.getMinTotalPassengerWeight());
		return tpc;
	}
	
}
