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
 * <p>Java-Klasse f�r UsageTriggerEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="UsageTriggerEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="enrolment"/>
 *     &lt;enumeration value="reservation"/>
 *     &lt;enumeration value="purchase"/>
 *     &lt;enumeration value="fulfilment"/>
 *     &lt;enumeration value="activation"/>
 *     &lt;enumeration value="specifiedStartDate"/>
 *     &lt;enumeration value="startOutboundRide"/>
 *     &lt;enumeration value="endOutboundRide"/>
 *     &lt;enumeration value="startReturnRide"/>
 *     &lt;enumeration value="startOfPeriod"/>
 *     &lt;enumeration value="dayOffsetBeforeCalendarPeriod"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UsageTriggerEnumeration")
@XmlEnum
public enum UsageTriggerEnumeration {


    /**
     * Validity period starts when user registers (e.g. creates a customer account).
     * 
     */
    @XmlEnumValue("enrolment")
    ENROLMENT("enrolment"),

    /**
     * Validity period starts when user makes a reservation.
     * 
     */
    @XmlEnumValue("reservation")
    RESERVATION("reservation"),

    /**
     * Validity period starts when user makes a purchase.
     * 
     */
    @XmlEnumValue("purchase")
    PURCHASE("purchase"),

    /**
     * Validity period starts when user collects their travel documents.
     * 
     */
    @XmlEnumValue("fulfilment")
    FULFILMENT("fulfilment"),

    /**
     * Validity period starts when user activates a product.
     * 
     */
    @XmlEnumValue("activation")
    ACTIVATION("activation"),

    /**
     * Validity period starts on date specified on produc..
     * 
     */
    @XmlEnumValue("specifiedStartDate")
    SPECIFIED_START_DATE("specifiedStartDate"),

    /**
     * Validity period starts on commencement of outbound trip.
     * 
     */
    @XmlEnumValue("startOutboundRide")
    START_OUTBOUND_RIDE("startOutboundRide"),

    /**
     * Validity period starts on completion of outbound trip of a return or multi-part trip.
     * 
     */
    @XmlEnumValue("endOutboundRide")
    END_OUTBOUND_RIDE("endOutboundRide"),

    /**
     * Validity period starts on commencement of return trip.
     * 
     */
    @XmlEnumValue("startReturnRide")
    START_RETURN_RIDE("startReturnRide"),

    /**
     * Validity period starts at beginning of interval specified for product (e.g. every month for a monthly pass that renews automatically).
     * 
     */
    @XmlEnumValue("startOfPeriod")
    START_OF_PERIOD("startOfPeriod"),

    /**
     * Validity period starts a specifed number of days before beginning of specified start date .
     * 
     */
    @XmlEnumValue("dayOffsetBeforeCalendarPeriod")
    DAY_OFFSET_BEFORE_CALENDAR_PERIOD("dayOffsetBeforeCalendarPeriod");
    private final String value;

    UsageTriggerEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UsageTriggerEnumeration fromValue(String v) {
        for (UsageTriggerEnumeration c: UsageTriggerEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
