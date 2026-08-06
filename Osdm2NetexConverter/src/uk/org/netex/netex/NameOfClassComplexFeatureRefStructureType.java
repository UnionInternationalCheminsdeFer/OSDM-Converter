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
 * <p>Java-Klasse f�r NameOfClassComplexFeatureRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassComplexFeatureRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassGroupOfPointsRefStructureType">
 *     &lt;enumeration value="ComplexFeature"/>
 *     &lt;enumeration value="SpatialFeature"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassComplexFeatureRefStructureType")
@XmlEnum(NameOfClassGroupOfPointsRefStructureType.class)
public enum NameOfClassComplexFeatureRefStructureType {

    @XmlEnumValue("ComplexFeature")
    COMPLEX_FEATURE(NameOfClassGroupOfPointsRefStructureType.COMPLEX_FEATURE),
    @XmlEnumValue("SpatialFeature")
    SPATIAL_FEATURE(NameOfClassGroupOfPointsRefStructureType.SPATIAL_FEATURE);
    private final NameOfClassGroupOfPointsRefStructureType value;

    NameOfClassComplexFeatureRefStructureType(NameOfClassGroupOfPointsRefStructureType v) {
        value = v;
    }

    public NameOfClassGroupOfPointsRefStructureType value() {
        return value;
    }

    public static NameOfClassComplexFeatureRefStructureType fromValue(NameOfClassGroupOfPointsRefStructureType v) {
        for (NameOfClassComplexFeatureRefStructureType c: NameOfClassComplexFeatureRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
