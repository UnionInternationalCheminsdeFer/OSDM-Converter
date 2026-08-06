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
 * <p>Java-Klasse f�r MobilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MobilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="wheelchair"/>
 *     &lt;enumeration value="assistedWheelchair"/>
 *     &lt;enumeration value="motorizedWheelchair"/>
 *     &lt;enumeration value="mobilityScooter"/>
 *     &lt;enumeration value="roadMobilityScooter"/>
 *     &lt;enumeration value="walkingFrame"/>
 *     &lt;enumeration value="restrictedMobility"/>
 *     &lt;enumeration value="otherMobilityNeed"/>
 *     &lt;enumeration value="normal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MobilityEnumeration")
@XmlEnum
public enum MobilityEnumeration {

    @XmlEnumValue("wheelchair")
    WHEELCHAIR("wheelchair"),
    @XmlEnumValue("assistedWheelchair")
    ASSISTED_WHEELCHAIR("assistedWheelchair"),
    @XmlEnumValue("motorizedWheelchair")
    MOTORIZED_WHEELCHAIR("motorizedWheelchair"),
    @XmlEnumValue("mobilityScooter")
    MOBILITY_SCOOTER("mobilityScooter"),
    @XmlEnumValue("roadMobilityScooter")
    ROAD_MOBILITY_SCOOTER("roadMobilityScooter"),
    @XmlEnumValue("walkingFrame")
    WALKING_FRAME("walkingFrame"),
    @XmlEnumValue("restrictedMobility")
    RESTRICTED_MOBILITY("restrictedMobility"),
    @XmlEnumValue("otherMobilityNeed")
    OTHER_MOBILITY_NEED("otherMobilityNeed"),
    @XmlEnumValue("normal")
    NORMAL("normal");
    private final String value;

    MobilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MobilityEnumeration fromValue(String v) {
        for (MobilityEnumeration c: MobilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
