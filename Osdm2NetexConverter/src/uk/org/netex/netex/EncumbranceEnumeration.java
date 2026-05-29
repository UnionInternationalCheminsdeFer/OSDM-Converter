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
 * <p>Java-Klasse f�r EncumbranceEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EncumbranceEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="luggageEncumbered"/>
 *     &lt;enumeration value="pushchair"/>
 *     &lt;enumeration value="baggageTrolley"/>
 *     &lt;enumeration value="oversizeBaggage"/>
 *     &lt;enumeration value="guideDog"/>
 *     &lt;enumeration value="otherAnimal"/>
 *     &lt;enumeration value="otherEncumbranceNeed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EncumbranceEnumeration")
@XmlEnum
public enum EncumbranceEnumeration {

    @XmlEnumValue("luggageEncumbered")
    LUGGAGE_ENCUMBERED("luggageEncumbered"),
    @XmlEnumValue("pushchair")
    PUSHCHAIR("pushchair"),
    @XmlEnumValue("baggageTrolley")
    BAGGAGE_TROLLEY("baggageTrolley"),
    @XmlEnumValue("oversizeBaggage")
    OVERSIZE_BAGGAGE("oversizeBaggage"),
    @XmlEnumValue("guideDog")
    GUIDE_DOG("guideDog"),
    @XmlEnumValue("otherAnimal")
    OTHER_ANIMAL("otherAnimal"),
    @XmlEnumValue("otherEncumbranceNeed")
    OTHER_ENCUMBRANCE_NEED("otherEncumbranceNeed");
    private final String value;

    EncumbranceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EncumbranceEnumeration fromValue(String v) {
        for (EncumbranceEnumeration c: EncumbranceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
