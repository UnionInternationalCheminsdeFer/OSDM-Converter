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
 * <p>Java-Klasse f�r TypeOfLocatableSpotEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfLocatableSpotEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="seat"/>
 *     &lt;enumeration value="bed"/>
 *     &lt;enumeration value="standingSpace"/>
 *     &lt;enumeration value="wheelchairSpace"/>
 *     &lt;enumeration value="pushchairSpace"/>
 *     &lt;enumeration value="luggageSpace"/>
 *     &lt;enumeration value="bicycleSpace"/>
 *     &lt;enumeration value="vehicleSpace"/>
 *     &lt;enumeration value="specialSpace"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeOfLocatableSpotEnumeration")
@XmlEnum
public enum TypeOfLocatableSpotEnumeration {

    @XmlEnumValue("seat")
    SEAT("seat"),
    @XmlEnumValue("bed")
    BED("bed"),
    @XmlEnumValue("standingSpace")
    STANDING_SPACE("standingSpace"),
    @XmlEnumValue("wheelchairSpace")
    WHEELCHAIR_SPACE("wheelchairSpace"),
    @XmlEnumValue("pushchairSpace")
    PUSHCHAIR_SPACE("pushchairSpace"),
    @XmlEnumValue("luggageSpace")
    LUGGAGE_SPACE("luggageSpace"),
    @XmlEnumValue("bicycleSpace")
    BICYCLE_SPACE("bicycleSpace"),
    @XmlEnumValue("vehicleSpace")
    VEHICLE_SPACE("vehicleSpace"),
    @XmlEnumValue("specialSpace")
    SPECIAL_SPACE("specialSpace"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TypeOfLocatableSpotEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfLocatableSpotEnumeration fromValue(String v) {
        for (TypeOfLocatableSpotEnumeration c: TypeOfLocatableSpotEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
