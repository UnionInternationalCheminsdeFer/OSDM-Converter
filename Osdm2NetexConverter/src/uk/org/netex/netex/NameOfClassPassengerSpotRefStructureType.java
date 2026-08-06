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
 * <p>Java-Klasse f�r NameOfClassPassengerSpotRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassPassengerSpotRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassLocatableSpotRefStructureType">
 *     &lt;enumeration value="PassengerSpot"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassPassengerSpotRefStructureType")
@XmlEnum(NameOfClassLocatableSpotRefStructureType.class)
public enum NameOfClassPassengerSpotRefStructureType {

    @XmlEnumValue("PassengerSpot")
    PASSENGER_SPOT(NameOfClassLocatableSpotRefStructureType.PASSENGER_SPOT);
    private final NameOfClassLocatableSpotRefStructureType value;

    NameOfClassPassengerSpotRefStructureType(NameOfClassLocatableSpotRefStructureType v) {
        value = v;
    }

    public NameOfClassLocatableSpotRefStructureType value() {
        return value;
    }

    public static NameOfClassPassengerSpotRefStructureType fromValue(NameOfClassLocatableSpotRefStructureType v) {
        for (NameOfClassPassengerSpotRefStructureType c: NameOfClassPassengerSpotRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
