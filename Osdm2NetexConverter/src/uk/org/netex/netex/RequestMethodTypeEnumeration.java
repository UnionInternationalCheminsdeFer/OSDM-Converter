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
 * <p>Java-Klasse f�r RequestMethodTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestMethodTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="noneRequired"/>
 *     &lt;enumeration value="handSignal"/>
 *     &lt;enumeration value="turnOnLight"/>
 *     &lt;enumeration value="stopButton"/>
 *     &lt;enumeration value="phoneCall"/>
 *     &lt;enumeration value="mobileApp"/>
 *     &lt;enumeration value="sms"/>
 *     &lt;enumeration value="speakToDriverOnboard"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequestMethodTypeEnumeration")
@XmlEnum
public enum RequestMethodTypeEnumeration {


    /**
     * No action required to request stop
     * 
     */
    @XmlEnumValue("noneRequired")
    NONE_REQUIRED("noneRequired"),

    /**
     * Make hand signal to request stop
     * 
     */
    @XmlEnumValue("handSignal")
    HAND_SIGNAL("handSignal"),

    /**
     * Call number to request stop
     * 
     */
    @XmlEnumValue("turnOnLight")
    TURN_ON_LIGHT("turnOnLight"),

    /**
     * Press button at stop to request stop
     * 
     */
    @XmlEnumValue("stopButton")
    STOP_BUTTON("stopButton"),

    /**
     * Call number to request stop
     * 
     */
    @XmlEnumValue("phoneCall")
    PHONE_CALL("phoneCall"),

    /**
     * Use mobile Application to request stop
     * 
     */
    @XmlEnumValue("mobileApp")
    MOBILE_APP("mobileApp"),

    /**
     * Use Sms to request stop
     * 
     */
    @XmlEnumValue("sms")
    SMS("sms"),

    /**
     * Tell the driver to request stop. Mainly used for on demand traffic, where the route depends on where passengers want to leave the vehicle. +v1.3.1
     * 
     */
    @XmlEnumValue("speakToDriverOnboard")
    SPEAK_TO_DRIVER_ONBOARD("speakToDriverOnboard"),

    /**
     * Use other method to request stop
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    RequestMethodTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestMethodTypeEnumeration fromValue(String v) {
        for (RequestMethodTypeEnumeration c: RequestMethodTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
