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
 * <p>Java-Klasse f�r NameOfClassAssignmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassAssignmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="AccessRightParameterAssignment"/>
 *     &lt;enumeration value="ActivationAssignment"/>
 *     &lt;enumeration value="CheckConstraint"/>
 *     &lt;enumeration value="CheckConstraintDelay"/>
 *     &lt;enumeration value="CheckConstraintThroughput"/>
 *     &lt;enumeration value="CustomerPurchaseParameterAssignment"/>
 *     &lt;enumeration value="DayTypeAssignment"/>
 *     &lt;enumeration value="DeckEntranceAssignment"/>
 *     &lt;enumeration value="DeckPlanAssignment"/>
 *     &lt;enumeration value="DisplayAssignment"/>
 *     &lt;enumeration value="DistributionAssignment"/>
 *     &lt;enumeration value="DynamicStopAssignment"/>
 *     &lt;enumeration value="DynamicVehicleMeetingPointAssignment"/>
 *     &lt;enumeration value="FlexibleStopAssignment"/>
 *     &lt;enumeration value="GenericParameterAssignment"/>
 *     &lt;enumeration value="GenericParameterAssignmentInContext"/>
 *     &lt;enumeration value="JourneyAccounting"/>
 *     &lt;enumeration value="MeetingRestriction"/>
 *     &lt;enumeration value="NavigationPathAssignment"/>
 *     &lt;enumeration value="NoticeAssignment"/>
 *     &lt;enumeration value="OvertakingPossibility"/>
 *     &lt;enumeration value="PassengerBoardingPositionAssignment"/>
 *     &lt;enumeration value="PassengerStopAssignment"/>
 *     &lt;enumeration value="RechargingPointAssignment"/>
 *     &lt;enumeration value="RestrictedManoeuvre"/>
 *     &lt;enumeration value="SalesNoticeAssignment"/>
 *     &lt;enumeration value="SalesOfferPackageSubstitution"/>
 *     &lt;enumeration value="ServiceExclusion"/>
 *     &lt;enumeration value="SpecificParameterAssignment"/>
 *     &lt;enumeration value="TaxiServicePlaceAssignment"/>
 *     &lt;enumeration value="TimeDemandTypeAssignment"/>
 *     &lt;enumeration value="TrainComponentLabelAssignment"/>
 *     &lt;enumeration value="TrainComponentStopAssignment"/>
 *     &lt;enumeration value="TrainStopAssignment"/>
 *     &lt;enumeration value="TransferRestriction"/>
 *     &lt;enumeration value="ValidityParameterAssignment"/>
 *     &lt;enumeration value="VehicleAccessCredentialsAssignment"/>
 *     &lt;enumeration value="VehicleJourneyStopAssignment"/>
 *     &lt;enumeration value="VehicleMeetingPointAssignment"/>
 *     &lt;enumeration value="VehiclePoolingPlaceAssignment"/>
 *     &lt;enumeration value="VehicleServicePlaceAssignment"/>
 *     &lt;enumeration value="VehicleSharingPlaceAssignment"/>
 *     &lt;enumeration value="VehicleTypeAtPoint"/>
 *     &lt;enumeration value="VehicleTypeStopAssignment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassAssignmentRefStructureType")
@XmlEnum
public enum NameOfClassAssignmentRefStructureType {

