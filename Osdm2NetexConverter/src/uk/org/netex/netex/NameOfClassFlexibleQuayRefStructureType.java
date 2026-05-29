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
 * <p>Java-Klasse f�r NameOfClassFlexibleQuayRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassFlexibleQuayRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassPlaceRefStructureType">
 *     &lt;enumeration value="FlexibleArea"/>
 *     &lt;enumeration value="FlexibleQuay"/>
 *     &lt;enumeration value="HailAndRideArea"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassFlexibleQuayRefStructureType")
@XmlEnum(NameOfClassPlaceRefStructureType.class)
public enum NameOfClassFlexibleQuayRefStructureType {

    @XmlEnumValue("FlexibleArea")
    FLEXIBLE_AREA(NameOfClassPlaceRefStructureType.FLEXIBLE_AREA),
    @XmlEnumValue("FlexibleQuay")
    FLEXIBLE_QUAY(NameOfClassPlaceRefStructureType.FLEXIBLE_QUAY),
    @XmlEnumValue("HailAndRideArea")
    HAIL_AND_RIDE_AREA(NameOfClassPlaceRefStructureType.HAIL_AND_RIDE_AREA);
    private final NameOfClassPlaceRefStructureType value;

    NameOfClassFlexibleQuayRefStructureType(NameOfClassPlaceRefStructureType v) {
        value = v;
    }

    public NameOfClassPlaceRefStructureType value() {
        return value;
    }

    public static NameOfClassFlexibleQuayRefStructureType fromValue(NameOfClassPlaceRefStructureType v) {
        for (NameOfClassFlexibleQuayRefStructureType c: NameOfClassFlexibleQuayRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
