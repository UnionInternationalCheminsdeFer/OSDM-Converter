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
 * <p>Java-Klasse f�r SuspensionPolicyEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SuspensionPolicyEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="forCertifiedIllness"/>
 *     &lt;enumeration value="forParentalLeave"/>
 *     &lt;enumeration value="forHoliday"/>
 *     &lt;enumeration value="forAnyReason"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SuspensionPolicyEnumeration")
@XmlEnum
public enum SuspensionPolicyEnumeration {


    /**
     * Suspension not allowed.
     * 
     */
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * Suspension allowed for illness.
     * 
     */
    @XmlEnumValue("forCertifiedIllness")
    FOR_CERTIFIED_ILLNESS("forCertifiedIllness"),

    /**
     * Suspension allowed for parental leave.
     * 
     */
    @XmlEnumValue("forParentalLeave")
    FOR_PARENTAL_LEAVE("forParentalLeave"),

    /**
     * Suspension allowed for holiday.
     * 
     */
    @XmlEnumValue("forHoliday")
    FOR_HOLIDAY("forHoliday"),

    /**
     * Suspension allowed for any reason.
     * 
     */
    @XmlEnumValue("forAnyReason")
    FOR_ANY_REASON("forAnyReason");
    private final String value;

    SuspensionPolicyEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SuspensionPolicyEnumeration fromValue(String v) {
        for (SuspensionPolicyEnumeration c: SuspensionPolicyEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
