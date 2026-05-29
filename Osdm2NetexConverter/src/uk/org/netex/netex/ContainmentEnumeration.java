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
 * <p>Java-Klasse f�r ContainmentEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ContainmentEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="inline"/>
 *     &lt;enumeration value="byReference"/>
 *     &lt;enumeration value="byVersionedReference"/>
 *     &lt;enumeration value="both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContainmentEnumeration")
@XmlEnum
public enum ContainmentEnumeration {


    /**
     * This is a definition of a new entity.
     * 
     */
    @XmlEnumValue("inline")
    INLINE("inline"),

    /**
     * This is a deletion of an existing entity.
     * 
     */
    @XmlEnumValue("byReference")
    BY_REFERENCE("byReference"),
    @XmlEnumValue("byVersionedReference")
    BY_VERSIONED_REFERENCE("byVersionedReference"),
    @XmlEnumValue("both")
    BOTH("both");
    private final String value;

    ContainmentEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContainmentEnumeration fromValue(String v) {
        for (ContainmentEnumeration c: ContainmentEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
