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
 * <p>Java-Klasse f�r NameOfClassStopPlaceSpaceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassStopPlaceSpaceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassSiteComponentRefStructureType">
 *     &lt;enumeration value="AccessSpace"/>
 *     &lt;enumeration value="BoardingPosition"/>
 *     &lt;enumeration value="Quay"/>
 *     &lt;enumeration value="TaxiStand"/>
 *     &lt;enumeration value="VehicleStoppingPlace"/>
 *     &lt;enumeration value="VehicleStoppingPosition"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassStopPlaceSpaceRefStructureType")
@XmlEnum(NameOfClassSiteComponentRefStructureType.class)
public enum NameOfClassStopPlaceSpaceRefStructureType {

    @XmlEnumValue("AccessSpace")
    ACCESS_SPACE(NameOfClassSiteComponentRefStructureType.ACCESS_SPACE),
    @XmlEnumValue("BoardingPosition")
    BOARDING_POSITION(NameOfClassSiteComponentRefStructureType.BOARDING_POSITION),
    @XmlEnumValue("Quay")
    QUAY(NameOfClassSiteComponentRefStructureType.QUAY),
    @XmlEnumValue("TaxiStand")
    TAXI_STAND(NameOfClassSiteComponentRefStructureType.TAXI_STAND),
    @XmlEnumValue("VehicleStoppingPlace")
    VEHICLE_STOPPING_PLACE(NameOfClassSiteComponentRefStructureType.VEHICLE_STOPPING_PLACE),
    @XmlEnumValue("VehicleStoppingPosition")
    VEHICLE_STOPPING_POSITION(NameOfClassSiteComponentRefStructureType.VEHICLE_STOPPING_POSITION);
    private final NameOfClassSiteComponentRefStructureType value;

    NameOfClassStopPlaceSpaceRefStructureType(NameOfClassSiteComponentRefStructureType v) {
        value = v;
    }

    public NameOfClassSiteComponentRefStructureType value() {
        return value;
    }

    public static NameOfClassStopPlaceSpaceRefStructureType fromValue(NameOfClassSiteComponentRefStructureType v) {
        for (NameOfClassStopPlaceSpaceRefStructureType c: NameOfClassStopPlaceSpaceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
