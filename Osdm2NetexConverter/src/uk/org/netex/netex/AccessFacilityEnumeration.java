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
 * <p>Java-Klasse f�r AccessFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="lift"/>
 *     &lt;enumeration value="wheelchairLift"/>
 *     &lt;enumeration value="escalator"/>
 *     &lt;enumeration value="travelator"/>
 *     &lt;enumeration value="ramp"/>
 *     &lt;enumeration value="automaticRamp"/>
 *     &lt;enumeration value="steps"/>
 *     &lt;enumeration value="stairs"/>
 *     &lt;enumeration value="slidingStep"/>
 *     &lt;enumeration value="shuttle"/>
 *     &lt;enumeration value="narrowEntrance"/>
 *     &lt;enumeration value="barrier"/>
 *     &lt;enumeration value="lowFloorAccess"/>
 *     &lt;enumeration value="validator"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccessFacilityEnumeration")
@XmlEnum
public enum AccessFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("lift")
    LIFT("lift"),
    @XmlEnumValue("wheelchairLift")
    WHEELCHAIR_LIFT("wheelchairLift"),
    @XmlEnumValue("escalator")
    ESCALATOR("escalator"),
    @XmlEnumValue("travelator")
    TRAVELATOR("travelator"),
    @XmlEnumValue("ramp")
    RAMP("ramp"),
    @XmlEnumValue("automaticRamp")
    AUTOMATIC_RAMP("automaticRamp"),
    @XmlEnumValue("steps")
    STEPS("steps"),
    @XmlEnumValue("stairs")
    STAIRS("stairs"),
    @XmlEnumValue("slidingStep")
    SLIDING_STEP("slidingStep"),
    @XmlEnumValue("shuttle")
    SHUTTLE("shuttle"),
    @XmlEnumValue("narrowEntrance")
    NARROW_ENTRANCE("narrowEntrance"),
    @XmlEnumValue("barrier")
    BARRIER("barrier"),
    @XmlEnumValue("lowFloorAccess")
    LOW_FLOOR_ACCESS("lowFloorAccess"),
    @XmlEnumValue("validator")
    VALIDATOR("validator");
    private final String value;

    AccessFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessFacilityEnumeration fromValue(String v) {
        for (AccessFacilityEnumeration c: AccessFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
