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
 * <p>Java-Klasse f�r TideEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TideEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HighTide"/>
 *     &lt;enumeration value="LowTide"/>
 *     &lt;enumeration value="NeapTide"/>
 *     &lt;enumeration value="AllTides"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TideEnumeration")
@XmlEnum
public enum TideEnumeration {

    @XmlEnumValue("HighTide")
    HIGH_TIDE("HighTide"),
    @XmlEnumValue("LowTide")
    LOW_TIDE("LowTide"),
    @XmlEnumValue("NeapTide")
    NEAP_TIDE("NeapTide"),
    @XmlEnumValue("AllTides")
    ALL_TIDES("AllTides");
    private final String value;

    TideEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TideEnumeration fromValue(String v) {
        for (TideEnumeration c: TideEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
