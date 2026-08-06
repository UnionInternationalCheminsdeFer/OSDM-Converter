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
 * <p>Java-Klasse f�r DataRoleTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataRoleTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="all"/>
 *     &lt;enumeration value="creates"/>
 *     &lt;enumeration value="augments"/>
 *     &lt;enumeration value="validates"/>
 *     &lt;enumeration value="collects"/>
 *     &lt;enumeration value="aggregates"/>
 *     &lt;enumeration value="distributes"/>
 *     &lt;enumeration value="secures"/>
 *     &lt;enumeration value="redistributes"/>
 *     &lt;enumeration value="supports"/>
 *     &lt;enumeration value="owns"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataRoleTypeEnumeration")
@XmlEnum
public enum DataRoleTypeEnumeration {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("creates")
    CREATES("creates"),
    @XmlEnumValue("augments")
    AUGMENTS("augments"),
    @XmlEnumValue("validates")
    VALIDATES("validates"),
    @XmlEnumValue("collects")
    COLLECTS("collects"),
    @XmlEnumValue("aggregates")
    AGGREGATES("aggregates"),
    @XmlEnumValue("distributes")
    DISTRIBUTES("distributes"),
    @XmlEnumValue("secures")
    SECURES("secures"),
    @XmlEnumValue("redistributes")
    REDISTRIBUTES("redistributes"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("supports")
    SUPPORTS("supports"),
    @XmlEnumValue("owns")
    OWNS("owns"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    DataRoleTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataRoleTypeEnumeration fromValue(String v) {
        for (DataRoleTypeEnumeration c: DataRoleTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
