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
 * <p>Java-Klasse f�r OnBecomingEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OnBecomingEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="automatic"/>
 *     &lt;enumeration value="invite"/>
 *     &lt;enumeration value="noAction"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OnBecomingEnumeration")
@XmlEnum
public enum OnBecomingEnumeration {


    /**
     * If user becomes eligible, automatically apply additional user profile benefits to user, e.g. apply student or senior discounts.
     * 
     */
    @XmlEnumValue("automatic")
    AUTOMATIC("automatic"),

    /**
     * If user becomes eligible, invite user to take up eligible products. e.g. Invite to buy Senior railcard.
     * 
     */
    @XmlEnumValue("invite")
    INVITE("invite"),

    /**
     * If user becomes eligible,, no automatic measures are taken.
     * 
     */
    @XmlEnumValue("noAction")
    NO_ACTION("noAction"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    OnBecomingEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OnBecomingEnumeration fromValue(String v) {
        for (OnBecomingEnumeration c: OnBecomingEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
