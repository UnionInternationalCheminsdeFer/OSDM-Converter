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
 * <p>Java-Klasse f�r PassengerInformationFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PassengerInformationFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="nextStopIndicator"/>
 *     &lt;enumeration value="stopAnnouncements"/>
 *     &lt;enumeration value="passengerInformationDisplay"/>
 *     &lt;enumeration value="realTimeConnections"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PassengerInformationFacilityEnumeration")
@XmlEnum
public enum PassengerInformationFacilityEnumeration {

    @XmlEnumValue("nextStopIndicator")
    NEXT_STOP_INDICATOR("nextStopIndicator"),
    @XmlEnumValue("stopAnnouncements")
    STOP_ANNOUNCEMENTS("stopAnnouncements"),
    @XmlEnumValue("passengerInformationDisplay")
    PASSENGER_INFORMATION_DISPLAY("passengerInformationDisplay"),
    @XmlEnumValue("realTimeConnections")
    REAL_TIME_CONNECTIONS("realTimeConnections"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PassengerInformationFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PassengerInformationFacilityEnumeration fromValue(String v) {
        for (PassengerInformationFacilityEnumeration c: PassengerInformationFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
