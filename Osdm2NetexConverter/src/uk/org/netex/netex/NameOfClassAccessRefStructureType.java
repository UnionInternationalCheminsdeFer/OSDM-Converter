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
 * <p>Java-Klasse f�r NameOfClassAccessRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassAccessRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassTransferRefStructureType">
 *     &lt;enumeration value="Access"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassAccessRefStructureType")
@XmlEnum(NameOfClassTransferRefStructureType.class)
public enum NameOfClassAccessRefStructureType {

    @XmlEnumValue("Access")
    ACCESS(NameOfClassTransferRefStructureType.ACCESS);
    private final NameOfClassTransferRefStructureType value;

    NameOfClassAccessRefStructureType(NameOfClassTransferRefStructureType v) {
        value = v;
    }

    public NameOfClassTransferRefStructureType value() {
        return value;
    }

    public static NameOfClassAccessRefStructureType fromValue(NameOfClassTransferRefStructureType v) {
        for (NameOfClassAccessRefStructureType c: NameOfClassAccessRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
