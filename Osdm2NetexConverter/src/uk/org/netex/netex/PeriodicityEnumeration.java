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
 * <p>Java-Klasse f�r PeriodicityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PeriodicityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="annual"/>
 *     &lt;enumeration value="quarterly"/>
 *     &lt;enumeration value="monthly"/>
 *     &lt;enumeration value="weekly"/>
 *     &lt;enumeration value="daily"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PeriodicityEnumeration")
@XmlEnum
public enum PeriodicityEnumeration {

    @XmlEnumValue("annual")
    ANNUAL("annual"),
    @XmlEnumValue("quarterly")
    QUARTERLY("quarterly"),
    @XmlEnumValue("monthly")
    MONTHLY("monthly"),
    @XmlEnumValue("weekly")
    WEEKLY("weekly"),
    @XmlEnumValue("daily")
    DAILY("daily");
    private final String value;

    PeriodicityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PeriodicityEnumeration fromValue(String v) {
        for (PeriodicityEnumeration c: PeriodicityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
