package Gtm.utils;


import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;

import Gtm.AfterSalesRule;
import Gtm.Calendar;
import Gtm.Carrier;
import Gtm.CarrierConstraint;
import Gtm.CharacterSet;
import Gtm.CodeLists;
import Gtm.CombinationConstraint;
import Gtm.ConnectionPoint;
import Gtm.Countries;
import Gtm.Country;
import Gtm.Currencies;
import Gtm.Currency;
import Gtm.FareConstraintBundle;
import Gtm.FareElement;
import Gtm.FareStationSetDefinition;
import Gtm.FareStructure;
import Gtm.FulfillmentConstraint;
import Gtm.GTMTool;
import Gtm.GenericReductionCards;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.Language;
import Gtm.Languages;
import Gtm.PassengerConstraint;
import Gtm.PersonalDataConstraint;
import Gtm.Price;
import Gtm.ReductionCard;
import Gtm.ReductionConstraint;
import Gtm.RegionalConstraint;
import Gtm.ReservationParameter;
import Gtm.SalesAvailabilityConstraint;
import Gtm.ServiceBrands;
import Gtm.ServiceConstraint;
import Gtm.ServiceLevel;
import Gtm.Station;
import Gtm.Text;
import Gtm.TotalPassengerCombinationConstraint;
import Gtm.TravelValidityConstraint;
import Gtm.WorkflowHistory;
import Gtm.WorkflowStep;
import Gtm.console.ConsoleUtil;
import Gtm.nls.NationalLanguageSupport;
import Gtm.preferences.PreferenceConstants;
import Gtm.preferences.PreferencesAccess;
import Gtm.presentation.DirtyCommand;
import Gtm.presentation.GtmEditor;
import Gtm.presentation.GtmEditorPlugin;
import Gtm.provider.GtmItemProviderAdapterFactory;

import com.ibm.icu.text.Transliterator;

/**
 * The Class GtmUtils.
 * 
 * utilities to handle commands, messages message boxes
 * 
 */
public class GtmUtils {
	
	/** The one hundred. */
	private static 	BigDecimal oneHundred = new BigDecimal("100.0");
	
