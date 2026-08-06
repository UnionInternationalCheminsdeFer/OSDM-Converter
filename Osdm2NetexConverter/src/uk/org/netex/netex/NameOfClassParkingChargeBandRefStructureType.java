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
 * <p>Java-Klasse f�r NameOfClassParkingChargeBandRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassParkingChargeBandRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassTimeStructureFactorRefStructureType">
 *     &lt;enumeration value="ParkingChargeBand"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassParkingChargeBandRefStructureType")
@XmlEnum(NameOfClassTimeStructureFactorRefStructureType.class)
public enum NameOfClassParkingChargeBandRefStructureType {

    @XmlEnumValue("ParkingChargeBand")
    PARKING_CHARGE_BAND(NameOfClassTimeStructureFactorRefStructureType.PARKING_CHARGE_BAND);
    private final NameOfClassTimeStructureFactorRefStructureType value;

    NameOfClassParkingChargeBandRefStructureType(NameOfClassTimeStructureFactorRefStructureType v) {
        value = v;
    }

    public NameOfClassTimeStructureFactorRefStructureType value() {
        return value;
    }

    public static NameOfClassParkingChargeBandRefStructureType fromValue(NameOfClassTimeStructureFactorRefStructureType v) {
        for (NameOfClassParkingChargeBandRefStructureType c: NameOfClassParkingChargeBandRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
