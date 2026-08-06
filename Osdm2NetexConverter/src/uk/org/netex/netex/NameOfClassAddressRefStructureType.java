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
 * <p>Java-Klasse f�r NameOfClassAddressRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassAddressRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassPlaceRefStructureType">
 *     &lt;enumeration value="PostalAddress"/>
 *     &lt;enumeration value="RoadAddress"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassAddressRefStructureType")
@XmlEnum(NameOfClassPlaceRefStructureType.class)
public enum NameOfClassAddressRefStructureType {

    @XmlEnumValue("PostalAddress")
    POSTAL_ADDRESS(NameOfClassPlaceRefStructureType.POSTAL_ADDRESS),
    @XmlEnumValue("RoadAddress")
    ROAD_ADDRESS(NameOfClassPlaceRefStructureType.ROAD_ADDRESS);
    private final NameOfClassPlaceRefStructureType value;

    NameOfClassAddressRefStructureType(NameOfClassPlaceRefStructureType v) {
        value = v;
    }

    public NameOfClassPlaceRefStructureType value() {
        return value;
    }

    public static NameOfClassAddressRefStructureType fromValue(NameOfClassPlaceRefStructureType v) {
        for (NameOfClassAddressRefStructureType c: NameOfClassAddressRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
