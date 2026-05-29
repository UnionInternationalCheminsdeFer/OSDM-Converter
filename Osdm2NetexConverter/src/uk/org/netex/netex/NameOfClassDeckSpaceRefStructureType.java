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
 * <p>Java-Klasse f�r NameOfClassDeckSpaceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassDeckSpaceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassDeckComponentRefStructureType">
 *     &lt;enumeration value="OtherDeckSpace"/>
 *     &lt;enumeration value="PassengerSpace"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassDeckSpaceRefStructureType")
@XmlEnum(NameOfClassDeckComponentRefStructureType.class)
public enum NameOfClassDeckSpaceRefStructureType {

    @XmlEnumValue("OtherDeckSpace")
    OTHER_DECK_SPACE(NameOfClassDeckComponentRefStructureType.OTHER_DECK_SPACE),
    @XmlEnumValue("PassengerSpace")
    PASSENGER_SPACE(NameOfClassDeckComponentRefStructureType.PASSENGER_SPACE);
    private final NameOfClassDeckComponentRefStructureType value;

    NameOfClassDeckSpaceRefStructureType(NameOfClassDeckComponentRefStructureType v) {
        value = v;
    }

    public NameOfClassDeckComponentRefStructureType value() {
        return value;
    }

    public static NameOfClassDeckSpaceRefStructureType fromValue(NameOfClassDeckComponentRefStructureType v) {
        for (NameOfClassDeckSpaceRefStructureType c: NameOfClassDeckSpaceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
