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
 * <p>Java-Klasse f�r NuisanceFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NuisanceFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="smoking"/>
 *     &lt;enumeration value="noSmoking"/>
 *     &lt;enumeration value="familyArea"/>
 *     &lt;enumeration value="childfreeArea"/>
 *     &lt;enumeration value="animalsAllowed"/>
 *     &lt;enumeration value="noAnimals"/>
 *     &lt;enumeration value="breastfeedingFriendly"/>
 *     &lt;enumeration value="mobilePhoneUseZone"/>
 *     &lt;enumeration value="mobilePhoneFreeZone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NuisanceFacilityEnumeration")
@XmlEnum
public enum NuisanceFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("smoking")
    SMOKING("smoking"),
    @XmlEnumValue("noSmoking")
    NO_SMOKING("noSmoking"),
    @XmlEnumValue("familyArea")
    FAMILY_AREA("familyArea"),
    @XmlEnumValue("childfreeArea")
    CHILDFREE_AREA("childfreeArea"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("animalsAllowed")
    ANIMALS_ALLOWED("animalsAllowed"),
    @XmlEnumValue("noAnimals")
    NO_ANIMALS("noAnimals"),
    @XmlEnumValue("breastfeedingFriendly")
    BREASTFEEDING_FRIENDLY("breastfeedingFriendly"),
    @XmlEnumValue("mobilePhoneUseZone")
    MOBILE_PHONE_USE_ZONE("mobilePhoneUseZone"),
    @XmlEnumValue("mobilePhoneFreeZone")
    MOBILE_PHONE_FREE_ZONE("mobilePhoneFreeZone");
    private final String value;

    NuisanceFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NuisanceFacilityEnumeration fromValue(String v) {
        for (NuisanceFacilityEnumeration c: NuisanceFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
