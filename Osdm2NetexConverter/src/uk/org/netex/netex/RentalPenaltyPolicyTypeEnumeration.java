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
 * <p>Java-Klasse f�r RentalPenaltyPolicyTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RentalPenaltyPolicyTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="refuelling"/>
 *     &lt;enumeration value="vehicleTransfer"/>
 *     &lt;enumeration value="lateVehicleReturn"/>
 *     &lt;enumeration value="noVehicleReturn"/>
 *     &lt;enumeration value="damageToVehicle"/>
 *     &lt;enumeration value="damageToEquipment"/>
 *     &lt;enumeration value="lossOfEquipment"/>
 *     &lt;enumeration value="zoneTransgression"/>
 *     &lt;enumeration value="trafficFine"/>
 *     &lt;enumeration value="handlingFeeForFine"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RentalPenaltyPolicyTypeEnumeration")
@XmlEnum
public enum RentalPenaltyPolicyTypeEnumeration {

    @XmlEnumValue("refuelling")
    REFUELLING("refuelling"),
    @XmlEnumValue("vehicleTransfer")
    VEHICLE_TRANSFER("vehicleTransfer"),
    @XmlEnumValue("lateVehicleReturn")
    LATE_VEHICLE_RETURN("lateVehicleReturn"),
    @XmlEnumValue("noVehicleReturn")
    NO_VEHICLE_RETURN("noVehicleReturn"),
    @XmlEnumValue("damageToVehicle")
    DAMAGE_TO_VEHICLE("damageToVehicle"),
    @XmlEnumValue("damageToEquipment")
    DAMAGE_TO_EQUIPMENT("damageToEquipment"),
    @XmlEnumValue("lossOfEquipment")
    LOSS_OF_EQUIPMENT("lossOfEquipment"),
    @XmlEnumValue("zoneTransgression")
    ZONE_TRANSGRESSION("zoneTransgression"),
    @XmlEnumValue("trafficFine")
    TRAFFIC_FINE("trafficFine"),
    @XmlEnumValue("handlingFeeForFine")
    HANDLING_FEE_FOR_FINE("handlingFeeForFine"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    RentalPenaltyPolicyTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RentalPenaltyPolicyTypeEnumeration fromValue(String v) {
        for (RentalPenaltyPolicyTypeEnumeration c: RentalPenaltyPolicyTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
