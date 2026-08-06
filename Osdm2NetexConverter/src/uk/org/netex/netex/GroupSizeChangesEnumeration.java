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
 * <p>Java-Klasse f�r GroupSizeChangesEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="GroupSizeChangesEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="noChanges"/>
 *     &lt;enumeration value="free"/>
 *     &lt;enumeration value="charge"/>
 *     &lt;enumeration value="purchaseWindowSteppedCharge"/>
 *     &lt;enumeration value="numberOfPassengersSteppedCharge"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GroupSizeChangesEnumeration")
@XmlEnum
public enum GroupSizeChangesEnumeration {


    /**
     * Group size cannot be changed..
     * 
     */
    @XmlEnumValue("noChanges")
    NO_CHANGES("noChanges"),

    /**
     * No charge to change group size.
     * 
     */
    @XmlEnumValue("free")
    FREE("free"),

    /**
     * Group size can be changed for a fee (as specified by a EXCHANGING usage parameter).
     * 
     */
    @XmlEnumValue("charge")
    CHARGE("charge"),

    /**
     * Group size can be changed, charges are according to a sliding scale according to the length of time before travel (as specified by several EXCHANGING parameters).
     * 
     */
    @XmlEnumValue("purchaseWindowSteppedCharge")
    PURCHASE_WINDOW_STEPPED_CHARGE("purchaseWindowSteppedCharge"),

    /**
     * Group size can be changed, charges are according to a sliding scale according to the number of passengers changed.
     * 
     */
    @XmlEnumValue("numberOfPassengersSteppedCharge")
    NUMBER_OF_PASSENGERS_STEPPED_CHARGE("numberOfPassengersSteppedCharge");
    private final String value;

    GroupSizeChangesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupSizeChangesEnumeration fromValue(String v) {
        for (GroupSizeChangesEnumeration c: GroupSizeChangesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
