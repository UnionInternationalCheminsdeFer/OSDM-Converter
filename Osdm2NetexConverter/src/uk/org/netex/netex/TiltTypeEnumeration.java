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
 * <p>Java-Klasse f�r TiltTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TiltTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="strongLeftTilt"/>
 *     &lt;enumeration value="mediumLeftTilt"/>
 *     &lt;enumeration value="nearlyFlat"/>
 *     &lt;enumeration value="mediumRightTilt"/>
 *     &lt;enumeration value="strongRightTilt"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TiltTypeEnumeration")
@XmlEnum
public enum TiltTypeEnumeration {

    @XmlEnumValue("strongLeftTilt")
    STRONG_LEFT_TILT("strongLeftTilt"),
    @XmlEnumValue("mediumLeftTilt")
    MEDIUM_LEFT_TILT("mediumLeftTilt"),
    @XmlEnumValue("nearlyFlat")
    NEARLY_FLAT("nearlyFlat"),
    @XmlEnumValue("mediumRightTilt")
    MEDIUM_RIGHT_TILT("mediumRightTilt"),
    @XmlEnumValue("strongRightTilt")
    STRONG_RIGHT_TILT("strongRightTilt"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    TiltTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TiltTypeEnumeration fromValue(String v) {
        for (TiltTypeEnumeration c: TiltTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
