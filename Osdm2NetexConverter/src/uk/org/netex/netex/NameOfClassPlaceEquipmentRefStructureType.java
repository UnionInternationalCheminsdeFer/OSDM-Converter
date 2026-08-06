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
 * <p>Java-Klasse f�r NameOfClassPlaceEquipmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassPlaceEquipmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassInstalledEquipmentRefStructureType">
 *     &lt;enumeration value="BatteryEquipment"/>
 *     &lt;enumeration value="CrossingEquipment"/>
 *     &lt;enumeration value="CycleStorageEquipment"/>
 *     &lt;enumeration value="EntranceEquipment"/>
 *     &lt;enumeration value="EscalatorEquipment"/>
 *     &lt;enumeration value="GeneralSign"/>
 *     &lt;enumeration value="HeadingSign"/>
 *     &lt;enumeration value="LiftCallEquipment"/>
 *     &lt;enumeration value="LiftEquipment"/>
 *     &lt;enumeration value="LuggageLockerEquipment"/>
 *     &lt;enumeration value="OtherPlaceEquipment"/>
 *     &lt;enumeration value="PlaceLighting"/>
 *     &lt;enumeration value="PlaceSign"/>
 *     &lt;enumeration value="QueueingEquipment"/>
 *     &lt;enumeration value="RampEquipment"/>
 *     &lt;enumeration value="RefuellingEquipment"/>
 *     &lt;enumeration value="RoughSurface"/>
 *     &lt;enumeration value="SeatingEquipment"/>
 *     &lt;enumeration value="ShelterEquipment"/>
 *     &lt;enumeration value="SignEquipment"/>
 *     &lt;enumeration value="StaircaseEquipment"/>
 *     &lt;enumeration value="TravelatorEquipment"/>
 *     &lt;enumeration value="TrolleyStandEquipment"/>
 *     &lt;enumeration value="VehicleChargingEquipment"/>
 *     &lt;enumeration value="WaitingRoomEquipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassPlaceEquipmentRefStructureType")
@XmlEnum(NameOfClassInstalledEquipmentRefStructureType.class)
public enum NameOfClassPlaceEquipmentRefStructureType {

    @XmlEnumValue("BatteryEquipment")
    BATTERY_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.BATTERY_EQUIPMENT),
    @XmlEnumValue("CrossingEquipment")
    CROSSING_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.CROSSING_EQUIPMENT),
    @XmlEnumValue("CycleStorageEquipment")
    CYCLE_STORAGE_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.CYCLE_STORAGE_EQUIPMENT),
    @XmlEnumValue("EntranceEquipment")
    ENTRANCE_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.ENTRANCE_EQUIPMENT),
    @XmlEnumValue("EscalatorEquipment")
    ESCALATOR_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.ESCALATOR_EQUIPMENT),
    @XmlEnumValue("GeneralSign")
    GENERAL_SIGN(NameOfClassInstalledEquipmentRefStructureType.GENERAL_SIGN),
    @XmlEnumValue("HeadingSign")
    HEADING_SIGN(NameOfClassInstalledEquipmentRefStructureType.HEADING_SIGN),
    @XmlEnumValue("LiftCallEquipment")
    LIFT_CALL_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.LIFT_CALL_EQUIPMENT),
    @XmlEnumValue("LiftEquipment")
    LIFT_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.LIFT_EQUIPMENT),
    @XmlEnumValue("LuggageLockerEquipment")
    LUGGAGE_LOCKER_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.LUGGAGE_LOCKER_EQUIPMENT),
    @XmlEnumValue("OtherPlaceEquipment")
    OTHER_PLACE_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.OTHER_PLACE_EQUIPMENT),
    @XmlEnumValue("PlaceLighting")
    PLACE_LIGHTING(NameOfClassInstalledEquipmentRefStructureType.PLACE_LIGHTING),
    @XmlEnumValue("PlaceSign")
    PLACE_SIGN(NameOfClassInstalledEquipmentRefStructureType.PLACE_SIGN),
    @XmlEnumValue("QueueingEquipment")
    QUEUEING_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.QUEUEING_EQUIPMENT),
    @XmlEnumValue("RampEquipment")
    RAMP_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.RAMP_EQUIPMENT),
    @XmlEnumValue("RefuellingEquipment")
    REFUELLING_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.REFUELLING_EQUIPMENT),
    @XmlEnumValue("RoughSurface")
    ROUGH_SURFACE(NameOfClassInstalledEquipmentRefStructureType.ROUGH_SURFACE),
    @XmlEnumValue("SeatingEquipment")
    SEATING_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.SEATING_EQUIPMENT),
    @XmlEnumValue("ShelterEquipment")
    SHELTER_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.SHELTER_EQUIPMENT),
    @XmlEnumValue("SignEquipment")
    SIGN_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.SIGN_EQUIPMENT),
    @XmlEnumValue("StaircaseEquipment")
    STAIRCASE_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.STAIRCASE_EQUIPMENT),
    @XmlEnumValue("TravelatorEquipment")
    TRAVELATOR_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.TRAVELATOR_EQUIPMENT),
    @XmlEnumValue("TrolleyStandEquipment")
    TROLLEY_STAND_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.TROLLEY_STAND_EQUIPMENT),
    @XmlEnumValue("VehicleChargingEquipment")
    VEHICLE_CHARGING_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.VEHICLE_CHARGING_EQUIPMENT),
    @XmlEnumValue("WaitingRoomEquipment")
    WAITING_ROOM_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.WAITING_ROOM_EQUIPMENT);
    private final NameOfClassInstalledEquipmentRefStructureType value;

    NameOfClassPlaceEquipmentRefStructureType(NameOfClassInstalledEquipmentRefStructureType v) {
        value = v;
    }

    public NameOfClassInstalledEquipmentRefStructureType value() {
        return value;
    }

    public static NameOfClassPlaceEquipmentRefStructureType fromValue(NameOfClassInstalledEquipmentRefStructureType v) {
        for (NameOfClassPlaceEquipmentRefStructureType c: NameOfClassPlaceEquipmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
