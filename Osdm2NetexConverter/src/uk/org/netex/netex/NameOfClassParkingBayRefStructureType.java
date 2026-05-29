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
 * <p>Java-Klasse f�r NameOfClassParkingBayRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassParkingBayRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassSiteComponentRefStructureType">
 *     &lt;enumeration value="MonitoredVehicleSharingParkingBay"/>
 *     &lt;enumeration value="ParkingBay"/>
 *     &lt;enumeration value="RechargingBay"/>
 *     &lt;enumeration value="VehiclePoolingParkingBay"/>
 *     &lt;enumeration value="VehicleSharingParkingBay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassParkingBayRefStructureType")
@XmlEnum(NameOfClassSiteComponentRefStructureType.class)
public enum NameOfClassParkingBayRefStructureType {

    @XmlEnumValue("MonitoredVehicleSharingParkingBay")
    MONITORED_VEHICLE_SHARING_PARKING_BAY(NameOfClassSiteComponentRefStructureType.MONITORED_VEHICLE_SHARING_PARKING_BAY),
    @XmlEnumValue("ParkingBay")
    PARKING_BAY(NameOfClassSiteComponentRefStructureType.PARKING_BAY),
    @XmlEnumValue("RechargingBay")
    RECHARGING_BAY(NameOfClassSiteComponentRefStructureType.RECHARGING_BAY),
    @XmlEnumValue("VehiclePoolingParkingBay")
    VEHICLE_POOLING_PARKING_BAY(NameOfClassSiteComponentRefStructureType.VEHICLE_POOLING_PARKING_BAY),
    @XmlEnumValue("VehicleSharingParkingBay")
    VEHICLE_SHARING_PARKING_BAY(NameOfClassSiteComponentRefStructureType.VEHICLE_SHARING_PARKING_BAY);
    private final NameOfClassSiteComponentRefStructureType value;

    NameOfClassParkingBayRefStructureType(NameOfClassSiteComponentRefStructureType v) {
        value = v;
    }

    public NameOfClassSiteComponentRefStructureType value() {
        return value;
    }

    public static NameOfClassParkingBayRefStructureType fromValue(NameOfClassSiteComponentRefStructureType v) {
        for (NameOfClassParkingBayRefStructureType c: NameOfClassParkingBayRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
