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
 * Type for GROUP OF SALES OFFER PACKAGEs.
 * 
 * <p>Java-Klasse f�r GroupOfSalesOfferPackages_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupOfSalesOfferPackages_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfEntities_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}GroupOfSalesOfferPackagesGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfSalesOfferPackages_VersionStructure", propOrder = {
    "alternativeNames",
    "noticeAssignments",
    "pricingServiceRef",
    "pricingRuleRef",
    "priceGroups",
    "fareTables",
    "typeOfSalesOfferPackageRef",
    "conditionSummary",
    "validityParameterAssignments",
    "distributionAssignments",
    "roundingRef",
    "prices",
    "salesOfferPackageElements",
    "members"
})
@XmlSeeAlso({
    GroupOfSalesOfferPackages.class
})
public class GroupOfSalesOfferPackagesVersionStructure
    extends GroupOfEntitiesVersionStructure
{

    protected AlternativeNamesRelStructure alternativeNames;
    protected NoticeAssignmentsRelStructure noticeAssignments;
    @XmlElement(name = "PricingServiceRef")
    protected PricingServiceRefStructure pricingServiceRef;
    @XmlElementRef(name = "PricingRuleRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends PricingRuleRefStructure> pricingRuleRef;
    protected PriceGroupsRelStructure priceGroups;
    protected FareTablesRelStructure fareTables;
    @XmlElement(name = "TypeOfSalesOfferPackageRef")
    protected TypeOfSalesOfferPackageRefStructure typeOfSalesOfferPackageRef;
    @XmlElement(name = "ConditionSummary")
    protected ConditionSummaryStructure conditionSummary;
    protected GenericParameterAssignmentsRelStructure validityParameterAssignments;
    protected DistributionAssignmentsRelStructure distributionAssignments;
    @XmlElement(name = "RoundingRef")
    protected RoundingRefStructure roundingRef;
    protected SalesOfferPackagePricesRelStructure prices;
    protected SalesOfferPackageElementsRelStructure salesOfferPackageElements;
    protected SalesOfferPackageRefsRelStructure members;

    /**
     * Ruft den Wert der alternativeNames-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeNamesRelStructure }
     *     
     */
    public AlternativeNamesRelStructure getAlternativeNames() {
        return alternativeNames;
    }

    /**
     * Legt den Wert der alternativeNames-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeNamesRelStructure }
     *     
     */
    public void setAlternativeNames(AlternativeNamesRelStructure value) {
        this.alternativeNames = value;
    }

    /**
     * Ruft den Wert der noticeAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NoticeAssignmentsRelStructure }
     *     
     */
    public NoticeAssignmentsRelStructure getNoticeAssignments() {
        return noticeAssignments;
    }

    /**
     * Legt den Wert der noticeAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeAssignmentsRelStructure }
     *     
     */
    public void setNoticeAssignments(NoticeAssignmentsRelStructure value) {
        this.noticeAssignments = value;
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
     * Ruft den Wert der priceGroups-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceGroupsRelStructure }
     *     
     */
    public PriceGroupsRelStructure getPriceGroups() {
        return priceGroups;
    }

    /**
     * Legt den Wert der priceGroups-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGroupsRelStructure }
     *     
     */
    public void setPriceGroups(PriceGroupsRelStructure value) {
        this.priceGroups = value;
    }

    /**
     * Ruft den Wert der fareTables-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareTablesRelStructure }
     *     
     */
    public FareTablesRelStructure getFareTables() {
        return fareTables;
    }

    /**
     * Legt den Wert der fareTables-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTablesRelStructure }
     *     
     */
    public void setFareTables(FareTablesRelStructure value) {
        this.fareTables = value;
    }

    /**
     * Ruft den Wert der typeOfSalesOfferPackageRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfSalesOfferPackageRefStructure }
     *     
     */
    public TypeOfSalesOfferPackageRefStructure getTypeOfSalesOfferPackageRef() {
        return typeOfSalesOfferPackageRef;
    }

    /**
     * Legt den Wert der typeOfSalesOfferPackageRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfSalesOfferPackageRefStructure }
     *     
     */
    public void setTypeOfSalesOfferPackageRef(TypeOfSalesOfferPackageRefStructure value) {
        this.typeOfSalesOfferPackageRef = value;
    }

    /**
     * Ruft den Wert der conditionSummary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConditionSummaryStructure }
     *     
     */
    public ConditionSummaryStructure getConditionSummary() {
        return conditionSummary;
    }

    /**
     * Legt den Wert der conditionSummary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionSummaryStructure }
     *     
     */
    public void setConditionSummary(ConditionSummaryStructure value) {
        this.conditionSummary = value;
    }

    /**
     * Ruft den Wert der validityParameterAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GenericParameterAssignmentsRelStructure }
     *     
     */
    public GenericParameterAssignmentsRelStructure getValidityParameterAssignments() {
        return validityParameterAssignments;
    }

    /**
     * Legt den Wert der validityParameterAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericParameterAssignmentsRelStructure }
     *     
     */
    public void setValidityParameterAssignments(GenericParameterAssignmentsRelStructure value) {
        this.validityParameterAssignments = value;
    }

    /**
     * Ruft den Wert der distributionAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistributionAssignmentsRelStructure }
     *     
     */
    public DistributionAssignmentsRelStructure getDistributionAssignments() {
        return distributionAssignments;
    }

    /**
     * Legt den Wert der distributionAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionAssignmentsRelStructure }
     *     
     */
    public void setDistributionAssignments(DistributionAssignmentsRelStructure value) {
        this.distributionAssignments = value;
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
     * Ruft den Wert der prices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SalesOfferPackagePricesRelStructure }
     *     
     */
    public SalesOfferPackagePricesRelStructure getPrices() {
        return prices;
    }

    /**
     * Legt den Wert der prices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOfferPackagePricesRelStructure }
     *     
     */
    public void setPrices(SalesOfferPackagePricesRelStructure value) {
        this.prices = value;
    }

    /**
     * Ruft den Wert der salesOfferPackageElements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SalesOfferPackageElementsRelStructure }
     *     
     */
    public SalesOfferPackageElementsRelStructure getSalesOfferPackageElements() {
        return salesOfferPackageElements;
    }

    /**
     * Legt den Wert der salesOfferPackageElements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOfferPackageElementsRelStructure }
     *     
     */
    public void setSalesOfferPackageElements(SalesOfferPackageElementsRelStructure value) {
        this.salesOfferPackageElements = value;
    }

    /**
     * Ruft den Wert der members-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SalesOfferPackageRefsRelStructure }
     *     
     */
    public SalesOfferPackageRefsRelStructure getMembers() {
        return members;
    }

    /**
     * Legt den Wert der members-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOfferPackageRefsRelStructure }
     *     
     */
    public void setMembers(SalesOfferPackageRefsRelStructure value) {
        this.members = value;
    }

}