	private static DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd"); //$NON-NLS-1$
	
	
	/**
	 * Gets the active editor.
	 *
	 * @return the active editor
	 */
	public static GtmEditor getActiveEditor() {

		if (PlatformUI.getWorkbench() != null &&
			PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null &&
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()!= null &&
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor() != null) {
		   	return (GtmEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor() ;
		}

		
		IWorkbench wb = PlatformUI.getWorkbench();
		if (wb == null) return null;
		for (IWorkbenchWindow win : wb.getWorkbenchWindows()) {
				if (win.getPartService().getActivePart() instanceof GtmEditor) {
					return (GtmEditor)  win.getPartService().getActivePart();
				}
		}
		return null;
	}
	
	/**
	 * Gets the gtm tool data node.
	 *
	 * @param editingDomainProvider the editing domain provider
	 * @return the gtm tool
	 */
	public static GTMTool getGtmTool(IEditingDomainProvider editingDomainProvider) {
	   		   	
	   	IEditorPart editor =  getActiveEditor();
	   	if (editor == null) return null;
		EditingDomain domain = ((GtmEditor) editor).getEditingDomain();
		Resource resource = domain.getResourceSet().getResources().get(0);
	   	
		TreeIterator<EObject> it = resource.getAllContents();
		EObject object = it.next();
		
		if (object == null) return null;

		if (object instanceof GTMTool){
			return (GTMTool) object;
		} else {
			return null;
		}
	}
	
	/**
	 * Gets the gtm tool data node.
	 *
	 * @return the gtm tool
	 */
	public static GTMTool getGtmTool() {
	   	
	   	IEditorPart editor =  getActiveEditor();
	   	if (editor == null) return null;
	   	EditingDomain domain = ((GtmEditor) editor).getEditingDomain();
		Resource resource = domain.getResourceSet().getResources().get(0);
	   	
		TreeIterator<EObject> it = resource.getAllContents();
		EObject object = it.next();
		
		if (object == null) return null;

		if (object instanceof GTMTool){
			return (GTMTool) object;
		} else {
			return null;
		}
	}
	
	/**
	 * Execute and flush and run the garbage collector.
	 *
	 * @param command the command
	 * @param domain the domain
	 */
	public static void executeAndFlush(Command command, EditingDomain domain, GtmEditor editor) {
		
		if (command == null || domain == null) {
			return;
		}
		
		if (command instanceof CompoundCommand) {
			if (((CompoundCommand)command).isEmpty()) return;
		}
		
		if (command.canExecute()) {
			domain.getCommandStack().execute(command);
			domain.getCommandStack().flush();
			domain.getCommandStack().execute(new DirtyCommand());
		} else {
			String message = NationalLanguageSupport.ConverterFromLegacy_52 + command.getDescription();
			GtmUtils.writeConsoleError(message, editor);
		}
		
		System.gc();
		
	}
	
	/**
	 * Execute and flush a command and ask for the garbage collector.
	 *
	 * @param command the command
	 * @param domain the domain
	 */
	public static void executeAndFlush(CompoundCommand command, EditingDomain domain) {
		
		if (command != null && domain != null && !command.isEmpty() && command.canExecute()) {
			domain.getCommandStack().execute(command);
			domain.getCommandStack().flush();
			domain.getCommandStack().execute(new DirtyCommand());
		} else {
			String message = "could not change data: " + command.getDescription();
			GtmUtils.writeConsoleError(message,null);
		}
		
		System.gc();
		
	}
	
	/**
	 * Gets the active domain.
	 *
	 * @return the active domain
	 */
	public static EditingDomain getActiveDomain() {
	   	IEditorPart editor =  getActiveEditor();
	   	if (editor == null) return null;
	   	return ((GtmEditor) editor).getEditingDomain();
	}
	

	

	public static boolean isStandardTextId(String id) {
		
		if (id == null || id.length() == 0) return true;
		
		for (GenericReductionCards card : GenericReductionCards.values()) {
			
			if (card.getName().equals(id)) {
				return true;
			}
			
		}
		
		return false;
	}




	/**
	 * Find carrier.
	 *
	 * @param tool the tool
	 * @param code the code
	 * @return the carrier
	 */
	static Carrier findCarrier(GTMTool tool, String code) {
		
		if (tool == null || tool.getCodeLists() == null || tool.getCodeLists() == null) {
			return null;
		}
		
		for (Carrier carrier : tool.getCodeLists().getCarriers().getCarriers()){
			if (carrier.getCode().equalsIgnoreCase(code)) {
				return carrier;				
			}
		}
		return null;
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
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.AFTER_SALES_RULE__ID, command, listName,i);
			}
		}
		
		listName = baseName + "B_"; //$NON-NLS-1$
		i = 0;
		for (Calendar object : fareStructure.getCalendars().getCalendars()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.CALENDAR__ID, command, listName,i);
			}
		}

		listName = baseName + "C_"; //$NON-NLS-1$
		i = 0;
		for (CarrierConstraint object : fareStructure.getCarrierConstraints().getCarrierConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.CARRIER_CONSTRAINT__ID, command, listName,i);
			}
		}
		
		listName = baseName + "D_"; //$NON-NLS-1$
		i = 0;		
		for (CombinationConstraint object : fareStructure.getCombinationConstraints().getCombinationConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.COMBINATION_CONSTRAINT__ID, command, listName,i);
			}
		}
		
		listName = baseName + "E_"; //$NON-NLS-1$
		i = 0;
		for (ConnectionPoint object : fareStructure.getConnectionPoints().getConnectionPoints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.CONNECTION_POINT__ID, command, listName,i);
			}
		}
		
		for (FulfillmentConstraint object : fareStructure.getFulfillmentConstraints().getFulfillmentConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.FULFILLMENT_CONSTRAINT__ID, command, listName,i);
			}
		}
		
		listName = baseName + "G_"; //$NON-NLS-1$
		i = 0;
		for (PassengerConstraint object : fareStructure.getPassengerConstraints().getPassengerConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.PASSENGER_CONSTRAINT__ID, command, listName,i);
			}
		}		
		
		listName = baseName + "H_"; //$NON-NLS-1$
		i = 0;
		for (PersonalDataConstraint object : fareStructure.getPersonalDataConstraints().getPersonalDataConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.PERSONAL_DATA_CONSTRAINT__ID, command, listName,i);
			}
		}		
		
		listName = baseName + "I_"; //$NON-NLS-1$
		i = 0;
		for (Price object : fareStructure.getPrices().getPrices()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.PRICE__ID, command, listName,i);
			}
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
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.REDUCTION_CONSTRAINT__ID, command, listName,i);
			}
		}		
		
		for (RegionalConstraint object : fareStructure.getRegionalConstraints().getRegionalConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.REGIONAL_CONSTRAINT__ID, command, listName,i);
			}
		}	
		
		listName = baseName + "L_"; //$NON-NLS-1$
		i = 0;
		for (ReservationParameter object : fareStructure.getReservationParameters().getReservationParameters()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.RESERVATION_PARAMETER__ID, command, listName,i);
			}
		}			
		
		listName = baseName + "M_"; //$NON-NLS-1$
		i = 0;
		for (SalesAvailabilityConstraint object : fareStructure.getSalesAvailabilityConstraints().getSalesAvailabilityConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.SALES_AVAILABILITY_CONSTRAINT__ID, command, listName,i);
			}
		}	
		
		
		listName = baseName + "N_"; //$NON-NLS-1$
		i = 0;
		for (ServiceConstraint object : fareStructure.getServiceConstraints().getServiceConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.SERVICE_CONSTRAINT__ID, command, listName,i);
			}
		}	
		
		listName = baseName + "O_"; //$NON-NLS-1$
		i = 0;
		for (ServiceLevel object : fareStructure.getServiceLevelDefinitions().getServiceLevelDefinition()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.SERVICE_LEVEL__ID, command, listName,i);
			}
		}	
		
		listName = baseName + "P_"; //$NON-NLS-1$
		i = 0;
		for (Text object : fareStructure.getTexts().getTexts()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.TEXT__ID, command, listName,i);
			}
		}	
		
		listName = baseName + "Q_"; //$NON-NLS-1$
		i = 0;
		for (TravelValidityConstraint object : fareStructure.getTravelValidityConstraints().getTravelValidityConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__ID, command, listName,i);
			}
		}		
		
		listName = baseName + "R_"; //$NON-NLS-1$
		i = 0;
		for (FareStationSetDefinition object : fareStructure.getFareStationSetDefinitions().getFareStationSetDefinitions()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.FARE_STATION_SET_DEFINITION__ID, command, listName,i);
			}
		}						

		listName = baseName + "S_"; //$NON-NLS-1$
		i = 0;
		for (FareConstraintBundle object : fareStructure.getFareConstraintBundles().getFareConstraintBundles()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.FARE_CONSTRAINT_BUNDLE__ID, command, listName,i);
			}
		}
		
		listName = baseName + "T_"; //$NON-NLS-1$
		i = 0;
		for (TotalPassengerCombinationConstraint object : fareStructure.getTotalPassengerCombinationConstraints().getTotalPassengerCombinationConstraint()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.TOTAL_PASSENGER_COMBINATION_CONSTRAINT__ID, command, listName,i);
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
	
	
	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path.
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		
		Bundle bundle = Platform.getBundle(GtmEditorPlugin.PLUGIN_ID);
		URL fileURL = bundle.getEntry(path); //$NON-NLS-1$
		return ImageDescriptor.createFromURL(fileURL);
	}
	
	/**
	 * Clear command stack and mark it as dirty.
	 *
	 * @param domain the domain
	 */
	public static void clearCommandStack(EditingDomain domain) {
		//clears the command stack to reduce the memory footprint
		boolean isDirty = false;
		if (domain.getCommandStack().getMostRecentCommand() != null) {
			isDirty = true;
		}
		domain.getCommandStack().flush();
		System.gc();
		if (isDirty) {
			domain.getCommandStack().execute(new DirtyCommand());
		}
	}
	
	/**
	 * Clear command stack and mark it as dirty.
	 */
	public static void clearCommandStack() {
		//clears the command stack to reduce the memory footprint
		boolean isDirty = false;
		if (GtmUtils.getActiveDomain().getCommandStack().getMostRecentCommand() != null) {
			isDirty = true;
		}
		GtmUtils.getActiveDomain().getCommandStack().flush();
		System.gc();
		if (isDirty) {
			GtmUtils.getActiveDomain().getCommandStack().execute(new DirtyCommand());
		}
	}
	
	


	/**
	 * To printable asc II.
	 *
	 * @param text the text
	 * @return the string
	 */
	public static String toPrintableAscII(String text) {
        // strips off all non-ASCII characters
        text = text.replaceAll("[^\\x00-\\x7F]", ""); //$NON-NLS-1$ //$NON-NLS-2$
 
        // erases all the ASCII control characters
        text = text.replaceAll("[\\p{Cntrl}&&[^\r\n\t]]", ""); //$NON-NLS-1$ //$NON-NLS-2$
         
        // removes non-printable characters from Unicode
        return text.replaceAll("\\p{C}", ""); //$NON-NLS-1$ //$NON-NLS-2$

	}
	
	/**
	 * Limit string length.
	 *
	 * @param s the s
	 * @param maxChar the max char
	 * @return the string
	 */
	public static String limitStringLength(String s, int maxChar) {
		if (s == null) return " "; //$NON-NLS-1$
		return s.substring(0, Math.min(maxChar, s.length()));
	}

	/**
	 * Limit string length with console entry.
	 *
	 * @param s the s
	 * @param maxChar the max char
	 * @param editor the editor
	 * @param text the text
	 * @return the string
	 */
	public static String limitStringLengthWithConsoleEntry(String s, int maxChar, GtmEditor editor, String text) {
		if (s == null) return " "; //$NON-NLS-1$
		if (s.length() <= maxChar) return s;
		
		
		String truncated = s.substring(0, Math.min(maxChar, s.length()));
		GtmUtils.writeConsoleError("text" + " truncated:" + s + " -- " + truncated, editor);//$NON-NLS-1$ //$NON-NLS-3$
		return truncated;
	}
	
	/**
	 * Import station.
	 *
	 * @param filter the filter
	 * @param country the country
	 * @return true, if successful
	 */
	public static boolean importStation(String filter, int country) {
		if (country < 1 || country > 99) return false;
		
		if (filter != null && filter.trim().length() > 0) {
			if (!filter.contains(String.valueOf(country))) return false;
		}
		
		String filterP = PreferencesAccess.getStringFromPreferenceStore(PreferenceConstants.P_IMPORT_CONTRY_FILTER);
		
		if (filterP != null && filterP.trim().length() > 0 ) {
			if (!filterP.contains(String.valueOf(country))) return false;
		}		
		
		return true;
		
	}
	
	/**
	 * Gets the station map.
	 *
	 * @param tool the tool
	 * @return the station map
	 */
	public static HashMap<Long,Station> getStationMap(GTMTool tool)	{
		
	    if (tool == null || tool.getConversionFromLegacy() == null || tool.getConversionFromLegacy().getParams() == null )	{
	    	return null;
	    }
		
		HashMap<Long,Station> stations = new HashMap<Long,Station>();
	
		for (Station station : tool.getCodeLists().getStations().getStations()) {
			
			if (station.getStationCode() > 0) {
				stations.put(station.getStationCode(), station);
			} 
		}
		return stations;
	}
	
	public static long getNumericStationCode(Station station) {
		long i = 0;
		if (station.getStationCode() > 0) {
			return station.getStationCode();
		}
		
		try {
			i = Long.parseLong(station.getCode()) + station.getCountry().getCode() * 100000;
		} catch (Exception e ) {
			return 0;
		}
		
		return i;
		
	}
		
	/**
	 * Write console error.
	 *
	 * @param message the message
	 * @param editor the editor
	 */
	public static void writeConsoleError(String message, GtmEditor editor) {
		
		if (message == null || message.length() == 0) {
			return;
		}
		try {
			if (editor == null) {
				Display display = getDisplay();
				if (display == null) return;
				display.asyncExec(() -> {
					ConsoleUtil.printError(NationalLanguageSupport.ConverterFromLegacy_53,"Error: " + message);
				});	
			} else {
				editor.getSite().getShell().getDisplay().asyncExec(() -> {
					ConsoleUtil.printError(NationalLanguageSupport.ConverterFromLegacy_53,"Error: " +  message);
				});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Display async error message.
	 *
	 * @param e the e
	 * @param text the text
	 */
	public static void displayAsyncErrorMessage(Exception e , String text) {
			
		GtmEditor editor = GtmUtils.getActiveEditor();
		
		GtmUtils.writeConsoleError(text + " - " + e.getMessage(), editor);

		Display display = getDisplay();
		
		final Shell shell =  display.getActiveShell();
		
			
		if (shell != null) {
			display.asyncExec(() -> {
				MessageBox dialog =  new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
				dialog.setText(text);
				if (e != null && e.getMessage() != null) {
					dialog.setMessage(e.getMessage());
				}
				dialog.open(); 
				e.printStackTrace();
				GtmEditorPlugin.INSTANCE.log(e);
				return;
			});	
		}
	}
	
	/**
	 * Display async info message.
	 *
	 * @param text the text
	 * @param details the details
	 */
	public static void displayAsyncInfoMessage(String text, String details) {
		
		GtmEditor editor = GtmUtils.getActiveEditor();

		Display display = getDisplay();
		final Shell shell1 =  editor.getSite().getShell();
			
		if (display != null) {
			display.asyncExec(() -> {
				MessageBox dialog =  new MessageBox(shell1, SWT.ICON_INFORMATION | SWT.OK);
				dialog.setText(text);
				dialog.setMessage(details);
				GtmUtils.writeConsoleInfo(text + " - " + details, editor);
				dialog.open(); 
				return;
			});	
		}
	}

	
	/**
	 * Gets the display.
	 *
	 * @return the display
	 */
	public static Display getDisplay() {
		GtmEditor e = GtmUtils.getActiveEditor();
		Display display = null;
		if (e != null) {
			display = e.getSite().getShell().getDisplay();
		} else {
			display = Display.getDefault();
		}
		return display;
	}
	
	/**
	 * Write console info.
	 *
	 * @param message the message
	 * @param editor the editor
	 */
	public static void writeConsoleInfo(String message, GtmEditor editor) {
		if (message == null || message.length() == 0) {
			return;
		}
		
		try {
			if (editor == null) {
				Display display = getDisplay();
				if (display == null) return;
				display.asyncExec(() -> {
					ConsoleUtil.printInfo(NationalLanguageSupport.ConverterFromLegacy_53,"Info: " + message);
				});	
			} else {
				editor.getSite().getShell().getDisplay().asyncExec(() -> {
					ConsoleUtil.printInfo(NationalLanguageSupport.ConverterFromLegacy_53,"Info: " +  message);
				});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Write console warning.
	 *
	 * @param message the message
	 * @param editor the editor
	 */
	public static void writeConsoleWarning(String message, GtmEditor editor) {
		if (message == null || message.length() == 0) {
			return;
		}
		
		try {
			if (editor == null) {
				Display display = getDisplay();
				if (display == null) return;
				display.asyncExec(() -> {
					ConsoleUtil.printWarning(NationalLanguageSupport.ConverterFromLegacy_53,"Warning: " +  message);
				});					
			} else {
				editor.getSite().getShell().getDisplay().asyncExec(() -> {
					ConsoleUtil.printWarning(NationalLanguageSupport.ConverterFromLegacy_53,"Warning: " +  message);
				});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	
	/**
	 * Checks if is referenced.
	 *
	 * @param object the object
	 * @param tree the tree
	 * @return true, if is referenced
	 */
	public static boolean isReferenced(EObject object, EObject tree) {
		
		if (object == null || tree == null) return false;
		
		TreeIterator<EObject> it = tree.eAllContents();
		
		while (it.hasNext()) {
			EObject next = it.next();
			
			EList<EObject> crossReferences = next.eCrossReferences();
			
			if (crossReferences.contains(object)) {
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * Gets the label text for an eObject.
	 *
	 * @param object the object
	 * @return the label text
	 */
	public static String getLabelText(EObject object) {
		
		if (object == null) return "";
		
		GtmItemProviderAdapterFactory factory = new GtmItemProviderAdapterFactory();
		if(factory.isFactoryForType(IItemLabelProvider.class)){
			IItemLabelProvider labelProvider = (IItemLabelProvider)	factory.adapt(object, IItemLabelProvider.class);
			if(labelProvider != null){
				return labelProvider.getText(object);
			}
		}
	
		return null;
	}
	
	/**
	 * Gets the euro cent.
	 *
	 * @param f the f
	 * @return the euro cent
	 */
	public static int getEuroCent(float f) {
		BigDecimal value = new BigDecimal(Float.toString(f));
		BigDecimal amount = value.multiply(oneHundred);
		return amount.intValue();
	}
	
	/**
	 * Gets the euro from cent.
	 *
	 * @param i the i
	 * @return the euro from cent
	 */
	public static float getEuroFromCent(int i) {
		BigDecimal value = new BigDecimal(i);
		value.setScale(2);
		BigDecimal amount = value.divide(oneHundred);
		return amount.floatValue();
	}
	
	 public static String getStackTrace(Throwable aThrowable) {
		    final Writer result = new StringWriter();
		    final PrintWriter printWriter = new PrintWriter(result);
		    aThrowable.printStackTrace(printWriter);
		    return result.toString();
	 }
	
	public static void writeConsoleStackTrace(Exception e, GtmEditor editor){
		if (e == null) return;
		
		String stackTrace = getStackTrace(e);
		GtmUtils.writeConsoleError(stackTrace, editor);
		
	}
	
	public static BigDecimal round(float amount, int scale, RoundingMode mode, int radix) {
		
		String amountS = Float.toString(amount);
		if (radix == 10) {
			return new BigDecimal(amountS).setScale(scale, mode);
		} else {
			float value = amount * radix;
			String valueS = Float.toString(value);
			BigDecimal bd = new BigDecimal(valueS).setScale(scale - 1, mode);
			float v = bd.floatValue() / radix;
			String vS = Float.toString(v);
			BigDecimal bf = new BigDecimal(vS).setScale(scale, mode);
			return bf;
		}
	}
	
	public static Charset getSupportedCharset(CharacterSet set, GtmEditor editor) {
		
		if (set == null) {
			return StandardCharsets.ISO_8859_1;
		} else if (set.equals(CharacterSet.LATIN10_ISO885916)) {
			return getCharSet("ISO8859_16", editor);
		} else if (set.equals(CharacterSet.LATIN1_ISO88591)) {
			return StandardCharsets.ISO_8859_1;
		} else if (set.equals(CharacterSet.LATIN2_ISO88592)) {
			return getCharSet("ISO8859_2", editor);
		} else if (set.equals(CharacterSet.LATIN3_ISO88593)) {
			return getCharSet("ISO8859_3", editor);
		} else if (set.equals(CharacterSet.LATIN4_ISO88594)) {
			return getCharSet("ISO8859_4", editor);
		} else if (set.equals(CharacterSet.LATIN5_ISO88599)) {
			return getCharSet("ISO8859_9", editor);
		} else if (set.equals(CharacterSet.LATIN7_ISO885913)) {
			return getCharSet("ISO8859_13", editor);
		} else if (set.equals(CharacterSet.LATIN9_ISO885915)) {
			return getCharSet("ISO8859_15", editor);
		} else if (set.equals(CharacterSet.LATINARABIC_ISO88596)) {
			return getCharSet("ISO8859_6", editor);
		} else if (set.equals(CharacterSet.LATINGREEK_ISO88597)) {
			return getCharSet("ISO8859_7", editor);
		} else if (set.equals(CharacterSet.LATINHEBREW_ISO88598)) {
			return getCharSet("ISO8859_8", editor);
		} else if (set.equals(CharacterSet.LATINKYRILLIC_ISO88595)) {
			return getCharSet("ISO8859_5", editor);
		} else if (set.equals(CharacterSet.RUSSIAN_KOI8R)) {
			return getCharSet("KOI8_R", editor);
		} else if (set.equals(CharacterSet.UKRAINIAN_KOI8U)) {
			return getCharSet("KOI8_U", editor);
		} else if (set.equals(CharacterSet.USASCII)) {
			return StandardCharsets.US_ASCII;
		} 
		
		return StandardCharsets.ISO_8859_1;
	}

	private static Charset getCharSet(String charset,GtmEditor editor) {
		
		Charset set = null;
		try {
			set = Charset.forName(charset);
		} catch (Exception e) {
			return StandardCharsets.ISO_8859_1;
		}
		if (set == null) {
			String message = "local character set " + charset + " not supported using ISO-8859-1 instead - local station names might be corrupted in the export";
			GtmUtils.writeConsoleInfo(message, editor);
			return StandardCharsets.ISO_8859_1;
		} else {
			return set;
		}
	}
	
	public static String convertUtf8ToCharSet(String s, Charset set) {
		try {
			byte[] original = s.getBytes("UTF-8");
			return  new String(original, set);		
		} catch (UnsupportedEncodingException e) {
			return s;
		}
	}

	/*
	 * find the country that occurs most often in the station list
	 */
	public static Country getRecommendedCountry(GTMTool tool) {
		
		if (tool.getGeneralTariffModel().getFareStructure() == null ||
			tool.getGeneralTariffModel().getFareStructure().getStationNames() == null ||	
			tool.getGeneralTariffModel().getFareStructure().getStationNames().getStationName() == null ||
			tool.getGeneralTariffModel().getFareStructure().getStationNames().getStationName().isEmpty()) {
			return null;
		}
		
		HashMap<Country,Integer> countryCounter = new HashMap<Country,Integer>();
		
		for (Station s : tool.getGeneralTariffModel().getFareStructure().getStationNames().getStationName()) {
			
			if (s.getCountry() != null) {
			
				Integer i = countryCounter.get(s.getCountry());
				if (i == null) {
					countryCounter.put(s.getCountry() , new Integer(1));
				} else {
					i++;
					countryCounter.put(s.getCountry() , new Integer(i));
				}
			}
		}
		Set<Entry<Country,Integer>> set = countryCounter.entrySet();
		Iterator<Entry<Country, Integer>> it = set.iterator();
		Entry<Country,Integer> mainEntry= it.next();
		if (mainEntry == null) return null;
		
		while (it.hasNext()) {
			Entry<Country,Integer> next = it.next();
			if (next.getValue().intValue() > mainEntry.getValue().intValue()) {
				mainEntry = next;
			}
		}
		return mainEntry.getKey();
	}
	
	
	public synchronized static String utf2ascii(String s){
		
		if (s == null || s.length() == 0) return null;
					
		Transliterator transliterator = Transliterator.getInstance("Latin-ASCII");
		
		return transliterator.transliterate(s);
		
	}
	
	
	public static void deleteOrphanedObjects(EditingDomain domain, GTMTool tool) {
		
		if (tool == null || domain == null) return;
		
		Map<EObject, Collection<Setting>> ll = EcoreUtil.ExternalCrossReferencer.find(tool);

		for (Entry<EObject,Collection<Setting>> e:  ll.entrySet()) {
			for (Setting s : e.getValue()) {
				EcoreUtil.remove(s,e.getKey());
			}
		}
		return;

	}

	public static void addWorkflowStep(String description, GtmEditor editor) {
		
		WorkflowStep step = GtmFactory.eINSTANCE.createWorkflowStep();
		step.setTime(java.util.Calendar.getInstance().getTime());
		step.setDescription(description);
		
	   	if (editor == null) return;
	   	
	   	EditingDomain domain = ((GtmEditor) editor).getEditingDomain();
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
		
		Command com = null;
		if (tool.getWorkflowHistory() == null) {
			
			WorkflowHistory history = GtmFactory.eINSTANCE.createWorkflowHistory();
			history.getWorkflowSteps().add(step);
			com = SetCommand.create(editor.getEditingDomain(), tool, GtmPackage.Literals.GTM_TOOL__WORKFLOW_HISTORY, history);
			if (com != null && com.canExecute()) {
				editor.getEditingDomain().getCommandStack().execute(com);
			}
		} else {
			
			com = AddCommand.create(editor.getEditingDomain(), tool.getWorkflowHistory(), GtmPackage.Literals.WORKFLOW_HISTORY__WORKFLOW_STEPS, step);
			if (com != null && com.canExecute()) {
				editor.getEditingDomain().getCommandStack().execute(com);
			}
		}
		

				
	}
	
	
	public static Date setTo2359UTC(Date date) {
		
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.setTime(date);
		cal.set(java.util.Calendar.HOUR_OF_DAY, 23);
		cal.set(java.util.Calendar.MINUTE, 59);
		cal.set(java.util.Calendar.SECOND, 59);
		Date date2 = cal.getTime();
		
		return date2;
	}
	
	public static Date setTo0000UTC(Date date) {
		
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.setTime(date);
		cal.set(java.util.Calendar.HOUR_OF_DAY, 0);
		cal.set(java.util.Calendar.MINUTE, 0);
		cal.set(java.util.Calendar.SECOND, 0);

		return cal.getTime();
	}
	
	public static boolean checkDateOnlyEqual(Date date1, Date date2) {
		
		String d1 = dateFormat.format(date1);
		String d2 = dateFormat.format(date2);
		
		return d1.equals(d2);

	}

	/*
	 * remove border point codes from previous conversions
	 */
	public static void resetBorderPointCodes(EditingDomain domain, GTMTool tool) {

		CompoundCommand command = new CompoundCommand();
			
		for (Station s : tool.getCodeLists().getStations().getStations()) {
				
			if (s.getLegacyBorderPointCode() > 0) {
					
				command.append(SetCommand.create(domain, s, GtmPackage.Literals.STATION__LEGACY_BORDER_POINT_CODE, 0));
					
			}
				
		}
			
		if (command != null && !command.isEmpty() && command.canExecute()) {
			domain.getCommandStack().execute(command);
		}

			
		
	}

	public static String[] splitCsv(String st) {
	
		String[] st1 = st.split(";"); //$NON-NLS-1$
		String[] st2 = st.split(","); //$NON-NLS-1$
		
		if (st1.length < st2.length) {
			return st2;
		}
		
		return 	st1;
	}

	public static String standardizeId(Carrier cardIssuer, String id) {
		
		//standard UIC ids
		if (id.startsWith("UIC_")) return id;
		
		//issuer must be there
		if (cardIssuer ==  null || cardIssuer.getCode() == null || cardIssuer.getCode().length() < 1) {
			return null;
		}
		
		String newId = cardIssuer.getCode();
		if (id.startsWith(newId)) {
			newId = id;
		} else {
			newId = newId + "_" + id;
		}
		
		newId = newId.trim();
		newId = newId.replace(" ", "_");
		return newId;
	}

	public static boolean isConvertable(Station sn) {
		
		if (sn.getStationCode() > 0L && sn.getStationCode() < 10000000L) {
			return true;
		}
		
		return false;
	}

	public static long getStationCode(String s) {
		
		//pure station code
		if (s == null || s.length() == 0) {
			return 0;
		}
		
		long i = 0;
		
		try {
		
			i = Long.parseLong(s);
		
		} catch (Exception e) {
			
			//maybe its URN format
			String decoded = URI.decode(s);
			String[] parts = decoded.split(":");
			
			try {
				i =  Integer.parseInt(parts[parts.length - 1]);
			} catch (Exception e2) {
				return 0;
			}
			
		}
		
		return i;		

	}

	public static int getCountryOfStation(String s) {
		
		Long codeNum = GtmUtils.getStationCode(s);
		
		if (codeNum < 1000000) return 0;
		
		//rail code
		if (codeNum < 10000000) {
			return (int) (codeNum / 100000);
		}
		
		// long code
		//type + country
		int typeAndCountry = (int) (codeNum / 100000);
		
		int type = typeAndCountry / 100;
		
		return typeAndCountry - type * 100;

	}

	public static long getlocalStationCode(String s) {
		
		Long codeNum = GtmUtils.getStationCode(s);
		
		if (codeNum < 1000000) return 0;
		
		int typeAndCountry = (int) (codeNum / 100000);
		return codeNum - typeAndCountry * 100000;

	}

}



