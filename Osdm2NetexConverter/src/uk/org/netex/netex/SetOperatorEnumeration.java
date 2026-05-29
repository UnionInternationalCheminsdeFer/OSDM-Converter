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
 * <p>Java-Klasse f�r SetOperatorEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SetOperatorEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="oneOfAnyOneSet"/>
 *     &lt;enumeration value="oneOfEachSet"/>
 *     &lt;enumeration value="someOfAnySet"/>
 *     &lt;enumeration value="allOfOneSet"/>
 *     &lt;enumeration value="allOfAllSets"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SetOperatorEnumeration")
@XmlEnum
public enum SetOperatorEnumeration {


    /**
     * Only one item from all referenced GROUPs OF ENTITTies of a given type may be selected/has been selected.
     * 
     */
    @XmlEnumValue("oneOfAnyOneSet")
    ONE_OF_ANY_ONE_SET("oneOfAnyOneSet"),

    /**
     * One item from each specified referenced GROUP OF ENTITTies of a given type must be selected/has been selected..
     * 
     */
    @XmlEnumValue("oneOfEachSet")
    ONE_OF_EACH_SET("oneOfEachSet"),

    /**
     * Multiple items from any referenced GROUP OF ENTITTies of a given type may be selected/have been selected.
     * 
     */
    @XmlEnumValue("someOfAnySet")
    SOME_OF_ANY_SET("someOfAnySet"),

    /**
     * All items from one specified referenced GROUP OF ENTITTies of a given type may be selected/have been selected.
     * 
     */
    @XmlEnumValue("allOfOneSet")
    ALL_OF_ONE_SET("allOfOneSet"),

    /**
     * All items from all referenced GROUPs OF ENTITTies of a given type may be selected/have been selected.
     * 
     */
    @XmlEnumValue("allOfAllSets")
    ALL_OF_ALL_SETS("allOfAllSets");
    private final String value;

    SetOperatorEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SetOperatorEnumeration fromValue(String v) {
        for (SetOperatorEnumeration c: SetOperatorEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
