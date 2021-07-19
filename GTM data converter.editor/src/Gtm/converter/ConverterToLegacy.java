package Gtm.converter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import Gtm.AlternativeRoute;
import Gtm.Carrier;
import Gtm.ClassId;
import Gtm.ClassicClassType;
import Gtm.Clusters;
import Gtm.CombinationModel;
import Gtm.ConnectionPoint;
import Gtm.Country;
import Gtm.CurrencyPrice;
import Gtm.FareCombinationModel;
import Gtm.FareElement;
import Gtm.FareStationSetDefinition;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.Legacy108FareDescription;
import Gtm.Legacy108FaresDescriptions;
import Gtm.Legacy108Memo;
import Gtm.Legacy108Memos;
import Gtm.Legacy108Station;
import Gtm.Legacy108Stations;
import Gtm.LegacyBorderPoint;
import Gtm.LegacyBorderSide;
import Gtm.LegacyCalculationType;
import Gtm.LegacyCarrier;
import Gtm.LegacyCarriers;
import Gtm.LegacyConversionType;
import Gtm.LegacyRouteFare;
import Gtm.LegacyRouteFares;
import Gtm.LegacySeparateContractSeries;
import Gtm.LegacySeparateContractSeriesList;
import Gtm.LegacySeries;
import Gtm.LegacySeriesList;
import Gtm.LegacySeriesType;
import Gtm.LegacyStationMap;
import Gtm.LegacyViastation;
import Gtm.OnBorderStations;
import Gtm.Price;
import Gtm.RegionalConstraint;
import Gtm.RegionalValidity;
import Gtm.Route;
import Gtm.RouteDescriptionBuilder;
import Gtm.SalesAvailabilityConstraint;
import Gtm.SalesRestriction;
import Gtm.ServiceBrand;
import Gtm.ServiceConstraint;
import Gtm.Station;
import Gtm.StationSet;
import Gtm.Text;
import Gtm.Translation;
import Gtm.TransportMode;
import Gtm.TravelerType;
import Gtm.ViaStation;
import Gtm.nls.NationalLanguageSupport;
import Gtm.presentation.GtmEditor;
import Gtm.utils.GtmUtils;
import Gtm.utils.GtmValidator; 

/**
 * The Class ConverterToLegacy.
 */
public class 	ConverterToLegacy {
	
	
	/** The tool. */
	private GTMTool tool = null;
	
	/** The domain. */
	private EditingDomain domain = null;
	
	/** The editor. */
	private GtmEditor editor = null;
	
	/** The legacy fares. */
	private HashMap<String,LegacyRouteFare> legacyFares = new HashMap<String,LegacyRouteFare>(); 
	
	/** The route fares. */
	private HashSet<LegacyRouteFare> routeFares = new HashSet<LegacyRouteFare>();
	
	/** The series. */
	private HashMap<Integer,LegacySeries> series = new HashMap<Integer,LegacySeries>();	
	
	/** The legacy stations. */
	private HashMap<Integer,Legacy108Station> legacyStations = new HashMap<Integer,Legacy108Station>();	
	
	/** The legacy border stations. */
	private HashMap<Integer,Legacy108Station> legacyBorderStations = new HashMap<Integer,Legacy108Station>();	

	/** The legacy separate contract series. */
	private HashMap<Integer, LegacySeparateContractSeries> legacySeparateContractSeries = new HashMap<Integer,LegacySeparateContractSeries>();	
	
	/** The legacy fare descriptions. */
	private HashMap<Integer,Legacy108FareDescription> legacyFareDescriptions = new HashMap<Integer,Legacy108FareDescription>();	

	/** The legacy fare descriptions. */
	private HashMap<Text,Legacy108Memo> memos = new HashMap<Text,Legacy108Memo>();	

	/** The used carriers. */
	private HashMap<String,LegacyCarrier> carriers = new HashMap<String,LegacyCarrier>();	

	
	/**
	 * Instantiates a new converter to legacy.
	 *
	 * @param tool the tool
	 * @param editor the editor
	 * @param domain the domain
	 */
	public ConverterToLegacy(GTMTool tool, GtmEditor editor, EditingDomain domain) {
		this.tool = tool;
		this.editor = editor;
		this.domain = domain;
	}
	
	/**
	 * Gets the monitor tasks.
	 *
	 * @return the monitor tasks
	 */
	public int getMonitorTasks() {
		return 14;
	}
	
	/**
	 * Convert.
	 *
	 * @param monitor the monitor
	 * @return the int
	 */
	public int convert(IProgressMonitor monitor) {
		
		//clean up the data
		GtmUtils.deleteOrphanedObjects(domain,tool);
		
		Carrier carrier = tool.getGeneralTariffModel().getDelivery().getProvider();
		if (carrier == null) {
			String message = "No Carrier/Provider contained in the OSDM Delivery Data - Conversion aborted!";
			GtmUtils.writeConsoleError(message, editor);
			return 0;
		}

		addCarrier(carrier); 
		
		Command com = SetCommand.create(domain, tool.getConversionFromLegacy().getLegacy108(), GtmPackage.Literals.LEGACY108__CARRIER, carrier);
		if (com != null && com.canExecute()) {
			domain.getCommandStack().execute(com);
		}
		
		monitor.subTask(NationalLanguageSupport.ConverterToLegacy_0);	
		convertStations();
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.ConverterToLegacy_1);	
		convertfareStations();
		convertServiceConstraintStations();	

		monitor.worked(1);
		
		

		monitor.subTask(NationalLanguageSupport.ConverterToLegacy_2);	
		List<FareElement> convertableFares = selectFares();
		monitor.worked(1);
		
		if (convertableFares == null || convertableFares.isEmpty()) {
			monitor.done();
			return 0;
		}
		
		monitor.subTask(NationalLanguageSupport.ConverterToLegacy_3);	
		for (FareElement fare : convertableFares) {
			try {
				LegacyRouteFare  legacyFare = convertFare(fare);
				if (series.size() < 99999 && legacyFare != null) {
					routeFares.add(legacyFare);
					LegacySeries oldSeries = series.get(legacyFare.getSeries().getNumber());
					if (oldSeries != null) {
						legacyFare.setSeries(oldSeries);
					} else {
						series.put(legacyFare.getSeries().getNumber(),legacyFare.getSeries());
					}
				}
			} catch (ConverterException e) {
				String message = NationalLanguageSupport.ConverterToLegacy_4 + fare.getId() + " " + e.getMessage(); //$NON-NLS-2$
				GtmUtils.writeConsoleError(message, editor);
				GtmUtils.writeConsoleStackTrace(e, editor);
			} catch (Exception e) {
				String message = NationalLanguageSupport.ConverterToLegacy_4 + fare.getId() + " " + e.getMessage(); //$NON-NLS-2$
				GtmUtils.writeConsoleError(message, editor);	
				GtmUtils.writeConsoleStackTrace(e, editor);
			}
		}

		
		routeFares = mergeClasses(routeFares);
		
		monitor.worked(1);

		
		monitor.subTask(NationalLanguageSupport.ConverterToLegacy_6);	
		//check numbering. if numbers are missing renumber
		boolean numberingOk = true;
		for (LegacySeries serie : series.values()) {
			if (serie.getNumber() == 0) numberingOk = false;
		}
		if (!numberingOk) {
			int i = 0;
			for (LegacySeries serie : series.values()) {
				serie.setNumber(i++);
			}
			String message = NationalLanguageSupport.ConverterToLegacy_7;
			GtmUtils.writeConsoleError(message, editor);
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.ConverterToLegacy_9);	
		CompoundCommand comm = new CompoundCommand();
		comm.append(SetCommand.create(domain,tool.getConversionFromLegacy().getLegacy108(),GtmPackage.Literals.LEGACY108__LEGACY_ROUTE_FARES,GtmFactory.eINSTANCE.createLegacyRouteFares()));
		comm.append(SetCommand.create(domain,tool.getConversionFromLegacy().getLegacy108(),GtmPackage.Literals.LEGACY108__LEGACY_STATIONS,GtmFactory.eINSTANCE.createLegacy108Stations()));
		comm.append(SetCommand.create(domain,tool.getConversionFromLegacy().getLegacy108(),GtmPackage.Literals.LEGACY108__LEGACY_SERIES_LIST,GtmFactory.eINSTANCE.createLegacySeriesList()));
		comm.append(SetCommand.create(domain,tool.getConversionFromLegacy().getLegacy108(),GtmPackage.Literals.LEGACY108__LEGACY_FARE_DESCRIPTIONS,GtmFactory.eINSTANCE.createLegacy108FaresDescriptions()));
		comm.append(SetCommand.create(domain,tool.getConversionFromLegacy().getLegacy108(),GtmPackage.Literals.LEGACY108__LEGACY_SEPARATE_CONTRACT_SERIES,GtmFactory.eINSTANCE.createLegacySeparateContractSeriesList()));
		comm.append(SetCommand.create(domain,tool.getConversionFromLegacy().getLegacy108(),GtmPackage.Literals.LEGACY108__LEGACY_MEMOS,GtmFactory.eINSTANCE.createLegacy108Memos()));
		
