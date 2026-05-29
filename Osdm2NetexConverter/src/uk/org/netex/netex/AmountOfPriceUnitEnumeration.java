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
 * <p>Java-Klasse f�r AmountOfPriceUnitEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AmountOfPriceUnitEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="tripCarnet"/>
 *     &lt;enumeration value="passCarnet"/>
 *     &lt;enumeration value="unitCoupon"/>
 *     &lt;enumeration value="storedValue"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AmountOfPriceUnitEnumeration")
@XmlEnum
public enum AmountOfPriceUnitEnumeration {

    @XmlEnumValue("tripCarnet")
    TRIP_CARNET("tripCarnet"),
    @XmlEnumValue("passCarnet")
    PASS_CARNET("passCarnet"),
    @XmlEnumValue("unitCoupon")
    UNIT_COUPON("unitCoupon"),
    @XmlEnumValue("storedValue")
    STORED_VALUE("storedValue"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AmountOfPriceUnitEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AmountOfPriceUnitEnumeration fromValue(String v) {
        for (AmountOfPriceUnitEnumeration c: AmountOfPriceUnitEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
