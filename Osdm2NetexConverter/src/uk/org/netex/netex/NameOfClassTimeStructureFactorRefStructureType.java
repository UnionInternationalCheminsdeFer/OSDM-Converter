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
 * <p>Java-Klasse f�r NameOfClassTimeStructureFactorRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassTimeStructureFactorRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassFareStructureFactorRefStructureType">
 *     &lt;enumeration value="ParkingChargeBand"/>
 *     &lt;enumeration value="TimeStructureFactor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassTimeStructureFactorRefStructureType")
@XmlEnum(NameOfClassFareStructureFactorRefStructureType.class)
public enum NameOfClassTimeStructureFactorRefStructureType {

    @XmlEnumValue("ParkingChargeBand")
    PARKING_CHARGE_BAND(NameOfClassFareStructureFactorRefStructureType.PARKING_CHARGE_BAND),
    @XmlEnumValue("TimeStructureFactor")
    TIME_STRUCTURE_FACTOR(NameOfClassFareStructureFactorRefStructureType.TIME_STRUCTURE_FACTOR);
    private final NameOfClassFareStructureFactorRefStructureType value;

    NameOfClassTimeStructureFactorRefStructureType(NameOfClassFareStructureFactorRefStructureType v) {
        value = v;
    }

    public NameOfClassFareStructureFactorRefStructureType value() {
        return value;
    }

    public static NameOfClassTimeStructureFactorRefStructureType fromValue(NameOfClassFareStructureFactorRefStructureType v) {
        for (NameOfClassTimeStructureFactorRefStructureType c: NameOfClassTimeStructureFactorRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
