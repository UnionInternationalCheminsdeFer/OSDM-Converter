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
 * <p>Java-Klasse f�r SubscriptionTermTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SubscriptionTermTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="fixed"/>
 *     &lt;enumeration value="variable"/>
 *     &lt;enumeration value="openEnded"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubscriptionTermTypeEnumeration")
@XmlEnum
public enum SubscriptionTermTypeEnumeration {


    /**
     * Subscription must be for a fixed term.
     * 
     */
    @XmlEnumValue("fixed")
    FIXED("fixed"),

    /**
     * Subscription can be for an arbitray term,
     * 
     */
    @XmlEnumValue("variable")
    VARIABLE("variable"),

    /**
     * Subscription term is open ended.
     * 
     */
    @XmlEnumValue("openEnded")
    OPEN_ENDED("openEnded");
    private final String value;

    SubscriptionTermTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubscriptionTermTypeEnumeration fromValue(String v) {
        for (SubscriptionTermTypeEnumeration c: SubscriptionTermTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
