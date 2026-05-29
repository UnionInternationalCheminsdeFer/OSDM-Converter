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
 * <p>Java-Klasse f�r UicRateTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="UicRateTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="discountInTrainOtherThanTGV"/>
 *     &lt;enumeration value="specialFare"/>
 *     &lt;enumeration value="supplement"/>
 *     &lt;enumeration value="noPublishedTariff"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UicRateTypeEnumeration")
@XmlEnum
public enum UicRateTypeEnumeration {

    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("discountInTrainOtherThanTGV")
    DISCOUNT_IN_TRAIN_OTHER_THAN_TGV("discountInTrainOtherThanTGV"),
    @XmlEnumValue("specialFare")
    SPECIAL_FARE("specialFare"),
    @XmlEnumValue("supplement")
    SUPPLEMENT("supplement"),
    @XmlEnumValue("noPublishedTariff")
    NO_PUBLISHED_TARIFF("noPublishedTariff");
    private final String value;

    UicRateTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UicRateTypeEnumeration fromValue(String v) {
        for (UicRateTypeEnumeration c: UicRateTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
