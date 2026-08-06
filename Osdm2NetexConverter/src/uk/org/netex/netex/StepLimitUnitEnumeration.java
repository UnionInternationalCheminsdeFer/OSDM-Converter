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
 * <p>Java-Klasse f�r StepLimitUnitEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="StepLimitUnitEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="stops"/>
 *     &lt;enumeration value="stopsIncludingPassThroughStops"/>
 *     &lt;enumeration value="sections"/>
 *     &lt;enumeration value="zones"/>
 *     &lt;enumeration value="networks"/>
 *     &lt;enumeration value="operators"/>
 *     &lt;enumeration value="countries"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StepLimitUnitEnumeration")
@XmlEnum
public enum StepLimitUnitEnumeration {

    @XmlEnumValue("stops")
    STOPS("stops"),
    @XmlEnumValue("stopsIncludingPassThroughStops")
    STOPS_INCLUDING_PASS_THROUGH_STOPS("stopsIncludingPassThroughStops"),
    @XmlEnumValue("sections")
    SECTIONS("sections"),
    @XmlEnumValue("zones")
    ZONES("zones"),
    @XmlEnumValue("networks")
    NETWORKS("networks"),
    @XmlEnumValue("operators")
    OPERATORS("operators"),
    @XmlEnumValue("countries")
    COUNTRIES("countries");
    private final String value;

    StepLimitUnitEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StepLimitUnitEnumeration fromValue(String v) {
        for (StepLimitUnitEnumeration c: StepLimitUnitEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
