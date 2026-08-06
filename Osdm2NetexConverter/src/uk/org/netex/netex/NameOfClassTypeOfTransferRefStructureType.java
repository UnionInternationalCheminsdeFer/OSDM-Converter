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
 * <p>Java-Klasse f�r NameOfClassTypeOfTransferRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassTypeOfTransferRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassTypeOfValueRefStructureType">
 *     &lt;enumeration value="TypeOfEntity"/>
 *     &lt;enumeration value="TypeOfTransfer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassTypeOfTransferRefStructureType")
@XmlEnum(NameOfClassTypeOfValueRefStructureType.class)
public enum NameOfClassTypeOfTransferRefStructureType {

    @XmlEnumValue("TypeOfEntity")
    TYPE_OF_ENTITY(NameOfClassTypeOfValueRefStructureType.TYPE_OF_ENTITY),
    @XmlEnumValue("TypeOfTransfer")
    TYPE_OF_TRANSFER(NameOfClassTypeOfValueRefStructureType.TYPE_OF_TRANSFER);
    private final NameOfClassTypeOfValueRefStructureType value;

    NameOfClassTypeOfTransferRefStructureType(NameOfClassTypeOfValueRefStructureType v) {
        value = v;
    }

    public NameOfClassTypeOfValueRefStructureType value() {
        return value;
    }

    public static NameOfClassTypeOfTransferRefStructureType fromValue(NameOfClassTypeOfValueRefStructureType v) {
        for (NameOfClassTypeOfTransferRefStructureType c: NameOfClassTypeOfTransferRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
