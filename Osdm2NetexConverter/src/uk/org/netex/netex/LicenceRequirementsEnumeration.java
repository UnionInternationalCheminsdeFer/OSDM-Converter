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
 * <p>Java-Klasse f�r LicenceRequirementsEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LicenceRequirementsEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="full"/>
 *     &lt;enumeration value="provisional"/>
 *     &lt;enumeration value="additional"/>
 *     &lt;enumeration value="none"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LicenceRequirementsEnumeration")
@XmlEnum
public enum LicenceRequirementsEnumeration {

    @XmlEnumValue("full")
    FULL("full"),
    @XmlEnumValue("provisional")
    PROVISIONAL("provisional"),
    @XmlEnumValue("additional")
    ADDITIONAL("additional"),
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    LicenceRequirementsEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LicenceRequirementsEnumeration fromValue(String v) {
        for (LicenceRequirementsEnumeration c: LicenceRequirementsEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
