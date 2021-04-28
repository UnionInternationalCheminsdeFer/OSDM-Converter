package Gtm.utils;

import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;

import Gtm.Countries;
import Gtm.Country;
import Gtm.FareConstraintBundle;
import Gtm.FareConstraintBundles;
import Gtm.FareElement;
import Gtm.FareTemplate;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.TotalPassengerCombinationConstraint;
import Gtm.TotalPassengerCombinationConstraints;
import Gtm.nls.NationalLanguageSupport;
import Gtm.presentation.GtmEditor;
import Gtm.presentation.GtmEditorPlugin;

/**
 * The Class MigrationV2.
 */
public class MigrationV2 {
	
	/**
	 * Migrate V 2.
	 * 
	 * Migrate from data model version 1 to the data mode of OSDM 1.1 including fare constraint bundles
	 *
	 * @param domain the domain
	 * @param editor the editor
	 */
	public static void migrateV2(EditingDomain domain,GtmEditor editor) {
			
		Resource resource = domain.getResourceSet().getResources().get(0);
	   	
		TreeIterator<EObject> it = resource.getAllContents();
		EObject object = it.next();
		
		if (object == null) return;
	
		runMigration(domain, editor);
		

	}


	/**
	 * Run migration.
	 *
	 * @param domain the domain
	 * @param editor the editor
	 */
	private static void runMigration(EditingDomain domain, GtmEditor editor) {
		
		Resource resource = domain.getResourceSet().getResources().get(0);
	   	
		TreeIterator<EObject> it = resource.getAllContents();
		EObject object = it.next();
		
		if (object == null) return;

		if (!(object instanceof GTMTool)){
			return;
		}
		
		
		updateCountries((GTMTool)object, editor);
		
		migrateTariffIds((GTMTool)object,domain);

		if (!conversionNeeded((GTMTool)object)){
			return;
		}
		
		IRunnableWithProgress operation =	new IRunnableWithProgress() {
			// This is the method that gets invoked when the operation runs.
			
			public void run(IProgressMonitor monitor) {
				
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

				monitor.beginTask(NationalLanguageSupport.ConvertGtmMigartionV2, 2); 

				monitor.subTask(NationalLanguageSupport.ConvertGtmMigartionV2_prepareBundles);
				CompoundCommand command =  getMigrationV2Command (tool,domain);	
				monitor.worked(1);
				
				monitor.subTask(NationalLanguageSupport.ConvertGtmMigartionV2_addBundles);
				if (command != null && !command.isEmpty()) {
					domain.getCommandStack().execute(command);
				}
				monitor.worked(1);

				monitor.done();
			}


		};	
		
		try {
			// This runs the operation, and shows progress.		
			editor.disconnectViews();
	
			new ProgressMonitorDialog(editor.getSite().getShell()).run(true, false, operation);

		} catch (Exception exception) {
			// Something went wrong that shouldn't.
			exception.printStackTrace();
			GtmEditorPlugin.INSTANCE.log(exception);				
		} finally {
			if (editor != null) {
				editor.reconnectViews();
			}
		}			

		return;

	}
	
	private static void migrateTariffIds(GTMTool tool, EditingDomain domain) {
		
		if (tool == null ||
			tool.getConversionFromLegacy() == null ||
			tool.getConversionFromLegacy().getParams() == null ||
			tool.getConversionFromLegacy().getParams().getLegacyFareTemplates() == null ||
			tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates() == null ||
			tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates().isEmpty() ) {

			return;
		}
		
		CompoundCommand com = new CompoundCommand();	
			
		
		for (FareTemplate t : tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates()) {
			
			if (t.getLegacyAccountingIdentifier() != null) {	
				int id = t.getLegacyAccountingIdentifier().getTariffId();
				com.append(SetCommand.create(domain, t,GtmPackage.Literals.FARE_TEMPLATE__LEGACY_ACCOUNTING_TARIFF_ID, id));
				com.append(DeleteCommand.create(domain, t.getLegacyAccountingIdentifier()));
			}
		}
		

		if (com != null && !com.isEmpty() && com.canExecute()) {
			domain.getCommandStack().execute(com);
		}
	}
	
