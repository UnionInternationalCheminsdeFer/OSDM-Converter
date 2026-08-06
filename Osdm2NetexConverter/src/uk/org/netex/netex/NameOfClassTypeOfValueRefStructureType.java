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
 * <p>Java-Klasse f�r NameOfClassTypeOfValueRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassTypeOfValueRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="AcceptedDriverPermit"/>
 *     &lt;enumeration value="AlternativeModeOfOperation"/>
 *     &lt;enumeration value="Branding"/>
 *     &lt;enumeration value="ChargingMoment"/>
 *     &lt;enumeration value="ClassOfUse"/>
 *     &lt;enumeration value="ClassificationDescriptor"/>
 *     &lt;enumeration value="CustomerAccountStatus"/>
 *     &lt;enumeration value="DataSource"/>
 *     &lt;enumeration value="Direction"/>
 *     &lt;enumeration value="DiscountingRule"/>
 *     &lt;enumeration value="DistributionChannel"/>
 *     &lt;enumeration value="LimitingRule"/>
 *     &lt;enumeration value="OpenTransportMode"/>
 *     &lt;enumeration value="ParkingBayStatus"/>
 *     &lt;enumeration value="PersonalModeOfOperation"/>
 *     &lt;enumeration value="PointOfInterestClassification"/>
 *     &lt;enumeration value="PriceUnit"/>
 *     &lt;enumeration value="PricingRule"/>
 *     &lt;enumeration value="PurposeOfEquipmentProfile"/>
 *     &lt;enumeration value="PurposeOfGrouping"/>
 *     &lt;enumeration value="PurposeOfJourneyPartition"/>
 *     &lt;enumeration value="Submode"/>
 *     &lt;enumeration value="TimingAlgorithmType"/>
 *     &lt;enumeration value="TypeOfAccessRightAssignment"/>
 *     &lt;enumeration value="TypeOfActivation"/>
 *     &lt;enumeration value="TypeOfBatteryChemistry"/>
 *     &lt;enumeration value="TypeOfCodespaceAssignment"/>
 *     &lt;enumeration value="TypeOfConcession"/>
 *     &lt;enumeration value="TypeOfCongestion"/>
 *     &lt;enumeration value="TypeOfCustomerAccount"/>
 *     &lt;enumeration value="TypeOfDeckEntrance"/>
 *     &lt;enumeration value="TypeOfDeckEntranceUsage"/>
 *     &lt;enumeration value="TypeOfDeckSpace"/>
 *     &lt;enumeration value="TypeOfDeliveryVariant"/>
 *     &lt;enumeration value="TypeOfDriverPermit"/>
 *     &lt;enumeration value="TypeOfEntity"/>
 *     &lt;enumeration value="TypeOfEquipment"/>
 *     &lt;enumeration value="TypeOfFacility"/>
 *     &lt;enumeration value="TypeOfFareContract"/>
 *     &lt;enumeration value="TypeOfFareContractEntry"/>
 *     &lt;enumeration value="TypeOfFareProduct"/>
 *     &lt;enumeration value="TypeOfFareStructureElement"/>
 *     &lt;enumeration value="TypeOfFareStructureFactor"/>
 *     &lt;enumeration value="TypeOfFareTable"/>
 *     &lt;enumeration value="TypeOfFeature"/>
 *     &lt;enumeration value="TypeOfFleet"/>
 *     &lt;enumeration value="TypeOfFlexibleService"/>
 *     &lt;enumeration value="TypeOfFrame"/>
 *     &lt;enumeration value="TypeOfJourneyPattern"/>
 *     &lt;enumeration value="TypeOfLine"/>
 *     &lt;enumeration value="TypeOfLink"/>
 *     &lt;enumeration value="TypeOfLinkSequence"/>
 *     &lt;enumeration value="TypeOfLocatableSpot"/>
 *     &lt;enumeration value="TypeOfMachineReadability"/>
 *     &lt;enumeration value="TypeOfMediumAccessDevice"/>
 *     &lt;enumeration value="TypeOfMobilityService"/>
 *     &lt;enumeration value="TypeOfModeOfOperation"/>
 *     &lt;enumeration value="TypeOfNotice"/>
 *     &lt;enumeration value="TypeOfOperation"/>
 *     &lt;enumeration value="TypeOfOrganisation"/>
 *     &lt;enumeration value="TypeOfOrganisationPart"/>
 *     &lt;enumeration value="TypeOfParking"/>
 *     &lt;enumeration value="TypeOfPassengerInformationEquipment"/>
 *     &lt;enumeration value="TypeOfPaymentMethod"/>
 *     &lt;enumeration value="TypeOfPlace"/>
 *     &lt;enumeration value="TypeOfPlug"/>
 *     &lt;enumeration value="TypeOfPoint"/>
 *     &lt;enumeration value="TypeOfPricingRule"/>
 *     &lt;enumeration value="TypeOfProductCategory"/>
 *     &lt;enumeration value="TypeOfProjection"/>
 *     &lt;enumeration value="TypeOfProof"/>
 *     &lt;enumeration value="TypeOfResponsibilityRole"/>
 *     &lt;enumeration value="TypeOfRetailDevice"/>
 *     &lt;enumeration value="TypeOfRollingStock"/>
 *     &lt;enumeration value="TypeOfSalesOfferPackage"/>
 *     &lt;enumeration value="TypeOfSecurityList"/>
 *     &lt;enumeration value="TypeOfService"/>
 *     &lt;enumeration value="TypeOfServiceFeature"/>
 *     &lt;enumeration value="TypeOfTariff"/>
 *     &lt;enumeration value="TypeOfTimeDemandType"/>
 *     &lt;enumeration value="TypeOfTransfer"/>
 *     &lt;enumeration value="TypeOfTravelDocument"/>
 *     &lt;enumeration value="TypeOfUsageParameter"/>
 *     &lt;enumeration value="TypeOfValidity"/>
 *     &lt;enumeration value="TypeOfVersion"/>
 *     &lt;enumeration value="TypeOfWheelchair"/>
 *     &lt;enumeration value="TypeOfZone"/>
 *     &lt;enumeration value="VehiclePooling"/>
 *     &lt;enumeration value="VehicleRental"/>
 *     &lt;enumeration value="VehicleSharing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassTypeOfValueRefStructureType")
