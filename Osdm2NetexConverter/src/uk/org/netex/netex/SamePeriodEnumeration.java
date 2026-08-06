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
 * <p>Java-Klasse f�r SamePeriodEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SamePeriodEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="any"/>
 *     &lt;enumeration value="samePeriod"/>
 *     &lt;enumeration value="withinSamePeriod"/>
 *     &lt;enumeration value="sameDay"/>
 *     &lt;enumeration value="sameDayOfReturn"/>
 *     &lt;enumeration value="sameFareDay"/>
 *     &lt;enumeration value="nextDay"/>
 *     &lt;enumeration value="different"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SamePeriodEnumeration")
@XmlEnum
public enum SamePeriodEnumeration {

    @XmlEnumValue("any")
    ANY("any"),
    @XmlEnumValue("samePeriod")
    SAME_PERIOD("samePeriod"),
    @XmlEnumValue("withinSamePeriod")
    WITHIN_SAME_PERIOD("withinSamePeriod"),
    @XmlEnumValue("sameDay")
    SAME_DAY("sameDay"),
    @XmlEnumValue("sameDayOfReturn")
    SAME_DAY_OF_RETURN("sameDayOfReturn"),
    @XmlEnumValue("sameFareDay")
    SAME_FARE_DAY("sameFareDay"),
    @XmlEnumValue("nextDay")
    NEXT_DAY("nextDay"),
    @XmlEnumValue("different")
    DIFFERENT("different");
    private final String value;

    SamePeriodEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SamePeriodEnumeration fromValue(String v) {
        for (SamePeriodEnumeration c: SamePeriodEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
