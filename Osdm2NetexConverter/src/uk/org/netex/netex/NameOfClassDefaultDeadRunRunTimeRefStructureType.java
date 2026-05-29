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
 * <p>Java-Klasse f�r NameOfClassDefaultDeadRunRunTimeRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassDefaultDeadRunRunTimeRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassJourneyTimingRefStructureType">
 *     &lt;enumeration value="DefaultDeadRunRunTime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassDefaultDeadRunRunTimeRefStructureType")
@XmlEnum(NameOfClassJourneyTimingRefStructureType.class)
public enum NameOfClassDefaultDeadRunRunTimeRefStructureType {

    @XmlEnumValue("DefaultDeadRunRunTime")
    DEFAULT_DEAD_RUN_RUN_TIME(NameOfClassJourneyTimingRefStructureType.DEFAULT_DEAD_RUN_RUN_TIME);
    private final NameOfClassJourneyTimingRefStructureType value;

    NameOfClassDefaultDeadRunRunTimeRefStructureType(NameOfClassJourneyTimingRefStructureType v) {
        value = v;
    }

    public NameOfClassJourneyTimingRefStructureType value() {
        return value;
    }

    public static NameOfClassDefaultDeadRunRunTimeRefStructureType fromValue(NameOfClassJourneyTimingRefStructureType v) {
        for (NameOfClassDefaultDeadRunRunTimeRefStructureType c: NameOfClassDefaultDeadRunRunTimeRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
