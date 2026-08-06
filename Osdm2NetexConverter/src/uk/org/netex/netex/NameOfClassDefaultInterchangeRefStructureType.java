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
 * <p>Java-Klasse f�r NameOfClassDefaultInterchangeRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassDefaultInterchangeRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassInterchangeRefStructureType">
 *     &lt;enumeration value="DefaultInterchange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassDefaultInterchangeRefStructureType")
@XmlEnum(NameOfClassInterchangeRefStructureType.class)
public enum NameOfClassDefaultInterchangeRefStructureType {

    @XmlEnumValue("DefaultInterchange")
    DEFAULT_INTERCHANGE(NameOfClassInterchangeRefStructureType.DEFAULT_INTERCHANGE);
    private final NameOfClassInterchangeRefStructureType value;

    NameOfClassDefaultInterchangeRefStructureType(NameOfClassInterchangeRefStructureType v) {
        value = v;
    }

    public NameOfClassInterchangeRefStructureType value() {
        return value;
    }

    public static NameOfClassDefaultInterchangeRefStructureType fromValue(NameOfClassInterchangeRefStructureType v) {
        for (NameOfClassDefaultInterchangeRefStructureType c: NameOfClassDefaultInterchangeRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
