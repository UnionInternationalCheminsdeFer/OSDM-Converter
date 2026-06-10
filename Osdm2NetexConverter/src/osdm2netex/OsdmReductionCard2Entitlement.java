package osdm2netex;

import Gtm.FareStructure;
import uk.org.netex.netex.AlternativeName;
import uk.org.netex.netex.AlternativeNamesRelStructure;
import uk.org.netex.netex.EntitlementProduct;
import uk.org.netex.netex.FareFrame;
import uk.org.netex.netex.ObjectFactory;

public class OsdmReductionCard2Entitlement {

	public static void convertToSalesDicountRights(FareStructure osdmFares, FareFrame fareFrameNrt) {
		
		ObjectFactory factory = new ObjectFactory();
		
		if (osdmFares.getReductionCards() == null || osdmFares.getReductionCards().getReductionCards() == null || osdmFares.getReductionCards().getReductionCards().isEmpty()) {
			return;
		}
		
		for (Gtm.ReductionCard card : osdmFares.getReductionCards().getReductionCards()) {
			
			

			//add issuer
			String issuer = null;
			if (card.getCardIssuer() != null) {
				issuer = card.getCardIssuer().getCode();
			} else {
				issuer = "UIC";
			}
			
						//define the entitlement for the card
			EntitlementProduct entitlement = factory.createEntitlementProduct();
			entitlement.setId("card_" + card.getId());
			entitlement.setName(Osdm2MultiLanguageString.getMultiLanguageString(card.getName()));
			AlternativeNamesRelStructure ans2 = factory.createAlternativeNamesRelStructure();
			AlternativeName an2 = factory.createAlternativeName();
			an2.setName(Osdm2MultiLanguageString.getMultiLanguageString(card.getShortCode()));
			entitlement.setAlternativeNames(ans2);
			
			entitlement.setResponsibilitySetRef(issuer);
			
			
     		/*
			ResponsibilitySet rs = factory.createResponsibilitySet();
			rs.setId("cardIssuer_" + issuer);
			rs.setRoles(factory.createResponsibilityRoleAssignmentsRelStructure());
			ResponsibilityRoleAssignment ra = factory.createResponsibilityRoleAssignment();
			ra.setResponsibilityRoleRef(factory.createResponsibilityRoleRefStructure());
			ra.getResponsibilityRoleRef().setValue("card issuer");
			OrganisationRefStructure ro = factory.createOrganisationRefStructure();
			ro.setRef(issuer);
			ra.setResponsibleOrganisationRef(ro);
			rs.getRoles().getResponsibilityRoleAssignment().add(ra);
			*/
			
		}
		
	}

}
