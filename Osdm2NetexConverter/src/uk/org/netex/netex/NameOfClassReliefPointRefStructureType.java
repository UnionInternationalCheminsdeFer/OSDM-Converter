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
 * <p>Java-Klasse f�r NameOfClassReliefPointRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassReliefPointRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassTimingPointRefStructureType">
 *     &lt;enumeration value="GaragePoint"/>
 *     &lt;enumeration value="ParkingPoint"/>
 *     &lt;enumeration value="ReliefPoint"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassReliefPointRefStructureType")
@XmlEnum(NameOfClassTimingPointRefStructureType.class)
public enum NameOfClassReliefPointRefStructureType {

    @XmlEnumValue("GaragePoint")
    GARAGE_POINT(NameOfClassTimingPointRefStructureType.GARAGE_POINT),
    @XmlEnumValue("ParkingPoint")
    PARKING_POINT(NameOfClassTimingPointRefStructureType.PARKING_POINT),
    @XmlEnumValue("ReliefPoint")
    RELIEF_POINT(NameOfClassTimingPointRefStructureType.RELIEF_POINT);
    private final NameOfClassTimingPointRefStructureType value;

    NameOfClassReliefPointRefStructureType(NameOfClassTimingPointRefStructureType v) {
        value = v;
    }

    public NameOfClassTimingPointRefStructureType value() {
        return value;
    }

    public static NameOfClassReliefPointRefStructureType fromValue(NameOfClassTimingPointRefStructureType v) {
        for (NameOfClassReliefPointRefStructureType c: NameOfClassReliefPointRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
