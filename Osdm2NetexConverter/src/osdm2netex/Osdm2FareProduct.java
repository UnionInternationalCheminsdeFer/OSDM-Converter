package osdm2netex;

import Gtm.FulfillmentConstraint;
import Gtm.FulfillmentType;
import Gtm.SalesAvailabilityConstraint;
import Gtm.TravelValidityConstraint;
import uk.org.netex.netex.AccessRightInProductRefStructure;
import uk.org.netex.netex.Cell;
import uk.org.netex.netex.CellsRelStructure;
import uk.org.netex.netex.ClassOfUseRef;
import uk.org.netex.netex.FareFrame;
import uk.org.netex.netex.FarePriceVersionedChildStructure;
import uk.org.netex.netex.FareProduct;
import uk.org.netex.netex.FareProductRefStructure;
import uk.org.netex.netex.FareProductsInFrameRelStructure;
import uk.org.netex.netex.FareTable;
import uk.org.netex.netex.FareTableRowRefStructure;
import uk.org.netex.netex.ObjectFactory;
import uk.org.netex.netex.PriceableObjectRefsRelStructure;
import uk.org.netex.netex.PricingServiceRefStructure;
import uk.org.netex.netex.SalesOfferPackage;
import uk.org.netex.netex.SalesOfferPackageElement;
import uk.org.netex.netex.TypeOfTravelDocumentRefStructure;

public class Osdm2FareProduct {
	
	public static FareProduct convertFare (Gtm.FareElement osdmFare, FareFrame fareFrameNrt){
		
		ObjectFactory factory = new ObjectFactory();
		
		
		FareProduct product = convert2Product(osdmFare, factory);

		FarePriceVersionedChildStructure fp = Osdm2FareStructurElementPrice.convert2FarePriceVersionedChildStructure(osdmFare.getPrice() );

		FareTable table = factory.createFareTable();
		table.setDescription(Osdm2MultiLanguageString.getMultiLanguageString(osdmFare.getText()));
		table.setId(osdmFare.getId());
		
		PriceableObjectRefsRelStructure por = factory.createPriceableObjectRefsRelStructure();
		por.setId(product.getId());
		table.setPricesFor(por);
		CellsRelStructure cellRel = factory.createCellsRelStructure();
		cellRel.setId(osdmFare.getId());
		Cell cell = factory.createCell();
		
		ClassOfUseRef cr = factory.createClassOfUseRef();
		cr.setRef(osdmFare.getServiceClass().getId().getLiteral());
		cell.setClassOfUseRef(cr);
	
		cell.setCellPrice(fp);
		FareTableRowRefStructure rr = factory.createFareTableRowRefStructure();
		rr.setRef(osdmFare.getRegionalConstraint().getId());
		cell.setRowRef(rr);
		cellRel.getCellOrCellInContextOrFarePriceDummy().add(factory.createCell(cell));
		table.setCells(cellRel);
		
		SalesOfferPackage salesOfferPackage = factory.createSalesOfferPackage();
		salesOfferPackage.setFareTables(factory.createFareTablesRelStructure());
		salesOfferPackage.setSalesOfferPackageElements(factory.createSalesOfferPackageElementsRelStructure());
		if (fareFrameNrt.getSalesOfferPackages() == null) {
			fareFrameNrt.setSalesOfferPackages(factory.createSalesOfferPackagesInFrameRelStructure());;
		}
		fareFrameNrt.getSalesOfferPackages().getSalesOfferPackage().add(salesOfferPackage);
		SalesOfferPackageElement sope = factory.createSalesOfferPackageElement();
		FareProductRefStructure fpr = factory.createFareProductRefStructure();
		fpr.setRef(product.getId());
		sope.setFareProductRef(factory.createFareProductRef(fpr));
		salesOfferPackage.getSalesOfferPackageElements().getSalesOfferPackageElementRefOrSalesOfferPackageElement().add(sope);
		
		salesOfferPackage.getFareTables().getFareTableRefOrFareTableDummy().add(factory.createFareTable(table));
		
		FulfillmentConstraint fc = osdmFare.getFareConstraintBundle().getFulfillmentConstraint();
		for (FulfillmentType ft :fc.getAcceptedFulfilmentTypes()) {
			SalesOfferPackageElement sopef = factory.createSalesOfferPackageElement();
			TypeOfTravelDocumentRefStructure tdt = factory.createTypeOfTravelDocumentRefStructure();
			tdt.setRef("fulfillmentMethod_" + ft.getLiteral());
			sopef.setTypeOfTravelDocumentRef(tdt);		
			salesOfferPackage.getSalesOfferPackageElements().getSalesOfferPackageElementRefOrSalesOfferPackageElement().add(sopef);
			
		}

		if (fareFrameNrt.getFareProducts() == null){
			FareProductsInFrameRelStructure fpr2 = factory.createFareProductsInFrameRelStructure();
			fareFrameNrt.setFareProducts(fpr2);
		}
        
        fareFrameNrt.getFareProducts().getFareProductDummy().add(factory.createFareProduct(product));
		
		return product;
		
	}

