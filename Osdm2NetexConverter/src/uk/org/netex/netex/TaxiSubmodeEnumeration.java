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
 * <p>Java-Klasse f�r TaxiSubmodeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxiSubmodeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="communalTaxi"/>
 *     &lt;enumeration value="charterTaxi"/>
 *     &lt;enumeration value="waterTaxi"/>
 *     &lt;enumeration value="railTaxi"/>
 *     &lt;enumeration value="bikeTaxi"/>
 *     &lt;enumeration value="blackCab"/>
 *     &lt;enumeration value="miniCab"/>
 *     &lt;enumeration value="appTaxi"/>
 *     &lt;enumeration value="fiacre"/>
 *     &lt;enumeration value="rickshaw"/>
 *     &lt;enumeration value="cycleRickshaw"/>
 *     &lt;enumeration value="allTaxiServices"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxiSubmodeEnumeration")
@XmlEnum
public enum TaxiSubmodeEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * Undefined / other than any of the available types.
     * 
     */
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("communalTaxi")
    COMMUNAL_TAXI("communalTaxi"),

    /**
     * +v1.1
     * 
     */
    @XmlEnumValue("charterTaxi")
    CHARTER_TAXI("charterTaxi"),
    @XmlEnumValue("waterTaxi")
    WATER_TAXI("waterTaxi"),
    @XmlEnumValue("railTaxi")
    RAIL_TAXI("railTaxi"),

    /**
     * Bike taxi (other than cycleRickshaw, +v1.2.2).
     * 
     */
    @XmlEnumValue("bikeTaxi")
    BIKE_TAXI("bikeTaxi"),
    @XmlEnumValue("blackCab")
    BLACK_CAB("blackCab"),
    @XmlEnumValue("miniCab")
    MINI_CAB("miniCab"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("appTaxi")
    APP_TAXI("appTaxi"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("fiacre")
    FIACRE("fiacre"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("rickshaw")
    RICKSHAW("rickshaw"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("cycleRickshaw")
    CYCLE_RICKSHAW("cycleRickshaw"),
    @XmlEnumValue("allTaxiServices")
    ALL_TAXI_SERVICES("allTaxiServices");
    private final String value;

    TaxiSubmodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxiSubmodeEnumeration fromValue(String v) {
        for (TaxiSubmodeEnumeration c: TaxiSubmodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
