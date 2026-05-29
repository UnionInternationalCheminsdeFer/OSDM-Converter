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
 * <p>Java-Klasse f�r NameOfClassHailAndRideAreaRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassHailAndRideAreaRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassFlexibleQuayRefStructureType">
 *     &lt;enumeration value="HailAndRideArea"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassHailAndRideAreaRefStructureType")
@XmlEnum(NameOfClassFlexibleQuayRefStructureType.class)
public enum NameOfClassHailAndRideAreaRefStructureType {

    @XmlEnumValue("HailAndRideArea")
    HAIL_AND_RIDE_AREA(NameOfClassFlexibleQuayRefStructureType.HAIL_AND_RIDE_AREA);
    private final NameOfClassFlexibleQuayRefStructureType value;

    NameOfClassHailAndRideAreaRefStructureType(NameOfClassFlexibleQuayRefStructureType v) {
        value = v;
    }

    public NameOfClassFlexibleQuayRefStructureType value() {
        return value;
    }

    public static NameOfClassHailAndRideAreaRefStructureType fromValue(NameOfClassFlexibleQuayRefStructureType v) {
        for (NameOfClassHailAndRideAreaRefStructureType c: NameOfClassHailAndRideAreaRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
