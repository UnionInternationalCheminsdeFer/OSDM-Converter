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
 * <p>Java-Klasse f�r TrainElementTypeTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TrainElementTypeTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="buffetCar"/>
 *     &lt;enumeration value="carriage"/>
 *     &lt;enumeration value="engine"/>
 *     &lt;enumeration value="carTransporter"/>
 *     &lt;enumeration value="largeVehicleTransporter"/>
 *     &lt;enumeration value="sleeperCarriage"/>
 *     &lt;enumeration value="luggageVan"/>
 *     &lt;enumeration value="restaurantCarriage"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrainElementTypeTypeEnumeration")
@XmlEnum
public enum TrainElementTypeTypeEnumeration {

    @XmlEnumValue("buffetCar")
    BUFFET_CAR("buffetCar"),
    @XmlEnumValue("carriage")
    CARRIAGE("carriage"),
    @XmlEnumValue("engine")
    ENGINE("engine"),
    @XmlEnumValue("carTransporter")
    CAR_TRANSPORTER("carTransporter"),

    /**
     * +v2.0
     * 
     */
    @XmlEnumValue("largeVehicleTransporter")
    LARGE_VEHICLE_TRANSPORTER("largeVehicleTransporter"),
    @XmlEnumValue("sleeperCarriage")
    SLEEPER_CARRIAGE("sleeperCarriage"),
    @XmlEnumValue("luggageVan")
    LUGGAGE_VAN("luggageVan"),
    @XmlEnumValue("restaurantCarriage")
    RESTAURANT_CARRIAGE("restaurantCarriage"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TrainElementTypeTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrainElementTypeTypeEnumeration fromValue(String v) {
        for (TrainElementTypeTypeEnumeration c: TrainElementTypeTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
