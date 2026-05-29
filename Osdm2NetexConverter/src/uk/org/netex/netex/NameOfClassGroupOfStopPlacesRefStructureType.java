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
 * <p>Java-Klasse f�r NameOfClassGroupOfStopPlacesRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassGroupOfStopPlacesRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassGroupOfEntitiesRefStructureType">
 *     &lt;enumeration value="GroupOfStopPlaces"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassGroupOfStopPlacesRefStructureType")
@XmlEnum(NameOfClassGroupOfEntitiesRefStructureType.class)
public enum NameOfClassGroupOfStopPlacesRefStructureType {

    @XmlEnumValue("GroupOfStopPlaces")
    GROUP_OF_STOP_PLACES(NameOfClassGroupOfEntitiesRefStructureType.GROUP_OF_STOP_PLACES);
    private final NameOfClassGroupOfEntitiesRefStructureType value;

    NameOfClassGroupOfStopPlacesRefStructureType(NameOfClassGroupOfEntitiesRefStructureType v) {
        value = v;
    }

    public NameOfClassGroupOfEntitiesRefStructureType value() {
        return value;
    }

    public static NameOfClassGroupOfStopPlacesRefStructureType fromValue(NameOfClassGroupOfEntitiesRefStructureType v) {
        for (NameOfClassGroupOfStopPlacesRefStructureType c: NameOfClassGroupOfStopPlacesRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
