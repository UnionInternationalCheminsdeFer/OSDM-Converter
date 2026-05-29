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
 * <p>Java-Klasse f�r PassageTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PassageTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="pathway"/>
 *     &lt;enumeration value="corridor"/>
 *     &lt;enumeration value="overpass"/>
 *     &lt;enumeration value="underpass"/>
 *     &lt;enumeration value="tunnel"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PassageTypeEnumeration")
@XmlEnum
public enum PassageTypeEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("pathway")
    PATHWAY("pathway"),
    @XmlEnumValue("corridor")
    CORRIDOR("corridor"),
    @XmlEnumValue("overpass")
    OVERPASS("overpass"),
    @XmlEnumValue("underpass")
    UNDERPASS("underpass"),
    @XmlEnumValue("tunnel")
    TUNNEL("tunnel"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PassageTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PassageTypeEnumeration fromValue(String v) {
        for (PassageTypeEnumeration c: PassageTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
