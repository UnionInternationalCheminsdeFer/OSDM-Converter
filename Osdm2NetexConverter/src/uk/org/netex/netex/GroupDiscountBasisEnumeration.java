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
 * <p>Java-Klasse f�r GroupDiscountBasisEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="GroupDiscountBasisEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="free"/>
 *     &lt;enumeration value="discountForFirstPersonOnly"/>
 *     &lt;enumeration value="discountForSecondAndSubsequentPersons"/>
 *     &lt;enumeration value="stepDiscount"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GroupDiscountBasisEnumeration")
@XmlEnum
public enum GroupDiscountBasisEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("free")
    FREE("free"),
    @XmlEnumValue("discountForFirstPersonOnly")
    DISCOUNT_FOR_FIRST_PERSON_ONLY("discountForFirstPersonOnly"),
    @XmlEnumValue("discountForSecondAndSubsequentPersons")
    DISCOUNT_FOR_SECOND_AND_SUBSEQUENT_PERSONS("discountForSecondAndSubsequentPersons"),
    @XmlEnumValue("stepDiscount")
    STEP_DISCOUNT("stepDiscount"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    GroupDiscountBasisEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupDiscountBasisEnumeration fromValue(String v) {
        for (GroupDiscountBasisEnumeration c: GroupDiscountBasisEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
