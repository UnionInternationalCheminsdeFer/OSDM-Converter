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
 * <p>Java-Klasse f�r NameOfClassValidityConditionRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassValidityConditionRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="AvailabilityCondition"/>
 *     &lt;enumeration value="SimpleAvailabilityCondition"/>
 *     &lt;enumeration value="SimpleValidityCondition"/>
 *     &lt;enumeration value="ValidBetween"/>
 *     &lt;enumeration value="ValidDuring"/>
 *     &lt;enumeration value="ValidityCondition"/>
 *     &lt;enumeration value="ValidityPeriod"/>
 *     &lt;enumeration value="ValidityRuleParameter"/>
 *     &lt;enumeration value="ValidityTrigger"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassValidityConditionRefStructureType")
@XmlEnum
public enum NameOfClassValidityConditionRefStructureType {

    @XmlEnumValue("AvailabilityCondition")
    AVAILABILITY_CONDITION("AvailabilityCondition"),
    @XmlEnumValue("SimpleAvailabilityCondition")
    SIMPLE_AVAILABILITY_CONDITION("SimpleAvailabilityCondition"),
    @XmlEnumValue("SimpleValidityCondition")
    SIMPLE_VALIDITY_CONDITION("SimpleValidityCondition"),
    @XmlEnumValue("ValidBetween")
    VALID_BETWEEN("ValidBetween"),
    @XmlEnumValue("ValidDuring")
    VALID_DURING("ValidDuring"),
    @XmlEnumValue("ValidityCondition")
    VALIDITY_CONDITION("ValidityCondition"),
    @XmlEnumValue("ValidityPeriod")
    VALIDITY_PERIOD("ValidityPeriod"),
    @XmlEnumValue("ValidityRuleParameter")
    VALIDITY_RULE_PARAMETER("ValidityRuleParameter"),
    @XmlEnumValue("ValidityTrigger")
    VALIDITY_TRIGGER("ValidityTrigger");
    private final String value;

    NameOfClassValidityConditionRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassValidityConditionRefStructureType fromValue(String v) {
        for (NameOfClassValidityConditionRefStructureType c: NameOfClassValidityConditionRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
