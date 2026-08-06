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
 * <p>Java-Klasse f�r NameOfClassCommonVehicleServiceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassCommonVehicleServiceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassMobilityServiceRefStructureType">
 *     &lt;enumeration value="CarPoolingService"/>
 *     &lt;enumeration value="ChauffeuredVehicleService"/>
 *     &lt;enumeration value="TaxiService"/>
 *     &lt;enumeration value="VehicleRentalService"/>
 *     &lt;enumeration value="VehicleSharingService"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassCommonVehicleServiceRefStructureType")
@XmlEnum(NameOfClassMobilityServiceRefStructureType.class)
public enum NameOfClassCommonVehicleServiceRefStructureType {

    @XmlEnumValue("CarPoolingService")
    CAR_POOLING_SERVICE(NameOfClassMobilityServiceRefStructureType.CAR_POOLING_SERVICE),
    @XmlEnumValue("ChauffeuredVehicleService")
    CHAUFFEURED_VEHICLE_SERVICE(NameOfClassMobilityServiceRefStructureType.CHAUFFEURED_VEHICLE_SERVICE),
    @XmlEnumValue("TaxiService")
    TAXI_SERVICE(NameOfClassMobilityServiceRefStructureType.TAXI_SERVICE),
    @XmlEnumValue("VehicleRentalService")
    VEHICLE_RENTAL_SERVICE(NameOfClassMobilityServiceRefStructureType.VEHICLE_RENTAL_SERVICE),
    @XmlEnumValue("VehicleSharingService")
    VEHICLE_SHARING_SERVICE(NameOfClassMobilityServiceRefStructureType.VEHICLE_SHARING_SERVICE);
    private final NameOfClassMobilityServiceRefStructureType value;

    NameOfClassCommonVehicleServiceRefStructureType(NameOfClassMobilityServiceRefStructureType v) {
        value = v;
    }

    public NameOfClassMobilityServiceRefStructureType value() {
        return value;
    }

    public static NameOfClassCommonVehicleServiceRefStructureType fromValue(NameOfClassMobilityServiceRefStructureType v) {
        for (NameOfClassCommonVehicleServiceRefStructureType c: NameOfClassCommonVehicleServiceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
