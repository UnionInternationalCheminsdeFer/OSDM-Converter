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
 * <p>Java-Klasse f�r RoundTripTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RoundTripTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="single"/>
 *     &lt;enumeration value="return"/>
 *     &lt;enumeration value="returnOut"/>
 *     &lt;enumeration value="returnBack"/>
 *     &lt;enumeration value="returnOnly"/>
 *     &lt;enumeration value="multiple"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoundTripTypeEnumeration")
@XmlEnum
public enum RoundTripTypeEnumeration {


    /**
     * Single trip
     * 
     */
    @XmlEnumValue("single")
    SINGLE("single"),

    /**
     * Return trip between the same origin and destination
     * 
     */
    @XmlEnumValue("return")
    RETURN("return"),

    /**
     * Outward part of a return trip.
     * 
     */
    @XmlEnumValue("returnOut")
    RETURN_OUT("returnOut"),

    /**
     * Return part of a return trip.
     * 
     */
    @XmlEnumValue("returnBack")
    RETURN_BACK("returnBack"),
    @XmlEnumValue("returnOnly")
    RETURN_ONLY("returnOnly"),

    /**
     * Multtrip carnet.
     * 
     */
    @XmlEnumValue("multiple")
    MULTIPLE("multiple");
    private final String value;

    RoundTripTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoundTripTypeEnumeration fromValue(String v) {
        for (RoundTripTypeEnumeration c: RoundTripTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
