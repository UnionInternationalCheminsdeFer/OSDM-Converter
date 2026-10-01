package osdm2netex;

import java.util.ArrayList;

import Gtm.CombinationConstraint;
import Gtm.CombinationModel;
import Gtm.FulfillmentConstraint;
import Gtm.SalesAvailabilityConstraint;
import Gtm.TotalPassengerCombinationConstraint;
import Gtm.TravelValidityConstraint;
import uk.org.netex.netex.ConditionSummaryStructure;
import uk.org.netex.netex.FareFrame;
import uk.org.netex.netex.FareProductRefStructure;
import uk.org.netex.netex.FareProductsInFrameRelStructure;
import uk.org.netex.netex.FareStructureElementRefStructure;
import uk.org.netex.netex.FareStructureTypeEnumeration;
import uk.org.netex.netex.ObjectFactory;
import uk.org.netex.netex.OperatorRestrictionsEnumeration;
import uk.org.netex.netex.PreassignedFareProduct;
import uk.org.netex.netex.PreassignedFareProductEnumeration;
import uk.org.netex.netex.PricingServiceRefStructure;
import uk.org.netex.netex.PrivateCodeStructure;
import uk.org.netex.netex.SalesOfferPackage;
import uk.org.netex.netex.SalesOfferPackageElement;
import uk.org.netex.netex.TypeOfTravelDocumentRefStructure;


public class Osdm2FareProduct {
	
	public static PreassignedFareProduct convertFare (Gtm.FareElement osdmFare, FareFrame fareFrameNrt){
		
		ObjectFactory factory = new ObjectFactory();
		
		PreassignedFareProduct product = convert2Product(osdmFare, factory);
		
		Osdm2FarePrice.convert2FareProductPrice(osdmFare, fareFrameNrt);

		
		//handle fulfillment constraints
		FulfillmentConstraint fc = osdmFare.getFulfillmentConstraint();
		if (fc == null) {
			fc = osdmFare.getFareConstraintBundle().getFulfillmentConstraint(); 
		}
		
		
		//create a sales offer package to add a restriction to fulfillment media
		SalesOfferPackage salesOfferPackage = factory.createSalesOfferPackage();
		salesOfferPackage.setId(IdFactory.getSalesOfferPackageId(osdmFare));
		salesOfferPackage.setDistributionAssignments(NeTExUtils.createDistributionRight());
		salesOfferPackage.setSalesOfferPackageElements(factory.createSalesOfferPackageElementsRelStructure());
		if (fareFrameNrt.getSalesOfferPackages() == null) {
			fareFrameNrt.setSalesOfferPackages(factory.createSalesOfferPackagesInFrameRelStructure());;
		}
		fareFrameNrt.getSalesOfferPackages().getSalesOfferPackage().add(salesOfferPackage);

		SalesOfferPackageElement salesOfferPackageElement = factory.createSalesOfferPackageElement();
		FareProductRefStructure fpr1 = factory.createFareProductRefStructure();
		fpr1.setRef(IdFactory.getFareProductId(osdmFare));
		salesOfferPackageElement.setFareProductRef(factory.createFareProductRef(fpr1));
		salesOfferPackage.getSalesOfferPackageElements().getSalesOfferPackageElementRefOrSalesOfferPackageElement().add(salesOfferPackageElement);

		//add fulfillment contraints
		ArrayList<String> refs = NeTExUtils.addFulFillmentConstraint(fareFrameNrt, fc);
		for (String ref: refs) {		
			SalesOfferPackageElement sopef = factory.createSalesOfferPackageElement();
			TypeOfTravelDocumentRefStructure tdt = factory.createTypeOfTravelDocumentRefStructure();
			tdt.setRef(ref);
			sopef.setTypeOfTravelDocumentRef(tdt);		
			salesOfferPackage.getSalesOfferPackageElements().getSalesOfferPackageElementRefOrSalesOfferPackageElement().add(sopef);
		}


		
		
		//add condition summary to the product
		ConditionSummaryStructure cs = factory.createConditionSummaryStructure();
		cs.setAllowAdditionalDiscounts(false);
		cs.setHasOperatorRestrictions(OperatorRestrictionsEnumeration.RESTRICTED);
		cs.setHasRouteRestrictions(true);
		cs.setHasTravelTimeRestrictions(true);
		cs.setHasExchangeFee(true);
		cs.setIsRefundable(false);
		cs.setFareStructureType(FareStructureTypeEnumeration.POINT_TO_POINT_FARE);
		
		CombinationConstraint combinationConstraint = osdmFare.getCombinationConstraint();
		if (combinationConstraint == null) {
			combinationConstraint = osdmFare.getFareConstraintBundle().getCombinationConstraint();
		}
		
		if (combinationConstraint != null) {
			for (Gtm.FareCombinationModel m : combinationConstraint.getCombinationModels()) {
				
				if (m.getModel().equals(CombinationModel.CLUSTERING)) {			
					if (m.getReferenceCluster().equals(Gtm.Clusters.BUSINESS) 
							|| m.getReferenceCluster().equals(Gtm.Clusters.FULLFLEX) ) {
						cs.setHasExchangeFee(false);
						cs.setIsRefundable(true);
						PrivateCodeStructure pcs = factory.createPrivateCodeStructure();
						pcs.setType("OSDM.BUSINESS_MODEL");
						pcs.setValue("OSDM." + m.getReferenceCluster().getLiteral());
						product.setPrivateCode(pcs);
					}
				}
			}
		}
		product.setConditionSummary(cs);
		product.setProductType(PreassignedFareProductEnumeration.SINGLE_TRIP);
		
		if (osdmFare.getFareConstraintBundle() != null &&
			osdmFare.getFareConstraintBundle().getTotalPassengerConstraint() != null ) {
			TotalPassengerCombinationConstraint pl = osdmFare.getFareConstraintBundle().getTotalPassengerConstraint();
		

			FareStructureElementRefStructure fser = factory.createFareStructureElementRefStructure();
			fser.setRef(IdFactory.getFareStructureElementPassengerLimitsId(pl));	
			fser.setNameOfRefClass("FareStructureElement");
			if (product.getValidableElements() == null) {
				product.setValidableElements(factory.createValidableElementsRelStructure());
			}
			
			product.getValidableElements().getValidableElementRefOrValidableElement().add(fser);
			
			/*
			ValidableElement ve = factory.createValidableElement();			
			ve.setFareStructureElements(factory.createFareStructureElementRefsRelStructure());
			ve.getFareStructureElements().getFareStructureElementRef().add(fser);
			product.getValidableElements().getValidableElementRefOrValidableElement().add(ve);
			*/
		}
		
		if (fareFrameNrt.getFareProducts() == null){
			FareProductsInFrameRelStructure fpr2 = factory.createFareProductsInFrameRelStructure();
			fareFrameNrt.setFareProducts(fpr2);
		}
        
        fareFrameNrt.getFareProducts().getFareProductDummy().add(factory.createPreassignedFareProduct(product));
		
  		return product;
		
	}

