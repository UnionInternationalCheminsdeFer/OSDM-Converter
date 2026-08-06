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
 * <p>Java-Klasse f�r PublicUseEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PublicUseEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="all"/>
 *     &lt;enumeration value="disabledPublicOnly"/>
 *     &lt;enumeration value="authorisedPublicOnly"/>
 *     &lt;enumeration value="staffOnly"/>
 *     &lt;enumeration value="publicOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PublicUseEnumeration")
@XmlEnum
public enum PublicUseEnumeration {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("disabledPublicOnly")
    DISABLED_PUBLIC_ONLY("disabledPublicOnly"),
    @XmlEnumValue("authorisedPublicOnly")
    AUTHORISED_PUBLIC_ONLY("authorisedPublicOnly"),
    @XmlEnumValue("staffOnly")
    STAFF_ONLY("staffOnly"),
    @XmlEnumValue("publicOnly")
    PUBLIC_ONLY("publicOnly");
    private final String value;

    PublicUseEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PublicUseEnumeration fromValue(String v) {
        for (PublicUseEnumeration c: PublicUseEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
