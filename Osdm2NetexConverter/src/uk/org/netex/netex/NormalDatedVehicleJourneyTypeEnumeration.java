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
 * <p>Java-Klasse f�r NormalDatedVehicleJourneyTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NormalDatedVehicleJourneyTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="garageRunOut"/>
 *     &lt;enumeration value="garageRunIn"/>
 *     &lt;enumeration value="turningManoeuvre"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NormalDatedVehicleJourneyTypeEnumeration")
@XmlEnum
public enum NormalDatedVehicleJourneyTypeEnumeration {


    /**
     * INTERCHANGE is considered a possible connection between journeys.
     * 
     */
    @XmlEnumValue("garageRunOut")
    GARAGE_RUN_OUT("garageRunOut"),

    /**
     * INTERCHANGE is advertised to public as a possible connection between journeys.
     * 
     */
    @XmlEnumValue("garageRunIn")
    GARAGE_RUN_IN("garageRunIn"),

    /**
     * INTERCHANGE is actively managed as a possible connection between journeys and passengers are informed of real-time alterations.
     * 
     */
    @XmlEnumValue("turningManoeuvre")
    TURNING_MANOEUVRE("turningManoeuvre"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    NormalDatedVehicleJourneyTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NormalDatedVehicleJourneyTypeEnumeration fromValue(String v) {
        for (NormalDatedVehicleJourneyTypeEnumeration c: NormalDatedVehicleJourneyTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