@XmlEnum
public enum NameOfClassTypeOfValueRefStructureType {

    @XmlEnumValue("AcceptedDriverPermit")
    ACCEPTED_DRIVER_PERMIT("AcceptedDriverPermit"),
    @XmlEnumValue("AlternativeModeOfOperation")
    ALTERNATIVE_MODE_OF_OPERATION("AlternativeModeOfOperation"),
    @XmlEnumValue("Branding")
    BRANDING("Branding"),
    @XmlEnumValue("ChargingMoment")
    CHARGING_MOMENT("ChargingMoment"),
    @XmlEnumValue("ClassOfUse")
    CLASS_OF_USE("ClassOfUse"),
    @XmlEnumValue("ClassificationDescriptor")
    CLASSIFICATION_DESCRIPTOR("ClassificationDescriptor"),
    @XmlEnumValue("CustomerAccountStatus")
    CUSTOMER_ACCOUNT_STATUS("CustomerAccountStatus"),
    @XmlEnumValue("DataSource")
    DATA_SOURCE("DataSource"),
    @XmlEnumValue("Direction")
    DIRECTION("Direction"),
    @XmlEnumValue("DiscountingRule")
    DISCOUNTING_RULE("DiscountingRule"),
    @XmlEnumValue("DistributionChannel")
    DISTRIBUTION_CHANNEL("DistributionChannel"),
    @XmlEnumValue("LimitingRule")
    LIMITING_RULE("LimitingRule"),
    @XmlEnumValue("OpenTransportMode")
    OPEN_TRANSPORT_MODE("OpenTransportMode"),
    @XmlEnumValue("ParkingBayStatus")
    PARKING_BAY_STATUS("ParkingBayStatus"),
    @XmlEnumValue("PersonalModeOfOperation")
    PERSONAL_MODE_OF_OPERATION("PersonalModeOfOperation"),
    @XmlEnumValue("PointOfInterestClassification")
    POINT_OF_INTEREST_CLASSIFICATION("PointOfInterestClassification"),
    @XmlEnumValue("PriceUnit")
    PRICE_UNIT("PriceUnit"),
    @XmlEnumValue("PricingRule")
    PRICING_RULE("PricingRule"),
    @XmlEnumValue("PurposeOfEquipmentProfile")
    PURPOSE_OF_EQUIPMENT_PROFILE("PurposeOfEquipmentProfile"),
    @XmlEnumValue("PurposeOfGrouping")
    PURPOSE_OF_GROUPING("PurposeOfGrouping"),
    @XmlEnumValue("PurposeOfJourneyPartition")
    PURPOSE_OF_JOURNEY_PARTITION("PurposeOfJourneyPartition"),
    @XmlEnumValue("Submode")
    SUBMODE("Submode"),
    @XmlEnumValue("TimingAlgorithmType")
    TIMING_ALGORITHM_TYPE("TimingAlgorithmType"),
    @XmlEnumValue("TypeOfAccessRightAssignment")
    TYPE_OF_ACCESS_RIGHT_ASSIGNMENT("TypeOfAccessRightAssignment"),
    @XmlEnumValue("TypeOfActivation")
    TYPE_OF_ACTIVATION("TypeOfActivation"),
    @XmlEnumValue("TypeOfBatteryChemistry")
    TYPE_OF_BATTERY_CHEMISTRY("TypeOfBatteryChemistry"),
    @XmlEnumValue("TypeOfCodespaceAssignment")
    TYPE_OF_CODESPACE_ASSIGNMENT("TypeOfCodespaceAssignment"),
    @XmlEnumValue("TypeOfConcession")
    TYPE_OF_CONCESSION("TypeOfConcession"),
    @XmlEnumValue("TypeOfCongestion")
    TYPE_OF_CONGESTION("TypeOfCongestion"),
    @XmlEnumValue("TypeOfCustomerAccount")
    TYPE_OF_CUSTOMER_ACCOUNT("TypeOfCustomerAccount"),
    @XmlEnumValue("TypeOfDeckEntrance")
    TYPE_OF_DECK_ENTRANCE("TypeOfDeckEntrance"),
    @XmlEnumValue("TypeOfDeckEntranceUsage")
    TYPE_OF_DECK_ENTRANCE_USAGE("TypeOfDeckEntranceUsage"),
    @XmlEnumValue("TypeOfDeckSpace")
    TYPE_OF_DECK_SPACE("TypeOfDeckSpace"),
    @XmlEnumValue("TypeOfDeliveryVariant")
    TYPE_OF_DELIVERY_VARIANT("TypeOfDeliveryVariant"),
    @XmlEnumValue("TypeOfDriverPermit")
    TYPE_OF_DRIVER_PERMIT("TypeOfDriverPermit"),
    @XmlEnumValue("TypeOfEntity")
    TYPE_OF_ENTITY("TypeOfEntity"),
    @XmlEnumValue("TypeOfEquipment")
    TYPE_OF_EQUIPMENT("TypeOfEquipment"),
    @XmlEnumValue("TypeOfFacility")
    TYPE_OF_FACILITY("TypeOfFacility"),
    @XmlEnumValue("TypeOfFareContract")
    TYPE_OF_FARE_CONTRACT("TypeOfFareContract"),
    @XmlEnumValue("TypeOfFareContractEntry")
    TYPE_OF_FARE_CONTRACT_ENTRY("TypeOfFareContractEntry"),
    @XmlEnumValue("TypeOfFareProduct")
    TYPE_OF_FARE_PRODUCT("TypeOfFareProduct"),
    @XmlEnumValue("TypeOfFareStructureElement")
    TYPE_OF_FARE_STRUCTURE_ELEMENT("TypeOfFareStructureElement"),
    @XmlEnumValue("TypeOfFareStructureFactor")
    TYPE_OF_FARE_STRUCTURE_FACTOR("TypeOfFareStructureFactor"),
    @XmlEnumValue("TypeOfFareTable")
    TYPE_OF_FARE_TABLE("TypeOfFareTable"),
    @XmlEnumValue("TypeOfFeature")
    TYPE_OF_FEATURE("TypeOfFeature"),
    @XmlEnumValue("TypeOfFleet")
    TYPE_OF_FLEET("TypeOfFleet"),
    @XmlEnumValue("TypeOfFlexibleService")
    TYPE_OF_FLEXIBLE_SERVICE("TypeOfFlexibleService"),
    @XmlEnumValue("TypeOfFrame")
    TYPE_OF_FRAME("TypeOfFrame"),
    @XmlEnumValue("TypeOfJourneyPattern")
    TYPE_OF_JOURNEY_PATTERN("TypeOfJourneyPattern"),
    @XmlEnumValue("TypeOfLine")
    TYPE_OF_LINE("TypeOfLine"),
    @XmlEnumValue("TypeOfLink")
    TYPE_OF_LINK("TypeOfLink"),
    @XmlEnumValue("TypeOfLinkSequence")
    TYPE_OF_LINK_SEQUENCE("TypeOfLinkSequence"),
    @XmlEnumValue("TypeOfLocatableSpot")
    TYPE_OF_LOCATABLE_SPOT("TypeOfLocatableSpot"),
    @XmlEnumValue("TypeOfMachineReadability")
    TYPE_OF_MACHINE_READABILITY("TypeOfMachineReadability"),
    @XmlEnumValue("TypeOfMediumAccessDevice")
    TYPE_OF_MEDIUM_ACCESS_DEVICE("TypeOfMediumAccessDevice"),
    @XmlEnumValue("TypeOfMobilityService")
    TYPE_OF_MOBILITY_SERVICE("TypeOfMobilityService"),
    @XmlEnumValue("TypeOfModeOfOperation")
    TYPE_OF_MODE_OF_OPERATION("TypeOfModeOfOperation"),
    @XmlEnumValue("TypeOfNotice")
    TYPE_OF_NOTICE("TypeOfNotice"),
    @XmlEnumValue("TypeOfOperation")
    TYPE_OF_OPERATION("TypeOfOperation"),
    @XmlEnumValue("TypeOfOrganisation")
    TYPE_OF_ORGANISATION("TypeOfOrganisation"),
    @XmlEnumValue("TypeOfOrganisationPart")
    TYPE_OF_ORGANISATION_PART("TypeOfOrganisationPart"),
    @XmlEnumValue("TypeOfParking")
    TYPE_OF_PARKING("TypeOfParking"),
    @XmlEnumValue("TypeOfPassengerInformationEquipment")
    TYPE_OF_PASSENGER_INFORMATION_EQUIPMENT("TypeOfPassengerInformationEquipment"),
    @XmlEnumValue("TypeOfPaymentMethod")
    TYPE_OF_PAYMENT_METHOD("TypeOfPaymentMethod"),
    @XmlEnumValue("TypeOfPlace")
    TYPE_OF_PLACE("TypeOfPlace"),
    @XmlEnumValue("TypeOfPlug")
    TYPE_OF_PLUG("TypeOfPlug"),
    @XmlEnumValue("TypeOfPoint")
    TYPE_OF_POINT("TypeOfPoint"),
    @XmlEnumValue("TypeOfPricingRule")
    TYPE_OF_PRICING_RULE("TypeOfPricingRule"),
    @XmlEnumValue("TypeOfProductCategory")
    TYPE_OF_PRODUCT_CATEGORY("TypeOfProductCategory"),
    @XmlEnumValue("TypeOfProjection")
    TYPE_OF_PROJECTION("TypeOfProjection"),
    @XmlEnumValue("TypeOfProof")
    TYPE_OF_PROOF("TypeOfProof"),
    @XmlEnumValue("TypeOfResponsibilityRole")
    TYPE_OF_RESPONSIBILITY_ROLE("TypeOfResponsibilityRole"),
    @XmlEnumValue("TypeOfRetailDevice")
    TYPE_OF_RETAIL_DEVICE("TypeOfRetailDevice"),
    @XmlEnumValue("TypeOfRollingStock")
    TYPE_OF_ROLLING_STOCK("TypeOfRollingStock"),
    @XmlEnumValue("TypeOfSalesOfferPackage")
    TYPE_OF_SALES_OFFER_PACKAGE("TypeOfSalesOfferPackage"),
    @XmlEnumValue("TypeOfSecurityList")
    TYPE_OF_SECURITY_LIST("TypeOfSecurityList"),
    @XmlEnumValue("TypeOfService")
    TYPE_OF_SERVICE("TypeOfService"),
    @XmlEnumValue("TypeOfServiceFeature")
    TYPE_OF_SERVICE_FEATURE("TypeOfServiceFeature"),
    @XmlEnumValue("TypeOfTariff")
    TYPE_OF_TARIFF("TypeOfTariff"),
    @XmlEnumValue("TypeOfTimeDemandType")
    TYPE_OF_TIME_DEMAND_TYPE("TypeOfTimeDemandType"),
    @XmlEnumValue("TypeOfTransfer")
    TYPE_OF_TRANSFER("TypeOfTransfer"),
    @XmlEnumValue("TypeOfTravelDocument")
    TYPE_OF_TRAVEL_DOCUMENT("TypeOfTravelDocument"),
    @XmlEnumValue("TypeOfUsageParameter")
    TYPE_OF_USAGE_PARAMETER("TypeOfUsageParameter"),
    @XmlEnumValue("TypeOfValidity")
    TYPE_OF_VALIDITY("TypeOfValidity"),
    @XmlEnumValue("TypeOfVersion")
    TYPE_OF_VERSION("TypeOfVersion"),
    @XmlEnumValue("TypeOfWheelchair")
    TYPE_OF_WHEELCHAIR("TypeOfWheelchair"),
    @XmlEnumValue("TypeOfZone")
    TYPE_OF_ZONE("TypeOfZone"),
    @XmlEnumValue("VehiclePooling")
    VEHICLE_POOLING("VehiclePooling"),
    @XmlEnumValue("VehicleRental")
    VEHICLE_RENTAL("VehicleRental"),
    @XmlEnumValue("VehicleSharing")
    VEHICLE_SHARING("VehicleSharing");
    private final String value;

    NameOfClassTypeOfValueRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassTypeOfValueRefStructureType fromValue(String v) {
        for (NameOfClassTypeOfValueRefStructureType c: NameOfClassTypeOfValueRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
