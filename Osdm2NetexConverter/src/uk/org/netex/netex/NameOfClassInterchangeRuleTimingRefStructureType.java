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
 * <p>Java-Klasse f�r NameOfClassInterchangeRuleTimingRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassInterchangeRuleTimingRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassJourneyTimingRefStructureType">
 *     &lt;enumeration value="InterchangeRuleTiming"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassInterchangeRuleTimingRefStructureType")
@XmlEnum(NameOfClassJourneyTimingRefStructureType.class)
public enum NameOfClassInterchangeRuleTimingRefStructureType {

    @XmlEnumValue("InterchangeRuleTiming")
    INTERCHANGE_RULE_TIMING(NameOfClassJourneyTimingRefStructureType.INTERCHANGE_RULE_TIMING);
    private final NameOfClassJourneyTimingRefStructureType value;

    NameOfClassInterchangeRuleTimingRefStructureType(NameOfClassJourneyTimingRefStructureType v) {
        value = v;
    }

    public NameOfClassJourneyTimingRefStructureType value() {
        return value;
    }

    public static NameOfClassInterchangeRuleTimingRefStructureType fromValue(NameOfClassJourneyTimingRefStructureType v) {
        for (NameOfClassInterchangeRuleTimingRefStructureType c: NameOfClassInterchangeRuleTimingRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
