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
 * <p>Java-Klasse f�r NameOfClassFareElementInSequenceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassFareElementInSequenceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="AccessRightInProduct"/>
 *     &lt;enumeration value="ControllableElementInSequence"/>
 *     &lt;enumeration value="FareElementInSequence"/>
 *     &lt;enumeration value="FareStructureElementInSequence"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassFareElementInSequenceRefStructureType")
@XmlEnum
public enum NameOfClassFareElementInSequenceRefStructureType {

    @XmlEnumValue("AccessRightInProduct")
    ACCESS_RIGHT_IN_PRODUCT("AccessRightInProduct"),
    @XmlEnumValue("ControllableElementInSequence")
    CONTROLLABLE_ELEMENT_IN_SEQUENCE("ControllableElementInSequence"),
    @XmlEnumValue("FareElementInSequence")
    FARE_ELEMENT_IN_SEQUENCE("FareElementInSequence"),
    @XmlEnumValue("FareStructureElementInSequence")
    FARE_STRUCTURE_ELEMENT_IN_SEQUENCE("FareStructureElementInSequence");
    private final String value;

    NameOfClassFareElementInSequenceRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassFareElementInSequenceRefStructureType fromValue(String v) {
        for (NameOfClassFareElementInSequenceRefStructureType c: NameOfClassFareElementInSequenceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
