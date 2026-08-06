//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for PRICING PARAMETERS.
 * 
 * <p>Java-Klasse f�r PricingParameterSet_VersionedStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PricingParameterSet_VersionedStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PricingParameterSetGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingParameterSet_VersionedStructure", propOrder = {
    "name",
    "priceUnitRef",
    "priceUnits",
    "pricingRules",
    "allowCumulativeDiscounts",
    "roundingRef",
    "roundings",
    "dayTypeRef",
    "monthValidityOffsets",
    "pricingServices"
})
@XmlSeeAlso({
    PricingParameterSet.class
})
public class PricingParameterSetVersionedStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "PriceUnitRef")
    protected PriceUnitRefStructure priceUnitRef;
    protected PriceUnitsRelStructure priceUnits;
    protected PricingRulesRelStructure pricingRules;
    @XmlElement(name = "AllowCumulativeDiscounts")
    protected Boolean allowCumulativeDiscounts;
    @XmlElement(name = "RoundingRef")
    protected RoundingRefStructure roundingRef;
    protected RoundingsRelStructure roundings;
    @XmlElementRef(name = "DayTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends DayTypeRefStructure> dayTypeRef;
    protected MonthValidityOffsetsRelStructure monthValidityOffsets;
    protected PricingServicesRelStructure pricingServices;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der priceUnitRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceUnitRefStructure }
     *     
     */
    public PriceUnitRefStructure getPriceUnitRef() {
        return priceUnitRef;
    }

    /**
     * Legt den Wert der priceUnitRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceUnitRefStructure }
     *     
     */
    public void setPriceUnitRef(PriceUnitRefStructure value) {
        this.priceUnitRef = value;
    }

    /**
     * Ruft den Wert der priceUnits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceUnitsRelStructure }
     *     
     */
    public PriceUnitsRelStructure getPriceUnits() {
        return priceUnits;
    }

    /**
     * Legt den Wert der priceUnits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceUnitsRelStructure }
     *     
     */
    public void setPriceUnits(PriceUnitsRelStructure value) {
        this.priceUnits = value;
    }

    /**
     * Ruft den Wert der pricingRules-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PricingRulesRelStructure }
     *     
     */
    public PricingRulesRelStructure getPricingRules() {
        return pricingRules;
    }

    /**
     * Legt den Wert der pricingRules-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingRulesRelStructure }
     *     
     */
    public void setPricingRules(PricingRulesRelStructure value) {
        this.pricingRules = value;
    }

    /**
     * Ruft den Wert der allowCumulativeDiscounts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowCumulativeDiscounts() {
        return allowCumulativeDiscounts;
    }

    /**
     * Legt den Wert der allowCumulativeDiscounts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowCumulativeDiscounts(Boolean value) {
        this.allowCumulativeDiscounts = value;
    }

    /**
     * Ruft den Wert der roundingRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoundingRefStructure }
     *     
     */
    public RoundingRefStructure getRoundingRef() {
        return roundingRef;
    }

    /**
     * Legt den Wert der roundingRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingRefStructure }
     *     
     */
    public void setRoundingRef(RoundingRefStructure value) {
        this.roundingRef = value;
    }

    /**
     * Ruft den Wert der roundings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoundingsRelStructure }
     *     
     */
    public RoundingsRelStructure getRoundings() {
        return roundings;
    }

    /**
     * Legt den Wert der roundings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingsRelStructure }
     *     
     */
    public void setRoundings(RoundingsRelStructure value) {
        this.roundings = value;
    }

    /**
     * Ruft den Wert der dayTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FareDayTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DayTypeRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends DayTypeRefStructure> getDayTypeRef() {
        return dayTypeRef;
    }

    /**
     * Legt den Wert der dayTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FareDayTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DayTypeRefStructure }{@code >}
     *     
     */
    public void setDayTypeRef(JAXBElement<? extends DayTypeRefStructure> value) {
        this.dayTypeRef = value;
    }

    /**
     * Ruft den Wert der monthValidityOffsets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MonthValidityOffsetsRelStructure }
     *     
     */
    public MonthValidityOffsetsRelStructure getMonthValidityOffsets() {
        return monthValidityOffsets;
    }

    /**
     * Legt den Wert der monthValidityOffsets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthValidityOffsetsRelStructure }
     *     
     */
    public void setMonthValidityOffsets(MonthValidityOffsetsRelStructure value) {
        this.monthValidityOffsets = value;
    }

    /**
     * Ruft den Wert der pricingServices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PricingServicesRelStructure }
     *     
     */
    public PricingServicesRelStructure getPricingServices() {
        return pricingServices;
    }

    /**
     * Legt den Wert der pricingServices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingServicesRelStructure }
     *     
     */
    public void setPricingServices(PricingServicesRelStructure value) {
        this.pricingServices = value;
    }

}
