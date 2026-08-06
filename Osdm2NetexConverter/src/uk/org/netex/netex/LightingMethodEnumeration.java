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
 * <p>Java-Klasse f�r LightingMethodEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LightingMethodEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="movementDetector"/>
 *     &lt;enumeration value="steppingDetector"/>
 *     &lt;enumeration value="switchOnTheWall"/>
 *     &lt;enumeration value="atDoorOpening"/>
 *     &lt;enumeration value="onlyAtNight"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LightingMethodEnumeration")
@XmlEnum
public enum LightingMethodEnumeration {

    @XmlEnumValue("movementDetector")
    MOVEMENT_DETECTOR("movementDetector"),
    @XmlEnumValue("steppingDetector")
    STEPPING_DETECTOR("steppingDetector"),
    @XmlEnumValue("switchOnTheWall")
    SWITCH_ON_THE_WALL("switchOnTheWall"),
    @XmlEnumValue("atDoorOpening")
    AT_DOOR_OPENING("atDoorOpening"),
    @XmlEnumValue("onlyAtNight")
    ONLY_AT_NIGHT("onlyAtNight"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    LightingMethodEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LightingMethodEnumeration fromValue(String v) {
        for (LightingMethodEnumeration c: LightingMethodEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
