package Gtm.actions.utils;

import java.util.ArrayList;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import Gtm.FareConstraintBundle;
import Gtm.FareElement;
import Gtm.FareTemplate;
import Gtm.GTMTool;
import Gtm.GtmPackage;
import Gtm.TotalPassengerCombinationConstraint;
import Gtm.actions.constraintBundles.ConstraintBundleFactory;

public class MigrationCommandV2 {
	
	public static void migrateV2(EditingDomain domain) {
			
		Resource resource = domain.getResourceSet().getResources().get(0);
	   	
		TreeIterator<EObject> it = resource.getAllContents();
		EObject object = it.next();
		
		if (object == null) return;

		GTMTool tool = null;
		if (object instanceof GTMTool){
			tool = (GTMTool) object;
		} else {
			return;
		}
		
		CompoundCommand command =  getMigrationV2Command (tool,domain);
		
		if (command != null && !command.isEmpty()) {
			domain.getCommandStack().execute(command);
		}
	}
	
	
	public static CompoundCommand getMigrationV2Command (GTMTool tool, EditingDomain domain) {
		
		CompoundCommand command = new CompoundCommand();
		
		if (tool != null &&
			tool.getGeneralTariffModel() != null &&
			tool.getGeneralTariffModel().getFareStructure() != null &&
			tool.getGeneralTariffModel().getFareStructure().getFareElements() != null) {
		
			
			ArrayList<TotalPassengerCombinationConstraint> totalPassengerCombinationConstraints 
			 	= ConstraintBundleFactory.createTotalPassengerCombinationConstraints(
			 		tool.getGeneralTariffModel().getFareStructure());
			
		
			ArrayList<FareConstraintBundle> fareConstraintBundles 
			     = ConstraintBundleFactory.createFareConstraintBundles(
			    	tool.getGeneralTariffModel().getFareStructure(),
					tool.getConversionFromLegacy().getParams().getLegacyFareTemplates(), 
					totalPassengerCombinationConstraints);
			
			//add passenger combination constraint
			Command com1 = AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure(), GtmPackage.Literals.FARE_STRUCTURE__TOTAL_PASSENGER_COMBINATION_CONSTRAINTS, totalPassengerCombinationConstraints);
			
			//add fare constraint bundles
			Command com2 = AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure(), GtmPackage.Literals.FARE_STRUCTURE__FARE_CONSTRAINT_BUNDLES, fareConstraintBundles);

			if (com1 != null && com1.canExecute()) {
				command.append(com1);
			}
			if (com2 != null && com2.canExecute()) {
				command.append(com2);
			}
			
