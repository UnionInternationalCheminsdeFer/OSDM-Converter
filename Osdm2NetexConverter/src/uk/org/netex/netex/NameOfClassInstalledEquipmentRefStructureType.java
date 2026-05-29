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
 * <p>Java-Klasse f�r NameOfClassInstalledEquipmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassInstalledEquipmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassEquipmentRefStructureType">
 *     &lt;enumeration value="AccessVehicleEquipment"/>
 *     &lt;enumeration value="ActualVehicleEquipment"/>
 *     &lt;enumeration value="BatteryEquipment"/>
 *     &lt;enumeration value="BedEquipment"/>
 *     &lt;enumeration value="CrossingEquipment"/>
 *     &lt;enumeration value="CycleStorageEquipment"/>
 *     &lt;enumeration value="EntranceEquipment"/>
 *     &lt;enumeration value="EntranceSensor"/>
 *     &lt;enumeration value="EscalatorEquipment"/>
 *     &lt;enumeration value="GeneralSign"/>
 *     &lt;enumeration value="HeadingSign"/>
 *     &lt;enumeration value="HelpPointEquipment"/>
 *     &lt;enumeration value="LiftCallEquipment"/>
 *     &lt;enumeration value="LiftEquipment"/>
 *     &lt;enumeration value="LuggageSpotEquipment"/>
 *     &lt;enumeration value="LuggageLockerEquipment"/>
 *     &lt;enumeration value="OtherPlaceEquipment"/>
 *     &lt;enumeration value="PassengerBeaconEquipment"/>
 *     &lt;enumeration value="PassengerInformationEquipment"/>
 *     &lt;enumeration value="PassengerSafetyEquipment"/>
 *     &lt;enumeration value="PlaceLighting"/>
 *     &lt;enumeration value="PlaceSign"/>
 *     &lt;enumeration value="QueueingEquipment"/>
 *     &lt;enumeration value="RampEquipment"/>
 *     &lt;enumeration value="RefuellingEquipment"/>
 *     &lt;enumeration value="RetailDevice"/>
 *     &lt;enumeration value="RoughSurface"/>
 *     &lt;enumeration value="RubbishDisposalEquipment"/>
 *     &lt;enumeration value="SanitaryEquipment"/>
 *     &lt;enumeration value="SeatEquipment"/>
 *     &lt;enumeration value="SeatingEquipment"/>
 *     &lt;enumeration value="SensorEquipment"/>
 *     &lt;enumeration value="ShelterEquipment"/>
 *     &lt;enumeration value="SignEquipment"/>
 *     &lt;enumeration value="SpotEquipment"/>
 *     &lt;enumeration value="SpotSensor"/>
 *     &lt;enumeration value="StaircaseEquipment"/>
 *     &lt;enumeration value="TicketValidatorEquipment"/>
 *     &lt;enumeration value="TicketingEquipment"/>
 *     &lt;enumeration value="TravelatorEquipment"/>
 *     &lt;enumeration value="TrolleyStandEquipment"/>
 *     &lt;enumeration value="VehicleChargingEquipment"/>
 *     &lt;enumeration value="VehicleReleaseEquipment"/>
 *     &lt;enumeration value="WaitingRoomEquipment"/>
 *     &lt;enumeration value="WheelchairVehicleEquipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassInstalledEquipmentRefStructureType")
@XmlEnum(NameOfClassEquipmentRefStructureType.class)
public enum NameOfClassInstalledEquipmentRefStructureType {

