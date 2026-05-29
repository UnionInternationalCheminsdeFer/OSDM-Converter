//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r NameOfClassPriceableObjectRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassPriceableObjectRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="AdditionalDriverOption"/>
 *     &lt;enumeration value="AmountOfPriceUnitProduct"/>
 *     &lt;enumeration value="Cancelling"/>
 *     &lt;enumeration value="CappedDiscountRight"/>
 *     &lt;enumeration value="CappingRule"/>
 *     &lt;enumeration value="ChargingPolicy"/>
 *     &lt;enumeration value="CommercialProfile"/>
 *     &lt;enumeration value="CompanionProfile"/>
 *     &lt;enumeration value="ControllableElement"/>
 *     &lt;enumeration value="CustomerPurchasePackage"/>
 *     &lt;enumeration value="CustomerPurchasePackageElement"/>
 *     &lt;enumeration value="DistanceMatrixElement"/>
 *     &lt;enumeration value="DynamicDistanceMatrixElement"/>
 *     &lt;enumeration value="EligibilityChangePolicy"/>
 *     &lt;enumeration value="EntitlementGiven"/>
 *     &lt;enumeration value="EntitlementProduct"/>
 *     &lt;enumeration value="EntitlementRequired"/>
 *     &lt;enumeration value="Exchanging"/>
 *     &lt;enumeration value="FareDemandFactor"/>
 *     &lt;enumeration value="FareInterval"/>
 *     &lt;enumeration value="FareQuotaFactor"/>
 *     &lt;enumeration value="FareStructureElement"/>
 *     &lt;enumeration value="FareStructureFactor"/>
 *     &lt;enumeration value="FareUnit"/>
 *     &lt;enumeration value="FrequencyOfUse"/>
 *     &lt;enumeration value="FulfilmentMethod"/>
 *     &lt;enumeration value="GeographicalInterval"/>
 *     &lt;enumeration value="GeographicalStructureFactor"/>
 *     &lt;enumeration value="GeographicalUnit"/>
 *     &lt;enumeration value="GroupTicket"/>
 *     &lt;enumeration value="Interchanging"/>
 *     &lt;enumeration value="LuggageAllowance"/>
 *     &lt;enumeration value="MinimumStay"/>
 *     &lt;enumeration value="ParkingChargeBand"/>
 *     &lt;enumeration value="PenaltyPolicy"/>
 *     &lt;enumeration value="PreassignedFareProduct"/>
 *     &lt;enumeration value="PurchaseWindow"/>
 *     &lt;enumeration value="QualityStructureFactor"/>
 *     &lt;enumeration value="Refunding"/>
 *     &lt;enumeration value="RentalOption"/>
 *     &lt;enumeration value="RentalPenaltyPolicy"/>
 *     &lt;enumeration value="Replacing"/>
 *     &lt;enumeration value="Reselling"/>
 *     &lt;enumeration value="Reserving"/>
 *     &lt;enumeration value="RoundTrip"/>
 *     &lt;enumeration value="Routing"/>
 *     &lt;enumeration value="SaleDiscountRight"/>
 *     &lt;enumeration value="SalesOfferPackage"/>
 *     &lt;enumeration value="SalesOfferPackageElement"/>
 *     &lt;enumeration value="SalesOfferPackageEntitlementGiven"/>
 *     &lt;enumeration value="SalesOfferPackageEntitlementRequired"/>
 *     &lt;enumeration value="SeriesConstraint"/>
 *     &lt;enumeration value="ServiceAccessRight"/>
 *     &lt;enumeration value="StepLimit"/>
 *     &lt;enumeration value="Subscribing"/>
 *     &lt;enumeration value="SupplementProduct"/>
 *     &lt;enumeration value="Suspending"/>
 *     &lt;enumeration value="ThirdPartyProduct"/>
 *     &lt;enumeration value="TimeInterval"/>
 *     &lt;enumeration value="TimeStructureFactor"/>
 *     &lt;enumeration value="TimeUnit"/>
 *     &lt;enumeration value="Transferability"/>
 *     &lt;enumeration value="UsageDiscountRight"/>
 *     &lt;enumeration value="UsageValidityPeriod"/>
 *     &lt;enumeration value="UserProfile"/>
 *     &lt;enumeration value="ValidableElement"/>
 *     &lt;enumeration value="VehiclePoolerProfile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassPriceableObjectRefStructureType")
