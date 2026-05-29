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
 * <p>Java-Klasse f�r NameOfClassVehicleRentalServiceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassVehicleRentalServiceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassCommonVehicleServiceRefStructureType">
 *     &lt;enumeration value="VehicleRentalService"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassVehicleRentalServiceRefStructureType")
@XmlEnum(NameOfClassCommonVehicleServiceRefStructureType.class)
public enum NameOfClassVehicleRentalServiceRefStructureType {

    @XmlEnumValue("VehicleRentalService")
    VEHICLE_RENTAL_SERVICE(NameOfClassCommonVehicleServiceRefStructureType.VEHICLE_RENTAL_SERVICE);
    private final NameOfClassCommonVehicleServiceRefStructureType value;

    NameOfClassVehicleRentalServiceRefStructureType(NameOfClassCommonVehicleServiceRefStructureType v) {
        value = v;
    }

    public NameOfClassCommonVehicleServiceRefStructureType value() {
        return value;
    }

    public static NameOfClassVehicleRentalServiceRefStructureType fromValue(NameOfClassCommonVehicleServiceRefStructureType v) {
        for (NameOfClassVehicleRentalServiceRefStructureType c: NameOfClassVehicleRentalServiceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
