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
 * <p>Java-Klasse f�r ReservationChargeTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ReservationChargeTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="noFee"/>
 *     &lt;enumeration value="fee"/>
 *     &lt;enumeration value="singleFeeForReturnTrip"/>
 *     &lt;enumeration value="feeForEachDirection"/>
 *     &lt;enumeration value="feeForEachLeg"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReservationChargeTypeEnumeration")
@XmlEnum
public enum ReservationChargeTypeEnumeration {

    @XmlEnumValue("noFee")
    NO_FEE("noFee"),
    @XmlEnumValue("fee")
    FEE("fee"),
    @XmlEnumValue("singleFeeForReturnTrip")
    SINGLE_FEE_FOR_RETURN_TRIP("singleFeeForReturnTrip"),
    @XmlEnumValue("feeForEachDirection")
    FEE_FOR_EACH_DIRECTION("feeForEachDirection"),
    @XmlEnumValue("feeForEachLeg")
    FEE_FOR_EACH_LEG("feeForEachLeg");
    private final String value;

    ReservationChargeTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReservationChargeTypeEnumeration fromValue(String v) {
        for (ReservationChargeTypeEnumeration c: ReservationChargeTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
