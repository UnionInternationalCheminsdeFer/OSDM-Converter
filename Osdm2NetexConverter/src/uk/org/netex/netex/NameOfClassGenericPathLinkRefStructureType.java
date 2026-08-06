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
 * <p>Java-Klasse f�r NameOfClassGenericPathLinkRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassGenericPathLinkRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassLinkRefStructureType">
 *     &lt;enumeration value="DeckPathLink"/>
 *     &lt;enumeration value="OffSitePathLink"/>
 *     &lt;enumeration value="PathLink"/>
 *     &lt;enumeration value="SitePathLink"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassGenericPathLinkRefStructureType")
@XmlEnum(NameOfClassLinkRefStructureType.class)
public enum NameOfClassGenericPathLinkRefStructureType {

    @XmlEnumValue("DeckPathLink")
    DECK_PATH_LINK(NameOfClassLinkRefStructureType.DECK_PATH_LINK),
    @XmlEnumValue("OffSitePathLink")
    OFF_SITE_PATH_LINK(NameOfClassLinkRefStructureType.OFF_SITE_PATH_LINK),
    @XmlEnumValue("PathLink")
    PATH_LINK(NameOfClassLinkRefStructureType.PATH_LINK),
    @XmlEnumValue("SitePathLink")
    SITE_PATH_LINK(NameOfClassLinkRefStructureType.SITE_PATH_LINK);
    private final NameOfClassLinkRefStructureType value;

    NameOfClassGenericPathLinkRefStructureType(NameOfClassLinkRefStructureType v) {
        value = v;
    }

    public NameOfClassLinkRefStructureType value() {
        return value;
    }

    public static NameOfClassGenericPathLinkRefStructureType fromValue(NameOfClassLinkRefStructureType v) {
        for (NameOfClassGenericPathLinkRefStructureType c: NameOfClassGenericPathLinkRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
