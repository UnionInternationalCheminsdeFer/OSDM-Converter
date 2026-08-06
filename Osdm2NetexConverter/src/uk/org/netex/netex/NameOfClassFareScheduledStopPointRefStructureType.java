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
 * <p>Java-Klasse f�r NameOfClassFareScheduledStopPointRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassFareScheduledStopPointRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassScheduledStopPointRefStructureType">
 *     &lt;enumeration value="FareScheduledStopPoint"/>
 *     &lt;enumeration value="Point"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassFareScheduledStopPointRefStructureType")
@XmlEnum(NameOfClassScheduledStopPointRefStructureType.class)
public enum NameOfClassFareScheduledStopPointRefStructureType {

    @XmlEnumValue("FareScheduledStopPoint")
    FARE_SCHEDULED_STOP_POINT(NameOfClassScheduledStopPointRefStructureType.FARE_SCHEDULED_STOP_POINT),
    @XmlEnumValue("Point")
    POINT(NameOfClassScheduledStopPointRefStructureType.POINT);
    private final NameOfClassScheduledStopPointRefStructureType value;

    NameOfClassFareScheduledStopPointRefStructureType(NameOfClassScheduledStopPointRefStructureType v) {
        value = v;
    }

    public NameOfClassScheduledStopPointRefStructureType value() {
        return value;
    }

    public static NameOfClassFareScheduledStopPointRefStructureType fromValue(NameOfClassScheduledStopPointRefStructureType v) {
        for (NameOfClassFareScheduledStopPointRefStructureType c: NameOfClassFareScheduledStopPointRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
