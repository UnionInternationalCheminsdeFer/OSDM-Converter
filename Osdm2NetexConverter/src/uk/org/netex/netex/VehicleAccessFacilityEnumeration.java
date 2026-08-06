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
 * <p>Java-Klasse f�r VehicleAccessFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleAccessFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="wheelchairLift"/>
 *     &lt;enumeration value="manualRamp"/>
 *     &lt;enumeration value="automaticRamp"/>
 *     &lt;enumeration value="steps"/>
 *     &lt;enumeration value="slidingStep"/>
 *     &lt;enumeration value="narrowEntrance"/>
 *     &lt;enumeration value="validator"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleAccessFacilityEnumeration")
@XmlEnum
public enum VehicleAccessFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("wheelchairLift")
    WHEELCHAIR_LIFT("wheelchairLift"),
    @XmlEnumValue("manualRamp")
    MANUAL_RAMP("manualRamp"),
    @XmlEnumValue("automaticRamp")
    AUTOMATIC_RAMP("automaticRamp"),
    @XmlEnumValue("steps")
    STEPS("steps"),
    @XmlEnumValue("slidingStep")
    SLIDING_STEP("slidingStep"),
    @XmlEnumValue("narrowEntrance")
    NARROW_ENTRANCE("narrowEntrance"),
    @XmlEnumValue("validator")
    VALIDATOR("validator");
    private final String value;

    VehicleAccessFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleAccessFacilityEnumeration fromValue(String v) {
        for (VehicleAccessFacilityEnumeration c: VehicleAccessFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
