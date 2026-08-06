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
 * <p>Java-Klasse f�r FulfilmentMethodTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FulfilmentMethodTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="ticketOffice"/>
 *     &lt;enumeration value="ticketMachine"/>
 *     &lt;enumeration value="conductor"/>
 *     &lt;enumeration value="agent"/>
 *     &lt;enumeration value="post"/>
 *     &lt;enumeration value="courier"/>
 *     &lt;enumeration value="selfprint"/>
 *     &lt;enumeration value="sms"/>
 *     &lt;enumeration value="email"/>
 *     &lt;enumeration value="topUpDevice"/>
 *     &lt;enumeration value="validator"/>
 *     &lt;enumeration value="mobileApp"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FulfilmentMethodTypeEnumeration")
@XmlEnum
public enum FulfilmentMethodTypeEnumeration {

    @XmlEnumValue("ticketOffice")
    TICKET_OFFICE("ticketOffice"),
    @XmlEnumValue("ticketMachine")
    TICKET_MACHINE("ticketMachine"),
    @XmlEnumValue("conductor")
    CONDUCTOR("conductor"),
    @XmlEnumValue("agent")
    AGENT("agent"),
    @XmlEnumValue("post")
    POST("post"),
    @XmlEnumValue("courier")
    COURIER("courier"),
    @XmlEnumValue("selfprint")
    SELFPRINT("selfprint"),
    @XmlEnumValue("sms")
    SMS("sms"),
    @XmlEnumValue("email")
    EMAIL("email"),
    @XmlEnumValue("topUpDevice")
    TOP_UP_DEVICE("topUpDevice"),
    @XmlEnumValue("validator")
    VALIDATOR("validator"),
    @XmlEnumValue("mobileApp")
    MOBILE_APP("mobileApp"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    FulfilmentMethodTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FulfilmentMethodTypeEnumeration fromValue(String v) {
        for (FulfilmentMethodTypeEnumeration c: FulfilmentMethodTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
