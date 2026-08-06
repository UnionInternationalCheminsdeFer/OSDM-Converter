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
 * <p>Java-Klasse f�r AccessSpaceTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessSpaceTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="concourse"/>
 *     &lt;enumeration value="bookingHall"/>
 *     &lt;enumeration value="forecourt"/>
 *     &lt;enumeration value="underpass"/>
 *     &lt;enumeration value="overpass"/>
 *     &lt;enumeration value="passage"/>
 *     &lt;enumeration value="passageSection"/>
 *     &lt;enumeration value="lift"/>
 *     &lt;enumeration value="gallery"/>
 *     &lt;enumeration value="garage"/>
 *     &lt;enumeration value="shop"/>
 *     &lt;enumeration value="waitingRoom"/>
 *     &lt;enumeration value="restaurant"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="staircase"/>
 *     &lt;enumeration value="wc"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccessSpaceTypeEnumeration")
@XmlEnum
public enum AccessSpaceTypeEnumeration {

    @XmlEnumValue("concourse")
    CONCOURSE("concourse"),
    @XmlEnumValue("bookingHall")
    BOOKING_HALL("bookingHall"),
    @XmlEnumValue("forecourt")
    FORECOURT("forecourt"),
    @XmlEnumValue("underpass")
    UNDERPASS("underpass"),
    @XmlEnumValue("overpass")
    OVERPASS("overpass"),
    @XmlEnumValue("passage")
    PASSAGE("passage"),
    @XmlEnumValue("passageSection")
    PASSAGE_SECTION("passageSection"),
    @XmlEnumValue("lift")
    LIFT("lift"),
    @XmlEnumValue("gallery")
    GALLERY("gallery"),
    @XmlEnumValue("garage")
    GARAGE("garage"),
    @XmlEnumValue("shop")
    SHOP("shop"),
    @XmlEnumValue("waitingRoom")
    WAITING_ROOM("waitingRoom"),
    @XmlEnumValue("restaurant")
    RESTAURANT("restaurant"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("staircase")
    STAIRCASE("staircase"),
    @XmlEnumValue("wc")
    WC("wc");
    private final String value;

    AccessSpaceTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessSpaceTypeEnumeration fromValue(String v) {
        for (AccessSpaceTypeEnumeration c: AccessSpaceTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
