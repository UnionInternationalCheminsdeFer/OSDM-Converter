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
 * <p>Java-Klasse f�r NameOfClassRechargingBayRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassRechargingBayRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassParkingBayRefStructureType">
 *     &lt;enumeration value="RechargingBay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassRechargingBayRefStructureType")
@XmlEnum(NameOfClassParkingBayRefStructureType.class)
public enum NameOfClassRechargingBayRefStructureType {

    @XmlEnumValue("RechargingBay")
    RECHARGING_BAY(NameOfClassParkingBayRefStructureType.RECHARGING_BAY);
    private final NameOfClassParkingBayRefStructureType value;

    NameOfClassRechargingBayRefStructureType(NameOfClassParkingBayRefStructureType v) {
        value = v;
    }

    public NameOfClassParkingBayRefStructureType value() {
        return value;
    }

    public static NameOfClassRechargingBayRefStructureType fromValue(NameOfClassParkingBayRefStructureType v) {
        for (NameOfClassRechargingBayRefStructureType c: NameOfClassRechargingBayRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
