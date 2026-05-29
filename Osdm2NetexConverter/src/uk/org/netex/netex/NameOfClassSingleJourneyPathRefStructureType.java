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
 * <p>Java-Klasse f�r NameOfClassSingleJourneyPathRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassSingleJourneyPathRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassLinkSequenceRefStructureType">
 *     &lt;enumeration value="SingleJourneyPath"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassSingleJourneyPathRefStructureType")
@XmlEnum(NameOfClassLinkSequenceRefStructureType.class)
public enum NameOfClassSingleJourneyPathRefStructureType {

    @XmlEnumValue("SingleJourneyPath")
    SINGLE_JOURNEY_PATH(NameOfClassLinkSequenceRefStructureType.SINGLE_JOURNEY_PATH);
    private final NameOfClassLinkSequenceRefStructureType value;

    NameOfClassSingleJourneyPathRefStructureType(NameOfClassLinkSequenceRefStructureType v) {
        value = v;
    }

    public NameOfClassLinkSequenceRefStructureType value() {
        return value;
    }

    public static NameOfClassSingleJourneyPathRefStructureType fromValue(NameOfClassLinkSequenceRefStructureType v) {
        for (NameOfClassSingleJourneyPathRefStructureType c: NameOfClassSingleJourneyPathRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
