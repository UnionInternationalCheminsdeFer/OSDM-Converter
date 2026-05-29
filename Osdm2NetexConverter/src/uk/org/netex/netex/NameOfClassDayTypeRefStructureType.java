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
 * <p>Java-Klasse f�r NameOfClassDayTypeRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassDayTypeRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="DayType"/>
 *     &lt;enumeration value="FareDayType"/>
 *     &lt;enumeration value="OrganisationDayType"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassDayTypeRefStructureType")
@XmlEnum
public enum NameOfClassDayTypeRefStructureType {

    @XmlEnumValue("DayType")
    DAY_TYPE("DayType"),
    @XmlEnumValue("FareDayType")
    FARE_DAY_TYPE("FareDayType"),
    @XmlEnumValue("OrganisationDayType")
    ORGANISATION_DAY_TYPE("OrganisationDayType");
    private final String value;

    NameOfClassDayTypeRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassDayTypeRefStructureType fromValue(String v) {
        for (NameOfClassDayTypeRefStructureType c: NameOfClassDayTypeRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