    @XmlEnumValue("AccessRightParameterAssignment")
    ACCESS_RIGHT_PARAMETER_ASSIGNMENT("AccessRightParameterAssignment"),
    @XmlEnumValue("ActivationAssignment")
    ACTIVATION_ASSIGNMENT("ActivationAssignment"),
    @XmlEnumValue("CheckConstraint")
    CHECK_CONSTRAINT("CheckConstraint"),
    @XmlEnumValue("CheckConstraintDelay")
    CHECK_CONSTRAINT_DELAY("CheckConstraintDelay"),
    @XmlEnumValue("CheckConstraintThroughput")
    CHECK_CONSTRAINT_THROUGHPUT("CheckConstraintThroughput"),
    @XmlEnumValue("CustomerPurchaseParameterAssignment")
    CUSTOMER_PURCHASE_PARAMETER_ASSIGNMENT("CustomerPurchaseParameterAssignment"),
    @XmlEnumValue("DayTypeAssignment")
    DAY_TYPE_ASSIGNMENT("DayTypeAssignment"),
    @XmlEnumValue("DeckEntranceAssignment")
    DECK_ENTRANCE_ASSIGNMENT("DeckEntranceAssignment"),
    @XmlEnumValue("DeckPlanAssignment")
    DECK_PLAN_ASSIGNMENT("DeckPlanAssignment"),
    @XmlEnumValue("DisplayAssignment")
    DISPLAY_ASSIGNMENT("DisplayAssignment"),
    @XmlEnumValue("DistributionAssignment")
    DISTRIBUTION_ASSIGNMENT("DistributionAssignment"),
    @XmlEnumValue("DynamicStopAssignment")
    DYNAMIC_STOP_ASSIGNMENT("DynamicStopAssignment"),
    @XmlEnumValue("DynamicVehicleMeetingPointAssignment")
    DYNAMIC_VEHICLE_MEETING_POINT_ASSIGNMENT("DynamicVehicleMeetingPointAssignment"),
    @XmlEnumValue("FlexibleStopAssignment")
    FLEXIBLE_STOP_ASSIGNMENT("FlexibleStopAssignment"),
    @XmlEnumValue("GenericParameterAssignment")
    GENERIC_PARAMETER_ASSIGNMENT("GenericParameterAssignment"),
    @XmlEnumValue("GenericParameterAssignmentInContext")
    GENERIC_PARAMETER_ASSIGNMENT_IN_CONTEXT("GenericParameterAssignmentInContext"),
    @XmlEnumValue("JourneyAccounting")
    JOURNEY_ACCOUNTING("JourneyAccounting"),
    @XmlEnumValue("MeetingRestriction")
    MEETING_RESTRICTION("MeetingRestriction"),
    @XmlEnumValue("NavigationPathAssignment")
    NAVIGATION_PATH_ASSIGNMENT("NavigationPathAssignment"),
    @XmlEnumValue("NoticeAssignment")
    NOTICE_ASSIGNMENT("NoticeAssignment"),
    @XmlEnumValue("OvertakingPossibility")
    OVERTAKING_POSSIBILITY("OvertakingPossibility"),
    @XmlEnumValue("PassengerBoardingPositionAssignment")
    PASSENGER_BOARDING_POSITION_ASSIGNMENT("PassengerBoardingPositionAssignment"),
    @XmlEnumValue("PassengerStopAssignment")
    PASSENGER_STOP_ASSIGNMENT("PassengerStopAssignment"),
    @XmlEnumValue("RechargingPointAssignment")
    RECHARGING_POINT_ASSIGNMENT("RechargingPointAssignment"),
    @XmlEnumValue("RestrictedManoeuvre")
    RESTRICTED_MANOEUVRE("RestrictedManoeuvre"),
    @XmlEnumValue("SalesNoticeAssignment")
    SALES_NOTICE_ASSIGNMENT("SalesNoticeAssignment"),
    @XmlEnumValue("SalesOfferPackageSubstitution")
    SALES_OFFER_PACKAGE_SUBSTITUTION("SalesOfferPackageSubstitution"),
    @XmlEnumValue("ServiceExclusion")
    SERVICE_EXCLUSION("ServiceExclusion"),
    @XmlEnumValue("SpecificParameterAssignment")
    SPECIFIC_PARAMETER_ASSIGNMENT("SpecificParameterAssignment"),
    @XmlEnumValue("TaxiServicePlaceAssignment")
    TAXI_SERVICE_PLACE_ASSIGNMENT("TaxiServicePlaceAssignment"),
    @XmlEnumValue("TimeDemandTypeAssignment")
    TIME_DEMAND_TYPE_ASSIGNMENT("TimeDemandTypeAssignment"),
    @XmlEnumValue("TrainComponentLabelAssignment")
    TRAIN_COMPONENT_LABEL_ASSIGNMENT("TrainComponentLabelAssignment"),
    @XmlEnumValue("TrainComponentStopAssignment")
    TRAIN_COMPONENT_STOP_ASSIGNMENT("TrainComponentStopAssignment"),
    @XmlEnumValue("TrainStopAssignment")
    TRAIN_STOP_ASSIGNMENT("TrainStopAssignment"),
    @XmlEnumValue("TransferRestriction")
    TRANSFER_RESTRICTION("TransferRestriction"),
    @XmlEnumValue("ValidityParameterAssignment")
    VALIDITY_PARAMETER_ASSIGNMENT("ValidityParameterAssignment"),
    @XmlEnumValue("VehicleAccessCredentialsAssignment")
    VEHICLE_ACCESS_CREDENTIALS_ASSIGNMENT("VehicleAccessCredentialsAssignment"),
    @XmlEnumValue("VehicleJourneyStopAssignment")
    VEHICLE_JOURNEY_STOP_ASSIGNMENT("VehicleJourneyStopAssignment"),
    @XmlEnumValue("VehicleMeetingPointAssignment")
    VEHICLE_MEETING_POINT_ASSIGNMENT("VehicleMeetingPointAssignment"),
    @XmlEnumValue("VehiclePoolingPlaceAssignment")
    VEHICLE_POOLING_PLACE_ASSIGNMENT("VehiclePoolingPlaceAssignment"),
    @XmlEnumValue("VehicleServicePlaceAssignment")
    VEHICLE_SERVICE_PLACE_ASSIGNMENT("VehicleServicePlaceAssignment"),
    @XmlEnumValue("VehicleSharingPlaceAssignment")
    VEHICLE_SHARING_PLACE_ASSIGNMENT("VehicleSharingPlaceAssignment"),
    @XmlEnumValue("VehicleTypeAtPoint")
    VEHICLE_TYPE_AT_POINT("VehicleTypeAtPoint"),
    @XmlEnumValue("VehicleTypeStopAssignment")
    VEHICLE_TYPE_STOP_ASSIGNMENT("VehicleTypeStopAssignment");
    private final String value;

    NameOfClassAssignmentRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassAssignmentRefStructureType fromValue(String v) {
        for (NameOfClassAssignmentRefStructureType c: NameOfClassAssignmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
