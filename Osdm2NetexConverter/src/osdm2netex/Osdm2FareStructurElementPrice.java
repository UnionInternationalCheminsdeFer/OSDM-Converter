package osdm2netex;

import java.math.BigDecimal;

import uk.org.netex.netex.FareStructureElementPrice;
import uk.org.netex.netex.PricingServiceRefStructure;

public class Osdm2FareStructurElementPrice {
	
	/** The one hundred. */
	private static 	BigDecimal oneHundred = new BigDecimal("100.0");
	
	public static FareStructureElementPrice convert2FarePrice (Gtm.Price osdmPrice) {
		
		FareStructureElementPrice farePrice = new FareStructureElementPrice();
			
		farePrice.setCurrency(osdmPrice.getCurrencies().get(0).getCurrency().getIsoCode());
		
		farePrice.setId(osdmPrice.getId());

		BigDecimal value = new BigDecimal(Float.toString(osdmPrice.getCurrencies().get(0).getAmount()));		
		farePrice.setAmount(value.multiply(oneHundred));
		farePrice.setUnits(BigDecimal.valueOf(2L));
				
		farePrice.setAmount(null);		
		
		PricingServiceRefStructure pricingServiceRef = new PricingServiceRefStructure();
		pricingServiceRef.setUri("OSDM");
		farePrice.setPricingServiceRef(pricingServiceRef);	
		
		return farePrice;
	}

}
