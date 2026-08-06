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
 * <p>Java-Klasse f�r NameOfClassInfrastructurePointRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassInfrastructurePointRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassPointRefStructureType">
 *     &lt;enumeration value="RailwayJunction"/>
 *     &lt;enumeration value="RoadJunction"/>
 *     &lt;enumeration value="WireJunction"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassInfrastructurePointRefStructureType")
@XmlEnum(NameOfClassPointRefStructureType.class)
public enum NameOfClassInfrastructurePointRefStructureType {

    @XmlEnumValue("RailwayJunction")
    RAILWAY_JUNCTION(NameOfClassPointRefStructureType.RAILWAY_JUNCTION),
    @XmlEnumValue("RoadJunction")
    ROAD_JUNCTION(NameOfClassPointRefStructureType.ROAD_JUNCTION),
    @XmlEnumValue("WireJunction")
    WIRE_JUNCTION(NameOfClassPointRefStructureType.WIRE_JUNCTION);
    private final NameOfClassPointRefStructureType value;

    NameOfClassInfrastructurePointRefStructureType(NameOfClassPointRefStructureType v) {
        value = v;
    }

    public NameOfClassPointRefStructureType value() {
        return value;
    }

    public static NameOfClassInfrastructurePointRefStructureType fromValue(NameOfClassPointRefStructureType v) {
        for (NameOfClassInfrastructurePointRefStructureType c: NameOfClassInfrastructurePointRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
