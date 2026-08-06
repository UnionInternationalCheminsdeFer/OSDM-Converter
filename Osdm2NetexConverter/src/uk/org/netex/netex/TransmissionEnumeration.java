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
 * <p>Java-Klasse f�r TransmissionEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TransmissionEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="automatic"/>
 *     &lt;enumeration value="automatic4WheelDrive"/>
 *     &lt;enumeration value="manual"/>
 *     &lt;enumeration value="manual4WheelDrive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransmissionEnumeration")
@XmlEnum
public enum TransmissionEnumeration {

    @XmlEnumValue("automatic")
    AUTOMATIC("automatic"),
    @XmlEnumValue("automatic4WheelDrive")
    AUTOMATIC_4_WHEEL_DRIVE("automatic4WheelDrive"),
    @XmlEnumValue("manual")
    MANUAL("manual"),
    @XmlEnumValue("manual4WheelDrive")
    MANUAL_4_WHEEL_DRIVE("manual4WheelDrive");
    private final String value;

    TransmissionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransmissionEnumeration fromValue(String v) {
        for (TransmissionEnumeration c: TransmissionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
