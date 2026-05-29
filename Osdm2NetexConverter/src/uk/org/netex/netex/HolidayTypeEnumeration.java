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
 * <p>Java-Klasse f�r HolidayTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="HolidayTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AnyDay"/>
 *     &lt;enumeration value="WorkingDay"/>
 *     &lt;enumeration value="SchoolDay"/>
 *     &lt;enumeration value="NotHoliday"/>
 *     &lt;enumeration value="NotWorkingDay"/>
 *     &lt;enumeration value="NotSchoolDay"/>
 *     &lt;enumeration value="AnyHoliday"/>
 *     &lt;enumeration value="LocalHoliday"/>
 *     &lt;enumeration value="RegionalHoliday"/>
 *     &lt;enumeration value="NationalHoliday"/>
 *     &lt;enumeration value="HolidayDisplacementDay"/>
 *     &lt;enumeration value="EveOfHoliday"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HolidayTypeEnumeration")
@XmlEnum
public enum HolidayTypeEnumeration {

    @XmlEnumValue("AnyDay")
    ANY_DAY("AnyDay"),
    @XmlEnumValue("WorkingDay")
    WORKING_DAY("WorkingDay"),
    @XmlEnumValue("SchoolDay")
    SCHOOL_DAY("SchoolDay"),
    @XmlEnumValue("NotHoliday")
    NOT_HOLIDAY("NotHoliday"),
    @XmlEnumValue("NotWorkingDay")
    NOT_WORKING_DAY("NotWorkingDay"),
    @XmlEnumValue("NotSchoolDay")
    NOT_SCHOOL_DAY("NotSchoolDay"),
    @XmlEnumValue("AnyHoliday")
    ANY_HOLIDAY("AnyHoliday"),
    @XmlEnumValue("LocalHoliday")
    LOCAL_HOLIDAY("LocalHoliday"),
    @XmlEnumValue("RegionalHoliday")
    REGIONAL_HOLIDAY("RegionalHoliday"),
    @XmlEnumValue("NationalHoliday")
    NATIONAL_HOLIDAY("NationalHoliday"),
    @XmlEnumValue("HolidayDisplacementDay")
    HOLIDAY_DISPLACEMENT_DAY("HolidayDisplacementDay"),
    @XmlEnumValue("EveOfHoliday")
    EVE_OF_HOLIDAY("EveOfHoliday");
    private final String value;

    HolidayTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HolidayTypeEnumeration fromValue(String v) {
        for (HolidayTypeEnumeration c: HolidayTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
