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
 * <p>Java-Klasse f�r NavigationTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NavigationTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="hallToQuay"/>
 *     &lt;enumeration value="hallToStreet"/>
 *     &lt;enumeration value="quayToHall"/>
 *     &lt;enumeration value="quayToQuay"/>
 *     &lt;enumeration value="quayToStreet"/>
 *     &lt;enumeration value="streetToHall"/>
 *     &lt;enumeration value="streetToQuay"/>
 *     &lt;enumeration value="streetToSpace"/>
 *     &lt;enumeration value="spaceToStreet"/>
 *     &lt;enumeration value="spaceToHall"/>
 *     &lt;enumeration value="hallToSpace"/>
 *     &lt;enumeration value="spaceToSpace"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NavigationTypeEnumeration")
@XmlEnum
public enum NavigationTypeEnumeration {

    @XmlEnumValue("hallToQuay")
    HALL_TO_QUAY("hallToQuay"),
    @XmlEnumValue("hallToStreet")
    HALL_TO_STREET("hallToStreet"),
    @XmlEnumValue("quayToHall")
    QUAY_TO_HALL("quayToHall"),
    @XmlEnumValue("quayToQuay")
    QUAY_TO_QUAY("quayToQuay"),
    @XmlEnumValue("quayToStreet")
    QUAY_TO_STREET("quayToStreet"),
    @XmlEnumValue("streetToHall")
    STREET_TO_HALL("streetToHall"),
    @XmlEnumValue("streetToQuay")
    STREET_TO_QUAY("streetToQuay"),
    @XmlEnumValue("streetToSpace")
    STREET_TO_SPACE("streetToSpace"),
    @XmlEnumValue("spaceToStreet")
    SPACE_TO_STREET("spaceToStreet"),
    @XmlEnumValue("spaceToHall")
    SPACE_TO_HALL("spaceToHall"),
    @XmlEnumValue("hallToSpace")
    HALL_TO_SPACE("hallToSpace"),
    @XmlEnumValue("spaceToSpace")
    SPACE_TO_SPACE("spaceToSpace"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    NavigationTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NavigationTypeEnumeration fromValue(String v) {
        for (NavigationTypeEnumeration c: NavigationTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
