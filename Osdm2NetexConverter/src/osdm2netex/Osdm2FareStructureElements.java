package osdm2netex;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

import Gtm.AfterSalesCondition;
import Gtm.AfterSalesRule;
import Gtm.AfterSalesTransactionType;
import Gtm.Carrier;
import Gtm.FareStructure;
import Gtm.FulfillmentType;
import Gtm.IncludedFreePassengerLimit;
import Gtm.PassengerCombinationConstraint;
import Gtm.PassengerConstraint;
import Gtm.ServiceBrand;
import Gtm.ServiceClass;
import Gtm.ServiceConstraint;
import Gtm.TimeReferenceType;
import Gtm.TotalPassengerCombinationConstraint;
import Gtm.TravelValidityType;
import Gtm.util.RouteDescriptionBuilder;
import jakarta.xml.bind.JAXBElement;
import uk.org.netex.netex.Branding;
import uk.org.netex.netex.BrandingRefStructure;
import uk.org.netex.netex.ClassOfUse;
import uk.org.netex.netex.CompanionProfile;
import uk.org.netex.netex.CompanionRelationshipEnumeration;
import uk.org.netex.netex.ConnectionRefStructure;
import uk.org.netex.netex.DataManagedObjectStructure;
import uk.org.netex.netex.DiscountBasisEnumeration;
import uk.org.netex.netex.DistanceMatrixElement;
import uk.org.netex.netex.DistanceMatrixElementsRelStructure;
import uk.org.netex.netex.EntitlementProductRefStructure;
import uk.org.netex.netex.EntitlementRequired;
import uk.org.netex.netex.Exchanging;
import uk.org.netex.netex.FareBasisEnumeration;
import uk.org.netex.netex.FareFrame;
import uk.org.netex.netex.FareStructureElement;
import uk.org.netex.netex.FareStructureElementsInFrameRelStructure;
import uk.org.netex.netex.GenericParameterAssignment;
import uk.org.netex.netex.GenericParameterAssignmentVersionStructure;
import uk.org.netex.netex.GroupOfOperators;
import uk.org.netex.netex.GroupTicket;
import uk.org.netex.netex.KeyValueStructure;
import uk.org.netex.netex.LogicalOperationEnumeration;
import uk.org.netex.netex.MultilingualString;
import uk.org.netex.netex.ObjectFactory;
import uk.org.netex.netex.PurchaseWindow;
import uk.org.netex.netex.Refunding;
import uk.org.netex.netex.ResellWhenEnumeration;
import uk.org.netex.netex.ResourceFrame;
import uk.org.netex.netex.ScheduledStopPointRefStructure;
import uk.org.netex.netex.SeriesConstraint;
import uk.org.netex.netex.SeriesConstraintsRelStructure;
import uk.org.netex.netex.TransportOrganisation;
import uk.org.netex.netex.TransportOrganisationRefStructure;
import uk.org.netex.netex.TransportOrganisationRefsRelStructure;
import uk.org.netex.netex.TypeOfFareStructureElementRefStructure;
import uk.org.netex.netex.TypeOfTravelDocument;
import uk.org.netex.netex.UsageEndEnumeration;
import uk.org.netex.netex.UsageParameterPrice;
import uk.org.netex.netex.UsageParametersRelStructure;
import uk.org.netex.netex.UsageTriggerEnumeration;
import uk.org.netex.netex.UsageValidityPeriod;
import uk.org.netex.netex.UsageValidityTypeEnumeration;
import uk.org.netex.netex.UserProfile;
import uk.org.netex.netex.UserProfileRefStructure;
import uk.org.netex.netex.ValidBetween;


public class Osdm2FareStructureElements {
	
	
    static void convertToFareStructureElements(Gtm.FareStructure osdmFares, ResourceFrame resourceFrameNrt, FareStructureElementsInFrameRelStructure structureList, FareFrame fareFrameNrt) {
    	
    	ObjectFactory factory = new ObjectFactory();
    	
    	//carriers, carrier groups --> resource frame: organsations
    	convertCarriersAndCarrierGroups(osdmFares,resourceFrameNrt,  structureList, factory);
    	
    	//service contraints
    	convertServiceConstraints(osdmFares,fareFrameNrt,  structureList, factory, resourceFrameNrt);
    	
    	//carrier constraints --> fare structure elements 
    	//convertCarrierConstraints(osdmFares, resourceFrameNrt,  structureList, factory);
    	
    	//class of use --> fareFrameNrt: access rights
    	convertClassOfUse(osdmFares,resourceFrameNrt,  structureList, fareFrameNrt, factory);
    	
    	//passengers --> fare frame : usage parameters
    	convertPassengers(osdmFares,resourceFrameNrt,  structureList, fareFrameNrt, factory);

    	//passengerLimits --> fare frame : usage parameters
    	convertPassengerLimits(osdmFares,resourceFrameNrt,  structureList, fareFrameNrt, factory);
    	
    	//travel validity  --> fare structure elements 
    	convertTravelValidity(osdmFares, resourceFrameNrt, structureList, fareFrameNrt, factory);
    	
    	//sales availability 
    	convertSalesAvailability (osdmFares, resourceFrameNrt, structureList, fareFrameNrt, factory);
    	
    	//reductionConstrants
    	convertReductionConstraints (osdmFares, resourceFrameNrt, structureList, fareFrameNrt, factory);
    	
    	//route description
    	convertRegionalValidity(osdmFares, fareFrameNrt, factory);
    	
    	//fulfillment methods
    	convertTypeOfTraveldocument(osdmFares, fareFrameNrt, resourceFrameNrt, factory);
    	
    	//after sales conditions
    	convertAfterSalesConditions(osdmFares, fareFrameNrt, factory);    	
    	

	}
    


