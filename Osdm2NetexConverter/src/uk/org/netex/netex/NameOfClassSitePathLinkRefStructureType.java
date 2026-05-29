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
 * <p>Java-Klasse f�r NameOfClassSitePathLinkRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassSitePathLinkRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassGenericPathLinkRefStructureType">
 *     &lt;enumeration value="DeckPathLink"/>
 *     &lt;enumeration value="OffSitePathLink"/>
 *     &lt;enumeration value="PathLink"/>
 *     &lt;enumeration value="SitePathLink"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassSitePathLinkRefStructureType")
@XmlEnum(NameOfClassGenericPathLinkRefStructureType.class)
public enum NameOfClassSitePathLinkRefStructureType {

    @XmlEnumValue("DeckPathLink")
    DECK_PATH_LINK(NameOfClassGenericPathLinkRefStructureType.DECK_PATH_LINK),
    @XmlEnumValue("OffSitePathLink")
    OFF_SITE_PATH_LINK(NameOfClassGenericPathLinkRefStructureType.OFF_SITE_PATH_LINK),
    @XmlEnumValue("PathLink")
    PATH_LINK(NameOfClassGenericPathLinkRefStructureType.PATH_LINK),
    @XmlEnumValue("SitePathLink")
    SITE_PATH_LINK(NameOfClassGenericPathLinkRefStructureType.SITE_PATH_LINK);
    private final NameOfClassGenericPathLinkRefStructureType value;

    NameOfClassSitePathLinkRefStructureType(NameOfClassGenericPathLinkRefStructureType v) {
        value = v;
    }

    public NameOfClassGenericPathLinkRefStructureType value() {
        return value;
    }

    public static NameOfClassSitePathLinkRefStructureType fromValue(NameOfClassGenericPathLinkRefStructureType v) {
        for (NameOfClassSitePathLinkRefStructureType c: NameOfClassSitePathLinkRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
