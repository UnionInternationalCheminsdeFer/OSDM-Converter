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
 * <p>Java-Klasse f�r NameOfClassTurnaroundTimeLimitTimeRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassTurnaroundTimeLimitTimeRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassJourneyTimingRefStructureType">
 *     &lt;enumeration value="TurnaroundTimeLimitTime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassTurnaroundTimeLimitTimeRefStructureType")
@XmlEnum(NameOfClassJourneyTimingRefStructureType.class)
public enum NameOfClassTurnaroundTimeLimitTimeRefStructureType {

    @XmlEnumValue("TurnaroundTimeLimitTime")
    TURNAROUND_TIME_LIMIT_TIME(NameOfClassJourneyTimingRefStructureType.TURNAROUND_TIME_LIMIT_TIME);
    private final NameOfClassJourneyTimingRefStructureType value;

    NameOfClassTurnaroundTimeLimitTimeRefStructureType(NameOfClassJourneyTimingRefStructureType v) {
        value = v;
    }

    public NameOfClassJourneyTimingRefStructureType value() {
        return value;
    }

    public static NameOfClassTurnaroundTimeLimitTimeRefStructureType fromValue(NameOfClassJourneyTimingRefStructureType v) {
        for (NameOfClassTurnaroundTimeLimitTimeRefStructureType c: NameOfClassTurnaroundTimeLimitTimeRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
