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
 * <p>Java-Klasse f�r LanguageUseEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LanguageUseEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="normallyUsed"/>
 *     &lt;enumeration value="understood"/>
 *     &lt;enumeration value="native"/>
 *     &lt;enumeration value="spoken"/>
 *     &lt;enumeration value="written"/>
 *     &lt;enumeration value="read"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="allUses"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LanguageUseEnumeration")
@XmlEnum
public enum LanguageUseEnumeration {

    @XmlEnumValue("normallyUsed")
    NORMALLY_USED("normallyUsed"),
    @XmlEnumValue("understood")
    UNDERSTOOD("understood"),
    @XmlEnumValue("native")
    NATIVE("native"),
    @XmlEnumValue("spoken")
    SPOKEN("spoken"),
    @XmlEnumValue("written")
    WRITTEN("written"),
    @XmlEnumValue("read")
    READ("read"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("allUses")
    ALL_USES("allUses");
    private final String value;

    LanguageUseEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LanguageUseEnumeration fromValue(String v) {
        for (LanguageUseEnumeration c: LanguageUseEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
