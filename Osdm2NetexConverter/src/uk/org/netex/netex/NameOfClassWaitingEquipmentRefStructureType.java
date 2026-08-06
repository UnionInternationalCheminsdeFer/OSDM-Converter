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
 * <p>Java-Klasse f�r NameOfClassWaitingEquipmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassWaitingEquipmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassSiteEquipmentRefStructureType">
 *     &lt;enumeration value="SeatingEquipment"/>
 *     &lt;enumeration value="ShelterEquipment"/>
 *     &lt;enumeration value="WaitingRoomEquipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassWaitingEquipmentRefStructureType")
@XmlEnum(NameOfClassSiteEquipmentRefStructureType.class)
public enum NameOfClassWaitingEquipmentRefStructureType {

    @XmlEnumValue("SeatingEquipment")
    SEATING_EQUIPMENT(NameOfClassSiteEquipmentRefStructureType.SEATING_EQUIPMENT),
    @XmlEnumValue("ShelterEquipment")
    SHELTER_EQUIPMENT(NameOfClassSiteEquipmentRefStructureType.SHELTER_EQUIPMENT),
    @XmlEnumValue("WaitingRoomEquipment")
    WAITING_ROOM_EQUIPMENT(NameOfClassSiteEquipmentRefStructureType.WAITING_ROOM_EQUIPMENT);
    private final NameOfClassSiteEquipmentRefStructureType value;

    NameOfClassWaitingEquipmentRefStructureType(NameOfClassSiteEquipmentRefStructureType v) {
        value = v;
    }

    public NameOfClassSiteEquipmentRefStructureType value() {
        return value;
    }

    public static NameOfClassWaitingEquipmentRefStructureType fromValue(NameOfClassSiteEquipmentRefStructureType v) {
        for (NameOfClassWaitingEquipmentRefStructureType c: NameOfClassWaitingEquipmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
