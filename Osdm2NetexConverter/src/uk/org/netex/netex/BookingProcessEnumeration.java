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
 * <p>Java-Klasse f�r BookingProcessEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BookingProcessEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="productNotAvailable"/>
 *     &lt;enumeration value="productNotBookable"/>
 *     &lt;enumeration value="bookableThroughInternationalSystem"/>
 *     &lt;enumeration value="bookableThroughNationalSystem"/>
 *     &lt;enumeration value="bookableManuallly"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BookingProcessEnumeration")
@XmlEnum
public enum BookingProcessEnumeration {


    /**
     * Product is not available.
     * 
     */
    @XmlEnumValue("productNotAvailable")
    PRODUCT_NOT_AVAILABLE("productNotAvailable"),

    /**
     * Product cannot be booked.
     * 
     */
    @XmlEnumValue("productNotBookable")
    PRODUCT_NOT_BOOKABLE("productNotBookable"),

    /**
     * Product can be booked online internationally.
     * 
     */
    @XmlEnumValue("bookableThroughInternationalSystem")
    BOOKABLE_THROUGH_INTERNATIONAL_SYSTEM("bookableThroughInternationalSystem"),

    /**
     * Product can be booked online nationally.
     * 
     */
    @XmlEnumValue("bookableThroughNationalSystem")
    BOOKABLE_THROUGH_NATIONAL_SYSTEM("bookableThroughNationalSystem"),

    /**
     * Product can only be booked by contacting specific authorised retail outlets
     * 
     */
    @XmlEnumValue("bookableManuallly")
    BOOKABLE_MANUALLLY("bookableManuallly"),

    /**
     * Other booking process.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    BookingProcessEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BookingProcessEnumeration fromValue(String v) {
        for (BookingProcessEnumeration c: BookingProcessEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
