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
 * <p>Java-Klasse f�r NameOfClassInterchangeRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassInterchangeRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="DefaultInterchange"/>
 *     &lt;enumeration value="InterchangeRule"/>
 *     &lt;enumeration value="ServiceJourneyInterchange"/>
 *     &lt;enumeration value="ServiceJourneyPatternInterchange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassInterchangeRefStructureType")
@XmlEnum
public enum NameOfClassInterchangeRefStructureType {

    @XmlEnumValue("DefaultInterchange")
    DEFAULT_INTERCHANGE("DefaultInterchange"),
    @XmlEnumValue("InterchangeRule")
    INTERCHANGE_RULE("InterchangeRule"),
    @XmlEnumValue("ServiceJourneyInterchange")
    SERVICE_JOURNEY_INTERCHANGE("ServiceJourneyInterchange"),
    @XmlEnumValue("ServiceJourneyPatternInterchange")
    SERVICE_JOURNEY_PATTERN_INTERCHANGE("ServiceJourneyPatternInterchange");
    private final String value;

    NameOfClassInterchangeRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassInterchangeRefStructureType fromValue(String v) {
        for (NameOfClassInterchangeRefStructureType c: NameOfClassInterchangeRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