		if (!comm.isEmpty() && comm.canExecute()) {
			domain.getCommandStack().execute(comm);
		}		
			
		monitor.worked(1);
		
		
		//add route numbers	
		monitor.subTask(NationalLanguageSupport.ConverterToLegacy_10);		
		addRouteNumbers(series, routeFares);		
		List<LegacySeries> seriesCol = new ArrayList<LegacySeries>();
		seriesCol.addAll(series.values());
		Collections.sort(seriesCol,new SeriesComparator());
		LegacySeriesList lsl = GtmFactory.eINSTANCE.createLegacySeriesList();
		lsl.getSeries().addAll(seriesCol);
		
		com = SetCommand.create(domain, tool.getConversionFromLegacy().getLegacy108(), GtmPackage.Literals.LEGACY108__LEGACY_SERIES_LIST, lsl);
		if (com != null && com.canExecute()) {
			domain.getCommandStack().execute(com);
		}
		if ( lsl.getSeries() != null) {
			String message = String.format("108-TCVS series created: %d", lsl.getSeries().size());
			GtmUtils.writeConsoleInfo(message, editor);
		}
		monitor.worked(1);
		
		
		List<LegacyRouteFare> faresCol = new ArrayList<LegacyRouteFare>();
		faresCol.addAll(routeFares);
		Collections.sort(faresCol,new FaresComparator());
		monitor.subTask(NationalLanguageSupport.ConverterToLegacy_11);	
		LegacyRouteFares lfs = GtmFactory.eINSTANCE.createLegacyRouteFares();
		lfs.getRouteFare().addAll(faresCol);
		com = SetCommand.create(domain, tool.getConversionFromLegacy().getLegacy108(), GtmPackage.Literals.LEGACY108__LEGACY_ROUTE_FARES, lfs);
		if (com != null && com.canExecute()) {
			domain.getCommandStack().execute(com);
		}
		if ( lfs.getRouteFare() != null) {
			String message = String.format("108 route fares added: %d", lfs.getRouteFare().size());
			GtmUtils.writeConsoleInfo(message, editor);
		}
		
		monitor.worked(1);
		
		
		List<Legacy108Station> stationsCol = new ArrayList<Legacy108Station>();
		stationsCol.addAll(legacyStations.values());
		Collections.sort(stationsCol,new LegacyStationComparator());
		monitor.subTask(NationalLanguageSupport.ConverterToLegacy_12);	
		Legacy108Stations lss = GtmFactory.eINSTANCE.createLegacy108Stations();
		lss.getLegacyStations().addAll(stationsCol);
		com = SetCommand.create(domain, tool.getConversionFromLegacy().getLegacy108(), GtmPackage.Literals.LEGACY108__LEGACY_STATIONS, lss);
		if (com != null && com.canExecute()) {
			domain.getCommandStack().execute(com);
		}
		if ( lss.getLegacyStations() != null) {
			String message = String.format("108-TCVG stations added: %d", lss.getLegacyStations().size());
			GtmUtils.writeConsoleInfo(message, editor);
		}
		monitor.worked(1);

		monitor.subTask(NationalLanguageSupport.ConverterToLegacy_13);	
		
