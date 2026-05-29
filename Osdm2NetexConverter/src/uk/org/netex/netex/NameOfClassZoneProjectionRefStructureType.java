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
 * <p>Java-Klasse f�r NameOfClassZoneProjectionRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassZoneProjectionRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassProjectionRefStructureType">
 *     &lt;enumeration value="TopographicProjection"/>
 *     &lt;enumeration value="ZoneProjection"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassZoneProjectionRefStructureType")
@XmlEnum(NameOfClassProjectionRefStructureType.class)
public enum NameOfClassZoneProjectionRefStructureType {

    @XmlEnumValue("TopographicProjection")
    TOPOGRAPHIC_PROJECTION(NameOfClassProjectionRefStructureType.TOPOGRAPHIC_PROJECTION),
    @XmlEnumValue("ZoneProjection")
    ZONE_PROJECTION(NameOfClassProjectionRefStructureType.ZONE_PROJECTION);
    private final NameOfClassProjectionRefStructureType value;

    NameOfClassZoneProjectionRefStructureType(NameOfClassProjectionRefStructureType v) {
        value = v;
    }

    public NameOfClassProjectionRefStructureType value() {
        return value;
    }

    public static NameOfClassZoneProjectionRefStructureType fromValue(NameOfClassProjectionRefStructureType v) {
        for (NameOfClassZoneProjectionRefStructureType c: NameOfClassZoneProjectionRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
