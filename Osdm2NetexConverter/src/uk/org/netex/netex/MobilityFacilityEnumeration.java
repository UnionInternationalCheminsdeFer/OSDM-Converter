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
 * <p>Java-Klasse f�r MobilityFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MobilityFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="lowFloor"/>
 *     &lt;enumeration value="stepFreeAccess"/>
 *     &lt;enumeration value="suitableForPushchairs"/>
 *     &lt;enumeration value="suitableForWheelchairs"/>
 *     &lt;enumeration value="suitableForHeaviliyDisabled"/>
 *     &lt;enumeration value="boardingAssistance"/>
 *     &lt;enumeration value="onboardAssistance"/>
 *     &lt;enumeration value="unaccompaniedMinorAssistance"/>
 *     &lt;enumeration value="tactilePlatformEdges"/>
 *     &lt;enumeration value="tactileGuidingStrips"/>
 *     &lt;enumeration value="raisedKerb"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MobilityFacilityEnumeration")
@XmlEnum
public enum MobilityFacilityEnumeration {


    /**
     * pti255_4
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * pti23_16_1
     * 
     */
    @XmlEnumValue("lowFloor")
    LOW_FLOOR("lowFloor"),

    /**
     * pti23_16_3
     * 
     */
    @XmlEnumValue("stepFreeAccess")
    STEP_FREE_ACCESS("stepFreeAccess"),
    @XmlEnumValue("suitableForPushchairs")
    SUITABLE_FOR_PUSHCHAIRS("suitableForPushchairs"),

    /**
     * pti23_16_1
     * 
     */
    @XmlEnumValue("suitableForWheelchairs")
    SUITABLE_FOR_WHEELCHAIRS("suitableForWheelchairs"),
    @XmlEnumValue("suitableForHeaviliyDisabled")
    SUITABLE_FOR_HEAVILIY_DISABLED("suitableForHeaviliyDisabled"),

    /**
     * pti23_16_2
     * 
     */
    @XmlEnumValue("boardingAssistance")
    BOARDING_ASSISTANCE("boardingAssistance"),
    @XmlEnumValue("onboardAssistance")
    ONBOARD_ASSISTANCE("onboardAssistance"),
    @XmlEnumValue("unaccompaniedMinorAssistance")
    UNACCOMPANIED_MINOR_ASSISTANCE("unaccompaniedMinorAssistance"),
    @XmlEnumValue("tactilePlatformEdges")
    TACTILE_PLATFORM_EDGES("tactilePlatformEdges"),
    @XmlEnumValue("tactileGuidingStrips")
    TACTILE_GUIDING_STRIPS("tactileGuidingStrips"),
    @XmlEnumValue("raisedKerb")
    RAISED_KERB("raisedKerb");
    private final String value;

    MobilityFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MobilityFacilityEnumeration fromValue(String v) {
        for (MobilityFacilityEnumeration c: MobilityFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
