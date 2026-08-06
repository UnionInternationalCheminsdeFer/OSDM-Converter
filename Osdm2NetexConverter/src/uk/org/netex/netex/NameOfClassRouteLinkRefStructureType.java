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
 * <p>Java-Klasse f�r NameOfClassRouteLinkRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassRouteLinkRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassLinkRefStructureType">
 *     &lt;enumeration value="RouteLink"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassRouteLinkRefStructureType")
@XmlEnum(NameOfClassLinkRefStructureType.class)
public enum NameOfClassRouteLinkRefStructureType {

    @XmlEnumValue("RouteLink")
    ROUTE_LINK(NameOfClassLinkRefStructureType.ROUTE_LINK);
    private final NameOfClassLinkRefStructureType value;

    NameOfClassRouteLinkRefStructureType(NameOfClassLinkRefStructureType v) {
        value = v;
    }

    public NameOfClassLinkRefStructureType value() {
        return value;
    }

    public static NameOfClassRouteLinkRefStructureType fromValue(NameOfClassLinkRefStructureType v) {
        for (NameOfClassRouteLinkRefStructureType c: NameOfClassRouteLinkRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
