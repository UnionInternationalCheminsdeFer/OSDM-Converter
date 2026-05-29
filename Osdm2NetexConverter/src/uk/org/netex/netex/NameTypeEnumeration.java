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
 * <p>Java-Klasse f�r NameTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="alias"/>
 *     &lt;enumeration value="translation"/>
 *     &lt;enumeration value="copy"/>
 *     &lt;enumeration value="label"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameTypeEnumeration")
@XmlEnum
public enum NameTypeEnumeration {

    @XmlEnumValue("alias")
    ALIAS("alias"),

    /**
     * Deprecated in v2.0 for AlternativeName. Use MultiligualString directly with Text subelements.
     * 
     */
    @XmlEnumValue("translation")
    TRANSLATION("translation"),
    @XmlEnumValue("copy")
    COPY("copy"),
    @XmlEnumValue("label")
    LABEL("label"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    NameTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameTypeEnumeration fromValue(String v) {
        for (NameTypeEnumeration c: NameTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
