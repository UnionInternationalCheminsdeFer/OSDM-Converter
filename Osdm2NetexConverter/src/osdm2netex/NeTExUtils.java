package osdm2netex;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.Enumerator;

import Gtm.ApplicationTime;
import Gtm.BarcodeTypes;
import Gtm.ControlDataExchangeTypes;
import Gtm.FulfillmentConstraint;
import Gtm.FulfillmentType;
import Gtm.TimeReferenceType;
import uk.org.netex.netex.DistributionAssignment;
import uk.org.netex.netex.DistributionAssignmentsRelStructure;
import uk.org.netex.netex.DistributionRightsEnumeration;
import uk.org.netex.netex.FareFrame;
import uk.org.netex.netex.FareStructureElement;
import uk.org.netex.netex.KeyListStructure;
import uk.org.netex.netex.KeyValueStructure;
import uk.org.netex.netex.MachineReadableEnumeration;
import uk.org.netex.netex.MediaTypeEnumeration;
import uk.org.netex.netex.ObjectFactory;
import uk.org.netex.netex.PricingServiceRefStructure;
import uk.org.netex.netex.PurchaseWhenEnumeration;
import uk.org.netex.netex.PurchaseWindow;
import uk.org.netex.netex.ResourceFrame;
import uk.org.netex.netex.TypeOfFareStructureElementRefStructure;
import uk.org.netex.netex.TypeOfMachineReadability;
import uk.org.netex.netex.TypeOfMachineReadabilityRefStructure;
import uk.org.netex.netex.TypeOfTravelDocument;
import uk.org.netex.netex.ValidityCondition;

public class NeTExUtils {

	
	public static void setTypeOf (FareStructureElement se, String typeOf) {
		if (se == null || typeOf == null) return;
		ObjectFactory factory = new ObjectFactory();
		TypeOfFareStructureElementRefStructure  ts = factory.createTypeOfFareStructureElementRefStructure();
		ts.setValue(typeOf);
		se.setTypeOfFareStructureElementRef(ts);
	}
	
	public static KeyListStructure createKeyValueList(Enumerator enumValue) {
		if (enumValue == null) return null;
		ObjectFactory factory = new ObjectFactory();
		KeyListStructure kls = factory.createKeyListStructure();
		KeyValueStructure kvs = factory.createKeyValueStructure();
		kvs.setKey("OSDM_" + enumValue.getClass().getCanonicalName().toUpperCase());
		kvs.setValue(enumValue.getLiteral());
		kls.getKeyValue().add(kvs);
		return kls;
	}
	
	public static PricingServiceRefStructure createPricingServiceRef() {
        //pricing service
		ObjectFactory factory = new ObjectFactory();
    	PricingServiceRefStructure osdmPricingServiceRef = factory.createPricingServiceRefStructure();
		osdmPricingServiceRef.setUri("OSDM");
		osdmPricingServiceRef.setNameOfRefClass("PricingService");
		return osdmPricingServiceRef;	
	}

	public static ValidityCondition getValidityCondition(ApplicationTime at) {
		
		ObjectFactory factory = new ObjectFactory();
		
		ValidityCondition vc = factory.createValidityCondition();
		
		vc.setValidityConditions(factory.createValidityConditionsRelStructure());
		
		PurchaseWindow pw = factory.createPurchaseWindow();
		
		pw.setKeyList(NeTExUtils.createKeyValueList(at.getReference()));
		
		Duration d = null;
		
		
		if (at.getUnit().equals(TimeUnit.DAYS)){
			d = Duration.ofDays(at.getValue());
		} else if (at.getUnit().equals(TimeUnit.MINUTES)) {
			d = Duration.ofMinutes(at.getValue());
		}
		
		if (at.getReference().equals(TimeReferenceType.AFTER_DEPARTURE)) {
			KeyValueStructure kvs = factory.createKeyValueStructure();
			kvs.setKey("Duration");
			kvs.setValue(d.toString());
			pw.getKeyList().getKeyValue().add(kvs);
			pw.setPurchaseWhen(PurchaseWhenEnumeration.OTHER);			
		} else if (at.getReference().equals(TimeReferenceType.AFTER_END_VALIDITY)) {
			KeyValueStructure kvs = factory.createKeyValueStructure();
			kvs.setKey("Duration");
			kvs.setValue(d.toString());
			pw.getKeyList().getKeyValue().add(kvs);			
			pw.setPurchaseWhen(PurchaseWhenEnumeration.OTHER);				
		} else if (at.getReference().equals(TimeReferenceType.BEFORE_DEPARTURE)) {
			KeyValueStructure kvs = factory.createKeyValueStructure();
			kvs.setKey("Duration");
			kvs.setValue(d.toString());
			pw.getKeyList().getKeyValue().add(kvs);
			pw.setPurchaseWhen(PurchaseWhenEnumeration.OTHER);
		} else if (at.getReference().equals(TimeReferenceType.BEFORE_START_VALIDITY)) {
			KeyValueStructure kvs = factory.createKeyValueStructure();
			kvs.setKey("Duration");
			kvs.setValue(d.toString());
			pw.getKeyList().getKeyValue().add(kvs);
			pw.setPurchaseWhen(PurchaseWhenEnumeration.OTHER);				
		} else if (at.getReference().equals(TimeReferenceType.BEFORE_VALIDITY)) {
			KeyValueStructure kvs = factory.createKeyValueStructure();
			kvs.setKey("Duration");
			kvs.setValue(d.toString());
			pw.getKeyList().getKeyValue().add(kvs);
			pw.setPurchaseWhen(PurchaseWhenEnumeration.OTHER);				
		} 
		
		
		vc.getValidityConditions().getValidityConditionRefOrValidBetweenOrValidityConditionDummy().add(at);
		
		return vc;
	}
	
	
	
