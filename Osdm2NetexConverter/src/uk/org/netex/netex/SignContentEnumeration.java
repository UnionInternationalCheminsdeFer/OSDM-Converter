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
 * <p>Java-Klasse f�r SignContentEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SignContentEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="entrance"/>
 *     &lt;enumeration value="exit"/>
 *     &lt;enumeration value="emergencyExit"/>
 *     &lt;enumeration value="transportMode"/>
 *     &lt;enumeration value="noSmoking"/>
 *     &lt;enumeration value="tickets"/>
 *     &lt;enumeration value="assistance"/>
 *     &lt;enumeration value="sosPhone"/>
 *     &lt;enumeration value="touchPoint"/>
 *     &lt;enumeration value="meetingPoint"/>
 *     &lt;enumeration value="transportModePoint"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SignContentEnumeration")
@XmlEnum
public enum SignContentEnumeration {

    @XmlEnumValue("entrance")
    ENTRANCE("entrance"),
    @XmlEnumValue("exit")
    EXIT("exit"),
    @XmlEnumValue("emergencyExit")
    EMERGENCY_EXIT("emergencyExit"),
    @XmlEnumValue("transportMode")
    TRANSPORT_MODE("transportMode"),
    @XmlEnumValue("noSmoking")
    NO_SMOKING("noSmoking"),
    @XmlEnumValue("tickets")
    TICKETS("tickets"),
    @XmlEnumValue("assistance")
    ASSISTANCE("assistance"),
    @XmlEnumValue("sosPhone")
    SOS_PHONE("sosPhone"),
    @XmlEnumValue("touchPoint")
    TOUCH_POINT("touchPoint"),
    @XmlEnumValue("meetingPoint")
    MEETING_POINT("meetingPoint"),
    @XmlEnumValue("transportModePoint")
    TRANSPORT_MODE_POINT("transportModePoint"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    SignContentEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SignContentEnumeration fromValue(String v) {
        for (SignContentEnumeration c: SignContentEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
