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
 * <p>Java-Klasse f�r VehiclePoolingTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VehiclePoolingTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="taxi"/>
 *     &lt;enumeration value="appBookedTaxi"/>
 *     &lt;enumeration value="sharedTaxi"/>
 *     &lt;enumeration value="prebookedTaxi"/>
 *     &lt;enumeration value="chaffeuredVehicle"/>
 *     &lt;enumeration value="dynamicCarPooling"/>
 *     &lt;enumeration value="longDistanceCarPooling"/>
 *     &lt;enumeration value="commuterCarPooling"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehiclePoolingTypeEnumeration")
@XmlEnum
public enum VehiclePoolingTypeEnumeration {

    @XmlEnumValue("taxi")
    TAXI("taxi"),
    @XmlEnumValue("appBookedTaxi")
    APP_BOOKED_TAXI("appBookedTaxi"),
    @XmlEnumValue("sharedTaxi")
    SHARED_TAXI("sharedTaxi"),
    @XmlEnumValue("prebookedTaxi")
    PREBOOKED_TAXI("prebookedTaxi"),
    @XmlEnumValue("chaffeuredVehicle")
    CHAFFEURED_VEHICLE("chaffeuredVehicle"),
    @XmlEnumValue("dynamicCarPooling")
    DYNAMIC_CAR_POOLING("dynamicCarPooling"),
    @XmlEnumValue("longDistanceCarPooling")
    LONG_DISTANCE_CAR_POOLING("longDistanceCarPooling"),
    @XmlEnumValue("commuterCarPooling")
    COMMUTER_CAR_POOLING("commuterCarPooling");
    private final String value;

    VehiclePoolingTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehiclePoolingTypeEnumeration fromValue(String v) {
        for (VehiclePoolingTypeEnumeration c: VehiclePoolingTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
