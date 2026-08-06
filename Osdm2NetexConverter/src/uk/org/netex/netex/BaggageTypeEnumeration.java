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
 * <p>Java-Klasse f�r BaggageTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BaggageTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="handbag"/>
 *     &lt;enumeration value="handLuggage"/>
 *     &lt;enumeration value="smallSuitcase"/>
 *     &lt;enumeration value="suitcase"/>
 *     &lt;enumeration value="trunk"/>
 *     &lt;enumeration value="oversizeItem"/>
 *     &lt;enumeration value="bicycle"/>
 *     &lt;enumeration value="motorcycle"/>
 *     &lt;enumeration value="sportingEquipment"/>
 *     &lt;enumeration value="skis"/>
 *     &lt;enumeration value="musicalInstrument"/>
 *     &lt;enumeration value="pushChair"/>
 *     &lt;enumeration value="wheelchair"/>
 *     &lt;enumeration value="motorizedWheelchair"/>
 *     &lt;enumeration value="largeMotorizedWheelchair"/>
 *     &lt;enumeration value="smallAnimal"/>
 *     &lt;enumeration value="animal"/>
 *     &lt;enumeration value="game"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BaggageTypeEnumeration")
@XmlEnum
public enum BaggageTypeEnumeration {

    @XmlEnumValue("handbag")
    HANDBAG("handbag"),
    @XmlEnumValue("handLuggage")
    HAND_LUGGAGE("handLuggage"),
    @XmlEnumValue("smallSuitcase")
    SMALL_SUITCASE("smallSuitcase"),
    @XmlEnumValue("suitcase")
    SUITCASE("suitcase"),
    @XmlEnumValue("trunk")
    TRUNK("trunk"),
    @XmlEnumValue("oversizeItem")
    OVERSIZE_ITEM("oversizeItem"),
    @XmlEnumValue("bicycle")
    BICYCLE("bicycle"),
    @XmlEnumValue("motorcycle")
    MOTORCYCLE("motorcycle"),
    @XmlEnumValue("sportingEquipment")
    SPORTING_EQUIPMENT("sportingEquipment"),
    @XmlEnumValue("skis")
    SKIS("skis"),
    @XmlEnumValue("musicalInstrument")
    MUSICAL_INSTRUMENT("musicalInstrument"),
    @XmlEnumValue("pushChair")
    PUSH_CHAIR("pushChair"),
    @XmlEnumValue("wheelchair")
    WHEELCHAIR("wheelchair"),
    @XmlEnumValue("motorizedWheelchair")
    MOTORIZED_WHEELCHAIR("motorizedWheelchair"),
    @XmlEnumValue("largeMotorizedWheelchair")
    LARGE_MOTORIZED_WHEELCHAIR("largeMotorizedWheelchair"),
    @XmlEnumValue("smallAnimal")
    SMALL_ANIMAL("smallAnimal"),
    @XmlEnumValue("animal")
    ANIMAL("animal"),
    @XmlEnumValue("game")
    GAME("game"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    BaggageTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BaggageTypeEnumeration fromValue(String v) {
        for (BaggageTypeEnumeration c: BaggageTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
