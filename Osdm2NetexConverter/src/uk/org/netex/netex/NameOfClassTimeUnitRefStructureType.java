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
 * <p>Java-Klasse f�r NameOfClassTimeUnitRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassTimeUnitRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassFareUnitRefStructureType">
 *     &lt;enumeration value="TimeUnit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassTimeUnitRefStructureType")
@XmlEnum(NameOfClassFareUnitRefStructureType.class)
public enum NameOfClassTimeUnitRefStructureType {

    @XmlEnumValue("TimeUnit")
    TIME_UNIT(NameOfClassFareUnitRefStructureType.TIME_UNIT);
    private final NameOfClassFareUnitRefStructureType value;

    NameOfClassTimeUnitRefStructureType(NameOfClassFareUnitRefStructureType v) {
        value = v;
    }

    public NameOfClassFareUnitRefStructureType value() {
        return value;
    }

    public static NameOfClassTimeUnitRefStructureType fromValue(NameOfClassFareUnitRefStructureType v) {
        for (NameOfClassTimeUnitRefStructureType c: NameOfClassTimeUnitRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
