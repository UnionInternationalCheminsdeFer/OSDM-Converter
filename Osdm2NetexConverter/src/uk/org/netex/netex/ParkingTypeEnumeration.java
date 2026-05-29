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
 * <p>Java-Klasse f�r ParkingTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="parkAndRide"/>
 *     &lt;enumeration value="liftShareParking"/>
 *     &lt;enumeration value="urbanParking"/>
 *     &lt;enumeration value="airportParking"/>
 *     &lt;enumeration value="trainStationParking"/>
 *     &lt;enumeration value="exhibitionCentreParking"/>
 *     &lt;enumeration value="rentalCarParking"/>
 *     &lt;enumeration value="shoppingCentreParking"/>
 *     &lt;enumeration value="motorwayParking"/>
 *     &lt;enumeration value="roadside"/>
 *     &lt;enumeration value="parkingZone"/>
 *     &lt;enumeration value="cycleRental"/>
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParkingTypeEnumeration")
@XmlEnum
public enum ParkingTypeEnumeration {

    @XmlEnumValue("parkAndRide")
    PARK_AND_RIDE("parkAndRide"),
    @XmlEnumValue("liftShareParking")
    LIFT_SHARE_PARKING("liftShareParking"),
    @XmlEnumValue("urbanParking")
    URBAN_PARKING("urbanParking"),
    @XmlEnumValue("airportParking")
    AIRPORT_PARKING("airportParking"),
    @XmlEnumValue("trainStationParking")
    TRAIN_STATION_PARKING("trainStationParking"),
    @XmlEnumValue("exhibitionCentreParking")
    EXHIBITION_CENTRE_PARKING("exhibitionCentreParking"),
    @XmlEnumValue("rentalCarParking")
    RENTAL_CAR_PARKING("rentalCarParking"),
    @XmlEnumValue("shoppingCentreParking")
    SHOPPING_CENTRE_PARKING("shoppingCentreParking"),
    @XmlEnumValue("motorwayParking")
    MOTORWAY_PARKING("motorwayParking"),
    @XmlEnumValue("roadside")
    ROADSIDE("roadside"),
    @XmlEnumValue("parkingZone")
    PARKING_ZONE("parkingZone"),
    @XmlEnumValue("cycleRental")
    CYCLE_RENTAL("cycleRental"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ParkingTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingTypeEnumeration fromValue(String v) {
        for (ParkingTypeEnumeration c: ParkingTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
