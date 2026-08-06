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
 * <p>Java-Klasse f�r ModificationEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ModificationEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="new"/>
 *     &lt;enumeration value="revise"/>
 *     &lt;enumeration value="delete"/>
 *     &lt;enumeration value="unchanged"/>
 *     &lt;enumeration value="delta"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ModificationEnumeration")
@XmlEnum
public enum ModificationEnumeration {


    /**
     * This is a definition of a new entity.
     * 
     */
    @XmlEnumValue("new")
    NEW("new"),

    /**
     * This is a revision to an existing entity. All values are replaced.
     * 
     */
    @XmlEnumValue("revise")
    REVISE("revise"),

    /**
     * This is a deletion of an existing entity.
     * 
     */
    @XmlEnumValue("delete")
    DELETE("delete"),

    /**
     * This is a repeat of the values to an entity that has not change since the previous version. All values are replaced.
     * 
     */
    @XmlEnumValue("unchanged")
    UNCHANGED("unchanged"),

    /**
     * This is just the changes to a previous version of an entity. Optional values are only provided if they have changed.
     * 
     */
    @XmlEnumValue("delta")
    DELTA("delta");
    private final String value;

    ModificationEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModificationEnumeration fromValue(String v) {
        for (ModificationEnumeration c: ModificationEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
