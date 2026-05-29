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
 * <p>Java-Klasse f�r NameOfClassFareDayTypeRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassFareDayTypeRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassDayTypeRefStructureType">
 *     &lt;enumeration value="FareDayType"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassFareDayTypeRefStructureType")
@XmlEnum(NameOfClassDayTypeRefStructureType.class)
public enum NameOfClassFareDayTypeRefStructureType {

    @XmlEnumValue("FareDayType")
    FARE_DAY_TYPE(NameOfClassDayTypeRefStructureType.FARE_DAY_TYPE);
    private final NameOfClassDayTypeRefStructureType value;

    NameOfClassFareDayTypeRefStructureType(NameOfClassDayTypeRefStructureType v) {
        value = v;
    }

    public NameOfClassDayTypeRefStructureType value() {
        return value;
    }

    public static NameOfClassFareDayTypeRefStructureType fromValue(NameOfClassDayTypeRefStructureType v) {
        for (NameOfClassFareDayTypeRefStructureType c: NameOfClassFareDayTypeRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
