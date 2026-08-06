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
 * <p>Java-Klasse f�r DoorTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DoorTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="hingedSingle"/>
 *     &lt;enumeration value="hingedPair"/>
 *     &lt;enumeration value="slidingSingle"/>
 *     &lt;enumeration value="slidingPair"/>
 *     &lt;enumeration value="foldingSingle"/>
 *     &lt;enumeration value="foldingPair"/>
 *     &lt;enumeration value="hingedRamp"/>
 *     &lt;enumeration value="revolving"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DoorTypeEnumeration")
@XmlEnum
public enum DoorTypeEnumeration {


    /**
     * Single door, hinged at one side.
     * 
     */
    @XmlEnumValue("hingedSingle")
    HINGED_SINGLE("hingedSingle"),

    /**
     * Pair of doors, hinged at either side of ENTRANCE.
     * 
     */
    @XmlEnumValue("hingedPair")
    HINGED_PAIR("hingedPair"),

    /**
     * Single door, sliding to one side.
     * 
     */
    @XmlEnumValue("slidingSingle")
    SLIDING_SINGLE("slidingSingle"),

    /**
     * Pair of sliding doors, sliding apart to each side.
     * 
     */
    @XmlEnumValue("slidingPair")
    SLIDING_PAIR("slidingPair"),

    /**
     * Single door, folding to one side.
     * 
     */
    @XmlEnumValue("foldingSingle")
    FOLDING_SINGLE("foldingSingle"),

    /**
     * Pair of folding doors, folding to each side.
     * 
     */
    @XmlEnumValue("foldingPair")
    FOLDING_PAIR("foldingPair"),

    /**
     * Door hinged at bottom to drop down as boarding ramp.
     * 
     */
    @XmlEnumValue("hingedRamp")
    HINGED_RAMP("hingedRamp"),

    /**
     * Revolving door. Which might be an obstacle for wheelchairs.
     * 
     */
    @XmlEnumValue("revolving")
    REVOLVING("revolving"),

    /**
     * Other type of door
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    DoorTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DoorTypeEnumeration fromValue(String v) {
        for (DoorTypeEnumeration c: DoorTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
