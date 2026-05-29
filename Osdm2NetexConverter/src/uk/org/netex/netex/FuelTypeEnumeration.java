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
 * <p>Java-Klasse f�r FuelTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FuelTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="battery"/>
 *     &lt;enumeration value="biodiesel"/>
 *     &lt;enumeration value="diesel"/>
 *     &lt;enumeration value="dieselBatteryHybrid"/>
 *     &lt;enumeration value="electricContact"/>
 *     &lt;enumeration value="electricity"/>
 *     &lt;enumeration value="ethanol"/>
 *     &lt;enumeration value="hydrogen"/>
 *     &lt;enumeration value="liquidGas"/>
 *     &lt;enumeration value="tpg"/>
 *     &lt;enumeration value="methane"/>
 *     &lt;enumeration value="naturalGas"/>
 *     &lt;enumeration value="petrol"/>
 *     &lt;enumeration value="petrolBatteryHybrid"/>
 *     &lt;enumeration value="petrolLeaded"/>
 *     &lt;enumeration value="petrolUnleaded"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FuelTypeEnumeration")
@XmlEnum
public enum FuelTypeEnumeration {

    @XmlEnumValue("battery")
    BATTERY("battery"),
    @XmlEnumValue("biodiesel")
    BIODIESEL("biodiesel"),
    @XmlEnumValue("diesel")
    DIESEL("diesel"),
    @XmlEnumValue("dieselBatteryHybrid")
    DIESEL_BATTERY_HYBRID("dieselBatteryHybrid"),
    @XmlEnumValue("electricContact")
    ELECTRIC_CONTACT("electricContact"),
    @XmlEnumValue("electricity")
    ELECTRICITY("electricity"),
    @XmlEnumValue("ethanol")
    ETHANOL("ethanol"),
    @XmlEnumValue("hydrogen")
    HYDROGEN("hydrogen"),
    @XmlEnumValue("liquidGas")
    LIQUID_GAS("liquidGas"),
    @XmlEnumValue("tpg")
    TPG("tpg"),
    @XmlEnumValue("methane")
    METHANE("methane"),
    @XmlEnumValue("naturalGas")
    NATURAL_GAS("naturalGas"),
    @XmlEnumValue("petrol")
    PETROL("petrol"),
    @XmlEnumValue("petrolBatteryHybrid")
    PETROL_BATTERY_HYBRID("petrolBatteryHybrid"),
    @XmlEnumValue("petrolLeaded")
    PETROL_LEADED("petrolLeaded"),
    @XmlEnumValue("petrolUnleaded")
    PETROL_UNLEADED("petrolUnleaded"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    FuelTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FuelTypeEnumeration fromValue(String v) {
        for (FuelTypeEnumeration c: FuelTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
