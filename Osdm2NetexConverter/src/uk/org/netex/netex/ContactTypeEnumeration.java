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
 * <p>Java-Klasse f�r ContactTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="any"/>
 *     &lt;enumeration value="information"/>
 *     &lt;enumeration value="reservations"/>
 *     &lt;enumeration value="lostProperty"/>
 *     &lt;enumeration value="publicRelations"/>
 *     &lt;enumeration value="complaints"/>
 *     &lt;enumeration value="emergency"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContactTypeEnumeration")
@XmlEnum
public enum ContactTypeEnumeration {

    @XmlEnumValue("any")
    ANY("any"),
    @XmlEnumValue("information")
    INFORMATION("information"),
    @XmlEnumValue("reservations")
    RESERVATIONS("reservations"),
    @XmlEnumValue("lostProperty")
    LOST_PROPERTY("lostProperty"),
    @XmlEnumValue("publicRelations")
    PUBLIC_RELATIONS("publicRelations"),
    @XmlEnumValue("complaints")
    COMPLAINTS("complaints"),
    @XmlEnumValue("emergency")
    EMERGENCY("emergency"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ContactTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactTypeEnumeration fromValue(String v) {
        for (ContactTypeEnumeration c: ContactTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
