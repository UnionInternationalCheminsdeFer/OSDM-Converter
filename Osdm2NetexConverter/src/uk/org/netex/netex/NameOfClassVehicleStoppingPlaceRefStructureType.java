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
 * <p>Java-Klasse f�r NameOfClassVehicleStoppingPlaceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassVehicleStoppingPlaceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassStopPlaceSpaceRefStructureType">
 *     &lt;enumeration value="VehicleStoppingPlace"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassVehicleStoppingPlaceRefStructureType")
@XmlEnum(NameOfClassStopPlaceSpaceRefStructureType.class)
public enum NameOfClassVehicleStoppingPlaceRefStructureType {

    @XmlEnumValue("VehicleStoppingPlace")
    VEHICLE_STOPPING_PLACE(NameOfClassStopPlaceSpaceRefStructureType.VEHICLE_STOPPING_PLACE);
    private final NameOfClassStopPlaceSpaceRefStructureType value;

    NameOfClassVehicleStoppingPlaceRefStructureType(NameOfClassStopPlaceSpaceRefStructureType v) {
        value = v;
    }

    public NameOfClassStopPlaceSpaceRefStructureType value() {
        return value;
    }

    public static NameOfClassVehicleStoppingPlaceRefStructureType fromValue(NameOfClassStopPlaceSpaceRefStructureType v) {
        for (NameOfClassVehicleStoppingPlaceRefStructureType c: NameOfClassVehicleStoppingPlaceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
