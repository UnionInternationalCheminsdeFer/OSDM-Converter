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
 * <p>Java-Klasse f�r AccommodationAccessEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AccommodationAccessEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="freeSeating"/>
 *     &lt;enumeration value="reservation"/>
 *     &lt;enumeration value="standing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccommodationAccessEnumeration")
@XmlEnum
public enum AccommodationAccessEnumeration {

    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("freeSeating")
    FREE_SEATING("freeSeating"),

    /**
     * pti23_3
     * 
     */
    @XmlEnumValue("reservation")
    RESERVATION("reservation"),
    @XmlEnumValue("standing")
    STANDING("standing");
    private final String value;

    AccommodationAccessEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccommodationAccessEnumeration fromValue(String v) {
        for (AccommodationAccessEnumeration c: AccommodationAccessEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
