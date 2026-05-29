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
 * <p>Java-Klasse f�r EntranceAttentionEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EntranceAttentionEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="doorbell"/>
 *     &lt;enumeration value="helpPoint"/>
 *     &lt;enumeration value="intercom"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntranceAttentionEnumeration")
@XmlEnum
public enum EntranceAttentionEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("doorbell")
    DOORBELL("doorbell"),
    @XmlEnumValue("helpPoint")
    HELP_POINT("helpPoint"),
    @XmlEnumValue("intercom")
    INTERCOM("intercom"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    EntranceAttentionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntranceAttentionEnumeration fromValue(String v) {
        for (EntranceAttentionEnumeration c: EntranceAttentionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
