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
 * <p>Java-Klasse f�r VehicleCollectionEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleCollectionEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="onSite"/>
 *     &lt;enumeration value="offSiteShuttle"/>
 *     &lt;enumeration value="offSite"/>
 *     &lt;enumeration value="meetAndGreet"/>
 *     &lt;enumeration value="floating"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleCollectionEnumeration")
@XmlEnum
public enum VehicleCollectionEnumeration {

    @XmlEnumValue("onSite")
    ON_SITE("onSite"),
    @XmlEnumValue("offSiteShuttle")
    OFF_SITE_SHUTTLE("offSiteShuttle"),
    @XmlEnumValue("offSite")
    OFF_SITE("offSite"),
    @XmlEnumValue("meetAndGreet")
    MEET_AND_GREET("meetAndGreet"),
    @XmlEnumValue("floating")
    FLOATING("floating"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    VehicleCollectionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleCollectionEnumeration fromValue(String v) {
        for (VehicleCollectionEnumeration c: VehicleCollectionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
