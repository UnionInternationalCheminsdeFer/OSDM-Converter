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
 * <p>Java-Klasse f�r VehicleSharingTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleSharingTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="carSharingClub"/>
 *     &lt;enumeration value="peerToPeerCarSharing"/>
 *     &lt;enumeration value="vehicleSharing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleSharingTypeEnumeration")
@XmlEnum
public enum VehicleSharingTypeEnumeration {

    @XmlEnumValue("carSharingClub")
    CAR_SHARING_CLUB("carSharingClub"),
    @XmlEnumValue("peerToPeerCarSharing")
    PEER_TO_PEER_CAR_SHARING("peerToPeerCarSharing"),
    @XmlEnumValue("vehicleSharing")
    VEHICLE_SHARING("vehicleSharing");
    private final String value;

    VehicleSharingTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleSharingTypeEnumeration fromValue(String v) {
        for (VehicleSharingTypeEnumeration c: VehicleSharingTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
