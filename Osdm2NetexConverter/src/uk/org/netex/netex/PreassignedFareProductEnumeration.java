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
 * <p>Java-Klasse f�r PreassignedFareProductEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PreassignedFareProductEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="singleTrip"/>
 *     &lt;enumeration value="shortTrip"/>
 *     &lt;enumeration value="timeLimitedSingleTrip"/>
 *     &lt;enumeration value="dayReturnTrip"/>
 *     &lt;enumeration value="periodReturnTrip"/>
 *     &lt;enumeration value="multistepTrip"/>
 *     &lt;enumeration value="dayPass"/>
 *     &lt;enumeration value="periodPass"/>
 *     &lt;enumeration value="supplement"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PreassignedFareProductEnumeration")
@XmlEnum
public enum PreassignedFareProductEnumeration {

    @XmlEnumValue("singleTrip")
    SINGLE_TRIP("singleTrip"),
    @XmlEnumValue("shortTrip")
    SHORT_TRIP("shortTrip"),
    @XmlEnumValue("timeLimitedSingleTrip")
    TIME_LIMITED_SINGLE_TRIP("timeLimitedSingleTrip"),
    @XmlEnumValue("dayReturnTrip")
    DAY_RETURN_TRIP("dayReturnTrip"),
    @XmlEnumValue("periodReturnTrip")
    PERIOD_RETURN_TRIP("periodReturnTrip"),
    @XmlEnumValue("multistepTrip")
    MULTISTEP_TRIP("multistepTrip"),
    @XmlEnumValue("dayPass")
    DAY_PASS("dayPass"),
    @XmlEnumValue("periodPass")
    PERIOD_PASS("periodPass"),
    @XmlEnumValue("supplement")
    SUPPLEMENT("supplement"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PreassignedFareProductEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PreassignedFareProductEnumeration fromValue(String v) {
        for (PreassignedFareProductEnumeration c: PreassignedFareProductEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
