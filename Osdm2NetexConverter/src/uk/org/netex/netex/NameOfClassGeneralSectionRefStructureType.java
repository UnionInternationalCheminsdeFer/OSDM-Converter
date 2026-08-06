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
 * <p>Java-Klasse f�r NameOfClassGeneralSectionRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassGeneralSectionRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassSectionRefStructureType">
 *     &lt;enumeration value="FareSection"/>
 *     &lt;enumeration value="GeneralSection"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassGeneralSectionRefStructureType")
@XmlEnum(NameOfClassSectionRefStructureType.class)
public enum NameOfClassGeneralSectionRefStructureType {

    @XmlEnumValue("FareSection")
    FARE_SECTION(NameOfClassSectionRefStructureType.FARE_SECTION),
    @XmlEnumValue("GeneralSection")
    GENERAL_SECTION(NameOfClassSectionRefStructureType.GENERAL_SECTION);
    private final NameOfClassSectionRefStructureType value;

    NameOfClassGeneralSectionRefStructureType(NameOfClassSectionRefStructureType v) {
        value = v;
    }

    public NameOfClassSectionRefStructureType value() {
        return value;
    }

    public static NameOfClassGeneralSectionRefStructureType fromValue(NameOfClassSectionRefStructureType v) {
        for (NameOfClassGeneralSectionRefStructureType c: NameOfClassGeneralSectionRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
