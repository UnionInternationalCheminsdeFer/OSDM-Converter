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
 * <p>Java-Klasse f�r MoneyServiceEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MoneyServiceEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cashMachine"/>
 *     &lt;enumeration value="bank"/>
 *     &lt;enumeration value="insurance"/>
 *     &lt;enumeration value="bureauDeChange"/>
 *     &lt;enumeration value="customsOffice"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MoneyServiceEnumeration")
@XmlEnum
public enum MoneyServiceEnumeration {

    @XmlEnumValue("cashMachine")
    CASH_MACHINE("cashMachine"),
    @XmlEnumValue("bank")
    BANK("bank"),
    @XmlEnumValue("insurance")
    INSURANCE("insurance"),
    @XmlEnumValue("bureauDeChange")
    BUREAU_DE_CHANGE("bureauDeChange"),
    @XmlEnumValue("customsOffice")
    CUSTOMS_OFFICE("customsOffice");
    private final String value;

    MoneyServiceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MoneyServiceEnumeration fromValue(String v) {
        for (MoneyServiceEnumeration c: MoneyServiceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
