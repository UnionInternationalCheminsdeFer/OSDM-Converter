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
 * <p>Java-Klasse f�r NameOfClassSpotEquipmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassSpotEquipmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassInstalledEquipmentRefStructureType">
 *     &lt;enumeration value="BedEquipment"/>
 *     &lt;enumeration value="LuggageSpotEquipment"/>
 *     &lt;enumeration value="SeatEquipment"/>
 *     &lt;enumeration value="SpotEquipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassSpotEquipmentRefStructureType")
@XmlEnum(NameOfClassInstalledEquipmentRefStructureType.class)
public enum NameOfClassSpotEquipmentRefStructureType {

    @XmlEnumValue("BedEquipment")
    BED_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.BED_EQUIPMENT),
    @XmlEnumValue("LuggageSpotEquipment")
    LUGGAGE_SPOT_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.LUGGAGE_SPOT_EQUIPMENT),
    @XmlEnumValue("SeatEquipment")
    SEAT_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.SEAT_EQUIPMENT),
    @XmlEnumValue("SpotEquipment")
    SPOT_EQUIPMENT(NameOfClassInstalledEquipmentRefStructureType.SPOT_EQUIPMENT);
    private final NameOfClassInstalledEquipmentRefStructureType value;

    NameOfClassSpotEquipmentRefStructureType(NameOfClassInstalledEquipmentRefStructureType v) {
        value = v;
    }

    public NameOfClassInstalledEquipmentRefStructureType value() {
        return value;
    }

    public static NameOfClassSpotEquipmentRefStructureType fromValue(NameOfClassInstalledEquipmentRefStructureType v) {
        for (NameOfClassSpotEquipmentRefStructureType c: NameOfClassSpotEquipmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
