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
 * <p>Java-Klasse f�r ActivationMeansEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActivationMeansEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="noneRequired"/>
 *     &lt;enumeration value="checkIn"/>
 *     &lt;enumeration value="useOfValidator"/>
 *     &lt;enumeration value="useOfMobileDevice"/>
 *     &lt;enumeration value="automaticByTime"/>
 *     &lt;enumeration value="automaticByProximity"/>
 *     &lt;enumeration value="accessCode"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActivationMeansEnumeration")
@XmlEnum
public enum ActivationMeansEnumeration {

    @XmlEnumValue("noneRequired")
    NONE_REQUIRED("noneRequired"),
    @XmlEnumValue("checkIn")
    CHECK_IN("checkIn"),
    @XmlEnumValue("useOfValidator")
    USE_OF_VALIDATOR("useOfValidator"),
    @XmlEnumValue("useOfMobileDevice")
    USE_OF_MOBILE_DEVICE("useOfMobileDevice"),
    @XmlEnumValue("automaticByTime")
    AUTOMATIC_BY_TIME("automaticByTime"),
    @XmlEnumValue("automaticByProximity")
    AUTOMATIC_BY_PROXIMITY("automaticByProximity"),

    /**
     * Activation by entering a code. +v1.2.2
     * 
     */
    @XmlEnumValue("accessCode")
    ACCESS_CODE("accessCode"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ActivationMeansEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActivationMeansEnumeration fromValue(String v) {
        for (ActivationMeansEnumeration c: ActivationMeansEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
