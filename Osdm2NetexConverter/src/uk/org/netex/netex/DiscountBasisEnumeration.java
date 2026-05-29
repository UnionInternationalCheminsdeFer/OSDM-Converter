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
 * <p>Java-Klasse f�r DiscountBasisEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DiscountBasisEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="free"/>
 *     &lt;enumeration value="discount"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DiscountBasisEnumeration")
@XmlEnum
public enum DiscountBasisEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("free")
    FREE("free"),
    @XmlEnumValue("discount")
    DISCOUNT("discount");
    private final String value;

    DiscountBasisEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiscountBasisEnumeration fromValue(String v) {
        for (DiscountBasisEnumeration c: DiscountBasisEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
