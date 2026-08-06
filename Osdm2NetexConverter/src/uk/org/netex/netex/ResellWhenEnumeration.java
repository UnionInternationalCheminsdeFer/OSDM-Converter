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
 * <p>Java-Klasse f�r ResellWhenEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ResellWhenEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="never"/>
 *     &lt;enumeration value="withinPurchaseGracePeriod"/>
 *     &lt;enumeration value="beforeStartOfValidity"/>
 *     &lt;enumeration value="afterStartOfValidity"/>
 *     &lt;enumeration value="afterEndOfValidity"/>
 *     &lt;enumeration value="beforeFirstUse"/>
 *     &lt;enumeration value="afterFirstUse"/>
 *     &lt;enumeration value="beforeValidation"/>
 *     &lt;enumeration value="afterValidation"/>
 *     &lt;enumeration value="withinSpecifiedWindow"/>
 *     &lt;enumeration value="anyTime"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResellWhenEnumeration")
@XmlEnum
public enum ResellWhenEnumeration {

    @XmlEnumValue("never")
    NEVER("never"),
    @XmlEnumValue("withinPurchaseGracePeriod")
    WITHIN_PURCHASE_GRACE_PERIOD("withinPurchaseGracePeriod"),
    @XmlEnumValue("beforeStartOfValidity")
    BEFORE_START_OF_VALIDITY("beforeStartOfValidity"),
    @XmlEnumValue("afterStartOfValidity")
    AFTER_START_OF_VALIDITY("afterStartOfValidity"),
    @XmlEnumValue("afterEndOfValidity")
    AFTER_END_OF_VALIDITY("afterEndOfValidity"),
    @XmlEnumValue("beforeFirstUse")
    BEFORE_FIRST_USE("beforeFirstUse"),
    @XmlEnumValue("afterFirstUse")
    AFTER_FIRST_USE("afterFirstUse"),
    @XmlEnumValue("beforeValidation")
    BEFORE_VALIDATION("beforeValidation"),
    @XmlEnumValue("afterValidation")
    AFTER_VALIDATION("afterValidation"),
    @XmlEnumValue("withinSpecifiedWindow")
    WITHIN_SPECIFIED_WINDOW("withinSpecifiedWindow"),
    @XmlEnumValue("anyTime")
    ANY_TIME("anyTime"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ResellWhenEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResellWhenEnumeration fromValue(String v) {
        for (ResellWhenEnumeration c: ResellWhenEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
