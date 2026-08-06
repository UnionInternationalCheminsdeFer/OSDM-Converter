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
 * <p>Java-Klasse f�r MediaTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MediaTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="paperTicket"/>
 *     &lt;enumeration value="paperTicketWithCoupons"/>
 *     &lt;enumeration value="coupon"/>
 *     &lt;enumeration value="selfPrintPaperTicket"/>
 *     &lt;enumeration value="smartCard"/>
 *     &lt;enumeration value="mobileApp"/>
 *     &lt;enumeration value="licencePlate"/>
 *     &lt;enumeration value="card"/>
 *     &lt;enumeration value="mms"/>
 *     &lt;enumeration value="sms"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MediaTypeEnumeration")
@XmlEnum
public enum MediaTypeEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("paperTicket")
    PAPER_TICKET("paperTicket"),
    @XmlEnumValue("paperTicketWithCoupons")
    PAPER_TICKET_WITH_COUPONS("paperTicketWithCoupons"),
    @XmlEnumValue("coupon")
    COUPON("coupon"),
    @XmlEnumValue("selfPrintPaperTicket")
    SELF_PRINT_PAPER_TICKET("selfPrintPaperTicket"),
    @XmlEnumValue("smartCard")
    SMART_CARD("smartCard"),
    @XmlEnumValue("mobileApp")
    MOBILE_APP("mobileApp"),

    /**
     * Travel document is licence plate. +v1.2.2
     * 
     */
    @XmlEnumValue("licencePlate")
    LICENCE_PLATE("licencePlate"),
    @XmlEnumValue("card")
    CARD("card"),
    @XmlEnumValue("mms")
    MMS("mms"),
    @XmlEnumValue("sms")
    SMS("sms"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    MediaTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MediaTypeEnumeration fromValue(String v) {
        for (MediaTypeEnumeration c: MediaTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
