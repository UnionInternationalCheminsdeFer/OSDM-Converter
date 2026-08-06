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
 * <p>Java-Klasse f�r FamilyFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FamilyFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="servicesForChildren"/>
 *     &lt;enumeration value="servicesForArmyFamilies"/>
 *     &lt;enumeration value="nurseryService"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FamilyFacilityEnumeration")
@XmlEnum
public enum FamilyFacilityEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("servicesForChildren")
    SERVICES_FOR_CHILDREN("servicesForChildren"),
    @XmlEnumValue("servicesForArmyFamilies")
    SERVICES_FOR_ARMY_FAMILIES("servicesForArmyFamilies"),
    @XmlEnumValue("nurseryService")
    NURSERY_SERVICE("nurseryService");
    private final String value;

    FamilyFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FamilyFacilityEnumeration fromValue(String v) {
        for (FamilyFacilityEnumeration c: FamilyFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
