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
 * <p>Java-Klasse f�r CoachSubmodeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CoachSubmodeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="internationalCoach"/>
 *     &lt;enumeration value="nationalCoach"/>
 *     &lt;enumeration value="shuttleCoach"/>
 *     &lt;enumeration value="regionalCoach"/>
 *     &lt;enumeration value="specialCoach"/>
 *     &lt;enumeration value="schoolCoach"/>
 *     &lt;enumeration value="sightseeingCoach"/>
 *     &lt;enumeration value="touristCoach"/>
 *     &lt;enumeration value="commuterCoach"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CoachSubmodeEnumeration")
@XmlEnum
public enum CoachSubmodeEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("internationalCoach")
    INTERNATIONAL_COACH("internationalCoach"),
    @XmlEnumValue("nationalCoach")
    NATIONAL_COACH("nationalCoach"),
    @XmlEnumValue("shuttleCoach")
    SHUTTLE_COACH("shuttleCoach"),
    @XmlEnumValue("regionalCoach")
    REGIONAL_COACH("regionalCoach"),
    @XmlEnumValue("specialCoach")
    SPECIAL_COACH("specialCoach"),
    @XmlEnumValue("schoolCoach")
    SCHOOL_COACH("schoolCoach"),
    @XmlEnumValue("sightseeingCoach")
    SIGHTSEEING_COACH("sightseeingCoach"),
    @XmlEnumValue("touristCoach")
    TOURIST_COACH("touristCoach"),
    @XmlEnumValue("commuterCoach")
    COMMUTER_COACH("commuterCoach");
    private final String value;

    CoachSubmodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CoachSubmodeEnumeration fromValue(String v) {
        for (CoachSubmodeEnumeration c: CoachSubmodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
