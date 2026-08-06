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
 * <p>Java-Klasse f�r NameOfClassCallRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassCallRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="Call"/>
 *     &lt;enumeration value="MonitoredCall"/>
 *     &lt;enumeration value="OnwardCall"/>
 *     &lt;enumeration value="PreviousCall"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassCallRefStructureType")
@XmlEnum
public enum NameOfClassCallRefStructureType {

    @XmlEnumValue("Call")
    CALL("Call"),
    @XmlEnumValue("MonitoredCall")
    MONITORED_CALL("MonitoredCall"),
    @XmlEnumValue("OnwardCall")
    ONWARD_CALL("OnwardCall"),
    @XmlEnumValue("PreviousCall")
    PREVIOUS_CALL("PreviousCall");
    private final String value;

    NameOfClassCallRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassCallRefStructureType fromValue(String v) {
        for (NameOfClassCallRefStructureType c: NameOfClassCallRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
