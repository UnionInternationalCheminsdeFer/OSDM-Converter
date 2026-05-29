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
 * <p>Java-Klasse f�r NameOfClassAdministrativeZoneRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassAdministrativeZoneRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassZoneRefStructureType">
 *     &lt;enumeration value="AdministrativeZone"/>
 *     &lt;enumeration value="TransportAdministrativeZone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassAdministrativeZoneRefStructureType")
@XmlEnum(NameOfClassZoneRefStructureType.class)
public enum NameOfClassAdministrativeZoneRefStructureType {

    @XmlEnumValue("AdministrativeZone")
    ADMINISTRATIVE_ZONE(NameOfClassZoneRefStructureType.ADMINISTRATIVE_ZONE),
    @XmlEnumValue("TransportAdministrativeZone")
    TRANSPORT_ADMINISTRATIVE_ZONE(NameOfClassZoneRefStructureType.TRANSPORT_ADMINISTRATIVE_ZONE);
    private final NameOfClassZoneRefStructureType value;

    NameOfClassAdministrativeZoneRefStructureType(NameOfClassZoneRefStructureType v) {
        value = v;
    }

    public NameOfClassZoneRefStructureType value() {
        return value;
    }

    public static NameOfClassAdministrativeZoneRefStructureType fromValue(NameOfClassZoneRefStructureType v) {
        for (NameOfClassAdministrativeZoneRefStructureType c: NameOfClassAdministrativeZoneRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
