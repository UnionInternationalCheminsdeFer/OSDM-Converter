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
 * <p>Java-Klasse f�r NameOfClassTypeOfOperationRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassTypeOfOperationRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassTypeOfValueRefStructureType">
 *     &lt;enumeration value="TypeOfEntity"/>
 *     &lt;enumeration value="TypeOfOperation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassTypeOfOperationRefStructureType")
@XmlEnum(NameOfClassTypeOfValueRefStructureType.class)
public enum NameOfClassTypeOfOperationRefStructureType {

    @XmlEnumValue("TypeOfEntity")
    TYPE_OF_ENTITY(NameOfClassTypeOfValueRefStructureType.TYPE_OF_ENTITY),
    @XmlEnumValue("TypeOfOperation")
    TYPE_OF_OPERATION(NameOfClassTypeOfValueRefStructureType.TYPE_OF_OPERATION);
    private final NameOfClassTypeOfValueRefStructureType value;

    NameOfClassTypeOfOperationRefStructureType(NameOfClassTypeOfValueRefStructureType v) {
        value = v;
    }

    public NameOfClassTypeOfValueRefStructureType value() {
        return value;
    }

    public static NameOfClassTypeOfOperationRefStructureType fromValue(NameOfClassTypeOfValueRefStructureType v) {
        for (NameOfClassTypeOfOperationRefStructureType c: NameOfClassTypeOfOperationRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