	private static void convertTypeOfTraveldocument(FareStructure osdmFares, FareFrame fareFrameNrt,
			ResourceFrame resourceFrameNrt, ObjectFactory factory) {
		
		
		
		// TODO Auto-generated method stub
		
	}



	private static void convertAfterSalesConditions(FareStructure osdmFares, FareFrame fareFrameNrt,
			ObjectFactory factory) {
		
		if (osdmFares.getAfterSalesRules() == null || osdmFares.getAfterSalesRules().getAfterSalesRules() == null) return;

		for (AfterSalesRule asr : osdmFares.getAfterSalesRules().getAfterSalesRules()) {

			FareStructureElement se = factory.createFareStructureElement();
			se.setId(IdFactory.getAfterSalesRuleId(asr));
			
			NeTExUtils.setTypeOf(se,"efp:sales_condition");
			
			GenericParameterAssignment gpa = factory.createGenericParameterAssignment();
			gpa.setLimitationGroupingType(LogicalOperationEnumeration.OR);
			gpa.setLimitations(factory.createUsageParametersRelStructure());
			se.setGenericParameterAssignment(gpa);

			for (AfterSalesCondition asc : asr.getConditions()) {
				
				if (asc.getTransactionType().equals(AfterSalesTransactionType.REFUND)) {

					GenericParameterAssignment gpa2 = factory.createGenericParameterAssignment();
					gpa2.setLimitationGroupingType(LogicalOperationEnumeration.AND);
					gpa2.setLimitations(factory.createUsageParametersRelStructure());
					gpa.getLimitations().getUsageParameterRefOrUsageParameterDummy().add(factory.createGenericParameterAssignment(gpa2));			
					
					//refund
					Refunding rf = factory.createRefunding();
					rf.setId(IdFactory.getRefundId(asr) + Integer.toString(asr.getConditions().indexOf(asc)));

					rf.setPrices(factory.createUsageParameterPricesRelStructure());
					UsageParameterPrice price = Osdm2FareStructurElementPrice.convert2UsageParameterPrice(asc.getFee());
					rf.getPrices().getUsageParameterPriceRefOrUsageParameterPriceOrCellRef().add(price);

					rf.setUnusedTicketsOnly(true);
					
					Duration d;
					try {
						d = DatatypeFactory.newInstance().newDuration(NeTExUtils.getDuration(asc.getApplicationTime().getValue(), asc.getApplicationTime().getUnit()).toString());
						rf.setExchangableUntilDuration(d);
						
						if (asc.getApplicationTime().equals(TimeReferenceType.AFTER_DEPARTURE)) {
							rf.setResellWhen(ResellWhenEnumeration.AFTER_FIRST_USE);
						} else if (asc.getApplicationTime().equals(TimeReferenceType.AFTER_END_VALIDITY)) {
							rf.setResellWhen(ResellWhenEnumeration.AFTER_END_OF_VALIDITY);
						} else if (asc.getApplicationTime().equals(TimeReferenceType.BEFORE_DEPARTURE)) {
							rf.setResellWhen(ResellWhenEnumeration.BEFORE_FIRST_USE);						
						} else if (asc.getApplicationTime().equals(TimeReferenceType.BEFORE_START_VALIDITY)) {
							rf.setResellWhen(ResellWhenEnumeration.BEFORE_START_OF_VALIDITY);
						} else if (asc.getApplicationTime().equals(TimeReferenceType.BEFORE_VALIDITY)) {
							rf.setResellWhen(ResellWhenEnumeration.BEFORE_VALIDATION);
						} 
						
						gpa.getLimitations().getUsageParameterRefOrUsageParameterDummy().add(factory.createRefunding(rf));
						
					} catch (DatatypeConfigurationException e) {
						e.printStackTrace();
					}

				}
			}
				
			for (AfterSalesCondition asc : asr.getConditions()) {
					
					if (!asc.getTransactionType().equals(AfterSalesTransactionType.REFUND)) {

						GenericParameterAssignment gpa2 = factory.createGenericParameterAssignment();
						gpa2.setLimitationGroupingType(LogicalOperationEnumeration.AND);
						gpa2.setLimitations(factory.createUsageParametersRelStructure());
						gpa.getLimitations().getUsageParameterRefOrUsageParameterDummy().add(factory.createGenericParameterAssignment(gpa2));			
						
						//exchange
						Exchanging rf = factory.createExchanging();
						rf.setId(IdFactory.getRefundId(asr) + Integer.toString(asr.getConditions().indexOf(asc)));
						
						rf.setUnusedTicketsOnly(true);
						rf.setPrices(factory.createUsageParameterPricesRelStructure());
						UsageParameterPrice price = Osdm2FareStructurElementPrice.convert2UsageParameterPrice(asc.getFee());
						rf.getPrices().getUsageParameterPriceRefOrUsageParameterPriceOrCellRef().add(price);

						rf.setKeyList(NeTExUtils.createKeyValueList(asc.getApplicationTime().getReference()));
						
						Duration d;
						try {
							d = DatatypeFactory.newInstance().newDuration(NeTExUtils.getDuration(asc.getApplicationTime().getValue(), asc.getApplicationTime().getUnit()).toString());
							rf.setExchangableUntilDuration(d);
							
							if (asc.getApplicationTime().equals(TimeReferenceType.AFTER_DEPARTURE)) {
								rf.setResellWhen(ResellWhenEnumeration.AFTER_FIRST_USE);
							} else if (asc.getApplicationTime().equals(TimeReferenceType.AFTER_END_VALIDITY)) {
								rf.setResellWhen(ResellWhenEnumeration.AFTER_END_OF_VALIDITY);
							} else if (asc.getApplicationTime().equals(TimeReferenceType.BEFORE_DEPARTURE)) {
								rf.setResellWhen(ResellWhenEnumeration.BEFORE_FIRST_USE);						
							} else if (asc.getApplicationTime().equals(TimeReferenceType.BEFORE_START_VALIDITY)) {
								rf.setResellWhen(ResellWhenEnumeration.BEFORE_START_OF_VALIDITY);
							} else if (asc.getApplicationTime().equals(TimeReferenceType.BEFORE_VALIDITY)) {
								rf.setResellWhen(ResellWhenEnumeration.BEFORE_VALIDATION);
							} 
							
							gpa.getLimitations().getUsageParameterRefOrUsageParameterDummy().add(factory.createExchanging(rf));
							
						} catch (DatatypeConfigurationException e) {
							e.printStackTrace();
						}
					}
			}
			
			if (fareFrameNrt.getFareStructureElements() == null) {
				fareFrameNrt.setFareStructureElements(factory.createFareStructureElementsInFrameRelStructure());
			}
			
			fareFrameNrt.getFareStructureElements().getFareStructureElement().add(se);

		}
	}



