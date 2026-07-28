package osdm2netex;

import java.util.UUID;

import Gtm.AfterSalesRule;
import Gtm.CarrierConstraint;
import Gtm.Delivery;
import Gtm.FareElement;
import Gtm.FareStationSetDefinition;
import Gtm.FulfillmentType;
import Gtm.PassengerConstraint;
import Gtm.Price;
import Gtm.ReductionCard;
import Gtm.ReductionConstraint;
import Gtm.RegionalConstraint;
import Gtm.RequiredReductionCard;
import Gtm.SalesAvailabilityConstraint;
import Gtm.ServiceClass;
import Gtm.ServiceConstraint;
import Gtm.Text;
import Gtm.TotalPassengerCombinationConstraint;
import Gtm.TravelValidityConstraint;


public class IdFactory {
	
	
	public static String getId (FareStationSetDefinition stationSet) {
		if (stationSet == null) return "missing zone";
		return "zone_"+stationSet.getCarrier().getCode() + stationSet.getCode();
	}

	public static String getSiteFrameId(Delivery delivery) {
		if (delivery == null) return UUID.randomUUID().toString();
		return "site_frame_" + delivery.getId();
	}

	public static String getResourceFrameId(Delivery delivery) {
		if (delivery == null) return UUID.randomUUID().toString();
		return "resource_frame_" + delivery.getId();
	}

	public static String getFareFrameId(Delivery delivery) {
		if (delivery == null) return UUID.randomUUID().toString();
		return "fare_frame_" + delivery.getId();
	}

	public static String getOldFareFrameId(Delivery delivery) {
		if (delivery == null) return "";
		return "fare_frame_" + delivery.getReplacedDeliveryId();
	}
	public static String getFrameId(Delivery delivery) {
		if (delivery == null) return UUID.randomUUID().toString();
		return "delivery_" + delivery.getId();
	}

	public static String getFareProductId (FareElement osdmFare) {
		if (osdmFare == null || osdmFare.getId() == null) return UUID.randomUUID().toString();
		return "fare_product_"+ osdmFare.getId();
	}

	public static String getTravelDocumentTypeId (FulfillmentType ft) {
		return "fulfillment_method_" + ft.getLiteral();
	}
	
	public static String getFareStructureElementPassengerLimitsId(TotalPassengerCombinationConstraint pl) {
			return "passenger_limit_" + pl.getId();
	}

	public static String getFareStructureElementCarriersId(CarrierConstraint ca) {
		return "carriers_" + ca.getId();
	}

	public static String getFareStructureElementTravelValidityId(TravelValidityConstraint tv) {
		return "travel_validity_" + tv.getId();
	}

	public static String getFareStructureElementPassengersId(PassengerConstraint pc) {
		return "passengers_" + pc.getId();
	}

	public static String getFareStructureElementSalesAvailablilityId(SalesAvailabilityConstraint sa) {
		return "sales_availability_" + sa.getId();
	}
	

	public static String getFareStructureElementReductionId(ReductionConstraint rc) {
		return "reduction_"+ rc.getId();
	}

	public static String getFareStructureElementRegionId(RegionalConstraint rc) {
		return "region_"+ rc.getId();
	}
	
	public static String getServiceClassId(ServiceClass sc) {
		return UrnUtils.getClassUri(sc);
	}
	
	public static String getReductionCardId(RequiredReductionCard card) {
		if (card == null) return "missing code";
		if (card.getCard() != null) {
			return UrnUtils.getCardUri(card.getCard());
		} else {
			return "card_" + card.getName();
		}
	}

	public static String getReductionCardId(ReductionCard card) {
		if (card == null || card.getId() == null) return "missing code";
		
		if (card.getId().startsWith("UIC")) {
			return UrnUtils.getCardUri(card);
		}
		return "card_" + card.getId();
	}
	
	public static String getPriceId (Price price) {
		return "price_" + price.getId();
		
	}

	public static String getTextId(Text text) {
		return "text_" + text.getId();
	}

	public static String getIncludedCarriersId(CarrierConstraint cc) {
		return "carriers_" + cc.getId();
	}
	
	public static String getIncludedCarrierGroupId(CarrierConstraint cc) {
		return "carrier_group_" + cc.getIncludedCarrierGroup().getId();
	}

	public static String getSalesOfferPackageId(FareElement osdmFare) {
		return "sales_offer_package_" + osdmFare.getId();
	}

	public static String getFareStructureElementServiceConstraint(ServiceConstraint serviceConstraint) {
		// TODO Auto-generated method stub
		return "Services_" + serviceConstraint.getId();
	}

	public static String getAfterSalesRuleId(AfterSalesRule asr) {
		return "AfterSales_" + asr.getId();
	}

	public static String getRefundId(AfterSalesRule asr) {
		return "Refund_" + asr.getId();
	}

	public static String getExchangeId(AfterSalesRule asr) {
		return "Exchange_" + asr.getId();
	}

}
