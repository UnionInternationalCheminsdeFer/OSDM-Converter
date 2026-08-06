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
 * <p>Java-Klasse f�r PurchaseMomentEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PurchaseMomentEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="onReservation"/>
 *     &lt;enumeration value="inAdvance"/>
 *     &lt;enumeration value="inAdvanceOnly"/>
 *     &lt;enumeration value="beforeBoarding"/>
 *     &lt;enumeration value="beforeBoardingOnly"/>
 *     &lt;enumeration value="onBoarding"/>
 *     &lt;enumeration value="onBoardingOnly"/>
 *     &lt;enumeration value="afterBoarding"/>
 *     &lt;enumeration value="onCheckIn"/>
 *     &lt;enumeration value="onCheckOut"/>
 *     &lt;enumeration value="subscriptionOnly"/>
 *     &lt;enumeration value="noTicketRequired"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PurchaseMomentEnumeration")
@XmlEnum
public enum PurchaseMomentEnumeration {


    /**
     * Purchase must be made on reservation in advance of travel.
     * 
     */
    @XmlEnumValue("onReservation")
    ON_RESERVATION("onReservation"),

    /**
     * Purchase can be made in advance of travel.
     * 
     */
    @XmlEnumValue("inAdvance")
    IN_ADVANCE("inAdvance"),

    /**
     * Purchase can only be made in advance of travel (e.g. for season ticket or advance ticket).
     * 
     */
    @XmlEnumValue("inAdvanceOnly")
    IN_ADVANCE_ONLY("inAdvanceOnly"),

    /**
     * Purchase can be made before boarding transport vehicle.
     * 
     */
    @XmlEnumValue("beforeBoarding")
    BEFORE_BOARDING("beforeBoarding"),

    /**
     * Purchase must be made before boarding transport vehicle.
     * 
     */
    @XmlEnumValue("beforeBoardingOnly")
    BEFORE_BOARDING_ONLY("beforeBoardingOnly"),

    /**
     * Purchase can be made on boarding transport vehicle.
     * 
     */
    @XmlEnumValue("onBoarding")
    ON_BOARDING("onBoarding"),

    /**
     * Purchase can only be made on boarding transport vehicle.
     * 
     */
    @XmlEnumValue("onBoardingOnly")
    ON_BOARDING_ONLY("onBoardingOnly"),

    /**
     * Purchase can be made after boarding transport vehicle.
     * 
     */
    @XmlEnumValue("afterBoarding")
    AFTER_BOARDING("afterBoarding"),

    /**
     * Purchase can be made on entering transport system.
     * 
     */
    @XmlEnumValue("onCheckIn")
    ON_CHECK_IN("onCheckIn"),

    /**
     * Purchase can be made on leaving transport system.
     * 
     */
    @XmlEnumValue("onCheckOut")
    ON_CHECK_OUT("onCheckOut"),

    /**
     * Purchase can only be made on subscription.
     * 
     */
    @XmlEnumValue("subscriptionOnly")
    SUBSCRIPTION_ONLY("subscriptionOnly"),

    /**
     * No ticket is required.
     * 
     */
    @XmlEnumValue("noTicketRequired")
    NO_TICKET_REQUIRED("noTicketRequired"),

    /**
     * Other moment of Purchase
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PurchaseMomentEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurchaseMomentEnumeration fromValue(String v) {
        for (PurchaseMomentEnumeration c: PurchaseMomentEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
