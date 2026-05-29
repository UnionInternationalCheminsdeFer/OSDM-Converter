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
 * <p>Java-Klasse f�r UsageEndEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="UsageEndEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="standardDuration"/>
 *     &lt;enumeration value="endOfCalendarPeriod"/>
 *     &lt;enumeration value="endOfRide"/>
 *     &lt;enumeration value="endOfTrip"/>
 *     &lt;enumeration value="endOfFareDay"/>
 *     &lt;enumeration value="endOfFarePeriod"/>
 *     &lt;enumeration value="productExpiry"/>
 *     &lt;enumeration value="profileExpiry"/>
 *     &lt;enumeration value="deregistration"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UsageEndEnumeration")
@XmlEnum
public enum UsageEndEnumeration {

    @XmlEnumValue("standardDuration")
    STANDARD_DURATION("standardDuration"),
    @XmlEnumValue("endOfCalendarPeriod")
    END_OF_CALENDAR_PERIOD("endOfCalendarPeriod"),
    @XmlEnumValue("endOfRide")
    END_OF_RIDE("endOfRide"),
    @XmlEnumValue("endOfTrip")
    END_OF_TRIP("endOfTrip"),
    @XmlEnumValue("endOfFareDay")
    END_OF_FARE_DAY("endOfFareDay"),
    @XmlEnumValue("endOfFarePeriod")
    END_OF_FARE_PERIOD("endOfFarePeriod"),
    @XmlEnumValue("productExpiry")
    PRODUCT_EXPIRY("productExpiry"),
    @XmlEnumValue("profileExpiry")
    PROFILE_EXPIRY("profileExpiry"),
    @XmlEnumValue("deregistration")
    DEREGISTRATION("deregistration"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    UsageEndEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UsageEndEnumeration fromValue(String v) {
        for (UsageEndEnumeration c: UsageEndEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