	public static Duration getDuration(int value, Gtm.TimeUnit timeUnit) {
		
		Duration d = null;
		
		
		if (timeUnit.equals(TimeUnit.DAYS)){
			d = Duration.ofDays(value);
		} else if (timeUnit.equals(TimeUnit.MINUTES)) {
			d = Duration.ofMinutes(value);
		} else if (timeUnit.equals(TimeUnit.HOURS)) {
			d = Duration.ofHours(value);
		} else if (timeUnit.equals(TimeUnit.SECONDS)) {
			d = Duration.ofSeconds(value);
		} else if (timeUnit.equals(TimeUnit.MILLISECONDS)) {
			d = Duration.ofMillis(value);
		} else if (timeUnit.equals(TimeUnit.MICROSECONDS)) {
			d = Duration.ofNanos(value);
		};
		
		
		return d;
	}
	
	
	
	
	public static DistributionAssignmentsRelStructure createDistributionRight() {
		
		ObjectFactory factory = new ObjectFactory();
		
        DistributionAssignmentsRelStructure dar = factory.createDistributionAssignmentsRelStructure();
        DistributionAssignment da = factory.createDistributionAssignment();        
        ArrayList<DistributionRightsEnumeration> drl = new ArrayList<DistributionRightsEnumeration>();
        drl.add(DistributionRightsEnumeration.NONE);
        da.getRest().add(factory.createDistributionAssignmentVersionStructureDistributionRights(drl));
        dar.getDistributionAssignmentRefOrDistributionAssignment().add(da);
        
        return dar;
	}
	
	public static void addMachineReadabilities(ResourceFrame resources) {
		ObjectFactory factory = new ObjectFactory();
		
		if (resources.getTypesOfValue() == null) {
			resources.setTypesOfValue(factory.createTypesOfValueInFrameRelStructure());
		}
		
		for (BarcodeTypes bt : BarcodeTypes.values()) {
			
			TypeOfMachineReadability mrt = factory.createTypeOfMachineReadability();
			mrt.setId(IdFactory.getTravelDocumentTypeId(bt, null));
			mrt.setKeyList(factory.createKeyListStructure());
			KeyValueStructure mkvs = factory.createKeyValueStructure();
			mkvs.setTypeOfKey("BARCODE_TYPE");
			mkvs.setValue("OSDM_" + bt.getLiteral());	
			mrt.getKeyList().getKeyValue().add(mkvs);
			
			resources.getTypesOfValue().getValueSetOrTypeOfValue().add(factory.createTypeOfMachineReadability(mrt));			
		}		
		
	}
	
	
		
	public static ArrayList<String> addFulFillmentConstraint(FareFrame frame, FulfillmentConstraint fc) {
			ObjectFactory factory = new ObjectFactory();
			
			ArrayList<String> refs = new ArrayList<String>();
			
			if (frame.getTypesOfTravelDocuments() == null){
				frame.setTypesOfTravelDocuments(factory.createTypesOfTravelDocumentInFrameRelStructure());
			}
			
			if (fc.getAcceptedFulfilmentTypes() != null && !fc.getAcceptedFulfilmentTypes().isEmpty()) {

				for (FulfillmentType ft : fc.getAcceptedFulfilmentTypes()) {
			
					TypeOfTravelDocument tot = factory.createTypeOfTravelDocument();
					tot.setId(IdFactory.getTravelDocumentTypeId(fc) + "_" + ft.getLiteral());
					tot.setKeyList(factory.createKeyListStructure());
					refs.add(tot.getId());
					
					boolean newTypeOfTravelDocument = true;
					for (TypeOfTravelDocument td :frame.getTypesOfTravelDocuments().getTypeOfTravelDocument()) {
						if (td.getId().equals(tot.getId())) {
							newTypeOfTravelDocument = false;
						}
					}
					if (newTypeOfTravelDocument) {
					
						if (ft.equals(FulfillmentType.SIP)) {
							tot.setMediaType(MediaTypeEnumeration.PAPER_TICKET);
						}
						
						if (fc.getAcceptedBarcodeTypes() != null && !fc.getAcceptedBarcodeTypes().isEmpty()) {
					
							tot.setTypesOfMachineReadabilities(factory.createTypesOfMachineReadabilitiesRelStructure());
							tot.getMachineReadable().add(MachineReadableEnumeration.BAR_CODE);
							
							for (BarcodeTypes bt : fc.getAcceptedBarcodeTypes()) {
							
								TypeOfMachineReadabilityRefStructure mrt = factory.createTypeOfMachineReadabilityRefStructure();
								mrt.setRef(IdFactory.getTravelDocumentTypeId(bt, null));
								tot.getTypesOfMachineReadabilities().getTypeOfMachineReadabilityRef().add(mrt);
							}
						}	
	
						KeyValueStructure kvs = factory.createKeyValueStructure();
						kvs.setTypeOfKey("SECURITY_TYPE");
						kvs.setValue("OSDM_" + ft.getLiteral());
						tot.getKeyList().getKeyValue().add(kvs);
					
						frame.getTypesOfTravelDocuments().getTypeOfTravelDocument().add(tot);
					}
					
					if (fc.getRequiredControlDataExchange() != null && !fc.getRequiredControlDataExchange().isEmpty()) {

						for (ControlDataExchangeTypes cd : fc.getRequiredControlDataExchange()) {
							KeyValueStructure kvs = factory.createKeyValueStructure();
							kvs.setTypeOfKey("REQUIRED_CONTROL_DATA_EXCHANGE");
							kvs.setValue("OSDM_" + cd.getLiteral());
							tot.getKeyList().getKeyValue().add(kvs);		
						}
					}	
			}
		}
		return refs;
	}
	
}
