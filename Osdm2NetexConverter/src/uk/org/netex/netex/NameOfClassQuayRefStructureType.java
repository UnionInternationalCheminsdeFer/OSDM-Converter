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
 * <p>Java-Klasse f�r NameOfClassQuayRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassQuayRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassStopPlaceSpaceRefStructureType">
 *     &lt;enumeration value="Quay"/>
 *     &lt;enumeration value="TaxiStand"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassQuayRefStructureType")
@XmlEnum(NameOfClassStopPlaceSpaceRefStructureType.class)
public enum NameOfClassQuayRefStructureType {

    @XmlEnumValue("Quay")
    QUAY(NameOfClassStopPlaceSpaceRefStructureType.QUAY),
    @XmlEnumValue("TaxiStand")
    TAXI_STAND(NameOfClassStopPlaceSpaceRefStructureType.TAXI_STAND);
    private final NameOfClassStopPlaceSpaceRefStructureType value;

    NameOfClassQuayRefStructureType(NameOfClassStopPlaceSpaceRefStructureType v) {
        value = v;
    }

    public NameOfClassStopPlaceSpaceRefStructureType value() {
        return value;
    }

    public static NameOfClassQuayRefStructureType fromValue(NameOfClassStopPlaceSpaceRefStructureType v) {
        for (NameOfClassQuayRefStructureType c: NameOfClassQuayRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
