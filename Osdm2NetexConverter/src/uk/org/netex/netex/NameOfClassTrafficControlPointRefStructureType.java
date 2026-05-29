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
 * <p>Java-Klasse f�r NameOfClassTrafficControlPointRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassTrafficControlPointRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassPointRefStructureType">
 *     &lt;enumeration value="Point"/>
 *     &lt;enumeration value="TrafficControlPoint"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassTrafficControlPointRefStructureType")
@XmlEnum(NameOfClassPointRefStructureType.class)
public enum NameOfClassTrafficControlPointRefStructureType {

    @XmlEnumValue("Point")
    POINT(NameOfClassPointRefStructureType.POINT),
    @XmlEnumValue("TrafficControlPoint")
    TRAFFIC_CONTROL_POINT(NameOfClassPointRefStructureType.TRAFFIC_CONTROL_POINT);
    private final NameOfClassPointRefStructureType value;

    NameOfClassTrafficControlPointRefStructureType(NameOfClassPointRefStructureType v) {
        value = v;
    }

    public NameOfClassPointRefStructureType value() {
        return value;
    }

    public static NameOfClassTrafficControlPointRefStructureType fromValue(NameOfClassPointRefStructureType v) {
        for (NameOfClassTrafficControlPointRefStructureType c: NameOfClassTrafficControlPointRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
