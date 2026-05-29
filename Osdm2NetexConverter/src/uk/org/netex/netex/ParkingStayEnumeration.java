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
 * <p>Java-Klasse f�r ParkingStayEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingStayEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="shortStay"/>
 *     &lt;enumeration value="midTerm"/>
 *     &lt;enumeration value="longTerm"/>
 *     &lt;enumeration value="dropoff"/>
 *     &lt;enumeration value="unlimited"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="all"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParkingStayEnumeration")
@XmlEnum
public enum ParkingStayEnumeration {

    @XmlEnumValue("shortStay")
    SHORT_STAY("shortStay"),
    @XmlEnumValue("midTerm")
    MID_TERM("midTerm"),
    @XmlEnumValue("longTerm")
    LONG_TERM("longTerm"),
    @XmlEnumValue("dropoff")
    DROPOFF("dropoff"),
    @XmlEnumValue("unlimited")
    UNLIMITED("unlimited"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    ParkingStayEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingStayEnumeration fromValue(String v) {
        for (ParkingStayEnumeration c: ParkingStayEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
