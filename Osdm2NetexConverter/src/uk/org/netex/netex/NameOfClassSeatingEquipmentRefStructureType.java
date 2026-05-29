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
 * <p>Java-Klasse f�r NameOfClassSeatingEquipmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassSeatingEquipmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassSiteEquipmentRefStructureType">
 *     &lt;enumeration value="SeatingEquipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassSeatingEquipmentRefStructureType")
@XmlEnum(NameOfClassSiteEquipmentRefStructureType.class)
public enum NameOfClassSeatingEquipmentRefStructureType {

    @XmlEnumValue("SeatingEquipment")
    SEATING_EQUIPMENT(NameOfClassSiteEquipmentRefStructureType.SEATING_EQUIPMENT);
    private final NameOfClassSiteEquipmentRefStructureType value;

    NameOfClassSeatingEquipmentRefStructureType(NameOfClassSiteEquipmentRefStructureType v) {
        value = v;
    }

    public NameOfClassSiteEquipmentRefStructureType value() {
        return value;
    }

    public static NameOfClassSeatingEquipmentRefStructureType fromValue(NameOfClassSiteEquipmentRefStructureType v) {
        for (NameOfClassSeatingEquipmentRefStructureType c: NameOfClassSeatingEquipmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
