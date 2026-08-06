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
 * <p>Java-Klasse f�r NameOfClassVehicleMeetingPlaceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassVehicleMeetingPlaceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassAddressablePlaceRefStructureType">
 *     &lt;enumeration value="VehicleMeetingPlace"/>
 *     &lt;enumeration value="VehiclePoolingMeetingPlace"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassVehicleMeetingPlaceRefStructureType")
@XmlEnum(NameOfClassAddressablePlaceRefStructureType.class)
public enum NameOfClassVehicleMeetingPlaceRefStructureType {

    @XmlEnumValue("VehicleMeetingPlace")
    VEHICLE_MEETING_PLACE(NameOfClassAddressablePlaceRefStructureType.VEHICLE_MEETING_PLACE),
    @XmlEnumValue("VehiclePoolingMeetingPlace")
    VEHICLE_POOLING_MEETING_PLACE(NameOfClassAddressablePlaceRefStructureType.VEHICLE_POOLING_MEETING_PLACE);
    private final NameOfClassAddressablePlaceRefStructureType value;

    NameOfClassVehicleMeetingPlaceRefStructureType(NameOfClassAddressablePlaceRefStructureType v) {
        value = v;
    }

    public NameOfClassAddressablePlaceRefStructureType value() {
        return value;
    }

    public static NameOfClassVehicleMeetingPlaceRefStructureType fromValue(NameOfClassAddressablePlaceRefStructureType v) {
        for (NameOfClassVehicleMeetingPlaceRefStructureType c: NameOfClassVehicleMeetingPlaceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
