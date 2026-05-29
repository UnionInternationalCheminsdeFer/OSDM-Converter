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
 * <p>Java-Klasse f�r NameOfClassHeadingSignRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassHeadingSignRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassPlaceEquipmentRefStructureType">
 *     &lt;enumeration value="HeadingSign"/>
 *     &lt;enumeration value="SignEquipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassHeadingSignRefStructureType")
@XmlEnum(NameOfClassPlaceEquipmentRefStructureType.class)
public enum NameOfClassHeadingSignRefStructureType {

    @XmlEnumValue("HeadingSign")
    HEADING_SIGN(NameOfClassPlaceEquipmentRefStructureType.HEADING_SIGN),
    @XmlEnumValue("SignEquipment")
    SIGN_EQUIPMENT(NameOfClassPlaceEquipmentRefStructureType.SIGN_EQUIPMENT);
    private final NameOfClassPlaceEquipmentRefStructureType value;

    NameOfClassHeadingSignRefStructureType(NameOfClassPlaceEquipmentRefStructureType v) {
        value = v;
    }

    public NameOfClassPlaceEquipmentRefStructureType value() {
        return value;
    }

    public static NameOfClassHeadingSignRefStructureType fromValue(NameOfClassPlaceEquipmentRefStructureType v) {
        for (NameOfClassHeadingSignRefStructureType c: NameOfClassHeadingSignRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
