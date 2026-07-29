package osdm2netex;

import java.math.BigDecimal;

import Gtm.Price;
import uk.org.netex.netex.FarePriceVersionedChildStructure;
import uk.org.netex.netex.FareProductPrice;
import uk.org.netex.netex.FareProductRefStructure;
import uk.org.netex.netex.FareStructureElementPrice;
import uk.org.netex.netex.ObjectFactory;
import uk.org.netex.netex.PricingServiceRefStructure;
import uk.org.netex.netex.UsageParameterPrice;
import uk.org.netex.netex.UsageParameterPriceRefStructure;

public class Osdm2FareStructurElementPrice {
		
	public static FareStructureElementPrice convert2FarePrice (Gtm.Price osdmPrice) {
		
		ObjectFactory factory = new ObjectFactory();
		
		FareStructureElementPrice farePrice = factory.createFareStructureElementPrice();
		farePrice.setId(IdFactory.getPriceId(osdmPrice));
		
		farePrice.setCurrency(osdmPrice.getCurrencies().get(0).getCurrency().getIsoCode());

		BigDecimal value = new BigDecimal(Float.toString(osdmPrice.getCurrencies().get(0).getAmount()));		
		farePrice.setUnits(BigDecimal.valueOf(2L));
		farePrice.setAmount(value);
		
		farePrice.setPricingServiceRef(NeTExUtils.createPricingServiceRef());	
		
		return farePrice;
	}

	public static FareProductPrice convert2FarePrice (Gtm.Price osdmPrice, String productRef) {
		
    	ObjectFactory factory = new ObjectFactory();
		
		FareProductPrice farePrice = factory.createFareProductPrice();
		farePrice.setId(IdFactory.getPriceId(osdmPrice));
			
		farePrice.setCurrency(osdmPrice.getCurrencies().get(0).getCurrency().getIsoCode());

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
		farePrice.setId(IdFactory.getPriceId(osdmPrice));
    	
		farePrice.setCurrency(osdmPrice.getCurrencies().get(0).getCurrency().getIsoCode());
		
		BigDecimal value = new BigDecimal(Float.toString(osdmPrice.getCurrencies().get(0).getAmount()));		
		farePrice.setAmount(value);
		farePrice.setUnits(BigDecimal.valueOf(2L));
		
		PricingServiceRefStructure pricingServiceRef = new PricingServiceRefStructure();
		pricingServiceRef.setUri("OSDM");
		farePrice.setPricingServiceRef(pricingServiceRef);	

		return farePrice;
	}
	
	public static UsageParameterPrice convert2UsageParameterPrice (Gtm.Price osdmPrice) {

		ObjectFactory factory = new ObjectFactory();
		
		UsageParameterPrice farePrice = factory.createUsageParameterPrice();
		farePrice.setId(IdFactory.getPriceId(osdmPrice));
    	
		farePrice.setCurrency(osdmPrice.getCurrencies().get(0).getCurrency().getIsoCode());
		
		BigDecimal value = new BigDecimal(Float.toString(osdmPrice.getCurrencies().get(0).getAmount()));		
		farePrice.setAmount(value);
		farePrice.setUnits(BigDecimal.valueOf(2L));
		
		farePrice.setPricingServiceRef(NeTExUtils.createPricingServiceRef());	

		return farePrice;
	}	
	
	public static UsageParameterPriceRefStructure getPriceRef(Gtm.Price osdmPrice) {

		ObjectFactory factory = new ObjectFactory();
		
		UsageParameterPriceRefStructure fp = factory.createUsageParameterPriceRefStructure();
		
		fp.setRef(IdFactory.getPriceId(osdmPrice));
    	
		return fp;
		
	}

	public static void convert2FarePrice(FareProductPrice fpp, Price osdmPrice) {

		fpp.setId(IdFactory.getPriceId(osdmPrice));
    	
		fpp.setCurrency(osdmPrice.getCurrencies().get(0).getCurrency().getIsoCode());
		
		BigDecimal value = new BigDecimal(Float.toString(osdmPrice.getCurrencies().get(0).getAmount()));		
		fpp.setAmount(value);
		fpp.setUnits(BigDecimal.valueOf(2L));
		
		PricingServiceRefStructure pricingServiceRef = new PricingServiceRefStructure();
		pricingServiceRef.setUri("OSDM");
		fpp.setPricingServiceRef(pricingServiceRef);	
		
	}	
	
	/*
	
	public static void convertPrices (FareFrame fareFrameNrt, Gtm.FareStructure osdmFares) {
		
		if (fareFrameNrt == null || osdmFares == null || osdmFares.getPrices() == null || osdmFares.getPrices().getPrices() == null) {
			return;
		}
		
		ObjectFactory factory = new ObjectFactory();

		if (fareFrameNrt.getUsageParameters() == null) {
			fareFrameNrt.setUsageParameters(factory.createUsageParametersInFrameRelStructure());
		}
		for (Price op : osdmFares.getPrices().getPrices()) {
			
			UsageParameterPrice fp = convert2UsageParameterPrice (op);
			
			fareFrameNrt.getUsageParameters().getUsageParameterDummy().add(factory.createUsageParameterPrice(fp));
		}


		
	}
	
	 	*/
	
}