			//update fare templates
			for (FareTemplate template : tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates()) {
				
				if (template.getFareConstraintBundle() == null) {
					
					Command com = getUpdateCommand(template,fareConstraintBundles,domain);
					
					if (com != null) {
						command.append(com);
					}
				}

			}
			
			
		//update fares
		if (tool.getGeneralTariffModel().getFareStructure().getFareElements() != null &&
			tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements() != null)
			for (FareElement fare : tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements()) {
			
				if (fare.getFareConstraintBundle() == null) {
				
					Command com = getFareUpdateCommand(fare,fareConstraintBundles,domain);
				
					if (com != null) {
						command.append(com);
					}
				}
			}
		}			

		return command;
	}	
	
	
	private static Command getFareUpdateCommand(FareElement fare, ArrayList<FareConstraintBundle> fareConstraintBundles,
			EditingDomain domain) {
		
		 FareConstraintBundle bundle = ConstraintBundleFactory.findFittingBundle(fare, fareConstraintBundles);

		 CompoundCommand command = new CompoundCommand();
		 
		 if (bundle != null) {
			 
				Command com1 =  SetCommand.create(domain, fare, GtmPackage.Literals.FARE_ELEMENT__FARE_CONSTRAINT_BUNDLE, bundle);
				if (com1 != null) {
					command.append(com1);
				}
					
				if (fare.getCombinationConstraint() != null) {
					Command com2 =  SetCommand.create(domain, fare, GtmPackage.Literals.FARE_ELEMENT__COMBINATION_CONSTRAINT, null);
					if (com2 != null) {
						command.append(com2);
					}
				}
			 
				if (fare.getFulfillmentConstraint() != null) {
					Command com2 =  SetCommand.create(domain, fare, GtmPackage.Literals.FARE_ELEMENT__FULFILLMENT_CONSTRAINT, null);
					if (com2 != null) {
						command.append(com2);
					}
				}			
				
				if (fare.getPersonalDataConstraint() != null) {
					Command com2 =  SetCommand.create(domain, fare, GtmPackage.Literals.FARE_ELEMENT__PERSONAL_DATA_CONSTRAINT, null);
					if (com2 != null) {
						command.append(com2);
					}
				}				
				
				if (fare.getSalesAvailability() != null) {
					Command com2 =  SetCommand.create(domain, fare, GtmPackage.Literals.FARE_ELEMENT__SALES_AVAILABILITY, null);
					if (com2 != null) {
						command.append(com2);
					}
				}				
				
				if (fare.getTravelValidity() != null) {
					Command com2 =  SetCommand.create(domain, fare, GtmPackage.Literals.FARE_ELEMENT__TRAVEL_VALIDITY, null);
					if (com2 != null) {
						command.append(com2);
					}
				}				 
			 
			 
		 }
		
		return null;
	}


	public static Command getUpdateCommand(FareTemplate template ,  ArrayList<FareConstraintBundle> fareConstraintBundles, EditingDomain domain) {

		 FareConstraintBundle bundle = ConstraintBundleFactory.findFittingBundle(template, fareConstraintBundles);

		 FareConstraintBundle separateTicketBundle = ConstraintBundleFactory.findFittingSeparateTicketBundle(template, fareConstraintBundles);

		 CompoundCommand command = new CompoundCommand();
		 
		 if (bundle != null) {
			Command com1 =  SetCommand.create(domain, template, GtmPackage.Literals.FARE_TEMPLATE__FARE_CONSTRAINT_BUNDLE, bundle);
			if (com1 != null) {
				command.append(com1);
			}
				
			if (template.getCombinationConstraint() != null) {
				Command com2 =  SetCommand.create(domain, template, GtmPackage.Literals.FARE_TEMPLATE__COMBINATION_CONSTRAINT, null);
				if (com2 != null) {
					command.append(com2);
				}
			}
		 
			if (template.getFulfillmentConstraint() != null) {
				Command com2 =  SetCommand.create(domain, template, GtmPackage.Literals.FARE_TEMPLATE__FULFILLMENT_CONSTRAINT, null);
				if (com2 != null) {
					command.append(com2);
				}
			}			
			
			if (template.getPersonalDataConstraint() != null) {
				Command com2 =  SetCommand.create(domain, template, GtmPackage.Literals.FARE_TEMPLATE__PERSONAL_DATA_CONSTRAINT, null);
				if (com2 != null) {
					command.append(com2);
				}
			}				
			
			if (template.getSalesAvailability() != null) {
				Command com2 =  SetCommand.create(domain, template, GtmPackage.Literals.FARE_TEMPLATE__SALES_AVAILABILITY, null);
				if (com2 != null) {
					command.append(com2);
				}
			}				
			
			if (template.getTravelValidity() != null) {
				Command com2 =  SetCommand.create(domain, template, GtmPackage.Literals.FARE_TEMPLATE__TRAVEL_VALIDITY, null);
				if (com2 != null) {
					command.append(com2);
				}
			}	
			
			if (separateTicketBundle != null) {
				Command com2 =  SetCommand.create(domain, template, GtmPackage.Literals.FARE_TEMPLATE__SEPARATE_CONTRACT_FARE_CONSTRAINT_BUNDLE, separateTicketBundle);
				if (com2 != null) {
					command.append(com2);
				}
			}
		}
		 

		
		if (command.isEmpty() && command.canExecute()) {
			return command;
		}
		return command;
	}
	

	
	
	

}
