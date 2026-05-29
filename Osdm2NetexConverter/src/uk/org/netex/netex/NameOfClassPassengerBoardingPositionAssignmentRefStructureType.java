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
 * <p>Java-Klasse f�r NameOfClassPassengerBoardingPositionAssignmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassPassengerBoardingPositionAssignmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassStopAssignmentRefStructureType">
 *     &lt;enumeration value="DeckEntranceAssignment"/>
 *     &lt;enumeration value="PassengerBoardingPositionAssignment"/>
 *     &lt;enumeration value="TrainComponentStopAssignment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassPassengerBoardingPositionAssignmentRefStructureType")
@XmlEnum(NameOfClassStopAssignmentRefStructureType.class)
public enum NameOfClassPassengerBoardingPositionAssignmentRefStructureType {

    @XmlEnumValue("DeckEntranceAssignment")
    DECK_ENTRANCE_ASSIGNMENT(NameOfClassStopAssignmentRefStructureType.DECK_ENTRANCE_ASSIGNMENT),
    @XmlEnumValue("PassengerBoardingPositionAssignment")
    PASSENGER_BOARDING_POSITION_ASSIGNMENT(NameOfClassStopAssignmentRefStructureType.PASSENGER_BOARDING_POSITION_ASSIGNMENT),
    @XmlEnumValue("TrainComponentStopAssignment")
    TRAIN_COMPONENT_STOP_ASSIGNMENT(NameOfClassStopAssignmentRefStructureType.TRAIN_COMPONENT_STOP_ASSIGNMENT);
    private final NameOfClassStopAssignmentRefStructureType value;

    NameOfClassPassengerBoardingPositionAssignmentRefStructureType(NameOfClassStopAssignmentRefStructureType v) {
        value = v;
    }

    public NameOfClassStopAssignmentRefStructureType value() {
        return value;
    }

    public static NameOfClassPassengerBoardingPositionAssignmentRefStructureType fromValue(NameOfClassStopAssignmentRefStructureType v) {
        for (NameOfClassPassengerBoardingPositionAssignmentRefStructureType c: NameOfClassPassengerBoardingPositionAssignmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
