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
 * <p>Java-Klasse f�r BusSubmodeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BusSubmodeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="localBus"/>
 *     &lt;enumeration value="regionalBus"/>
 *     &lt;enumeration value="expressBus"/>
 *     &lt;enumeration value="nightBus"/>
 *     &lt;enumeration value="postBus"/>
 *     &lt;enumeration value="specialNeedsBus"/>
 *     &lt;enumeration value="mobilityBus"/>
 *     &lt;enumeration value="mobilityBusForRegisteredDisabled"/>
 *     &lt;enumeration value="sightseeingBus"/>
 *     &lt;enumeration value="shuttleBus"/>
 *     &lt;enumeration value="highFrequencyBus"/>
 *     &lt;enumeration value="dedicatedLaneBus"/>
 *     &lt;enumeration value="schoolBus"/>
 *     &lt;enumeration value="schoolAndPublicServiceBus"/>
 *     &lt;enumeration value="railReplacementBus"/>
 *     &lt;enumeration value="demandAndResponseBus"/>
 *     &lt;enumeration value="airportLinkBus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BusSubmodeEnumeration")
@XmlEnum
public enum BusSubmodeEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("localBus")
    LOCAL_BUS("localBus"),
    @XmlEnumValue("regionalBus")
    REGIONAL_BUS("regionalBus"),
    @XmlEnumValue("expressBus")
    EXPRESS_BUS("expressBus"),
    @XmlEnumValue("nightBus")
    NIGHT_BUS("nightBus"),
    @XmlEnumValue("postBus")
    POST_BUS("postBus"),
    @XmlEnumValue("specialNeedsBus")
    SPECIAL_NEEDS_BUS("specialNeedsBus"),
    @XmlEnumValue("mobilityBus")
    MOBILITY_BUS("mobilityBus"),
    @XmlEnumValue("mobilityBusForRegisteredDisabled")
    MOBILITY_BUS_FOR_REGISTERED_DISABLED("mobilityBusForRegisteredDisabled"),
    @XmlEnumValue("sightseeingBus")
    SIGHTSEEING_BUS("sightseeingBus"),
    @XmlEnumValue("shuttleBus")
    SHUTTLE_BUS("shuttleBus"),
    @XmlEnumValue("highFrequencyBus")
    HIGH_FREQUENCY_BUS("highFrequencyBus"),
    @XmlEnumValue("dedicatedLaneBus")
    DEDICATED_LANE_BUS("dedicatedLaneBus"),
    @XmlEnumValue("schoolBus")
    SCHOOL_BUS("schoolBus"),
    @XmlEnumValue("schoolAndPublicServiceBus")
    SCHOOL_AND_PUBLIC_SERVICE_BUS("schoolAndPublicServiceBus"),
    @XmlEnumValue("railReplacementBus")
    RAIL_REPLACEMENT_BUS("railReplacementBus"),
    @XmlEnumValue("demandAndResponseBus")
    DEMAND_AND_RESPONSE_BUS("demandAndResponseBus"),
    @XmlEnumValue("airportLinkBus")
    AIRPORT_LINK_BUS("airportLinkBus");
    private final String value;

    BusSubmodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusSubmodeEnumeration fromValue(String v) {
        for (BusSubmodeEnumeration c: BusSubmodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
