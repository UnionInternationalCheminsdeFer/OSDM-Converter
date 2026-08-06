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
 * <p>Java-Klasse f�r NameOfClassProjectionRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassProjectionRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="ComplexFeatureProjection"/>
 *     &lt;enumeration value="LinkProjection"/>
 *     &lt;enumeration value="LinkSequenceProjection"/>
 *     &lt;enumeration value="PointProjection"/>
 *     &lt;enumeration value="TopographicProjection"/>
 *     &lt;enumeration value="ZoneProjection"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassProjectionRefStructureType")
@XmlEnum
public enum NameOfClassProjectionRefStructureType {

    @XmlEnumValue("ComplexFeatureProjection")
    COMPLEX_FEATURE_PROJECTION("ComplexFeatureProjection"),
    @XmlEnumValue("LinkProjection")
    LINK_PROJECTION("LinkProjection"),
    @XmlEnumValue("LinkSequenceProjection")
    LINK_SEQUENCE_PROJECTION("LinkSequenceProjection"),
    @XmlEnumValue("PointProjection")
    POINT_PROJECTION("PointProjection"),
    @XmlEnumValue("TopographicProjection")
    TOPOGRAPHIC_PROJECTION("TopographicProjection"),
    @XmlEnumValue("ZoneProjection")
    ZONE_PROJECTION("ZoneProjection");
    private final String value;

    NameOfClassProjectionRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassProjectionRefStructureType fromValue(String v) {
        for (NameOfClassProjectionRefStructureType c: NameOfClassProjectionRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