	public static FareProduct convert2Product (Gtm.FareElement osdmFare, ObjectFactory factory) {
		
		FareProduct fareProduct = factory.createFareProduct();
		
		if (fareProduct.getValidableElements() == null) {
			fareProduct.setValidableElements(factory.createValidableElementsRelStructure());
		}
		
		fareProduct.setId(osdmFare.getId());
		if (fareProduct.getAccessRightsInProduct() == null) {
			fareProduct.setAccessRightsInProduct(factory.createAccessRightsInProductRelStructure());
		}
		
        fareProduct.setName(Osdm2MultiLanguageString.getMultiLanguageString(osdmFare.getText()));	
        
        //pricing service
    	PricingServiceRefStructure osdmPricingServiceRef = factory.createPricingServiceRefStructure();
		osdmPricingServiceRef.setUri("OSDM");
		osdmPricingServiceRef.setNameOfRefClass("PricingService");
		fareProduct.setPricingServiceRef(osdmPricingServiceRef);	
		
		//service class
		if (osdmFare.getServiceClass() != null) {
			AccessRightInProductRefStructure sarClass = factory.createAccessRightInProductRefStructure();
			sarClass.setRef("class_" + osdmFare.getServiceClass().getId().getLiteral());
			sarClass.setNameOfRefClass("ClassOfUse");
			fareProduct.getAccessRightsInProduct().getAccessRightInProductRefOrAccessRightInProduct().add(sarClass);
		}
		
		//carrier constraint
		if (osdmFare.getCarrierConstraint() != null) {
			AccessRightInProductRefStructure sarCarrier = factory.createAccessRightInProductRefStructure();
			sarCarrier.setRef("carriers_" + osdmFare.getCarrierConstraint().getId());
			sarCarrier.setNameOfRefClass("FareStructureElement");
			fareProduct.getValidableElements().getValidableElementRefOrValidableElement().add(sarCarrier);
		}
		
		//travel validity
		TravelValidityConstraint tvc = osdmFare.getTravelValidity();
		if (tvc == null) {
			tvc = osdmFare.getFareConstraintBundle().getTravelValidity();
		}		
		if (tvc != null) {
			AccessRightInProductRefStructure sarTravelVal = factory.createAccessRightInProductRefStructure();
			sarTravelVal.setRef("travelValidity_" + tvc.getId());
			sarTravelVal.setNameOfRefClass("FareStructureElement");
			fareProduct.getValidableElements().getValidableElementRefOrValidableElement().add(sarTravelVal);		
		}
		
		//passenger constraint
		if (osdmFare.getPassengerConstraint() != null ) {
			AccessRightInProductRefStructure sarTraveler = factory.createAccessRightInProductRefStructure();
			sarTraveler.setRef("passenger_" + osdmFare.getPassengerConstraint().getId());
			sarTraveler.setNameOfRefClass("FareStructureElement");
			fareProduct.getValidableElements().getValidableElementRefOrValidableElement().add(sarTraveler);		
		}
		
		//sales availability
		SalesAvailabilityConstraint sac = osdmFare.getSalesAvailability();
		if (sac == null) {
			sac = osdmFare.getFareConstraintBundle().getSalesAvailability();
		}
		if (sac != null) {
			AccessRightInProductRefStructure sarSalesDate = factory.createAccessRightInProductRefStructure();
			sarSalesDate.setRef("sales_availability_" + sac.getId());
			sarSalesDate.setNameOfRefClass("FareStructureElement");
			fareProduct.getValidableElements().getValidableElementRefOrValidableElement().add(sarSalesDate);	
		} 
		
		//reduction constraint
		if (osdmFare.getReductionConstraint() != null) {
			AccessRightInProductRefStructure reductionConstraint = factory.createAccessRightInProductRefStructure();
			reductionConstraint.setRef("reduction_"+osdmFare.getReductionConstraint().getId());
			reductionConstraint.setNameOfRefClass("FareStructureElement");
			fareProduct.getValidableElements().getValidableElementRefOrValidableElement().add(reductionConstraint);	
		}
		
		//regional constraint
		if (osdmFare.getRegionalConstraint() != null) {
			AccessRightInProductRefStructure regionalConstraint = new AccessRightInProductRefStructure();
			regionalConstraint.setRef("region_" + osdmFare.getRegionalConstraint().getId());
			regionalConstraint.setNameOfRefClass("FareStructureElement");
			fareProduct.getValidableElements().getValidableElementRefOrValidableElement().add(regionalConstraint);	
		}
		
		return fareProduct;
	}


}
