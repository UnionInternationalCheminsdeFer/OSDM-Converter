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
 * <p>Java-Klasse f�r NameOfClassOffSitePathLinkRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassOffSitePathLinkRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassGenericPathLinkRefStructureType">
 *     &lt;enumeration value="OffSitePathLink"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassOffSitePathLinkRefStructureType")
@XmlEnum(NameOfClassGenericPathLinkRefStructureType.class)
public enum NameOfClassOffSitePathLinkRefStructureType {

    @XmlEnumValue("OffSitePathLink")
    OFF_SITE_PATH_LINK(NameOfClassGenericPathLinkRefStructureType.OFF_SITE_PATH_LINK);
    private final NameOfClassGenericPathLinkRefStructureType value;

    NameOfClassOffSitePathLinkRefStructureType(NameOfClassGenericPathLinkRefStructureType v) {
        value = v;
    }

    public NameOfClassGenericPathLinkRefStructureType value() {
        return value;
    }

    public static NameOfClassOffSitePathLinkRefStructureType fromValue(NameOfClassGenericPathLinkRefStructureType v) {
        for (NameOfClassOffSitePathLinkRefStructureType c: NameOfClassOffSitePathLinkRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
