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
 * <p>Java-Klasse f�r NameOfClassVehicleServicePlaceAssignmentRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassVehicleServicePlaceAssignmentRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassAssignmentRefStructureType">
 *     &lt;enumeration value="TaxiServicePlaceAssignment"/>
 *     &lt;enumeration value="VehiclePoolingPlaceAssignment"/>
 *     &lt;enumeration value="VehicleServicePlaceAssignment"/>
 *     &lt;enumeration value="VehicleSharingPlaceAssignment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassVehicleServicePlaceAssignmentRefStructureType")
@XmlEnum(NameOfClassAssignmentRefStructureType.class)
public enum NameOfClassVehicleServicePlaceAssignmentRefStructureType {

    @XmlEnumValue("TaxiServicePlaceAssignment")
    TAXI_SERVICE_PLACE_ASSIGNMENT(NameOfClassAssignmentRefStructureType.TAXI_SERVICE_PLACE_ASSIGNMENT),
    @XmlEnumValue("VehiclePoolingPlaceAssignment")
    VEHICLE_POOLING_PLACE_ASSIGNMENT(NameOfClassAssignmentRefStructureType.VEHICLE_POOLING_PLACE_ASSIGNMENT),
    @XmlEnumValue("VehicleServicePlaceAssignment")
    VEHICLE_SERVICE_PLACE_ASSIGNMENT(NameOfClassAssignmentRefStructureType.VEHICLE_SERVICE_PLACE_ASSIGNMENT),
    @XmlEnumValue("VehicleSharingPlaceAssignment")
    VEHICLE_SHARING_PLACE_ASSIGNMENT(NameOfClassAssignmentRefStructureType.VEHICLE_SHARING_PLACE_ASSIGNMENT);
    private final NameOfClassAssignmentRefStructureType value;

    NameOfClassVehicleServicePlaceAssignmentRefStructureType(NameOfClassAssignmentRefStructureType v) {
        value = v;
    }

    public NameOfClassAssignmentRefStructureType value() {
        return value;
    }

    public static NameOfClassVehicleServicePlaceAssignmentRefStructureType fromValue(NameOfClassAssignmentRefStructureType v) {
        for (NameOfClassVehicleServicePlaceAssignmentRefStructureType c: NameOfClassVehicleServicePlaceAssignmentRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
