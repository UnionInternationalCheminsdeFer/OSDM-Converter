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
 * <p>Java-Klasse f�r NameOfClassCommonSectionRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassCommonSectionRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassSectionRefStructureType">
 *     &lt;enumeration value="CommonSection"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassCommonSectionRefStructureType")
@XmlEnum(NameOfClassSectionRefStructureType.class)
public enum NameOfClassCommonSectionRefStructureType {

    @XmlEnumValue("CommonSection")
    COMMON_SECTION(NameOfClassSectionRefStructureType.COMMON_SECTION);
    private final NameOfClassSectionRefStructureType value;

    NameOfClassCommonSectionRefStructureType(NameOfClassSectionRefStructureType v) {
        value = v;
    }

    public NameOfClassSectionRefStructureType value() {
        return value;
    }

    public static NameOfClassCommonSectionRefStructureType fromValue(NameOfClassSectionRefStructureType v) {
        for (NameOfClassCommonSectionRefStructureType c: NameOfClassCommonSectionRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
