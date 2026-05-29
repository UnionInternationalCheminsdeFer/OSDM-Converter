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
 * <p>Java-Klasse f�r ModificationSetEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ModificationSetEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="all"/>
 *     &lt;enumeration value="changesOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ModificationSetEnumeration")
@XmlEnum
public enum ModificationSetEnumeration {


    /**
     * This incldues definitions of one ore more new entities.
     * 
     */
    @XmlEnumValue("all")
    ALL("all"),

    /**
     * This is just the modifications (addition, revision, deletion); entities which are unchanged are omitted.
     * 
     */
    @XmlEnumValue("changesOnly")
    CHANGES_ONLY("changesOnly");
    private final String value;

    ModificationSetEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModificationSetEnumeration fromValue(String v) {
        for (ModificationSetEnumeration c: ModificationSetEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
