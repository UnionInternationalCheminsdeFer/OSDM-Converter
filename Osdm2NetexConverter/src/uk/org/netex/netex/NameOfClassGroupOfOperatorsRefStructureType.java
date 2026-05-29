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
 * <p>Java-Klasse f�r NameOfClassGroupOfOperatorsRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassGroupOfOperatorsRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassGroupOfEntitiesRefStructureType">
 *     &lt;enumeration value="GroupOfOperators"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassGroupOfOperatorsRefStructureType")
@XmlEnum(NameOfClassGroupOfEntitiesRefStructureType.class)
public enum NameOfClassGroupOfOperatorsRefStructureType {

    @XmlEnumValue("GroupOfOperators")
    GROUP_OF_OPERATORS(NameOfClassGroupOfEntitiesRefStructureType.GROUP_OF_OPERATORS);
    private final NameOfClassGroupOfEntitiesRefStructureType value;

    NameOfClassGroupOfOperatorsRefStructureType(NameOfClassGroupOfEntitiesRefStructureType v) {
        value = v;
    }

    public NameOfClassGroupOfEntitiesRefStructureType value() {
        return value;
    }

    public static NameOfClassGroupOfOperatorsRefStructureType fromValue(NameOfClassGroupOfEntitiesRefStructureType v) {
        for (NameOfClassGroupOfOperatorsRefStructureType c: NameOfClassGroupOfOperatorsRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
