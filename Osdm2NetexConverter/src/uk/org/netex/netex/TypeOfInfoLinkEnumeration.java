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
 * <p>Java-Klasse f�r TypeOfInfoLinkEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfInfoLinkEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="contact"/>
 *     &lt;enumeration value="resource"/>
 *     &lt;enumeration value="info"/>
 *     &lt;enumeration value="image"/>
 *     &lt;enumeration value="document"/>
 *     &lt;enumeration value="timetableDocument"/>
 *     &lt;enumeration value="fareSheet"/>
 *     &lt;enumeration value="dataLicence"/>
 *     &lt;enumeration value="mobileAppDownload"/>
 *     &lt;enumeration value="mobileAppInstallCheck"/>
 *     &lt;enumeration value="map"/>
 *     &lt;enumeration value="icon"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeOfInfoLinkEnumeration")
@XmlEnum
public enum TypeOfInfoLinkEnumeration {

    @XmlEnumValue("contact")
    CONTACT("contact"),
    @XmlEnumValue("resource")
    RESOURCE("resource"),
    @XmlEnumValue("info")
    INFO("info"),
    @XmlEnumValue("image")
    IMAGE("image"),
    @XmlEnumValue("document")
    DOCUMENT("document"),
    @XmlEnumValue("timetableDocument")
    TIMETABLE_DOCUMENT("timetableDocument"),
    @XmlEnumValue("fareSheet")
    FARE_SHEET("fareSheet"),
    @XmlEnumValue("dataLicence")
    DATA_LICENCE("dataLicence"),
    @XmlEnumValue("mobileAppDownload")
    MOBILE_APP_DOWNLOAD("mobileAppDownload"),
    @XmlEnumValue("mobileAppInstallCheck")
    MOBILE_APP_INSTALL_CHECK("mobileAppInstallCheck"),
    @XmlEnumValue("map")
    MAP("map"),
    @XmlEnumValue("icon")
    ICON("icon"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TypeOfInfoLinkEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfInfoLinkEnumeration fromValue(String v) {
        for (TypeOfInfoLinkEnumeration c: TypeOfInfoLinkEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
