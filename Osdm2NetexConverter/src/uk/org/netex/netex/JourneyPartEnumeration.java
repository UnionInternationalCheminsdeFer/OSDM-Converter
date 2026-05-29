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
 * <p>Java-Klasse f�r JourneyPartEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="JourneyPartEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="joiningTo"/>
 *     &lt;enumeration value="splittingFrom"/>
 *     &lt;enumeration value="splittingTo"/>
 *     &lt;enumeration value="joinFrom"/>
 *     &lt;enumeration value="connectTo"/>
 *     &lt;enumeration value="identificationNumberChange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JourneyPartEnumeration")
@XmlEnum
public enum JourneyPartEnumeration {


    /**
     * INTERCHANGE is considered a possible connection between journeys.
     * 
     */
    @XmlEnumValue("joiningTo")
    JOINING_TO("joiningTo"),

    /**
     * INTERCHANGE is advertised to public as a possible connection between journeys.
     * 
     */
    @XmlEnumValue("splittingFrom")
    SPLITTING_FROM("splittingFrom"),

    /**
     * INTERCHANGE is actively managed as a possible connection between journeys and passengers are informed of real-time alterations.
     * 
     */
    @XmlEnumValue("splittingTo")
    SPLITTING_TO("splittingTo"),

    /**
     * INTERCHANGE is actively managed as a possible connection between journeys and distributor may be delayed in order to make a transfer possible.
     * 
     */
    @XmlEnumValue("joinFrom")
    JOIN_FROM("joinFrom"),
    @XmlEnumValue("connectTo")
    CONNECT_TO("connectTo"),
    @XmlEnumValue("identificationNumberChange")
    IDENTIFICATION_NUMBER_CHANGE("identificationNumberChange");
    private final String value;

    JourneyPartEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JourneyPartEnumeration fromValue(String v) {
        for (JourneyPartEnumeration c: JourneyPartEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
