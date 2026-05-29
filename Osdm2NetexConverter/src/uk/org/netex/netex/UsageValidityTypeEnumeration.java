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
 * <p>Java-Klasse f�r UsageValidityTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="UsageValidityTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="singleRide"/>
 *     &lt;enumeration value="singleTrip"/>
 *     &lt;enumeration value="returnTrip"/>
 *     &lt;enumeration value="carnet"/>
 *     &lt;enumeration value="dayPass"/>
 *     &lt;enumeration value="weeklyPass"/>
 *     &lt;enumeration value="weekendPass"/>
 *     &lt;enumeration value="monthlyPass"/>
 *     &lt;enumeration value="annualPass"/>
 *     &lt;enumeration value="seasonTicket"/>
 *     &lt;enumeration value="profileMembership"/>
 *     &lt;enumeration value="subscription"/>
 *     &lt;enumeration value="openEnded"/>
 *     &lt;enumeration value="cap"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UsageValidityTypeEnumeration")
@XmlEnum
public enum UsageValidityTypeEnumeration {

    @XmlEnumValue("singleRide")
    SINGLE_RIDE("singleRide"),
    @XmlEnumValue("singleTrip")
    SINGLE_TRIP("singleTrip"),
    @XmlEnumValue("returnTrip")
    RETURN_TRIP("returnTrip"),
    @XmlEnumValue("carnet")
    CARNET("carnet"),
    @XmlEnumValue("dayPass")
    DAY_PASS("dayPass"),
    @XmlEnumValue("weeklyPass")
    WEEKLY_PASS("weeklyPass"),
    @XmlEnumValue("weekendPass")
    WEEKEND_PASS("weekendPass"),
    @XmlEnumValue("monthlyPass")
    MONTHLY_PASS("monthlyPass"),
    @XmlEnumValue("annualPass")
    ANNUAL_PASS("annualPass"),
    @XmlEnumValue("seasonTicket")
    SEASON_TICKET("seasonTicket"),
    @XmlEnumValue("profileMembership")
    PROFILE_MEMBERSHIP("profileMembership"),
    @XmlEnumValue("subscription")
    SUBSCRIPTION("subscription"),
    @XmlEnumValue("openEnded")
    OPEN_ENDED("openEnded"),
    @XmlEnumValue("cap")
    CAP("cap"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    UsageValidityTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UsageValidityTypeEnumeration fromValue(String v) {
        for (UsageValidityTypeEnumeration c: UsageValidityTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
