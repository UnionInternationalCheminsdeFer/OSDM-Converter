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
 * <p>Java-Klasse f�r CommunicationServiceEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CommunicationServiceEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="freeWifi"/>
 *     &lt;enumeration value="publicWifi"/>
 *     &lt;enumeration value="phone"/>
 *     &lt;enumeration value="internet"/>
 *     &lt;enumeration value="mobileCoverage"/>
 *     &lt;enumeration value="videoEntertainment"/>
 *     &lt;enumeration value="audioEntertainment"/>
 *     &lt;enumeration value="postbox"/>
 *     &lt;enumeration value="postOffice"/>
 *     &lt;enumeration value="businessServices"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommunicationServiceEnumeration")
@XmlEnum
public enum CommunicationServiceEnumeration {

    @XmlEnumValue("freeWifi")
    FREE_WIFI("freeWifi"),
    @XmlEnumValue("publicWifi")
    PUBLIC_WIFI("publicWifi"),
    @XmlEnumValue("phone")
    PHONE("phone"),
    @XmlEnumValue("internet")
    INTERNET("internet"),
    @XmlEnumValue("mobileCoverage")
    MOBILE_COVERAGE("mobileCoverage"),
    @XmlEnumValue("videoEntertainment")
    VIDEO_ENTERTAINMENT("videoEntertainment"),
    @XmlEnumValue("audioEntertainment")
    AUDIO_ENTERTAINMENT("audioEntertainment"),
    @XmlEnumValue("postbox")
    POSTBOX("postbox"),
    @XmlEnumValue("postOffice")
    POST_OFFICE("postOffice"),
    @XmlEnumValue("businessServices")
    BUSINESS_SERVICES("businessServices");
    private final String value;

    CommunicationServiceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommunicationServiceEnumeration fromValue(String v) {
        for (CommunicationServiceEnumeration c: CommunicationServiceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
