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
 * <p>Java-Klasse f�r ContractTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ContractTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="formal"/>
 *     &lt;enumeration value="informal"/>
 *     &lt;enumeration value="written"/>
 *     &lt;enumeration value="oral"/>
 *     &lt;enumeration value="plainUnderstood"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContractTypeEnumeration")
@XmlEnum
public enum ContractTypeEnumeration {

    @XmlEnumValue("formal")
    FORMAL("formal"),
    @XmlEnumValue("informal")
    INFORMAL("informal"),
    @XmlEnumValue("written")
    WRITTEN("written"),
    @XmlEnumValue("oral")
    ORAL("oral"),
    @XmlEnumValue("plainUnderstood")
    PLAIN_UNDERSTOOD("plainUnderstood");
    private final String value;

    ContractTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContractTypeEnumeration fromValue(String v) {
        for (ContractTypeEnumeration c: ContractTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
