package Gtm.jsonImportExport;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.xml.type.internal.DataValue.Base64;

import Gtm.*;
import Gtm.nls.NationalLanguageSupport;
import Gtm.utils.GtmUtils;
import gtmV31.AfterSalesConditionDef;
import gtmV31.AfterSalesRuleDef;
import gtmV31.AllowedChange;
import gtmV31.BarCodeTypesDef;
import gtmV31.CalendarDef;
import gtmV31.CarrierConstraintDef;
import gtmV31.CarrierResourceLocationDef;
import gtmV31.CombinationConstraint;
import gtmV31.ConnectionPointDef;
import gtmV31.ControlSecurityTypeDef;
import gtmV31.CrossBorderConditionDef;
import gtmV31.CurrencyPriceDef;
import gtmV31.ExcludedTimeRange;
import gtmV31.FareCombinationConstraintDef;
import gtmV31.FareCombinationModelDef;
import gtmV31.FareConstraintBundle;
import gtmV31.FareConstraintBundle.FareTypeDef;
import gtmV31.FareDataDef;
import gtmV31.FareDef;
import gtmV31.FareDelivery;
import gtmV31.FareDeliveryDef;
import gtmV31.FareDeliveryDetailsDef;
import gtmV31.FareDeliveryDetailsDef.Usage;
import gtmV31.FareReferenceStationSet;
import gtmV31.FareReferenceStationSetDef;
import gtmV31.FareResourceLocationDef;
import gtmV31.FulfillmentConstraintDef;
import gtmV31.GeoCoordinate;
import gtmV31.IncludedFreePassenger;
import gtmV31.LegacyAccountingIdentifierDef;
import gtmV31.LegacyReservationParameterDef;
import gtmV31.LineDef;
import gtmV31.LuggageConstraint;
import gtmV31.LuggageRestriction;
import gtmV31.OnlineResourceDef;
import gtmV31.PassengerCombinationConstraintDef;
import gtmV31.PassengerConstraintDef;
import gtmV31.PersonalDataConstraintDef;
import gtmV31.PolygonDef;
import gtmV31.PriceDef;
import gtmV31.Product;
import gtmV31.ReductionCardDef;
import gtmV31.ReductionCardReferenceDef;
import gtmV31.ReductionConstraintDef;
import gtmV31.RegionalConstraintDef;
import gtmV31.RegionalValidityDef;
import gtmV31.RelativeTimeDef;
import gtmV31.RequiredDatum;
import gtmV31.RequiredSi;
import gtmV31.ReservationOptionGroupDef;
import gtmV31.ReservationParameterDef;
import gtmV31.ReservationOptions;
import gtmV31.ReturnConstraint;
import gtmV31.SalesAvailabilityConstraintDef;
import gtmV31.ServiceClassDefinitionDef;
import gtmV31.ServiceClassDefinitionDef.ComfortClassDef;
import gtmV31.ServiceClassDefinitionDef.ServiceClassIdDef;
import gtmV31.ServiceClassDefinitionDef.TravelClassDef;
import gtmV31.ServiceConstraintDef;
import gtmV31.ServiceLevelDef;
import gtmV31.StationDef;
import gtmV31.StationNamesDef;
import gtmV31.StationResourceLocationDef;
import gtmV31.TextDef;
import gtmV31.RelativeTimeDef.TimeUnit;
import gtmV31.TrainResourceLocationDef;
import gtmV31.Transfer;
import gtmV31.TranslationDef;
import gtmV31.TravelValidityConstraintDef;
import gtmV31.TripAllocationConstraintDef;
import gtmV31.TripInterruptionConstraintDef;
import gtmV31.ValidityRange.TimeUnitDef;
import gtmV31.VatDetailDef;
import gtmV31.VatDetailDef.VatScopeDef;
import gtmV31.ConditionText;
import gtmV31.Product;
import gtmV31.ViaStationsDef;
import gtmV31.ZoneDef;
import gtmV31.ZoneDefinitionDef;



public class GtmJsonExporterV31 {
		
	/*
	 *  y   = year   (yy or yyyy)
	 *	M   = month  (MM)
	 *	d   = day in month (dd)
	 *	h   = hour (0-12)  (hh)
	 *	H   = hour (0-23)  (HH)
	 *	m   = minute in hour (mm)
	 *	s   = seconds (ss)
	 *	S   = milliseconds (SSS)
	 *	z   = time zone  text        (e.g. Pacific Standard Time...)
	 *	Z   = time zone, time offset (e.g. -0800)
	 *
	 *
	 * "2012-04-21T18:25:43-05:00"             ISO 8601
	 * 
	 * 	private DateFormat jsondf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ"); //$NON-NLS-1$
	 */
	

	private GeneralTariffModel gtm = null;
	
	public GtmJsonExporterV31 () {	}

	public GtmJsonExporterV31 (GeneralTariffModel gtm) {
		this.gtm = gtm;
	}
	
