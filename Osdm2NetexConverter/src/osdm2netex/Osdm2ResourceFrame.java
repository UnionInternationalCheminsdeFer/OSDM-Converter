package osdm2netex;

import jakarta.xml.bind.JAXBElement;

import uk.org.netex.netex.DataManagedObjectStructure;
import uk.org.netex.netex.ResourceFrame;
import uk.org.netex.netex.TransportOrganisation;

public class Osdm2ResourceFrame {
	
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
