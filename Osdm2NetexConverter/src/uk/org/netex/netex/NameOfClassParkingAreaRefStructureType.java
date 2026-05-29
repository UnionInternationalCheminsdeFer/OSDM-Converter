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
 * <p>Java-Klasse f�r NameOfClassParkingAreaRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassParkingAreaRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassSiteComponentRefStructureType">
 *     &lt;enumeration value="ParkingArea"/>
 *     &lt;enumeration value="TaxiParkingArea"/>
 *     &lt;enumeration value="VehiclePoolingParkingArea"/>
 *     &lt;enumeration value="VehicleSharingParkingArea"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassParkingAreaRefStructureType")
@XmlEnum(NameOfClassSiteComponentRefStructureType.class)
public enum NameOfClassParkingAreaRefStructureType {

    @XmlEnumValue("ParkingArea")
    PARKING_AREA(NameOfClassSiteComponentRefStructureType.PARKING_AREA),
    @XmlEnumValue("TaxiParkingArea")
    TAXI_PARKING_AREA(NameOfClassSiteComponentRefStructureType.TAXI_PARKING_AREA),
    @XmlEnumValue("VehiclePoolingParkingArea")
    VEHICLE_POOLING_PARKING_AREA(NameOfClassSiteComponentRefStructureType.VEHICLE_POOLING_PARKING_AREA),
    @XmlEnumValue("VehicleSharingParkingArea")
    VEHICLE_SHARING_PARKING_AREA(NameOfClassSiteComponentRefStructureType.VEHICLE_SHARING_PARKING_AREA);
    private final NameOfClassSiteComponentRefStructureType value;

    NameOfClassParkingAreaRefStructureType(NameOfClassSiteComponentRefStructureType v) {
        value = v;
    }

    public NameOfClassSiteComponentRefStructureType value() {
        return value;
    }

    public static NameOfClassParkingAreaRefStructureType fromValue(NameOfClassSiteComponentRefStructureType v) {
        for (NameOfClassParkingAreaRefStructureType c: NameOfClassParkingAreaRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
