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
 * <p>Java-Klasse f�r NameOfClassGeneralSignRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassGeneralSignRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassPlaceEquipmentRefStructureType">
 *     &lt;enumeration value="GeneralSign"/>
 *     &lt;enumeration value="SignEquipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassGeneralSignRefStructureType")
@XmlEnum(NameOfClassPlaceEquipmentRefStructureType.class)
public enum NameOfClassGeneralSignRefStructureType {

    @XmlEnumValue("GeneralSign")
    GENERAL_SIGN(NameOfClassPlaceEquipmentRefStructureType.GENERAL_SIGN),
    @XmlEnumValue("SignEquipment")
    SIGN_EQUIPMENT(NameOfClassPlaceEquipmentRefStructureType.SIGN_EQUIPMENT);
    private final NameOfClassPlaceEquipmentRefStructureType value;

    NameOfClassGeneralSignRefStructureType(NameOfClassPlaceEquipmentRefStructureType v) {
        value = v;
    }

    public NameOfClassPlaceEquipmentRefStructureType value() {
        return value;
    }

    public static NameOfClassGeneralSignRefStructureType fromValue(NameOfClassPlaceEquipmentRefStructureType v) {
        for (NameOfClassGeneralSignRefStructureType c: NameOfClassGeneralSignRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
