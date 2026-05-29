package osdm2netex;

import uk.org.netex.netex.AccessRightInProductRefStructure;
import uk.org.netex.netex.Cell;
import uk.org.netex.netex.CellsRelStructure;
import uk.org.netex.netex.ClassOfUseRef;
import uk.org.netex.netex.FareFrame;
import uk.org.netex.netex.FareProduct;
import uk.org.netex.netex.FareProductRefStructure;
import uk.org.netex.netex.FareProductsInFrameRelStructure;
import uk.org.netex.netex.FareStructureElementPrice;
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
		
		FareStructureElementPrice fp = Osdm2FareStructurElementPrice.convert2FarePrice(osdmFare.getPrice());
		
		FareProduct product = convert2Product(osdmFare, factory);
		
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
		table.setCells(null);
		
		SalesOfferPackageElement sope = factory.createSalesOfferPackageElement();
		TypeOfTravelDocumentRefStructure tdt = factory.createTypeOfTravelDocumentRefStructure();
		tdt.setRef(osdmFare.getFareConstraintBundle().getFulfillmentConstraint().getId());
		sope.setTypeOfTravelDocumentRef(tdt);
		
	
		FareProductRefStructure fpr = factory.createFareProductRefStructure();
		fpr.setRef(product.getId());
		sope.setFareProductRef(factory.createFareProductRef(fpr));
		

		if (table != null) {
			SalesOfferPackage salesOfferPackageNrt = fareFrameNrt.getSalesOfferPackages().getSalesOfferPackage().get(0);
			salesOfferPackageNrt.getFareTables().getFareTableRefOrFareTableDummy().add(factory.createFareTable(table));
			salesOfferPackageNrt.getSalesOfferPackageElements().getSalesOfferPackageElementRefOrSalesOfferPackageElement().add(sope);
			fareFrameNrt.getFareTables().getFareTableDummy().add(factory.createFareTable(table));
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
			sarClass.setRef(osdmFare.getServiceClass().getId().getLiteral());
			sarClass.setNameOfRefClass("ClassOfUse");
			fareProduct.getAccessRightsInProduct().getAccessRightInProductRefOrAccessRightInProduct().add(sarClass);
		}
		
		//carrier constraint
		if (osdmFare.getCarrierConstraint() != null) {
			AccessRightInProductRefStructure sarCarrier = factory.createAccessRightInProductRefStructure();
			sarCarrier.setRef(osdmFare.getCarrierConstraint().getId());
			sarCarrier.setNameOfRefClass("FareStructureElement");
			fareProduct.getValidableElements().getValidableElementRefOrValidableElement().add(sarCarrier);
		}
		
		//travel validity
		if (osdmFare.getTravelValidity() != null) {
			AccessRightInProductRefStructure sarTravelVal = factory.createAccessRightInProductRefStructure();
			sarTravelVal.setRef(osdmFare.getTravelValidity().getId());
			sarTravelVal.setNameOfRefClass("FareStructureElement");
			fareProduct.getValidableElements().getValidableElementRefOrValidableElement().add(sarTravelVal);		
		}
		
		//passenger constraint
		if (osdmFare.getPassengerConstraint() != null ) {
			AccessRightInProductRefStructure sarTraveler = factory.createAccessRightInProductRefStructure();
			sarTraveler.setRef(osdmFare.getPassengerConstraint().getId());
			sarTraveler.setNameOfRefClass("FareStructureElement");
			fareProduct.getValidableElements().getValidableElementRefOrValidableElement().add(sarTraveler);		
		}
		
		//sales availability
		if (osdmFare.getSalesAvailability() != null) {
			AccessRightInProductRefStructure sarSalesDate =factory.createAccessRightInProductRefStructure();
			sarSalesDate.setRef(osdmFare.getSalesAvailability().getId());
			sarSalesDate.setNameOfRefClass("FareStructureElement");
			fareProduct.getValidableElements().getValidableElementRefOrValidableElement().add(sarSalesDate);	
		}
		
		//reduction constraint
		if (osdmFare.getReductionConstraint() != null) {
			AccessRightInProductRefStructure reductionConstraint = factory.createAccessRightInProductRefStructure();
			reductionConstraint.setRef(osdmFare.getReductionConstraint().getId());
			reductionConstraint.setNameOfRefClass("FareStructureElement");
			fareProduct.getValidableElements().getValidableElementRefOrValidableElement().add(reductionConstraint);	
		}
		
		//regional constraint
		if (osdmFare.getRegionalConstraint() != null) {
			AccessRightInProductRefStructure regionalConstraint = new AccessRightInProductRefStructure();
			regionalConstraint.setRef(osdmFare.getRegionalConstraint().getId());
			regionalConstraint.setNameOfRefClass("FareStructureElement");
			fareProduct.getValidableElements().getValidableElementRefOrValidableElement().add(regionalConstraint);	
		}
		
		return fareProduct;
	}


}
