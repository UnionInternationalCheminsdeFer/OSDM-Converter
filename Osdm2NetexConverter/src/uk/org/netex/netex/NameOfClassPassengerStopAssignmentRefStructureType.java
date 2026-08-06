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
 * <p>Java-Klasse f�r NameOfClassPassengerStopAssignmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassPassengerStopAssignmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassStopAssignmentRefStructureType">
 *     &lt;enumeration value="DynamicStopAssignment"/>
 *     &lt;enumeration value="PassengerStopAssignment"/>
 *     &lt;enumeration value="VehicleJourneyStopAssignment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassPassengerStopAssignmentRefStructureType")
@XmlEnum(NameOfClassStopAssignmentRefStructureType.class)
public enum NameOfClassPassengerStopAssignmentRefStructureType {

    @XmlEnumValue("DynamicStopAssignment")
    DYNAMIC_STOP_ASSIGNMENT(NameOfClassStopAssignmentRefStructureType.DYNAMIC_STOP_ASSIGNMENT),
    @XmlEnumValue("PassengerStopAssignment")
    PASSENGER_STOP_ASSIGNMENT(NameOfClassStopAssignmentRefStructureType.PASSENGER_STOP_ASSIGNMENT),
    @XmlEnumValue("VehicleJourneyStopAssignment")
    VEHICLE_JOURNEY_STOP_ASSIGNMENT(NameOfClassStopAssignmentRefStructureType.VEHICLE_JOURNEY_STOP_ASSIGNMENT);
    private final NameOfClassStopAssignmentRefStructureType value;

    NameOfClassPassengerStopAssignmentRefStructureType(NameOfClassStopAssignmentRefStructureType v) {
        value = v;
    }

    public NameOfClassStopAssignmentRefStructureType value() {
        return value;
    }

    public static NameOfClassPassengerStopAssignmentRefStructureType fromValue(NameOfClassStopAssignmentRefStructureType v) {
        for (NameOfClassPassengerStopAssignmentRefStructureType c: NameOfClassPassengerStopAssignmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
