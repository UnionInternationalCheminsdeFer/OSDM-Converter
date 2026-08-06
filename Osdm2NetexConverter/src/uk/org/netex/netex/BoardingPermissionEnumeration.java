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
 * <p>Java-Klasse f�r BoardingPermissionEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BoardingPermissionEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="earlyBoardingPossibleBeforeDeparture"/>
 *     &lt;enumeration value="lateAlightingPossibleAfterArrival"/>
 *     &lt;enumeration value="overnightStayOnboardAllowed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BoardingPermissionEnumeration")
@XmlEnum
public enum BoardingPermissionEnumeration {

    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("earlyBoardingPossibleBeforeDeparture")
    EARLY_BOARDING_POSSIBLE_BEFORE_DEPARTURE("earlyBoardingPossibleBeforeDeparture"),
    @XmlEnumValue("lateAlightingPossibleAfterArrival")
    LATE_ALIGHTING_POSSIBLE_AFTER_ARRIVAL("lateAlightingPossibleAfterArrival"),
    @XmlEnumValue("overnightStayOnboardAllowed")
    OVERNIGHT_STAY_ONBOARD_ALLOWED("overnightStayOnboardAllowed");
    private final String value;

    BoardingPermissionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BoardingPermissionEnumeration fromValue(String v) {
        for (BoardingPermissionEnumeration c: BoardingPermissionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
