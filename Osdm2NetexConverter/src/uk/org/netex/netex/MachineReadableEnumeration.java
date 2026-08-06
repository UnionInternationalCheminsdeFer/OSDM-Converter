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
 * <p>Java-Klasse f�r MachineReadableEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MachineReadableEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="magneticStrip"/>
 *     &lt;enumeration value="chip"/>
 *     &lt;enumeration value="ocr"/>
 *     &lt;enumeration value="anpr"/>
 *     &lt;enumeration value="barCode"/>
 *     &lt;enumeration value="qrCode"/>
 *     &lt;enumeration value="shotCode"/>
 *     &lt;enumeration value="nfc"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MachineReadableEnumeration")
@XmlEnum
public enum MachineReadableEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("magneticStrip")
    MAGNETIC_STRIP("magneticStrip"),
    @XmlEnumValue("chip")
    CHIP("chip"),
    @XmlEnumValue("ocr")
    OCR("ocr"),

    /**
     * Automatic Number Plate Recognition +v1.2.2
     * 
     */
    @XmlEnumValue("anpr")
    ANPR("anpr"),
    @XmlEnumValue("barCode")
    BAR_CODE("barCode"),
    @XmlEnumValue("qrCode")
    QR_CODE("qrCode"),
    @XmlEnumValue("shotCode")
    SHOT_CODE("shotCode"),
    @XmlEnumValue("nfc")
    NFC("nfc"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    MachineReadableEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MachineReadableEnumeration fromValue(String v) {
        for (MachineReadableEnumeration c: MachineReadableEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
