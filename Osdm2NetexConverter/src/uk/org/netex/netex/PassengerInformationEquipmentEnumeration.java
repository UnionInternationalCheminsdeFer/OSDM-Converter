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
 * <p>Java-Klasse f�r PassengerInformationEquipmentEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PassengerInformationEquipmentEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="timetablePoster"/>
 *     &lt;enumeration value="fareInformation"/>
 *     &lt;enumeration value="lineNetworkPlan"/>
 *     &lt;enumeration value="lineTimetable"/>
 *     &lt;enumeration value="stopTimetable"/>
 *     &lt;enumeration value="journeyPlanning"/>
 *     &lt;enumeration value="interactiveKiosk"/>
 *     &lt;enumeration value="informationDesk"/>
 *     &lt;enumeration value="networkStatus"/>
 *     &lt;enumeration value="realTimeDisruptions"/>
 *     &lt;enumeration value="realTimeDepartures"/>
 *     &lt;enumeration value="stationMap"/>
 *     &lt;enumeration value="acousticStationMap"/>
 *     &lt;enumeration value="tactileStationMap"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PassengerInformationEquipmentEnumeration")
@XmlEnum
public enum PassengerInformationEquipmentEnumeration {

    @XmlEnumValue("timetablePoster")
    TIMETABLE_POSTER("timetablePoster"),
    @XmlEnumValue("fareInformation")
    FARE_INFORMATION("fareInformation"),
    @XmlEnumValue("lineNetworkPlan")
    LINE_NETWORK_PLAN("lineNetworkPlan"),
    @XmlEnumValue("lineTimetable")
    LINE_TIMETABLE("lineTimetable"),
    @XmlEnumValue("stopTimetable")
    STOP_TIMETABLE("stopTimetable"),
    @XmlEnumValue("journeyPlanning")
    JOURNEY_PLANNING("journeyPlanning"),
    @XmlEnumValue("interactiveKiosk")
    INTERACTIVE_KIOSK("interactiveKiosk"),
    @XmlEnumValue("informationDesk")
    INFORMATION_DESK("informationDesk"),
    @XmlEnumValue("networkStatus")
    NETWORK_STATUS("networkStatus"),
    @XmlEnumValue("realTimeDisruptions")
    REAL_TIME_DISRUPTIONS("realTimeDisruptions"),
    @XmlEnumValue("realTimeDepartures")
    REAL_TIME_DEPARTURES("realTimeDepartures"),

    /**
     * +v2.0
     * 
     */
    @XmlEnumValue("stationMap")
    STATION_MAP("stationMap"),

    /**
     * +v2.0
     * 
     */
    @XmlEnumValue("acousticStationMap")
    ACOUSTIC_STATION_MAP("acousticStationMap"),

    /**
     * +v2.0
     * 
     */
    @XmlEnumValue("tactileStationMap")
    TACTILE_STATION_MAP("tactileStationMap"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PassengerInformationEquipmentEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PassengerInformationEquipmentEnumeration fromValue(String v) {
        for (PassengerInformationEquipmentEnumeration c: PassengerInformationEquipmentEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
