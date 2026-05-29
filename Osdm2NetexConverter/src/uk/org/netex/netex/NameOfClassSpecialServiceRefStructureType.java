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
 * <p>Java-Klasse f�r NameOfClassSpecialServiceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassSpecialServiceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassJourneyRefStructureType">
 *     &lt;enumeration value="DatedSpecialService"/>
 *     &lt;enumeration value="SpecialService"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassSpecialServiceRefStructureType")
@XmlEnum(NameOfClassJourneyRefStructureType.class)
public enum NameOfClassSpecialServiceRefStructureType {

    @XmlEnumValue("DatedSpecialService")
    DATED_SPECIAL_SERVICE(NameOfClassJourneyRefStructureType.DATED_SPECIAL_SERVICE),
    @XmlEnumValue("SpecialService")
    SPECIAL_SERVICE(NameOfClassJourneyRefStructureType.SPECIAL_SERVICE);
    private final NameOfClassJourneyRefStructureType value;

    NameOfClassSpecialServiceRefStructureType(NameOfClassJourneyRefStructureType v) {
        value = v;
    }

    public NameOfClassJourneyRefStructureType value() {
        return value;
    }

    public static NameOfClassSpecialServiceRefStructureType fromValue(NameOfClassJourneyRefStructureType v) {
        for (NameOfClassSpecialServiceRefStructureType c: NameOfClassSpecialServiceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
