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
 * <p>Java-Klasse f�r MoneyFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MoneyFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="cashMachine"/>
 *     &lt;enumeration value="bank"/>
 *     &lt;enumeration value="insurance"/>
 *     &lt;enumeration value="bureauDeChange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MoneyFacilityEnumeration")
@XmlEnum
public enum MoneyFacilityEnumeration {

    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("cashMachine")
    CASH_MACHINE("cashMachine"),
    @XmlEnumValue("bank")
    BANK("bank"),
    @XmlEnumValue("insurance")
    INSURANCE("insurance"),
    @XmlEnumValue("bureauDeChange")
    BUREAU_DE_CHANGE("bureauDeChange");
    private final String value;

    MoneyFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MoneyFacilityEnumeration fromValue(String v) {
        for (MoneyFacilityEnumeration c: MoneyFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
