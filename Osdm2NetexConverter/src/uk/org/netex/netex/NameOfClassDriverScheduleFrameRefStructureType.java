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
 * <p>Java-Klasse f�r NameOfClassDriverScheduleFrameRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassDriverScheduleFrameRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassVersionFrameRefStructureType">
 *     &lt;enumeration value="DriverScheduleFrame"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassDriverScheduleFrameRefStructureType")
@XmlEnum(NameOfClassVersionFrameRefStructureType.class)
public enum NameOfClassDriverScheduleFrameRefStructureType {

    @XmlEnumValue("DriverScheduleFrame")
    DRIVER_SCHEDULE_FRAME(NameOfClassVersionFrameRefStructureType.DRIVER_SCHEDULE_FRAME);
    private final NameOfClassVersionFrameRefStructureType value;

    NameOfClassDriverScheduleFrameRefStructureType(NameOfClassVersionFrameRefStructureType v) {
        value = v;
    }

    public NameOfClassVersionFrameRefStructureType value() {
        return value;
    }

    public static NameOfClassDriverScheduleFrameRefStructureType fromValue(NameOfClassVersionFrameRefStructureType v) {
        for (NameOfClassDriverScheduleFrameRefStructureType c: NameOfClassDriverScheduleFrameRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
