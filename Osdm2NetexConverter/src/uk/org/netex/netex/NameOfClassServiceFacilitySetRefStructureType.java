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
 * <p>Java-Klasse f�r NameOfClassServiceFacilitySetRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassServiceFacilitySetRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassFacilitySetRefStructureType">
 *     &lt;enumeration value="RestrictedServiceFacilitySet"/>
 *     &lt;enumeration value="ServiceFacilitySet"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassServiceFacilitySetRefStructureType")
@XmlEnum(NameOfClassFacilitySetRefStructureType.class)
public enum NameOfClassServiceFacilitySetRefStructureType {

    @XmlEnumValue("RestrictedServiceFacilitySet")
    RESTRICTED_SERVICE_FACILITY_SET(NameOfClassFacilitySetRefStructureType.RESTRICTED_SERVICE_FACILITY_SET),
    @XmlEnumValue("ServiceFacilitySet")
    SERVICE_FACILITY_SET(NameOfClassFacilitySetRefStructureType.SERVICE_FACILITY_SET);
    private final NameOfClassFacilitySetRefStructureType value;

    NameOfClassServiceFacilitySetRefStructureType(NameOfClassFacilitySetRefStructureType v) {
        value = v;
    }

    public NameOfClassFacilitySetRefStructureType value() {
        return value;
    }

    public static NameOfClassServiceFacilitySetRefStructureType fromValue(NameOfClassFacilitySetRefStructureType v) {
        for (NameOfClassServiceFacilitySetRefStructureType c: NameOfClassServiceFacilitySetRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