	private static void updateCountries(GTMTool tool, GtmEditor editor) {
		
		Countries cs = GtmFactory.eINSTANCE.createCountries();
		
		GtmUtils.populateUICcountries(cs);
		
		CompoundCommand com = new CompoundCommand();
		
		for (Country c : cs.getCountries()) {
			
			boolean found = false;
			
			for (Country oldC : tool.getCodeLists().getCountries().getCountries()) {
				
				if (c.getCode() == oldC.getCode()) {
					found = true;
					if (!oldC.getISOcode().equals(c.getISOcode())) {
						com.append(SetCommand.create(editor.getEditingDomain(),oldC,GtmPackage.Literals.COUNTRY__IS_OCODE,c.getISOcode() ));
					}
					if (!oldC.getName().equals(c.getName())) {
						com.append(SetCommand.create(editor.getEditingDomain(),oldC,GtmPackage.Literals.COUNTRY__NAME,c.getName()));
					}
					if (oldC.getDefaultCharacterSet() == null || !c.getDefaultCharacterSet().equals(oldC.getDefaultCharacterSet())) {
						com.append(SetCommand.create(editor.getEditingDomain(),oldC,GtmPackage.Literals.COUNTRY__DEFAULT_CHARACTER_SET,c.getDefaultCharacterSet()));
					}
				}
			}
			
			if (!found) {
				com.append(AddCommand.create(editor.getEditingDomain(),tool.getCodeLists().getCountries(), GtmPackage.Literals.COUNTRIES__COUNTRIES,c));
			}

		}
		
		for (Country oldC : tool.getCodeLists().getCountries().getCountries()) {

			boolean found = false;
			
			for (Country c : cs.getCountries()) {
				
				if (c.getCode() == oldC.getCode()) {
					found = true;
				}
				
			}
			
			if (!found) {
				com.append(DeleteCommand.create(editor.getEditingDomain(), oldC));
			}
			
		}
		

		if (!com.isEmpty() && com.canExecute()) {
			editor.getEditingDomain().getCommandStack().execute(com);
			GtmUtils.writeConsoleInfo("Countries updated", editor);
		}
		
	}


	/**
	 * Conversion needed.
	 *
	 * @param tool the tool
	 * @return true, if successful
	 */
	private static boolean conversionNeeded(GTMTool tool) {
		
		if (  //we have no bundles
			 (tool.getGeneralTariffModel() == null || 
			  tool.getGeneralTariffModel().getFareStructure() == null ||
			  tool.getGeneralTariffModel().getFareStructure().getFareConstraintBundles() == null || 
			  tool.getGeneralTariffModel().getFareStructure().getFareConstraintBundles().getFareConstraintBundles().isEmpty() ) 
			&& 
			 ( //and either fares 
				  (tool.getGeneralTariffModel() != null &&
				   tool.getGeneralTariffModel().getFareStructure() != null &&
				   tool.getGeneralTariffModel().getFareStructure().getFareElements() != null &&
				   tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements() != null &&
				  !tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements().isEmpty() )
			 || (//or fare templates are there
				  tool.getConversionFromLegacy() != null &&
				  tool.getConversionFromLegacy().getParams() != null &&
				  tool.getConversionFromLegacy().getParams().getLegacyFareTemplates() != null &&
				  !tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates().isEmpty() )
			 ) 
			) {
			return true;
		}
		return false;
	}


	/**
	 * Gets the migration V 2 command.
	 *
	 * @param tool the tool
	 * @param domain the domain
	 * @return the migration V 2 command
	 */
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
			TotalPassengerCombinationConstraints tps = GtmFactory.eINSTANCE.createTotalPassengerCombinationConstraints();
			tps.getTotalPassengerCombinationConstraint().addAll(totalPassengerCombinationConstraints);
			Command com1 = SetCommand.create(domain, tool.getGeneralTariffModel().getFareStructure(), GtmPackage.Literals.FARE_STRUCTURE__TOTAL_PASSENGER_COMBINATION_CONSTRAINTS, tps);
			