	private static void convertServiceConstraints(FareStructure osdmFares, FareFrame fareFrameNrt,
			FareStructureElementsInFrameRelStructure structureList, ObjectFactory factory, ResourceFrame resourceFrame) {
		
		if (osdmFares.getServiceConstraints() == null || osdmFares.getServiceConstraints().getServiceConstraints() == null) return;
		
		for (ServiceConstraint serviceConstraint : osdmFares.getServiceConstraints().getServiceConstraints()) {
			
			FareStructureElement se = factory.createFareStructureElement();
			se.setId(IdFactory.getFareStructureElementServiceConstraint(serviceConstraint));
			
			NeTExUtils.setTypeOf(se,"efp:eligibility");

			se.setQualityStructureFactors(factory.createQualityStructureFactorsRelStructure());
			
			for (ServiceBrand sb : serviceConstraint.getIncludedServiceBrands()) {		
				
				BrandingRefStructure br = factory.createBrandingRefStructure();
				br.setRef(UrnUtils.getServiceBrandUri(Integer.toString(sb.getCode())));
				
				addBranding2ResourceFrame(sb,resourceFrame,factory);
			
				se.getQualityStructureFactors().getQualityStructureFactorRefOrQualityStructureFactorDummy().add(factory.createBrandingRef(br));	
				
			}
			
			fareFrameNrt.getFareStructureElements().getFareStructureElement().add(se);
			
		}
		
		
		
	}

	private static void addBranding2ResourceFrame(ServiceBrand sb, ResourceFrame resourceFrame, ObjectFactory factory) {

		if (resourceFrame.getTypesOfValue() == null) {
			resourceFrame.setTypesOfValue(factory.createTypesOfValueInFrameRelStructure());
		}
		
		String ref = UrnUtils.getServiceBrandUri(Integer.toString(sb.getCode()));
		
		for (JAXBElement<? extends DataManagedObjectStructure> o : resourceFrame.getTypesOfValue().getValueSetOrTypeOfValue() ){
			if (o != null && o.getValue() != null && o.getValue() instanceof Branding) {
				Branding b = (Branding) o.getValue();
				
				if (b.getId().equals(ref)) {
					return;
				}
			}
		}
		
		Branding br = factory.createBranding();
		
		br.setId(ref);
		

		br.setName(Osdm2MultiLanguageString.getMultiLanguageString(sb.getName()) );
		br.setShortName(Osdm2MultiLanguageString.getMultiLanguageString(sb.getAbbreviation()) );
		br.setDescription(Osdm2MultiLanguageString.getMultiLanguageString(sb.getDescription()));
		
		resourceFrame.getTypesOfValue().getValueSetOrTypeOfValue().add(factory.createBranding(br));
		
	}