    @XmlEnumValue("AccessVehicleEquipment")
    ACCESS_VEHICLE_EQUIPMENT(NameOfClassEquipmentRefStructureType.ACCESS_VEHICLE_EQUIPMENT),
    @XmlEnumValue("ActualVehicleEquipment")
    ACTUAL_VEHICLE_EQUIPMENT(NameOfClassEquipmentRefStructureType.ACTUAL_VEHICLE_EQUIPMENT),
    @XmlEnumValue("BatteryEquipment")
    BATTERY_EQUIPMENT(NameOfClassEquipmentRefStructureType.BATTERY_EQUIPMENT),
    @XmlEnumValue("BedEquipment")
    BED_EQUIPMENT(NameOfClassEquipmentRefStructureType.BED_EQUIPMENT),
    @XmlEnumValue("CrossingEquipment")
    CROSSING_EQUIPMENT(NameOfClassEquipmentRefStructureType.CROSSING_EQUIPMENT),
    @XmlEnumValue("CycleStorageEquipment")
    CYCLE_STORAGE_EQUIPMENT(NameOfClassEquipmentRefStructureType.CYCLE_STORAGE_EQUIPMENT),
    @XmlEnumValue("EntranceEquipment")
    ENTRANCE_EQUIPMENT(NameOfClassEquipmentRefStructureType.ENTRANCE_EQUIPMENT),
    @XmlEnumValue("EntranceSensor")
    ENTRANCE_SENSOR(NameOfClassEquipmentRefStructureType.ENTRANCE_SENSOR),
    @XmlEnumValue("EscalatorEquipment")
    ESCALATOR_EQUIPMENT(NameOfClassEquipmentRefStructureType.ESCALATOR_EQUIPMENT),
    @XmlEnumValue("GeneralSign")
    GENERAL_SIGN(NameOfClassEquipmentRefStructureType.GENERAL_SIGN),
    @XmlEnumValue("HeadingSign")
    HEADING_SIGN(NameOfClassEquipmentRefStructureType.HEADING_SIGN),
    @XmlEnumValue("HelpPointEquipment")
    HELP_POINT_EQUIPMENT(NameOfClassEquipmentRefStructureType.HELP_POINT_EQUIPMENT),
    @XmlEnumValue("LiftCallEquipment")
    LIFT_CALL_EQUIPMENT(NameOfClassEquipmentRefStructureType.LIFT_CALL_EQUIPMENT),
    @XmlEnumValue("LiftEquipment")
    LIFT_EQUIPMENT(NameOfClassEquipmentRefStructureType.LIFT_EQUIPMENT),
    @XmlEnumValue("LuggageSpotEquipment")
    LUGGAGE_SPOT_EQUIPMENT(NameOfClassEquipmentRefStructureType.LUGGAGE_SPOT_EQUIPMENT),
    @XmlEnumValue("LuggageLockerEquipment")
    LUGGAGE_LOCKER_EQUIPMENT(NameOfClassEquipmentRefStructureType.LUGGAGE_LOCKER_EQUIPMENT),
    @XmlEnumValue("OtherPlaceEquipment")
    OTHER_PLACE_EQUIPMENT(NameOfClassEquipmentRefStructureType.OTHER_PLACE_EQUIPMENT),
    @XmlEnumValue("PassengerBeaconEquipment")
    PASSENGER_BEACON_EQUIPMENT(NameOfClassEquipmentRefStructureType.PASSENGER_BEACON_EQUIPMENT),
    @XmlEnumValue("PassengerInformationEquipment")
    PASSENGER_INFORMATION_EQUIPMENT(NameOfClassEquipmentRefStructureType.PASSENGER_INFORMATION_EQUIPMENT),
    @XmlEnumValue("PassengerSafetyEquipment")
    PASSENGER_SAFETY_EQUIPMENT(NameOfClassEquipmentRefStructureType.PASSENGER_SAFETY_EQUIPMENT),
    @XmlEnumValue("PlaceLighting")
    PLACE_LIGHTING(NameOfClassEquipmentRefStructureType.PLACE_LIGHTING),
    @XmlEnumValue("PlaceSign")
    PLACE_SIGN(NameOfClassEquipmentRefStructureType.PLACE_SIGN),
    @XmlEnumValue("QueueingEquipment")
    QUEUEING_EQUIPMENT(NameOfClassEquipmentRefStructureType.QUEUEING_EQUIPMENT),
    @XmlEnumValue("RampEquipment")
    RAMP_EQUIPMENT(NameOfClassEquipmentRefStructureType.RAMP_EQUIPMENT),
    @XmlEnumValue("RefuellingEquipment")
    REFUELLING_EQUIPMENT(NameOfClassEquipmentRefStructureType.REFUELLING_EQUIPMENT),
    @XmlEnumValue("RetailDevice")
    RETAIL_DEVICE(NameOfClassEquipmentRefStructureType.RETAIL_DEVICE),
    @XmlEnumValue("RoughSurface")
    ROUGH_SURFACE(NameOfClassEquipmentRefStructureType.ROUGH_SURFACE),
    @XmlEnumValue("RubbishDisposalEquipment")
    RUBBISH_DISPOSAL_EQUIPMENT(NameOfClassEquipmentRefStructureType.RUBBISH_DISPOSAL_EQUIPMENT),
    @XmlEnumValue("SanitaryEquipment")
    SANITARY_EQUIPMENT(NameOfClassEquipmentRefStructureType.SANITARY_EQUIPMENT),
    @XmlEnumValue("SeatEquipment")
    SEAT_EQUIPMENT(NameOfClassEquipmentRefStructureType.SEAT_EQUIPMENT),
    @XmlEnumValue("SeatingEquipment")
    SEATING_EQUIPMENT(NameOfClassEquipmentRefStructureType.SEATING_EQUIPMENT),
    @XmlEnumValue("SensorEquipment")
    SENSOR_EQUIPMENT(NameOfClassEquipmentRefStructureType.SENSOR_EQUIPMENT),
    @XmlEnumValue("ShelterEquipment")
    SHELTER_EQUIPMENT(NameOfClassEquipmentRefStructureType.SHELTER_EQUIPMENT),
    @XmlEnumValue("SignEquipment")
    SIGN_EQUIPMENT(NameOfClassEquipmentRefStructureType.SIGN_EQUIPMENT),
    @XmlEnumValue("SpotEquipment")
    SPOT_EQUIPMENT(NameOfClassEquipmentRefStructureType.SPOT_EQUIPMENT),
    @XmlEnumValue("SpotSensor")
    SPOT_SENSOR(NameOfClassEquipmentRefStructureType.SPOT_SENSOR),
    @XmlEnumValue("StaircaseEquipment")
    STAIRCASE_EQUIPMENT(NameOfClassEquipmentRefStructureType.STAIRCASE_EQUIPMENT),
    @XmlEnumValue("TicketValidatorEquipment")
    TICKET_VALIDATOR_EQUIPMENT(NameOfClassEquipmentRefStructureType.TICKET_VALIDATOR_EQUIPMENT),
    @XmlEnumValue("TicketingEquipment")
    TICKETING_EQUIPMENT(NameOfClassEquipmentRefStructureType.TICKETING_EQUIPMENT),
    @XmlEnumValue("TravelatorEquipment")
    TRAVELATOR_EQUIPMENT(NameOfClassEquipmentRefStructureType.TRAVELATOR_EQUIPMENT),
    @XmlEnumValue("TrolleyStandEquipment")
    TROLLEY_STAND_EQUIPMENT(NameOfClassEquipmentRefStructureType.TROLLEY_STAND_EQUIPMENT),
    @XmlEnumValue("VehicleChargingEquipment")
    VEHICLE_CHARGING_EQUIPMENT(NameOfClassEquipmentRefStructureType.VEHICLE_CHARGING_EQUIPMENT),
    @XmlEnumValue("VehicleReleaseEquipment")
    VEHICLE_RELEASE_EQUIPMENT(NameOfClassEquipmentRefStructureType.VEHICLE_RELEASE_EQUIPMENT),
    @XmlEnumValue("WaitingRoomEquipment")
    WAITING_ROOM_EQUIPMENT(NameOfClassEquipmentRefStructureType.WAITING_ROOM_EQUIPMENT),
    @XmlEnumValue("WheelchairVehicleEquipment")
    WHEELCHAIR_VEHICLE_EQUIPMENT(NameOfClassEquipmentRefStructureType.WHEELCHAIR_VEHICLE_EQUIPMENT);
    private final NameOfClassEquipmentRefStructureType value;

    NameOfClassInstalledEquipmentRefStructureType(NameOfClassEquipmentRefStructureType v) {
        value = v;
    }

    public NameOfClassEquipmentRefStructureType value() {
        return value;
    }

    public static NameOfClassInstalledEquipmentRefStructureType fromValue(NameOfClassEquipmentRefStructureType v) {
        for (NameOfClassInstalledEquipmentRefStructureType c: NameOfClassInstalledEquipmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
