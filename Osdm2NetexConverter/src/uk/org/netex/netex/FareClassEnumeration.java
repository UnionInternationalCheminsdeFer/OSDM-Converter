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
 * <p>Java-Klasse f�r FareClassEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FareClassEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="firstClass"/>
 *     &lt;enumeration value="secondClass"/>
 *     &lt;enumeration value="thirdClass"/>
 *     &lt;enumeration value="preferente"/>
 *     &lt;enumeration value="premiumClass"/>
 *     &lt;enumeration value="businessClass"/>
 *     &lt;enumeration value="standardClass"/>
 *     &lt;enumeration value="turista"/>
 *     &lt;enumeration value="economyClass"/>
 *     &lt;enumeration value="any"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FareClassEnumeration")
@XmlEnum
public enum FareClassEnumeration {


    /**
     * pti23_0
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * pti23_6
     * 
     */
    @XmlEnumValue("firstClass")
    FIRST_CLASS("firstClass"),

    /**
     * pti23_7
     * 
     */
    @XmlEnumValue("secondClass")
    SECOND_CLASS("secondClass"),

    /**
     * pti23_8
     * 
     */
    @XmlEnumValue("thirdClass")
    THIRD_CLASS("thirdClass"),
    @XmlEnumValue("preferente")
    PREFERENTE("preferente"),

    /**
     * pti23_6_1
     * 
     */
    @XmlEnumValue("premiumClass")
    PREMIUM_CLASS("premiumClass"),

    /**
     * Business Class - pti23_10
     * 
     */
    @XmlEnumValue("businessClass")
    BUSINESS_CLASS("businessClass"),

    /**
     * Standard class Add pti23_7
     * 
     */
    @XmlEnumValue("standardClass")
    STANDARD_CLASS("standardClass"),
    @XmlEnumValue("turista")
    TURISTA("turista"),

    /**
     * pti23_9
     * 
     */
    @XmlEnumValue("economyClass")
    ECONOMY_CLASS("economyClass"),
    @XmlEnumValue("any")
    ANY("any");
    private final String value;

    FareClassEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareClassEnumeration fromValue(String v) {
        for (FareClassEnumeration c: FareClassEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