	private static void convertRegionalValidity(FareStructure osdmFares, FareFrame fareFrameNrt, ObjectFactory factory) {

		for (Gtm.RegionalConstraint rc : osdmFares.getRegionalConstraints().getRegionalConstraints()) {

			if (TestFareSelector.selectRegionalConstraint(rc)) {

			
			FareStructureElement se = factory.createFareStructureElement();
			se.setId(IdFactory.getFareStructureElementRegionId(rc));
			NeTExUtils.setTypeOf(se,"efp:access");
			
			DistanceMatrixElementsRelStructure dmr = factory.createDistanceMatrixElementsRelStructure();			
			DistanceMatrixElement dm = factory.createDistanceMatrixElement();
			dmr.getDistanceMatrixElementRefOrDistanceMatrixElement().add(dm);
			se.setDistanceMatrixElements(dmr);
			
			dm.setId(IdFactory.getFareStructureElementRegionId(rc));
			dm.setDistance(BigDecimal.valueOf(rc.getDistance()));

			
			String startCode = RouteDescriptionBuilder.getFirstStationCode(rc.getRegionalValidity());
			String endCode = RouteDescriptionBuilder.getLastStationCode(rc.getRegionalValidity());
			String startCodeUrn = UrnUtils.getStationUri(RouteDescriptionBuilder.getFirstStationCode(rc.getRegionalValidity()));
			String endCodeUrn = UrnUtils.getStationUri(RouteDescriptionBuilder.getLastStationCode(rc.getRegionalValidity()));
			
			if (startCode.length() < 8) {
				ScheduledStopPointRefStructure spr = factory.createScheduledStopPointRefStructure();
				spr.setRef(startCodeUrn);
				dm.setStartStopPointRef(spr);
			} else {
				ScheduledStopPointRefStructure spr = factory.createScheduledStopPointRefStructure();
				spr.setRef(startCode);
				dm.setStartStopPointRef(spr);
			}

			if (endCode.length() < 8) {
				ScheduledStopPointRefStructure spr = factory.createScheduledStopPointRefStructure();
				spr.setRef(endCodeUrn);
				dm.setEndStopPointRef(spr);
			}	else {
				ScheduledStopPointRefStructure spr = factory.createScheduledStopPointRefStructure();
				spr.setRef(endCode);
				dm.setEndStopPointRef(spr);				
			}
			
			SeriesConstraint sc = factory.createSeriesConstraint();
			SeriesConstraintsRelStructure scr = factory.createSeriesConstraintsRelStructure();
			scr.getSeriesConstraintRefOrSeriesConstraint().add(sc);
			dm.setSeriesConstraints(scr);
			
			sc.setFareBasis(FareBasisEnumeration.ROUTE);
			String routeDescription = RouteDescriptionBuilder.getRouteDescription(rc);
			sc.setItinerary(Osdm2MultiLanguageString.getMultiLanguageString(routeDescription));	
			sc.setId(IdFactory.getFareStructureElementRegionId(rc));
			
			if (rc.getEntryConnectionPoint() != null && rc.getEntryConnectionPoint().getLegacyBorderPointCode() > 0) {
				ConnectionRefStructure fcr = factory.createConnectionRefStructure();
				fcr.setRef(Osdm2SeriesConnection.getRef(rc.getEntryConnectionPoint()));
				sc.setFromConnectionRef(fcr);
			}
			
			if (rc.getExitConnectionPoint() != null && rc.getExitConnectionPoint().getLegacyBorderPointCode() > 0) {
				ConnectionRefStructure tcr = factory.createConnectionRefStructure();
				tcr.setRef(Osdm2SeriesConnection.getRef(rc.getExitConnectionPoint()));		
				sc.setToConnectionRef(tcr);
			}
			
			fareFrameNrt.getFareStructureElements().getFareStructureElement().add(se);
			
			}

		}
	}



	private static void convertReductionConstraints(FareStructure osdmFares, ResourceFrame resourceFrameNrt,
			FareStructureElementsInFrameRelStructure structureList, FareFrame fareFrameNrt, ObjectFactory factory) {
		
		if (osdmFares.getReductionConstraints() == null || osdmFares.getReductionConstraints().getReductionConstraints() == null || osdmFares.getReductionConstraints().getReductionConstraints().isEmpty()) {
			return;
		}
		
		//add cards as user profiles
		for ( Gtm.ReductionConstraint rc : osdmFares.getReductionConstraints().getReductionConstraints() ){
			
     		//create fare structure element with type Eligibility
			//new fare structure element
			FareStructureElement se = factory.createFareStructureElement();
			se.setId(IdFactory.getFareStructureElementReductionId(rc));
			NeTExUtils.setTypeOf(se,"efp:eligibility");

			GenericParameterAssignment gpa = factory.createGenericParameterAssignment();

			gpa.setName(Osdm2MultiLanguageString.getMultiLanguageString("required at travel"));
			gpa.setLimitationGroupingType(LogicalOperationEnumeration.OR);
			gpa.setLimitations(new UsageParametersRelStructure());
			se.setGenericParameterAssignment(gpa);

			for (Gtm.RequiredReductionCard card : rc.getRequiredReductionCards()) {
				
				EntitlementRequired er = factory.createEntitlementRequired();
				
				EntitlementProductRefStructure pr = factory.createEntitlementProductRefStructure();
				
				pr.setRef(IdFactory.getReductionCardId(card));

				er.setServiceAccessRightRef(factory.createEntitlementProductRef(pr));
			
				gpa.getLimitations().getUsageParameterRefOrUsageParameterDummy().add(factory.createEntitlementRequired(er));
				
			}
			
			structureList.getFareStructureElement().add(se);	
			
		}

	}



