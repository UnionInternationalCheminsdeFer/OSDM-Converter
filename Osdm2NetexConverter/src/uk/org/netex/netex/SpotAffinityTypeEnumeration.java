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
 * <p>Java-Klasse f�r SpotAffinityTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SpotAffinityTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="faceToFace"/>
 *     &lt;enumeration value="sideBySide"/>
 *     &lt;enumeration value="contiguousRow"/>
 *     &lt;enumeration value="sharedTable"/>
 *     &lt;enumeration value="seatBlock"/>
 *     &lt;enumeration value="lowerBerths"/>
 *     &lt;enumeration value="sharedCompartment"/>
 *     &lt;enumeration value="wheelchairCompanionSeat"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpotAffinityTypeEnumeration")
@XmlEnum
public enum SpotAffinityTypeEnumeration {


    /**
     * Spot is facing another spot in the affinity.
     * 
     */
    @XmlEnumValue("faceToFace")
    FACE_TO_FACE("faceToFace"),

    /**
     * Spot is next to another spot in the affinity.
     * 
     */
    @XmlEnumValue("sideBySide")
    SIDE_BY_SIDE("sideBySide"),

    /**
     * Spot is in a contiguous row making up the spots in the affinity.
     * 
     */
    @XmlEnumValue("contiguousRow")
    CONTIGUOUS_ROW("contiguousRow"),

    /**
     * Spot is around a table.
     * 
     */
    @XmlEnumValue("sharedTable")
    SHARED_TABLE("sharedTable"),

    /**
     * Spot is around a table.
     * 
     */
    @XmlEnumValue("seatBlock")
    SEAT_BLOCK("seatBlock"),

    /**
     * Spot is in a lower berth adjacent to another lower berth.
     * 
     */
    @XmlEnumValue("lowerBerths")
    LOWER_BERTHS("lowerBerths"),

    /**
     * Spot is in the same compartment as another spot.
     * 
     */
    @XmlEnumValue("sharedCompartment")
    SHARED_COMPARTMENT("sharedCompartment"),

    /**
     * Spot is a companion seat beside a wheelchair space.
     * 
     */
    @XmlEnumValue("wheelchairCompanionSeat")
    WHEELCHAIR_COMPANION_SEAT("wheelchairCompanionSeat"),

    /**
     * Other affinity.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    SpotAffinityTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpotAffinityTypeEnumeration fromValue(String v) {
        for (SpotAffinityTypeEnumeration c: SpotAffinityTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
