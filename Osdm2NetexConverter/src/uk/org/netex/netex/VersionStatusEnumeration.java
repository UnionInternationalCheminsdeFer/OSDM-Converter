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
 * <p>Java-Klasse f�r VersionStatusEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VersionStatusEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="draft"/>
 *     &lt;enumeration value="proposed"/>
 *     &lt;enumeration value="versioned"/>
 *     &lt;enumeration value="deprecated"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VersionStatusEnumeration")
@XmlEnum
public enum VersionStatusEnumeration {


    /**
     * This version is a draft: it is currently under construction and should not be used for operational purposes.
     * 
     */
    @XmlEnumValue("draft")
    DRAFT("draft"),

    /**
     * This version is comprehensive but not yet validated.
     * 
     */
    @XmlEnumValue("proposed")
    PROPOSED("proposed"),

    /**
     * This is a finalised version frozen from further modifications.
     * 
     */
    @XmlEnumValue("versioned")
    VERSIONED("versioned"),

    /**
     * This is an old version: it should not be used for operational purposes any more.
     * 
     */
    @XmlEnumValue("deprecated")
    DEPRECATED("deprecated"),

    /**
     * Like draft, proposed, and deprecated, this version should not be used for operational purposes (for other reasons, however).
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    VersionStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VersionStatusEnumeration fromValue(String v) {
        for (VersionStatusEnumeration c: VersionStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
