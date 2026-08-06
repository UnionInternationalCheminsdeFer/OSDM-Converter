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
 * <p>Java-Klasse f�r NameOfClassLinkInJourneyPatternRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassLinkInJourneyPatternRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="LinkInJourneyPattern"/>
 *     &lt;enumeration value="TimingLinkInJourneyPattern"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassLinkInJourneyPatternRefStructureType")
@XmlEnum
public enum NameOfClassLinkInJourneyPatternRefStructureType {

    @XmlEnumValue("LinkInJourneyPattern")
    LINK_IN_JOURNEY_PATTERN("LinkInJourneyPattern"),
    @XmlEnumValue("TimingLinkInJourneyPattern")
    TIMING_LINK_IN_JOURNEY_PATTERN("TimingLinkInJourneyPattern");
    private final String value;

    NameOfClassLinkInJourneyPatternRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassLinkInJourneyPatternRefStructureType fromValue(String v) {
        for (NameOfClassLinkInJourneyPatternRefStructureType c: NameOfClassLinkInJourneyPatternRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
