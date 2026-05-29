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
 * <p>Java-Klasse f�r NameOfClassAccessRightInProductRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassAccessRightInProductRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassFareElementInSequenceRefStructureType">
 *     &lt;enumeration value="AccessRightInProduct"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassAccessRightInProductRefStructureType")
@XmlEnum(NameOfClassFareElementInSequenceRefStructureType.class)
public enum NameOfClassAccessRightInProductRefStructureType {

    @XmlEnumValue("AccessRightInProduct")
    ACCESS_RIGHT_IN_PRODUCT(NameOfClassFareElementInSequenceRefStructureType.ACCESS_RIGHT_IN_PRODUCT);
    private final NameOfClassFareElementInSequenceRefStructureType value;

    NameOfClassAccessRightInProductRefStructureType(NameOfClassFareElementInSequenceRefStructureType v) {
        value = v;
    }

    public NameOfClassFareElementInSequenceRefStructureType value() {
        return value;
    }

    public static NameOfClassAccessRightInProductRefStructureType fromValue(NameOfClassFareElementInSequenceRefStructureType v) {
        for (NameOfClassAccessRightInProductRefStructureType c: NameOfClassAccessRightInProductRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
