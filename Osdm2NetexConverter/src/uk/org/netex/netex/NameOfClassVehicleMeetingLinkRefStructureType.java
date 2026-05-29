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
 * <p>Java-Klasse f�r NameOfClassVehicleMeetingLinkRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassVehicleMeetingLinkRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassLinkRefStructureType">
 *     &lt;enumeration value="VehicleMeetingLink"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassVehicleMeetingLinkRefStructureType")
@XmlEnum(NameOfClassLinkRefStructureType.class)
public enum NameOfClassVehicleMeetingLinkRefStructureType {

    @XmlEnumValue("VehicleMeetingLink")
    VEHICLE_MEETING_LINK(NameOfClassLinkRefStructureType.VEHICLE_MEETING_LINK);
    private final NameOfClassLinkRefStructureType value;

    NameOfClassVehicleMeetingLinkRefStructureType(NameOfClassLinkRefStructureType v) {
        value = v;
    }

    public NameOfClassLinkRefStructureType value() {
        return value;
    }

    public static NameOfClassVehicleMeetingLinkRefStructureType fromValue(NameOfClassLinkRefStructureType v) {
        for (NameOfClassVehicleMeetingLinkRefStructureType c: NameOfClassVehicleMeetingLinkRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
