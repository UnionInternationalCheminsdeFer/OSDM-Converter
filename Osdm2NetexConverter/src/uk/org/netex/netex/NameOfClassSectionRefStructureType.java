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
 * <p>Java-Klasse f�r NameOfClassSectionRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassSectionRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassLinkSequenceRefStructureType">
 *     &lt;enumeration value="CommonSection"/>
 *     &lt;enumeration value="FareSection"/>
 *     &lt;enumeration value="GeneralSection"/>
 *     &lt;enumeration value="LineSection"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassSectionRefStructureType")
@XmlEnum(NameOfClassLinkSequenceRefStructureType.class)
public enum NameOfClassSectionRefStructureType {

    @XmlEnumValue("CommonSection")
    COMMON_SECTION(NameOfClassLinkSequenceRefStructureType.COMMON_SECTION),
    @XmlEnumValue("FareSection")
    FARE_SECTION(NameOfClassLinkSequenceRefStructureType.FARE_SECTION),
    @XmlEnumValue("GeneralSection")
    GENERAL_SECTION(NameOfClassLinkSequenceRefStructureType.GENERAL_SECTION),
    @XmlEnumValue("LineSection")
    LINE_SECTION(NameOfClassLinkSequenceRefStructureType.LINE_SECTION);
    private final NameOfClassLinkSequenceRefStructureType value;

    NameOfClassSectionRefStructureType(NameOfClassLinkSequenceRefStructureType v) {
        value = v;
    }

    public NameOfClassLinkSequenceRefStructureType value() {
        return value;
    }

    public static NameOfClassSectionRefStructureType fromValue(NameOfClassLinkSequenceRefStructureType v) {
        for (NameOfClassSectionRefStructureType c: NameOfClassSectionRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
