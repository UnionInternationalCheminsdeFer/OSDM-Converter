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
 * <p>Java-Klasse f�r NameOfClassServiceJourneyInterchangeRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassServiceJourneyInterchangeRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassInterchangeRefStructureType">
 *     &lt;enumeration value="ServiceJourneyInterchange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassServiceJourneyInterchangeRefStructureType")
@XmlEnum(NameOfClassInterchangeRefStructureType.class)
public enum NameOfClassServiceJourneyInterchangeRefStructureType {

    @XmlEnumValue("ServiceJourneyInterchange")
    SERVICE_JOURNEY_INTERCHANGE(NameOfClassInterchangeRefStructureType.SERVICE_JOURNEY_INTERCHANGE);
    private final NameOfClassInterchangeRefStructureType value;

    NameOfClassServiceJourneyInterchangeRefStructureType(NameOfClassInterchangeRefStructureType v) {
        value = v;
    }

    public NameOfClassInterchangeRefStructureType value() {
        return value;
    }

    public static NameOfClassServiceJourneyInterchangeRefStructureType fromValue(NameOfClassInterchangeRefStructureType v) {
        for (NameOfClassServiceJourneyInterchangeRefStructureType c: NameOfClassServiceJourneyInterchangeRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
