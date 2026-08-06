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
 * <p>Java-Klasse f�r SeatAllocationMethodEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SeatAllocationMethodEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="autoAssigned"/>
 *     &lt;enumeration value="seatMap"/>
 *     &lt;enumeration value="openSeating"/>
 *     &lt;enumeration value="manualAssignment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SeatAllocationMethodEnumeration")
@XmlEnum
public enum SeatAllocationMethodEnumeration {


    /**
     * A seat will be assigned automatically by an algorithm.
     * 
     */
    @XmlEnumValue("autoAssigned")
    AUTO_ASSIGNED("autoAssigned"),

    /**
     * The passenger may choose a specific seat from the available seats.
     * 
     */
    @XmlEnumValue("seatMap")
    SEAT_MAP("seatMap"),

    /**
     * It is not possible to reserve a specific seat.
     * 
     */
    @XmlEnumValue("openSeating")
    OPEN_SEATING("openSeating"),

    /**
     * Seat is assigned by operator or retailer staff.
     * 
     */
    @XmlEnumValue("manualAssignment")
    MANUAL_ASSIGNMENT("manualAssignment");
    private final String value;

    SeatAllocationMethodEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeatAllocationMethodEnumeration fromValue(String v) {
        for (SeatAllocationMethodEnumeration c: SeatAllocationMethodEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
