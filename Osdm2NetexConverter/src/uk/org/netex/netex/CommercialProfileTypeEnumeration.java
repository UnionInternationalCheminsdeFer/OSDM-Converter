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
 * <p>Java-Klasse f�r CommercialProfileTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CommercialProfileTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="unlimited"/>
 *     &lt;enumeration value="limited"/>
 *     &lt;enumeration value="single"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommercialProfileTypeEnumeration")
@XmlEnum
public enum CommercialProfileTypeEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("unlimited")
    UNLIMITED("unlimited"),
    @XmlEnumValue("limited")
    LIMITED("limited"),
    @XmlEnumValue("single")
    SINGLE("single");
    private final String value;

    CommercialProfileTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommercialProfileTypeEnumeration fromValue(String v) {
        for (CommercialProfileTypeEnumeration c: CommercialProfileTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
