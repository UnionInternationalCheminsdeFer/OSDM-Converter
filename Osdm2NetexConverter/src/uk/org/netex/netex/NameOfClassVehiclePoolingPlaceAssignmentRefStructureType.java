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
 * <p>Java-Klasse f�r NameOfClassVehiclePoolingPlaceAssignmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassVehiclePoolingPlaceAssignmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassVehicleServicePlaceAssignmentRefStructureType">
 *     &lt;enumeration value="VehiclePoolingPlaceAssignment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassVehiclePoolingPlaceAssignmentRefStructureType")
@XmlEnum(NameOfClassVehicleServicePlaceAssignmentRefStructureType.class)
public enum NameOfClassVehiclePoolingPlaceAssignmentRefStructureType {

    @XmlEnumValue("VehiclePoolingPlaceAssignment")
    VEHICLE_POOLING_PLACE_ASSIGNMENT(NameOfClassVehicleServicePlaceAssignmentRefStructureType.VEHICLE_POOLING_PLACE_ASSIGNMENT);
    private final NameOfClassVehicleServicePlaceAssignmentRefStructureType value;

    NameOfClassVehiclePoolingPlaceAssignmentRefStructureType(NameOfClassVehicleServicePlaceAssignmentRefStructureType v) {
        value = v;
    }

    public NameOfClassVehicleServicePlaceAssignmentRefStructureType value() {
        return value;
    }

    public static NameOfClassVehiclePoolingPlaceAssignmentRefStructureType fromValue(NameOfClassVehicleServicePlaceAssignmentRefStructureType v) {
        for (NameOfClassVehiclePoolingPlaceAssignmentRefStructureType c: NameOfClassVehiclePoolingPlaceAssignmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
