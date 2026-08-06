package osdm2netex;

import Gtm.Carrier;
import Gtm.FareStructure;
import jakarta.xml.bind.JAXBElement;
import uk.org.netex.netex.DataManagedObjectStructure;
import uk.org.netex.netex.FareStructureElement;
import uk.org.netex.netex.FareStructureElementsInFrameRelStructure;
import uk.org.netex.netex.GenericParameterAssignment;
import uk.org.netex.netex.GroupOfOperators;
import uk.org.netex.netex.GroupOfOperatorsRefStructure;
import uk.org.netex.netex.LogicalOperationEnumeration;
import uk.org.netex.netex.MultilingualString;
import uk.org.netex.netex.ObjectFactory;
import uk.org.netex.netex.ResourceFrame;
import uk.org.netex.netex.TransportOrganisation;
import uk.org.netex.netex.TransportOrganisationRefStructure;
import uk.org.netex.netex.TransportOrganisationRefsRelStructure;
import uk.org.netex.netex.ValidityParametersRelStructure;

public class Osdm2TransportOrganisation {
	
	
	public static void convertCarriersAndCarrierGroups(FareStructure osdmFares,
			ResourceFrame resourceFrameNrt, FareStructureElementsInFrameRelStructure structureList, ObjectFactory factory2) {
 
		ObjectFactory factory = new ObjectFactory();
		
		//create organisations		
		for (Gtm.CarrierGroup cg : osdmFares.getCarrierGroups().getCarrierGroups()) {
    		
    		for (Carrier ca : cg.getCompanies()) {
    			
    			if (companyNotInResourceFrame(ca.getCode(), resourceFrameNrt)) {
    				
    				addCarrierToResourceFrame(ca, factory, resourceFrameNrt);
    				
    			}
    		}    		
    		
    	}
    	
    	
    	for(Gtm.CarrierConstraint cc : osdmFares.getCarrierConstraints().getCarrierConstraints()) {
    		
    		FareStructureElement se = factory.createFareStructureElement();
    		
    		if (cc.getIncludedCarriers() != null && !cc.getIncludedCarriers().isEmpty()) {
    		
    			for (Carrier ca : cc.getIncludedCarriers()) {
    			
    				if (companyNotInResourceFrame(ca.getCode(), resourceFrameNrt)) {
    				
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
    			
    				if (companyNotInResourceFrame(ca.getCode(), resourceFrameNrt)) {
    				
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
    				if (companyNotInResourceFrame(ca.getCode(), resourceFrameNrt)) {
        				
        				addCarrierToResourceFrame(ca, factory, resourceFrameNrt);
        				
    				}
        						
        			TransportOrganisationRefStructure or = factory.createTransportOrganisationRefStructure();
            		or.setRef(UrnUtils.getCompanyUri(ca));
            		members.getTransportOrganisationRef().add(factory.createTransportOrganisationRef(or));
           		}    			
        		resourceFrameNrt.getGroupsOfOperators().getGroupOfOperators().add(gop);
    		}
    		
    		
    		//create the fare structure element for the constraint
    		NeTExUtils.setTypeOf(se, "efp:accepted_by");
    		
			GenericParameterAssignment gpa = factory.createGenericParameterAssignment();
			se.setGenericParameterAssignment(gpa);
    		se.setId(IdFactory.getIncludedCarriersId(cc));  
    		
			if (cc.getIncludedCarriers() != null || cc.getIncludedCarrierGroup() != null) {
				
				gpa.setLimitationGroupingType(LogicalOperationEnumeration.OR);
				gpa.setIsAllowed(true);
				gpa.setLimitations(factory.createUsageParametersRelStructure());
    			ValidityParametersRelStructure vpa = factory.createValidityParametersRelStructure();
    			GroupOfOperatorsRefStructure go = factory.createGroupOfOperatorsRefStructure();
    			
	    		if (cc.getIncludedCarrierGroup() != null) {
	    			go.setRef(IdFactory.getIncludedCarrierGroupId(cc));
	    		} else if (cc.getIncludedCarriers() != null){
	    			go.setRef(IdFactory.getIncludedCarriersId(cc));
	    		} else {
	    			go.setRef(IdFactory.getIncludedCarriersId(cc));  			
	    		}
    			vpa.getVehicleModesOrTransportModesAndTransportSubmode().add(factory.createGroupOfOperatorsRef(go));
    			gpa.setValidityParameters(vpa);
				
			} else if (cc.getExcludedCarriers() != null ) {
				
				gpa.setLimitationGroupingType(LogicalOperationEnumeration.AND);
				gpa.setIsAllowed(false);
				gpa.setLimitations(factory.createUsageParametersRelStructure());
    			ValidityParametersRelStructure vpa = factory.createValidityParametersRelStructure();
    			GroupOfOperatorsRefStructure go = factory.createGroupOfOperatorsRefStructure();
    			go.setRef(IdFactory.getIncludedCarriersId(cc));  			
    			vpa.getVehicleModesOrTransportModesAndTransportSubmode().add(factory.createGroupOfOperatorsRef(go));
    			gpa.setValidityParameters(vpa);
				
				
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
	
	public static boolean companyNotInResourceFrame(String code, ResourceFrame resourceFrameNrt) {		
		for (JAXBElement<? extends DataManagedObjectStructure> org : 
			   resourceFrameNrt.getOrganisations().getOrganisationDummy()) {
			   Object o = org.getValue();
			if ( ((TransportOrganisation)o).getId().equals(code) ) {
				return false;
			}
		}
		return true;
	}
	
	

}
