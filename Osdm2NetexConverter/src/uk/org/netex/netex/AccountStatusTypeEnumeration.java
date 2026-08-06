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
 * <p>Java-Klasse f�r AccountStatusTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountStatusTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="unused"/>
 *     &lt;enumeration value="unverified"/>
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="dormant"/>
 *     &lt;enumeration value="suspended"/>
 *     &lt;enumeration value="archived"/>
 *     &lt;enumeration value="closed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountStatusTypeEnumeration")
@XmlEnum
public enum AccountStatusTypeEnumeration {

    @XmlEnumValue("unused")
    UNUSED("unused"),

    /**
     * Not yet verified. +v1.2.2
     * 
     */
    @XmlEnumValue("unverified")
    UNVERIFIED("unverified"),
    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("dormant")
    DORMANT("dormant"),

    /**
     * Temporarily disabled.
     * 
     */
    @XmlEnumValue("suspended")
    SUSPENDED("suspended"),
    @XmlEnumValue("archived")
    ARCHIVED("archived"),
    @XmlEnumValue("closed")
    CLOSED("closed");
    private final String value;

    AccountStatusTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountStatusTypeEnumeration fromValue(String v) {
        for (AccountStatusTypeEnumeration c: AccountStatusTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
