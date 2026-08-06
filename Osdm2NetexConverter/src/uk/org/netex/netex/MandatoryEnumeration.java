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
 * <p>Java-Klasse f�r MandatoryEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MandatoryEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="required"/>
 *     &lt;enumeration value="optional"/>
 *     &lt;enumeration value="notAllowed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MandatoryEnumeration")
@XmlEnum
public enum MandatoryEnumeration {


    /**
     * Include elements that meet selection criteria (e.g. validity condition).
     * 
     */
    @XmlEnumValue("required")
    REQUIRED("required"),

    /**
     * Include elements that are referenced by primary element. E.g. TYPES OF VALUE, OPERATOR etc.
     * 
     */
    @XmlEnumValue("optional")
    OPTIONAL("optional"),

    /**
     * Must not be included.
     * 
     */
    @XmlEnumValue("notAllowed")
    NOT_ALLOWED("notAllowed");
    private final String value;

    MandatoryEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MandatoryEnumeration fromValue(String v) {
        for (MandatoryEnumeration c: MandatoryEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
