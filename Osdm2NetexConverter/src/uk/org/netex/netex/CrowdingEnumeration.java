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
 * <p>Java-Klasse f�r CrowdingEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CrowdingEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="veryQuiet"/>
 *     &lt;enumeration value="quiet"/>
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="busy"/>
 *     &lt;enumeration value="veryBusy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CrowdingEnumeration")
@XmlEnum
public enum CrowdingEnumeration {

    @XmlEnumValue("veryQuiet")
    VERY_QUIET("veryQuiet"),
    @XmlEnumValue("quiet")
    QUIET("quiet"),
    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("busy")
    BUSY("busy"),
    @XmlEnumValue("veryBusy")
    VERY_BUSY("veryBusy");
    private final String value;

    CrowdingEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CrowdingEnumeration fromValue(String v) {
        for (CrowdingEnumeration c: CrowdingEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
