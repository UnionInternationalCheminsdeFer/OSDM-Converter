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
 * <p>Java-Klasse f�r NameOfClassVehicleSharingServiceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassVehicleSharingServiceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassCommonVehicleServiceRefStructureType">
 *     &lt;enumeration value="VehicleSharingService"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassVehicleSharingServiceRefStructureType")
@XmlEnum(NameOfClassCommonVehicleServiceRefStructureType.class)
public enum NameOfClassVehicleSharingServiceRefStructureType {

    @XmlEnumValue("VehicleSharingService")
    VEHICLE_SHARING_SERVICE(NameOfClassCommonVehicleServiceRefStructureType.VEHICLE_SHARING_SERVICE);
    private final NameOfClassCommonVehicleServiceRefStructureType value;

    NameOfClassVehicleSharingServiceRefStructureType(NameOfClassCommonVehicleServiceRefStructureType v) {
        value = v;
    }

    public NameOfClassCommonVehicleServiceRefStructureType value() {
        return value;
    }

    public static NameOfClassVehicleSharingServiceRefStructureType fromValue(NameOfClassCommonVehicleServiceRefStructureType v) {
        for (NameOfClassVehicleSharingServiceRefStructureType c: NameOfClassVehicleSharingServiceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
