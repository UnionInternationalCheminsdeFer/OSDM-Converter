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
 * <p>Java-Klasse f�r ParkingPaymentProcessEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingPaymentProcessEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="free"/>
 *     &lt;enumeration value="payAtBay"/>
 *     &lt;enumeration value="payAndDisplay"/>
 *     &lt;enumeration value="payAtExitBoothManualCollection"/>
 *     &lt;enumeration value="payAtMachineOnFootPriorToExit"/>
 *     &lt;enumeration value="payByPrepaidToken"/>
 *     &lt;enumeration value="payByMobileDevice"/>
 *     &lt;enumeration value="payByPlate"/>
 *     &lt;enumeration value="prepayForPermit"/>
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParkingPaymentProcessEnumeration")
@XmlEnum
public enum ParkingPaymentProcessEnumeration {

    @XmlEnumValue("free")
    FREE("free"),
    @XmlEnumValue("payAtBay")
    PAY_AT_BAY("payAtBay"),
    @XmlEnumValue("payAndDisplay")
    PAY_AND_DISPLAY("payAndDisplay"),
    @XmlEnumValue("payAtExitBoothManualCollection")
    PAY_AT_EXIT_BOOTH_MANUAL_COLLECTION("payAtExitBoothManualCollection"),
    @XmlEnumValue("payAtMachineOnFootPriorToExit")
    PAY_AT_MACHINE_ON_FOOT_PRIOR_TO_EXIT("payAtMachineOnFootPriorToExit"),
    @XmlEnumValue("payByPrepaidToken")
    PAY_BY_PREPAID_TOKEN("payByPrepaidToken"),
    @XmlEnumValue("payByMobileDevice")
    PAY_BY_MOBILE_DEVICE("payByMobileDevice"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("payByPlate")
    PAY_BY_PLATE("payByPlate"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("prepayForPermit")
    PREPAY_FOR_PERMIT("prepayForPermit"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ParkingPaymentProcessEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingPaymentProcessEnumeration fromValue(String v) {
        for (ParkingPaymentProcessEnumeration c: ParkingPaymentProcessEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
