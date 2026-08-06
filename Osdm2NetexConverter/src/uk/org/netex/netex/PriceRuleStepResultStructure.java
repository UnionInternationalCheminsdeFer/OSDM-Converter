//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for FARE STEP RESULT.
 * 
 * <p>Java-Klasse f�r PriceRuleStepResultStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PriceRuleStepResultStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}FarePriceRef" minOccurs="0"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}FarePriceAmountGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}StepCalculationAmountGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PriceRuleStepRateGroup"/>
 *         &lt;element name="Narrative" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}RuleStepResultIdType" />
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceRuleStepResultStructure", propOrder = {
    "farePriceRef",
    "amount",
    "currency",
    "priceUnitRef",
    "units",
    "rateUsed",
    "adjustmentAmount",
    "adjustmentUnits",
    "pricingRuleRef",
    "roundingRef",
    "roundingStepRef",
    "narrative"
})
public class PriceRuleStepResultStructure {

    @XmlElementRef(name = "FarePriceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends FarePriceRefStructure> farePriceRef;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "Currency")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String currency;
    @XmlElement(name = "PriceUnitRef")
    protected PriceUnitRefStructure priceUnitRef;
    @XmlElement(name = "Units")
    protected BigDecimal units;
    @XmlElement(name = "RateUsed")
    protected BigDecimal rateUsed;
    @XmlElement(name = "AdjustmentAmount")
    protected BigDecimal adjustmentAmount;
    @XmlElement(name = "AdjustmentUnits")
    protected BigDecimal adjustmentUnits;
    @XmlElementRef(name = "PricingRuleRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected JAXBElement<? extends PricingRuleRefStructure> pricingRuleRef;
    @XmlElement(name = "RoundingRef")
    protected RoundingRefStructure roundingRef;
    @XmlElement(name = "RoundingStepRef")
    protected RoundingStepRefStructure roundingStepRef;
    @XmlElement(name = "Narrative")
    protected MultilingualString narrative;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;

    /**
     * Ruft den Wert der farePriceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FarePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalUnitPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FulfilmentMethodPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalIntervalPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CappingRulePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValidableElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ControllableElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageParameterPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeriesConstraintPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityStructureFactorPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareStructureElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeUnitPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackagePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeIntervalPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerPurchasePackagePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceMatrixElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareProductPriceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends FarePriceRefStructure> getFarePriceRef() {
        return farePriceRef;
    }

    /**
     * Legt den Wert der farePriceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FarePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalUnitPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FulfilmentMethodPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalIntervalPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CappingRulePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValidableElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ControllableElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageParameterPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeriesConstraintPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityStructureFactorPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareStructureElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeUnitPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackagePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeIntervalPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerPurchasePackagePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceMatrixElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareProductPriceRefStructure }{@code >}
     *     
     */
    public void setFarePriceRef(JAXBElement<? extends FarePriceRefStructure> value) {
        this.farePriceRef = value;
    }

    /**
     * Ruft den Wert der amount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Legt den Wert der amount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Ruft den Wert der currency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Legt den Wert der currency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
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
     * Ruft den Wert der units-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnits() {
        return units;
    }

    /**
     * Legt den Wert der units-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnits(BigDecimal value) {
        this.units = value;
    }

    /**
     * Ruft den Wert der rateUsed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRateUsed() {
        return rateUsed;
    }

    /**
     * Legt den Wert der rateUsed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRateUsed(BigDecimal value) {
        this.rateUsed = value;
    }

    /**
     * Ruft den Wert der adjustmentAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustmentAmount() {
        return adjustmentAmount;
    }

    /**
     * Legt den Wert der adjustmentAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustmentAmount(BigDecimal value) {
        this.adjustmentAmount = value;
    }

    /**
     * Ruft den Wert der adjustmentUnits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustmentUnits() {
        return adjustmentUnits;
    }

    /**
     * Legt den Wert der adjustmentUnits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustmentUnits(BigDecimal value) {
        this.adjustmentUnits = value;
    }

    /**
     * Ruft den Wert der pricingRuleRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DiscountingRuleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PricingRuleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LimitingRuleRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends PricingRuleRefStructure> getPricingRuleRef() {
        return pricingRuleRef;
    }

    /**
     * Legt den Wert der pricingRuleRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DiscountingRuleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PricingRuleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LimitingRuleRefStructure }{@code >}
     *     
     */
    public void setPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        this.pricingRuleRef = value;
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
     * Ruft den Wert der roundingStepRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoundingStepRefStructure }
     *     
     */
    public RoundingStepRefStructure getRoundingStepRef() {
        return roundingStepRef;
    }

    /**
     * Legt den Wert der roundingStepRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingStepRefStructure }
     *     
     */
    public void setRoundingStepRef(RoundingStepRefStructure value) {
        this.roundingStepRef = value;
    }

    /**
     * Ruft den Wert der narrative-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getNarrative() {
        return narrative;
    }

    /**
     * Legt den Wert der narrative-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setNarrative(MultilingualString value) {
        this.narrative = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der order-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Legt den Wert der order-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

}
