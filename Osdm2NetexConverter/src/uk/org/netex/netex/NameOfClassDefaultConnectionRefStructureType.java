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
 * <p>Java-Klasse f�r NameOfClassDefaultConnectionRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassDefaultConnectionRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassConnectionRefStructureType">
 *     &lt;enumeration value="DefaultConnection"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassDefaultConnectionRefStructureType")
@XmlEnum(NameOfClassConnectionRefStructureType.class)
public enum NameOfClassDefaultConnectionRefStructureType {

    @XmlEnumValue("DefaultConnection")
    DEFAULT_CONNECTION(NameOfClassConnectionRefStructureType.DEFAULT_CONNECTION);
    private final NameOfClassConnectionRefStructureType value;

    NameOfClassDefaultConnectionRefStructureType(NameOfClassConnectionRefStructureType v) {
        value = v;
    }

    public NameOfClassConnectionRefStructureType value() {
        return value;
    }

    public static NameOfClassDefaultConnectionRefStructureType fromValue(NameOfClassConnectionRefStructureType v) {
        for (NameOfClassDefaultConnectionRefStructureType c: NameOfClassDefaultConnectionRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
