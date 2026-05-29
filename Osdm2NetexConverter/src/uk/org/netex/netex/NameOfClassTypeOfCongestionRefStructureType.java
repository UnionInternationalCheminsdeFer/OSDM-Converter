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
 * <p>Java-Klasse f�r NameOfClassTypeOfCongestionRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassTypeOfCongestionRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassTypeOfValueRefStructureType">
 *     &lt;enumeration value="TypeOfCongestion"/>
 *     &lt;enumeration value="TypeOfEntity"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassTypeOfCongestionRefStructureType")
@XmlEnum(NameOfClassTypeOfValueRefStructureType.class)
public enum NameOfClassTypeOfCongestionRefStructureType {

    @XmlEnumValue("TypeOfCongestion")
    TYPE_OF_CONGESTION(NameOfClassTypeOfValueRefStructureType.TYPE_OF_CONGESTION),
    @XmlEnumValue("TypeOfEntity")
    TYPE_OF_ENTITY(NameOfClassTypeOfValueRefStructureType.TYPE_OF_ENTITY);
    private final NameOfClassTypeOfValueRefStructureType value;

    NameOfClassTypeOfCongestionRefStructureType(NameOfClassTypeOfValueRefStructureType v) {
        value = v;
    }

    public NameOfClassTypeOfValueRefStructureType value() {
        return value;
    }

    public static NameOfClassTypeOfCongestionRefStructureType fromValue(NameOfClassTypeOfValueRefStructureType v) {
        for (NameOfClassTypeOfCongestionRefStructureType c: NameOfClassTypeOfCongestionRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
