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
 * <p>Java-Klasse f�r NameOfClassDynamicVehicleMeetingPointAssignmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassDynamicVehicleMeetingPointAssignmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassVehicleMeetingPointAssignmentRefStructureType">
 *     &lt;enumeration value="DynamicVehicleMeetingPointAssignment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassDynamicVehicleMeetingPointAssignmentRefStructureType")
@XmlEnum(NameOfClassVehicleMeetingPointAssignmentRefStructureType.class)
public enum NameOfClassDynamicVehicleMeetingPointAssignmentRefStructureType {

    @XmlEnumValue("DynamicVehicleMeetingPointAssignment")
    DYNAMIC_VEHICLE_MEETING_POINT_ASSIGNMENT(NameOfClassVehicleMeetingPointAssignmentRefStructureType.DYNAMIC_VEHICLE_MEETING_POINT_ASSIGNMENT);
    private final NameOfClassVehicleMeetingPointAssignmentRefStructureType value;

    NameOfClassDynamicVehicleMeetingPointAssignmentRefStructureType(NameOfClassVehicleMeetingPointAssignmentRefStructureType v) {
        value = v;
    }

    public NameOfClassVehicleMeetingPointAssignmentRefStructureType value() {
        return value;
    }

    public static NameOfClassDynamicVehicleMeetingPointAssignmentRefStructureType fromValue(NameOfClassVehicleMeetingPointAssignmentRefStructureType v) {
        for (NameOfClassDynamicVehicleMeetingPointAssignmentRefStructureType c: NameOfClassDynamicVehicleMeetingPointAssignmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
