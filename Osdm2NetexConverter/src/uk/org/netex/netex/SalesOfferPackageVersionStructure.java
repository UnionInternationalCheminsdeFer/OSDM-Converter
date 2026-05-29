//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for SALES OFFER PACKAGE.
 * 
 * <p>Java-Klasse f�r SalesOfferPackage_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SalesOfferPackage_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PriceableObject_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SalesOfferPackageGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOfferPackage_VersionStructure", propOrder = {
    "privateCode",
    "typeOfSalesOfferPackageRef",
    "conditionSummary",
    "validityParameterAssignments",
    "distributionAssignments",
    "roundingRef",
    "prices",
    "salesOfferPackageElements",
    "groupOfSalesOfferPackagesRef",
    "groupsOfSaleOfferPackages",
    "salesOfferPackageSubstitutions"
})
@XmlSeeAlso({
    SalesOfferPackage.class
})
public class SalesOfferPackageVersionStructure
    extends PriceableObjectVersionStructure
{

    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
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
    @XmlElement(name = "GroupOfSalesOfferPackagesRef")
    protected GroupOfSalesOfferPackagesRefStructure groupOfSalesOfferPackagesRef;
    protected GroupOfSalesOfferPackageRefsRelStructure groupsOfSaleOfferPackages;
    protected SalesOfferPackageSubstitutionsRelStructure salesOfferPackageSubstitutions;

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
     * Ruft den Wert der groupOfSalesOfferPackagesRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfSalesOfferPackagesRefStructure }
     *     
     */
    public GroupOfSalesOfferPackagesRefStructure getGroupOfSalesOfferPackagesRef() {
        return groupOfSalesOfferPackagesRef;
    }

    /**
     * Legt den Wert der groupOfSalesOfferPackagesRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfSalesOfferPackagesRefStructure }
     *     
     */
    public void setGroupOfSalesOfferPackagesRef(GroupOfSalesOfferPackagesRefStructure value) {
        this.groupOfSalesOfferPackagesRef = value;
    }

    /**
     * Ruft den Wert der groupsOfSaleOfferPackages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfSalesOfferPackageRefsRelStructure }
     *     
     */
    public GroupOfSalesOfferPackageRefsRelStructure getGroupsOfSaleOfferPackages() {
        return groupsOfSaleOfferPackages;
    }

    /**
     * Legt den Wert der groupsOfSaleOfferPackages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfSalesOfferPackageRefsRelStructure }
     *     
     */
    public void setGroupsOfSaleOfferPackages(GroupOfSalesOfferPackageRefsRelStructure value) {
        this.groupsOfSaleOfferPackages = value;
    }

    /**
     * Ruft den Wert der salesOfferPackageSubstitutions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SalesOfferPackageSubstitutionsRelStructure }
     *     
     */
    public SalesOfferPackageSubstitutionsRelStructure getSalesOfferPackageSubstitutions() {
        return salesOfferPackageSubstitutions;
    }

    /**
     * Legt den Wert der salesOfferPackageSubstitutions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOfferPackageSubstitutionsRelStructure }
     *     
     */
    public void setSalesOfferPackageSubstitutions(SalesOfferPackageSubstitutionsRelStructure value) {
        this.salesOfferPackageSubstitutions = value;
    }

}
