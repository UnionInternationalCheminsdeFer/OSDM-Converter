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
 * <p>Java-Klasse f�r NameOfClassFarePriceRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassFarePriceRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClass">
 *     &lt;enumeration value="CappingRulePrice"/>
 *     &lt;enumeration value="ControllableElementPrice"/>
 *     &lt;enumeration value="CustomerPurchasePackagePrice"/>
 *     &lt;enumeration value="DistanceMatrixElementPrice"/>
 *     &lt;enumeration value="FareProductPrice"/>
 *     &lt;enumeration value="FareStructureElementPrice"/>
 *     &lt;enumeration value="FulfilmentMethodPrice"/>
 *     &lt;enumeration value="GeographicalIntervalPrice"/>
 *     &lt;enumeration value="GeographicalUnitPrice"/>
 *     &lt;enumeration value="ParkingPrice"/>
 *     &lt;enumeration value="QualityStructureFactorPrice"/>
 *     &lt;enumeration value="SalesOfferPackagePrice"/>
 *     &lt;enumeration value="SeriesConstraintPrice"/>
 *     &lt;enumeration value="TimeIntervalPrice"/>
 *     &lt;enumeration value="TimeUnitPrice"/>
 *     &lt;enumeration value="UsageParameterPrice"/>
 *     &lt;enumeration value="ValidableElementPrice"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassFarePriceRefStructureType")
@XmlEnum
public enum NameOfClassFarePriceRefStructureType {

    @XmlEnumValue("CappingRulePrice")
    CAPPING_RULE_PRICE("CappingRulePrice"),
    @XmlEnumValue("ControllableElementPrice")
    CONTROLLABLE_ELEMENT_PRICE("ControllableElementPrice"),
    @XmlEnumValue("CustomerPurchasePackagePrice")
    CUSTOMER_PURCHASE_PACKAGE_PRICE("CustomerPurchasePackagePrice"),
    @XmlEnumValue("DistanceMatrixElementPrice")
    DISTANCE_MATRIX_ELEMENT_PRICE("DistanceMatrixElementPrice"),
    @XmlEnumValue("FareProductPrice")
    FARE_PRODUCT_PRICE("FareProductPrice"),
    @XmlEnumValue("FareStructureElementPrice")
    FARE_STRUCTURE_ELEMENT_PRICE("FareStructureElementPrice"),
    @XmlEnumValue("FulfilmentMethodPrice")
    FULFILMENT_METHOD_PRICE("FulfilmentMethodPrice"),
    @XmlEnumValue("GeographicalIntervalPrice")
    GEOGRAPHICAL_INTERVAL_PRICE("GeographicalIntervalPrice"),
    @XmlEnumValue("GeographicalUnitPrice")
    GEOGRAPHICAL_UNIT_PRICE("GeographicalUnitPrice"),
    @XmlEnumValue("ParkingPrice")
    PARKING_PRICE("ParkingPrice"),
    @XmlEnumValue("QualityStructureFactorPrice")
    QUALITY_STRUCTURE_FACTOR_PRICE("QualityStructureFactorPrice"),
    @XmlEnumValue("SalesOfferPackagePrice")
    SALES_OFFER_PACKAGE_PRICE("SalesOfferPackagePrice"),
    @XmlEnumValue("SeriesConstraintPrice")
    SERIES_CONSTRAINT_PRICE("SeriesConstraintPrice"),
    @XmlEnumValue("TimeIntervalPrice")
    TIME_INTERVAL_PRICE("TimeIntervalPrice"),
    @XmlEnumValue("TimeUnitPrice")
    TIME_UNIT_PRICE("TimeUnitPrice"),
    @XmlEnumValue("UsageParameterPrice")
    USAGE_PARAMETER_PRICE("UsageParameterPrice"),
    @XmlEnumValue("ValidableElementPrice")
    VALIDABLE_ELEMENT_PRICE("ValidableElementPrice");
    private final String value;

    NameOfClassFarePriceRefStructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameOfClassFarePriceRefStructureType fromValue(String v) {
        for (NameOfClassFarePriceRefStructureType c: NameOfClassFarePriceRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
