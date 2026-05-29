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
 * <p>Java-Klasse f�r SupplementProductEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SupplementProductEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="seatReservation"/>
 *     &lt;enumeration value="bicycle"/>
 *     &lt;enumeration value="dog"/>
 *     &lt;enumeration value="animal"/>
 *     &lt;enumeration value="meal"/>
 *     &lt;enumeration value="wifi"/>
 *     &lt;enumeration value="extraLuggage"/>
 *     &lt;enumeration value="penalty"/>
 *     &lt;enumeration value="upgrade"/>
 *     &lt;enumeration value="journeyExtension"/>
 *     &lt;enumeration value="journeyAddOn"/>
 *     &lt;enumeration value="eventAddOn"/>
 *     &lt;enumeration value="parking"/>
 *     &lt;enumeration value="topUp"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SupplementProductEnumeration")
@XmlEnum
public enum SupplementProductEnumeration {

    @XmlEnumValue("seatReservation")
    SEAT_RESERVATION("seatReservation"),
    @XmlEnumValue("bicycle")
    BICYCLE("bicycle"),
    @XmlEnumValue("dog")
    DOG("dog"),
    @XmlEnumValue("animal")
    ANIMAL("animal"),
    @XmlEnumValue("meal")
    MEAL("meal"),
    @XmlEnumValue("wifi")
    WIFI("wifi"),
    @XmlEnumValue("extraLuggage")
    EXTRA_LUGGAGE("extraLuggage"),
    @XmlEnumValue("penalty")
    PENALTY("penalty"),
    @XmlEnumValue("upgrade")
    UPGRADE("upgrade"),
    @XmlEnumValue("journeyExtension")
    JOURNEY_EXTENSION("journeyExtension"),
    @XmlEnumValue("journeyAddOn")
    JOURNEY_ADD_ON("journeyAddOn"),
    @XmlEnumValue("eventAddOn")
    EVENT_ADD_ON("eventAddOn"),
    @XmlEnumValue("parking")
    PARKING("parking"),
    @XmlEnumValue("topUp")
    TOP_UP("topUp"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    SupplementProductEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SupplementProductEnumeration fromValue(String v) {
        for (SupplementProductEnumeration c: SupplementProductEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
