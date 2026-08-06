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
 * <p>Java-Klasse f�r PassengerCommsFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PassengerCommsFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="freeWifi"/>
 *     &lt;enumeration value="publicWifi"/>
 *     &lt;enumeration value="powerSupplySockets"/>
 *     &lt;enumeration value="telephone"/>
 *     &lt;enumeration value="audioEntertainment"/>
 *     &lt;enumeration value="videoEntertainment"/>
 *     &lt;enumeration value="businessServices"/>
 *     &lt;enumeration value="internet"/>
 *     &lt;enumeration value="postOffice"/>
 *     &lt;enumeration value="postBox"/>
 *     &lt;enumeration value="usbAPowerSocket"/>
 *     &lt;enumeration value="usbCPowerSocket"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PassengerCommsFacilityEnumeration")
@XmlEnum
public enum PassengerCommsFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("freeWifi")
    FREE_WIFI("freeWifi"),
    @XmlEnumValue("publicWifi")
    PUBLIC_WIFI("publicWifi"),
    @XmlEnumValue("powerSupplySockets")
    POWER_SUPPLY_SOCKETS("powerSupplySockets"),

    /**
     * pti23_21
     * 
     */
    @XmlEnumValue("telephone")
    TELEPHONE("telephone"),

    /**
     * pti23_14
     * 
     */
    @XmlEnumValue("audioEntertainment")
    AUDIO_ENTERTAINMENT("audioEntertainment"),

    /**
     * pti23_15
     * 
     */
    @XmlEnumValue("videoEntertainment")
    VIDEO_ENTERTAINMENT("videoEntertainment"),

    /**
     * pti23_25
     * 
     */
    @XmlEnumValue("businessServices")
    BUSINESS_SERVICES("businessServices"),
    @XmlEnumValue("internet")
    INTERNET("internet"),
    @XmlEnumValue("postOffice")
    POST_OFFICE("postOffice"),
    @XmlEnumValue("postBox")
    POST_BOX("postBox"),

    /**
     * USB Power Supply with type A plug, and 5V DC with minimum 0.5A available.
     * 
     */
    @XmlEnumValue("usbAPowerSocket")
    USB_A_POWER_SOCKET("usbAPowerSocket"),

    /**
     * USB Power Supply with type C plug, and a minimum of 5V DC at 0.5A available.
     * 
     */
    @XmlEnumValue("usbCPowerSocket")
    USB_C_POWER_SOCKET("usbCPowerSocket"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PassengerCommsFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PassengerCommsFacilityEnumeration fromValue(String v) {
        for (PassengerCommsFacilityEnumeration c: PassengerCommsFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
