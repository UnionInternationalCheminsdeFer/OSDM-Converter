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
 * <p>Java-Klasse f�r SystemOfUnits.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SystemOfUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="SiMetres"/>
 *     &lt;enumeration value="SiKilometresAndMetres"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SystemOfUnits")
@XmlEnum
public enum SystemOfUnits {


    /**
     * All measurements are SI metric. 
     * Distance = Metres
     * Length = Metres
     * Weight = Kilos
     * Speed = Metres per second.
     * 
     */
    @XmlEnumValue("SiMetres")
    SI_METRES("SiMetres"),

    /**
     * All measurements are SI 
     * Distance = Kilometres
     * Length = Metres
     * Weight = Kilos
     * Speed = Metres per second.
     * 
     */
    @XmlEnumValue("SiKilometresAndMetres")
    SI_KILOMETRES_AND_METRES("SiKilometresAndMetres"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SystemOfUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SystemOfUnits fromValue(String v) {
        for (SystemOfUnits c: SystemOfUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
