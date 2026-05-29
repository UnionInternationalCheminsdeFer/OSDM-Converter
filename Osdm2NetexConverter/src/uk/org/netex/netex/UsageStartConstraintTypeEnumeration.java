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
 * <p>Java-Klasse f�r UsageStartConstraintTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="UsageStartConstraintTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="variable"/>
 *     &lt;enumeration value="fixed"/>
 *     &lt;enumeration value="fixedWindow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UsageStartConstraintTypeEnumeration")
@XmlEnum
public enum UsageStartConstraintTypeEnumeration {


    /**
     * Validity start date can be chosen by user.
     * 
     */
    @XmlEnumValue("variable")
    VARIABLE("variable"),

    /**
     * Validity start date is constrained. For a pass to certain days of week, month or year. For a trip to a specific train.
     * 
     */
    @XmlEnumValue("fixed")
    FIXED("fixed"),

    /**
     * Validity start date for a trip is constrained relative to start of booked service, eg may catch previous train as well.
     * 
     */
    @XmlEnumValue("fixedWindow")
    FIXED_WINDOW("fixedWindow");
    private final String value;

    UsageStartConstraintTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UsageStartConstraintTypeEnumeration fromValue(String v) {
        for (UsageStartConstraintTypeEnumeration c: UsageStartConstraintTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
