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
 * <p>Java-Klasse f�r NameOfClassTrainComponentStopAssignmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassTrainComponentStopAssignmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassPassengerBoardingPositionAssignmentRefStructureType">
 *     &lt;enumeration value="TrainComponentStopAssignment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassTrainComponentStopAssignmentRefStructureType")
@XmlEnum(NameOfClassPassengerBoardingPositionAssignmentRefStructureType.class)
public enum NameOfClassTrainComponentStopAssignmentRefStructureType {

    @XmlEnumValue("TrainComponentStopAssignment")
    TRAIN_COMPONENT_STOP_ASSIGNMENT(NameOfClassPassengerBoardingPositionAssignmentRefStructureType.TRAIN_COMPONENT_STOP_ASSIGNMENT);
    private final NameOfClassPassengerBoardingPositionAssignmentRefStructureType value;

    NameOfClassTrainComponentStopAssignmentRefStructureType(NameOfClassPassengerBoardingPositionAssignmentRefStructureType v) {
        value = v;
    }

    public NameOfClassPassengerBoardingPositionAssignmentRefStructureType value() {
        return value;
    }

    public static NameOfClassTrainComponentStopAssignmentRefStructureType fromValue(NameOfClassPassengerBoardingPositionAssignmentRefStructureType v) {
        for (NameOfClassTrainComponentStopAssignmentRefStructureType c: NameOfClassTrainComponentStopAssignmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
