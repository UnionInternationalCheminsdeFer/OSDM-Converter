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
 * <p>Java-Klasse f�r VisualObstacleEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VisualObstacleEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="carParking"/>
 *     &lt;enumeration value="vegetation"/>
 *     &lt;enumeration value="building"/>
 *     &lt;enumeration value="streetFurniture"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VisualObstacleEnumeration")
@XmlEnum
public enum VisualObstacleEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("carParking")
    CAR_PARKING("carParking"),
    @XmlEnumValue("vegetation")
    VEGETATION("vegetation"),
    @XmlEnumValue("building")
    BUILDING("building"),
    @XmlEnumValue("streetFurniture")
    STREET_FURNITURE("streetFurniture"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    VisualObstacleEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VisualObstacleEnumeration fromValue(String v) {
        for (VisualObstacleEnumeration c: VisualObstacleEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
