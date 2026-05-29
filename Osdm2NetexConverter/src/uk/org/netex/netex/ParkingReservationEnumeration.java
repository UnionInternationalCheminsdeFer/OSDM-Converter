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
 * <p>Java-Klasse f�r ParkingReservationEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingReservationEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="reservationRequired"/>
 *     &lt;enumeration value="reservationAllowed"/>
 *     &lt;enumeration value="noReservations"/>
 *     &lt;enumeration value="registrationRequired"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParkingReservationEnumeration")
@XmlEnum
public enum ParkingReservationEnumeration {

    @XmlEnumValue("reservationRequired")
    RESERVATION_REQUIRED("reservationRequired"),
    @XmlEnumValue("reservationAllowed")
    RESERVATION_ALLOWED("reservationAllowed"),
    @XmlEnumValue("noReservations")
    NO_RESERVATIONS("noReservations"),
    @XmlEnumValue("registrationRequired")
    REGISTRATION_REQUIRED("registrationRequired"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ParkingReservationEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingReservationEnumeration fromValue(String v) {
        for (ParkingReservationEnumeration c: ParkingReservationEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
