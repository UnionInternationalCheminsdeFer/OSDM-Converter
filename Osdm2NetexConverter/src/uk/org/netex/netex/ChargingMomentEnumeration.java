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
 * <p>Java-Klasse f�r ChargingMomentEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargingMomentEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="beforeTravel"/>
 *     &lt;enumeration value="onStartOfTravel"/>
 *     &lt;enumeration value="beforeEndOfTravel"/>
 *     &lt;enumeration value="beforeTravelThenAdjustAtEndOfTravel"/>
 *     &lt;enumeration value="onStartThenAdjustAtEndOfTravel"/>
 *     &lt;enumeration value="onStarThenAdjustAtEndOfFareDay"/>
 *     &lt;enumeration value="onStartThenAdjustAtEndOfFareDay"/>
 *     &lt;enumeration value="onStartThenAdjustAtEndOfChargePeriod"/>
 *     &lt;enumeration value="atEndOfTravel"/>
 *     &lt;enumeration value="atEndOfFareDay"/>
 *     &lt;enumeration value="atEndOfChargePeriod"/>
 *     &lt;enumeration value="free"/>
 *     &lt;enumeration value="anyTime"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChargingMomentEnumeration")
@XmlEnum
public enum ChargingMomentEnumeration {

    @XmlEnumValue("beforeTravel")
    BEFORE_TRAVEL("beforeTravel"),
    @XmlEnumValue("onStartOfTravel")
    ON_START_OF_TRAVEL("onStartOfTravel"),
    @XmlEnumValue("beforeEndOfTravel")
    BEFORE_END_OF_TRAVEL("beforeEndOfTravel"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("beforeTravelThenAdjustAtEndOfTravel")
    BEFORE_TRAVEL_THEN_ADJUST_AT_END_OF_TRAVEL("beforeTravelThenAdjustAtEndOfTravel"),
    @XmlEnumValue("onStartThenAdjustAtEndOfTravel")
    ON_START_THEN_ADJUST_AT_END_OF_TRAVEL("onStartThenAdjustAtEndOfTravel"),

    /**
     * DEPRECATED TYPO. -v1.2.2
     * 
     */
    @XmlEnumValue("onStarThenAdjustAtEndOfFareDay")
    ON_STAR_THEN_ADJUST_AT_END_OF_FARE_DAY("onStarThenAdjustAtEndOfFareDay"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("onStartThenAdjustAtEndOfFareDay")
    ON_START_THEN_ADJUST_AT_END_OF_FARE_DAY("onStartThenAdjustAtEndOfFareDay"),
    @XmlEnumValue("onStartThenAdjustAtEndOfChargePeriod")
    ON_START_THEN_ADJUST_AT_END_OF_CHARGE_PERIOD("onStartThenAdjustAtEndOfChargePeriod"),
    @XmlEnumValue("atEndOfTravel")
    AT_END_OF_TRAVEL("atEndOfTravel"),
    @XmlEnumValue("atEndOfFareDay")
    AT_END_OF_FARE_DAY("atEndOfFareDay"),
    @XmlEnumValue("atEndOfChargePeriod")
    AT_END_OF_CHARGE_PERIOD("atEndOfChargePeriod"),
    @XmlEnumValue("free")
    FREE("free"),
    @XmlEnumValue("anyTime")
    ANY_TIME("anyTime"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ChargingMomentEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChargingMomentEnumeration fromValue(String v) {
        for (ChargingMomentEnumeration c: ChargingMomentEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
