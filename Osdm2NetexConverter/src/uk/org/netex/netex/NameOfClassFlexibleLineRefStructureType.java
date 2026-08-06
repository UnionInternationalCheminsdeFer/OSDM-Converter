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
 * <p>Java-Klasse f�r NameOfClassFlexibleLineRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassFlexibleLineRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassLineRefStructureType">
 *     &lt;enumeration value="FlexibleLine"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassFlexibleLineRefStructureType")
@XmlEnum(NameOfClassLineRefStructureType.class)
public enum NameOfClassFlexibleLineRefStructureType {

    @XmlEnumValue("FlexibleLine")
    FLEXIBLE_LINE(NameOfClassLineRefStructureType.FLEXIBLE_LINE);
    private final NameOfClassLineRefStructureType value;

    NameOfClassFlexibleLineRefStructureType(NameOfClassLineRefStructureType v) {
        value = v;
    }

    public NameOfClassLineRefStructureType value() {
        return value;
    }

    public static NameOfClassFlexibleLineRefStructureType fromValue(NameOfClassLineRefStructureType v) {
        for (NameOfClassFlexibleLineRefStructureType c: NameOfClassFlexibleLineRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
