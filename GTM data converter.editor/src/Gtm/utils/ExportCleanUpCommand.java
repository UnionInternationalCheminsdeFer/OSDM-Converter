package Gtm.utils;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import Gtm.AfterSalesRule;
import Gtm.Calendar;
import Gtm.CarrierConstraint;
import Gtm.CombinationConstraint;
import Gtm.ConnectionPoint;
import Gtm.FareConstraintBundle;
import Gtm.FareStructure;
import Gtm.FulfillmentConstraint;
import Gtm.PassengerConstraint;
import Gtm.PersonalDataConstraint;
import Gtm.Price;
import Gtm.ReductionCard;
import Gtm.ReductionConstraint;
import Gtm.RegionalConstraint;
import Gtm.SalesAvailabilityConstraint;
import Gtm.ServiceClass;
import Gtm.ServiceConstraint;
import Gtm.Text;
import Gtm.TotalPassengerCombinationConstraint;
import Gtm.TravelValidityConstraint;
import Gtm.ZoneDefinition;

public class ExportCleanUpCommand {
	
	
	
	
	
	public static CompoundCommand createBundleConstraintCleanupCommand(EditingDomain domain,FareStructure fareData) {
		
		
		if (fareData == null) return null;
		
		CompoundCommand command = new CompoundCommand();
				
		if (fareData.getFareConstraintBundles() !=null) {
		for (FareConstraintBundle object: fareData.getFareConstraintBundles().getFareConstraintBundles()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareElements())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
		
		
		if (fareData.getServiceClassDefinitions() !=null) {
		for (ServiceClass object: fareData.getServiceClassDefinitions().getServiceClassDefinitions() ) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareElements()) 
					&& !GtmUtils.isReferenced(object,fareData.getReductionCards())
					&& !GtmUtils.isReferenced(object,fareData.getServiceConstraints()) 
				    && !GtmUtils.isReferenced(object,fareData.getServiceLevelDefinitions())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
				
		
		if (command.isEmpty() && command.canExecute()) {
			return command;
		} 
		return null;
	}
	
	
	public static CompoundCommand createClassCleanupCommand(EditingDomain domain,FareStructure fareData) {
		
		
		if (fareData == null) return null;
		
		CompoundCommand command = new CompoundCommand();
		
		
		if (fareData.getServiceClassDefinitions() !=null) {
		for (ServiceClass object: fareData.getServiceClassDefinitions().getServiceClassDefinitions() ) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareElements()) 
					&& !GtmUtils.isReferenced(object,fareData.getReductionCards())
					&& !GtmUtils.isReferenced(object,fareData.getServiceConstraints()) 
				    && !GtmUtils.isReferenced(object,fareData.getServiceLevelDefinitions())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
				
		
		if (command.isEmpty() && command.canExecute()) {
			return command;
		} 
		return null;
	}

	
	public static CompoundCommand createConstraintCleanupCommand(EditingDomain domain,FareStructure fareData) {
		
		
		if (fareData == null) return null;
		
		CompoundCommand command = new CompoundCommand();
			
		if (fareData.getAfterSalesRules()!=null) {
		for (AfterSalesRule object: fareData.getAfterSalesRules().getAfterSalesRules()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareElements()) 
					&& !GtmUtils.isReferenced(object,fareData.getFareConstraintBundles())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
		
		if (fareData.getCarrierConstraints()!=null) {
		for (CarrierConstraint object: fareData.getCarrierConstraints().getCarrierConstraints()) {
			if (   !GtmUtils.isReferenced(object,fareData.getFareElements()) 
				&& !GtmUtils.isReferenced(object,fareData.getFareConstraintBundles())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
		
		if (fareData.getCombinationConstraints() !=null) {
		for (CombinationConstraint object: fareData.getCombinationConstraints().getCombinationConstraints()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareConstraintBundles())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}		
		
		if (fareData.getConnectionPoints() !=null) {
		for (ConnectionPoint object: fareData.getConnectionPoints().getConnectionPoints()) {
				if (   !GtmUtils.isReferenced(object,fareData.getRegionalConstraints())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}		
		
		if (fareData.getSalesAvailabilityConstraints() !=null) {
		for (SalesAvailabilityConstraint object: fareData.getSalesAvailabilityConstraints().getSalesAvailabilityConstraints()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareConstraintBundles())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}	
		
		if (fareData.getTravelValidityConstraints() !=null) {
		for (TravelValidityConstraint object: fareData.getTravelValidityConstraints().getTravelValidityConstraints()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareConstraintBundles())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
		
		if (fareData.getPassengerConstraints() !=null) {
		for (PassengerConstraint object: fareData.getPassengerConstraints().getPassengerConstraints()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareElements())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
		
		if (fareData.getPersonalDataConstraints() !=null) {
		for (PersonalDataConstraint object: fareData.getPersonalDataConstraints().getPersonalDataConstraints()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareConstraintBundles())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}

		if (fareData.getTotalPassengerCombinationConstraints() !=null) {
		for (TotalPassengerCombinationConstraint object: fareData.getTotalPassengerCombinationConstraints().getTotalPassengerCombinationConstraint()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareConstraintBundles())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
		
		if (fareData.getFareConstraintBundles() !=null) {
		for (FareConstraintBundle object: fareData.getFareConstraintBundles().getFareConstraintBundles()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareElements())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
		
		if (fareData.getPrices() !=null) {
		for (Price object: fareData.getPrices().getPrices()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareElements())
					&& !GtmUtils.isReferenced(object,fareData.getAfterSalesRules())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
		
		if (fareData.getReductionConstraints() !=null) {
		for (ReductionConstraint object: fareData.getReductionConstraints().getReductionConstraints()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareElements())
					&& !GtmUtils.isReferenced(object,fareData.getAfterSalesRules())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
		
		if (fareData.getFulfillmentConstraints() !=null) {
		for (FulfillmentConstraint object: fareData.getFulfillmentConstraints().getFulfillmentConstraints()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareConstraintBundles())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
		
		if (fareData.getRegionalConstraints() !=null) {
		for (RegionalConstraint object: fareData.getRegionalConstraints().getRegionalConstraints()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareElements())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
		
		if (fareData.getServiceClassDefinitions() !=null) {
		for (ServiceClass object: fareData.getServiceClassDefinitions().getServiceClassDefinitions() ) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareElements()) 
					&& !GtmUtils.isReferenced(object,fareData.getReductionCards())
					&& !GtmUtils.isReferenced(object,fareData.getServiceConstraints()) 
				    && !GtmUtils.isReferenced(object,fareData.getServiceLevelDefinitions())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
				
		if (fareData.getZoneDefinitions() !=null) {
		for (ZoneDefinition object: fareData.getZoneDefinitions().getZoneDefinition()) {
				if (   !GtmUtils.isReferenced(object,fareData.getRegionalConstraints())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}		
		
		if (fareData.getServiceConstraints() !=null) {
		for (ServiceConstraint object: fareData.getServiceConstraints().getServiceConstraints()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareElements())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}	
				
		
		if (command.isEmpty() && command.canExecute()) {
			return command;
		} 
		return null;
	}
	
	public static CompoundCommand createCleanupCommand(EditingDomain domain,FareStructure fareData) {
		
		
		if (fareData == null) return null;
		
		CompoundCommand command = new CompoundCommand();
		
		if (fareData.getCalendars() != null) {
			for (Calendar cal : fareData.getCalendars().getCalendars()) {
				if (   !GtmUtils.isReferenced(cal,fareData.getAfterSalesRules())
					&& !GtmUtils.isReferenced(cal,fareData.getTravelValidityConstraints())
					&& !GtmUtils.isReferenced(cal,fareData.getSalesAvailabilityConstraints())) {
					Command com = DeleteCommand.create(domain, cal);
					command.appendIfCanExecute(com);
				}
			}
		}
		
		if (fareData.getReductionCards()!= null) {
			for (ReductionCard card : fareData.getReductionCards().getReductionCards()) {
				if (   !GtmUtils.isReferenced(card,fareData.getReductionConstraints())) {
						Command com = DeleteCommand.create(domain, card);
						command.appendIfCanExecute(com);
				}
			}
		}
		
		if (fareData.getAfterSalesRules()!=null) {
		for (AfterSalesRule object: fareData.getAfterSalesRules().getAfterSalesRules()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareElements()) 
					&& !GtmUtils.isReferenced(object,fareData.getFareConstraintBundles())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
		
		if (fareData.getCarrierConstraints()!=null) {
		for (CarrierConstraint object: fareData.getCarrierConstraints().getCarrierConstraints()) {
			if (   !GtmUtils.isReferenced(object,fareData.getFareElements()) 
				&& !GtmUtils.isReferenced(object,fareData.getFareConstraintBundles())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
		
		if (fareData.getCombinationConstraints() !=null) {
		for (CombinationConstraint object: fareData.getCombinationConstraints().getCombinationConstraints()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareConstraintBundles())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}		
		
		if (fareData.getConnectionPoints() !=null) {
		for (ConnectionPoint object: fareData.getConnectionPoints().getConnectionPoints()) {
				if (   !GtmUtils.isReferenced(object,fareData.getRegionalConstraints())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}		
		
		if (fareData.getSalesAvailabilityConstraints() !=null) {
		for (SalesAvailabilityConstraint object: fareData.getSalesAvailabilityConstraints().getSalesAvailabilityConstraints()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareConstraintBundles())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}	
		
		if (fareData.getTravelValidityConstraints() !=null) {
		for (TravelValidityConstraint object: fareData.getTravelValidityConstraints().getTravelValidityConstraints()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareConstraintBundles())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
		
		if (fareData.getPassengerConstraints() !=null) {
		for (PassengerConstraint object: fareData.getPassengerConstraints().getPassengerConstraints()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareElements())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
		
		if (fareData.getPersonalDataConstraints() !=null) {
		for (PersonalDataConstraint object: fareData.getPersonalDataConstraints().getPersonalDataConstraints()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareConstraintBundles())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}

		if (fareData.getTotalPassengerCombinationConstraints() !=null) {
		for (TotalPassengerCombinationConstraint object: fareData.getTotalPassengerCombinationConstraints().getTotalPassengerCombinationConstraint()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareConstraintBundles())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
		
		if (fareData.getFareConstraintBundles() !=null) {
		for (FareConstraintBundle object: fareData.getFareConstraintBundles().getFareConstraintBundles()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareElements())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
		
		if (fareData.getPrices() !=null) {
		for (Price object: fareData.getPrices().getPrices()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareElements())
					&& !GtmUtils.isReferenced(object,fareData.getAfterSalesRules())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
		
		if (fareData.getReductionConstraints() !=null) {
		for (ReductionConstraint object: fareData.getReductionConstraints().getReductionConstraints()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareElements())
					&& !GtmUtils.isReferenced(object,fareData.getAfterSalesRules())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
		
		if (fareData.getFulfillmentConstraints() !=null) {
		for (FulfillmentConstraint object: fareData.getFulfillmentConstraints().getFulfillmentConstraints()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareConstraintBundles())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
		
		if (fareData.getRegionalConstraints() !=null) {
		for (RegionalConstraint object: fareData.getRegionalConstraints().getRegionalConstraints()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareElements())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
		
		if (fareData.getServiceClassDefinitions() !=null) {
		for (ServiceClass object: fareData.getServiceClassDefinitions().getServiceClassDefinitions() ) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareElements()) 
					&& !GtmUtils.isReferenced(object,fareData.getReductionCards())
					&& !GtmUtils.isReferenced(object,fareData.getServiceConstraints()) 
				    && !GtmUtils.isReferenced(object,fareData.getServiceLevelDefinitions())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
		
		if (fareData.getTexts() !=null) {
		for (Text object: fareData.getTexts().getTexts() ) {
				if (   !GtmUtils.isReferenced(object,fareData)) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}
		
		if (fareData.getZoneDefinitions() !=null) {
		for (ZoneDefinition object: fareData.getZoneDefinitions().getZoneDefinition()) {
				if (   !GtmUtils.isReferenced(object,fareData.getRegionalConstraints())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}		
		
		if (fareData.getServiceConstraints() !=null) {
		for (ServiceConstraint object: fareData.getServiceConstraints().getServiceConstraints()) {
				if (   !GtmUtils.isReferenced(object,fareData.getFareElements())) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}	
				
		
		if (command.isEmpty() && command.canExecute()) {
			return command;
		} 
		return null;
	}
	
	public static CompoundCommand createCalendarCleanupCommand(EditingDomain domain,FareStructure fareData) {
				
		if (fareData == null) return null;
		
		CompoundCommand command = new CompoundCommand();
		
		if (fareData.getCalendars() != null) {
			for (Calendar cal : fareData.getCalendars().getCalendars()) {
				if (   !GtmUtils.isReferenced(cal,fareData.getAfterSalesRules())
					&& !GtmUtils.isReferenced(cal,fareData.getTravelValidityConstraints())
					&& !GtmUtils.isReferenced(cal,fareData.getSalesAvailabilityConstraints())) {
					Command com = DeleteCommand.create(domain, cal);
					command.appendIfCanExecute(com);
				}
			}
		}

		if (command.isEmpty() && command.canExecute()) {
			return command;
		} 
		return null;
	}
	
	public static CompoundCommand createTextCleanupCommand(EditingDomain domain,FareStructure fareData) {
		
		
		if (fareData == null) return null;
		
		CompoundCommand command = new CompoundCommand();
		
	
		if (fareData.getTexts() !=null) {
		for (Text object: fareData.getTexts().getTexts() ) {
				if (   !GtmUtils.isReferenced(object,fareData)) {
						Command com = DeleteCommand.create(domain, object);
						command.appendIfCanExecute(com);
				}
			}
		}				
		
		if (command.isEmpty() && command.canExecute()) {
			return command;
		} 
		return null;
	}
	

}
