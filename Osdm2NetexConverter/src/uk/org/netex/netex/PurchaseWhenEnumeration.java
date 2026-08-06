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
 * <p>Java-Klasse f�r PurchaseWhenEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PurchaseWhenEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="advanceOnly"/>
 *     &lt;enumeration value="untilPreviousDay"/>
 *     &lt;enumeration value="dayOfTravelOnly"/>
 *     &lt;enumeration value="advanceAndDayOfTravel"/>
 *     &lt;enumeration value="timeOfTravelOnly"/>
 *     &lt;enumeration value="subscriptionChargeMoment"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PurchaseWhenEnumeration")
@XmlEnum
public enum PurchaseWhenEnumeration {

    @XmlEnumValue("advanceOnly")
    ADVANCE_ONLY("advanceOnly"),
    @XmlEnumValue("untilPreviousDay")
    UNTIL_PREVIOUS_DAY("untilPreviousDay"),
    @XmlEnumValue("dayOfTravelOnly")
    DAY_OF_TRAVEL_ONLY("dayOfTravelOnly"),
    @XmlEnumValue("advanceAndDayOfTravel")
    ADVANCE_AND_DAY_OF_TRAVEL("advanceAndDayOfTravel"),
    @XmlEnumValue("timeOfTravelOnly")
    TIME_OF_TRAVEL_ONLY("timeOfTravelOnly"),
    @XmlEnumValue("subscriptionChargeMoment")
    SUBSCRIPTION_CHARGE_MOMENT("subscriptionChargeMoment"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PurchaseWhenEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurchaseWhenEnumeration fromValue(String v) {
        for (PurchaseWhenEnumeration c: PurchaseWhenEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