@XmlEnum
public enum NameOfClassPriceableObjectRefStructureType {

    @XmlEnumValue("AdditionalDriverOption")
    ADDITIONAL_DRIVER_OPTION("AdditionalDriverOption"),
    @XmlEnumValue("AmountOfPriceUnitProduct")
    AMOUNT_OF_PRICE_UNIT_PRODUCT("AmountOfPriceUnitProduct"),
    @XmlEnumValue("Cancelling")
    CANCELLING("Cancelling"),
    @XmlEnumValue("CappedDiscountRight")
    CAPPED_DISCOUNT_RIGHT("CappedDiscountRight"),
    @XmlEnumValue("CappingRule")
    CAPPING_RULE("CappingRule"),
    @XmlEnumValue("ChargingPolicy")
    CHARGING_POLICY("ChargingPolicy"),
    @XmlEnumValue("CommercialProfile")
    COMMERCIAL_PROFILE("CommercialProfile"),
    @XmlEnumValue("CompanionProfile")
    COMPANION_PROFILE("CompanionProfile"),
    @XmlEnumValue("ControllableElement")
    CONTROLLABLE_ELEMENT("ControllableElement"),
    @XmlEnumValue("CustomerPurchasePackage")
    CUSTOMER_PURCHASE_PACKAGE("CustomerPurchasePackage"),
    @XmlEnumValue("CustomerPurchasePackageElement")
    CUSTOMER_PURCHASE_PACKAGE_ELEMENT("CustomerPurchasePackageElement"),
    @XmlEnumValue("DistanceMatrixElement")
    DISTANCE_MATRIX_ELEMENT("DistanceMatrixElement"),
    @XmlEnumValue("DynamicDistanceMatrixElement")
    DYNAMIC_DISTANCE_MATRIX_ELEMENT("DynamicDistanceMatrixElement"),
    @XmlEnumValue("EligibilityChangePolicy")
    ELIGIBILITY_CHANGE_POLICY("EligibilityChangePolicy"),
    @XmlEnumValue("EntitlementGiven")
    ENTITLEMENT_GIVEN("EntitlementGiven"),
    @XmlEnumValue("EntitlementProduct")
    ENTITLEMENT_PRODUCT("EntitlementProduct"),
    @XmlEnumValue("EntitlementRequired")
    ENTITLEMENT_REQUIRED("EntitlementRequired"),
    @XmlEnumValue("Exchanging")
    EXCHANGING("Exchanging"),
    @XmlEnumValue("FareDemandFactor")
    FARE_DEMAND_FACTOR("FareDemandFactor"),
    @XmlEnumValue("FareInterval")
    FARE_INTERVAL("FareInterval"),
    @XmlEnumValue("FareQuotaFactor")
    FARE_QUOTA_FACTOR("FareQuotaFactor"),
    @XmlEnumValue("FareStructureElement")
    FARE_STRUCTURE_ELEMENT("FareStructureElement"),
    @XmlEnumValue("FareStructureFactor")
    FARE_STRUCTURE_FACTOR("FareStructureFactor"),
    @XmlEnumValue("FareUnit")
    FARE_UNIT("FareUnit"),
    @XmlEnumValue("FrequencyOfUse")
    FREQUENCY_OF_USE("FrequencyOfUse"),
    @XmlEnumValue("FulfilmentMethod")
    FULFILMENT_METHOD("FulfilmentMethod"),
    @XmlEnumValue("GeographicalInterval")
    GEOGRAPHICAL_INTERVAL("GeographicalInterval"),
    @XmlEnumValue("GeographicalStructureFactor")
    GEOGRAPHICAL_STRUCTURE_FACTOR("GeographicalStructureFactor"),
    @XmlEnumValue("GeographicalUnit")
    GEOGRAPHICAL_UNIT("GeographicalUnit"),
    @XmlEnumValue("GroupTicket")
    GROUP_TICKET("GroupTicket"),
    @XmlEnumValue("Interchanging")
    INTERCHANGING("Interchanging"),
    @XmlEnumValue("LuggageAllowance")
    LUGGAGE_ALLOWANCE("LuggageAllowance"),
    @XmlEnumValue("MinimumStay")
    MINIMUM_STAY("MinimumStay"),
    @XmlEnumValue("ParkingChargeBand")
    PARKING_CHARGE_BAND("ParkingChargeBand"),
    @XmlEnumValue("PenaltyPolicy")
    PENALTY_POLICY("PenaltyPolicy"),
    @XmlEnumValue("PreassignedFareProduct")
    PREASSIGNED_FARE_PRODUCT("PreassignedFareProduct"),
    @XmlEnumValue("PurchaseWindow")
    PURCHASE_WINDOW("PurchaseWindow"),
    @XmlEnumValue("QualityStructureFactor")
    QUALITY_STRUCTURE_FACTOR("QualityStructureFactor"),
    @XmlEnumValue("Refunding")
    REFUNDING("Refunding"),
    @XmlEnumValue("RentalOption")
    RENTAL_OPTION("RentalOption"),
    @XmlEnumValue("RentalPenaltyPolicy")
    RENTAL_PENALTY_POLICY("RentalPenaltyPolicy"),
    @XmlEnumValue("Replacing")
    REPLACING("Replacing"),
    @XmlEnumValue("Reselling")
    RESELLING("Reselling"),
    @XmlEnumValue("Reserving")
    RESERVING("Reserving"),
    @XmlEnumValue("RoundTrip")
    ROUND_TRIP("RoundTrip"),
    @XmlEnumValue("Routing")
    ROUTING("Routing"),
    @XmlEnumValue("SaleDiscountRight")
    SALE_DISCOUNT_RIGHT("SaleDiscountRight"),
    @XmlEnumValue("SalesOfferPackage")
    SALES_OFFER_PACKAGE("SalesOfferPackage"),
    @XmlEnumValue("SalesOfferPackageElement")
    SALES_OFFER_PACKAGE_ELEMENT("SalesOfferPackageElement"),
    @XmlEnumValue("SalesOfferPackageEntitlementGiven")
    SALES_OFFER_PACKAGE_ENTITLEMENT_GIVEN("SalesOfferPackageEntitlementGiven"),
    @XmlEnumValue("SalesOfferPackageEntitlementRequired")
    SALES_OFFER_PACKAGE_ENTITLEMENT_REQUIRED("SalesOfferPackageEntitlementRequired"),
    @XmlEnumValue("SeriesConstraint")
    SERIES_CONSTRAINT("SeriesConstraint"),
    @XmlEnumValue("ServiceAccessRight")
    SERVICE_ACCESS_RIGHT("ServiceAccessRight"),
    @XmlEnumValue("StepLimit")
    STEP_LIMIT("StepLimit"),
    @XmlEnumValue("Subscribing")
    SUBSCRIBING("Subscribing"),
    @XmlEnumValue("SupplementProduct")
    SUPPLEMENT_PRODUCT("SupplementProduct"),
    @XmlEnumValue("Suspending")
    SUSPENDING("Suspending"),
    @XmlEnumValue("ThirdPartyProduct")
    THIRD_PARTY_PRODUCT("ThirdPartyProduct"),
    @XmlEnumValue("TimeInterval")
    TIME_INTERVAL("TimeInterval"),
    @XmlEnumValue("TimeStructureFactor")
    TIME_STRUCTURE_FACTOR("TimeStructureFactor"),
    @XmlEnumValue("TimeUnit")
    TIME_UNIT("TimeUnit"),
    @XmlEnumValue("Transferability")
    TRANSFERABILITY("Transferability"),
    @XmlEnumValue("UsageDiscountRight")
    USAGE_DISCOUNT_RIGHT("UsageDiscountRight"),
    @XmlEnumValue("UsageValidityPeriod")
    USAGE_VALIDITY_PERIOD("UsageValidityPeriod"),
    @XmlEnumValue("UserProfile")
    USER_PROFILE("UserProfile"),
    @XmlEnumValue("ValidableElement")
    VALIDABLE_ELEMENT("ValidableElement"),
    @XmlEnumValue("VehiclePoolerProfile")
    VEHICLE_POOLER_PROFILE("VehiclePoolerProfile");
    private final String value;

    NameOfClassPriceableObjectRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassPriceableObjectRefStructureType fromValue(String v) {
        for (NameOfClassPriceableObjectRefStructureType c: NameOfClassPriceableObjectRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
