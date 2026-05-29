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
 * <p>Java-Klasse f�r OperatorRestrictionsEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatorRestrictionsEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="anyTrain"/>
 *     &lt;enumeration value="restricted"/>
 *     &lt;enumeration value="specifiedOperatorOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperatorRestrictionsEnumeration")
@XmlEnum
public enum OperatorRestrictionsEnumeration {

    @XmlEnumValue("anyTrain")
    ANY_TRAIN("anyTrain"),
    @XmlEnumValue("restricted")
    RESTRICTED("restricted"),
    @XmlEnumValue("specifiedOperatorOnly")
    SPECIFIED_OPERATOR_ONLY("specifiedOperatorOnly");
    private final String value;

    OperatorRestrictionsEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperatorRestrictionsEnumeration fromValue(String v) {
        for (OperatorRestrictionsEnumeration c: OperatorRestrictionsEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
