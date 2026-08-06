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
 * <p>Java-Klasse f�r NameOfClassUsageParameterRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassUsageParameterRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassPriceableObjectRefStructureType">
 *     &lt;enumeration value="AdditionalDriverOption"/>
 *     &lt;enumeration value="Cancelling"/>
 *     &lt;enumeration value="ChargingPolicy"/>
 *     &lt;enumeration value="CommercialProfile"/>
 *     &lt;enumeration value="CompanionProfile"/>
 *     &lt;enumeration value="EligibilityChangePolicy"/>
 *     &lt;enumeration value="EntitlementGiven"/>
 *     &lt;enumeration value="EntitlementRequired"/>
 *     &lt;enumeration value="Exchanging"/>
 *     &lt;enumeration value="FrequencyOfUse"/>
 *     &lt;enumeration value="GroupTicket"/>
 *     &lt;enumeration value="Interchanging"/>
 *     &lt;enumeration value="LuggageAllowance"/>
 *     &lt;enumeration value="MinimumStay"/>
 *     &lt;enumeration value="PenaltyPolicy"/>
 *     &lt;enumeration value="PurchaseWindow"/>
 *     &lt;enumeration value="Refunding"/>
 *     &lt;enumeration value="RentalOption"/>
 *     &lt;enumeration value="RentalPenaltyPolicy"/>
 *     &lt;enumeration value="Replacing"/>
 *     &lt;enumeration value="Reselling"/>
 *     &lt;enumeration value="Reserving"/>
 *     &lt;enumeration value="RoundTrip"/>
 *     &lt;enumeration value="Routing"/>
 *     &lt;enumeration value="SalesOfferPackageEntitlementGiven"/>
 *     &lt;enumeration value="SalesOfferPackageEntitlementRequired"/>
 *     &lt;enumeration value="StepLimit"/>
 *     &lt;enumeration value="Subscribing"/>
 *     &lt;enumeration value="Suspending"/>
 *     &lt;enumeration value="Transferability"/>
 *     &lt;enumeration value="UsageValidityPeriod"/>
 *     &lt;enumeration value="UserProfile"/>
 *     &lt;enumeration value="VehiclePoolerProfile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassUsageParameterRefStructureType")
@XmlEnum(NameOfClassPriceableObjectRefStructureType.class)
public enum NameOfClassUsageParameterRefStructureType {

