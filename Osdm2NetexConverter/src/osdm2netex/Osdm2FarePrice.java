package osdm2netex;

import java.math.BigDecimal;

import Gtm.FareElement;
import Gtm.Price;
import jakarta.xml.bind.JAXBElement;
import uk.org.netex.netex.FarePrice;
import uk.org.netex.netex.FareFrame;
import uk.org.netex.netex.FarePriceRefStructure;
import uk.org.netex.netex.FareProductPrice;
import uk.org.netex.netex.FareProductRefStructure;
import uk.org.netex.netex.FareTable;
import uk.org.netex.netex.GroupOfEntitiesVersionStructure;
import uk.org.netex.netex.ObjectFactory;
import uk.org.netex.netex.PricingServiceRefStructure;
import uk.org.netex.netex.UsageParameterPrice;
import uk.org.netex.netex.UsageParameterPriceRefStructure;

public class Osdm2FarePrice {
		

	public static void convert2FareProductPrice (FareElement osdmFare, FareFrame fareFrame) {
		
    	ObjectFactory factory = new ObjectFactory();
	
    	//add price
    	Price osdmPrice = osdmFare.getPrice();
    	FarePrice farePrice = factory.createFarePrice();
    	farePrice.setId(IdFactory.getPriceId(osdmPrice));
		farePrice.setCurrency(osdmFare.getPrice().getCurrencies().get(0).getCurrency().getIsoCode());
		
		BigDecimal value = new BigDecimal(Float.toString(osdmFare.getPrice().getCurrencies().get(0).getAmount()));		
		farePrice.setAmount(value);
		farePrice.setUnits(BigDecimal.valueOf(2L));

    	addToPriceTable(farePrice, fareFrame);
		
		//add reference to the fare product
		FareProductPrice fareProductPrice = factory.createFareProductPrice();
		fareProductPrice.setId("PRICE_OF_"+ IdFactory.getFareProductId(osdmFare));
		//fpp.setDescription(Osdm2MultiLanguageString.getMultiLanguageString(osdmFare.getText()));	
		FareProductRefStructure fareProductRef = factory.createFareProductRefStructure();
		fareProductRef.setRef(IdFactory.getFareProductId(osdmFare));
		FarePriceRefStructure farePriceRef = factory.createFarePriceRefStructure();
		farePriceRef.setRef(farePrice.getId());
		fareProductPrice.setFarePriceRef(factory.createFarePriceRef(farePriceRef));
		fareProductPrice.setFareProductRef(factory.createFareProductRef(fareProductRef));
		PricingServiceRefStructure pricingServiceRef = new PricingServiceRefStructure();
		pricingServiceRef.setUri("OSDM");
		fareProductPrice.setPricingServiceRef(pricingServiceRef);	

		addToFareProductPriceTable(fareProductPrice, fareFrame);
		
	}
	
	public static void addToPriceTable(FarePrice price, FareFrame fareFrame) {
		
		ObjectFactory factory = new ObjectFactory();
		
		FareTable table = getOrCreatePriceTable(fareFrame);
		
		for ( JAXBElement<?> tabledPrice : table.getPrices().getFarePriceRefOrCellRefDummyOrFarePriceDummy()) {
			
			if (tabledPrice.getValue() instanceof FarePrice) {
				
				if ( ((FarePrice)tabledPrice.getValue()).getId().equals(price.getId()  )) return;
				
			}
			
		}
		
		table.getPrices().getFarePriceRefOrCellRefDummyOrFarePriceDummy().add(factory.createFarePrice(price));
		
	}
	
	public static void addToFareProductPriceTable(FareProductPrice price, FareFrame fareFrame) {
		
		ObjectFactory factory = new ObjectFactory();
		
		FareTable table = getOrCreateFareTable(fareFrame);
		
		for ( JAXBElement<?> tabledPrice : table.getPrices().getFarePriceRefOrCellRefDummyOrFarePriceDummy()) {
			
			if (tabledPrice.getValue() instanceof FareProductPrice) {
				
				if ( ((FareProductPrice)tabledPrice.getValue()).getId().equals(price.getId()  )) return;
				
			}
			
		}
		
		table.getPrices().getFarePriceRefOrCellRefDummyOrFarePriceDummy().add(factory.createFareProductPrice(price));
		
	}	
	
	public static FareTable  getOrCreateFareTable(FareFrame fareFrameNrt) {
		
		ObjectFactory factory = new ObjectFactory();
		
	    
		if (fareFrameNrt.getFareTables() != null
			&& !fareFrameNrt.getFareTables().getFareTableDummy().isEmpty()) {

			for ( JAXBElement<? extends GroupOfEntitiesVersionStructure> ft :  fareFrameNrt.getFareTables().getFareTableDummy()) {
				
				GroupOfEntitiesVersionStructure ge = ft.getValue();
				if (ge instanceof FareTable) {
					if (((FareTable)ge).getId().startsWith("FareTable")){
				    	return (FareTable) ge;
				    }
					
				}
			}
		}

		FareTable table = factory.createFareTable();
		table.setId("FareTable_" + fareFrameNrt.getId());
		table.setName(Osdm2MultiLanguageString.getMultiLanguageString("Fare Table"));
		table.setPrices(factory.createFarePricesRelStructure());
		fareFrameNrt.getFareTables().getFareTableDummy().add(factory.createFareTable(table));
		
		return table;
	}
	
	

	public static FareTable  getOrCreatePriceTable(FareFrame fareFrameNrt) {
		
		ObjectFactory factory = new ObjectFactory();
	    
		if (fareFrameNrt.getFareTables() != null 
			&&	!fareFrameNrt.getFareTables().getFareTableDummy().isEmpty()) {

			for ( JAXBElement<? extends GroupOfEntitiesVersionStructure> ft :  fareFrameNrt.getFareTables().getFareTableDummy()) {
				
				GroupOfEntitiesVersionStructure ge = ft.getValue();
				if (ge instanceof FareTable) {
					
				    if (((FareTable)ge).getId().startsWith("PriceTable")){
				    	return (FareTable) ge;
				    }
				}
			}
		}
		
		FareTable table = factory.createFareTable();
		table.setId("PriceTable_" + fareFrameNrt.getId());
		table.setName(Osdm2MultiLanguageString.getMultiLanguageString("Price Table"));
		table.setPrices(factory.createFarePricesRelStructure());
		fareFrameNrt.getFareTables().getFareTableDummy().add(factory.createFareTable(table));	
		
		return table;
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

		fpp.setCurrency(osdmPrice.getCurrencies().get(0).getCurrency().getIsoCode());
		
		BigDecimal value = new BigDecimal(Float.toString(osdmPrice.getCurrencies().get(0).getAmount()));		
		fpp.setAmount(value);
		fpp.setUnits(BigDecimal.valueOf(2L));
		
		PricingServiceRefStructure pricingServiceRef = new PricingServiceRefStructure();
		pricingServiceRef.setUri("OSDM");
		fpp.setPricingServiceRef(pricingServiceRef);	
		
	}	
	

	
}