	private static void convertSalesAvailability(FareStructure osdmFares, ResourceFrame resourceFrameNrt,
			FareStructureElementsInFrameRelStructure structureList, FareFrame fareFrameNrt, ObjectFactory factory) {
		
		for (Gtm.SalesAvailabilityConstraint sa : osdmFares.getSalesAvailabilityConstraints().getSalesAvailabilityConstraints()) {
			
			//new fare structure element
			FareStructureElement se = factory.createFareStructureElement();
			se.setId(IdFactory.getFareStructureElementSalesAvailablilityId(sa));
			NeTExUtils.setTypeOf(se,"efp:sales_conditions");
			
			GenericParameterAssignment gpa = factory.createGenericParameterAssignment();
			gpa.setId(IdFactory.getFareStructureElementSalesAvailablilityId(sa));
			gpa.setLimitationGroupingType(LogicalOperationEnumeration.OR);
			gpa.setLimitations(factory.createUsageParametersRelStructure());
			
			for (Gtm.SalesRestriction sr : sa.getRestrictions()) {
			
				if (sr.getSalesDates() != null) {
					
					PurchaseWindow pw = factory.createPurchaseWindow();
					ValidBetween vb = factory.createValidBetween();
					vb.setFromDate(DateUtils.toXMLGregorianCalendar(sr.getSalesDates().getFromDateTime()));
					vb.setToDate(DateUtils.toXMLGregorianCalendar(sr.getSalesDates().getUntilDateTime()));
					pw.getValidBetween().add(vb);
					gpa.getLimitations().getUsageParameterRefOrUsageParameterDummy().add(factory.createPurchaseWindow(pw));	
				}
			}

			se.setGenericParameterAssignment(gpa);
			structureList.getFareStructureElement().add(se);	
		}
		
	}

		



	private static void convertTravelValidity(FareStructure osdmFares, ResourceFrame resourceFrameNrt,
			FareStructureElementsInFrameRelStructure structureList, FareFrame fareFrameNrt, ObjectFactory factory) {
		
		if(osdmFares.getTravelValidityConstraints() == null || osdmFares.getTravelValidityConstraints().getTravelValidityConstraints() == null || osdmFares.getTravelValidityConstraints().getTravelValidityConstraints().isEmpty()) {
			return;
		}
		
		for (Gtm.TravelValidityConstraint tv : osdmFares.getTravelValidityConstraints().getTravelValidityConstraints()) {
	
			//new fare structure element
			FareStructureElement se = factory.createFareStructureElement();
			NeTExUtils.setTypeOf(se,"efp:travel");
			
			se.setId(IdFactory.getFareStructureElementTravelValidityId(tv));
			GenericParameterAssignment gpa = factory.createGenericParameterAssignment();
			gpa.setLimitationGroupingType(LogicalOperationEnumeration.AND);
			gpa.setLimitations(factory.createUsageParametersRelStructure());
			se.setGenericParameterAssignment(gpa);
			structureList.getFareStructureElement().add(se);
			
			//total period
			UsageValidityPeriod uvp1 = factory.createUsageValidityPeriod();
			if (tv != null && tv.getValidDays() != null && tv.getValidDays().getFromDate() != null) {
				uvp1.setStartDate(DateUtils.toXMLGregorianCalendar(tv.getValidDays().getFromDate()));
				uvp1.setEndDate(DateUtils.toXMLGregorianCalendar(tv.getValidDays().getFromDate()));
			}
			uvp1.setUsageTrigger(UsageTriggerEnumeration.SPECIFIED_START_DATE);
			uvp1.setKeyList(NeTExUtils.createKeyValueList(tv.getValidityType()));
			if (tv.getValidityType().equals(TravelValidityType.SINGLE_TRIP)) {
				uvp1.setValidityPeriodType(UsageValidityTypeEnumeration.SINGLE_RIDE);
			} else if (tv.getValidityType().equals(TravelValidityType.MULTIPLE_TRIPS)) {
				uvp1.setValidityPeriodType(UsageValidityTypeEnumeration.OTHER);
			} else {
				uvp1.setValidityPeriodType(UsageValidityTypeEnumeration.OTHER);
			}
			gpa.getLimitations().getUsageParameterRefOrUsageParameterDummy().add(factory.createUsageValidityPeriod(uvp1));			
			
			//duration from start
			UsageValidityPeriod uvp2 = factory.createUsageValidityPeriod();
			uvp2.setUsageTrigger(UsageTriggerEnumeration.SPECIFIED_START_DATE);
			uvp2.setKeyList(NeTExUtils.createKeyValueList(tv.getValidityType()));
			if (tv.getValidityType().equals(TravelValidityType.SINGLE_TRIP)) {
				uvp2.setValidityPeriodType(UsageValidityTypeEnumeration.SINGLE_RIDE);
			} else if (tv.getValidityType().equals(TravelValidityType.MULTIPLE_TRIPS)) {
				uvp2.setValidityPeriodType(UsageValidityTypeEnumeration.OTHER);
			} else {
				uvp2.setValidityPeriodType(UsageValidityTypeEnumeration.OTHER);
			}			
			uvp2.setUsageEnd(UsageEndEnumeration.STANDARD_DURATION);
			uvp2.setStandardDuration(DateUtils.toDuration(true,Math.round(tv.getRange().getValue()), 0, 0,Math.round(tv.getRange().getHoursAfterMidnight())));
			
			gpa.getLimitations().getUsageParameterRefOrUsageParameterDummy().add(factory.createUsageValidityPeriod(uvp1));
			gpa.getLimitations().getUsageParameterRefOrUsageParameterDummy().add(factory.createUsageValidityPeriod(uvp2));	

			
		}

	}


