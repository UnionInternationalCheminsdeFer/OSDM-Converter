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
 * <p>Java-Klasse f�r NameOfClassMobilityServiceConstraintZoneRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassMobilityServiceConstraintZoneRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassZoneRefStructureType">
 *     &lt;enumeration value="MobilityServiceConstraintZone"/>
 *     &lt;enumeration value="Zone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassMobilityServiceConstraintZoneRefStructureType")
@XmlEnum(NameOfClassZoneRefStructureType.class)
public enum NameOfClassMobilityServiceConstraintZoneRefStructureType {

    @XmlEnumValue("MobilityServiceConstraintZone")
    MOBILITY_SERVICE_CONSTRAINT_ZONE(NameOfClassZoneRefStructureType.MOBILITY_SERVICE_CONSTRAINT_ZONE),
    @XmlEnumValue("Zone")
    ZONE(NameOfClassZoneRefStructureType.ZONE);
    private final NameOfClassZoneRefStructureType value;

    NameOfClassMobilityServiceConstraintZoneRefStructureType(NameOfClassZoneRefStructureType v) {
        value = v;
    }

    public NameOfClassZoneRefStructureType value() {
        return value;
    }

    public static NameOfClassMobilityServiceConstraintZoneRefStructureType fromValue(NameOfClassZoneRefStructureType v) {
        for (NameOfClassMobilityServiceConstraintZoneRefStructureType c: NameOfClassMobilityServiceConstraintZoneRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
