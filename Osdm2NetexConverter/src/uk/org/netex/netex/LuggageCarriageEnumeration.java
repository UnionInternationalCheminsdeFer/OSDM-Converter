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
 * <p>Java-Klasse f�r LuggageCarriageEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LuggageCarriageEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="noBaggageStorage"/>
 *     &lt;enumeration value="baggageStorage"/>
 *     &lt;enumeration value="luggageRacks"/>
 *     &lt;enumeration value="skiRacks"/>
 *     &lt;enumeration value="skiRacksOnRear"/>
 *     &lt;enumeration value="extraLargeLuggageRacks"/>
 *     &lt;enumeration value="baggageVan"/>
 *     &lt;enumeration value="noCycles"/>
 *     &lt;enumeration value="cyclesAllowed"/>
 *     &lt;enumeration value="cyclesAllowedInVan"/>
 *     &lt;enumeration value="cyclesAllowedInCarriage"/>
 *     &lt;enumeration value="cyclesAllowedWithReservation"/>
 *     &lt;enumeration value="pushchairsAllowed"/>
 *     &lt;enumeration value="vehicleTransport"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LuggageCarriageEnumeration")
@XmlEnum
public enum LuggageCarriageEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("noBaggageStorage")
    NO_BAGGAGE_STORAGE("noBaggageStorage"),
    @XmlEnumValue("baggageStorage")
    BAGGAGE_STORAGE("baggageStorage"),
    @XmlEnumValue("luggageRacks")
    LUGGAGE_RACKS("luggageRacks"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("skiRacks")
    SKI_RACKS("skiRacks"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("skiRacksOnRear")
    SKI_RACKS_ON_REAR("skiRacksOnRear"),
    @XmlEnumValue("extraLargeLuggageRacks")
    EXTRA_LARGE_LUGGAGE_RACKS("extraLargeLuggageRacks"),
    @XmlEnumValue("baggageVan")
    BAGGAGE_VAN("baggageVan"),
    @XmlEnumValue("noCycles")
    NO_CYCLES("noCycles"),
    @XmlEnumValue("cyclesAllowed")
    CYCLES_ALLOWED("cyclesAllowed"),
    @XmlEnumValue("cyclesAllowedInVan")
    CYCLES_ALLOWED_IN_VAN("cyclesAllowedInVan"),
    @XmlEnumValue("cyclesAllowedInCarriage")
    CYCLES_ALLOWED_IN_CARRIAGE("cyclesAllowedInCarriage"),
    @XmlEnumValue("cyclesAllowedWithReservation")
    CYCLES_ALLOWED_WITH_RESERVATION("cyclesAllowedWithReservation"),
    @XmlEnumValue("pushchairsAllowed")
    PUSHCHAIRS_ALLOWED("pushchairsAllowed"),
    @XmlEnumValue("vehicleTransport")
    VEHICLE_TRANSPORT("vehicleTransport");
    private final String value;

    LuggageCarriageEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LuggageCarriageEnumeration fromValue(String v) {
        for (LuggageCarriageEnumeration c: LuggageCarriageEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