	private static void convertPassengers(FareStructure osdmFares, ResourceFrame resourceFrameNrt, FareStructureElementsInFrameRelStructure structureList, FareFrame fareFrameNrt, ObjectFactory factory) {

		for (PassengerConstraint pa : osdmFares.getPassengerConstraints().getPassengerConstraints()) {

			UserProfile up = factory.createUserProfile();
			up.setId(IdFactory.getFareStructureElementPassengersId(pa));
			up.setName(Osdm2MultiLanguageString.getMultiLanguageString(pa.getText()));		
			up.setMaximumAge(BigInteger.valueOf(pa.getUpperAgeLimit()));
			up.setMinimumAge(BigInteger.valueOf(pa.getLowerAgeLimit()));
			up.setUserType(OsdmPassengerType2PassengerType.convertPassengerType(pa.getTravelerType()));		
			up.setKeyList(factory.createKeyListStructure());
			KeyValueStructure kvs = factory.createKeyValueStructure();
			kvs.setKey("TravelerType");
			kvs.setValue(UrnUtils.getPassengerTypeUri(pa.getTravelerType()));
			up.getKeyList().getKeyValue().add(kvs);
			
			if (pa.getIncludedFreePassengers() != null) {
				
				for (IncludedFreePassengerLimit ifp :pa.getIncludedFreePassengers()) {
					
					CompanionProfile companionProfile = factory.createCompanionProfile();
					
					//link to passenger type
					UserProfileRefStructure uprs = factory.createUserProfileRefStructure();
					uprs.setRef(IdFactory.getFareStructureElementPassengersId(pa));
					companionProfile.setUserProfileRef(factory.createUserProfileRef(uprs));

					//conditions
					companionProfile.setDiscountBasis(DiscountBasisEnumeration.FREE);
					companionProfile.setCompanionRelationshipType(CompanionRelationshipEnumeration.DEPENDENT);
					companionProfile.setMaximumNumberOfPersons(BigInteger.valueOf(0L));
					companionProfile.setMaximumNumberOfPersons(BigInteger.valueOf(ifp.getNumber()));
					
					if (up.getCompanionProfiles() == null) {
						up.setCompanionProfiles(factory.createCompanionProfilesRelStructure());
					}
					up.getCompanionProfiles().getCompanionProfileRefOrCompanionProfile().add(companionProfile);

				}
				
				if (pa.getExcludedPassengerCombinations() != null) {
					
				    for (PassengerCombinationConstraint pcc : pa.getExcludedPassengerCombinations()) {
				    	
						CompanionProfile companionProfile = factory.createCompanionProfile();
				    	
						//link to passenger type
						UserProfileRefStructure uprs = factory.createUserProfileRefStructure();
						uprs.setRef(IdFactory.getFareStructureElementPassengersId(pa));
						companionProfile.setUserProfileRef(factory.createUserProfileRef(uprs));

						//conditions
						companionProfile.setDiscountBasis(DiscountBasisEnumeration.NONE);
						companionProfile.setCompanionRelationshipType(CompanionRelationshipEnumeration.DEPENDENT);
						companionProfile.setMinimumNumberOfPersons(BigInteger.valueOf(pcc.getMinNumber()));
						companionProfile.setMaximumNumberOfPersons(BigInteger.valueOf(pcc.getMaxNumber()));
						
						if (up.getCompanionProfiles() == null) {
							up.setCompanionProfiles(factory.createCompanionProfilesRelStructure());
						}
						up.getCompanionProfiles().getCompanionProfileRefOrCompanionProfile().add(companionProfile);
				    	
				    }
				}
			}
			
			if (fareFrameNrt.getUsageParameters() == null) {
				fareFrameNrt.setUsageParameters(factory.createUsageParametersInFrameRelStructure());
			}
			fareFrameNrt.getUsageParameters().getUsageParameterDummy().add(factory.createUserProfile(up));

		}
	}
	