		Legacy108FaresDescriptions lfds = GtmFactory.eINSTANCE.createLegacy108FaresDescriptions();
		lfds.getLegacyFares().addAll(legacyFareDescriptions.values());
		com = SetCommand.create(domain, tool.getConversionFromLegacy().getLegacy108(), GtmPackage.Literals.LEGACY108__LEGACY_FARE_DESCRIPTIONS, lfds);
		if (com != null && com.canExecute()) {
			domain.getCommandStack().execute(com);
		}
		if (lfds.getLegacyFares() != null) {
			String message = String.format("108-TCVP fares added: %d", lfds.getLegacyFares().size());
			GtmUtils.writeConsoleInfo(message, editor);
		}		
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.ConverterToLegacy_14);	
		LegacySeparateContractSeriesList lscsl = GtmFactory.eINSTANCE.createLegacySeparateContractSeriesList();
		lscsl.getSeparateContractSeries().addAll(legacySeparateContractSeries.values());
		com = SetCommand.create(domain, tool.getConversionFromLegacy().getLegacy108(), GtmPackage.Literals.LEGACY108__LEGACY_SEPARATE_CONTRACT_SERIES, lscsl);
		if (com != null && com.canExecute()) {
			domain.getCommandStack().execute(com);
		}
		if (lscsl.getSeparateContractSeries() != null) {
			String message = String.format("108-TCVL separate contract series added: %d", lscsl.getSeparateContractSeries().size());
			GtmUtils.writeConsoleInfo(message, editor);
		}
		monitor.worked(1);
		
		monitor.subTask("add memos");	
		Legacy108Memos lms = GtmFactory.eINSTANCE.createLegacy108Memos();
		List<Legacy108Memo> memosCol = new ArrayList<Legacy108Memo>();
		memosCol.addAll(memos.values());
		Collections.sort(memosCol, new Comparator<Legacy108Memo>(){
			@Override
			public int compare(Legacy108Memo o1, Legacy108Memo o2) {
				return Integer.compare(o1.getNumber(),o2.getNumber());
			}
		});
		lms.getLegacyMemos().addAll(memosCol);
		com = SetCommand.create(domain, tool.getConversionFromLegacy().getLegacy108(), GtmPackage.Literals.LEGACY108__LEGACY_MEMOS, lms);
		if (com != null && com.canExecute()) {
			domain.getCommandStack().execute(com);
		}
		if (lms.getLegacyMemos() != null) {
			String message = String.format("108-TCVM memos added: %d", lms.getLegacyMemos().size());
			GtmUtils.writeConsoleInfo(message, editor);
		}
		monitor.worked(1);
		
		monitor.subTask("add carriers");	
		
		LegacyCarriers lcs = GtmFactory.eINSTANCE.createLegacyCarriers();
		List<LegacyCarrier> carriersCol = new ArrayList<LegacyCarrier>();
		carriersCol.addAll(carriers.values());
		Collections.sort(carriersCol, new CarrierComparator() );
		lcs.getLegacyCarrier().addAll(carriersCol);
		com = SetCommand.create(domain, tool.getConversionFromLegacy().getLegacy108(), GtmPackage.Literals.LEGACY108__LEGACY_CARRIERS, lcs);
		if (com != null && com.canExecute()) {
			domain.getCommandStack().execute(com);
		}
		if (lcs.getLegacyCarrier() != null) {
			String message = String.format("108-TCVC carriers added: %d", lcs.getLegacyCarrier().size());
			GtmUtils.writeConsoleInfo(message, editor);
		}
		monitor.worked(1);

		
		monitor.subTask(NationalLanguageSupport.ConverterToLegacy_15);	
		CompoundCommand command = new CompoundCommand();
		command.append(SetCommand.create(domain, tool.getConversionFromLegacy().getLegacy108(), GtmPackage.Literals.LEGACY108__START_DATE, getStartDate(tool)));
		command.append(SetCommand.create(domain, tool.getConversionFromLegacy().getLegacy108(), GtmPackage.Literals.LEGACY108__END_DATE, getEndDate(tool)));
		if (!command.isEmpty() && command.canExecute()) {
			domain.getCommandStack().execute(command);
		}
		monitor.worked(1);		
		
		
		
		return series.size();
	}
	

	private void addRouteNumbers(HashMap<Integer, LegacySeries> series, HashSet<LegacyRouteFare> routeFares) {
		
		ArrayList<LegacySeries> routeNumberTooHigh = new ArrayList<LegacySeries>();
	
		for (LegacySeries serie1 : series.values()) {
			int routeIndex = 1;
			if (serie1.getRouteNumber() == 0) {
				serie1.setRouteNumber(1);
			}
			for (LegacySeries serie2 : series.values()) {
				if (serie1.getFromStation() == serie2.getFromStation() && 
					serie1.getToStation() == serie2.getToStation() &&
					serie1 != serie2) {
					routeIndex++;
					if (serie1.getRouteNumber() == 0) {
						serie1.setRouteNumber(routeIndex);
					}
				}
			}
			if (routeIndex > 9) {
				routeNumberTooHigh.add(serie1);
			}
		}
		
		for (LegacySeries s : routeNumberTooHigh) {
			series.remove(s.getNumber(),s);
			String message = String.format("route number too high (too many routes for the same O/D) for: ",s.getRouteDescription() );
			GtmUtils.writeConsoleInfo(message, editor);
		}
			
		if (routeNumberTooHigh.size() > 0) {
			//remove corresponding route fares
			ArrayList<LegacyRouteFare> excludeFare = new ArrayList<LegacyRouteFare>();
						
			for (LegacyRouteFare fare : routeFares) {
				if (routeNumberTooHigh.contains(fare.getSeries())) {
					excludeFare.add(fare);
				}
			}
			for (LegacyRouteFare fare : excludeFare) {
				routeFares.remove(fare);
			}
			
		}
		
	}

	/**
	 * Merge classes.
	 *
	 * @param routeFares the route fares
	 * @return the hash set
	 */
	private HashSet<LegacyRouteFare> mergeClasses(HashSet<LegacyRouteFare> routeFares) {
		// route fares might include two fares for the same series with price for first and second class
		// there are here merged into one fare
		
		HashMap<String, LegacyRouteFare> uniqueFares = new HashMap<String,LegacyRouteFare>();
		
		for (LegacyRouteFare fare: routeFares) {
			
			LegacyRouteFare fare2 = uniqueFares.get(getFareId(fare)); 
			
			if (fare2 == null) {
				uniqueFares.put(getFareId(fare), fare);	
								
				fare2 = fare;
			} else {
				
				if (fare.isSetFare1st()) {
					fare2.setFare1st(fare.getFare1st());
					fare2.setReturnFare1st(fare.getFare1st() + fare.getFare1st());
				}
				if (fare.isSetFare2nd()) {
					fare2.setFare2nd(fare.getFare2nd());
					fare2.setReturnFare2nd(fare.getFare2nd() + fare.getFare2nd());
				}
			}
			
		}
		
		ArrayList<LegacyRouteFare> faresWithoutPrice = new ArrayList<LegacyRouteFare>();
		
		for (LegacyRouteFare fare: uniqueFares.values()) {
			
			if (!fare.isSetFare1st() && !fare.isSetFare2nd() ) {
				
				faresWithoutPrice.add(fare);
				
				GtmUtils.writeConsoleError("Fare will be ignored as price indication by series distance failed: " + GtmUtils.getLabelText(fare), editor);
				
			}
			
			//distance must be zero in case the price was not set
			if (!fare.isSetFare1st()) {
				 fare.getSeries().setDistance1(0);
			}
			if (!fare.isSetFare2nd()) {
				 fare.getSeries().setDistance2(0);
			}	
	
		}
		
		for (LegacyRouteFare fare: faresWithoutPrice) {
			uniqueFares.remove(getFareId(fare));
		}
		
		HashSet<LegacyRouteFare> fares = new HashSet<LegacyRouteFare>();
		fares.addAll(uniqueFares.values());
				
		return fares;
	}

	/**
	 * Gets the fare id.
	 *
	 * @param fare the fare
	 * @return the fare id
	 */
	private String getFareId(LegacyRouteFare fare) {	
		return String.format("%d+%d",fare.getSeriesNumber(), fare.getFareTableNumber());
	}

	/**
	 * Adds the fare description.
	 *
	 * @param fare the fare
	 * @return the int
	 */
	private int addFareDescription(FareElement fare) {
		
		if (fare == null) return 0;
		
		
		Legacy108FareDescription descr = createFareDescription(fare);
		
		if (descr.getDescriptionLocal() == null || descr.getDescriptionLocal() .length() < 1) return 0;

		/*
		 * is it a new description text? --> create a new fare description resulting in a new fare table
		 * 
		 */
		for (Entry<Integer,Legacy108FareDescription> e : legacyFareDescriptions.entrySet()) {
			if (e.getValue().getDescriptionLocal().equals(descr.getDescriptionLocal())) return e.getKey();
		}
	
		Integer fareTableId = 1000 + legacyFareDescriptions.size();
		descr.setTableId(fareTableId);
		legacyFareDescriptions.put(fareTableId, descr);
		
		
		return fareTableId;
	}

	/**
	 * Creates the fare description.
	 *
	 * @param fare the fare
	 * @return the legacy 108 fare description
	 */
	private Legacy108FareDescription createFareDescription(FareElement fare) {
		
		Legacy108FareDescription desc = GtmFactory.eINSTANCE.createLegacy108FareDescription();
		
		if (fare == null) return null;
		
		/*
		 * 
		 * create a fare description including 
		 * 
		 * fare --> text
		 * fare --> fareDescription
		 * fare serviceConstraint --> list of service brands
		 * 
		 * "Full Fare--incl. Diabolo,RE/RB"
		 * 
		 */
		
		StringBuilder sb = new StringBuilder();
		boolean firstBrand = true;
		ServiceConstraint sc = fare.getServiceConstraint();
		if (sc != null && tool.getConversionFromLegacy().getParams().isConvertServiceConstraints()) {
			if (sc != null && sc.getIncludedServiceBrands() != null && !sc.getIncludedServiceBrands().isEmpty()) {
				sb.append(","); //$NON-NLS-1$
				for (ServiceBrand brand : sc.getIncludedServiceBrands()) {
					if (brand.getAbbreviation() == null || brand.getAbbreviation().length() > 0)
						if (!firstBrand) {
							sb.append("/"); //$NON-NLS-1$
						sb.append(brand.getAbbreviation());
						firstBrand = false;
					}
				}
			}
		}
		
		String sbText = sb.toString();
		StringBuilder sbl  = new StringBuilder();
		StringBuilder sben = new StringBuilder();
		StringBuilder sbge = new StringBuilder();
		StringBuilder sbfr = new StringBuilder();
		
		
		//basic fare text
		if (fare.getText()!= null && fare.getText().getShortTextICAO()!= null) {
			sbl.append(fare.getText().getShortTextICAO());
			
			if (fare.getText().getTranslations() != null) {	
				//translations
				for (Translation trans : fare.getText().getTranslations()) {
					if (trans.getLanguage().getCode().equals("fr")) { //$NON-NLS-1$
						if (trans.getShortTextICAO() != null && trans.getShortTextICAO().length() > 0) {
							sbfr.append(trans.getShortTextICAO());
						} else {
							sbfr.append(sbl.toString());
						}
					}
					if (trans.getLanguage().getCode().equals("de")) { //$NON-NLS-1$
						if (trans.getShortTextICAO() != null && trans.getShortTextICAO().length() > 0) {
							sbge.append(trans.getShortTextICAO());
						} else {
							sbge.append(sbl.toString());
						}
					}			
					if (trans.getLanguage().getCode().equals("en")) { //$NON-NLS-1$
						if (trans.getShortTextICAO() != null && trans.getShortTextICAO().length() > 0) {
							sben.append(trans.getShortTextICAO());
						} else {
							sben.append(sbl.toString());
						}
					}		
				}
			}
		}
			
		if (sbText != null && sbText.length() > 0) {
			sbl.append(sbText);
			sbfr.append(sbText);
			sbge.append(sbText);
			sben.append(sbText);
		}
		desc.setDescriptionLocal(sbl.toString());
		desc.setDescriptionFr(sbfr.toString());	
		desc.setDescriptionGe(sbge.toString());	
		desc.setDescriptionEn(sben.toString());	

		return desc;
	}

	/**
	 * Gets the end date.
	 *
	 * @param tool the tool
	 * @return the end date
	 */
	private Date getEndDate(GTMTool tool) {
		if (tool == null || tool.getGeneralTariffModel() == null || tool.getGeneralTariffModel().getFareStructure()==null|| tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints() == null) {
			return null;
		}
		
		Date endDate = null;
		for (SalesAvailabilityConstraint sac  : tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints().getSalesAvailabilityConstraints()) {
			if (sac.getRestrictions()!= null && !sac.getRestrictions().isEmpty()) {
				for (SalesRestriction sr : sac.getRestrictions()) {
					if (sr.getSalesDates() != null) {
						if (endDate == null) {
							endDate = sr.getSalesDates().getUntilDateTime();
						} else {
							if (endDate.before(sr.getSalesDates().getUntilDateTime())) {
								endDate = sr.getSalesDates().getUntilDateTime();
							}
						}
					}
				}
			}
		}

		return endDate;
	}

	/**
	 * Gets the start date.
	 *
	 * @param tool the tool
	 * @return the start date
	 */
	private Date getStartDate(GTMTool tool) {
		if (tool == null || tool.getGeneralTariffModel() == null || tool.getGeneralTariffModel().getFareStructure()==null|| tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints() == null) {
			return null;
		}
		
		Date startDate = null;
		for (SalesAvailabilityConstraint sac  : tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints().getSalesAvailabilityConstraints()) {
			if (sac.getRestrictions()!= null && !sac.getRestrictions().isEmpty()) {
				for (SalesRestriction sr : sac.getRestrictions()) {
					if (sr.getSalesDates() != null) {
						if (startDate == null) {
							startDate = sr.getSalesDates().getFromDateTime();
						} else {
							if (startDate.after(sr.getSalesDates().getFromDateTime())) {
								startDate = sr.getSalesDates().getFromDateTime();
							}
						}
					}
				}
			}
		}

		return startDate;
	}

	/**
	 * Convert fare stations.
	 */
	private void convertfareStations() {
		
		if (tool.getGeneralTariffModel().getFareStructure().getFareStationSetDefinitions()== null 
			|| tool.getGeneralTariffModel().getFareStructure().getFareStationSetDefinitions().getFareStationSetDefinitions().isEmpty()) {
			return;
		}
			
		
		for (FareStationSetDefinition fs : tool.getGeneralTariffModel().getFareStructure().getFareStationSetDefinitions().getFareStationSetDefinitions()) {
			try {
				int code = 0;
				try {
					code = Integer.parseInt(fs.getCode());
				} catch (Exception e) {
					code = fs.getLegacyCode();
				}
				
				if (code <= 0 || code > 99999) {
					GtmUtils.writeConsoleWarning("fare station set code not convertable: " + GtmUtils.getLabelText(fs) + " code: " + fs.getCode(), editor);
					return;
				}
				
				//validate whether the real station is included
				boolean missing = true;
				for (Station s : fs.getStations()) {
					if (Integer.parseInt(s.getCode()) == code) {
						missing = false;
					}
				}
				if (missing) {
					GtmUtils.writeConsoleWarning("fare station set does not contain main station: " + GtmUtils.getLabelText(fs), editor);
				}
				
				Legacy108Station ls = legacyStations.get(code);
				
				if (ls == null) {
					ls = GtmFactory.eINSTANCE.createLegacy108Station();
					ls.setStationCode(code);
					ls.setName(fs.getName());
					ls.setNameUTF8(fs.getNameUtf8());
				} else {
					if (ls.getName() == null || ls.getName().length() == 0) {
						ls.setName(fs.getName());
					}
					ls.setShortName(fs.getName());
				}
				if (fs.getLegacyCode() != 0) {
					ls.setFareReferenceStationCode(fs.getLegacyCode());
				} else {
					if (code < 100000) {
						ls.setFareReferenceStationCode(code);
					}
				}
				if (ls.getName() == null || ls.getName().length() == 0) {
					String message = "Station name missing: code " + Integer.toString(ls.getStationCode());
					GtmUtils.writeConsoleError(message, editor);
				} else {
					legacyStations.put(ls.getStationCode(), ls);
				}
			} catch (Exception e) {
				StringBuilder sb = new StringBuilder();
				sb.append("Unknown error! Station Set not converted: fare reference station - ").append(fs.getCode()).append('\n');
				sb.append(GtmUtils.getStackTrace(e));
				GtmUtils.writeConsoleError(sb.toString(), editor);
			}
		}
		return;
		
	}
	
	/**
	 * Convert fare stations.
	 */
	private void convertServiceConstraintStations() {
		
		if ( tool.getGeneralTariffModel().getFareStructure().getServiceConstraints() == null
			||tool.getGeneralTariffModel().getFareStructure().getServiceConstraints().getServiceConstraints().isEmpty()){
			return;
		}
		
		for (ServiceConstraint sc : tool.getGeneralTariffModel().getFareStructure().getServiceConstraints().getServiceConstraints()) {
			
			if (sc.getLegacy108Code() < 0 || sc.getLegacy108Code() > 99999) {
				GtmUtils.writeConsoleWarning("legacy code in service constraint invalid: " + GtmUtils.getLabelText(sc) + " code: " + sc.getLegacy108Code(), editor);
			} else if (sc.getLegacy108Code() > 0) {

				Legacy108Station ls = legacyStations.get(sc.getLegacy108Code());
				
				if (ls == null) {
					ls = GtmFactory.eINSTANCE.createLegacy108Station();
					ls.setStationCode(sc.getLegacy108Code());
					if (sc.getDescription() != null) {
						if (sc.getDescription().getShortTextICAO() != null && sc.getDescription().getShortTextICAO().length() != 0) {
					   		ls.setName(sc.getDescription().getShortTextICAO());			
						} else if (sc.getDescription().getTextICAO() != null && sc.getDescription().getTextICAO().length() != 0) {
							ls.setName(sc.getDescription().getTextICAO());	
						}
					} 
					if (ls.getName() == null || ls.getName().length() == 0) {
						ls.setName(RouteDescriptionBuilder.getText(sc));
					}
					ls.setNameUTF8(ls.getName());
					ls.setShortName(ls.getName());
					ls.setNameUTF8(ls.getName());
				} 
				if (ls.getName() == null || ls.getName().length() == 0) {
					String message = "Service constraint name missing: legacy code " + Integer.toString(ls.getStationCode());
					GtmUtils.writeConsoleError(message, editor);
				} else {
					legacyStations.put(ls.getStationCode(), ls);
				}
			}
		}
		return;
		
	}

	/**
	 * Convert stations.
	 */
	private void convertStations() {	
			
		for (Station station : tool.getGeneralTariffModel().getFareStructure().getStationNames().getStationName()) {
			
			try {
				if (station.getCountry() == tool.getConversionFromLegacy().getParams().getCountry()) {
					
					Legacy108Station ls = convertStation(station);
	
					if (ls.getName() == null || ls.getName().length() == 0) {
						String message = "Station name missing: code " + Integer.toString(ls.getStationCode());
						GtmUtils.writeConsoleError(message, editor);
					} else {
						legacyStations.put(ls.getStationCode(),ls);
					}
					
					if (ls.getBorderPointCode() > 0) {
						legacyBorderStations.put(ls.getBorderPointCode(), ls);
					}
				} else {			
					addMappedLegacyStation(station);
				}
			} catch (Exception e) {
				StringBuilder sb = new StringBuilder();
				sb.append("Unknown error! Station not converted: station - ").append(station.getCode()).append('\n');
				sb.append(GtmUtils.getStackTrace(e));
				GtmUtils.writeConsoleError(sb.toString(), editor);
			}
				
		}
		
		
		if ( tool.getConversionFromLegacy().getLegacy108().getLegacyBorderPoints() != null) {
		
			for (LegacyBorderPoint lbp : tool.getConversionFromLegacy().getLegacy108().getLegacyBorderPoints().getLegacyBorderPoints()) {
				try {
					String name = "";
					String nameASCII = "";
					String nameUTF8 = "";
					int localCode = 0;
					
					LegacyBorderSide lbs = getBorderSide(tool.getGeneralTariffModel().getDelivery().getProvider(), lbp);
					
					if (lbs != null) {
						localCode = lbs.getLegacyStationCode();
						//real station?
						Legacy108Station ls = legacyStations.get(localCode);
						if (ls != null) {
							ls.setBorderPointCode(lbp.getBorderPointCode());
						} else {	
							//use the central station on the border or select the station on the carriers side
							if (lbs.getStations().getStations().size() == 1) {
								Station s = lbs.getStations().getStations().get(0);
	
								name = s.getNameCaseUTF8();
								nameASCII = s.getShortNameCaseASCII();
								nameUTF8 = s.getNameCaseUTF8();
								
								if (name == null || name.length() == 0) {
									StringBuilder sb = new StringBuilder();
									sb.append( "Station names missing - code: ");
									sb.append(lbs.getLegacyStationCode());
									sb.append(" time table name: ").append(s.getTimetableName());
									sb.append(" station code ").append(s.getCountry().getCode()).append(" ").append(s.getCode());
	 								GtmUtils.writeConsoleError(sb.toString(), editor);
	 								return;
								}
							} else {
								boolean found = false;
								for (Station s : lbs.getStations().getStations()) {
									
									if (s.getCountry().equals(tool.getConversionFromLegacy().getParams().getCountry())) {
										found = true;
										name = s.getName();
										nameASCII = s.getShortNameCaseASCII();
										nameUTF8 = s.getNameCaseUTF8();
										if (name == null || name.length() == 0) {
											StringBuilder sb = new StringBuilder();
											sb.append( "Station names missing - legacy code: ");
											sb.append(lbs.getLegacyStationCode());
											sb.append(" time table name: ").append(s.getTimetableName());
											sb.append(" station code ").append(s.getCountry().getCode()).append(" ").append(s.getCode());
											GtmUtils.writeConsoleError(sb.toString(), editor);
											return;
										}
									}
								}
								if (!found) {
									StringBuilder sb = new StringBuilder();
									sb.append( "Could not identify legacy station for legacy border point on: ");
									sb.append(GtmUtils.getLabelText(lbp));
									GtmUtils.writeConsoleError(sb.toString(), editor);								
									return;
								}
								
							}
							
							ls = GtmFactory.eINSTANCE.createLegacy108Station();
							ls.setStationCode(localCode);	
							ls.setName(name);
							ls.setNameUTF8(nameASCII);
							ls.setShortName(nameUTF8);
							ls.setBorderPointCode(lbp.getBorderPointCode());
							if (ls.getName() == null || ls.getName().length() == 0) {
								String message = "Station name missing: code " + Integer.toString(ls.getStationCode());
								GtmUtils.writeConsoleError(message, editor);
							} else {
								legacyStations.put(ls.getStationCode(),ls);
							}
						}
					}
				
				} catch (Exception e) {
					StringBuilder sb = new StringBuilder();
					sb.append("Unknown error! Border Station not converted: station - ").append(lbp.getBorderPointCode()).append('\n');
					sb.append(GtmUtils.getStackTrace(e));
					GtmUtils.writeConsoleError(sb.toString(), editor);
				}
			}
		}

		return;
	}
	
	private void addMappedLegacyStation(Station station) { 
		 if (station == null ||
			 tool.getConversionFromLegacy().getParams() == null ||
			 tool.getConversionFromLegacy().getParams().getLegacyStationMappings() == null ||
		     tool.getConversionFromLegacy().getParams().getLegacyStationMappings().getStationMappings() == null) {
		}
		 //check for mapping
		for (LegacyStationMap map :  tool.getConversionFromLegacy().getParams().getLegacyStationMappings().getStationMappings()) {
			if (map.getStation().getCode().equals(station.getCode())) {
				Legacy108Station ls = convertStation(station);
				ls.setStationCode(map.getLegacyCode());
				legacyStations.put(ls.getStationCode(),ls);
			}
		}		
	}

	/**
	 * Gets the border side.
	 *
	 * @param carrier the carrier
	 * @param lbp the lbp
	 * @return the border side
	 */
	private LegacyBorderSide getBorderSide(Carrier carrier,LegacyBorderPoint lbp) {
		if (lbp == null) return null;
		if (carrier == null) return null;
		for  (LegacyBorderSide lbs: lbp.getBorderSides()) {
			if (lbs.getCarrier().equals(carrier)) {
				return lbs;
			}
		}
				
		return null;
	}

	
	/**
	 * Convert station.
	 *
	 * @param sn the sn
	 * @return the legacy 108 station
	 */
	private Legacy108Station convertStation(Station sn)  {
		
		Legacy108Station ls = GtmFactory.eINSTANCE.createLegacy108Station();
		
		ls.setName(sn.getNameCaseASCII());
		ls.setNameUTF8(sn.getNameCaseUTF8());
		ls.setShortName(sn.getShortNameCaseASCII());
		ls.setShortNameUtf8(sn.getShortNameCaseUTF8());
		ls.setStationCode(Integer.parseInt(sn.getCode()));
		ls.setBorderPointCode(sn.getLegacyBorderPointCode());
		
		setFareReferenceStationContent(ls,sn);
		
		return ls;
	}

	/**
	 * Sets the fare reference station code and names in the legacy station
	 * @param ls the legacy station to be changed
	 * @param station the station
	 */
	private void setFareReferenceStationContent(Legacy108Station ls, Station station) {
		
		int fareCode = 0;
		Set<Integer> fareCodes = new HashSet<Integer>();
		for (FareStationSetDefinition f : tool.getGeneralTariffModel().getFareStructure().getFareStationSetDefinitions().getFareStationSetDefinitions()) {
			if (f.getLegacyCode() > 0 && f.getStations().indexOf(station) >= 0 ) {
				fareCodes.add(Integer.valueOf(f.getLegacyCode()));
				fareCode = f.getLegacyCode();
				ls.setFareReferenceStationCode(fareCode);
				
				if (fareCode == ls.getStationCode()) {
					//use ascii name of fare reference station
					ls.setName(f.getName());
					ls.setShortName(f.getName());
					ls.setShortNameUtf8(f.getNameUtf8());
				}
			}
		}
	}


	
	
	

	/**
	 * Convert fare.
	 *
	 * @param fare the fare
	 * @return the legacy route fare
	 * @throws ConverterException the converter exception
	 */
	private LegacyRouteFare convertFare(FareElement fare) throws ConverterException {
		
		LegacySeries series = convertToSeries(fare);
		if (series == null) return null;
		
		if (series.getNumber() > 99999 ) {
			String message = NationalLanguageSupport.ConverterToLegacy_26;
			GtmUtils.writeConsoleError(message, editor);	
			return null;
		}
		
		if (fare.getFareDetailDescription() != null) {
			convertToMemo(fare,series);
		}

		LegacyRouteFare routeFare = convertToFare(fare,series);
		if (routeFare == null) return null;
		
		/*
		 * if all models require separate tickets the series will be added to the TCVL list
		 * 
		 */
	
		if (fare.getFareConstraintBundle() != null &&
			fare.getFareConstraintBundle().getFulfillmentConstraint() != null &&
			fare.getFareConstraintBundle().getFulfillmentConstraint().isSeparateFulFillmentRequired()) {
			LegacySeparateContractSeries scl = GtmFactory.eINSTANCE.createLegacySeparateContractSeries();
			scl.setSeries(series);
			scl.setSeriesNumber(series.getNumber());
			scl.setValidFrom(series.getValidFrom());
			scl.setValidUntil(series.getValidUntil());

			legacySeparateContractSeries.put(series.getNumber(),scl);
		}
		
		routeFare.setFareTableNumber(addFareDescription(fare));
		series.setFareTableNumber(routeFare.getFareTableNumber());
		
		try {
			String converterError = GtmValidator.checkConvertability(fare, tool.getConversionFromLegacy().getLegacy108().getCarrier());
			if (converterError != null) {
				GtmUtils.writeConsoleWarning("Fare not convertable: " + converterError + " " + GtmUtils.getLabelText(fare), editor);
			}
		} catch (Exception e) {
			//do nothing
		}
		return routeFare;
	}

	private void convertToMemo(FareElement fare, LegacySeries series) {
		
		Legacy108Memo memo = memos.get(fare.getFareDetailDescription());
		
		if (memo != null) {
			series.setMemoNumber(memo.getNumber());
			return;
		}
		Text text = fare.getFareDetailDescription();
		memo = GtmFactory.eINSTANCE.createLegacy108Memo();
		memo.setNumber(memos.size() + 1);
		memos.put(text, memo);
		memo.setLocal(text.getTextUTF8());
		memo.setEnglish(getTranslation(text, "en"));
		memo.setFrench(getTranslation(text, "fr"));	
		memo.setGerman(getTranslation(text, "de"));

	}

	private String getTranslation(Text text, String language) {
		
		if (text.getTranslations() == null) {
			return null;
		}
		for (Translation t : text.getTranslations()) {
			if (t.getLanguage() != null &&  t.getLanguage().getCode().equals(language)) {
				return t.getTextUTF8();
			}
		}
		return null;
	}

	/**
	 * Convert to fare.
	 *
	 * @param fare the fare
	 * @param series the series
	 * @return the legacy route fare
	 * @throws ConverterException the converter exception
	 */
	private LegacyRouteFare convertToFare(FareElement fare, LegacySeries series) throws ConverterException {
		
		if (fare == null || fare.getFareConstraintBundle() == null) return null;

		//search for legacy route fare to add class
		LegacyRouteFare legacyFare = legacyFares.get(series.getRouteDescription());
		if (legacyFare == null) {	
			legacyFare = GtmFactory.eINSTANCE.createLegacyRouteFare();
			legacyFare.setSeriesNumber(series.getNumber());
			legacyFare.setValidFrom(fare.getFareConstraintBundle().getSalesAvailability().getRestrictions().get(0).getSalesDates().getFromDateTime());
			legacyFare.setValidUntil(fare.getFareConstraintBundle().getSalesAvailability().getRestrictions().get(0).getSalesDates().getUntilDateTime());	
			legacyFare.setSeries(series);		
		} 
		if (fare.getServiceClass().getId() == ClassId.B) {
			legacyFare.setFare1st(getPrice(fare.getPrice()));
			legacyFare.setReturnFare1st(legacyFare.getFare1st() + legacyFare.getFare1st());

		}
		if (fare.getServiceClass().getId() == ClassId.D) {
			legacyFare.setFare2nd(getPrice(fare.getPrice()));
			legacyFare.setReturnFare2nd(legacyFare.getFare2nd( ) + legacyFare.getFare2nd());
		}


		return legacyFare;
	}

	/**
	 * Gets the price.
	 *
	 * @param price the price
	 * @return the price
	 * @throws ConverterException the converter exception
	 */
	private int getPrice(Price price) throws ConverterException {
		
		for (CurrencyPrice  cp : price.getCurrencies()) {
			if (cp.getCurrency() == null || 
				cp.getCurrency().getIsoCode().equals("EUR"))
			return GtmUtils.getEuroCent(cp.getAmount());
		}
		throw new ConverterException(NationalLanguageSupport.ConverterToLegacy_27);

	}

	
	/**
	 * Convert to series.
	 *
	 * @param fare the fare
	 * @return the legacy series
	 */
	private LegacySeries convertToSeries(FareElement fare) {
		
		if (fare.getRegionalConstraint() == null ||
				fare.getFareConstraintBundle() == null ||
				fare.getRegionalConstraint().getRegionalValidity() == null ||
				fare.getRegionalConstraint().getRegionalValidity().isEmpty() ||
				fare.getRegionalConstraint().getRegionalValidity().get(0).getViaStation() == null ) {
				return null;
		}
			
		RegionalConstraint regionalConstraint = fare.getRegionalConstraint();
		
		LegacySeries series = GtmFactory.eINSTANCE.createLegacySeries();
		
		if (regionalConstraint == null ||
			regionalConstraint.getRegionalValidity().isEmpty() ||
			regionalConstraint.getRegionalValidity().get(0).getViaStation() == null ) {
			return null;
		}

		RegionalValidity regionalValidity =  regionalConstraint.getRegionalValidity().get(0);
		ServiceConstraint routeServiceConstraint = null;
		if (regionalValidity.getServiceConstraint() != null && regionalValidity.getServiceConstraint().getLegacy108Code() > 0) {
			routeServiceConstraint = regionalValidity.getServiceConstraint();
		}
				
		ViaStation mainVia = regionalValidity.getViaStation();
		if (mainVia.getCarrier() != null) {
			series.setCarrierCode( mainVia.getCarrier().getCode());
			addCarrier(mainVia.getCarrier());
		}
		if (mainVia.getServiceConstraint() != null && mainVia.getServiceConstraint().getLegacy108Code() > 0) {
			routeServiceConstraint = mainVia.getServiceConstraint();
		}		
		
	
		BigDecimal distance = new BigDecimal(Float.toString(regionalConstraint.getDistance()));
		series.setDistance1(distance.intValue());
		series.setDistance2(distance.intValue());
		
		series.setPricetype(LegacyCalculationType.ROUTE_BASED);
		
		String routeDescription = RouteDescriptionBuilder.getViaDescription(regionalConstraint.getRegionalValidity());
		series.setRouteDescription(routeDescription);
		if (routeDescription.length() > 58) {
			String message = NationalLanguageSupport.ConverterToLegacy_28 + routeDescription;
			GtmUtils.writeConsoleWarning(message, editor);
		}
		
		if (series.getFromStation() == 0) {
			Legacy108Station ls = getFirstLegacyStation(mainVia,regionalConstraint.getEntryConnectionPoint());
			if (ls == null) {
				String route = RouteDescriptionBuilder.getRouteDescription(regionalConstraint.getRegionalValidity());
				String message = "Route not covertable - departure not found: " + route;
				GtmUtils.writeConsoleError(message, editor);
				return null;
			}
			series.setFromStation(ls.getStationCode());
			series.setFromStationName(ls.getName());	
		}
	
		if (series.getFromStation() == 0) {
			String route = RouteDescriptionBuilder.getRouteDescription(regionalConstraint.getRegionalValidity());
			String message = "Route not convertable - departure code 0: " + route;
			GtmUtils.writeConsoleError(message, editor);
			return null;
		}
		
		Route mainRoute = mainVia.getRoute();
		int altRoute = 1;
		boolean excludeStartEnd = true;
		addViaStations (series.getViastations(), mainRoute.getStations(), altRoute, routeServiceConstraint, excludeStartEnd);
		if (series.getViastations().size() > 5) {
			String message = NationalLanguageSupport.ConverterToLegacy_29 + routeDescription;
			GtmUtils.writeConsoleError(message, editor);
			return null;
		}
		
		series.setSupplyingCarrierCode(tool.getGeneralTariffModel().getDelivery().getProvider().getCode());
		
		if (series.getToStation() == 0) {
			Legacy108Station ls = getLastLegacyStation(mainVia,regionalConstraint.getExitConnectionPoint());
			if (ls == null) {
				String route = RouteDescriptionBuilder.getRouteDescription(regionalConstraint.getRegionalValidity());
				String message = "Route not convertable - arrival not found: " + route;
				GtmUtils.writeConsoleError(message, editor);	
				return null;
			}
			series.setToStation(ls.getStationCode());
			series.setToStationName(ls.getName());	
		}
		
		if (series.getToStation() == 0) {
			String route = RouteDescriptionBuilder.getRouteDescription(regionalConstraint.getRegionalValidity());
			String message = "Route not convertable - arrival code 0: " + route;
			GtmUtils.writeConsoleError(message, editor);
			return null;
		}

		series.setType(getType(regionalConstraint));
			
		if (fare.getCarrierConstraint() != null && 
			fare.getCarrierConstraint().getIncludedCarriers() != null && 
		    series.getCarrierCode() == null &&
			!fare.getCarrierConstraint().getIncludedCarriers().isEmpty()) {
			series.setCarrierCode(fare.getCarrierConstraint().getIncludedCarriers().get(0).getCode());	
            addCarrier(fare.getCarrierConstraint().getIncludedCarriers().get(0));
		} 	
		
		series.setNumber(fare.getLegacyAccountingIdentifier().getSeriesId());
		
		HashSet<SalesAvailabilityConstraint> salesAvailabilities = new HashSet<SalesAvailabilityConstraint>();
		for (FareElement f : regionalConstraint.getLinkedFares()){
			salesAvailabilities.add(f.getFareConstraintBundle().getSalesAvailability());
		}	
		DateRange dateRange = getDateRange(salesAvailabilities);
		series.setValidFrom(dateRange.getStartDate());
		series.setValidUntil(dateRange.getEndDate());	
		
		if (fare.getServiceConstraint() != null && fare.getServiceConstraint().getIncludedServiceBrands() != null) {
			for (ServiceBrand brand : fare.getServiceConstraint().getIncludedServiceBrands()) {
				if (brand.getTransportMode() != null) {
					if (brand.getTransportMode().equals(TransportMode.BUS)) {
						series.setBusCode("B");
					} 
				}
				if (brand.getTransportMode() != null) {
					if (brand.getTransportMode().equals(TransportMode.SHIP)) {
						series.setFerryCode("S");
					} 
				}			
			}
		}
		
		return series;
	}
	
	private DateRange getDateRange(HashSet<SalesAvailabilityConstraint> salesAvailabilities) {
		
		Date startDate = null;
		Date endDate = null;
		
		for (SalesAvailabilityConstraint s : salesAvailabilities) {
		
			for (SalesRestriction r : s.getRestrictions()) {
			
				if (r.getSalesDates() != null && r.getSalesDates().getFromDateTime() != null) {
					if (startDate == null) {
						startDate = r.getSalesDates().getFromDateTime();
					} else {
						if (startDate.after(r.getSalesDates().getFromDateTime())) {
							startDate = r.getSalesDates().getFromDateTime();
						}
					}
				}
			
				if (r.getSalesDates() != null && r.getSalesDates().getUntilDateTime() != null) {
					if (endDate == null) {
						endDate = r.getSalesDates().getUntilDateTime();
					} else {
						if (endDate.before(r.getSalesDates().getUntilDateTime())) {
							endDate = r.getSalesDates().getUntilDateTime();
						}
					}
				}
			}
		}
		return new DateRange(startDate, endDate);
	}



	/**
	 * Gets the legacy station.
	 *
	 * @param connectionPoint the connection point
	 * @return the legacy station
	 */
	private Legacy108Station getLegacyStation(ConnectionPoint connectionPoint) {
		
		if (connectionPoint == null) return null;
		
		if (connectionPoint.getLegacyBorderPointCode() != 0) {
				
			//check for the station in the border point data
			ArrayList<Station> s = null;
			LegacyBorderPoint lbp = getLegacyBorderPoint (connectionPoint.getLegacyBorderPointCode() );
			if (lbp != null) {
				LegacyBorderSide lbs  = getBorderSide(tool.getGeneralTariffModel().getDelivery().getProvider(),lbp);
				if (lbs != null) {
					return legacyStations.get(lbs.getLegacyStationCode());
				}
			
				//failed, try an on border station in the required country
				s = getLocalStations(tool.getConversionFromLegacy().getParams().getCountry(),lbp.getOnBorderStations());
				if (s != null && s.size() > 0) {
					return legacyStations.get(Integer.parseInt(s.get(0).getCode()));
				}
			}
			
			//failed again 
			s =  getLocalStations(tool.getConversionFromLegacy().getParams().getCountry(), connectionPoint);
			if (s != null && s.size() > 0) {
				return legacyStations.get(Integer.parseInt(s.get(0).getCode()));
			}

		}

		return null;
	}
	
	
	
	
	/**
	 * Gets the local stations.
	 *
	 * @param country the country
	 * @param onBorderStations the on border stations
	 * @return the local stations
	 */
	private ArrayList<Station> getLocalStations(Country country, OnBorderStations onBorderStations) {
		if (onBorderStations == null) return null;
		if (onBorderStations.getStations() == null) return null;		
		if (country == null) return null;


		ArrayList<Station> stations = new ArrayList<Station>();
			
		for (Station s : onBorderStations.getStations().getStations()) {
			if (country == null || s.getCountry().getCode() == country.getCode())  {
				stations.add(s);
			}
		}
		if (stations.size() > 0) {
			return stations;
		}
		return null;
	}

	/**
	 * Gets the local stations.
	 *
	 * @param c the c
	 * @param p the p
	 * @return the local stations
	 */
	private ArrayList<Station> getLocalStations(Country c, ConnectionPoint p){
			
		ArrayList<Station> stations = new ArrayList<Station>();
		if (p == null) return stations;
		
		for (StationSet set : p.getConnectedStationSets()) {
			
			for (Station s : set.getStations()) {
				if (c == null || s.getCountry().getCode() == c.getCode())  {
					stations.add(s);
				}
			}
		}
		return stations;
		
	}


	/**
	 * Gets the legacy border point.
	 *
	 * @param code the code
	 * @return the legacy border point
	 */
	private LegacyBorderPoint getLegacyBorderPoint(int code) {
		
		if (tool.getConversionFromLegacy().getLegacy108() == null ||
			tool.getConversionFromLegacy().getLegacy108().getLegacyBorderPoints() == null || 
			tool.getConversionFromLegacy().getLegacy108().getLegacyBorderPoints().getLegacyBorderPoints() == null) {
			return null;
		}
		
		for (LegacyBorderPoint lbp : tool.getConversionFromLegacy().getLegacy108().getLegacyBorderPoints().getLegacyBorderPoints()) {
			if (lbp.getBorderPointCode() == code) {
				return lbp;
			}
		}
		return null;
	}

	/**
	 * Adds the via stations.
	 *
	 * @param viastations the viastations
	 * @param vias the vias
	 * @param altRoute the alt route
	 * @param routeServiceConstraint 
	 * @param excludeStartEnd 
	 * @return true, if successful
	 */
	private boolean addViaStations(EList<LegacyViastation> viastations, EList<ViaStation> vias, int altRoute, ServiceConstraint routeServiceConstraint, boolean excludeStartEnd) {
		
		int startIndex = 0;
		int endIndex = vias.size();
		if (excludeStartEnd) {
			startIndex++;
			endIndex--;			
		}
		
		for (int index = startIndex;index < endIndex; index++) {
			
			ViaStation station = vias.get(index);
			if (station.getServiceConstraint() != null && station.getServiceConstraint().getLegacy108Code() > 0) {
				LegacyViastation lvia = GtmFactory.eINSTANCE.createLegacyViastation();
				lvia.setPosition(altRoute);
				lvia.setCode(station.getServiceConstraint().getLegacy108Code());
				viastations.add(lvia);
			} else if (index == 1 && routeServiceConstraint != null && station.getServiceConstraint() == null) {
				LegacyViastation lvia = GtmFactory.eINSTANCE.createLegacyViastation();
				lvia.setPosition(altRoute);
				lvia.setCode(routeServiceConstraint.getLegacy108Code());
				viastations.add(lvia);
			} else	if (station.getStation() != null) {
				LegacyViastation lvia = GtmFactory.eINSTANCE.createLegacyViastation();
				lvia.setPosition(altRoute);
				lvia.setCode(Integer.parseInt(station.getStation().getCode()));
				viastations.add(lvia);
				if (station.getStation().getCountry().getCode() != tool.getConversionFromLegacy().getParams().getCountry().getCode()) {
					return false;
				}
			} else if (station.getFareStationSet() != null){
				LegacyViastation lvia = GtmFactory.eINSTANCE.createLegacyViastation();
				lvia.setPosition(altRoute);
				lvia.setCode(Integer.parseInt(station.getFareStationSet().getCode()));
				viastations.add(lvia);			
			} else if (station.getAlternativeRoutes() != null) {
				for (AlternativeRoute altr : station.getAlternativeRoutes()) {
					altRoute++;
					if (!addViaStations(viastations, altr.getStations(), altRoute,null, false)) {
						return false;
					};
				}
				altRoute = 1;
			} 
		}
		
		return true;
	}

	/**
	 * Gets the type.
	 *
	 * @param regionalConstraint the regional constraint
	 * @return the type
	 */
	private LegacySeriesType getType(RegionalConstraint regionalConstraint) {
		if (regionalConstraint.getEntryConnectionPoint() != null && 
			regionalConstraint.getExitConnectionPoint() != null &&
			regionalConstraint.getEntryConnectionPoint().getLegacyBorderPointCode() > 0 &&
			regionalConstraint.getExitConnectionPoint().getLegacyBorderPointCode() > 0
			) {
			return LegacySeriesType.TRANSIT;
		}
		if (regionalConstraint.getEntryConnectionPoint() != null && 
			regionalConstraint.getEntryConnectionPoint().getLegacyBorderPointCode() > 0) {
			return LegacySeriesType.BORDER_DESTINATION;
		}
		if (regionalConstraint.getExitConnectionPoint() != null && 
			regionalConstraint.getExitConnectionPoint().getLegacyBorderPointCode() > 0) {
				return LegacySeriesType.BORDER_DESTINATION;
		}		
		return LegacySeriesType.STATION_STATION;

	}
	
	/**
	 * Gets the first legacy station.
	 *
	 * @param viaStation the via station
	 * @param connectionPoint the connection point
	 * @return the first legacy station
	 */
	private Legacy108Station getFirstLegacyStation(ViaStation viaStation, ConnectionPoint connectionPoint) {
		ViaStation via = viaStation.getRoute().getStations().get(0);
		return getLegacyStation(via, connectionPoint);		
	}

	

	/**
	 * Gets the last legacy station.
	 *
	 * @param viaStation the via station
	 * @param connectionPoint the connection point
	 * @return the last legacy station
	 */
	private Legacy108Station getLastLegacyStation(ViaStation viaStation, ConnectionPoint connectionPoint) {
		ViaStation via = viaStation.getRoute().getStations().get(viaStation.getRoute().getStations().size() - 1);
		return getLegacyStation(via, connectionPoint);
	}
	
	
	/**
	 * Gets the legacy station.
	 *
	 * @param via the via
	 * @param connectionPoint the connection point
	 * @return the legacy station
	 */
	private Legacy108Station getLegacyStation(ViaStation via, ConnectionPoint connectionPoint) {

		if (connectionPoint != null && connectionPoint.getLegacyBorderPointCode() > 0) {
			Legacy108Station ls = getLegacyStation(connectionPoint);
			if (ls != null) {
				return ls;
			}
		}

		int code = 0;
		if (via.getStation() != null) {
			code = Integer.parseInt(via.getStation().getCode());
		} else if (via.getFareStationSet() != null) {
			code = Integer.parseInt(via.getFareStationSet().getCode());
		}
		
		Legacy108Station ls =  legacyStations.get(code);
		
		if (ls == null) {			
			if (via.getStation() != null) {

				//station name not in list of stations in the country
				Legacy108Station l = null;
				
				if (via.getStation().getLegacyBorderPointCode() > 0) {
					l = convertStation(via.getStation());
					legacyBorderStations.put(l.getBorderPointCode(), l);
					
					String message = null;
					if (via.getStation().getCountry() != null && via.getStation().getCountry().getName() != null ) {
						message = "Border station outside of country missing in border point data: " +  GtmUtils.getLabelText(via.getStation()) + " in " +  via.getStation().getCountry().getName();
					} else {
						message = "Border station outside of country missing in border point data: " +  GtmUtils.getLabelText(via.getStation());					
					}
					GtmUtils.writeConsoleWarning(message, editor);
					
					ls = l;
				} else {
					//not a border point and not in country
					if (via.getStation() != null && !via.getStation().getCountry().equals(tool.getConversionFromLegacy().getParams().getCountry())) {
						StringBuilder sb = new StringBuilder(); 
						sb.append(via.getStation().getName());
						sb.append(" not in ").append(tool.getConversionFromLegacy().getParams().getCountry().getName());
						sb.append(" and not a border point: regional validity will not be converted");
						GtmUtils.writeConsoleWarning(sb.toString(),editor);
					} else {
						StringBuilder sb = new StringBuilder(); 
						sb.append("No local code for station: ");
						sb.append(RouteDescriptionBuilder.getRouteDescription(via));					
   					    sb.append(" found: regional validity will not be converted");
						GtmUtils.writeConsoleWarning(sb.toString(),editor);
					}
					return null;
				}
		
			} else {
				String message = "Fare Station Set names not found: " +  GtmUtils.getLabelText(via) ;
				GtmUtils.writeConsoleError(message, editor);
			}
		}
		return ls;
		
	}

	
	/**
	 * Select fares.
	 *
	 * @return the list
	 */
	private List<FareElement> selectFares() {
		
		ArrayList<FareElement> fares = new ArrayList<FareElement>();
		
		for (FareElement fare :  tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements()) {		

			try {
				if (isConvertable(fare)) {
					fares.add(fare);
				}
			} catch (Exception e) {
				StringBuilder sb = new StringBuilder();
				sb.append("Unknown error! Fare not converted: fareId - ").append(fare.getId()).append('\n');
				sb.append(GtmUtils.getStackTrace(e));
				GtmUtils.writeConsoleError(sb.toString(), editor);
			}
		}
		
		return fares;
	}
	
	/**
	 * Checks if is convertable.
	 *
	 * @param fare the fare
	 * @return true, if is convertable
	 */
	private boolean isConvertable(FareElement fare) {
		
		
		//service classes B and D are converted
		
		if (fare.getServiceClass() == null) {
			String message = "Service class is missing! " + GtmUtils.getLabelText(fare) + " will not be converted";
			GtmUtils.writeConsoleError(message, editor);						
			return false;
		}
		
		if (fare.getLegacyConversion() != LegacyConversionType.NO  && 
			fare.getServiceClass().getId() == ClassId.A || fare.getServiceClass().getId() == ClassId.C) {
			String message = "Service class A or C. " + GtmUtils.getLabelText(fare) + " will not be converted";
			GtmUtils.writeConsoleWarning(message, editor);		
		}
		
		if (fare.getServiceClass().getId() == ClassId.A) return false;
		if (fare.getServiceClass().getId() == ClassId.C) return false;
		
		
		//classic classes not matching
		if ( (fare.getServiceClass().getId() == ClassId.B && !(fare.getServiceClass().getClassicClass() == null || fare.getServiceClass().getClassicClass() == ClassicClassType.FIRST) )
				||
			 (fare.getServiceClass().getId() == ClassId.D && !(fare.getServiceClass().getClassicClass() == null || fare.getServiceClass().getClassicClass() == ClassicClassType.SECOND) )	
				){
			String message = "Service class / Classic class mismatch. " + GtmUtils.getLabelText(fare) + " will not be converted";
			GtmUtils.writeConsoleWarning(message, editor);			
		}
		
		
		//fare excluded from conversion
		if (fare.getLegacyConversion() == LegacyConversionType.NO) return false;
		
		//only ADULT
		if (fare.getPassengerConstraint() == null) {
			String message = "Passenger constraint missing in: " + GtmUtils.getLabelText(fare) + " will not be converted";
			GtmUtils.writeConsoleError(message, editor);			
			return false;
		}
		
		if (fare.getPassengerConstraint().getTravelerType() != TravelerType.ADULT)  {
			return false;
		}
	
		//only FULL_FLEX combination
		if (!isFullFlexCombi(fare))  return false;
		
		//no reductions
		if (fare.getReductionConstraint() != null)  return false;
		
		//must have one sales availability 
		if (fare.getFareConstraintBundle() == null ||
			fare.getFareConstraintBundle().getSalesAvailability() == null) return false;
		if (fare.getFareConstraintBundle().getSalesAvailability().getRestrictions() == null) return false;
		if (fare.getFareConstraintBundle().getSalesAvailability().getRestrictions().isEmpty()) return false;
		if (fare.getFareConstraintBundle().getSalesAvailability().getRestrictions().size() == 0) return false;
		

		//must be convertible in legacy series
		if (!hasSimpleRegionalValidity(fare)) {
			return false;
		}		
		
		// there must be a route description
		if (fare.getRegionalConstraint() == null ||
			fare.getRegionalConstraint().getRegionalValidity()== null || 
			fare.getRegionalConstraint().getRegionalValidity().isEmpty() || 
			fare.getRegionalConstraint().getRegionalValidity().get(0).getViaStation() == null) {
			return false;
		}
		//use one direction only
		if (isReversedSeries(fare.getRegionalConstraint())) {
			return false;
		}
		
		//regional service constraints can convert
		if (!serviceConstraintConvertable(fare.getRegionalConstraint())) {
			return false;
		}

		//series can convert
		LegacySeries s = convertToSeries(fare);
		if (s == null) {
			return false; 
		}

		return true;
	}

	private boolean serviceConstraintConvertable(RegionalConstraint regionalConstraint) {
		
		if (regionalConstraint.getRegionalValidity() == null || regionalConstraint.getRegionalValidity().size() != 1) {
			return false;
		}
		RegionalValidity regionalValidity = regionalConstraint.getRegionalValidity().get(0);
		if (regionalValidity.getServiceConstraint() != null) {
			if (!isConvertable(regionalValidity.getServiceConstraint())) {
				return false;
			}
		}
		if (regionalValidity.getViaStation() == null) {
			if (!isConvertable(regionalValidity.getViaStation())) {
				return false;
			}
		}
		

		return true;
	}

	private boolean isConvertable(ViaStation viaStation) {
		
		if (viaStation.getServiceConstraint() != null) {
			if (!isConvertable(viaStation.getServiceConstraint())) {
				return false;
			}
		}
		if (viaStation.getRoute() != null && !viaStation.getRoute().getStations().isEmpty()) {
			for (ViaStation v : viaStation.getRoute().getStations()) {
				if (! isConvertable(v)) {
					return false;
				}
			}
		}
		if (viaStation.getAlternativeRoutes() != null && !viaStation.getAlternativeRoutes().isEmpty()) {
			
			for ( AlternativeRoute ar:  viaStation.getAlternativeRoutes()) {
				if (ar.getStations() != null && !ar.getStations().isEmpty()) {
					for (ViaStation v : ar.getStations()) {
						if (! isConvertable(v)) {
							return false;
						}
					}
				}
			}
			
		}
		return true;
	}

	private boolean isConvertable(ServiceConstraint serviceConstraint) {
		
		if (serviceConstraint.getLegacy108Code() < 0 || serviceConstraint.getLegacy108Code() > 99999) {
			return false;
		}
		if (serviceConstraint.getExcludedServiceBrands() != null && !serviceConstraint.getExcludedServiceBrands().isEmpty()) {
			String message = "ServiceConstraint with excluded Service Brands is not convertable! Legacy Code: " +  Integer.toString(serviceConstraint.getLegacy108Code());
			GtmUtils.writeConsoleError(message, editor);
			return false;
		}
		if (serviceConstraint.getIncludedServiceBrands() != null || serviceConstraint.getIncludedServiceBrands().isEmpty()) {
			String message = "ServiceConstraint without included Service Brands is not convertable! ";
			GtmUtils.writeConsoleError(message, editor);
			return false;
		}		
		return true;
	}

	/**
	 * Checks for simple regional validity.
	 *
	 * @param fare the fare
	 * @return true, if successful
	 */
	private boolean hasSimpleRegionalValidity(FareElement fare) {
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
		addStations(via,stations, fareStations);
		
		//too many stations
		if (stations.size() + fareStations.size() > 7) {
			return false;
		}
				
		return true;
	}
	
	/**
	 * Checks if is reversed series.
	 *
	 * @param via the via
	 * @return true, if is reversed series
	 */
	private boolean isReversedSeries(RegionalConstraint regionalConstraint) {

		ViaStation via = regionalConstraint.getRegionalValidity().get(0).getViaStation();	
		
		String startName  = null;
		String endName = null;

		int startBorder = 0;
		int endBorder = 0;

		ViaStation first = via.getRoute().getStations().get(0);
		ViaStation last = via.getRoute().getStations().get(via.getRoute().getStations().size()-1);
		
		if (regionalConstraint.getEntryConnectionPoint() != null && 
			regionalConstraint.getEntryConnectionPoint().getLegacyBorderPointCode() > 0) {
			startBorder =  regionalConstraint.getEntryConnectionPoint().getLegacyBorderPointCode();
		}
		if (regionalConstraint.getExitConnectionPoint() != null && 
			regionalConstraint.getExitConnectionPoint().getLegacyBorderPointCode() > 0) {
			endBorder = regionalConstraint.getExitConnectionPoint().getLegacyBorderPointCode();
		}		
	
		try {
			if (first.getStation()!= null){
				startName = first.getStation().getNameCaseASCII();
			} else { 
				startName = first.getFareStationSet().getName();
			}
		} catch (Exception e) {
			return true;
		}
		
		try {
			if (last.getStation()!= null){
				endName = last.getStation().getNameCaseASCII();
			} else { 
				endName = last.getFareStationSet().getName();
			}
		} catch (Exception e) {
			return true;
		}
		
		if (startBorder > 0 && endBorder == 0) {
			return false;
		} else if (startBorder == 0 && endBorder > 0) {
			return true;
		}
		
		if (startName == null || endName == null) {
			
			StringBuilder sb = new StringBuilder();
			sb.append("Start of End Name missing. Route ").append(RouteDescriptionBuilder.getRouteDescription(via)).append(" not convertable");
			 
			GtmUtils.writeConsoleError(sb.toString(), editor);
			
			return false;
		}		
		
		if (startName.compareToIgnoreCase(endName) > 0) return true;

		return false;

	}

	/**
	 * Adds the stations.
	 *
	 * @param via the via
	 * @param stations the stations
	 * @param fareStations the fare stations
	 */
	private void addStations(ViaStation via, List<Station> stations, List<FareStationSetDefinition> fareStations) {
		
		if (via == null) return;
		if (via.getStation() != null) stations.add(via.getStation());
		if (via.getFareStationSet()!= null) fareStations.add(via.getFareStationSet());
		
		if (via.getRoute() != null) {
			for (ViaStation via2 :via.getRoute().getStations()) {
				addStations(via2, stations, fareStations);
			}
		}
		
		for (AlternativeRoute route: via.getAlternativeRoutes()) {
			for (ViaStation via3 : route.getStations()) {
				addStations(via3, stations,fareStations);
			}
		}
		
	}

	/**
	 * Checks if is full flex combi.
	 *
	 * @param fare the fare
	 * @return true, if is full flex combi
	 */
	private boolean isFullFlexCombi(FareElement fare) {
		if (fare.getFareConstraintBundle() == null || 
			fare.getFareConstraintBundle().getCombinationConstraint() ==  null) return false;
		for (FareCombinationModel model : fare.getFareConstraintBundle().getCombinationConstraint().getCombinationModels()) {
			
			//must allow clustering in full flex
			if (model.getModel() == CombinationModel.CLUSTERING &&
				model.getReferenceCluster() == Clusters.FULLFLEX) {
				if (model.getCombinableCarriers().isEmpty() || 
					model.getCombinableCarriers().contains(tool.getConversionFromLegacy().getLegacy108().getCarrier())) {
					if (model.getAllowedAllocators().isEmpty() || 
						model.getAllowedAllocators().contains(tool.getConversionFromLegacy().getLegacy108().getCarrier())) {	
						return true;
					}
				}
			}
		}
		return false;
	}
	
	private void addCarrier(Carrier carrier) {
		
		if (carrier == null) return;
		
		LegacyCarrier lc = carriers.get(carrier.getCode());
		
		if (lc == null) {
			
			lc = GtmFactory.eINSTANCE.createLegacyCarrier();
			lc.setCarrierCode(carrier.getCode());
			lc.setCarrierShortName(GtmUtils.utf2ascii(carrier.getShortName()));
			lc.setCarrierName(carrier.getName());
						
			carriers.put(carrier.getCode(), lc);
						
		} 
		
	}
	
}
