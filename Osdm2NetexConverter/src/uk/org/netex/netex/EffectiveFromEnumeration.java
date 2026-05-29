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
 * <p>Java-Klasse f�r EffectiveFromEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EffectiveFromEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="never"/>
 *     &lt;enumeration value="nextInterval"/>
 *     &lt;enumeration value="nextInstallment"/>
 *     &lt;enumeration value="anyTime"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EffectiveFromEnumeration")
@XmlEnum
public enum EffectiveFromEnumeration {

    @XmlEnumValue("never")
    NEVER("never"),
    @XmlEnumValue("nextInterval")
    NEXT_INTERVAL("nextInterval"),
    @XmlEnumValue("nextInstallment")
    NEXT_INSTALLMENT("nextInstallment"),
    @XmlEnumValue("anyTime")
    ANY_TIME("anyTime"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    EffectiveFromEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EffectiveFromEnumeration fromValue(String v) {
        for (EffectiveFromEnumeration c: EffectiveFromEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
