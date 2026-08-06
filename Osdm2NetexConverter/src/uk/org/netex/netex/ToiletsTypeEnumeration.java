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
 * <p>Java-Klasse f�r ToiletsTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ToiletsTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="seated"/>
 *     &lt;enumeration value="urinal"/>
 *     &lt;enumeration value="squat"/>
 *     &lt;enumeration value="seatedAndUrinal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ToiletsTypeEnumeration")
@XmlEnum
public enum ToiletsTypeEnumeration {

    @XmlEnumValue("seated")
    SEATED("seated"),
    @XmlEnumValue("urinal")
    URINAL("urinal"),
    @XmlEnumValue("squat")
    SQUAT("squat"),

    /**
     * Both seated and urinal positions are available in the toilet.
     * 
     */
    @XmlEnumValue("seatedAndUrinal")
    SEATED_AND_URINAL("seatedAndUrinal");
    private final String value;

    ToiletsTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ToiletsTypeEnumeration fromValue(String v) {
        for (ToiletsTypeEnumeration c: ToiletsTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
