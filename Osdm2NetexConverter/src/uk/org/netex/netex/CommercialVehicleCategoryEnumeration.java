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
 * <p>Java-Klasse f�r CommercialVehicleCategoryEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CommercialVehicleCategoryEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bus"/>
 *     &lt;enumeration value="van"/>
 *     &lt;enumeration value="transporter"/>
 *     &lt;enumeration value="largeVan"/>
 *     &lt;enumeration value="highSidedVehicle"/>
 *     &lt;enumeration value="lightGoodsVehicle"/>
 *     &lt;enumeration value="heavyGoodsVehicle"/>
 *     &lt;enumeration value="agriculturalVehicle"/>
 *     &lt;enumeration value="tanker"/>
 *     &lt;enumeration value="truck"/>
 *     &lt;enumeration value="articulatedVehicle"/>
 *     &lt;enumeration value="largeTrailer"/>
 *     &lt;enumeration value="vehicleWithTrailer"/>
 *     &lt;enumeration value="lightGoodsVehicleWithTrailer"/>
 *     &lt;enumeration value="heavyGoodsVehicleWithTrailer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommercialVehicleCategoryEnumeration")
@XmlEnum
public enum CommercialVehicleCategoryEnumeration {

    @XmlEnumValue("bus")
    BUS("bus"),
    @XmlEnumValue("van")
    VAN("van"),
    @XmlEnumValue("transporter")
    TRANSPORTER("transporter"),
    @XmlEnumValue("largeVan")
    LARGE_VAN("largeVan"),
    @XmlEnumValue("highSidedVehicle")
    HIGH_SIDED_VEHICLE("highSidedVehicle"),
    @XmlEnumValue("lightGoodsVehicle")
    LIGHT_GOODS_VEHICLE("lightGoodsVehicle"),
    @XmlEnumValue("heavyGoodsVehicle")
    HEAVY_GOODS_VEHICLE("heavyGoodsVehicle"),
    @XmlEnumValue("agriculturalVehicle")
    AGRICULTURAL_VEHICLE("agriculturalVehicle"),
    @XmlEnumValue("tanker")
    TANKER("tanker"),
    @XmlEnumValue("truck")
    TRUCK("truck"),
    @XmlEnumValue("articulatedVehicle")
    ARTICULATED_VEHICLE("articulatedVehicle"),
    @XmlEnumValue("largeTrailer")
    LARGE_TRAILER("largeTrailer"),
    @XmlEnumValue("vehicleWithTrailer")
    VEHICLE_WITH_TRAILER("vehicleWithTrailer"),
    @XmlEnumValue("lightGoodsVehicleWithTrailer")
    LIGHT_GOODS_VEHICLE_WITH_TRAILER("lightGoodsVehicleWithTrailer"),
    @XmlEnumValue("heavyGoodsVehicleWithTrailer")
    HEAVY_GOODS_VEHICLE_WITH_TRAILER("heavyGoodsVehicleWithTrailer");
    private final String value;

    CommercialVehicleCategoryEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommercialVehicleCategoryEnumeration fromValue(String v) {
        for (CommercialVehicleCategoryEnumeration c: CommercialVehicleCategoryEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
