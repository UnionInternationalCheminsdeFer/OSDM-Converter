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
 * <p>Java-Klasse f�r ParkingVehicleEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingVehicleEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cycle"/>
 *     &lt;enumeration value="pedalCycle"/>
 *     &lt;enumeration value="eCycle"/>
 *     &lt;enumeration value="moped"/>
 *     &lt;enumeration value="motorcycle"/>
 *     &lt;enumeration value="motorcycleWithSidecar"/>
 *     &lt;enumeration value="motorScooter"/>
 *     &lt;enumeration value="twoWheeledVehicle"/>
 *     &lt;enumeration value="threeWheeledVehicle"/>
 *     &lt;enumeration value="car"/>
 *     &lt;enumeration value="microCar"/>
 *     &lt;enumeration value="miniCar"/>
 *     &lt;enumeration value="smallCar"/>
 *     &lt;enumeration value="passengerCar"/>
 *     &lt;enumeration value="largeCar"/>
 *     &lt;enumeration value="fourWheelDrive"/>
 *     &lt;enumeration value="taxi"/>
 *     &lt;enumeration value="camperCar"/>
 *     &lt;enumeration value="carWithTrailer"/>
 *     &lt;enumeration value="carWithCaravan"/>
 *     &lt;enumeration value="minibus"/>
 *     &lt;enumeration value="minivan"/>
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
 *     &lt;enumeration value="tram"/>
 *     &lt;enumeration value="articulatedVehicle"/>
 *     &lt;enumeration value="vehicleWithTrailer"/>
 *     &lt;enumeration value="lightGoodsVehicleWithTrailer"/>
 *     &lt;enumeration value="heavyGoodsVehicleWithTrailer"/>
 *     &lt;enumeration value="snowmobile"/>
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="allPassengerVehicles"/>
 *     &lt;enumeration value="all"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParkingVehicleEnumeration")
@XmlEnum
public enum ParkingVehicleEnumeration {


    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("cycle")
    CYCLE("cycle"),
    @XmlEnumValue("pedalCycle")
    PEDAL_CYCLE("pedalCycle"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("eCycle")
    E_CYCLE("eCycle"),
    @XmlEnumValue("moped")
    MOPED("moped"),
    @XmlEnumValue("motorcycle")
    MOTORCYCLE("motorcycle"),
    @XmlEnumValue("motorcycleWithSidecar")
    MOTORCYCLE_WITH_SIDECAR("motorcycleWithSidecar"),
    @XmlEnumValue("motorScooter")
    MOTOR_SCOOTER("motorScooter"),
    @XmlEnumValue("twoWheeledVehicle")
    TWO_WHEELED_VEHICLE("twoWheeledVehicle"),
    @XmlEnumValue("threeWheeledVehicle")
    THREE_WHEELED_VEHICLE("threeWheeledVehicle"),
    @XmlEnumValue("car")
    CAR("car"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("microCar")
    MICRO_CAR("microCar"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("miniCar")
    MINI_CAR("miniCar"),
    @XmlEnumValue("smallCar")
    SMALL_CAR("smallCar"),
    @XmlEnumValue("passengerCar")
    PASSENGER_CAR("passengerCar"),
    @XmlEnumValue("largeCar")
    LARGE_CAR("largeCar"),
    @XmlEnumValue("fourWheelDrive")
    FOUR_WHEEL_DRIVE("fourWheelDrive"),
    @XmlEnumValue("taxi")
    TAXI("taxi"),
    @XmlEnumValue("camperCar")
    CAMPER_CAR("camperCar"),
    @XmlEnumValue("carWithTrailer")
    CAR_WITH_TRAILER("carWithTrailer"),
    @XmlEnumValue("carWithCaravan")
    CAR_WITH_CARAVAN("carWithCaravan"),
    @XmlEnumValue("minibus")
    MINIBUS("minibus"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("minivan")
    MINIVAN("minivan"),
    @XmlEnumValue("bus")
    BUS("bus"),
    @XmlEnumValue("van")
    VAN("van"),

    /**
     * +v1.2.2
     * 
     */
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
    @XmlEnumValue("tram")
    TRAM("tram"),
    @XmlEnumValue("articulatedVehicle")
    ARTICULATED_VEHICLE("articulatedVehicle"),
    @XmlEnumValue("vehicleWithTrailer")
    VEHICLE_WITH_TRAILER("vehicleWithTrailer"),
    @XmlEnumValue("lightGoodsVehicleWithTrailer")
    LIGHT_GOODS_VEHICLE_WITH_TRAILER("lightGoodsVehicleWithTrailer"),
    @XmlEnumValue("heavyGoodsVehicleWithTrailer")
    HEAVY_GOODS_VEHICLE_WITH_TRAILER("heavyGoodsVehicleWithTrailer"),

    /**
     * +v1.2.2
     * 
     */
    @XmlEnumValue("snowmobile")
    SNOWMOBILE("snowmobile"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("allPassengerVehicles")
    ALL_PASSENGER_VEHICLES("allPassengerVehicles"),
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    ParkingVehicleEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingVehicleEnumeration fromValue(String v) {
        for (ParkingVehicleEnumeration c: ParkingVehicleEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
