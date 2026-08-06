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
 * <p>Java-Klasse f�r PersonalVehicleCategoryEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonalVehicleCategoryEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
 *     &lt;enumeration value="mediumCar"/>
 *     &lt;enumeration value="passengerCar"/>
 *     &lt;enumeration value="largeCar"/>
 *     &lt;enumeration value="fourWheelDrive"/>
 *     &lt;enumeration value="taxi"/>
 *     &lt;enumeration value="camperCar"/>
 *     &lt;enumeration value="caravan"/>
 *     &lt;enumeration value="carWithTrailer"/>
 *     &lt;enumeration value="carWithCaravan"/>
 *     &lt;enumeration value="minibus"/>
 *     &lt;enumeration value="minivan"/>
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
@XmlType(name = "PersonalVehicleCategoryEnumeration")
@XmlEnum
public enum PersonalVehicleCategoryEnumeration {

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
    @XmlEnumValue("microCar")
    MICRO_CAR("microCar"),
    @XmlEnumValue("miniCar")
    MINI_CAR("miniCar"),
    @XmlEnumValue("smallCar")
    SMALL_CAR("smallCar"),
    @XmlEnumValue("mediumCar")
    MEDIUM_CAR("mediumCar"),
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
    @XmlEnumValue("caravan")
    CARAVAN("caravan"),
    @XmlEnumValue("carWithTrailer")
    CAR_WITH_TRAILER("carWithTrailer"),
    @XmlEnumValue("carWithCaravan")
    CAR_WITH_CARAVAN("carWithCaravan"),
    @XmlEnumValue("minibus")
    MINIBUS("minibus"),
    @XmlEnumValue("minivan")
    MINIVAN("minivan"),
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

    PersonalVehicleCategoryEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonalVehicleCategoryEnumeration fromValue(String v) {
        for (PersonalVehicleCategoryEnumeration c: PersonalVehicleCategoryEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
