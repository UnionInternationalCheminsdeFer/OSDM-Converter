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
 * <p>Java-Klasse f�r BollardCrossingEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BollardCrossingEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="contrasted"/>
 *     &lt;enumeration value="yes"/>
 *     &lt;enumeration value="partial"/>
 *     &lt;enumeration value="limited"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BollardCrossingEnumeration")
@XmlEnum
public enum BollardCrossingEnumeration {

    @XmlEnumValue("none")
    NONE("none"),

    /**
     * Bollards on both sides and well contrasted with the environment.
     * 
     */
    @XmlEnumValue("contrasted")
    CONTRASTED("contrasted"),

    /**
     * Bollards on either side of the crossing (with no information about the contrast).
     * 
     */
    @XmlEnumValue("yes")
    YES("yes"),

    /**
     * Bollards only on one side of the crossing.
     * 
     */
    @XmlEnumValue("partial")
    PARTIAL("partial"),

    /**
     * Bollards present but too low or poorly positioned in relation to the crossing.
     * 
     */
    @XmlEnumValue("limited")
    LIMITED("limited");
    private final String value;

    BollardCrossingEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BollardCrossingEnumeration fromValue(String v) {
        for (BollardCrossingEnumeration c: BollardCrossingEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
