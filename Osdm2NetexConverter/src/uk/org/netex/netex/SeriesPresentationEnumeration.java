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
 * <p>Java-Klasse f�r SeriesPresentationEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SeriesPresentationEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="required"/>
 *     &lt;enumeration value="optionalLeft"/>
 *     &lt;enumeration value="optionalRight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SeriesPresentationEnumeration")
@XmlEnum
public enum SeriesPresentationEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("required")
    REQUIRED("required"),
    @XmlEnumValue("optionalLeft")
    OPTIONAL_LEFT("optionalLeft"),
    @XmlEnumValue("optionalRight")
    OPTIONAL_RIGHT("optionalRight");
    private final String value;

    SeriesPresentationEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeriesPresentationEnumeration fromValue(String v) {
        for (SeriesPresentationEnumeration c: SeriesPresentationEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
