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
 * <p>Java-Klasse f�r LightingControlFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LightingControlFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="tintedWindows"/>
 *     &lt;enumeration value="blinds"/>
 *     &lt;enumeration value="curtains"/>
 *     &lt;enumeration value="dimmableLights"/>
 *     &lt;enumeration value="lightsAlwaysOn"/>
 *     &lt;enumeration value="noNaturalLight"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LightingControlFacilityEnumeration")
@XmlEnum
public enum LightingControlFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("tintedWindows")
    TINTED_WINDOWS("tintedWindows"),
    @XmlEnumValue("blinds")
    BLINDS("blinds"),
    @XmlEnumValue("curtains")
    CURTAINS("curtains"),
    @XmlEnumValue("dimmableLights")
    DIMMABLE_LIGHTS("dimmableLights"),
    @XmlEnumValue("lightsAlwaysOn")
    LIGHTS_ALWAYS_ON("lightsAlwaysOn"),
    @XmlEnumValue("noNaturalLight")
    NO_NATURAL_LIGHT("noNaturalLight"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    LightingControlFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LightingControlFacilityEnumeration fromValue(String v) {
        for (LightingControlFacilityEnumeration c: LightingControlFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
