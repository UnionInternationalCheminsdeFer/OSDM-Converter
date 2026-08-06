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
 * <p>Java-Klasse f�r StepConditionEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="StepConditionEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="even"/>
 *     &lt;enumeration value="uneven"/>
 *     &lt;enumeration value="rough"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StepConditionEnumeration")
@XmlEnum
public enum StepConditionEnumeration {


    /**
     * The staircase has regular steps, all of the same height and depth.
     * 
     */
    @XmlEnumValue("even")
    EVEN("even"),

    /**
     * The steps are not all the same size.
     * 
     */
    @XmlEnumValue("uneven")
    UNEVEN("uneven"),

    /**
     * The steps are very different in size, some may be missing or steeply sloped.
     * 
     */
    @XmlEnumValue("rough")
    ROUGH("rough");
    private final String value;

    StepConditionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StepConditionEnumeration fromValue(String v) {
        for (StepConditionEnumeration c: StepConditionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
