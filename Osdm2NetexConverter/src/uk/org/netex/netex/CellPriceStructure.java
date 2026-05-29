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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Price in a CELL.
 * 
 * <p>Java-Klasse f�r CellPriceStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CellPriceStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}FarePriceGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}LimitingRuleGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellPriceStructure", propOrder = {
    "name",
    "description",
    "privateCode",
    "startDate",
    "endDate",
    "amount",
    "currency",
    "priceUnitRef",
    "units",
    "ruleStepResults",
    "isAllowed",
    "pricingServiceRef",
    "farePriceRef",
    "pricingRuleRef",
    "pricingRuleDummy",
    "canBeCumulative",
    "roundingRef",
    "ranking",
    "minimumPrice",
    "minimumPriceAsPercentage",
    "minimumPriceAsMultiple",
    "maximumPrice",
    "maximumPriceAsPercentage",
    "maximumPriceAsMultiple",
    "minimumLimitPriceAsPercentage",
    "minimumLimitPrice",
    "maximumLimitPriceAsPercentage",
    "maximumLimitPrice"
})
public class CellPriceStructure {

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
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
    protected PriceRuleStepResultsRelStructure ruleStepResults;
    @XmlElement(name = "IsAllowed")
    protected Boolean isAllowed;
    @XmlElement(name = "PricingServiceRef")
    protected PricingServiceRefStructure pricingServiceRef;
    @XmlElementRef(name = "FarePriceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends FarePriceRefStructure> farePriceRef;
    @XmlElementRef(name = "PricingRuleRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends PricingRuleRefStructure> pricingRuleRef;
    @XmlElementRef(name = "PricingRule_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends DataManagedObjectStructure> pricingRuleDummy;
    @XmlElement(name = "CanBeCumulative", defaultValue = "true")
    protected Boolean canBeCumulative;
    @XmlElement(name = "RoundingRef")
    protected RoundingRefStructure roundingRef;
    @XmlElement(name = "Ranking")
    protected BigInteger ranking;
    @XmlElement(name = "MinimumPrice")
    protected BigDecimal minimumPrice;
    @XmlElement(name = "MinimumPriceAsPercentage")
    protected BigDecimal minimumPriceAsPercentage;
    @XmlElement(name = "MinimumPriceAsMultiple")
    protected BigInteger minimumPriceAsMultiple;
    @XmlElement(name = "MaximumPrice")
    protected BigDecimal maximumPrice;
    @XmlElement(name = "MaximumPriceAsPercentage")
    protected BigDecimal maximumPriceAsPercentage;
    @XmlElement(name = "MaximumPriceAsMultiple")
    protected BigInteger maximumPriceAsMultiple;
    @XmlElement(name = "MinimumLimitPriceAsPercentage")
    protected BigDecimal minimumLimitPriceAsPercentage;
    @XmlElement(name = "MinimumLimitPrice")
    protected BigDecimal minimumLimitPrice;
    @XmlElement(name = "MaximumLimitPriceAsPercentage")
    protected BigDecimal maximumLimitPriceAsPercentage;
    @XmlElement(name = "MaximumLimitPrice")
    protected BigDecimal maximumLimitPrice;

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
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescription(MultilingualString value) {
        this.description = value;
    }

    /**
     * DEPRECATED - use privateCodes. -v2.0
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getPrivateCode() {
        return privateCode;
    }

    /**
     * Legt den Wert der privateCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setPrivateCode(PrivateCodeStructure value) {
        this.privateCode = value;
    }

    /**
     * Ruft den Wert der startDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Legt den Wert der startDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Ruft den Wert der endDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Legt den Wert der endDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
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
     * Ruft den Wert der ruleStepResults-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceRuleStepResultsRelStructure }
     *     
     */
    public PriceRuleStepResultsRelStructure getRuleStepResults() {
        return ruleStepResults;
    }

    /**
     * Legt den Wert der ruleStepResults-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRuleStepResultsRelStructure }
     *     
     */
    public void setRuleStepResults(PriceRuleStepResultsRelStructure value) {
        this.ruleStepResults = value;
    }

    /**
     * Ruft den Wert der isAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllowed() {
        return isAllowed;
    }

    /**
     * Legt den Wert der isAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllowed(Boolean value) {
        this.isAllowed = value;
    }

    /**
     * Ruft den Wert der pricingServiceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PricingServiceRefStructure }
     *     
     */
    public PricingServiceRefStructure getPricingServiceRef() {
        return pricingServiceRef;
    }

    /**
     * Legt den Wert der pricingServiceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingServiceRefStructure }
     *     
     */
    public void setPricingServiceRef(PricingServiceRefStructure value) {
        this.pricingServiceRef = value;
    }

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
     * Ruft den Wert der pricingRuleDummy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DiscountingRule }{@code >}
     *     {@link JAXBElement }{@code <}{@link PricingRule }{@code >}
     *     {@link JAXBElement }{@code <}{@link LimitingRule }{@code >}
     *     {@link JAXBElement }{@code <}{@link LimitingRuleInContext }{@code >}
     *     {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     *     
     */
    public JAXBElement<? extends DataManagedObjectStructure> getPricingRuleDummy() {
        return pricingRuleDummy;
    }

    /**
     * Legt den Wert der pricingRuleDummy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DiscountingRule }{@code >}
     *     {@link JAXBElement }{@code <}{@link PricingRule }{@code >}
     *     {@link JAXBElement }{@code <}{@link LimitingRule }{@code >}
     *     {@link JAXBElement }{@code <}{@link LimitingRuleInContext }{@code >}
     *     {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     *     
     */
    public void setPricingRuleDummy(JAXBElement<? extends DataManagedObjectStructure> value) {
        this.pricingRuleDummy = value;
    }

    /**
     * Ruft den Wert der canBeCumulative-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanBeCumulative() {
        return canBeCumulative;
    }

    /**
     * Legt den Wert der canBeCumulative-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanBeCumulative(Boolean value) {
        this.canBeCumulative = value;
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
     * Ruft den Wert der ranking-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRanking() {
        return ranking;
    }

    /**
     * Legt den Wert der ranking-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRanking(BigInteger value) {
        this.ranking = value;
    }

    /**
     * Ruft den Wert der minimumPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumPrice() {
        return minimumPrice;
    }

    /**
     * Legt den Wert der minimumPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumPrice(BigDecimal value) {
        this.minimumPrice = value;
    }

    /**
     * Ruft den Wert der minimumPriceAsPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumPriceAsPercentage() {
        return minimumPriceAsPercentage;
    }

    /**
     * Legt den Wert der minimumPriceAsPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumPriceAsPercentage(BigDecimal value) {
        this.minimumPriceAsPercentage = value;
    }

    /**
     * Ruft den Wert der minimumPriceAsMultiple-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumPriceAsMultiple() {
        return minimumPriceAsMultiple;
    }

    /**
     * Legt den Wert der minimumPriceAsMultiple-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumPriceAsMultiple(BigInteger value) {
        this.minimumPriceAsMultiple = value;
    }

    /**
     * Ruft den Wert der maximumPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumPrice() {
        return maximumPrice;
    }

    /**
     * Legt den Wert der maximumPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumPrice(BigDecimal value) {
        this.maximumPrice = value;
    }

    /**
     * Ruft den Wert der maximumPriceAsPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumPriceAsPercentage() {
        return maximumPriceAsPercentage;
    }

    /**
     * Legt den Wert der maximumPriceAsPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumPriceAsPercentage(BigDecimal value) {
        this.maximumPriceAsPercentage = value;
    }

    /**
     * Ruft den Wert der maximumPriceAsMultiple-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumPriceAsMultiple() {
        return maximumPriceAsMultiple;
    }

    /**
     * Legt den Wert der maximumPriceAsMultiple-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumPriceAsMultiple(BigInteger value) {
        this.maximumPriceAsMultiple = value;
    }

    /**
     * Ruft den Wert der minimumLimitPriceAsPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumLimitPriceAsPercentage() {
        return minimumLimitPriceAsPercentage;
    }

    /**
     * Legt den Wert der minimumLimitPriceAsPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumLimitPriceAsPercentage(BigDecimal value) {
        this.minimumLimitPriceAsPercentage = value;
    }

    /**
     * Ruft den Wert der minimumLimitPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumLimitPrice() {
        return minimumLimitPrice;
    }

    /**
     * Legt den Wert der minimumLimitPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumLimitPrice(BigDecimal value) {
        this.minimumLimitPrice = value;
    }

    /**
     * Ruft den Wert der maximumLimitPriceAsPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumLimitPriceAsPercentage() {
        return maximumLimitPriceAsPercentage;
    }

    /**
     * Legt den Wert der maximumLimitPriceAsPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumLimitPriceAsPercentage(BigDecimal value) {
        this.maximumLimitPriceAsPercentage = value;
    }

    /**
     * Ruft den Wert der maximumLimitPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumLimitPrice() {
        return maximumLimitPrice;
    }

    /**
     * Legt den Wert der maximumLimitPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumLimitPrice(BigDecimal value) {
        this.maximumLimitPrice = value;
    }

}
