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
 * <p>Java-Klasse f�r NameOfClassResellingRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassResellingRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassUsageParameterRefStructureType">
 *     &lt;enumeration value="Exchanging"/>
 *     &lt;enumeration value="Refunding"/>
 *     &lt;enumeration value="Replacing"/>
 *     &lt;enumeration value="Reselling"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassResellingRefStructureType")
@XmlEnum(NameOfClassUsageParameterRefStructureType.class)
public enum NameOfClassResellingRefStructureType {

    @XmlEnumValue("Exchanging")
    EXCHANGING(NameOfClassUsageParameterRefStructureType.EXCHANGING),
    @XmlEnumValue("Refunding")
    REFUNDING(NameOfClassUsageParameterRefStructureType.REFUNDING),
    @XmlEnumValue("Replacing")
    REPLACING(NameOfClassUsageParameterRefStructureType.REPLACING),
    @XmlEnumValue("Reselling")
    RESELLING(NameOfClassUsageParameterRefStructureType.RESELLING);
    private final NameOfClassUsageParameterRefStructureType value;

    NameOfClassResellingRefStructureType(NameOfClassUsageParameterRefStructureType v) {
        value = v;
    }

    public NameOfClassUsageParameterRefStructureType value() {
        return value;
    }

    public static NameOfClassResellingRefStructureType fromValue(NameOfClassUsageParameterRefStructureType v) {
        for (NameOfClassResellingRefStructureType c: NameOfClassResellingRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
