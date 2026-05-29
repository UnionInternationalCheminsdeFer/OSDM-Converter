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
 * <p>Java-Klasse f�r CheckProcessTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CheckProcessTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="boarding"/>
 *     &lt;enumeration value="alighting"/>
 *     &lt;enumeration value="ticketPurchase"/>
 *     &lt;enumeration value="ticketCollection"/>
 *     &lt;enumeration value="ticketValidation"/>
 *     &lt;enumeration value="baggageCheckIn"/>
 *     &lt;enumeration value="checkIn"/>
 *     &lt;enumeration value="checkOut"/>
 *     &lt;enumeration value="checkout"/>
 *     &lt;enumeration value="oversizeBaggageCheckIn"/>
 *     &lt;enumeration value="oversizeBaggageReclaim"/>
 *     &lt;enumeration value="baggageReclaim"/>
 *     &lt;enumeration value="leftLuggageDeposit"/>
 *     &lt;enumeration value="leftLuggageReclaim"/>
 *     &lt;enumeration value="firstclassCheckin"/>
 *     &lt;enumeration value="specialNeedsCheckin"/>
 *     &lt;enumeration value="baggageSecurityCheck"/>
 *     &lt;enumeration value="securityCheck"/>
 *     &lt;enumeration value="outgoingPassportControl"/>
 *     &lt;enumeration value="incomingPassportControl"/>
 *     &lt;enumeration value="fasttrackDepartures"/>
 *     &lt;enumeration value="fasttrackArrivals"/>
 *     &lt;enumeration value="incomingDutyFree"/>
 *     &lt;enumeration value="outgoingDutyFree"/>
 *     &lt;enumeration value="taxRefunds"/>
 *     &lt;enumeration value="outgoingCustoms"/>
 *     &lt;enumeration value="incomingCustoms"/>
 *     &lt;enumeration value="waitForLift"/>
 *     &lt;enumeration value="ingress"/>
 *     &lt;enumeration value="egress"/>
 *     &lt;enumeration value="queue"/>
 *     &lt;enumeration value="vehicleLoading"/>
 *     &lt;enumeration value="vehicleUnloading"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CheckProcessTypeEnumeration")
@XmlEnum
public enum CheckProcessTypeEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("boarding")
    BOARDING("boarding"),
    @XmlEnumValue("alighting")
    ALIGHTING("alighting"),
    @XmlEnumValue("ticketPurchase")
    TICKET_PURCHASE("ticketPurchase"),
    @XmlEnumValue("ticketCollection")
    TICKET_COLLECTION("ticketCollection"),
    @XmlEnumValue("ticketValidation")
    TICKET_VALIDATION("ticketValidation"),
    @XmlEnumValue("baggageCheckIn")
    BAGGAGE_CHECK_IN("baggageCheckIn"),
    @XmlEnumValue("checkIn")
    CHECK_IN("checkIn"),
    @XmlEnumValue("checkOut")
    CHECK_OUT("checkOut"),

    /**
     * DEPRECATED
     * 
     */
    @XmlEnumValue("checkout")
    CHECKOUT("checkout"),
    @XmlEnumValue("oversizeBaggageCheckIn")
    OVERSIZE_BAGGAGE_CHECK_IN("oversizeBaggageCheckIn"),
    @XmlEnumValue("oversizeBaggageReclaim")
    OVERSIZE_BAGGAGE_RECLAIM("oversizeBaggageReclaim"),
    @XmlEnumValue("baggageReclaim")
    BAGGAGE_RECLAIM("baggageReclaim"),
    @XmlEnumValue("leftLuggageDeposit")
    LEFT_LUGGAGE_DEPOSIT("leftLuggageDeposit"),
    @XmlEnumValue("leftLuggageReclaim")
    LEFT_LUGGAGE_RECLAIM("leftLuggageReclaim"),
    @XmlEnumValue("firstclassCheckin")
    FIRSTCLASS_CHECKIN("firstclassCheckin"),
    @XmlEnumValue("specialNeedsCheckin")
    SPECIAL_NEEDS_CHECKIN("specialNeedsCheckin"),
    @XmlEnumValue("baggageSecurityCheck")
    BAGGAGE_SECURITY_CHECK("baggageSecurityCheck"),
    @XmlEnumValue("securityCheck")
    SECURITY_CHECK("securityCheck"),
    @XmlEnumValue("outgoingPassportControl")
    OUTGOING_PASSPORT_CONTROL("outgoingPassportControl"),
    @XmlEnumValue("incomingPassportControl")
    INCOMING_PASSPORT_CONTROL("incomingPassportControl"),
    @XmlEnumValue("fasttrackDepartures")
    FASTTRACK_DEPARTURES("fasttrackDepartures"),
    @XmlEnumValue("fasttrackArrivals")
    FASTTRACK_ARRIVALS("fasttrackArrivals"),
    @XmlEnumValue("incomingDutyFree")
    INCOMING_DUTY_FREE("incomingDutyFree"),
    @XmlEnumValue("outgoingDutyFree")
    OUTGOING_DUTY_FREE("outgoingDutyFree"),
    @XmlEnumValue("taxRefunds")
    TAX_REFUNDS("taxRefunds"),
    @XmlEnumValue("outgoingCustoms")
    OUTGOING_CUSTOMS("outgoingCustoms"),
    @XmlEnumValue("incomingCustoms")
    INCOMING_CUSTOMS("incomingCustoms"),
    @XmlEnumValue("waitForLift")
    WAIT_FOR_LIFT("waitForLift"),
    @XmlEnumValue("ingress")
    INGRESS("ingress"),
    @XmlEnumValue("egress")
    EGRESS("egress"),
    @XmlEnumValue("queue")
    QUEUE("queue"),
    @XmlEnumValue("vehicleLoading")
    VEHICLE_LOADING("vehicleLoading"),
    @XmlEnumValue("vehicleUnloading")
    VEHICLE_UNLOADING("vehicleUnloading"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    CheckProcessTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CheckProcessTypeEnumeration fromValue(String v) {
        for (CheckProcessTypeEnumeration c: CheckProcessTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
