package Gtm.jsonImportExport;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import Gtm.AfterSalesRule;
import Gtm.Calendar;
import Gtm.CarrierConstraint;
import Gtm.CombinationConstraint;
import Gtm.ConnectionPoint;
import Gtm.FareConstraintBundle;
import Gtm.FareElement;
import Gtm.FareStationSetDefinition;
import Gtm.FareStructure;
import Gtm.FulfillmentConstraint;
import Gtm.GTMTool;
import Gtm.GtmPackage;
import Gtm.LuggageConstraint;
import Gtm.PassengerConstraint;
import Gtm.PersonalDataConstraint;
import Gtm.Price;
import Gtm.ReductionCard;
import Gtm.ReductionConstraint;
import Gtm.RegionalConstraint;
import Gtm.ReservationParameter;
import Gtm.SalesAvailabilityConstraint;
import Gtm.ServiceConstraint;
import Gtm.ServiceLevel;
import Gtm.Text;
import Gtm.TotalPassengerCombinationConstraint;
import Gtm.TravelValidityConstraint;
import Gtm.utils.GtmUtils;

public class ObjectIdCreator {
	

	/**
	 * Sets the unique ids of contraints and fares.
	 *
	 * @param tool the tool
	 * @param domain the domain
	 * @return the compound command
	 */
	public static CompoundCommand setIds(GTMTool tool, EditingDomain domain) {
		
		if (tool == null || domain == null) return null;
		
		CompoundCommand command =  new CompoundCommand();
		
		FareStructure fareStructure = tool.getGeneralTariffModel().getFareStructure();
		
		String baseName = tool.getGeneralTariffModel().getDelivery().getProvider().getCode();
		baseName = baseName +"_"+ tool.getGeneralTariffModel().getDelivery().getId()+"_"; //$NON-NLS-1$ //$NON-NLS-2$
		
		String listName = baseName;
				
		listName = baseName + "A_"; //$NON-NLS-1$
		int i = 0;
		for (AfterSalesRule object : fareStructure.getAfterSalesRules().getAfterSalesRules()) {
			i++;
			setId(domain, object,GtmPackage.Literals.AFTER_SALES_RULE__ID, command, listName,i);
		}
		
		listName = baseName + "B_"; //$NON-NLS-1$
		i = 0;
		for (Calendar object : fareStructure.getCalendars().getCalendars()) {
			i++;
			setId(domain, object,GtmPackage.Literals.CALENDAR__ID, command, listName,i);
		}

		listName = baseName + "C_"; //$NON-NLS-1$
		i = 0;
		for (CarrierConstraint object : fareStructure.getCarrierConstraints().getCarrierConstraints()) {
			i++;
			setId(domain, object,GtmPackage.Literals.CARRIER_CONSTRAINT__ID, command, listName,i);
		}
		
		listName = baseName + "D_"; //$NON-NLS-1$
		i = 0;		
		for (CombinationConstraint object : fareStructure.getCombinationConstraints().getCombinationConstraints()) {
			i++;
			setId(domain, object,GtmPackage.Literals.COMBINATION_CONSTRAINT__ID, command, listName,i);
		}
		
		listName = baseName + "E_"; //$NON-NLS-1$
		i = 0;
		for (ConnectionPoint object : fareStructure.getConnectionPoints().getConnectionPoints()) {
			i++;
			setId(domain, object,GtmPackage.Literals.CONNECTION_POINT__ID, command, listName,i);
		}
		
		for (FulfillmentConstraint object : fareStructure.getFulfillmentConstraints().getFulfillmentConstraints()) {
			i++;
			setId(domain, object,GtmPackage.Literals.FULFILLMENT_CONSTRAINT__ID, command, listName,i);
		}
		
		listName = baseName + "G_"; //$NON-NLS-1$
		i = 0;
		for (PassengerConstraint object : fareStructure.getPassengerConstraints().getPassengerConstraints()) {
			i++;
			setId(domain, object,GtmPackage.Literals.PASSENGER_CONSTRAINT__ID, command, listName,i);
		}		
		
		listName = baseName + "H_"; //$NON-NLS-1$
		i = 0;
		for (PersonalDataConstraint object : fareStructure.getPersonalDataConstraints().getPersonalDataConstraints()) {
			i++;
			setId(domain, object,GtmPackage.Literals.PERSONAL_DATA_CONSTRAINT__ID, command, listName,i);
		}		
		
		listName = baseName + "I_"; //$NON-NLS-1$
		i = 0;
		for (Price object : fareStructure.getPrices().getPrices()) {
			i++;
			setId(domain, object,GtmPackage.Literals.PRICE__ID, command, listName,i);
		}		
		
		String issuer = tool.getGeneralTariffModel().getDelivery().getProvider().getCode();
		i = 0;
		for (ReductionCard card : fareStructure.getReductionCards().getReductionCards()) {
			i++;
			String issuerR = issuer;
			if (card.getCardIssuer() != null) {
				issuerR = card.getCardIssuer().getCode();
			}
			String oldId = card.getId();
			if (card.getId() == null || !card.getId().startsWith("UIC_")) {
				//non UIC standard card definition
				if (card.getId() == null || card.getId().isEmpty()) {
					setId(domain, card,GtmPackage.Literals.PERSONAL_DATA_CONSTRAINT__ID, command, issuerR + "_",i);
					GtmUtils.writeConsoleWarning("Reduction Card Id was missing. Set to: " + card.getId(), null);
				} else {
					if (card.getId() != null && !card.getId().startsWith(issuerR)) {
						StringBuilder sb = new StringBuilder();
						sb.append(issuerR).append("_");
						sb.append(card.getId().replace(' ','_'));
						SetCommand cmd = new SetCommand(domain, card,GtmPackage.Literals.REDUCTION_CARD__ID, sb.toString()); 
						if (cmd.canExecute()) {
							command.append(cmd);
						}
					} else {
						StringBuilder sb = new StringBuilder();
						sb.append(card.getId().replace(' ','_'));
						SetCommand cmd = new SetCommand(domain, card,GtmPackage.Literals.REDUCTION_CARD__ID, sb.toString()); 
						if (cmd.canExecute()) {
							command.append(cmd);
						}
					}
					if (!card.getId().equals(oldId)) {
						GtmUtils.writeConsoleWarning("Reduction Card Id was corrected. Set to: " + card.getId(), null);
					}
				}
			}
		}		
		
		listName = baseName + "K_"; //$NON-NLS-1$
		i = 0;
		for (ReductionConstraint object : fareStructure.getReductionConstraints().getReductionConstraints()) {
			i++;
			setId(domain, object,GtmPackage.Literals.REDUCTION_CONSTRAINT__ID, command, listName,i);
		}		
		
		for (RegionalConstraint object : fareStructure.getRegionalConstraints().getRegionalConstraints()) {
			i++;
			setId(domain, object,GtmPackage.Literals.REGIONAL_CONSTRAINT__ID, command, listName,i);
		}	
		
		listName = baseName + "L_"; //$NON-NLS-1$
		i = 0;
		for (ReservationParameter object : fareStructure.getReservationParameters().getReservationParameters()) {
			i++;
			setId(domain, object,GtmPackage.Literals.RESERVATION_PARAMETER__ID, command, listName,i);
		}			
		
		listName = baseName + "M_"; //$NON-NLS-1$
		i = 0;
		for (SalesAvailabilityConstraint object : fareStructure.getSalesAvailabilityConstraints().getSalesAvailabilityConstraints()) {
			i++;
			setId(domain, object,GtmPackage.Literals.SALES_AVAILABILITY_CONSTRAINT__ID, command, listName,i);
		}	
		
		
		listName = baseName + "N_"; //$NON-NLS-1$
		i = 0;
		for (ServiceConstraint object : fareStructure.getServiceConstraints().getServiceConstraints()) {
			i++;
			setId(domain, object,GtmPackage.Literals.SERVICE_CONSTRAINT__ID, command, listName,i);
		}	
		
		listName = baseName + "O_"; //$NON-NLS-1$
		i = 0;
		for (ServiceLevel object : fareStructure.getServiceLevelDefinitions().getServiceLevelDefinition()) {
			i++;
			setId(domain, object,GtmPackage.Literals.SERVICE_LEVEL__ID, command, listName,i);
		}	
		
		listName = baseName + "P_"; //$NON-NLS-1$
		i = 0;
		for (Text object : fareStructure.getTexts().getTexts()) {
			i++;
			setId(domain, object,GtmPackage.Literals.TEXT__ID, command, listName,i);
		}	
		
		listName = baseName + "Q_"; //$NON-NLS-1$
		i = 0;
		for (TravelValidityConstraint object : fareStructure.getTravelValidityConstraints().getTravelValidityConstraints()) {
			i++;
			setId(domain, object,GtmPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__ID, command, listName,i);
		}		
		
		listName = baseName + "R_"; //$NON-NLS-1$
		i = 0;
		for (FareStationSetDefinition object : fareStructure.getFareStationSetDefinitions().getFareStationSetDefinitions()) {
			i++;
			setId(domain, object,GtmPackage.Literals.FARE_STATION_SET_DEFINITION__ID, command, listName,i);
		}						

		listName = baseName + "S_"; //$NON-NLS-1$
		i = 0;
		for (FareConstraintBundle object : fareStructure.getFareConstraintBundles().getFareConstraintBundles()) {
			i++;
			setId(domain, object,GtmPackage.Literals.FARE_CONSTRAINT_BUNDLE__ID, command, listName,i);
		}
		
		listName = baseName + "T_"; //$NON-NLS-1$
		i = 0;
		for (TotalPassengerCombinationConstraint object : fareStructure.getTotalPassengerCombinationConstraints().getTotalPassengerCombinationConstraint()) {
			i++;
			setId(domain, object,GtmPackage.Literals.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__ID, command, listName,i);
		}
		
		listName = baseName + "U_"; //$NON-NLS-1$
		i = 0;
		for (LuggageConstraint object : fareStructure.getLuggageConstraints().getConstraints()) {
			i++;
			setId(domain, object,GtmPackage.Literals.LUGGAGE_CONSTRAINT__ID, command, listName,i);
		}
		
        return command;
		
	}
	
