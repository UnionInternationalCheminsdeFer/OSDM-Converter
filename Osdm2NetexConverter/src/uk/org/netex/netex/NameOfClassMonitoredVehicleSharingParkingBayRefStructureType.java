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
 * <p>Java-Klasse f�r NameOfClassMonitoredVehicleSharingParkingBayRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassMonitoredVehicleSharingParkingBayRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassVehicleSharingParkingBayRefStructureType">
 *     &lt;enumeration value="MonitoredVehicleSharingParkingBay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassMonitoredVehicleSharingParkingBayRefStructureType")
@XmlEnum(NameOfClassVehicleSharingParkingBayRefStructureType.class)
public enum NameOfClassMonitoredVehicleSharingParkingBayRefStructureType {

    @XmlEnumValue("MonitoredVehicleSharingParkingBay")
    MONITORED_VEHICLE_SHARING_PARKING_BAY(NameOfClassVehicleSharingParkingBayRefStructureType.MONITORED_VEHICLE_SHARING_PARKING_BAY);
    private final NameOfClassVehicleSharingParkingBayRefStructureType value;

    NameOfClassMonitoredVehicleSharingParkingBayRefStructureType(NameOfClassVehicleSharingParkingBayRefStructureType v) {
        value = v;
    }

    public NameOfClassVehicleSharingParkingBayRefStructureType value() {
        return value;
    }

    public static NameOfClassMonitoredVehicleSharingParkingBayRefStructureType fromValue(NameOfClassVehicleSharingParkingBayRefStructureType v) {
        for (NameOfClassMonitoredVehicleSharingParkingBayRefStructureType c: NameOfClassMonitoredVehicleSharingParkingBayRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
