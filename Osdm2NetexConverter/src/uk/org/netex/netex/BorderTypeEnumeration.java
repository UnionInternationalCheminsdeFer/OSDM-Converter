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
 * <p>Java-Klasse f�r BorderTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BorderTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="wall"/>
 *     &lt;enumeration value="grass"/>
 *     &lt;enumeration value="earth"/>
 *     &lt;enumeration value="barrier"/>
 *     &lt;enumeration value="road"/>
 *     &lt;enumeration value="cyclingLane"/>
 *     &lt;enumeration value="step"/>
 *     &lt;enumeration value="rail"/>
 *     &lt;enumeration value="plants"/>
 *     &lt;enumeration value="trees"/>
 *     &lt;enumeration value="mud"/>
 *     &lt;enumeration value="solidEdge"/>
 *     &lt;enumeration value="water"/>
 *     &lt;enumeration value="gravel"/>
 *     &lt;enumeration value="handrail"/>
 *     &lt;enumeration value="noPhysicalBorder"/>
 *     &lt;enumeration value="otherPhysicalBorder"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BorderTypeEnumeration")
@XmlEnum
public enum BorderTypeEnumeration {

    @XmlEnumValue("wall")
    WALL("wall"),
    @XmlEnumValue("grass")
    GRASS("grass"),
    @XmlEnumValue("earth")
    EARTH("earth"),
    @XmlEnumValue("barrier")
    BARRIER("barrier"),
    @XmlEnumValue("road")
    ROAD("road"),
    @XmlEnumValue("cyclingLane")
    CYCLING_LANE("cyclingLane"),
    @XmlEnumValue("step")
    STEP("step"),
    @XmlEnumValue("rail")
    RAIL("rail"),
    @XmlEnumValue("plants")
    PLANTS("plants"),
    @XmlEnumValue("trees")
    TREES("trees"),
    @XmlEnumValue("mud")
    MUD("mud"),
    @XmlEnumValue("solidEdge")
    SOLID_EDGE("solidEdge"),
    @XmlEnumValue("water")
    WATER("water"),
    @XmlEnumValue("gravel")
    GRAVEL("gravel"),
    @XmlEnumValue("handrail")
    HANDRAIL("handrail"),
    @XmlEnumValue("noPhysicalBorder")
    NO_PHYSICAL_BORDER("noPhysicalBorder"),
    @XmlEnumValue("otherPhysicalBorder")
    OTHER_PHYSICAL_BORDER("otherPhysicalBorder"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    BorderTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BorderTypeEnumeration fromValue(String v) {
        for (BorderTypeEnumeration c: BorderTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
