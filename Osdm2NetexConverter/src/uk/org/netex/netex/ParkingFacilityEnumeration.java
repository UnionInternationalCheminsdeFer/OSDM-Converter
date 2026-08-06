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
 * <p>Java-Klasse f�r ParkingFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="carPark"/>
 *     &lt;enumeration value="parkAndRidePark"/>
 *     &lt;enumeration value="motorcyclePark"/>
 *     &lt;enumeration value="cyclePark"/>
 *     &lt;enumeration value="rentalCarPark"/>
 *     &lt;enumeration value="coachPark"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParkingFacilityEnumeration")
@XmlEnum
public enum ParkingFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("carPark")
    CAR_PARK("carPark"),
    @XmlEnumValue("parkAndRidePark")
    PARK_AND_RIDE_PARK("parkAndRidePark"),
    @XmlEnumValue("motorcyclePark")
    MOTORCYCLE_PARK("motorcyclePark"),
    @XmlEnumValue("cyclePark")
    CYCLE_PARK("cyclePark"),
    @XmlEnumValue("rentalCarPark")
    RENTAL_CAR_PARK("rentalCarPark"),
    @XmlEnumValue("coachPark")
    COACH_PARK("coachPark");
    private final String value;

    ParkingFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingFacilityEnumeration fromValue(String v) {
        for (ParkingFacilityEnumeration c: ParkingFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
