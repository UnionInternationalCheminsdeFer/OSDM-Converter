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
 * <p>Java-Klasse f�r FontSizeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FontSizeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="verySmall"/>
 *     &lt;enumeration value="small"/>
 *     &lt;enumeration value="medium"/>
 *     &lt;enumeration value="large"/>
 *     &lt;enumeration value="veryLarge"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FontSizeEnumeration")
@XmlEnum
public enum FontSizeEnumeration {

    @XmlEnumValue("verySmall")
    VERY_SMALL("verySmall"),
    @XmlEnumValue("small")
    SMALL("small"),
    @XmlEnumValue("medium")
    MEDIUM("medium"),
    @XmlEnumValue("large")
    LARGE("large"),
    @XmlEnumValue("veryLarge")
    VERY_LARGE("veryLarge");
    private final String value;

    FontSizeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FontSizeEnumeration fromValue(String v) {
        for (FontSizeEnumeration c: FontSizeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
