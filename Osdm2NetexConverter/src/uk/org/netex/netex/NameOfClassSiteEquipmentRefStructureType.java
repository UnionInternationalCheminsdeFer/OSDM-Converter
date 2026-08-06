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
 * <p>Java-Klasse f�r NameOfClassSiteEquipmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassSiteEquipmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassPlaceEquipmentRefStructureType">
 *     &lt;enumeration value="SeatingEquipment"/>
 *     &lt;enumeration value="ShelterEquipment"/>
 *     &lt;enumeration value="TrolleyStandEquipment"/>
 *     &lt;enumeration value="WaitingRoomEquipment"/>
 *     &lt;enumeration value="LuggageLockerEquipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassSiteEquipmentRefStructureType")
@XmlEnum(NameOfClassPlaceEquipmentRefStructureType.class)
public enum NameOfClassSiteEquipmentRefStructureType {

    @XmlEnumValue("SeatingEquipment")
    SEATING_EQUIPMENT(NameOfClassPlaceEquipmentRefStructureType.SEATING_EQUIPMENT),
    @XmlEnumValue("ShelterEquipment")
    SHELTER_EQUIPMENT(NameOfClassPlaceEquipmentRefStructureType.SHELTER_EQUIPMENT),
    @XmlEnumValue("TrolleyStandEquipment")
    TROLLEY_STAND_EQUIPMENT(NameOfClassPlaceEquipmentRefStructureType.TROLLEY_STAND_EQUIPMENT),
    @XmlEnumValue("WaitingRoomEquipment")
    WAITING_ROOM_EQUIPMENT(NameOfClassPlaceEquipmentRefStructureType.WAITING_ROOM_EQUIPMENT),
    @XmlEnumValue("LuggageLockerEquipment")
    LUGGAGE_LOCKER_EQUIPMENT(NameOfClassPlaceEquipmentRefStructureType.LUGGAGE_LOCKER_EQUIPMENT);
    private final NameOfClassPlaceEquipmentRefStructureType value;

    NameOfClassSiteEquipmentRefStructureType(NameOfClassPlaceEquipmentRefStructureType v) {
        value = v;
    }

    public NameOfClassPlaceEquipmentRefStructureType value() {
        return value;
    }

    public static NameOfClassSiteEquipmentRefStructureType fromValue(NameOfClassPlaceEquipmentRefStructureType v) {
        for (NameOfClassSiteEquipmentRefStructureType c: NameOfClassSiteEquipmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
