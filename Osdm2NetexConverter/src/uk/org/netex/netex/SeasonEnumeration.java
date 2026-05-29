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
 * <p>Java-Klasse f�r SeasonEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SeasonEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Spring"/>
 *     &lt;enumeration value="Summer"/>
 *     &lt;enumeration value="Autumn"/>
 *     &lt;enumeration value="Winter"/>
 *     &lt;enumeration value="Perennially"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SeasonEnumeration")
@XmlEnum
public enum SeasonEnumeration {

    @XmlEnumValue("Spring")
    SPRING("Spring"),
    @XmlEnumValue("Summer")
    SUMMER("Summer"),
    @XmlEnumValue("Autumn")
    AUTUMN("Autumn"),
    @XmlEnumValue("Winter")
    WINTER("Winter"),
    @XmlEnumValue("Perennially")
    PERENNIALLY("Perennially");
    private final String value;

    SeasonEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeasonEnumeration fromValue(String v) {
        for (SeasonEnumeration c: SeasonEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
