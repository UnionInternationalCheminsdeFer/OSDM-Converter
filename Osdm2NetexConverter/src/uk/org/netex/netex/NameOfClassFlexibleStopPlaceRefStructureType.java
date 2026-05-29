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
 * <p>Java-Klasse f�r NameOfClassFlexibleStopPlaceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassFlexibleStopPlaceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassPlaceRefStructureType">
 *     &lt;enumeration value="FlexibleStopPlace"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassFlexibleStopPlaceRefStructureType")
@XmlEnum(NameOfClassPlaceRefStructureType.class)
public enum NameOfClassFlexibleStopPlaceRefStructureType {

    @XmlEnumValue("FlexibleStopPlace")
    FLEXIBLE_STOP_PLACE(NameOfClassPlaceRefStructureType.FLEXIBLE_STOP_PLACE);
    private final NameOfClassPlaceRefStructureType value;

    NameOfClassFlexibleStopPlaceRefStructureType(NameOfClassPlaceRefStructureType v) {
        value = v;
    }

    public NameOfClassPlaceRefStructureType value() {
        return value;
    }

    public static NameOfClassFlexibleStopPlaceRefStructureType fromValue(NameOfClassPlaceRefStructureType v) {
        for (NameOfClassFlexibleStopPlaceRefStructureType c: NameOfClassFlexibleStopPlaceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