	public static PreassignedFareProduct convert2Product (Gtm.FareElement osdmFare, ObjectFactory factory) {
		
		PreassignedFareProduct fareProduct = factory.createPreassignedFareProduct();
		fareProduct.setId(IdFactory.getFareProductId(osdmFare));
		fareProduct.setValidableElements(factory.createValidableElementsRelStructure());
		//fareProduct.setAccessRightsInProduct(factory.createAccessRightsInProductRelStructure());
		
		//description
        fareProduct.setName(Osdm2MultiLanguageString.getMultiLanguageString(osdmFare.getText()));	
        
		if (osdmFare.getFareDetailDescription() != null) {
			fareProduct.setDescription(Osdm2MultiLanguageString.getMultiLanguageString(osdmFare.getFareDetailDescription().getTextUTF8()));
		}
        
        //pricing service
    	PricingServiceRefStructure osdmPricingServiceRef = factory.createPricingServiceRefStructure();
		osdmPricingServiceRef.setUri("OSDM");
		osdmPricingServiceRef.setNameOfRefClass("PricingService");
		fareProduct.setPricingServiceRef(osdmPricingServiceRef);	
		
		//service class
		if (osdmFare.getServiceClass() != null) {
			FareStructureElementRefStructure sarClass = factory.createFareStructureElementRefStructure();
			sarClass.setRef(IdFactory.getServiceClassId(osdmFare.getServiceClass()));
			sarClass.setNameOfRefClass("FareStructureElement");
			fareProduct.getValidableElements().getValidableElementRefOrValidableElement().add(sarClass);
			//fareProduct.getAccessRightsInProduct().getAccessRightInProductRefOrAccessRightInProduct().add(sarClass);
		}
		
		//carrier constraint
		if (osdmFare.getCarrierConstraint() != null) {
			FareStructureElementRefStructure sarCarrier = factory.createFareStructureElementRefStructure();
			sarCarrier.setRef(IdFactory.getFareStructureElementCarriersId(osdmFare.getCarrierConstraint()));
			sarCarrier.setNameOfRefClass("FareStructureElement");
			fareProduct.getValidableElements().getValidableElementRefOrValidableElement().add(sarCarrier);
		}
		
		//travel validity
		TravelValidityConstraint tvc = osdmFare.getTravelValidity();
		if (tvc == null) {
			tvc = osdmFare.getFareConstraintBundle().getTravelValidity();
		}		
		if (tvc != null) {
			FareStructureElementRefStructure sarTravelVal = factory.createFareStructureElementRefStructure();
			sarTravelVal.setRef(IdFactory.getFareStructureElementTravelValidityId(tvc));
			sarTravelVal.setNameOfRefClass("FareStructureElement");
			fareProduct.getValidableElements().getValidableElementRefOrValidableElement().add(sarTravelVal);		
		}
		
		//passenger constraint
		if (osdmFare.getPassengerConstraint() != null ) {
			FareStructureElementRefStructure sarTraveler = factory.createFareStructureElementRefStructure();
			sarTraveler.setRef(IdFactory.getFareStructureElementPassengersId(osdmFare.getPassengerConstraint()));
			sarTraveler.setNameOfRefClass("FareStructureElement");
			fareProduct.getValidableElements().getValidableElementRefOrValidableElement().add(sarTraveler);		
		}
		
		if (osdmFare.getServiceConstraint() != null) {
			
			FareStructureElementRefStructure sarServiceVal = factory.createFareStructureElementRefStructure();
			sarServiceVal.setRef(IdFactory.getFareStructureElementServiceConstraint(osdmFare.getServiceConstraint()));
			sarServiceVal.setNameOfRefClass("FareStructureElement");
			fareProduct.getValidableElements().getValidableElementRefOrValidableElement().add(sarServiceVal);		
		}
		
		try {
			if (osdmFare.getRegionalConstraint().getRegionalValidity().getFirst().getServiceConstraint() != null) {
				FareStructureElementRefStructure sarServiceVal = factory.createFareStructureElementRefStructure();
				sarServiceVal.setRef(IdFactory.getFareStructureElementServiceConstraint(osdmFare.getRegionalConstraint().getRegionalValidity().getFirst().getServiceConstraint()));
				sarServiceVal.setNameOfRefClass("FareStructureElement");
				fareProduct.getValidableElements().getValidableElementRefOrValidableElement().add(sarServiceVal);		
			}		
		} catch (Exception e) {
			//
		}
		
		try {
			if (osdmFare.getAfterSalesRule() != null) {
				FareStructureElementRefStructure arp = factory.createFareStructureElementRefStructure();
				arp.setRef(IdFactory.getAfterSalesRuleId(osdmFare.getAfterSalesRule()));
				arp.setNameOfRefClass("FareStructureElement");
				fareProduct.getValidableElements().getValidableElementRefOrValidableElement().add(arp);		
			
			}
		} catch (Exception e) {
			//
		}
		
		
		//sales availability
		SalesAvailabilityConstraint sac = osdmFare.getSalesAvailability();
		if (sac == null) {
			sac = osdmFare.getFareConstraintBundle().getSalesAvailability();
		}
		if (sac != null) {
			FareStructureElementRefStructure sarSalesDate = factory.createFareStructureElementRefStructure();
			sarSalesDate.setRef(IdFactory.getFareStructureElementSalesAvailablilityId(sac));
			sarSalesDate.setNameOfRefClass("FareStructureElement");
			fareProduct.getValidableElements().getValidableElementRefOrValidableElement().add(sarSalesDate);	
		} 
		
		//reduction constraint
		if (osdmFare.getReductionConstraint() != null) {
			FareStructureElementRefStructure reductionConstraint = factory.createFareStructureElementRefStructure();
			reductionConstraint.setRef(IdFactory.getFareStructureElementReductionId(osdmFare.getReductionConstraint()));
			reductionConstraint.setNameOfRefClass("FareStructureElement");
			fareProduct.getValidableElements().getValidableElementRefOrValidableElement().add(reductionConstraint);	
		}
		
		//regional constraint
		if (osdmFare.getRegionalConstraint() != null) {
			FareStructureElementRefStructure regionalConstraint = new FareStructureElementRefStructure();
			regionalConstraint.setRef(IdFactory.getFareStructureElementRegionId(osdmFare.getRegionalConstraint()));
			regionalConstraint.setNameOfRefClass("FareStructureElement");
			fareProduct.getValidableElements().getValidableElementRefOrValidableElement().add(regionalConstraint);	
		}
		
		return fareProduct;
	}


}
