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
 * <p>Java-Klasse f�r NameOfClassTaxiParkingAreaRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassTaxiParkingAreaRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassParkingAreaRefStructureType">
 *     &lt;enumeration value="TaxiParkingArea"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassTaxiParkingAreaRefStructureType")
@XmlEnum(NameOfClassParkingAreaRefStructureType.class)
public enum NameOfClassTaxiParkingAreaRefStructureType {

    @XmlEnumValue("TaxiParkingArea")
    TAXI_PARKING_AREA(NameOfClassParkingAreaRefStructureType.TAXI_PARKING_AREA);
    private final NameOfClassParkingAreaRefStructureType value;

    NameOfClassTaxiParkingAreaRefStructureType(NameOfClassParkingAreaRefStructureType v) {
        value = v;
    }

    public NameOfClassParkingAreaRefStructureType value() {
        return value;
    }

    public static NameOfClassTaxiParkingAreaRefStructureType fromValue(NameOfClassParkingAreaRefStructureType v) {
        for (NameOfClassTaxiParkingAreaRefStructureType c: NameOfClassTaxiParkingAreaRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
