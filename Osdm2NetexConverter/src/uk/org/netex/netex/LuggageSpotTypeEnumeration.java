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
 * <p>Java-Klasse f�r LuggageSpotTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LuggageSpotTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="rackAboveSeats"/>
 *     &lt;enumeration value="spaceUnderSeat"/>
 *     &lt;enumeration value="luggageBay"/>
 *     &lt;enumeration value="luggageCompartment"/>
 *     &lt;enumeration value="luggageVan"/>
 *     &lt;enumeration value="cycleRack"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LuggageSpotTypeEnumeration")
@XmlEnum
public enum LuggageSpotTypeEnumeration {

    @XmlEnumValue("rackAboveSeats")
    RACK_ABOVE_SEATS("rackAboveSeats"),
    @XmlEnumValue("spaceUnderSeat")
    SPACE_UNDER_SEAT("spaceUnderSeat"),
    @XmlEnumValue("luggageBay")
    LUGGAGE_BAY("luggageBay"),
    @XmlEnumValue("luggageCompartment")
    LUGGAGE_COMPARTMENT("luggageCompartment"),
    @XmlEnumValue("luggageVan")
    LUGGAGE_VAN("luggageVan"),
    @XmlEnumValue("cycleRack")
    CYCLE_RACK("cycleRack"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    LuggageSpotTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LuggageSpotTypeEnumeration fromValue(String v) {
        for (LuggageSpotTypeEnumeration c: LuggageSpotTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
