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
 * <p>Java-Klasse f�r EntranceSettingEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EntranceSettingEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="open"/>
 *     &lt;enumeration value="shut"/>
 *     &lt;enumeration value="lockedShut"/>
 *     &lt;enumeration value="openWhenLoading"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntranceSettingEnumeration")
@XmlEnum
public enum EntranceSettingEnumeration {

    @XmlEnumValue("open")
    OPEN("open"),
    @XmlEnumValue("shut")
    SHUT("shut"),
    @XmlEnumValue("lockedShut")
    LOCKED_SHUT("lockedShut"),
    @XmlEnumValue("openWhenLoading")
    OPEN_WHEN_LOADING("openWhenLoading");
    private final String value;

    EntranceSettingEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntranceSettingEnumeration fromValue(String v) {
        for (EntranceSettingEnumeration c: EntranceSettingEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