	public FareDelivery convertToJson(GeneralTariffModel gtm, IProgressMonitor monitor) {

		
		if (gtm == null || gtm.getDelivery() == null || gtm.getFareStructure() == null) return null;
		
		this.gtm = gtm;
		
	
		FareDelivery export = new FareDelivery();
		FareDeliveryDef exportData = new FareDeliveryDef();
		export.setFareStructureDelivery(exportData);
		
		exportData.setDelivery(convertDeliveryToJson(gtm.getDelivery()));
		
		FareDataDef fares = new FareDataDef();
		exportData.setFareStructure(fares);

					
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_1);
		if (gtm.getFareStructure().getAfterSalesRules() != null) {
			fares.setAfterSalesConditions(convertAfterSalesConditionsToJson(gtm.getFareStructure().getAfterSalesRules()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_2);
		if (gtm.getFareStructure().getCalendars() != null) {		
			fares.setCalendars(convertCalendars(gtm.getFareStructure().getCalendars()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_3);
		if (gtm.getFareStructure().getCarrierConstraints() != null) {
			fares.setCarrierConstraints(convertCarrierConstraints(gtm.getFareStructure().getCarrierConstraints()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_4);
		if (gtm.getFareStructure().getCombinationConstraints() != null) {
			fares.setCombinationConstraints(convertCombinationConstraints(gtm.getFareStructure().getCombinationConstraints()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_5);
		if (gtm.getFareStructure().getConnectionPoints() != null) {
			fares.setConnectionPoints(convertConnectionPoints(gtm.getFareStructure().getConnectionPoints()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_6a);
		if (gtm.getFareStructure().getTotalPassengerCombinationConstraints() != null) {
			fares.setPassengerCombinationConstraints(convertTotalPassengerConstraints(gtm.getFareStructure().getTotalPassengerCombinationConstraints()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_6b);
		if (gtm.getFareStructure().getFareConstraintBundles() != null) {
			fares.setFareConstraintBundles(convertFareBundles(gtm.getFareStructure().getFareConstraintBundles()));
		}
		monitor.worked(1);
				
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_6);
		if (gtm.getFareStructure().getFareElements() != null) {
			fares.setFares(convertFareElements(gtm.getFareStructure().getFareElements()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_7);
		if (gtm.getFareStructure().getFareResourceLocations() != null) {
			fares.setFareResourceLocation(convertFareResourceLocation(gtm.getFareStructure().getFareResourceLocations()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_8);
		if (gtm.getFareStructure().getFulfillmentConstraints() != null) {
			fares.setFulfillmentConstraints(convertFullfillmentConstraints(gtm.getFareStructure().getFulfillmentConstraints()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_9);
		if (gtm.getFareStructure().getPassengerConstraints() != null) {
			fares.setPassengerConstraints(convertPassengerConstraints(gtm.getFareStructure().getPassengerConstraints()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_10);
		if (gtm.getFareStructure().getPersonalDataConstraints() != null) {
			fares.setPersonalDataConstraints(convertPersonalDataConstraints(gtm.getFareStructure().getPersonalDataConstraints()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_11);
		if (gtm.getFareStructure().getPrices() != null) {
			fares.setPrices(convertPrices(gtm.getFareStructure().getPrices()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_12);
		if (gtm.getFareStructure().getReductionCards() != null) {
			fares.setReductionCards(convertReductionCards(gtm.getFareStructure().getReductionCards()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_13);
		if (gtm.getFareStructure().getReductionConstraints() != null) {
			fares.setReductionConstraints(convertReductionConstraints(gtm.getFareStructure().getReductionConstraints()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_14);
		if (gtm.getFareStructure().getRegionalConstraints() != null) {
			fares.setRegionalConstraints(convertRegionalConstraints(gtm.getFareStructure().getRegionalConstraints()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_15);
		if (gtm.getFareStructure().getReservationParameters() != null) {
			fares.setReservationParameters(convertReservationParameters(gtm.getFareStructure().getReservationParameters()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_16);
		if (gtm.getFareStructure().getSalesAvailabilityConstraints() != null) {
			fares.setSalesAvailabilityConstraint(convertSalesAvailabilityConstraints(gtm.getFareStructure().getSalesAvailabilityConstraints()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_17);
		if (gtm.getFareStructure().getServiceClassDefinitions() != null) {
			fares.setServiceClassDefinitions(convertServiceClassDefinitions(gtm.getFareStructure().getServiceClassDefinitions()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_18);
		if (gtm.getFareStructure().getServiceConstraints() != null) {
			fares.setServiceConstraints(convertServiceConstraints(gtm.getFareStructure().getServiceConstraints()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_19);
		if (gtm.getFareStructure().getServiceLevelDefinitions() != null) {
			fares.setServiceLevelDefinitions(convertServiceLevelDefinitions(gtm.getFareStructure().getServiceLevelDefinitions()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_20);
		if (gtm.getFareStructure().getSupportedOnlineServices() != null && !gtm.getFareStructure().getSupportedOnlineServices().getSupportedOnlineServices().isEmpty()) {
			ArrayList<String> services = new ArrayList<String>();
			for (OnlineServiceType serviceType : gtm.getFareStructure().getSupportedOnlineServices().getSupportedOnlineServices()) {
				services.add(serviceType.getName());
			}
			fares.setSupportedOnlineServices(services);
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_21);
		if (gtm.getFareStructure().getTexts() != null) {
			fares.setTexts(convertTexts(gtm.getFareStructure().getTexts()));
		}
		monitor.worked(1);
			
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_22);
		if (gtm.getFareStructure().getTravelValidityConstraints() != null) {
			fares.setTravelValidityConstraints(convertTravelValidityConstraints(gtm.getFareStructure().getTravelValidityConstraints()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_23);
		if (gtm.getFareStructure().getFareStationSetDefinitions() != null) {
			fares.setFareReferenceStationSetDefinitions(convertFareStationSetDefinitions(gtm.getFareStructure().getFareStationSetDefinitions()));
		}
		monitor.worked(1);

		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_24);
		if (gtm.getFareStructure().getZoneDefinitions() != null) {
			fares.setZoneDefinitions(convert(gtm.getFareStructure().getZoneDefinitions()));
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.GtmJsonExporter_25);
		if (gtm.getFareStructure().getStationNames()!= null) {
			fares.setStationNames(convertStationNames(gtm.getFareStructure().getStationNames()));
		}
		monitor.worked(1);

		monitor.subTask("Export Luggage Constraints");
		if (gtm.getFareStructure().getLuggageConstraints() != null && !gtm.getFareStructure().getLuggageConstraints().getConstraints().isEmpty()) {
			fares.setLuggageConstraints(convertLuggageConstraints(gtm.getFareStructure().getLuggageConstraints()));
		}
		monitor.worked(1);

		monitor.subTask("Export Products");
		if (gtm.getFareStructure().getProducts() != null && !gtm.getFareStructure().getProducts().getProducts().isEmpty()) {
			fares.setProducts(convertProducts(gtm.getFareStructure().getProducts()));
		}
		monitor.worked(1);
		
		monitor.subTask("Export Products");
		if (gtm.getFareStructure().getProducts() != null && !gtm.getFareStructure().getProducts().getProducts().isEmpty()) {
			fares.setProducts(convertProducts(gtm.getFareStructure().getProducts()));
		}				
		
		return export;
	}




	private List<Product> convertProducts(Products products) {
		
		List<Product> pl = new ArrayList<Product>();
		
		for (Gtm.Product pm : products.getProducts()) {
			
			Product p = new Product();
			
			p.setCarrierConstraintText(convertToJson(pm.getCarrierConstraintText()));
			p.setCode(pm.getCode());
			p.setDescription(convertToJson(pm.getDescription()));
			p.setIsExchangeableAfterValidity(pm.getExchangeableAfterValidity());
			p.setIsExchangeablebeforeValidity(pm.getExchangeableBeforeValidity());
			p.setIsRefundableAfterValidity(pm.getRefundableAfterValidity());
			p.setIsRefundableBeforeValidity(pm.getRefundableBeforeValidity());
			p.setIsReturnProduct(pm.getReturnProduct());
			p.setIsTrainBound(pm.getTrainBound());
			p.setName(convertToJson(pm.getName()));
			p.setServiceConstraintText(convertToJson(pm.getServiceConstraintText()));
			p.setTravelClass(convertTravelClass(pm.getTravelClass()));
			p.setType(pm.getType().getLiteral());
			
			pl.add(p);
	
		}
		

		return pl;
	}



	private List<LuggageConstraint> convertLuggageConstraints(LuggageConstraints lcs) {

		List<LuggageConstraint> jllc = new ArrayList<LuggageConstraint>();
		
		for (Gtm.LuggageConstraint lc : lcs.getConstraints()) {
			
			LuggageConstraint jlc = new LuggageConstraint();
			
			jlc.setId(lc.getId());
			jlc.setMaxHandLuggage(lc.getMaxHandLuggage());
			jlc.setMaxLargeLuggage(lc.getMaxLargeLuggage());
			
			if (lc.getRules() != null && !lc.getRules().isEmpty()) {
								
				jlc.setLuggageRules(new ArrayList<String>());
				for (LuggageRule lr : lc.getRules()) {
					jlc.getLuggageRules().add(lr.getLiteral());
				}
			}
			
			if (lc.getRestrictedItems() != null && !lc.getRestrictedItems().isEmpty()) {
				
				jlc.setRestrictedLuggageItems(new ArrayList<gtmV31.LuggageRestriction>());
				
				for (LuggageItemsRestriction lir : lc.getRestrictedItems() ) {
					
					jlc.getRestrictedLuggageItems().add(convert(lir));
					
				}
				
			}
		}
		
		return jllc;
	}

	private List<Product> convertProducts(Gtm.Products list) {
		
		List<Product> jlst = new ArrayList<Product>();
		
		for (Gtm.Product gP : list.getProducts()) {
			
			Product p = new Product();
			
			p.setId(gP.getId());
			p.setCode(gP.getCode());
			p.setIsExchangeableAfterValidity(gP.getExchangeableAfterValidity());
			p.setIsExchangeablebeforeValidity(gP.getExchangeableBeforeValidity());
			p.setIsRefundableAfterValidity(gP.getRefundableAfterValidity());
			p.setIsRefundableBeforeValidity(gP.getRefundableBeforeValidity());
			p.setIsReturnProduct(gP.getReturnProduct());
			p.setIsTrainBound(gP.getTrainBound());
			
			if (gP.getTravelClass() != null) {
				p.setTravelClass(TravelClassDef.fromValue(gP.getTravelClass().getLiteral()));
			}
			
			if (gP.getName() != null) {				
				p.setName(convertToJson(gP.getName()));
			}
			
			if (gP.getSummary() != null) {				
				p.setSummary(convertToJson(gP.getSummary()));
			}			
			
			if (gP.getDescription() != null) {				
				p.setDescription(convertToJson(gP.getDescription()));
			}
			
			if (gP.getCarrierConstraintText() != null) {				
				p.setCarrierConstraintText(convertToJson(gP.getCarrierConstraintText()));
			}

			if (gP.getServiceConstraintText() != null) {				
				p.setServiceConstraintText(convertToJson(gP.getServiceConstraintText()));
			}
			
			if (gP.getConditionTexts() != null && !gP.getConditionTexts().isEmpty()) {
				
				List<ConditionText> ctl = new ArrayList<ConditionText>();
				
				for (Gtm.ConditionText gct : gP.getConditionTexts()) {
					
					ConditionText ct = new ConditionText();
					
					ct.setType(gct.getType().getLiteral());
					
					ct.setDescription(convertToJson(gct.getText()));

					ctl.add(ct);
				}
				
				p.setConditions(ctl);
				
			}
			
			
			jlst.add(p);
		}

		return jlst;
	}
	
	private LuggageRestriction convert(LuggageItemsRestriction lir) {
		
		LuggageRestriction jlr = new LuggageRestriction();
		
		jlr.setNumberOfItems(lir.getNumberOfItems());
		
		if (lir.getDimension() != null && !lir.getDimension().isEmpty()) {
			
			jlr.setRestrictions(new ArrayList<gtmV31.LuggageDimension>());
			
			for (LuggageDimension ld : lir.getDimension()){
				
				jlr.getRestrictions().add(convert(ld));
				
			}
			
		}

		return jlr;
	}

	private gtmV31.LuggageDimension convert(LuggageDimension ld) {
		
		gtmV31.LuggageDimension jld = new gtmV31.LuggageDimension();
		
		jld.setValue(ld.getValue());
		jld.setDimension(convert(ld.getDimension()));
		
		return jld;
	}

	private gtmV31.LuggageDimension.Dimension convert(Dimension dimension) {
		
		if (dimension == null) return null;
		
		if (dimension.equals(Dimension.WEIGHT)) {
			return gtmV31.LuggageDimension.Dimension.WEIGHT;
		} else if (dimension.equals(Dimension.WEIGHT)) {
			return gtmV31.LuggageDimension.Dimension.VOLUME;
		} else if (dimension.equals(Dimension.VOLUME)) {
			return gtmV31.LuggageDimension.Dimension.HEIGHT;
		} else if (dimension.equals(Dimension.HEIGHT)) {
			return gtmV31.LuggageDimension.Dimension.WIDTH;
		} else if (dimension.equals(Dimension.WIDTH)) {
			return gtmV31.LuggageDimension.Dimension.LENGTH;
		} else if (dimension.equals(Dimension.LENGTH)) {
			return gtmV31.LuggageDimension.Dimension.WIDTH_HEIGHT;
		} else if (dimension.equals(Dimension.WIDTH_LENGTH_HEIGHT)) {
			return gtmV31.LuggageDimension.Dimension.WIDTH_HEIGHT_LENGTH;
		} 
		
		return null;
	}

	private List<PassengerCombinationConstraintDef> convertTotalPassengerConstraints(
			TotalPassengerCombinationConstraints totalPassengerCombinationConstraints) {
		
		if (totalPassengerCombinationConstraints == null) return null;
		
		List<PassengerCombinationConstraintDef> jL = new ArrayList<PassengerCombinationConstraintDef>();
		
		for (TotalPassengerCombinationConstraint element :  totalPassengerCombinationConstraints.getTotalPassengerCombinationConstraint()) {
			
			//export only if it is used
			if (  GtmUtils.isReferenced(element,gtm.getFareStructure().getFareConstraintBundles())) {
				PassengerCombinationConstraintDef jP = new PassengerCombinationConstraintDef();
				jP.setMaxWeightedPassengers(element.getMaxTotalPassengerWeight()) ;
				jP.setMinWeightedPassengers(element.getMinTotalPassengerWeight()) ;	
				jP.setId(element.getId());
				jL.add(jP);
			} else {
				StringBuilder sb = new StringBuilder();
				sb.append(GtmUtils.getLabelText(element)).append(" is not referenced, it will not be exported");
				GtmUtils.writeConsoleInfo(sb.toString(),null);
			}
		}

		return jL;
	}

	private List<FareConstraintBundle> convertFareBundles(FareConstraintBundles fareConstraintBundles) {
		
		if (fareConstraintBundles == null) return null;
		
		List<FareConstraintBundle> l = new ArrayList<FareConstraintBundle>();
		
		for (Gtm.FareConstraintBundle bundle : fareConstraintBundles.getFareConstraintBundles()) {
			
			//export only if it is used
			if (  GtmUtils.isReferenced(bundle,gtm.getFareStructure().getFareElements())) {
			
				FareConstraintBundle jBundle = new FareConstraintBundle();
				
				jBundle.setId(bundle.getId());
				
				if (bundle.getCombinationConstraint() != null) {
					jBundle.setCombinationConstraintRef(bundle.getCombinationConstraint().getId());
				}
				if (bundle.getCarrierConstraint() != null) {
					jBundle.setDefaultCarrierConstraintRef(bundle.getCarrierConstraint().getId());
				}
				if (bundle.getFulfillmentConstraint() != null) {
					jBundle.setFulfillmentConstraintRef(bundle.getFulfillmentConstraint().getId());
				}
				if (bundle.getPersonalDataConstraint() != null) {
					jBundle.setPersonalDataConstraintRef(bundle.getPersonalDataConstraint().getId());
				}
				if (bundle.getSalesAvailability() != null) {
					jBundle.setSalesAvailabilityConstraintRef(bundle.getSalesAvailability().getId());
				}
				if (bundle.getTotalPassengerConstraint() != null) {
					jBundle.setPassengerCombinationConstraintRef(bundle.getTotalPassengerConstraint().getId());
				}
				if (bundle.getSalesAvailability() != null) {
					jBundle.setSalesAvailabilityConstraintRef(bundle.getSalesAvailability().getId());
				}
				if (bundle.getTravelValidity() != null) {
					jBundle.setTravelValidityConstraintRef(bundle.getTravelValidity().getId());
				}

				if (bundle.getLuggageConstraint() != null) {
					jBundle.setDefaultLuggageConstraintRef(bundle.getLuggageConstraint().getId());
				}
				
				jBundle.setDefaultFareType(convert(bundle.getDefaultFareType()));
				
				l.add(jBundle);
			} else {
				StringBuilder sb = new StringBuilder();
				sb.append(GtmUtils.getLabelText(bundle)).append(" is not referenced, it will not be exported");
				GtmUtils.writeConsoleInfo(sb.toString(),null);
			}
		}

		return l;
	}

	private List<StationNamesDef> convertStationNames(StationNames names) {
		ArrayList<StationNamesDef> jl = new ArrayList<StationNamesDef>();
		if (names == null || names.getStationName() == null || names.getStationName().isEmpty()) return jl;
		
		for (Station s : names.getStationName()) {
			
			try {
				StationNamesDef js = new StationNamesDef();
				js.setCode(Long.toString(s.getStationCode()));
				
				js.setName(s.getNameCaseASCII());
				js.setNameUtf8(s.getNameCaseUTF8());
				if (s.getShortNameCaseASCII() == null || s.getShortNameCaseASCII().length() == 0) {
					js.setShortName(js.getName());
				} else {
					js.setShortName(s.getShortNameCaseASCII());
				}
				
				if (s.getShortNameCaseUTF8() == null || s.getShortNameCaseUTF8().length() == 0) {
					js.setShortNameUtf8(js.getNameUtf8());
				} else {
					js.setShortNameUtf8(s.getShortNameCaseUTF8());
				}
				js.setLegacyBorderPointCode(s.getLegacyBorderPointCode());
				jl.add(js);
			}
			catch (Exception e) {
				//alphanumeric station code
			}
			
		}
		return jl;
	}

	private List<ZoneDefinitionDef> convert(ZoneDefinitions zones) {
		if (zones == null) return null;
		if (zones.getZoneDefinition().isEmpty()) return null;
		ArrayList<ZoneDefinitionDef> listJson = new ArrayList<ZoneDefinitionDef>();
		for (ZoneDefinition element: zones.getZoneDefinition()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private ZoneDefinitionDef convertToJson(ZoneDefinition z) {
		ZoneDefinitionDef jz = new ZoneDefinitionDef();
		if (z.getProvider()!=null) {
			jz.setCarrier(z.getProvider().getCode());
		}
		jz.setName(z.getName());
		jz.setNameUtf8(z.getNameUtf8());
		jz.setZoneId(z.getZoneId());
		jz.setNutsCodes(convertNuts(z.getNutsCodes()));
		jz.setPolygon(convertToJson(z.getPolygone()));
		jz.setStationList(convertStationsToJson(z.getStationSet().getStations()));
		
		return jz;
	}




	private List<String> convertNuts(EList<NutsCode> nutsCodes) {
		if (nutsCodes == null || nutsCodes.isEmpty()) return null;
		
		List<String> jl = new ArrayList<String>();
		
		for (NutsCode code : nutsCodes) {
			jl.add(code.getCode());
		}
		return jl;
	}




	private List<FareReferenceStationSetDef> convertFareStationSetDefinitions(FareStationSetDefinitions fareStationSetDefinitions) {
		if (fareStationSetDefinitions == null) return null;
		if (fareStationSetDefinitions.getFareStationSetDefinitions().isEmpty()) return null;
		ArrayList<FareReferenceStationSetDef> listJson = new ArrayList<FareReferenceStationSetDef>();
		for (FareStationSetDefinition element: fareStationSetDefinitions.getFareStationSetDefinitions()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}


	private FareReferenceStationSetDef convertToJson(FareStationSetDefinition o) {
		if (o == null) return null;
		FareReferenceStationSetDef oJ = new FareReferenceStationSetDef();
		
		oJ.setCode(o.getCode());
		oJ.setLegacyCode(o.getLegacyCode());
		if (o.getCarrier() != null) {
			oJ.setFareProvider(o.getCarrier().getCode());
		}
		oJ.setName(o.getName());
		oJ.setNameUtf8(o.getNameUtf8());
		
		if (o.getStations()!= null && !o.getStations().isEmpty()) {
			
			Set<StationDef> list = new HashSet<StationDef>();
		
			for (Station station: o.getStations()) {
				
				StationDef stationJ = convert(station);
				
				list.add(stationJ);
			}
			oJ.setStations(list);
		}
		return oJ;
	}

	private List<TravelValidityConstraintDef> convertTravelValidityConstraints(TravelValidityConstraints list) {
		if (list == null) return null;
		if (list.getTravelValidityConstraints().isEmpty()) return null;
		ArrayList<TravelValidityConstraintDef> listJson = new ArrayList<TravelValidityConstraintDef>();
		for (TravelValidityConstraint element: list.getTravelValidityConstraints()) {
			if (GtmUtils.isReferenced(element, gtm.getFareStructure().getFareConstraintBundles())) {
				listJson.add(convertToJson(element));
			}
		}
		return listJson;
	}




	private TravelValidityConstraintDef convertToJson(TravelValidityConstraint tv) {
		if (tv == null) return null;
		TravelValidityConstraintDef tvJ = new TravelValidityConstraintDef();
		
		tvJ.setId(tv.getId());
				
		tvJ.setNumberOfTravelDays(tv.getTravelDays()); 
		
		if (tv.getReturnConstraint() != null) {
			tvJ.setReturnConstraint(convertToJson(tv.getReturnConstraint()));
		}
		
		if (tv.getValidDays() != null) {
			tvJ.setValidTravelDates(convertToJson(tv.getValidDays()));
		}
		
		if (tv.getRange() != null) {
			
			 gtmV31.ValidityRange range = convertToJson(tv.getRange());
			 if (range != null) {
				 tvJ.setValidityRange(range);
			 }
		}
		
		if (tv.getExcludedTimeRange()!= null && !tv.getExcludedTimeRange().isEmpty()) {
			
			ArrayList<ExcludedTimeRange> listJ = new ArrayList<ExcludedTimeRange>();
			
			for (Gtm.ExcludedTimeRange tr : tv.getExcludedTimeRange()) {				
				listJ.add(convertToJson(tr));
			}
			tvJ.setExcludedTimeRange(listJ);
		}
		
		tvJ.setValidityType(convert(tv.getValidityType()));
		
		if (tv.getTripAllocationConstraint() != null) {
			tvJ.setTripAllocationConstraint(convert(tv.getTripAllocationConstraint()));
		}
		
		if (tv.getTripInterruptionConstraint() != null) {
			tvJ.setTripInterruptionConstraint(convert(tv.getTripInterruptionConstraint()));
		}
		
		
		return tvJ;
	}

	private TripInterruptionConstraintDef convert(TripInterruptionConstraint o) {
		
		TripInterruptionConstraintDef jo = new TripInterruptionConstraintDef();
		
		jo.setMaxDuration(validateDuration(o.getMaxDuration()));
		jo.setMaxInterruptions(o.getMaxInterruptions());
		jo.setTotalMaxDuration(validateDuration(o.getTotalMaxDuration()));
		jo.setRequiredProcesses(convertInterruptionProcess(o.getRequiredProcesses()));
		
		return jo;
	}

	private String validateDuration(String s) {
		
		if (s == null || s.length() == 0) return null;
		
		Duration d = null;
		
		try {
			d = Duration.parse(s);
		} catch (Exception e ) {
			StringBuffer sb = new StringBuffer();
			sb.append("Duration value ").append(s);
			sb.append(" not ISO compliant. Value was not exported, please use validation to correct the error");
			GtmUtils.writeConsoleInfo(sb.toString(),null);
			return null;
		}
		
		return d.toString();
		
	}
	
	private List<String> convertInterruptionProcess(EList<TripInterruptionProcess> l) {
		
		ArrayList<String> jl = new ArrayList<String>();
		
		for (TripInterruptionProcess p : l) {
			jl.add(p.getLiteral());
		}
		return jl;
	}
	
	private TripAllocationConstraintDef convert(TripAllocationConstraint o) {
		
		TripAllocationConstraintDef jo = new TripAllocationConstraintDef();
		
		jo.setAllocationUnit(o.getAllocationUnit().getLiteral());
		jo.setDurationUnit(validateDuration(o.getDurationUnit()));
		jo.setMaxUnits(o.getMaxUnits());
		jo.setRequiredProcesses(convertAllocationProcess(o.getRequiredProcesses()));
		
		return jo;
	}

	private  List<String> convertAllocationProcess(EList<TripAllocationProcess> l) {
				
		ArrayList<String> jl = new ArrayList<String>();
		
		for (TripAllocationProcess p : l) {
			jl.add(p.getLiteral());
		}
		return jl;
	}

	private String convert(TravelValidityType validityType) {	
		return validityType.getLiteral();
	}

	private gtmV31.ValidityRange convertToJson(ValidityRange r) {
		if (r == null) return null;
		
		gtmV31.ValidityRange jr = new gtmV31.ValidityRange();
		
		jr.setHoursAfterMidnight(r.getHoursAfterMidnight());
		jr.setValue(r.getValue());
		jr.setTimeUnit(convertTimeUnitDef(r.getUnit()));
		
		return jr;
	}

	private static ExcludedTimeRange convertToJson(TimeRange tr) {
		if (tr == null) return null;
		ExcludedTimeRange trJ = new ExcludedTimeRange();
		trJ.setFrom(tr.getFrom());
		trJ.setUntil(tr.getUntil());
		trJ.setScope(tr.getScope().getName());

		return trJ;
	}


	private static ReturnConstraint convertToJson(ReturnValidityConstraint rc) {
		if (rc == null) return null;
		ReturnConstraint rcJ = new ReturnConstraint();
		rcJ.setEarliestReturn(rc.getEarliestReturn());
		rcJ.setLatestReturn(rc.getLatestReturn());
		
		if (rc.getExcludedWeekdays() != null && !rc.getExcludedWeekdays().isEmpty() ) {
			
			ArrayList<Integer> listJ = new ArrayList<Integer>();
			
			for (WeekDay day : rc.getExcludedWeekdays()) {
				listJ.add(Integer.valueOf(day.getValue()));
			}		
			rcJ.setExcludedWeekdays(listJ);
		}
		return rcJ;
	}




	private List<TextDef> convertTexts(Texts list) {
		if (list == null) return null;
		if (list.getTexts().isEmpty()) return null;
		ArrayList<TextDef> listJson = new ArrayList<TextDef>();
		for (Text element: list.getTexts()) {
			if (!GtmUtils.isStandardTextId(element.getId())) {
				if (GtmUtils.isReferenced(element,gtm.getFareStructure() )) {
					listJson.add(convertToJson(element));
				}
			}
		}
		return listJson;
	}




	private static TextDef convertToJson(Text text) {
		if (text == null) return null;
		TextDef textJ = new TextDef();
		
		textJ.setId(text.getId());
		textJ.setText(text.getTextICAO());
		textJ.setTextUtf8(text.getTextUTF8());
		if ( (textJ.getText() == null || textJ.getText().length() == 0) &&
			 (textJ.getTextUtf8() != null && textJ.getTextUtf8().length() > 0))	{		
			textJ.setText(GtmUtils.utf2ascii(textJ.getTextUtf8()));
		}
		if ( (textJ.getTextUtf8() == null || textJ.getTextUtf8().length() == 0) &&
			 (textJ.getText() != null && textJ.getText().length() > 0))	{		
			textJ.setTextUtf8(textJ.getText());
		}
		
		if (text.getShortTextICAO() == null || text.getShortTextICAO().length() == 0) {
			textJ.setShortText(textJ.getText());
		} else {
			textJ.setShortText(text.getShortTextICAO());
		}
		
		if (text.getShortTextUTF8() == null || text.getShortTextUTF8().length() == 0) {
			textJ.setShortTextUtf8(textJ.getTextUtf8());
		} else {
			textJ.setShortTextUtf8(text.getShortTextUTF8());
		}
		
		
		if (text.getTranslations() != null && !text.getTranslations().isEmpty()) {
			
			ArrayList<TranslationDef> listJ = new ArrayList<TranslationDef>();
			
			for (Translation trans: text.getTranslations()) {
				
				TranslationDef transJ = new TranslationDef();
				
				if (trans.getLanguage()!=null) {
					transJ.setLanguage(trans.getLanguage().getCode());
				}
				
				transJ.setText(trans.getTextICAO());
				transJ.setTextUtf8(trans.getTextUTF8());	
				
				if ( (transJ.getText() == null || transJ.getText().length() == 0) &&
					 (transJ.getTextUtf8() != null && transJ.getTextUtf8().length() > 0))	{
					transJ.setText(GtmUtils.utf2ascii(transJ.getTextUtf8()));
				}
				if ( (transJ.getTextUtf8() == null || transJ.getTextUtf8().length() == 0) &&
					 (transJ.getText() != null && transJ.getText().length() > 0))	{
					transJ.setTextUtf8(transJ.getText());
				}
				
				if (trans.getShortTextICAO() == null) {
					transJ.setShortText(trans.getTextICAO());
				} else {
					transJ.setShortText(trans.getShortTextICAO());
				}
				
				if (trans.getShortTextUTF8() == null || trans.getShortTextUTF8().length() == 0) {
					transJ.setShortTextUtf8(trans.getTextUTF8());
				} else {
					transJ.setShortTextUtf8(trans.getShortTextUTF8());
				}
						
				listJ.add(transJ);
			}
			
			textJ.setTranslations(listJ);
		}

		return textJ;
	}




	private static List<ServiceLevelDef> convertServiceLevelDefinitions(ServiceLevelDefinitions list) {
		if (list == null) return null;
		if (list.getServiceLevelDefinition().isEmpty()) return null;
		ArrayList<ServiceLevelDef> listJson = new ArrayList<ServiceLevelDef>();
		for (ServiceLevel element: list.getServiceLevelDefinition()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private static ServiceLevelDef convertToJson(ServiceLevel sl) {
		if (sl == null) return null;
		 ServiceLevelDef slJ = new  ServiceLevelDef();
		 
		 slJ.setId(sl.getId());
		 if (sl.getText()!= null) {
			 slJ.setTextRef(sl.getText().getId());
		 }
		 if (sl.getReservationParameter()!= null) {
			 slJ.setReservationParameterId(sl.getReservationParameter().getId());
		 }
		 slJ.setDoesNotIncludeClassName(!sl.isIncludesClassName());
		
		return slJ;
	}




	private static List<ServiceConstraintDef> convertServiceConstraints(ServiceConstraints list) {
		if (list == null) return null;
		if (list.getServiceConstraints().isEmpty()) return null;
		ArrayList<ServiceConstraintDef> listJson = new ArrayList<ServiceConstraintDef>();
		for (ServiceConstraint element: list.getServiceConstraints()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private static ServiceConstraintDef convertToJson(ServiceConstraint sc) {
		if (sc == null) return null;
		ServiceConstraintDef scJ = new ServiceConstraintDef();
		
		scJ.setId(sc.getId());
		
		scJ.setExcludedServiceBrands(convertServiceBrandsToJson(sc.getExcludedServiceBrands()));

		scJ.setIncludedServiceBrands(convertServiceBrandsToJson(sc.getIncludedServiceBrands()));		
		
		if (sc.getLegacy108Code() > 0) {
			scJ.setLegacyCode(sc.getLegacy108Code());
		}
		
		if (sc.getDescription() != null) {
			scJ.setTextRef(sc.getDescription().getId());
		}
		
		return scJ;

	}


	private static List<Integer> convertServiceBrandsToJson(EList<ServiceBrand> sbl) {
		if (sbl == null || sbl.isEmpty()) return null;
			
		ArrayList<Integer> listJ = new ArrayList<Integer>();
		for (ServiceBrand sb : sbl) {
				listJ.add(Integer.valueOf(sb.getCode()));				
		}
			
		return listJ;
	}

	private static List<String> convertCarriersToJson(EList<Carrier> cl) {
		if (cl == null || cl.isEmpty()) return null;
			
		ArrayList<String> listJ = new ArrayList<String>();
		for (Carrier c : cl) {
				listJ.add(c.getCode());				
		}
			
		return listJ;
	}


	private static List<ServiceClassDefinitionDef> convertServiceClassDefinitions(ServiceClassDefinitions list) {
		if (list == null) return null;
		if (list.getServiceClassDefinitions().isEmpty()) return null;
		ArrayList<ServiceClassDefinitionDef> listJson = new ArrayList<ServiceClassDefinitionDef>();
		for (ServiceClass element: list.getServiceClassDefinitions()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}


	private static ServiceClassIdDef convertToCodeJson(ServiceClass sc) {
		if (sc == null) return null;
		
		if (sc.getId()!= null) {
			return convertClassId(sc.getId());
		}

		return null;
	}

	
	private static ServiceClassIdDef convertClassId(ClassId id) {
		if (id != null) {
			if (id.equals(ClassId.A)) {
				return ServiceClassIdDef.BEST;
			} else if (id.equals(ClassId.B)) {
				 return ServiceClassIdDef.HIGH;
			} if (id.equals(ClassId.C)) {
				return ServiceClassIdDef.STANDARD;
			} if (id.equals(ClassId.D)) {
				return ServiceClassIdDef.BASIC;
			} else {
				return ServiceClassIdDef.ANY_CLASS;
			}
		}
		return null;
	}
	
	private static ServiceClassDefinitionDef convertToJson(ServiceClass sc) {
		if (sc == null) return null;
		
		ServiceClassDefinitionDef scJ = new ServiceClassDefinitionDef();
		
		if (sc.getId()!= null) {
			scJ.setId(convertClassId(sc.getId()));
		}
		if (sc.getText()!=null) {
			scJ.setTextRef(sc.getText().getId());
		}
		if (sc.getClassicClass()!= null) {
			scJ.setComfortClass(convertComfortClass(sc.getClassicClass()));
			scJ.setTravelClass(convertTravelClass(sc.getClassicClass()));
		}
		return scJ;
	}

	private static TravelClassDef convertTravelClass(ClassicClassType classicClass) {
		if (classicClass == ClassicClassType.FIRST) {
			return TravelClassDef.FIRST;
		} else if (classicClass == ClassicClassType.SECOND) {
			return TravelClassDef.SECOND;
		} else {
			return TravelClassDef.ANY_CLASS;
		} 
	}
	
	private static ComfortClassDef convertComfortClass(ClassicClassType classicClass) {
		if (classicClass == ClassicClassType.FIRST) {
			return ComfortClassDef.FIRST;
		} else if (classicClass == ClassicClassType.SECOND) {
			return ComfortClassDef.SECOND;
		} else {
			return ComfortClassDef.ANY_CLASS;
		} 
	}

	private static List<ReservationParameterDef> convertReservationParameters(ReservationParameters list) {
		if (list == null) return null;
		if (list.getReservationParameters().isEmpty()) return null;
		ArrayList<ReservationParameterDef> listJson = new ArrayList<ReservationParameterDef>();
		for (ReservationParameter element: list.getReservationParameters()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private static ReservationParameterDef convertToJson(ReservationParameter r) {
		if (r == null) return null;
		ReservationParameterDef rJ = new ReservationParameterDef();
		
		rJ.setId(r.getId());
		rJ.setReservationRequired(r.isMandatoryReservation());
		rJ.setReservationParams9181(convertToJson(r.getParams9181()));
		rJ.setReservationOptions(convertToJson(r.getOptions()));
		
		rJ.setReservationRequiredForBrand(convertServiceBrandsToJson(r.getMandatoryReservationForBrands()));
		rJ.setReservationRequiredForMode(convertTransportModesToJson(r.getMandatoryReservationsForMode()));

		return rJ;
	}




	private static List<String> convertTransportModesToJson(EList<ServiceMode> sl) {
		if (sl == null || sl.isEmpty()) return null;
		
		ArrayList<String> listJ = new ArrayList<String>();
		for (ServiceMode sb : sl) {
				listJ.add(Integer.toString(sb.getValue()));				
		}
			
		return listJ;
	}

	private static ReservationOptions convertToJson(Gtm.ReservationOptions o) {
		if (o == null) return null;
		ReservationOptions oJ = new ReservationOptions();
		if (o.getGraphicalReservation()!=null) {
			oJ.setGraphicalReservation(o.getGraphicalReservation().getName());
		}
		if (o.getPreferences() != null && !o.getPreferences().isEmpty()) {
			ArrayList<ReservationOptionGroupDef> rolJ = new ArrayList<ReservationOptionGroupDef>();
			
			for (ReservationPreferenceGroup p :  o.getPreferences()) {
				rolJ.add(convertToJson(p));
			}
			oJ.setPreferences(rolJ);
		
		}
		oJ.setServiceBrands(convertServiceBrandsToJson(o.getServiceBrands()));

		return oJ;
	}




	private static ReservationOptionGroupDef convertToJson(ReservationPreferenceGroup p) {
		if (p == null) return null;
		ReservationOptionGroupDef oJ = new ReservationOptionGroupDef();
		oJ.setPreferenceGroup(p.getGroup());
		
		if (p.getPreference() != null && !p.getPreference().isEmpty()) {
			
			ArrayList<String> pL = new ArrayList<String>();
			
			for (String s: p.getPreference()) {
				pL.add(s);
			}
			oJ.setPreferences(pL);
		}
		
		return oJ;
	}




	private static LegacyReservationParameterDef convertToJson(Gtm.ReservationParams9181 p) {
		if (p == null) return null;
		LegacyReservationParameterDef pJ = new LegacyReservationParameterDef();
		
		pJ.setBerthType(p.getBerthType().getName());
		pJ.setCoachTypeCode(Integer.toString(p.getCoachType()));
		if (p.getBerthType()!=null) {
			pJ.setCompartmentTypeCode(p.getBerthType().getName());
		}
		if (p.getService()!=null) {
			pJ.setServiceCode(p.getService().getName());
		}
		if (p.getServiceLevel()!=null) {
			pJ.setServiceLevelCode(p.getServiceLevel().getName());
		}
		pJ.setTariff(Integer.toString(p.getTariff()));
		
		if (p.getTravelClass()!=null) {
			pJ.setTravelClass(p.getTravelClass().getName());
		}
		return pJ;
	}




	private List<SalesAvailabilityConstraintDef> convertSalesAvailabilityConstraints(SalesAvailabilityConstraints list){
		if (list == null) return null;
		if (list.getSalesAvailabilityConstraints().isEmpty()) return null;
		ArrayList<SalesAvailabilityConstraintDef> listJson = new ArrayList<SalesAvailabilityConstraintDef>();
		for (SalesAvailabilityConstraint element: list.getSalesAvailabilityConstraints()) {
			
			if (GtmUtils.isReferenced(element,gtm.getFareStructure().getFareConstraintBundles() )) {
			
				listJson.add(convertToJson(element));
				
			}
		}
		return listJson;
	}




	private static SalesAvailabilityConstraintDef convertToJson(SalesAvailabilityConstraint sa) {
		if (sa == null) return null;
		SalesAvailabilityConstraintDef saJ = new SalesAvailabilityConstraintDef();
		saJ.setId(sa.getId());
		
		if (sa.getRestrictions() != null && !sa.getRestrictions().isEmpty()) {
			
			ArrayList<gtmV31.SalesRestriction> listJ = new ArrayList<gtmV31.SalesRestriction>();
			for (SalesRestriction  r: sa.getRestrictions()) {
				listJ.add(convertToJson(r));
			}
			saJ.setSalesRestrictions(listJ);
		}
		return saJ;
	}




	private static gtmV31.SalesRestriction convertToJson(SalesRestriction r) {
		if (r == null) return null;
		gtmV31.SalesRestriction rJ = new gtmV31.SalesRestriction();
		
		rJ.setEndOfSale(convertToJson(r.getEndOfSale()));
		if (r.getSalesDates() != null) {
			rJ.setSalesDatesRef(r.getSalesDates().getId());
		}
		rJ.setStartOfSale(convertToJson(r.getStartOfSale()));

		return rJ;
	}




	private static List<RegionalConstraintDef> convertRegionalConstraints(RegionalConstraints list) {
		if (list == null) return null;
		if (list.getRegionalConstraints().isEmpty()) return null;
		ArrayList<RegionalConstraintDef> listJson = new ArrayList<RegionalConstraintDef>();
		for (RegionalConstraint element: list.getRegionalConstraints()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private static RegionalConstraintDef convertToJson(RegionalConstraint r) {
		if (r == null) return null;
		RegionalConstraintDef rJ = new RegionalConstraintDef();
		rJ.setId(r.getId());
		rJ.setDistance((int) r.getDistance());
		if (r.getEntryConnectionPoint() != null) {
			rJ.setEntryConnectionPointId(r.getEntryConnectionPoint().getId());
		}
		if (r.getExitConnectionPoint() != null) {
			rJ.setExitConnectionPointId(r.getExitConnectionPoint().getId());
		}
		if (r.getRegionalValidity()!= null && !r.getRegionalValidity().isEmpty()) {
			
			ArrayList<RegionalValidityDef> rvlJ  = new ArrayList<RegionalValidityDef>();
			
			for (RegionalValidity rv: r.getRegionalValidity()) {				
				rvlJ.add(convertToJson(rv));							
			}
			rJ.setRegionalValidity(rvlJ);
		}
		return rJ;
	}




	private static RegionalValidityDef convertToJson(RegionalValidity rv) {
		if (rv == null) return null;
		RegionalValidityDef rvJ = new RegionalValidityDef();
		rvJ.setSeqNb(rv.getSeqNb());
		rvJ.setViaStations(convertToJson(rv.getViaStation()));
		rvJ.setLine(convertToJson(rv.getLine()));
		rvJ.setZone(convertToJson(rv.getZone()));
		rvJ.setPolygon(convertToJson(rv.getPolygone()));
		if (rv.getServiceConstraint() != null) {
			rvJ.setServiceConstraintRef(rv.getServiceConstraint().getId());
		}
		
		if (rv.getCarrierConstraint() != null) {
			rvJ.setCarrierConstraintRef(rv.getCarrierConstraint().getId());
		}
		if (rv.getServiceConstraint() != null) {
			rvJ.setServiceConstraintRef(rv.getServiceConstraint().getId());
		}
		
		return rvJ;
	}




	private static PolygonDef convertToJson(Polygone p) {
		if (p == null) return null;
		PolygonDef pJ = new PolygonDef();
		
		if (p.getEdge()!= null && !p.getEdge().isEmpty()){
			
			ArrayList<GeoCoordinate> listJ = new ArrayList<GeoCoordinate>();
			
			for ( Edge e : p.getEdge()) {
				listJ.add(convertToJson(e));
			}
					
			pJ.setEdge(listJ);
		}
		
		return pJ;
	}




	private static GeoCoordinate convertToJson(Edge e) {
		if (e == null) return null;
		GeoCoordinate gJ = new GeoCoordinate();
		
		gJ.setAccuracy(e.getAccuracy());
		gJ.setLatitude(e.getLatitude());
		gJ.setLongitude(e.getLongitude());
		gJ.setSystem(GeoCoordinate.System.fromValue(e.getSystem().getName()));
		return gJ;
	}




	private static ZoneDef convertToJson(Zone z) {
		if (z == null) return null;
		ZoneDef zJ = new ZoneDef();
		
		zJ.setName(z.getName());
		
		if (z.getBinaryZoneId()!= null && z.getBinaryZoneId().length > 0) {
			zJ.setBinaryZoneId(Base64.encode(z.getBinaryZoneId()));
		}
		if (z.getCarrier()!=null) {
			zJ.setCarrier(z.getCarrier().getCode());
		}
		zJ.setCity(z.getCity());
		if (z.getEntryStation()!= null) {
			zJ.setEntryStation(convert(z.getEntryStation()));
		}
		if (z.getNutsCode()!=null) {
			zJ.setNutsCode(z.getNutsCode().getCode());
		}
		if (z.getTerminalStation()!= null) {
			zJ.setTerminalStation(convert(z.getTerminalStation()));
		}

		return zJ;
	}




	private static LineDef convertToJson(Line z) {
		if (z == null) return null;
		LineDef zJ = new LineDef();
		if (z.getBinaryZoneId()!= null && z.getBinaryZoneId().length > 0) {
			zJ.setBinaryLineId(Base64.encode(z.getBinaryZoneId()));
		}
		if (z.getCarrier()!=null) {
			zJ.setCarrier(z.getCarrier().getCode());
		}
		zJ.setCity(z.getCity());
		if (z.getEntryStation()!= null) {
			zJ.setEntryStation(convert(z.getEntryStation()));
		}
		if (z.getNutsCode()!=null) {
			zJ.setNutsCode(z.getNutsCode().getCode());
		}
		if (z.getTerminalStation()!= null) {
			zJ.setTerminalStation(convert(z.getTerminalStation()));
		}
		if (z.getLineId()!= null && !z.getLineId().isEmpty()) {
			
			ArrayList<String> lineIds = new ArrayList<String>();
			
			for (String id : z.getLineId()) {
				lineIds.add(id);
			}
			zJ.setLineId(lineIds);

		}

		return zJ;
	}


	private static ViaStationsDef convertToJson(ViaStation v) {
		if (v == null) return null;
		boolean isEmpty = true;		
		ViaStationsDef vJ = new ViaStationsDef();
		
		vJ.setTechnicalViaOnly(v.isTechnicalViaOnly());
		
		vJ.setIsBorder(false);
		if (v.getCarrier()!= null) {
			vJ.setCarrier(v.getCarrier().getCode());
			isEmpty = false;
		}
		if (v.getFareStationSet() != null) {
			FareReferenceStationSet fss = convertToRouteJson(v.getFareStationSet());
			if (fss != null) {
				vJ.setFareReferenceStationSet(fss);
				isEmpty = false;
			}
		}
		
		if (v.getAlternativeRoutes() != null && !v.getAlternativeRoutes().isEmpty()) {
		
			//list of routes in json
			List<ViaStationsDef>  arlJ = new ArrayList<ViaStationsDef>(); 
			
			for (AlternativeRoute r : v.getAlternativeRoutes()) {
				
				if (r.getStations() != null && !r.getStations().isEmpty()) {

					//convert list of viaStation for one route in json
					List<ViaStationsDef>  arJ = new ArrayList<ViaStationsDef>(); 
					
					for (ViaStation s : r.getStations()) {
						ViaStationsDef vs = convertToJson(s);
						if (v != null) {
							arJ.add(vs);
						}
					}
					
					if (arJ.size() > 1) {
						ViaStationsDef route = new ViaStationsDef();
						route.getRoute().addAll(arJ);
						arlJ.add(route);
					} else if (arJ.size() == 1) {
						arlJ.add(arJ.get(0));
					}
				}
			}
			
			if (arlJ != null && !arlJ.isEmpty()) {
				 vJ.getAlternativeRoute().addAll(arlJ);
			}			
			return vJ;			
		}
		if (v.getRoute()!=null) {
			List<ViaStationsDef> lv = convertToJson(v.getRoute());
			if (lv != null && !lv.isEmpty()) {
				vJ.setRoute(lv);
				isEmpty = false;
			}
		}
		if (v.getStation() != null) {
			StationDef s = convert(v.getStation());
			if (s != null) {
				vJ.setStation(s);
				isEmpty = false;
			}
		}
		
		if (v.getServiceConstraint() != null) {
			isEmpty = false;
			vJ.setServiceConstraintRef(v.getServiceConstraint().getId());
		}
		
		if (v.getCarrierConstraint() != null) {
			isEmpty = false;
			vJ.setCarrierConstraintRef(v.getCarrierConstraint().getId());
		}
		
		vJ.setStop(v.isRealStop());
		
		vJ.setTechnicalViaOnly(v.isTechnicalViaOnly());
		
		if (isEmpty) {
			return null;
		} else {
		  return vJ;
		}
	}




	private static FareReferenceStationSet convertToRouteJson(FareStationSetDefinition fss) {
		if (fss == null) return null;
		FareReferenceStationSet frs = new FareReferenceStationSet();
		frs.setCode(fss.getCode());
		frs.setName(fss.getName());
		if (fss.getCarrier() != null){
			frs.setCarrier(fss.getCarrier().getCode());
		}
		return frs;
	}

	private static List<ViaStationsDef> convertToJson(Route r) {
		if (r == null || r.getStations() == null || r.getStations().isEmpty()) return null;
		
		ArrayList<ViaStationsDef> listJ = new ArrayList<ViaStationsDef>();
		
		for ( ViaStation s : r.getStations()) {
			ViaStationsDef v = convertToJson(s);
			if (v != null) {
				listJ.add(v);
			}
		}
		
		return listJ;
	}


	private List<ReductionConstraintDef> convertReductionConstraints(ReductionConstraints list) {
		if (list == null) return null;
		if (list.getReductionConstraints().isEmpty()) return null;
		ArrayList<ReductionConstraintDef> listJson = new ArrayList<ReductionConstraintDef>();
		for (ReductionConstraint element: list.getReductionConstraints()) {
			//export only if it is used
			if (GtmUtils.isReferenced(element,gtm.getFareStructure().getFareElements())) {
				listJson.add(convertToJson(element));
			} else {
				StringBuilder sb = new StringBuilder();
				sb.append(GtmUtils.getLabelText(element)).append(" is not referenced, it will not be exported");
				GtmUtils.writeConsoleInfo(sb.toString(),null);
			}
		}
		return listJson;
	}

	private static ReductionConstraintDef convertToJson(ReductionConstraint rc) {
		if (rc == null) return null;
		ReductionConstraintDef rcJ = new ReductionConstraintDef();
		
		rcJ.setId(rc.getId());
		
		if (rc.getRequiredReductionCards() != null && !rc.getRequiredReductionCards().isEmpty()) {
			ArrayList<ReductionCardReferenceDef> listJ = new ArrayList<ReductionCardReferenceDef>();
			
			for (RequiredReductionCard e : rc.getRequiredReductionCards()) {
				
				ReductionCardReferenceDef eJ = new ReductionCardReferenceDef();
				
				eJ.setCardName(e.getName());
				
				if (e.getCard() != null && e.getCard().getCardIssuer() != null) {
					eJ.setIssuer(e.getCard().getCardIssuer().getCode());
				}			
				if (e.getCard() != null) {
					eJ.setCardValue(e.getCard().getId());
				}
				listJ.add(eJ);
				
			}

			rcJ.setRequiredCards(listJ);
		}

		return rcJ;
	}




	private List<ReductionCardDef> convertReductionCards(ReductionCards list) {
		if (list == null) return null;
		if (list.getReductionCards().isEmpty()) return null;
		ArrayList<ReductionCardDef> listJson = new ArrayList<ReductionCardDef>();
		for (ReductionCard element: list.getReductionCards()) {
			//don't export standard UIC cards
			if (!element.isUicCode() && GenericReductionCards.getByName(element.getId()) == null ) {
				//export only if it is used
				if (   GtmUtils.isReferenced(element,gtm.getFareStructure().getReductionConstraints())
					|| GtmUtils.isReferenced(element,gtm.getFareStructure().getReductionCards())) {
					listJson.add(convertToJson(element));	
				} else {
					StringBuilder sb = new StringBuilder();
					sb.append(GtmUtils.getLabelText(element)).append(" is not referenced, it will not be exported");
					GtmUtils.writeConsoleInfo(sb.toString(),null);
				}
			}
		}
			
		return listJson;
	}



	private static ReductionCardDef convertToJson(ReductionCard card) {
		if (card == null) return null;
		ReductionCardDef cardJ = new ReductionCardDef();
		
		//standardize cardId
		cardJ.setId(GtmUtils.standardizeId(card.getCardIssuer(), card.getId()));
		
		if (card.getCardIssuer() != null) {
			cardJ.setIssuer(card.getCardIssuer().getCode());
		}
		if (card.getServiceClasses()!= null && !card.getServiceClasses().isEmpty()) {
			
			List<ServiceClassIdDef> listJ = new ArrayList<ServiceClassIdDef>();
			
			for (ServiceClass sc : card.getServiceClasses()) {
				listJ.add(convertToCodeJson(sc));
			}
			
			cardJ.setServiceClasses(listJ);
		}

		cardJ.setCardIdRequired(card.isIdRequiredForBooking());
		
		if (card.getName() != null) {
			cardJ.setNameRef(card.getName().getId());
			//cardJ.setName(convertToJson(card.getName()));
		}
		
		if (card.getIncludedReductionCards() != null && !card.getIncludedReductionCards().isEmpty()) {
			
			
			List<ReductionCardReferenceDef> lj = new ArrayList<ReductionCardReferenceDef>();
			
			for (ReductionCard iCard: card.getIncludedReductionCards()) {
				
				ReductionCardReferenceDef jcr = convertToCardRef(iCard);
				
				if (jcr != null) {
					lj.add(jcr);
				}
			}
			if (!lj.isEmpty()) {
				cardJ.setIncludedCards(lj);
			}
		}
		
		return cardJ;
	}

	private static ReductionCardReferenceDef convertToCardRef(ReductionCard card) {
		
		ReductionCardReferenceDef jcr = new ReductionCardReferenceDef ();
		
		jcr.setCardName(GtmUtils.standardizeId(card.getCardIssuer(),card.getId()));
		if (card.getCardIssuer() != null) {
			jcr.setIssuer(card.getCardIssuer().getCode());
		}
		return jcr;
	}

	private static List<PriceDef> convertPrices(Prices list) {
		if (list == null) return null;
		if (list.getPrices().isEmpty()) return null;
		ArrayList<PriceDef> listJson = new ArrayList<PriceDef>();
		for (Price element: list.getPrices()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private List<PersonalDataConstraintDef> convertPersonalDataConstraints(PersonalDataConstraints list) {
		if (list == null) return null;
		if (list.getPersonalDataConstraints().isEmpty()) return null;
		ArrayList<PersonalDataConstraintDef> listJson = new ArrayList<PersonalDataConstraintDef>();
		for (PersonalDataConstraint element: list.getPersonalDataConstraints()) {
			//export only if it is used
			if (GtmUtils.isReferenced(element,gtm.getFareStructure().getFareConstraintBundles())) {
				listJson.add(convertToJson(element));
			} else {
				StringBuilder sb = new StringBuilder();
				sb.append(GtmUtils.getLabelText(element)).append(" is not referenced, it will not be exported");
				GtmUtils.writeConsoleInfo(sb.toString(),null);
			}
		}
		return listJson;
	}




	private static PersonalDataConstraintDef convertToJson(PersonalDataConstraint pc) {
		if (pc == null) return null;
		PersonalDataConstraintDef pcJ = new PersonalDataConstraintDef();
		
		pcJ.setId(pc.getId());
		
		pcJ.setRequiredData(convertRequiredPersonalDataToJson(pc.getRequiredPersonalData()));
		
		pcJ.setAllowedChanges(convertAllowedPersonalDataChangesToJson(pc.getAllowedChanges()));

		return pcJ;
	}




	private static List<AllowedChange> convertAllowedPersonalDataChangesToJson(EList<AllowedPersonalDataChanges> ac) {
		if (ac == null || ac.isEmpty()) return null;

		ArrayList<AllowedChange> listJ = new ArrayList<AllowedChange>();
		
		for (AllowedPersonalDataChanges apc : ac) {
			
			AllowedChange acJ = new AllowedChange();
			acJ.setAcceptedReason(AllowedChange.AcceptedReason.fromValue(apc.getAcceptedReason().getName().toUpperCase()));
			acJ.setTimeLimit((int) apc.getTimeLimit());
			
		}

		return listJ;
	}




	private static List<RequiredDatum> convertRequiredPersonalDataToJson(EList<RequiredPersonalData> rpdl) {
		if (rpdl == null || rpdl.isEmpty()) return null;
		
		ArrayList<RequiredDatum> listJ = new ArrayList<RequiredDatum>();
		for (RequiredPersonalData  rpd : rpdl) {
			
			RequiredDatum it = new RequiredDatum();
			it.setCrossBorder(convertCrossBorderConditionToJson(rpd.getCrossBorder()));
			it.setDataItem(rpd.getDataItem().getName());
			it.setFulfillmentType(convertFulFillmentTypesToJson(rpd.getFulfillmentType()));
			it.setTicketHolderOnly(rpd.isTicketHolderOnly());
			it.setTransfer(convertPersonalDataTransferToJson(rpd.getTransfer()));
			
		}

		return listJ;
	}









	private static List<Transfer> convertPersonalDataTransferToJson(EList<PersonalDataTransferType> trl) {
		if (trl == null || trl.isEmpty()) return null;
			
		ArrayList<Transfer> listJ = new ArrayList<Transfer>();
		
		for (PersonalDataTransferType t : trl) {
			listJ.add(Transfer.valueOf(t.getName().toUpperCase()));
		}

		return listJ;
	}



	private static List<ControlSecurityTypeDef> convertFulFillmentTypesToJson(EList<FulfillmentType> ftl) {
		
		if (ftl == null || ftl.isEmpty()) return null;
		ArrayList<ControlSecurityTypeDef> listJ = new ArrayList<ControlSecurityTypeDef>();
		for (FulfillmentType f : ftl) {
			listJ.add(ControlSecurityTypeDef.fromValue(f.getName().toUpperCase()));
		}
		return listJ;
	}
	

	private static List<CrossBorderConditionDef> convertCrossBorderConditionToJson(EList<Gtm.CrossBorderCondition> cbl) {
		if (cbl == null || cbl.isEmpty()) return null;
		
		ArrayList<CrossBorderConditionDef> cblJ = new ArrayList<CrossBorderConditionDef>();
		
		for (Gtm.CrossBorderCondition c : cbl) {
			
			CrossBorderConditionDef cJ = new CrossBorderConditionDef();
			cJ.setAffectedServiceBrands(convertServiceBrandsToJson(c.getAffectedServiceBrands()));
			cJ.setFromCountry(c.getFromCountry().getISOcode());
			cJ.setToCountry(c.getToCountry().getISOcode());
			
		}
		return cblJ;
	}




	private static List<PassengerConstraintDef> convertPassengerConstraints(PassengerConstraints list) {
		if (list == null) return null;
		if (list.getPassengerConstraints().isEmpty()) return null;
		ArrayList<PassengerConstraintDef> listJson = new ArrayList<PassengerConstraintDef>();
		for (PassengerConstraint element: list.getPassengerConstraints()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private static PassengerConstraintDef convertToJson(PassengerConstraint pass) {
		if (pass == null) return null;
		PassengerConstraintDef passJ = new PassengerConstraintDef();
		
		passJ.setId(pass.getId());
		passJ.setAgeLimitForReservation(pass.getReservationAgeLimit()); 
		passJ.setAgeLimitToTravelAlone(pass.getTravelAloneAgeLimit()); 
		
		if (pass.getIncludedFreePassengers() != null && !pass.getIncludedFreePassengers().isEmpty()) {
			ArrayList<IncludedFreePassenger> listJ = new ArrayList<IncludedFreePassenger>();
			
			for (IncludedFreePassengerLimit freeP : pass.getIncludedFreePassengers()) {
				
				IncludedFreePassenger freeJ = new IncludedFreePassenger();
				
				freeJ.setNumber(freeP.getNumber());
								
				freeJ.setPassengerConstraintRef(freeP.getPassengerConstraint().getId());
				
				listJ.add(freeJ);
			}
			
			passJ.setIncludedFreePassenger(listJ);
		}

		if (pass.getExcludedPassengerCombinations() != null && !pass.getExcludedPassengerCombinations().isEmpty()) {
			ArrayList<CombinationConstraint> listJ = new ArrayList<CombinationConstraint>();
			
			for (PassengerCombinationConstraint passengerCombinationConstraint : pass.getExcludedPassengerCombinations()) {
				
				CombinationConstraint freeJ = new CombinationConstraint();
				
				freeJ.setMaxNumber(passengerCombinationConstraint.getMaxNumber());
				freeJ.setMinNumber(passengerCombinationConstraint.getMinNumber());
				
				if (passengerCombinationConstraint.getPassengerConstraint() == null) {
					
					StringBuilder sb = new StringBuilder();
					sb.append(GtmUtils.getLabelText(pass)).append(" is imcomplete.");
					GtmUtils.writeConsoleError(sb.toString(),null);
				} else {
					freeJ.setPassengerConstraintRef(passengerCombinationConstraint.getPassengerConstraint().getId());				
				}
				listJ.add(freeJ);
			}
			
			passJ.setCombinationConstraint(listJ);
		}
		
		passJ.setIsAncillaryItem(pass.isIsAncilliary());
		passJ.setLowerAgeLimit(pass.getLowerAgeLimit());
		if (pass.getText()!= null) {
			passJ.setNameRef(pass.getText().getId());
		}
		if (pass.getTravelerType() != null) {
			passJ.setPassengerType(pass.getTravelerType().getName());
		}
		
		passJ.setPassengerWeight(pass.getPassengerWeight());
		passJ.setUpperAgeLimit(pass.getUpperAgeLimit()); 
		
		return passJ;
	}




	private static List<FulfillmentConstraintDef> convertFullfillmentConstraints(FulfillmentConstraints list) {
		if (list == null) return null;
		if (list.getFulfillmentConstraints().isEmpty()) return null;
		ArrayList<FulfillmentConstraintDef> listJson = new ArrayList<FulfillmentConstraintDef>();
		for (FulfillmentConstraint element: list.getFulfillmentConstraints()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private static FulfillmentConstraintDef convertToJson(FulfillmentConstraint fc) {
		if (fc == null) return null;
		FulfillmentConstraintDef fcJ = new FulfillmentConstraintDef();
		fcJ.setId(fc.getId());
		
		if (fc.getAcceptedBarcodeTypes() != null && fc.getAcceptedBarcodeTypes().isEmpty()) {
			fcJ.setAcceptedBarCodes(convertBarCodeTypes(fc.getAcceptedBarcodeTypes()));
		}
		fcJ.setAcceptedControlSecurityTypes(convertFulFillmentTypesToJson(fc.getAcceptedFulfilmentTypes()));
		fcJ.setIndividualTicketingPermitted(fc.isIndividualTicketingPermitted());
		fcJ.setSeparateFulfillmentRequired(fc.isSeparateFulFillmentRequired());
		
		if (fc.getRequiredBarcodeTypes() != null && fc.getRequiredBarcodeTypes().isEmpty()) {
			fcJ.setRequiredBarCodes(convertBarCodeTypes(fc.getRequiredBarcodeTypes()));
		}
		fcJ.setRequiredSiS(convertControlDataExchangeTypesToJson(fc.getRequiredControlDataExchange()));
		
		return fcJ;
	}


	private static List<BarCodeTypesDef> convertBarCodeTypes(EList<BarcodeTypes> el) {
		if (el == null || el.isEmpty()) return null;
		ArrayList<BarCodeTypesDef> listJ = new ArrayList<BarCodeTypesDef>();
		for (Enumerator e : el) {	
			listJ.add(BarCodeTypesDef.fromValue(e.getName().toUpperCase()));	
		}
		return listJ;
	}




	private static List<RequiredSi> convertControlDataExchangeTypesToJson(EList<ControlDataExchangeTypes> el) {
		if (el == null || el.isEmpty()) return null;
		ArrayList<RequiredSi> listJ = new ArrayList<RequiredSi>();
		Iterator<ControlDataExchangeTypes> it = el.iterator();
		while (it.hasNext()) {
		    ControlDataExchangeTypes e = it.next();
			listJ.add(convert(e));	
		}
		return listJ;
	}




	private static RequiredSi convert(ControlDataExchangeTypes e) {
		if (e == ControlDataExchangeTypes.IRS90918_4PEER2PEER) {
			return RequiredSi.PEER_TO_PEER;
		}
		if (e == ControlDataExchangeTypes.IRS90918_4REGISTRY) {
			return RequiredSi.REGISTRY;
		}
		return null;
	}

	private static FareResourceLocationDef convertFareResourceLocation(FareResourceLocations rl) {
		if (rl == null) return null;
		FareResourceLocationDef rlJ = new FareResourceLocationDef();
		rlJ.setCarrierLocations(convertResourceCarrierLocations(rl.getCarrierResourceLocations()));
		rlJ.setStationLocations(convertStationResourceLocations(rl.getStationResourceLocations()));
		rlJ.setTrainLocations(convertTrainResourceLocations(rl.getTrainResourceLocations()));

		return rlJ;
	}




	private static List<TrainResourceLocationDef> convertTrainResourceLocations(TrainResourceLocations l) {
		if (l == null || l.getTrainResourceLocations().isEmpty()) return null;
		
		ArrayList<TrainResourceLocationDef> lJ = new ArrayList<TrainResourceLocationDef>();
		
		for (TrainResourceLocation t : l.getTrainResourceLocations()) {
			lJ.add(convertToJson(t));
		}
		return lJ;
	}



	private static TrainResourceLocationDef convertToJson(TrainResourceLocation t) {
		if (t == null) return null;
		TrainResourceLocationDef trJ = new TrainResourceLocationDef();
		if (t.getCarrier()!= null) {
			trJ.setCarrier(t.getCarrier().getCode());
		}
		trJ.setTrainId(t.getTrainId());
		
		trJ.setOnlineResource(convertOnlineResourcesToJson(t.getOnlineResources()));
		
		return trJ;
	}




	private static List<OnlineResourceDef> convertOnlineResourcesToJson(EList<OnlineResource> rl) {
		if (rl == null || rl.isEmpty()) return null;
		
		ArrayList<OnlineResourceDef> lJ = new ArrayList<OnlineResourceDef>();
		
		for (OnlineResource r : rl){
			OnlineResourceDef rJ = new OnlineResourceDef();
			if (r.getInterfaceType() !=null) {
				rJ.setInterfaceType(r.getInterfaceType().getName());
			}
			if (r.getOfferRequestType()!=null) {
				rJ.setOfferType(r.getOfferRequestType().getName());
			}
			rJ.setSystem(r.getSystem());
			rJ.setVersion(r.getVersion());
			
			lJ.add(rJ);
		}

		return lJ;
	}




	private static List<StationResourceLocationDef> convertStationResourceLocations(StationResourceLocations l) {
		if (l == null || l.getStationResourceLocations().isEmpty()) return null;
		
		ArrayList<StationResourceLocationDef> lJ = new ArrayList<StationResourceLocationDef>();
		
		for (StationResourceLocation t : l.getStationResourceLocations()) {
			lJ.add(convertToJson(t));
		}
		
		return lJ;
	}




	private static StationResourceLocationDef convertToJson(StationResourceLocation t) {
		if (t == null) return null;
		StationResourceLocationDef srJ = new StationResourceLocationDef();
		
		srJ.setOnlineResource(convertOnlineResourcesToJson(t.getOnlineResources()));
		
		if (t.getConnectionPoints()!= null && !t.getConnectionPoints().isEmpty()) {
			
			ArrayList<String> lJ = new ArrayList<String>();
			
			for (ConnectionPoint p : t.getConnectionPoints()) {
				lJ.add(p.getId());
			}
			
			srJ.setConnectionPointIds(lJ);
			
		}
		

		
		srJ.setStations(convertStationsToJson(t.getStations()));

		return srJ;
	}




	private static List<CarrierResourceLocationDef> convertResourceCarrierLocations(CarrierResourceLocations l) {
		if (l == null || l.getCarrierResourceLocations().isEmpty()) return null;
		
		ArrayList<CarrierResourceLocationDef> lJ = new ArrayList<CarrierResourceLocationDef>();
		
		for (CarrierResourceLocation t : l.getCarrierResourceLocations()) {
			lJ.add(convertToJson(t));
		}
		
		return lJ;
	}




	private static CarrierResourceLocationDef convertToJson(CarrierResourceLocation t) {
		if (t == null) return null;
		CarrierResourceLocationDef lJ = new CarrierResourceLocationDef();
		
		if (t.getCarrier()!= null) {
			lJ.setCarrier(t.getCarrier().getCode());
		}
		if (t.getServiceBrand()!= null) {
			lJ.setServiceBrandCode(t.getServiceBrand().getCode());
		}
		lJ.setOnlineResource(convertOnlineResourcesToJson(t.getOnlineResources()));
		
		return lJ;
	}




	private static List<FareDef> convertFareElements(FareElements list) {
		if (list == null) return null;
		if (list.getFareElements().isEmpty()) return null;
		ArrayList<FareDef> listJson = new ArrayList<FareDef>();
		for (FareElement element: list.getFareElements()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}

	private static FareDef convertToJson(FareElement fare) {
		if (fare == null) return null;
		FareDef fareJ = new FareDef();
		
		fareJ.setId(fare.getId());
		
		fareJ.setFareType(convert(fare.getType()));
		
		if (fare.getAfterSalesRule() != null) {
			fareJ.setAfterSalesRulesRef(fare.getAfterSalesRule().getId());
		}
		if (fare.getCarrierConstraint()!= null) {
			fareJ.setCarrierConstraintRef(fare.getCarrierConstraint().getId());
		}
		
		if (fare.getFareConstraintBundle()!= null) {
			fareJ.setBundleRef(fare.getFareConstraintBundle().getId());
		}
		
		if (fare.getFareDetailDescription() != null){
			fareJ.setFareDetailDescriptionRef(fare.getFareDetailDescription().getId());
		}
		

		
		if (fare.getLegacyAccountingIdentifier()!= null) {
			
		
			LegacyAccountingIdentifierDef lai = new LegacyAccountingIdentifierDef();
			
			lai.setSerialId(fare.getLegacyAccountingIdentifier().getSeriesId());
			lai.setTariffId(fare.getLegacyAccountingIdentifier().getTariffId());
			lai.setAddId(fare.getLegacyAccountingIdentifier().getAddSeriesId());			
			
			fareJ.setLegacyAccountingIdentifier(lai);
			
		}
		
		if (fare.getText() != null) {
			fareJ.setNameRef(fare.getText().getId());
		}
		
		if (fare.getPassengerConstraint() != null) {
			fareJ.setPassengerConstraintRef(fare.getPassengerConstraint().getId());
		}
			
		if (fare.getPrice() != null) {
			fareJ.setPriceRef(fare.getPrice().getId());
		}
		
		if (fare.getReductionConstraint()!= null) {
			fareJ.setReductionConstraintRef(fare.getReductionConstraint().getId());
		}
		
		if (fare.getRegionalConstraint()!= null) {
			fareJ.setRegionalConstraintRef(fare.getRegionalConstraint().getId());
		}
		
		if (fare.getReservationParameter() != null) {
			fareJ.setReservationParameterRef(fare.getReservationParameter().getId());
		}
			
		if (fare.getServiceClass()!= null) {
			fareJ.setServiceClassRef(convertClassId(fare.getServiceClass().getId()).value());
		}
		
		if (fare.getServiceConstraint()!=null) {
			fareJ.setServiceConstraintRef(fare.getServiceConstraint().getId());
		}
		
		if (fare.getServiceLevel()!=null) {
			fareJ.setServiceLevelRef(fare.getServiceLevel().getId());
		}
		
		if (fare.getLegacyConversion() != null) {
			fareJ.setLegacyConversion(fare.getLegacyConversion().getName());
		} else {
			fareJ.setLegacyConversion("NO"); //$NON-NLS-1$
		}
				
		fare.setIndividualContracts(fareJ.getIndividualContracts());
		
		//regulatory regimes
		if (fare.getRegulatoryConditions() != null && !fare.getRegulatoryConditions().isEmpty()) {
			
			for (RegulatoryCondition r : fare.getRegulatoryConditions()) {
				fareJ.getRegulatoryConditions().add(r.name());
			}
	
		}
		
		if (fare.getInvolvedTcos() != null && !fare.getInvolvedTcos().isEmpty()) {
			fareJ.setInvolvedTCOs(convertCarriersToJson(fare.getInvolvedTcos()));
		}
		
		if (fare.getLuggageConstraint()!=null) {
			fareJ.setLuggageConstraintRef(fare.getLuggageConstraint().getId());
		}
		
		return fareJ;
	}




	private static FareTypeDef convert(FareType type) {
		
		if (type == FareType.NRT) {
			return FareTypeDef.ADMISSION;
		}
		if (type == FareType.RES) {
			return FareTypeDef.RESERVATION;
		}		
		if (type == FareType.IRT) {
			return FareTypeDef.INTEGRATED_RESERVATION;
		}		
		if (type == FareType.ANCILLARY) {
			return FareTypeDef.ANCILLARY;
		}		
		return FareTypeDef.ADMISSION;

	}

	private List<ConnectionPointDef> convertConnectionPoints(ConnectionPoints list) {
		if (list == null) return null;
		if (list.getConnectionPoints().isEmpty()) return null;
		ArrayList<ConnectionPointDef> listJson = new ArrayList<ConnectionPointDef>();
		for (ConnectionPoint element: list.getConnectionPoints()) {
			
			//export only if it is used
			if (GtmUtils.isReferenced(element,gtm.getFareStructure().getRegionalConstraints())) {
				listJson.add(convertToJson(element));
			} else {
				StringBuilder sb = new StringBuilder();
				sb.append(GtmUtils.getLabelText(element)).append(" is not referenced, it will not be exported");
				GtmUtils.writeConsoleInfo(sb.toString(),null);
			}
		}
		return listJson;
	}




	private static ConnectionPointDef convertToJson(ConnectionPoint cp) {
		if (cp == null) return null;
		ConnectionPointDef cpJ = new ConnectionPointDef();
		cpJ.setId(cp.getId());
		cpJ.setLegacyBorderPointCode(Integer.toString(cp.getLegacyBorderPointCode()));
		cpJ.setName(cp.getName());
		cpJ.setStationSets(convertStationSetsToJson(cp.getConnectedStationSets()));
		return cpJ;
	}




	private static List<List<StationDef>> convertStationSetsToJson(EList<StationSet> ssl) {
		if (ssl == null || ssl.isEmpty()) return null;
		
		ArrayList<List<StationDef>> listJ = new ArrayList<List<StationDef>>();
		
		for (StationSet set : ssl) {
			listJ.add(convertStationsToJson(set.getStations()));	
		}
		return listJ;
	}




	private static List<StationDef> convertStationsToJson(EList<Station> set) {
		if (set == null || set.isEmpty()) return null;
		
		ArrayList<StationDef> listJ = new ArrayList<StationDef>();
		for (Station s :  set) {
			listJ.add(convert(s));
		}
		return listJ;
	}


	private static StationDef convert(Station s) {
		if (s == null) return null;
		StationDef sJ = new StationDef();
		if (s.getCountry() == null) {
			sJ.setCountry(NationalLanguageSupport.GtmJsonExporter_27);
		} else {
			sJ.setCountry(s.getCountry().getISOcode());
		}
		sJ.setCode(Long.toString(s.getStationCode()));
		return sJ;
	}




	private List<FareCombinationConstraintDef> convertCombinationConstraints(CombinationConstraints list) {
		if (list == null) return null;
		if (list.getCombinationConstraints().isEmpty()) return null;
		ArrayList<FareCombinationConstraintDef> listJson = new ArrayList<FareCombinationConstraintDef>();
		for (Gtm.CombinationConstraint element: list.getCombinationConstraints()) {
			
			//export only if it is used
			if (GtmUtils.isReferenced(element,gtm.getFareStructure().getFareConstraintBundles())) {
				listJson.add(convertToJson(element));
			} else {
				StringBuilder sb = new StringBuilder();
				sb.append(GtmUtils.getLabelText(element)).append(" is not referenced, it will not be exported");
				GtmUtils.writeConsoleInfo(sb.toString(),null);
			}
		}
		return listJson;
	}




	private static FareCombinationConstraintDef convertToJson(Gtm.CombinationConstraint fc) {
		if (fc == null) return null;
		FareCombinationConstraintDef fcJ = new FareCombinationConstraintDef();
		fcJ.setId(fc.getId());
		fcJ.setCombinationModels(convertCombinationModelsToJson(fc.getCombinationModels()));
		return fcJ;
	}





	private static List<FareCombinationModelDef> convertCombinationModelsToJson(EList<FareCombinationModel> cmL) {
		if (cmL == null || cmL.isEmpty()) return null;
		
		ArrayList<FareCombinationModelDef> listJ = new ArrayList<FareCombinationModelDef>();
		
		for (FareCombinationModel m : cmL) {
		
			FareCombinationModelDef fcJ = new FareCombinationModelDef();
			
			fcJ.setAllowedAllocators(convertCarriersToJson(m.getAllowedAllocators()));
			fcJ.setAllowedDistributors(convertCarriersToJson(m.getAllowedAllocators()));
			fcJ.setAllowedClusters(convertClusterListToJson(m.getAllowedClusters()));
			fcJ.setAllowedCommonContracts(convertCarriersToJson(m.getAllowedCommonContracts()));
			fcJ.setCombinableCarrier(convertCarriersToJson(m.getCombinableCarriers()));
			fcJ.setModel(m.getModel().getName());
			fcJ.setOnlyWhenCombined(m.isOnlyWhenCombined());
			fcJ.setReferenceCluster(m.getReferenceCluster().getName());
		
			
			listJ.add(fcJ);
		
		}
		return listJ;
	}




	private static List<String> convertClusterListToJson(EList<Clusters> acs) {
		
		if (acs == null || acs.isEmpty()) return null;
		ArrayList<String> acJ = new ArrayList<String>();
		for (Clusters c : acs) {
			acJ.add(c.getName());
		}
		return acJ;
	}




	private static List<CarrierConstraintDef> convertCarrierConstraints(CarrierConstraints list) {
		if (list == null) return null;
		if (list.getCarrierConstraints().isEmpty()) return null;
		ArrayList<CarrierConstraintDef> listJson = new ArrayList<CarrierConstraintDef>();
		for (CarrierConstraint element: list.getCarrierConstraints()) {
			listJson.add(convertToJson(element));
		}
		return listJson;
	}




	private List<CalendarDef> convertCalendars(Calendars list) {
		if (list == null) return null;
		if (list.getCalendars().isEmpty()) return null;
		ArrayList<CalendarDef> listJson = new ArrayList<CalendarDef>();
		for (Calendar element: list.getCalendars()) {
			//export only if it is used
			if (   GtmUtils.isReferenced(element,gtm.getFareStructure().getSalesAvailabilityConstraints())
				|| GtmUtils.isReferenced(element,gtm.getFareStructure().getTravelValidityConstraints())) {
				listJson.add(convertToJson(element));
			} else {
				StringBuilder sb = new StringBuilder();
				sb.append(GtmUtils.getLabelText(element)).append(" is not referenced, it will not be exported");
				GtmUtils.writeConsoleInfo(sb.toString(),null);
			}
		}
		return listJson;
	}




	private CalendarDef convertToJson(Calendar cal) {
		if (cal == null) return null;
		CalendarDef calJ = new CalendarDef();
		calJ.setId(cal.getId());
		calJ.setUtcOffset(cal.getUtcOffset());		
		
		calJ.setFromDate(cal.getFromDateTime());
		calJ.setUntilDate(cal.getUntilDateTime());		
		
		if (cal.getDates() != null && !cal.getDates().isEmpty()) {
			calJ.setDates(cal.getDates());
		}
			
		return calJ;
	}




	private List<AfterSalesConditionDef> convertAfterSalesConditionsToJson(AfterSalesRules afterSalesRules) {
		if (afterSalesRules == null) return null;
		if (afterSalesRules.getAfterSalesRules().isEmpty()) return null;
		
		ArrayList<AfterSalesConditionDef> result = new ArrayList<AfterSalesConditionDef>();

		
		for (AfterSalesRule rule :  afterSalesRules.getAfterSalesRules()) {
			AfterSalesConditionDef condJ = new AfterSalesConditionDef();
			condJ.setId(rule.getId());
			condJ.setAfterSalesRules(new ArrayList<AfterSalesRuleDef>());
			
			for (AfterSalesCondition cond : rule.getConditions()) {
				
				AfterSalesRuleDef ruleJ = new AfterSalesRuleDef();
				
				ruleJ.setIsCarrierFee(!cond.isCarrierFee());
				ruleJ.setIndividualContracts(cond.isIndividualContracts());
				ruleJ.setTransactionType(cond.getTransactionType().getName());
				
				ruleJ.setApplicationTime(convertToJson(cond.getApplicationTime()));
												
				ruleJ.setFeeRef(cond.getFee().getId());
				condJ.getAfterSalesRules().add(ruleJ);
				
			}

			result.add(condJ);
		}

		return result;
	}
	
	private static RelativeTimeDef convertToJson(RelativeTime rt) {
		if (rt == null) return null;
		
		RelativeTimeDef rtJ = new RelativeTimeDef();
		rtJ.setTimeUnit(convertTimeUnit(rt.getUnit()));
		rtJ.setTimeReference(RelativeTimeDef.TimeReference.valueOf(rt.getReference().getName().toUpperCase()));
		rtJ.setTimeValue(rt.getValue());
			
		return rtJ;
	}
	
	
	
	private static TimeUnit convertTimeUnit(Gtm.TimeUnit unit) {
				
		if (unit.equals(Gtm.TimeUnit.HOUR)) {
			return  RelativeTimeDef.TimeUnit.HOURS;
		} else if (unit.equals(Gtm.TimeUnit.MINUTE)) {
			return  RelativeTimeDef.TimeUnit.MINUTES;
		} else if (unit.equals(Gtm.TimeUnit.DAY)) {
			return  RelativeTimeDef.TimeUnit.DAYS;
		}
		
		return null;
		
	}

	private static TimeUnitDef convertTimeUnitDef(Gtm.TimeUnit unit) {
		
		if (unit.equals(Gtm.TimeUnit.HOUR)) {
			return  TimeUnitDef.HOURS;
		} else if (unit.equals(Gtm.TimeUnit.MINUTE)) {
			return TimeUnitDef.MINUTES;
		} else if (unit.equals(Gtm.TimeUnit.DAY)) {
			return  TimeUnitDef.DAYS;
		}
		
		return null;
		
	}



	private static CarrierConstraintDef convertToJson(CarrierConstraint constraint) {
		if (constraint == null) return null;
		CarrierConstraintDef constraintDef = new CarrierConstraintDef();
		
		constraintDef.setId(constraint.getId());
		
		if (constraint.getIncludedCarriers() != null && !constraint.getIncludedCarriers().isEmpty()) {
			
			ArrayList<String> includedCarriers = new ArrayList<String>();
			for (Carrier carrier : constraint.getIncludedCarriers()) {
				includedCarriers.add(carrier.getCode());			
			}
			constraintDef.setIncludedCarrier(includedCarriers);

			
		} else if (constraint.getExcludedCarriers() != null && !constraint.getExcludedCarriers().isEmpty()) {
			
			ArrayList<String> excludedCarriers = new ArrayList<String>();
			for (Carrier carrier : constraint.getExcludedCarriers()) {
				excludedCarriers.add(carrier.getCode());			
			}
			constraintDef.setIncludedCarrier(excludedCarriers);
			
		}  
		
		return constraintDef;
	}
	
	private static PriceDef convertToJson(Price price) {
		if (price == null) return null;
		PriceDef priceDef = new PriceDef();
		
		priceDef.setId(price.getId());
		
		ArrayList<CurrencyPriceDef> currencyList = new ArrayList<CurrencyPriceDef>();
		priceDef.setPrice(currencyList);
		
		for (CurrencyPrice cur : price.getCurrencies()) {
			
			CurrencyPriceDef curDef = new CurrencyPriceDef();
			
			//assume euro cent
			curDef.setAmount(GtmUtils.getEuroCent(cur.getAmount()));
			curDef.setCurrency(cur.getCurrency().getIsoCode());
			
			ArrayList<VatDetailDef> vatDefs = new ArrayList<VatDetailDef>();
									
			for ( VATDetail vat : cur.getVATdetails()) {
				
				VatDetailDef vatDef = new VatDetailDef();
				vatDef.setAmount(GtmUtils.getEuroCent(vat.getAmount()));
				vatDef.setTaxId(vat.getTaxId());
				vatDef.setScope(convert(vat.getScope()));
				vatDef.setPercentage(vat.getPercentage());
				vatDef.setCountry(vat.getCountry().getISOcode());
				vatDefs.add(vatDef);
			}
			
			currencyList.add(curDef);	
		}

		return priceDef;
		
	}
	
	

	private static VatScopeDef convert(TaxScope scope) {
		
		if (scope == TaxScope.ANY) {
			return null;
		} else if (scope == TaxScope.INTERNATIONAL) {
			return VatScopeDef.INTERNATIONAL;
		} else if (scope == TaxScope.LONG_DISTANCE) {
			return VatScopeDef.LONG_DISTANCE;
		} else if (scope == TaxScope.NATIONAL) {
			return VatScopeDef.NATIONAL;
		} else if (scope == TaxScope.SHORT_DISTANCE) {
			return VatScopeDef.SHORT_DISTANCE;
		} 
		return null;
	}

	private static FareDeliveryDetailsDef convertDeliveryToJson(Gtm.Delivery idelivery) {
		if (idelivery == null) return null;
		FareDeliveryDetailsDef delivery = new FareDeliveryDetailsDef();
		delivery.setFareProvider(idelivery.getProvider().getCode());
		delivery.setDeliveryId(idelivery.getId());
		delivery.setOptionalDelivery(idelivery.isOptional());
		delivery.setReplacementDeliveryId(idelivery.getReplacedDeliveryId());
		delivery.setPreviousDeliveryId(idelivery.getPreviousDeliveryId());
		if (idelivery.getSchemaVersion()!=null)	{
			delivery.setVersion(idelivery.getSchemaVersion().getLiteral());
		}
		if (idelivery.getAcceptedSchemaVersion()!=null) {
			delivery.setAcceptedVersion(idelivery.getAcceptedSchemaVersion().getLiteral());
		}
		
		if (idelivery.getUsage() != null) {
			if (idelivery.getUsage().equals(DataType.PRODUCTION_DATA)) {
				delivery.setUsage(Usage.PRODUCTION);
			} else if (idelivery.getUsage().equals(DataType.TEST_DATA)) {
				delivery.setUsage(Usage.TEST_ONLY);
			}	
		}
			
		return delivery;
	}

}
