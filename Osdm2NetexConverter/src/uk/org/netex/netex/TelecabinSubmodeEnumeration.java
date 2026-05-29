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
 * <p>Java-Klasse f�r TelecabinSubmodeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TelecabinSubmodeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="telecabin"/>
 *     &lt;enumeration value="cableCar"/>
 *     &lt;enumeration value="lift"/>
 *     &lt;enumeration value="chairLift"/>
 *     &lt;enumeration value="dragLift"/>
 *     &lt;enumeration value="paternoster"/>
 *     &lt;enumeration value="telecabinLink"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TelecabinSubmodeEnumeration")
@XmlEnum
public enum TelecabinSubmodeEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),

    /**
     * A telecabin or gondola has lots of small cabins.
     * 
     */
    @XmlEnumValue("telecabin")
    TELECABIN("telecabin"),

    /**
     * A cable car has one or two large cabins that make alternating journeys up and down.
     * 
     */
    @XmlEnumValue("cableCar")
    CABLE_CAR("cableCar"),

    /**
     * Lift is a vertical (or sometimes slanting) elevator with a lift cage, usually in a building. It excludes ski lifts and other cableways.
     * 
     */
    @XmlEnumValue("lift")
    LIFT("lift"),
    @XmlEnumValue("chairLift")
    CHAIR_LIFT("chairLift"),
    @XmlEnumValue("dragLift")
    DRAG_LIFT("dragLift"),

    /**
     * A paternoster lift is a vertical passenger lift which consists of a chain of open compartments that passengers step into as it passes. +v2.0
     * 
     */
    @XmlEnumValue("paternoster")
    PATERNOSTER("paternoster"),

    /**
     * A telecabin connecting two points with no or little vertical difference.
     * 
     */
    @XmlEnumValue("telecabinLink")
    TELECABIN_LINK("telecabinLink");
    private final String value;

    TelecabinSubmodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TelecabinSubmodeEnumeration fromValue(String v) {
        for (TelecabinSubmodeEnumeration c: TelecabinSubmodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
