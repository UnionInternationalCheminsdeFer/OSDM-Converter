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
 * <p>Java-Klasse f�r DynamicAdvertisementEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DynamicAdvertisementEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="always"/>
 *     &lt;enumeration value="never"/>
 *     &lt;enumeration value="onlyIfOrdered"/>
 *     &lt;enumeration value="onlyIfSignedOn"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DynamicAdvertisementEnumeration")
@XmlEnum
public enum DynamicAdvertisementEnumeration {


    /**
     * Stop is always advertised to public.
     * 
     */
    @XmlEnumValue("always")
    ALWAYS("always"),

    /**
     * Stop is not advertised to public.
     * 
     */
    @XmlEnumValue("never")
    NEVER("never"),

    /**
     * Stop is only advertised to public if they booked to go to stop.
     * 
     */
    @XmlEnumValue("onlyIfOrdered")
    ONLY_IF_ORDERED("onlyIfOrdered"),

    /**
     * Stop is only advertised to public if they are logged into system.
     * 
     */
    @XmlEnumValue("onlyIfSignedOn")
    ONLY_IF_SIGNED_ON("onlyIfSignedOn");
    private final String value;

    DynamicAdvertisementEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DynamicAdvertisementEnumeration fromValue(String v) {
        for (DynamicAdvertisementEnumeration c: DynamicAdvertisementEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
