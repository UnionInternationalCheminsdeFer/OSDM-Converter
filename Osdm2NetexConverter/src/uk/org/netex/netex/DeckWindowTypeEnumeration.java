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
 * <p>Java-Klasse f�r DeckWindowTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DeckWindowTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="interspaced"/>
 *     &lt;enumeration value="continuous"/>
 *     &lt;enumeration value="panorama"/>
 *     &lt;enumeration value="porthole"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeckWindowTypeEnumeration")
@XmlEnum
public enum DeckWindowTypeEnumeration {


    /**
     * Window is interspaced by solid separators.
     * 
     */
    @XmlEnumValue("interspaced")
    INTERSPACED("interspaced"),

    /**
     * Window is interspaced by solid separators.
     * 
     */
    @XmlEnumValue("continuous")
    CONTINUOUS("continuous"),

    /**
     * Window is a large panorama window.
     * 
     */
    @XmlEnumValue("panorama")
    PANORAMA("panorama"),

    /**
     * Window is a porthole shaped window.
     * 
     */
    @XmlEnumValue("porthole")
    PORTHOLE("porthole"),

    /**
     * WOther type of Window.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    DeckWindowTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeckWindowTypeEnumeration fromValue(String v) {
        for (DeckWindowTypeEnumeration c: DeckWindowTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