	private static void convertPassengerLimits(FareStructure osdmFares, ResourceFrame resourceFrameNrt,
			FareStructureElementsInFrameRelStructure structureList, FareFrame fareFrameNrt, ObjectFactory factory) {
		
		
		if (osdmFares.getTotalPassengerCombinationConstraints() != null) {
			
			for (TotalPassengerCombinationConstraint pl : osdmFares.getTotalPassengerCombinationConstraints().getTotalPassengerCombinationConstraint()) {
				
				GroupTicket gt = factory.createGroupTicket();			
     			gt.setId(IdFactory.getFareStructureElementPassengerLimitsId(pl));
     			gt.setMinimumNumberOfPersons(BigInteger.valueOf(Math.round(pl.getMinTotalPassengerWeight())));
     			gt.setMaximumNumberOfPersons(BigInteger.valueOf(Math.round(pl.getMaxTotalPassengerWeight())));     			

     			FareStructureElement fse = factory.createFareStructureElement();
     			fse.setId(IdFactory.getFareStructureElementPassengerLimitsId(pl));
     			GenericParameterAssignment gpa = factory.createGenericParameterAssignment();
     			gpa.setLimitations(factory.createUsageParametersRelStructure());
     			gpa.getLimitations().getUsageParameterRefOrUsageParameterDummy().add(factory.createGroupTicket(gt));
     			
     			
     			for (PassengerConstraint pc : osdmFares.getPassengerConstraints().getPassengerConstraints()) {
     				if (pc.getPassengerWeight() > 0) {
     					UserProfileRefStructure upr = factory.createUserProfileRefStructure();
     					upr.setRef(IdFactory.getFareStructureElementPassengersId(pc));
     					gpa.getLimitations().getUsageParameterRefOrUsageParameterDummy().add(factory.createUserProfileRef(upr));
     				}
     			}
     			
     			
     			fse.setGenericParameterAssignment(gpa);			
     			fareFrameNrt.getFareStructureElements().getFareStructureElement().add(fse);
     			
			}
		}

		
	}


	private static void convertClassOfUse(FareStructure osdmFares, ResourceFrame resourceFrameNrt,
			FareStructureElementsInFrameRelStructure structureList, FareFrame fareFrameNrt, ObjectFactory factory) {
		
		for (ServiceClass sc : osdmFares.getServiceClassDefinitions().getServiceClassDefinitions()) {
			

			FareStructureElement se = factory.createFareStructureElement();
			se.setId(IdFactory.getServiceClassId(sc));
			se.setName(Osdm2MultiLanguageString.getMultiLanguageString(sc.getText()));
			se.setValidityParameterAssignments(factory.createGenericParameterAssignmentsRelStructure());
			
			GenericParameterAssignmentVersionStructure gpa =factory.createGenericParameterAssignmentVersionStructure();
			se.getValidityParameterAssignments().getGenericParameterAssignmentOrGenericParameterAssignmentInContext().add(gpa);
			
			TypeOfFareStructureElementRefStructure  ts = factory.createTypeOfFareStructureElementRefStructure();
			ts.setValue("efp:can_access");		
			ts.setNameOfRefClass("ClassOfUse");
			se.setTypeOfFareStructureElementRef(ts);
			
			ClassOfUse cou = factory.createClassOfUse();
			cou.setFareClass(Osdm2FareClass.convert(sc.getId()));
			cou.setId(IdFactory.getServiceClassId(sc));
			cou.setName(Osdm2MultiLanguageString.getMultiLanguageString(sc.getText()));
			cou.setShortName(Osdm2MultiLanguageString.getMultiLanguageString(sc.getText().getShortTextUTF8()));
			
			if (fareFrameNrt.getAccessRightParameterAssignments() == null) {
				fareFrameNrt.setAccessRightParameterAssignments(factory.createAccessRightParameterAssignmentsInFrameRelStructure());
			}
			
			fareFrameNrt.getAccessRightParameterAssignments().getAccessRightParameterAssignmentDummy().add(factory.createClassOfUse(cou));
			
			structureList.getFareStructureElement().add(se);
			
			
		}

		
	}






