package osdm2netex;

import Gtm.FareStructure;
import Gtm.ServiceClass;
import uk.org.netex.netex.AlternativeName;
import uk.org.netex.netex.AlternativeNamesRelStructure;
import uk.org.netex.netex.EntitlementProduct;
import uk.org.netex.netex.FareFrame;
import uk.org.netex.netex.NameTypeEnumeration;
import uk.org.netex.netex.ObjectFactory;
import uk.org.netex.netex.ValidityConditionRefStructure;

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
				issuer = UrnUtils.getCompanyUri(card.getCardIssuer());
			} else {
				if (card.getId().startsWith("UIC")) {
					issuer = UrnUtils.getCompanyUri("3011");
				}
			}
			
			//define the entitlement for the card
			EntitlementProduct entitlement = factory.createEntitlementProduct();
			entitlement.setId(IdFactory.getReductionCardId(card));
			
			entitlement.setName(Osdm2MultiLanguageString.getMultiLanguageString(card.getName()));
			
			if (card.getShortCode() != null) {
				AlternativeNamesRelStructure ans2 = factory.createAlternativeNamesRelStructure();
				AlternativeName an2 = factory.createAlternativeName();
				an2.setShortName(Osdm2MultiLanguageString.getMultiLanguageString(card.getShortCode()));
				an2.setNameType(NameTypeEnumeration.OTHER);
				an2.setTypeOfName("BARCODE");
				ans2.getAlternativeName().add(an2);
				entitlement.setAlternativeNames(ans2);
			}
			entitlement.setResponsibilitySetRef(issuer);
			

			
			if (card.getServiceClasses() != null && !card.getServiceClasses().isEmpty()) {

				entitlement.setValidityConditions(factory.createValidityConditionsRelStructure());
				
				for (ServiceClass sc : card.getServiceClasses()) {
					ValidityConditionRefStructure fr = factory.createValidityConditionRefStructure();
					fr.setRef(IdFactory.getServiceClassId(sc));
					entitlement.getValidityConditions().getValidityConditionRefOrValidBetweenOrValidityConditionDummy().add(factory.createValidityConditionRef(fr));
				}
				
			}
			
			fareFrameNrt.getFareProducts().getFareProductDummy().add(factory.createEntitlementProduct(entitlement));
			
			
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
