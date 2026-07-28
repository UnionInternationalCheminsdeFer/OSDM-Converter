package osdm2netex;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.Enumerator;

import Gtm.ApplicationTime;
import Gtm.TimeReferenceType;
import uk.org.netex.netex.FareStructureElement;
import uk.org.netex.netex.KeyListStructure;
import uk.org.netex.netex.KeyValueStructure;
import uk.org.netex.netex.ObjectFactory;
import uk.org.netex.netex.PricingServiceRefStructure;
import uk.org.netex.netex.PurchaseWhenEnumeration;
import uk.org.netex.netex.PurchaseWindow;
import uk.org.netex.netex.TypeOfFareStructureElementRefStructure;
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
	
}
