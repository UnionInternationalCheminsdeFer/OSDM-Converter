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
 * <p>Java-Klasse f�r GenderLimitationEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="GenderLimitationEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="both"/>
 *     &lt;enumeration value="femaleOnly"/>
 *     &lt;enumeration value="maleOnly"/>
 *     &lt;enumeration value="sameSexOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GenderLimitationEnumeration")
@XmlEnum
public enum GenderLimitationEnumeration {

    @XmlEnumValue("both")
    BOTH("both"),
    @XmlEnumValue("femaleOnly")
    FEMALE_ONLY("femaleOnly"),
    @XmlEnumValue("maleOnly")
    MALE_ONLY("maleOnly"),
    @XmlEnumValue("sameSexOnly")
    SAME_SEX_ONLY("sameSexOnly");
    private final String value;

    GenderLimitationEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GenderLimitationEnumeration fromValue(String v) {
        for (GenderLimitationEnumeration c: GenderLimitationEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
