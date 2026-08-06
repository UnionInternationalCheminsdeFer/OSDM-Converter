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
 * <p>Java-Klasse f�r BerthFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BerthFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="lower"/>
 *     &lt;enumeration value="middle"/>
 *     &lt;enumeration value="upper"/>
 *     &lt;enumeration value="both"/>
 *     &lt;enumeration value="all"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BerthFacilityEnumeration")
@XmlEnum
public enum BerthFacilityEnumeration {

    @XmlEnumValue("lower")
    LOWER("lower"),
    @XmlEnumValue("middle")
    MIDDLE("middle"),
    @XmlEnumValue("upper")
    UPPER("upper"),
    @XmlEnumValue("both")
    BOTH("both"),
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    BerthFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BerthFacilityEnumeration fromValue(String v) {
        for (BerthFacilityEnumeration c: BerthFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
