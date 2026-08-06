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
 * <p>Java-Klasse f�r SiteTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="school"/>
 *     &lt;enumeration value="university"/>
 *     &lt;enumeration value="works"/>
 *     &lt;enumeration value="office"/>
 *     &lt;enumeration value="militaryBase"/>
 *     &lt;enumeration value="retail"/>
 *     &lt;enumeration value="transport"/>
 *     &lt;enumeration value="sports"/>
 *     &lt;enumeration value="government"/>
 *     &lt;enumeration value="culturalAttraction"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SiteTypeEnumeration")
@XmlEnum
public enum SiteTypeEnumeration {

    @XmlEnumValue("school")
    SCHOOL("school"),
    @XmlEnumValue("university")
    UNIVERSITY("university"),
    @XmlEnumValue("works")
    WORKS("works"),
    @XmlEnumValue("office")
    OFFICE("office"),
    @XmlEnumValue("militaryBase")
    MILITARY_BASE("militaryBase"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("retail")
    RETAIL("retail"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("transport")
    TRANSPORT("transport"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("sports")
    SPORTS("sports"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("government")
    GOVERNMENT("government"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("culturalAttraction")
    CULTURAL_ATTRACTION("culturalAttraction"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    SiteTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SiteTypeEnumeration fromValue(String v) {
        for (SiteTypeEnumeration c: SiteTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
