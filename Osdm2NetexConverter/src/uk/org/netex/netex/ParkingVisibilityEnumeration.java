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
 * <p>Java-Klasse f�r ParkingVisibilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingVisibilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="unmarked"/>
 *     &lt;enumeration value="signageOnly"/>
 *     &lt;enumeration value="demarcated"/>
 *     &lt;enumeration value="docks"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParkingVisibilityEnumeration")
@XmlEnum
public enum ParkingVisibilityEnumeration {

    @XmlEnumValue("unmarked")
    UNMARKED("unmarked"),
    @XmlEnumValue("signageOnly")
    SIGNAGE_ONLY("signageOnly"),
    @XmlEnumValue("demarcated")
    DEMARCATED("demarcated"),
    @XmlEnumValue("docks")
    DOCKS("docks"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ParkingVisibilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingVisibilityEnumeration fromValue(String v) {
        for (ParkingVisibilityEnumeration c: ParkingVisibilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
