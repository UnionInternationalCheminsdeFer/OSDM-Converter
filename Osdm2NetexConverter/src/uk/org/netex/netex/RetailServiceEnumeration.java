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
 * <p>Java-Klasse f�r RetailServiceEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RetailServiceEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="food"/>
 *     &lt;enumeration value="healthHygieneBeauty"/>
 *     &lt;enumeration value="newspaperTobacco"/>
 *     &lt;enumeration value="fashionAccessories"/>
 *     &lt;enumeration value="bankFinanceInsurance"/>
 *     &lt;enumeration value="tourism"/>
 *     &lt;enumeration value="photoBooth"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RetailServiceEnumeration")
@XmlEnum
public enum RetailServiceEnumeration {

    @XmlEnumValue("food")
    FOOD("food"),
    @XmlEnumValue("healthHygieneBeauty")
    HEALTH_HYGIENE_BEAUTY("healthHygieneBeauty"),
    @XmlEnumValue("newspaperTobacco")
    NEWSPAPER_TOBACCO("newspaperTobacco"),
    @XmlEnumValue("fashionAccessories")
    FASHION_ACCESSORIES("fashionAccessories"),
    @XmlEnumValue("bankFinanceInsurance")
    BANK_FINANCE_INSURANCE("bankFinanceInsurance"),
    @XmlEnumValue("tourism")
    TOURISM("tourism"),
    @XmlEnumValue("photoBooth")
    PHOTO_BOOTH("photoBooth");
    private final String value;

    RetailServiceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RetailServiceEnumeration fromValue(String v) {
        for (RetailServiceEnumeration c: RetailServiceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
