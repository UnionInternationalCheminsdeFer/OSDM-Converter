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
 * <p>Java-Klasse f�r NameOfClassInfrastructureLinkRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassInfrastructureLinkRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassLinkRefStructureType">
 *     &lt;enumeration value="RailwayElement"/>
 *     &lt;enumeration value="RoadElement"/>
 *     &lt;enumeration value="WireElement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassInfrastructureLinkRefStructureType")
@XmlEnum(NameOfClassLinkRefStructureType.class)
public enum NameOfClassInfrastructureLinkRefStructureType {

    @XmlEnumValue("RailwayElement")
    RAILWAY_ELEMENT(NameOfClassLinkRefStructureType.RAILWAY_ELEMENT),
    @XmlEnumValue("RoadElement")
    ROAD_ELEMENT(NameOfClassLinkRefStructureType.ROAD_ELEMENT),
    @XmlEnumValue("WireElement")
    WIRE_ELEMENT(NameOfClassLinkRefStructureType.WIRE_ELEMENT);
    private final NameOfClassLinkRefStructureType value;

    NameOfClassInfrastructureLinkRefStructureType(NameOfClassLinkRefStructureType v) {
        value = v;
    }

    public NameOfClassLinkRefStructureType value() {
        return value;
    }

    public static NameOfClassInfrastructureLinkRefStructureType fromValue(NameOfClassLinkRefStructureType v) {
        for (NameOfClassInfrastructureLinkRefStructureType c: NameOfClassInfrastructureLinkRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
