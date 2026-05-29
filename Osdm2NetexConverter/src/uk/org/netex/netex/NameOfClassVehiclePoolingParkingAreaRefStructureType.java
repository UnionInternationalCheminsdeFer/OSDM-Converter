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
 * <p>Java-Klasse f�r NameOfClassVehiclePoolingParkingAreaRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassVehiclePoolingParkingAreaRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassParkingAreaRefStructureType">
 *     &lt;enumeration value="VehiclePoolingParkingArea"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassVehiclePoolingParkingAreaRefStructureType")
@XmlEnum(NameOfClassParkingAreaRefStructureType.class)
public enum NameOfClassVehiclePoolingParkingAreaRefStructureType {

    @XmlEnumValue("VehiclePoolingParkingArea")
    VEHICLE_POOLING_PARKING_AREA(NameOfClassParkingAreaRefStructureType.VEHICLE_POOLING_PARKING_AREA);
    private final NameOfClassParkingAreaRefStructureType value;

    NameOfClassVehiclePoolingParkingAreaRefStructureType(NameOfClassParkingAreaRefStructureType v) {
        value = v;
    }

    public NameOfClassParkingAreaRefStructureType value() {
        return value;
    }

    public static NameOfClassVehiclePoolingParkingAreaRefStructureType fromValue(NameOfClassParkingAreaRefStructureType v) {
        for (NameOfClassVehiclePoolingParkingAreaRefStructureType c: NameOfClassVehiclePoolingParkingAreaRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
