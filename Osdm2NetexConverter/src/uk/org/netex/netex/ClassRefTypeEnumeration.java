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
 * <p>Java-Klasse f�r ClassRefTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ClassRefTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="members"/>
 *     &lt;enumeration value="memberReferences"/>
 *     &lt;enumeration value="all"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClassRefTypeEnumeration")
@XmlEnum
public enum ClassRefTypeEnumeration {


    /**
     * Include elements that meet selection criteria (e.g. validity condition).
     * 
     */
    @XmlEnumValue("members")
    MEMBERS("members"),

    /**
     * Include elements that are referenced by primary element. E.g. TYPES OF VALUE, OPERATOR etc.
     * 
     */
    @XmlEnumValue("memberReferences")
    MEMBER_REFERENCES("memberReferences"),

    /**
     * Include all elements.
     * 
     */
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    ClassRefTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClassRefTypeEnumeration fromValue(String v) {
        for (ClassRefTypeEnumeration c: ClassRefTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