    @XmlEnumValue("AdditionalDriverOption")
    ADDITIONAL_DRIVER_OPTION(NameOfClassPriceableObjectRefStructureType.ADDITIONAL_DRIVER_OPTION),
    @XmlEnumValue("Cancelling")
    CANCELLING(NameOfClassPriceableObjectRefStructureType.CANCELLING),
    @XmlEnumValue("ChargingPolicy")
    CHARGING_POLICY(NameOfClassPriceableObjectRefStructureType.CHARGING_POLICY),
    @XmlEnumValue("CommercialProfile")
    COMMERCIAL_PROFILE(NameOfClassPriceableObjectRefStructureType.COMMERCIAL_PROFILE),
    @XmlEnumValue("CompanionProfile")
    COMPANION_PROFILE(NameOfClassPriceableObjectRefStructureType.COMPANION_PROFILE),
    @XmlEnumValue("EligibilityChangePolicy")
    ELIGIBILITY_CHANGE_POLICY(NameOfClassPriceableObjectRefStructureType.ELIGIBILITY_CHANGE_POLICY),
    @XmlEnumValue("EntitlementGiven")
    ENTITLEMENT_GIVEN(NameOfClassPriceableObjectRefStructureType.ENTITLEMENT_GIVEN),
    @XmlEnumValue("EntitlementRequired")
    ENTITLEMENT_REQUIRED(NameOfClassPriceableObjectRefStructureType.ENTITLEMENT_REQUIRED),
    @XmlEnumValue("Exchanging")
    EXCHANGING(NameOfClassPriceableObjectRefStructureType.EXCHANGING),
    @XmlEnumValue("FrequencyOfUse")
    FREQUENCY_OF_USE(NameOfClassPriceableObjectRefStructureType.FREQUENCY_OF_USE),
    @XmlEnumValue("GroupTicket")
    GROUP_TICKET(NameOfClassPriceableObjectRefStructureType.GROUP_TICKET),
    @XmlEnumValue("Interchanging")
    INTERCHANGING(NameOfClassPriceableObjectRefStructureType.INTERCHANGING),
    @XmlEnumValue("LuggageAllowance")
    LUGGAGE_ALLOWANCE(NameOfClassPriceableObjectRefStructureType.LUGGAGE_ALLOWANCE),
    @XmlEnumValue("MinimumStay")
    MINIMUM_STAY(NameOfClassPriceableObjectRefStructureType.MINIMUM_STAY),
    @XmlEnumValue("PenaltyPolicy")
    PENALTY_POLICY(NameOfClassPriceableObjectRefStructureType.PENALTY_POLICY),
    @XmlEnumValue("PurchaseWindow")
    PURCHASE_WINDOW(NameOfClassPriceableObjectRefStructureType.PURCHASE_WINDOW),
    @XmlEnumValue("Refunding")
    REFUNDING(NameOfClassPriceableObjectRefStructureType.REFUNDING),
    @XmlEnumValue("RentalOption")
    RENTAL_OPTION(NameOfClassPriceableObjectRefStructureType.RENTAL_OPTION),
    @XmlEnumValue("RentalPenaltyPolicy")
    RENTAL_PENALTY_POLICY(NameOfClassPriceableObjectRefStructureType.RENTAL_PENALTY_POLICY),
    @XmlEnumValue("Replacing")
    REPLACING(NameOfClassPriceableObjectRefStructureType.REPLACING),
    @XmlEnumValue("Reselling")
    RESELLING(NameOfClassPriceableObjectRefStructureType.RESELLING),
    @XmlEnumValue("Reserving")
    RESERVING(NameOfClassPriceableObjectRefStructureType.RESERVING),
    @XmlEnumValue("RoundTrip")
    ROUND_TRIP(NameOfClassPriceableObjectRefStructureType.ROUND_TRIP),
    @XmlEnumValue("Routing")
    ROUTING(NameOfClassPriceableObjectRefStructureType.ROUTING),
    @XmlEnumValue("SalesOfferPackageEntitlementGiven")
    SALES_OFFER_PACKAGE_ENTITLEMENT_GIVEN(NameOfClassPriceableObjectRefStructureType.SALES_OFFER_PACKAGE_ENTITLEMENT_GIVEN),
    @XmlEnumValue("SalesOfferPackageEntitlementRequired")
    SALES_OFFER_PACKAGE_ENTITLEMENT_REQUIRED(NameOfClassPriceableObjectRefStructureType.SALES_OFFER_PACKAGE_ENTITLEMENT_REQUIRED),
    @XmlEnumValue("StepLimit")
    STEP_LIMIT(NameOfClassPriceableObjectRefStructureType.STEP_LIMIT),
    @XmlEnumValue("Subscribing")
    SUBSCRIBING(NameOfClassPriceableObjectRefStructureType.SUBSCRIBING),
    @XmlEnumValue("Suspending")
    SUSPENDING(NameOfClassPriceableObjectRefStructureType.SUSPENDING),
    @XmlEnumValue("Transferability")
    TRANSFERABILITY(NameOfClassPriceableObjectRefStructureType.TRANSFERABILITY),
    @XmlEnumValue("UsageValidityPeriod")
    USAGE_VALIDITY_PERIOD(NameOfClassPriceableObjectRefStructureType.USAGE_VALIDITY_PERIOD),
    @XmlEnumValue("UserProfile")
    USER_PROFILE(NameOfClassPriceableObjectRefStructureType.USER_PROFILE),
    @XmlEnumValue("VehiclePoolerProfile")
    VEHICLE_POOLER_PROFILE(NameOfClassPriceableObjectRefStructureType.VEHICLE_POOLER_PROFILE);
    private final NameOfClassPriceableObjectRefStructureType value;

    NameOfClassUsageParameterRefStructureType(NameOfClassPriceableObjectRefStructureType v) {
        value = v;
    }

    public NameOfClassPriceableObjectRefStructureType value() {
        return value;
    }

    public static NameOfClassUsageParameterRefStructureType fromValue(NameOfClassPriceableObjectRefStructureType v) {
        for (NameOfClassUsageParameterRefStructureType c: NameOfClassUsageParameterRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
