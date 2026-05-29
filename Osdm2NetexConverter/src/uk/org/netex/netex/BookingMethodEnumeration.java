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
 * <p>Java-Klasse f�r BookingMethodEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BookingMethodEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="callDriver"/>
 *     &lt;enumeration value="callOffice"/>
 *     &lt;enumeration value="online"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="phoneAtStop"/>
 *     &lt;enumeration value="text"/>
 *     &lt;enumeration value="mobileApp"/>
 *     &lt;enumeration value="atOffice"/>
 *     &lt;enumeration value="none"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BookingMethodEnumeration")
@XmlEnum
public enum BookingMethodEnumeration {

    @XmlEnumValue("callDriver")
    CALL_DRIVER("callDriver"),
    @XmlEnumValue("callOffice")
    CALL_OFFICE("callOffice"),
    @XmlEnumValue("online")
    ONLINE("online"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("phoneAtStop")
    PHONE_AT_STOP("phoneAtStop"),
    @XmlEnumValue("text")
    TEXT("text"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("mobileApp")
    MOBILE_APP("mobileApp"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("atOffice")
    AT_OFFICE("atOffice"),
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    BookingMethodEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BookingMethodEnumeration fromValue(String v) {
        for (BookingMethodEnumeration c: BookingMethodEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
