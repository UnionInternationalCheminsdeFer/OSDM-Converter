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
 * <p>Java-Klasse f�r NameOfClassVehiclePoolingMeetingPlaceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassVehiclePoolingMeetingPlaceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassVehicleMeetingPlaceRefStructureType">
 *     &lt;enumeration value="VehiclePoolingMeetingPlace"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassVehiclePoolingMeetingPlaceRefStructureType")
@XmlEnum(NameOfClassVehicleMeetingPlaceRefStructureType.class)
public enum NameOfClassVehiclePoolingMeetingPlaceRefStructureType {

    @XmlEnumValue("VehiclePoolingMeetingPlace")
    VEHICLE_POOLING_MEETING_PLACE(NameOfClassVehicleMeetingPlaceRefStructureType.VEHICLE_POOLING_MEETING_PLACE);
    private final NameOfClassVehicleMeetingPlaceRefStructureType value;

    NameOfClassVehiclePoolingMeetingPlaceRefStructureType(NameOfClassVehicleMeetingPlaceRefStructureType v) {
        value = v;
    }

    public NameOfClassVehicleMeetingPlaceRefStructureType value() {
        return value;
    }

    public static NameOfClassVehiclePoolingMeetingPlaceRefStructureType fromValue(NameOfClassVehicleMeetingPlaceRefStructureType v) {
        for (NameOfClassVehiclePoolingMeetingPlaceRefStructureType c: NameOfClassVehiclePoolingMeetingPlaceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
