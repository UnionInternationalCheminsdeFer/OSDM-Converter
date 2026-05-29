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
 * <p>Java-Klasse f�r NameOfClassPreassignedFareProductRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassPreassignedFareProductRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassFareProductRefStructureType">
 *     &lt;enumeration value="PreassignedFareProduct"/>
 *     &lt;enumeration value="SupplementProduct"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassPreassignedFareProductRefStructureType")
@XmlEnum(NameOfClassFareProductRefStructureType.class)
public enum NameOfClassPreassignedFareProductRefStructureType {

    @XmlEnumValue("PreassignedFareProduct")
    PREASSIGNED_FARE_PRODUCT(NameOfClassFareProductRefStructureType.PREASSIGNED_FARE_PRODUCT),
    @XmlEnumValue("SupplementProduct")
    SUPPLEMENT_PRODUCT(NameOfClassFareProductRefStructureType.SUPPLEMENT_PRODUCT);
    private final NameOfClassFareProductRefStructureType value;

    NameOfClassPreassignedFareProductRefStructureType(NameOfClassFareProductRefStructureType v) {
        value = v;
    }

    public NameOfClassFareProductRefStructureType value() {
        return value;
    }

    public static NameOfClassPreassignedFareProductRefStructureType fromValue(NameOfClassFareProductRefStructureType v) {
        for (NameOfClassPreassignedFareProductRefStructureType c: NameOfClassPreassignedFareProductRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
