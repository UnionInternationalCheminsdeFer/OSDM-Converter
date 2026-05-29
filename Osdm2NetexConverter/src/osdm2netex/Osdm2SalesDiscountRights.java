package osdm2netex;

import Gtm.FareStructure;
import uk.org.netex.netex.AccessRightInProductRefStructure;
import uk.org.netex.netex.AlternativeName;
import uk.org.netex.netex.AlternativeNamesRelStructure;
import uk.org.netex.netex.FareFrame;
import uk.org.netex.netex.FareProduct;
import uk.org.netex.netex.FareProductsInFrameRelStructure;
import uk.org.netex.netex.ObjectFactory;
import uk.org.netex.netex.OrganisationRefStructure;
import uk.org.netex.netex.SaleDiscountRight;

public class Osdm2SalesDiscountRights {

	public static void convertToSalesDicountRights(FareStructure osdmFares, FareFrame fareFrameNrt) {
		
		ObjectFactory factory = new ObjectFactory();
		
		if (osdmFares.getReductionCards() == null || osdmFares.getReductionCards().getReductionCards() == null || osdmFares.getReductionCards().getReductionCards().isEmpty()) {
			return;
		}
		
		for (Gtm.ReductionCard card : osdmFares.getReductionCards().getReductionCards()) {
			
			//define the card
			
			SaleDiscountRight sdr = factory.createSaleDiscountRight();
			sdr.setId(card.getId());
			sdr.setName(Osdm2MultiLanguageString.getMultiLanguageString(card.getName()));
			AlternativeNamesRelStructure ans = factory.createAlternativeNamesRelStructure();
			AlternativeName an1 = factory.createAlternativeName();
			an1.setName(Osdm2MultiLanguageString.getMultiLanguageString(card.getShortCode()));
			ans.getAlternativeName().add(null);
			sdr.setAlternativeNames(ans);
			
			OrganisationRefStructure or = factory.createOrganisationRefStructure();
			or.setRef(card.getCardIssuer().getCode());
			sdr.setOrganisationRefDummy(factory.createOrganisationRef(or));
			
			FareProduct fareProduct = factory.createFareProduct();
			fareProduct.setId(card.getId());
			if (fareProduct.getAccessRightsInProduct() == null) {
				fareProduct.setAccessRightsInProduct(factory.createAccessRightsInProductRelStructure());
			}
			
	        fareProduct.setName(Osdm2MultiLanguageString.getMultiLanguageString(card.getName()));	
			
			
			for (Gtm.ServiceClass sc : card.getServiceClasses()) {
				AccessRightInProductRefStructure sarClass = factory.createAccessRightInProductRefStructure();
				sarClass.setRef(sc.getId().getLiteral());
				sarClass.setNameOfRefClass("ClassOfUse");
				fareProduct.getAccessRightsInProduct().getAccessRightInProductRefOrAccessRightInProduct().add(sc);
			}	
			
			if (fareFrameNrt.getFareProducts() == null){
				FareProductsInFrameRelStructure fpr = factory.createFareProductsInFrameRelStructure();
				fareFrameNrt.setFareProducts(fpr);
			}
	        
	        fareFrameNrt.getFareProducts().getFareProductDummy().add(factory.createFareProduct(fareProduct));
	        
	        
		}
		
	}

}
