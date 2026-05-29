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
 * <p>Java-Klasse f�r FrequencyOfUseTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FrequencyOfUseTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="unlimited"/>
 *     &lt;enumeration value="limited"/>
 *     &lt;enumeration value="twiceADay"/>
 *     &lt;enumeration value="single"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FrequencyOfUseTypeEnumeration")
@XmlEnum
public enum FrequencyOfUseTypeEnumeration {


    /**
     * Product may not be used within allowed period.
     * 
     */
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * Unlimted use may be made of the product within allowed period.
     * 
     */
    @XmlEnumValue("unlimited")
    UNLIMITED("unlimited"),

    /**
     * Product may be used up to a limited amount within allowed period.
     * 
     */
    @XmlEnumValue("limited")
    LIMITED("limited"),

    /**
     * Product may be used twice a day within allowed period.
     * 
     */
    @XmlEnumValue("twiceADay")
    TWICE_A_DAY("twiceADay"),

    /**
     * Product may be used once within allowed period.
     * 
     */
    @XmlEnumValue("single")
    SINGLE("single");
    private final String value;

    FrequencyOfUseTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FrequencyOfUseTypeEnumeration fromValue(String v) {
        for (FrequencyOfUseTypeEnumeration c: FrequencyOfUseTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
