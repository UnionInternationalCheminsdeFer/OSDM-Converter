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
 * <p>Java-Klasse f�r NameOfClassStopAssignmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassStopAssignmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassAssignmentRefStructureType">
 *     &lt;enumeration value="DeckEntranceAssignment"/>
 *     &lt;enumeration value="DynamicStopAssignment"/>
 *     &lt;enumeration value="FlexibleStopAssignment"/>
 *     &lt;enumeration value="NavigationPathAssignment"/>
 *     &lt;enumeration value="PassengerBoardingPositionAssignment"/>
 *     &lt;enumeration value="PassengerStopAssignment"/>
 *     &lt;enumeration value="TrainComponentStopAssignment"/>
 *     &lt;enumeration value="TrainStopAssignment"/>
 *     &lt;enumeration value="VehicleJourneyStopAssignment"/>
 *     &lt;enumeration value="VehicleTypeStopAssignment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassStopAssignmentRefStructureType")
@XmlEnum(NameOfClassAssignmentRefStructureType.class)
public enum NameOfClassStopAssignmentRefStructureType {

    @XmlEnumValue("DeckEntranceAssignment")
    DECK_ENTRANCE_ASSIGNMENT(NameOfClassAssignmentRefStructureType.DECK_ENTRANCE_ASSIGNMENT),
    @XmlEnumValue("DynamicStopAssignment")
    DYNAMIC_STOP_ASSIGNMENT(NameOfClassAssignmentRefStructureType.DYNAMIC_STOP_ASSIGNMENT),
    @XmlEnumValue("FlexibleStopAssignment")
    FLEXIBLE_STOP_ASSIGNMENT(NameOfClassAssignmentRefStructureType.FLEXIBLE_STOP_ASSIGNMENT),
    @XmlEnumValue("NavigationPathAssignment")
    NAVIGATION_PATH_ASSIGNMENT(NameOfClassAssignmentRefStructureType.NAVIGATION_PATH_ASSIGNMENT),
    @XmlEnumValue("PassengerBoardingPositionAssignment")
    PASSENGER_BOARDING_POSITION_ASSIGNMENT(NameOfClassAssignmentRefStructureType.PASSENGER_BOARDING_POSITION_ASSIGNMENT),
    @XmlEnumValue("PassengerStopAssignment")
    PASSENGER_STOP_ASSIGNMENT(NameOfClassAssignmentRefStructureType.PASSENGER_STOP_ASSIGNMENT),
    @XmlEnumValue("TrainComponentStopAssignment")
    TRAIN_COMPONENT_STOP_ASSIGNMENT(NameOfClassAssignmentRefStructureType.TRAIN_COMPONENT_STOP_ASSIGNMENT),
    @XmlEnumValue("TrainStopAssignment")
    TRAIN_STOP_ASSIGNMENT(NameOfClassAssignmentRefStructureType.TRAIN_STOP_ASSIGNMENT),
    @XmlEnumValue("VehicleJourneyStopAssignment")
    VEHICLE_JOURNEY_STOP_ASSIGNMENT(NameOfClassAssignmentRefStructureType.VEHICLE_JOURNEY_STOP_ASSIGNMENT),
    @XmlEnumValue("VehicleTypeStopAssignment")
    VEHICLE_TYPE_STOP_ASSIGNMENT(NameOfClassAssignmentRefStructureType.VEHICLE_TYPE_STOP_ASSIGNMENT);
    private final NameOfClassAssignmentRefStructureType value;

    NameOfClassStopAssignmentRefStructureType(NameOfClassAssignmentRefStructureType v) {
        value = v;
    }

    public NameOfClassAssignmentRefStructureType value() {
        return value;
    }

    public static NameOfClassStopAssignmentRefStructureType fromValue(NameOfClassAssignmentRefStructureType v) {
        for (NameOfClassStopAssignmentRefStructureType c: NameOfClassStopAssignmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
