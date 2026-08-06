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
 * <p>Java-Klasse f�r MeetingPointEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MeetingPointEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="meetingPoint"/>
 *     &lt;enumeration value="groupMeeting"/>
 *     &lt;enumeration value="schoolMeetingPoint"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MeetingPointEnumeration")
@XmlEnum
public enum MeetingPointEnumeration {

    @XmlEnumValue("meetingPoint")
    MEETING_POINT("meetingPoint"),
    @XmlEnumValue("groupMeeting")
    GROUP_MEETING("groupMeeting"),
    @XmlEnumValue("schoolMeetingPoint")
    SCHOOL_MEETING_POINT("schoolMeetingPoint"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    MeetingPointEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeetingPointEnumeration fromValue(String v) {
        for (MeetingPointEnumeration c: MeetingPointEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
