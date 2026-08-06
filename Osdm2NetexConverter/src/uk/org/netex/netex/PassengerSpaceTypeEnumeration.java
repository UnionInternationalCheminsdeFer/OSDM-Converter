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
 * <p>Java-Klasse f�r PassengerSpaceTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PassengerSpaceTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="seatingArea"/>
 *     &lt;enumeration value="passengerCabin"/>
 *     &lt;enumeration value="vehicleArea"/>
 *     &lt;enumeration value="luggageStore"/>
 *     &lt;enumeration value="corridor"/>
 *     &lt;enumeration value="restaurant"/>
 *     &lt;enumeration value="toilet"/>
 *     &lt;enumeration value="bathroom"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PassengerSpaceTypeEnumeration")
@XmlEnum
public enum PassengerSpaceTypeEnumeration {

    @XmlEnumValue("seatingArea")
    SEATING_AREA("seatingArea"),
    @XmlEnumValue("passengerCabin")
    PASSENGER_CABIN("passengerCabin"),
    @XmlEnumValue("vehicleArea")
    VEHICLE_AREA("vehicleArea"),
    @XmlEnumValue("luggageStore")
    LUGGAGE_STORE("luggageStore"),
    @XmlEnumValue("corridor")
    CORRIDOR("corridor"),
    @XmlEnumValue("restaurant")
    RESTAURANT("restaurant"),
    @XmlEnumValue("toilet")
    TOILET("toilet"),
    @XmlEnumValue("bathroom")
    BATHROOM("bathroom"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PassengerSpaceTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PassengerSpaceTypeEnumeration fromValue(String v) {
        for (PassengerSpaceTypeEnumeration c: PassengerSpaceTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
