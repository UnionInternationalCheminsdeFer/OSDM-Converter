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
 * <p>Java-Klasse f�r NameOfClassFareZoneRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassFareZoneRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassTariffZoneRefStructureType">
 *     &lt;enumeration value="FareZone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassFareZoneRefStructureType")
@XmlEnum(NameOfClassTariffZoneRefStructureType.class)
public enum NameOfClassFareZoneRefStructureType {

    @XmlEnumValue("FareZone")
    FARE_ZONE(NameOfClassTariffZoneRefStructureType.FARE_ZONE);
    private final NameOfClassTariffZoneRefStructureType value;

    NameOfClassFareZoneRefStructureType(NameOfClassTariffZoneRefStructureType v) {
        value = v;
    }

    public NameOfClassTariffZoneRefStructureType value() {
        return value;
    }

    public static NameOfClassFareZoneRefStructureType fromValue(NameOfClassTariffZoneRefStructureType v) {
        for (NameOfClassFareZoneRefStructureType c: NameOfClassFareZoneRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
