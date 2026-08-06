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
 * <p>Java-Klasse f�r NameOfClassValidityRuleParameterRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassValidityRuleParameterRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassValidityConditionRefStructureType">
 *     &lt;enumeration value="ValidityRuleParameter"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassValidityRuleParameterRefStructureType")
@XmlEnum(NameOfClassValidityConditionRefStructureType.class)
public enum NameOfClassValidityRuleParameterRefStructureType {

    @XmlEnumValue("ValidityRuleParameter")
    VALIDITY_RULE_PARAMETER(NameOfClassValidityConditionRefStructureType.VALIDITY_RULE_PARAMETER);
    private final NameOfClassValidityConditionRefStructureType value;

    NameOfClassValidityRuleParameterRefStructureType(NameOfClassValidityConditionRefStructureType v) {
        value = v;
    }

    public NameOfClassValidityConditionRefStructureType value() {
        return value;
    }

    public static NameOfClassValidityRuleParameterRefStructureType fromValue(NameOfClassValidityConditionRefStructureType v) {
        for (NameOfClassValidityRuleParameterRefStructureType c: NameOfClassValidityRuleParameterRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
