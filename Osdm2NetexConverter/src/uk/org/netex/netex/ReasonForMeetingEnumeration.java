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
 * <p>Java-Klasse f�r ReasonForMeetingEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ReasonForMeetingEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="serviceFacility"/>
 *     &lt;enumeration value="joining"/>
 *     &lt;enumeration value="tariffSection"/>
 *     &lt;enumeration value="splitting"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReasonForMeetingEnumeration")
@XmlEnum
public enum ReasonForMeetingEnumeration {


    /**
     * INTERCHANGE is considered a possible connection between journeys.
     * 
     */
    @XmlEnumValue("serviceFacility")
    SERVICE_FACILITY("serviceFacility"),

    /**
     * INTERCHANGE is advertised to public as a possible connection between journeys.
     * 
     */
    @XmlEnumValue("joining")
    JOINING("joining"),

    /**
     * INTERCHANGE is actively managed as a possible connection between journeys and passengers are informed of real-time alterations.
     * 
     */
    @XmlEnumValue("tariffSection")
    TARIFF_SECTION("tariffSection"),
    @XmlEnumValue("splitting")
    SPLITTING("splitting");
    private final String value;

    ReasonForMeetingEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReasonForMeetingEnumeration fromValue(String v) {
        for (ReasonForMeetingEnumeration c: ReasonForMeetingEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
