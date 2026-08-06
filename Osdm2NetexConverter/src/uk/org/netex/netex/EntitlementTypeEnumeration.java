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
 * <p>Java-Klasse f�r EntitlementTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EntitlementTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="purchase"/>
 *     &lt;enumeration value="purchaseAtDiscount"/>
 *     &lt;enumeration value="use"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntitlementTypeEnumeration")
@XmlEnum
public enum EntitlementTypeEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("purchase")
    PURCHASE("purchase"),
    @XmlEnumValue("purchaseAtDiscount")
    PURCHASE_AT_DISCOUNT("purchaseAtDiscount"),
    @XmlEnumValue("use")
    USE("use"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    EntitlementTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntitlementTypeEnumeration fromValue(String v) {
        for (EntitlementTypeEnumeration c: EntitlementTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
