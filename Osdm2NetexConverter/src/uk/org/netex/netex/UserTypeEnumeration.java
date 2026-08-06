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
 * <p>Java-Klasse f�r UserTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="UserTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="adult"/>
 *     &lt;enumeration value="child"/>
 *     &lt;enumeration value="infant"/>
 *     &lt;enumeration value="senior"/>
 *     &lt;enumeration value="student"/>
 *     &lt;enumeration value="youngPerson"/>
 *     &lt;enumeration value="schoolPupil"/>
 *     &lt;enumeration value="military"/>
 *     &lt;enumeration value="veteran"/>
 *     &lt;enumeration value="disabled"/>
 *     &lt;enumeration value="disabledCompanion"/>
 *     &lt;enumeration value="jobSeeker"/>
 *     &lt;enumeration value="employee"/>
 *     &lt;enumeration value="animal"/>
 *     &lt;enumeration value="guideDog"/>
 *     &lt;enumeration value="member"/>
 *     &lt;enumeration value="resident"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="anyone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserTypeEnumeration")
@XmlEnum
public enum UserTypeEnumeration {

    @XmlEnumValue("adult")
    ADULT("adult"),
    @XmlEnumValue("child")
    CHILD("child"),
    @XmlEnumValue("infant")
    INFANT("infant"),
    @XmlEnumValue("senior")
    SENIOR("senior"),
    @XmlEnumValue("student")
    STUDENT("student"),
    @XmlEnumValue("youngPerson")
    YOUNG_PERSON("youngPerson"),
    @XmlEnumValue("schoolPupil")
    SCHOOL_PUPIL("schoolPupil"),
    @XmlEnumValue("military")
    MILITARY("military"),
    @XmlEnumValue("veteran")
    VETERAN("veteran"),
    @XmlEnumValue("disabled")
    DISABLED("disabled"),
    @XmlEnumValue("disabledCompanion")
    DISABLED_COMPANION("disabledCompanion"),
    @XmlEnumValue("jobSeeker")
    JOB_SEEKER("jobSeeker"),
    @XmlEnumValue("employee")
    EMPLOYEE("employee"),
    @XmlEnumValue("animal")
    ANIMAL("animal"),
    @XmlEnumValue("guideDog")
    GUIDE_DOG("guideDog"),
    @XmlEnumValue("member")
    MEMBER("member"),
    @XmlEnumValue("resident")
    RESIDENT("resident"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("anyone")
    ANYONE("anyone");
    private final String value;

    UserTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserTypeEnumeration fromValue(String v) {
        for (UserTypeEnumeration c: UserTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
