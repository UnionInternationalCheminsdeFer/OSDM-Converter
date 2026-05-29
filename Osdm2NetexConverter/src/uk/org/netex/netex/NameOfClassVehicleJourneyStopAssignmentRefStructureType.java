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
 * <p>Java-Klasse f�r NameOfClassVehicleJourneyStopAssignmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassVehicleJourneyStopAssignmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassPassengerStopAssignmentRefStructureType">
 *     &lt;enumeration value="DynamicStopAssignment"/>
 *     &lt;enumeration value="VehicleJourneyStopAssignment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassVehicleJourneyStopAssignmentRefStructureType")
@XmlEnum(NameOfClassPassengerStopAssignmentRefStructureType.class)
public enum NameOfClassVehicleJourneyStopAssignmentRefStructureType {

    @XmlEnumValue("DynamicStopAssignment")
    DYNAMIC_STOP_ASSIGNMENT(NameOfClassPassengerStopAssignmentRefStructureType.DYNAMIC_STOP_ASSIGNMENT),
    @XmlEnumValue("VehicleJourneyStopAssignment")
    VEHICLE_JOURNEY_STOP_ASSIGNMENT(NameOfClassPassengerStopAssignmentRefStructureType.VEHICLE_JOURNEY_STOP_ASSIGNMENT);
    private final NameOfClassPassengerStopAssignmentRefStructureType value;

    NameOfClassVehicleJourneyStopAssignmentRefStructureType(NameOfClassPassengerStopAssignmentRefStructureType v) {
        value = v;
    }

    public NameOfClassPassengerStopAssignmentRefStructureType value() {
        return value;
    }

    public static NameOfClassVehicleJourneyStopAssignmentRefStructureType fromValue(NameOfClassPassengerStopAssignmentRefStructureType v) {
        for (NameOfClassVehicleJourneyStopAssignmentRefStructureType c: NameOfClassVehicleJourneyStopAssignmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
