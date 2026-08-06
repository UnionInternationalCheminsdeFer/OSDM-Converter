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
 * <p>Java-Klasse f�r RampTurningSpacePositionEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RampTurningSpacePositionEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="bottom"/>
 *     &lt;enumeration value="top"/>
 *     &lt;enumeration value="topAndBottom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RampTurningSpacePositionEnumeration")
@XmlEnum
public enum RampTurningSpacePositionEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("bottom")
    BOTTOM("bottom"),
    @XmlEnumValue("top")
    TOP("top"),
    @XmlEnumValue("topAndBottom")
    TOP_AND_BOTTOM("topAndBottom");
    private final String value;

    RampTurningSpacePositionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RampTurningSpacePositionEnumeration fromValue(String v) {
        for (RampTurningSpacePositionEnumeration c: RampTurningSpacePositionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
