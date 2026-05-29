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
 * <p>Java-Klasse f�r ZoneTopologyEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ZoneTopologyEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="overlapping"/>
 *     &lt;enumeration value="honeycomb"/>
 *     &lt;enumeration value="ring"/>
 *     &lt;enumeration value="annular"/>
 *     &lt;enumeration value="nested"/>
 *     &lt;enumeration value="tiled"/>
 *     &lt;enumeration value="sequence"/>
 *     &lt;enumeration value="overlappingSequence"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ZoneTopologyEnumeration")
@XmlEnum
public enum ZoneTopologyEnumeration {


    /**
     * Zones are of arbitrary shape and may overlap.
     * 
     */
    @XmlEnumValue("overlapping")
    OVERLAPPING("overlapping"),

    /**
     * Zones are arranged as a tiled honeycomb of regular polygons (e.g. Hexagons, squares etc. The zones are contiguous and do not overlap.
     * 
     */
    @XmlEnumValue("honeycomb")
    HONEYCOMB("honeycomb"),

    /**
     * Zones are arranged in rings . The nested inner zones are included in any containing outer zones.
     * 
     */
    @XmlEnumValue("ring")
    RING("ring"),

    /**
     * Zones are arranged in tiled hollow rings. The area of any immediately nested zone is excluded from the containing outer zone.
     * 
     */
    @XmlEnumValue("annular")
    ANNULAR("annular"),

    /**
     * Zones are nested, that is some zones are fully contained within other zones and are automatically included if the outer zone is selected. They may also overlap their neighbours.
     * 
     */
    @XmlEnumValue("nested")
    NESTED("nested"),

    /**
     * Zones are arranged as adjacent tiles or arbitrary shapes that do not overlap.
     * 
     */
    @XmlEnumValue("tiled")
    TILED("tiled"),

    /**
     * Zones are arranged as adjacent tiles in sequence that touch at either or both ends. They do not overlap.
     * 
     */
    @XmlEnumValue("sequence")
    SEQUENCE("sequence"),

    /**
     * Zones are arranged as adjacent tiles in sequence that touch at either or both ends. They may partially overlap such that some stops are in both zones.
     * 
     */
    @XmlEnumValue("overlappingSequence")
    OVERLAPPING_SEQUENCE("overlappingSequence"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ZoneTopologyEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZoneTopologyEnumeration fromValue(String v) {
        for (ZoneTopologyEnumeration c: ZoneTopologyEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