	/**
	 * Sets the fare ids.
	 *
	 * @param tool the tool
	 * @param domain the domain
	 * @return the compound command
	 */
	public static CompoundCommand setFareIds(GTMTool tool, EditingDomain domain) {
		
		if (tool == null || domain == null) return null;
		
		CompoundCommand command =  new CompoundCommand();

		FareStructure fareStructure = tool.getGeneralTariffModel().getFareStructure();
		
		for (FareElement object : fareStructure.getFareElements().getFareElements()) {
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.FARE_ELEMENT__ID, command);
			}
		}		
		       
        return command;

	}

	
	/**
	 * Sets the id.
	 *
	 * @param domain the domain
	 * @param object the object
	 * @param feature the feature
	 * @param command the command
	 * @param listName the list name
	 * @param index the index
	 */
	private static void setId(EditingDomain domain, EObject object, EStructuralFeature feature, CompoundCommand command, String listName, int index) {
		SetCommand cmd = new SetCommand(domain, object,feature, listName+"_"+Integer.toString(index)); //$NON-NLS-1$
		if (cmd.canExecute()) {
			command.append(cmd);
		}
	}

	/**
	 * Sets the id.
	 *
	 * @param domain the domain
	 * @param object the object
	 * @param feature the feature
	 * @param command the command
	 */
	private static void setId(EditingDomain domain, EObject object, EStructuralFeature feature, CompoundCommand command) {
		SetCommand cmd = new SetCommand(domain, object,feature, EcoreUtil.generateUUID());
		if (cmd.canExecute()) {
			command.append(cmd);
		}
	}

}
