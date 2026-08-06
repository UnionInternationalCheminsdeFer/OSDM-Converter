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
 * <p>Java-Klasse f�r NameOfClassStaircaseEquipmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassStaircaseEquipmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassAccessEquipmentRefStructureType">
 *     &lt;enumeration value="StaircaseEquipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassStaircaseEquipmentRefStructureType")
@XmlEnum(NameOfClassAccessEquipmentRefStructureType.class)
public enum NameOfClassStaircaseEquipmentRefStructureType {

    @XmlEnumValue("StaircaseEquipment")
    STAIRCASE_EQUIPMENT(NameOfClassAccessEquipmentRefStructureType.STAIRCASE_EQUIPMENT);
    private final NameOfClassAccessEquipmentRefStructureType value;

    NameOfClassStaircaseEquipmentRefStructureType(NameOfClassAccessEquipmentRefStructureType v) {
        value = v;
    }

    public NameOfClassAccessEquipmentRefStructureType value() {
        return value;
    }

    public static NameOfClassStaircaseEquipmentRefStructureType fromValue(NameOfClassAccessEquipmentRefStructureType v) {
        for (NameOfClassStaircaseEquipmentRefStructureType c: NameOfClassStaircaseEquipmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
