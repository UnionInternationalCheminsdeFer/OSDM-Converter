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
 * <p>Java-Klasse f�r NameOfClassDeckNavigationPathRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassDeckNavigationPathRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassGenericNavigationPathRefStructureType">
 *     &lt;enumeration value="DeckNavigationPath"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassDeckNavigationPathRefStructureType")
@XmlEnum(NameOfClassGenericNavigationPathRefStructureType.class)
public enum NameOfClassDeckNavigationPathRefStructureType {

    @XmlEnumValue("DeckNavigationPath")
    DECK_NAVIGATION_PATH(NameOfClassGenericNavigationPathRefStructureType.DECK_NAVIGATION_PATH);
    private final NameOfClassGenericNavigationPathRefStructureType value;

    NameOfClassDeckNavigationPathRefStructureType(NameOfClassGenericNavigationPathRefStructureType v) {
        value = v;
    }

    public NameOfClassGenericNavigationPathRefStructureType value() {
        return value;
    }

    public static NameOfClassDeckNavigationPathRefStructureType fromValue(NameOfClassGenericNavigationPathRefStructureType v) {
        for (NameOfClassDeckNavigationPathRefStructureType c: NameOfClassDeckNavigationPathRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
