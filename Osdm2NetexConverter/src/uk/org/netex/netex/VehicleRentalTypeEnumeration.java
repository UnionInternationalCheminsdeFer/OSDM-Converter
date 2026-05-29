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
 * <p>Java-Klasse f�r VehicleRentalTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleRentalTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="vehicleHire"/>
 *     &lt;enumeration value="vehicleLease"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleRentalTypeEnumeration")
@XmlEnum
public enum VehicleRentalTypeEnumeration {

    @XmlEnumValue("vehicleHire")
    VEHICLE_HIRE("vehicleHire"),
    @XmlEnumValue("vehicleLease")
    VEHICLE_LEASE("vehicleLease");
    private final String value;

    VehicleRentalTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleRentalTypeEnumeration fromValue(String v) {
        for (VehicleRentalTypeEnumeration c: VehicleRentalTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
