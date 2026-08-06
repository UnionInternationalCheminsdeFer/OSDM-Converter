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
 * <p>Java-Klasse f�r RefundPolicyEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RefundPolicyEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="any"/>
 *     &lt;enumeration value="illness"/>
 *     &lt;enumeration value="death"/>
 *     &lt;enumeration value="maternity"/>
 *     &lt;enumeration value="redundancy"/>
 *     &lt;enumeration value="changeOfEmployment"/>
 *     &lt;enumeration value="changeOfResidence"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RefundPolicyEnumeration")
@XmlEnum
public enum RefundPolicyEnumeration {

    @XmlEnumValue("any")
    ANY("any"),
    @XmlEnumValue("illness")
    ILLNESS("illness"),
    @XmlEnumValue("death")
    DEATH("death"),
    @XmlEnumValue("maternity")
    MATERNITY("maternity"),
    @XmlEnumValue("redundancy")
    REDUNDANCY("redundancy"),
    @XmlEnumValue("changeOfEmployment")
    CHANGE_OF_EMPLOYMENT("changeOfEmployment"),
    @XmlEnumValue("changeOfResidence")
    CHANGE_OF_RESIDENCE("changeOfResidence"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    RefundPolicyEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundPolicyEnumeration fromValue(String v) {
        for (RefundPolicyEnumeration c: RefundPolicyEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