	private static void convertCarriersAndCarrierGroups(FareStructure osdmFares,
			ResourceFrame resourceFrameNrt, FareStructureElementsInFrameRelStructure structureList, ObjectFactory factory2) {
 
		ObjectFactory factory = new ObjectFactory();
		
		//create organisations		
		for (Gtm.CarrierGroup cg : osdmFares.getCarrierGroups().getCarrierGroups()) {
    		
    		for (Carrier ca : cg.getCompanies()) {
    			
    			if (OsdmCarrier2ResourceFrameTransportOrganisation.companyNotInResourceFrame(ca.getCode(), resourceFrameNrt)) {
    				
    				addCarrierToResourceFrame(ca, factory, resourceFrameNrt);
    				
    			}
    		}    		
    		
    	}
    	
    	
    	for(Gtm.CarrierConstraint cc : osdmFares.getCarrierConstraints().getCarrierConstraints()) {
    		
    		FareStructureElement se = factory.createFareStructureElement();
    		
    		if (cc.getIncludedCarriers() != null && !cc.getIncludedCarriers().isEmpty()) {
    		
    			for (Carrier ca : cc.getIncludedCarriers()) {
    			
    				if (OsdmCarrier2ResourceFrameTransportOrganisation.companyNotInResourceFrame(ca.getCode(), resourceFrameNrt)) {
    				
        				addCarrierToResourceFrame(ca, factory, resourceFrameNrt);
    				}
    			}
    			
        		GroupOfOperators gop = factory.createGroupOfOperators();
        		TransportOrganisationRefsRelStructure members = factory.createTransportOrganisationRefsRelStructure(); 
        		gop.setMembers(members);
        		gop.setId(cc.getId());    
        		for (Carrier ca : cc.getIncludedCarriers()) {
        			TransportOrganisationRefStructure or = factory.createTransportOrganisationRefStructure(); 
        			or.setRef(UrnUtils.getCompanyUri(ca));
            		members.getTransportOrganisationRef().add(factory.createTransportOrganisationRef(or));
           		}
        		resourceFrameNrt.getGroupsOfOperators().getGroupOfOperators().add(gop);
    			
    		}
    		
    		if (cc.getExcludedCarriers() != null && !cc.getExcludedCarriers().isEmpty()) {
    			
    		
    			for (Carrier ca : cc.getExcludedCarriers()) {
    			
    				if (OsdmCarrier2ResourceFrameTransportOrganisation.companyNotInResourceFrame(ca.getCode(), resourceFrameNrt)) {
    				
        				addCarrierToResourceFrame(ca, factory, resourceFrameNrt);
        			
    				}
    			}
    			
    			//create group    			
    			GroupOfOperators gop = factory.createGroupOfOperators();
    			TransportOrganisationRefsRelStructure members = factory.createTransportOrganisationRefsRelStructure();
    			gop.setMembers(members);
    			gop.setUseToExclude(true);
    			gop.setId(cc.getId());
        		for (Gtm.Carrier ca : cc.getExcludedCarriers()) {
        			TransportOrganisationRefStructure or = factory.createTransportOrganisationRefStructure();
            		or.setRef(UrnUtils.getCompanyUri(ca));
            		members.getTransportOrganisationRef().add(factory.createTransportOrganisationRef(or));
                }
           		resourceFrameNrt.getGroupsOfOperators().getGroupOfOperators().add(gop);
    		}    		
    		
    		

    		//create carrier group
    		if (cc.getIncludedCarrierGroup() != null) {
    			
        		GroupOfOperators gop = factory.createGroupOfOperators();
        		TransportOrganisationRefsRelStructure members = factory.createTransportOrganisationRefsRelStructure();
        		gop.setMembers(members);
        		gop.setId(cc.getIncludedCarrierGroup().getId());
        		gop.setName(Osdm2MultiLanguageString.getMultiLanguageString(cc.getIncludedCarrierGroup().getName()));
        		for (Carrier ca : cc.getIncludedCarrierGroup().getCompanies()) {
    				if (OsdmCarrier2ResourceFrameTransportOrganisation.companyNotInResourceFrame(ca.getCode(), resourceFrameNrt)) {
        				
        				addCarrierToResourceFrame(ca, factory, resourceFrameNrt);
        				
    				}
        						
        			TransportOrganisationRefStructure or = factory.createTransportOrganisationRefStructure();
            		or.setRef(UrnUtils.getCompanyUri(ca));
            		members.getTransportOrganisationRef().add(factory.createTransportOrganisationRef(or));
           		}    			
        		resourceFrameNrt.getGroupsOfOperators().getGroupOfOperators().add(gop);
    		}
    		
    		
    		//create constraint
    		NeTExUtils.setTypeOf(se, "efp:accepted_by");
    		se.setId(IdFactory.getIncludedCarriersId(cc));  
    		if (cc.getIncludedCarrierGroup() != null) {
    			se.setResponsibilitySetRef(IdFactory.getIncludedCarrierGroupId(cc));
    		} else if (cc.getIncludedCarriers() != null){
    			se.setResponsibilitySetRef(IdFactory.getIncludedCarriersId(cc));  	
    		} else {
    			se.setResponsibilitySetRef(IdFactory.getIncludedCarriersId(cc));      			
    		}
 		
    		if (se != null) {
    			structureList.getFareStructureElement().add(se);
    		}
    		

    	}
	}



	private static void addCarrierToResourceFrame(Carrier ca, ObjectFactory factory, ResourceFrame resourceFrameNrt) {
		
		TransportOrganisation org = factory.createTransportOrganisation();
		org.setId(UrnUtils.getCompanyUri(ca));
		MultilingualString mls = Osdm2MultiLanguageString.getMultiLanguageString(ca.getShortName());
		org.getRest().add(factory.createOrganisationVersionStructureShortName(mls));
		MultilingualString mln = Osdm2MultiLanguageString.getMultiLanguageString(ca.getName());
		org.getRest().add(factory.createOrganisationVersionStructureName(mln));
		
		resourceFrameNrt.getOrganisations().getOrganisationDummy().add(factory.createTransportOrganisation(org));

	}



}
