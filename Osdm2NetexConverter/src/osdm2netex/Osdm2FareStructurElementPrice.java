package osdm2netex;

import java.math.BigDecimal;

import uk.org.netex.netex.FarePriceVersionedChildStructure;
import uk.org.netex.netex.FareProductPrice;
import uk.org.netex.netex.FareProductRefStructure;
import uk.org.netex.netex.FareStructureElementPrice;
import uk.org.netex.netex.ObjectFactory;
import uk.org.netex.netex.PricingServiceRefStructure;

public class Osdm2FareStructurElementPrice {
		
	public static FareStructureElementPrice convert2FarePrice (Gtm.Price osdmPrice) {
		
		FareStructureElementPrice farePrice = new FareStructureElementPrice();
			
		farePrice.setCurrency(osdmPrice.getCurrencies().get(0).getCurrency().getIsoCode());
		
		farePrice.setId(osdmPrice.getId());

		BigDecimal value = new BigDecimal(Float.toString(osdmPrice.getCurrencies().get(0).getAmount()));		
		farePrice.setUnits(BigDecimal.valueOf(2L));
		farePrice.setAmount(value);
		
		PricingServiceRefStructure pricingServiceRef = new PricingServiceRefStructure();
		pricingServiceRef.setUri("OSDM");
		farePrice.setPricingServiceRef(pricingServiceRef);	
		
		return farePrice;
	}

	public static FareProductPrice convert2FarePrice (Gtm.Price osdmPrice, String productRef) {
		
    	ObjectFactory factory = new ObjectFactory();
		
		FareProductPrice farePrice = factory.createFareProductPrice();

			
		farePrice.setCurrency(osdmPrice.getCurrencies().get(0).getCurrency().getIsoCode());
		
		farePrice.setId(osdmPrice.getId());

		BigDecimal value = new BigDecimal(Float.toString(osdmPrice.getCurrencies().get(0).getAmount()));		
		farePrice.setAmount(value);
		farePrice.setUnits(BigDecimal.valueOf(2L));
		
		PricingServiceRefStructure pricingServiceRef = new PricingServiceRefStructure();
		pricingServiceRef.setUri("OSDM");
		farePrice.setPricingServiceRef(pricingServiceRef);	
		FareProductRefStructure fp = factory.createFareProductRefStructure();
		fp.setRef(productRef);
		farePrice.setFareProductRef(factory.createFareProductRef(fp));
		
		return farePrice;
	}
	
	public static FarePriceVersionedChildStructure convert2FarePriceVersionedChildStructure (Gtm.Price osdmPrice) {
		
    	ObjectFactory factory = new ObjectFactory();
		
    	FarePriceVersionedChildStructure farePrice = factory.createFarePriceVersionedChildStructure();

			
		farePrice.setCurrency(osdmPrice.getCurrencies().get(0).getCurrency().getIsoCode());
		
		farePrice.setId(osdmPrice.getId());

		BigDecimal value = new BigDecimal(Float.toString(osdmPrice.getCurrencies().get(0).getAmount()));		
		farePrice.setAmount(value);
		farePrice.setUnits(BigDecimal.valueOf(2L));
		
		PricingServiceRefStructure pricingServiceRef = new PricingServiceRefStructure();
		pricingServiceRef.setUri("OSDM");
		farePrice.setPricingServiceRef(pricingServiceRef);	

		return farePrice;
	}
	
	

	
}
