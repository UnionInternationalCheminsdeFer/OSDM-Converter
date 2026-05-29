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
 * <p>Java-Klasse f�r NameOfClassNetworkRestrictionRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassNetworkRestrictionRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassAssignmentRefStructureType">
 *     &lt;enumeration value="MeetingRestriction"/>
 *     &lt;enumeration value="OvertakingPossibility"/>
 *     &lt;enumeration value="RestrictedManoeuvre"/>
 *     &lt;enumeration value="VehicleTypeAtPoint"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassNetworkRestrictionRefStructureType")
@XmlEnum(NameOfClassAssignmentRefStructureType.class)
public enum NameOfClassNetworkRestrictionRefStructureType {

    @XmlEnumValue("MeetingRestriction")
    MEETING_RESTRICTION(NameOfClassAssignmentRefStructureType.MEETING_RESTRICTION),
    @XmlEnumValue("OvertakingPossibility")
    OVERTAKING_POSSIBILITY(NameOfClassAssignmentRefStructureType.OVERTAKING_POSSIBILITY),
    @XmlEnumValue("RestrictedManoeuvre")
    RESTRICTED_MANOEUVRE(NameOfClassAssignmentRefStructureType.RESTRICTED_MANOEUVRE),
    @XmlEnumValue("VehicleTypeAtPoint")
    VEHICLE_TYPE_AT_POINT(NameOfClassAssignmentRefStructureType.VEHICLE_TYPE_AT_POINT);
    private final NameOfClassAssignmentRefStructureType value;

    NameOfClassNetworkRestrictionRefStructureType(NameOfClassAssignmentRefStructureType v) {
        value = v;
    }

    public NameOfClassAssignmentRefStructureType value() {
        return value;
    }

    public static NameOfClassNetworkRestrictionRefStructureType fromValue(NameOfClassAssignmentRefStructureType v) {
        for (NameOfClassNetworkRestrictionRefStructureType c: NameOfClassNetworkRestrictionRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
