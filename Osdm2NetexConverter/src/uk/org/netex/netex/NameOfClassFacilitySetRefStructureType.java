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
 * <p>Java-Klasse f�r NameOfClassFacilitySetRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassFacilitySetRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="RestrictedServiceFacilitySet"/>
 *     &lt;enumeration value="ServiceFacilitySet"/>
 *     &lt;enumeration value="SiteFacilitySet"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassFacilitySetRefStructureType")
@XmlEnum
public enum NameOfClassFacilitySetRefStructureType {

    @XmlEnumValue("RestrictedServiceFacilitySet")
    RESTRICTED_SERVICE_FACILITY_SET("RestrictedServiceFacilitySet"),
    @XmlEnumValue("ServiceFacilitySet")
    SERVICE_FACILITY_SET("ServiceFacilitySet"),
    @XmlEnumValue("SiteFacilitySet")
    SITE_FACILITY_SET("SiteFacilitySet");
    private final String value;

    NameOfClassFacilitySetRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassFacilitySetRefStructureType fromValue(String v) {
        for (NameOfClassFacilitySetRefStructureType c: NameOfClassFacilitySetRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
