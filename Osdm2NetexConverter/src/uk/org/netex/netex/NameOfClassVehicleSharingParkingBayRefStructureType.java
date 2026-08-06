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
 * <p>Java-Klasse f�r NameOfClassVehicleSharingParkingBayRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassVehicleSharingParkingBayRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassParkingBayRefStructureType">
 *     &lt;enumeration value="MonitoredVehicleSharingParkingBay"/>
 *     &lt;enumeration value="VehicleSharingParkingBay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassVehicleSharingParkingBayRefStructureType")
@XmlEnum(NameOfClassParkingBayRefStructureType.class)
public enum NameOfClassVehicleSharingParkingBayRefStructureType {

    @XmlEnumValue("MonitoredVehicleSharingParkingBay")
    MONITORED_VEHICLE_SHARING_PARKING_BAY(NameOfClassParkingBayRefStructureType.MONITORED_VEHICLE_SHARING_PARKING_BAY),
    @XmlEnumValue("VehicleSharingParkingBay")
    VEHICLE_SHARING_PARKING_BAY(NameOfClassParkingBayRefStructureType.VEHICLE_SHARING_PARKING_BAY);
    private final NameOfClassParkingBayRefStructureType value;

    NameOfClassVehicleSharingParkingBayRefStructureType(NameOfClassParkingBayRefStructureType v) {
        value = v;
    }

    public NameOfClassParkingBayRefStructureType value() {
        return value;
    }

    public static NameOfClassVehicleSharingParkingBayRefStructureType fromValue(NameOfClassParkingBayRefStructureType v) {
        for (NameOfClassVehicleSharingParkingBayRefStructureType c: NameOfClassVehicleSharingParkingBayRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