			//add fare constraint bundles
			FareConstraintBundles fbs = GtmFactory.eINSTANCE.createFareConstraintBundles();
			fbs.getFareConstraintBundles().addAll(fareConstraintBundles);
			Command com2 = SetCommand.create(domain, tool.getGeneralTariffModel().getFareStructure(), GtmPackage.Literals.FARE_STRUCTURE__FARE_CONSTRAINT_BUNDLES, fbs);

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
	
	
	/**
	 * Gets the fare update command.
	 *
	 * @param fare the fare
	 * @param fareConstraintBundles the fare constraint bundles
	 * @param domain the domain
	 * @return the fare update command
	 */
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
		 
		 if (!command.isEmpty() && command.canExecute()) return command;
		
		return null;
	}


	/**
	 * Gets the update command.
	 *
	 * @param template the template
	 * @param fareConstraintBundles the fare constraint bundles
	 * @param domain the domain
	 * @return the update command
	 */
	public static Command getUpdateCommand(FareTemplate template ,  ArrayList<FareConstraintBundle> fareConstraintBundles, EditingDomain domain) {

		 FareConstraintBundle bundle = ConstraintBundleFactory.findFittingBundle(template, fareConstraintBundles);

		 FareConstraintBundle separateTicketBundle = ConstraintBundleFactory.findFittingSeparateTicketBundle(template, fareConstraintBundles);

		 CompoundCommand command = new CompoundCommand();
		 
		 if (bundle != null) {
			Command com1 =  SetCommand.create(domain, template, GtmPackage.Literals.FARE_TEMPLATE__FARE_CONSTRAINT_BUNDLE, bundle);
			if (com1 != null && com1.canExecute()) {
				command.append(com1);
			}
				
			if (template.getCombinationConstraint() != null) {
				Command com2 =  SetCommand.create(domain, template, GtmPackage.Literals.FARE_TEMPLATE__COMBINATION_CONSTRAINT, null);
				if (com2 != null && com2.canExecute()) {
					command.append(com2);
				}
			}
		 
			if (template.getFulfillmentConstraint() != null) {
				Command com2 =  SetCommand.create(domain, template, GtmPackage.Literals.FARE_TEMPLATE__FULFILLMENT_CONSTRAINT, null);
				if (com2 != null && com2.canExecute()) {
					command.append(com2);
				}
			}			
			
			if (template.getPersonalDataConstraint() != null) {
				Command com2 =  SetCommand.create(domain, template, GtmPackage.Literals.FARE_TEMPLATE__PERSONAL_DATA_CONSTRAINT, null);
				if (com2 != null && com2.canExecute()) {
					command.append(com2);
				}
			}				
			
			if (template.getSalesAvailability() != null) {
				Command com2 =  SetCommand.create(domain, template, GtmPackage.Literals.FARE_TEMPLATE__SALES_AVAILABILITY, null);
				if (com2 != null && com2.canExecute()) {
					command.append(com2);
				}
			}				
			
			if (template.getTravelValidity() != null) {
				Command com2 =  SetCommand.create(domain, template, GtmPackage.Literals.FARE_TEMPLATE__TRAVEL_VALIDITY, null);
				if (com2 != null && com2.canExecute()) {
					command.append(com2);
				}
			}	
			
			if (separateTicketBundle != null) {
				Command com2 =  SetCommand.create(domain, template, GtmPackage.Literals.FARE_TEMPLATE__SEPARATE_CONTRACT_FARE_CONSTRAINT_BUNDLE, separateTicketBundle);
				if (com2 != null && com2.canExecute()) {
					command.append(com2);
				}
			}
		}
		
		if (!command.isEmpty() && command.canExecute()) {
			return command;
		}
		return null;
	}

}
