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
 * <p>Java-Klasse f�r AccessFeatureEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessFeatureEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="lift"/>
 *     &lt;enumeration value="escalator"/>
 *     &lt;enumeration value="freightElevator"/>
 *     &lt;enumeration value="travelator"/>
 *     &lt;enumeration value="ramp"/>
 *     &lt;enumeration value="stairs"/>
 *     &lt;enumeration value="seriesOfStairs"/>
 *     &lt;enumeration value="ladder"/>
 *     &lt;enumeration value="shuttle"/>
 *     &lt;enumeration value="crossing"/>
 *     &lt;enumeration value="barrier"/>
 *     &lt;enumeration value="narrowEntrance"/>
 *     &lt;enumeration value="hall"/>
 *     &lt;enumeration value="concourse"/>
 *     &lt;enumeration value="confinedSpace"/>
 *     &lt;enumeration value="queueManagement"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="openSpace"/>
 *     &lt;enumeration value="street"/>
 *     &lt;enumeration value="pavement"/>
 *     &lt;enumeration value="footpath"/>
 *     &lt;enumeration value="passage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccessFeatureEnumeration")
@XmlEnum
public enum AccessFeatureEnumeration {

    @XmlEnumValue("lift")
    LIFT("lift"),
    @XmlEnumValue("escalator")
    ESCALATOR("escalator"),
    @XmlEnumValue("freightElevator")
    FREIGHT_ELEVATOR("freightElevator"),
    @XmlEnumValue("travelator")
    TRAVELATOR("travelator"),
    @XmlEnumValue("ramp")
    RAMP("ramp"),
    @XmlEnumValue("stairs")
    STAIRS("stairs"),
    @XmlEnumValue("seriesOfStairs")
    SERIES_OF_STAIRS("seriesOfStairs"),
    @XmlEnumValue("ladder")
    LADDER("ladder"),
    @XmlEnumValue("shuttle")
    SHUTTLE("shuttle"),
    @XmlEnumValue("crossing")
    CROSSING("crossing"),
    @XmlEnumValue("barrier")
    BARRIER("barrier"),
    @XmlEnumValue("narrowEntrance")
    NARROW_ENTRANCE("narrowEntrance"),
    @XmlEnumValue("hall")
    HALL("hall"),
    @XmlEnumValue("concourse")
    CONCOURSE("concourse"),
    @XmlEnumValue("confinedSpace")
    CONFINED_SPACE("confinedSpace"),
    @XmlEnumValue("queueManagement")
    QUEUE_MANAGEMENT("queueManagement"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("openSpace")
    OPEN_SPACE("openSpace"),
    @XmlEnumValue("street")
    STREET("street"),
    @XmlEnumValue("pavement")
    PAVEMENT("pavement"),
    @XmlEnumValue("footpath")
    FOOTPATH("footpath"),
    @XmlEnumValue("passage")
    PASSAGE("passage");
    private final String value;

    AccessFeatureEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessFeatureEnumeration fromValue(String v) {
        for (AccessFeatureEnumeration c: AccessFeatureEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
