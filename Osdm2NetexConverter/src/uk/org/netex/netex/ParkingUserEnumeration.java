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
 * <p>Java-Klasse f�r ParkingUserEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingUserEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="allUsers"/>
 *     &lt;enumeration value="staff"/>
 *     &lt;enumeration value="visitors"/>
 *     &lt;enumeration value="customers"/>
 *     &lt;enumeration value="guests"/>
 *     &lt;enumeration value="registeredDisabled"/>
 *     &lt;enumeration value="impairedMobility"/>
 *     &lt;enumeration value="registered"/>
 *     &lt;enumeration value="rental"/>
 *     &lt;enumeration value="doctors"/>
 *     &lt;enumeration value="residentsWithPermits"/>
 *     &lt;enumeration value="reservationHolders"/>
 *     &lt;enumeration value="emergencyServices"/>
 *     &lt;enumeration value="taxi"/>
 *     &lt;enumeration value="vehicleSharing"/>
 *     &lt;enumeration value="women"/>
 *     &lt;enumeration value="families"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="all"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParkingUserEnumeration")
@XmlEnum
public enum ParkingUserEnumeration {

    @XmlEnumValue("allUsers")
    ALL_USERS("allUsers"),
    @XmlEnumValue("staff")
    STAFF("staff"),
    @XmlEnumValue("visitors")
    VISITORS("visitors"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("customers")
    CUSTOMERS("customers"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("guests")
    GUESTS("guests"),
    @XmlEnumValue("registeredDisabled")
    REGISTERED_DISABLED("registeredDisabled"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("impairedMobility")
    IMPAIRED_MOBILITY("impairedMobility"),
    @XmlEnumValue("registered")
    REGISTERED("registered"),
    @XmlEnumValue("rental")
    RENTAL("rental"),
    @XmlEnumValue("doctors")
    DOCTORS("doctors"),
    @XmlEnumValue("residentsWithPermits")
    RESIDENTS_WITH_PERMITS("residentsWithPermits"),
    @XmlEnumValue("reservationHolders")
    RESERVATION_HOLDERS("reservationHolders"),
    @XmlEnumValue("emergencyServices")
    EMERGENCY_SERVICES("emergencyServices"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("taxi")
    TAXI("taxi"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("vehicleSharing")
    VEHICLE_SHARING("vehicleSharing"),

    /**
     * +v2.0
     * 
     */
    @XmlEnumValue("women")
    WOMEN("women"),

    /**
     * +v2.0
     * 
     */
    @XmlEnumValue("families")
    FAMILIES("families"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    ParkingUserEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingUserEnumeration fromValue(String v) {
        for (ParkingUserEnumeration c: ParkingUserEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
