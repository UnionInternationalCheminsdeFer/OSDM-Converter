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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for CUSTOMER PURCHASE PACKAGE.
 * 
 * <p>Java-Klasse f�r CustomerPurchasePackage_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CustomerPurchasePackage_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PriceableObject_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CustomerPurchasePackageGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerPurchasePackage_VersionStructure", propOrder = {
    "privateCode",
    "salesOfferPackageRef",
    "customerRef",
    "customerAccountRef",
    "fareContractRef",
    "customerPurchasePackageStatus",
    "travelSpecificationSummaryView",
    "travelSpecifications",
    "validityParameterAssignments",
    "distributionAssignments",
    "customerPurchasePackageElements",
    "salesTransactionRef",
    "salesTransactions",
    "prices",
    "travelDocuments",
    "mediumAccessDeviceRef",
    "mediumApplicationInstanceRef",
    "customerPurchasePackageEntries"
})
@XmlSeeAlso({
    CustomerPurchasePackage.class
})
public class CustomerPurchasePackageVersionStructure
    extends PriceableObjectVersionStructure
{

    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElement(name = "SalesOfferPackageRef")
    protected SalesOfferPackageRefStructure salesOfferPackageRef;
    @XmlElement(name = "CustomerRef")
    protected CustomerRefStructure customerRef;
    @XmlElement(name = "CustomerAccountRef")
    protected CustomerAccountRefStructure customerAccountRef;
    @XmlElement(name = "FareContractRef")
    protected FareContractRefStructure fareContractRef;
    @XmlElement(name = "CustomerPurchasePackageStatus")
    @XmlSchemaType(name = "normalizedString")
    protected CustomerPurchasePackageStatusEnumeration customerPurchasePackageStatus;
    @XmlElement(name = "TravelSpecificationSummaryView")
    protected TravelSpecificationSummaryViewStructure travelSpecificationSummaryView;
    protected TravelSpecificationsRelStructure travelSpecifications;
    protected CustomerPurchaseParameterAssignmentsRelStructure validityParameterAssignments;
    protected DistributionAssignmentsRelStructure distributionAssignments;
    protected CustomerPurchasePackageElementsRelStructure customerPurchasePackageElements;
    @XmlElement(name = "SalesTransactionRef")
    protected SalesTransactionRefStructure salesTransactionRef;
    protected SalesTransactionRefsRelStructure salesTransactions;
    protected CustomerPurchasePackagePricesRelStructure prices;
    protected TravelDocumentsRelStructure travelDocuments;
    @XmlElementRef(name = "MediumAccessDeviceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends MediumAccessDeviceRefStructure> mediumAccessDeviceRef;
    @XmlElement(name = "MediumApplicationInstanceRef")
    protected MediumApplicationInstanceRefStructure mediumApplicationInstanceRef;
    protected FareContractEntriesRelStructure customerPurchasePackageEntries;

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
     * Ruft den Wert der salesOfferPackageRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SalesOfferPackageRefStructure }
     *     
     */
    public SalesOfferPackageRefStructure getSalesOfferPackageRef() {
        return salesOfferPackageRef;
    }

    /**
     * Legt den Wert der salesOfferPackageRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOfferPackageRefStructure }
     *     
     */
    public void setSalesOfferPackageRef(SalesOfferPackageRefStructure value) {
        this.salesOfferPackageRef = value;
    }

    /**
     * Ruft den Wert der customerRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRefStructure }
     *     
     */
    public CustomerRefStructure getCustomerRef() {
        return customerRef;
    }

    /**
     * Legt den Wert der customerRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRefStructure }
     *     
     */
    public void setCustomerRef(CustomerRefStructure value) {
        this.customerRef = value;
    }

    /**
     * Ruft den Wert der customerAccountRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccountRefStructure }
     *     
     */
    public CustomerAccountRefStructure getCustomerAccountRef() {
        return customerAccountRef;
    }

    /**
     * Legt den Wert der customerAccountRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccountRefStructure }
     *     
     */
    public void setCustomerAccountRef(CustomerAccountRefStructure value) {
        this.customerAccountRef = value;
    }

    /**
     * Ruft den Wert der fareContractRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareContractRefStructure }
     *     
     */
    public FareContractRefStructure getFareContractRef() {
        return fareContractRef;
    }

    /**
     * Legt den Wert der fareContractRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareContractRefStructure }
     *     
     */
    public void setFareContractRef(FareContractRefStructure value) {
        this.fareContractRef = value;
    }

    /**
     * Ruft den Wert der customerPurchasePackageStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPurchasePackageStatusEnumeration }
     *     
     */
    public CustomerPurchasePackageStatusEnumeration getCustomerPurchasePackageStatus() {
        return customerPurchasePackageStatus;
    }

    /**
     * Legt den Wert der customerPurchasePackageStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPurchasePackageStatusEnumeration }
     *     
     */
    public void setCustomerPurchasePackageStatus(CustomerPurchasePackageStatusEnumeration value) {
        this.customerPurchasePackageStatus = value;
    }

    /**
     * Ruft den Wert der travelSpecificationSummaryView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TravelSpecificationSummaryViewStructure }
     *     
     */
    public TravelSpecificationSummaryViewStructure getTravelSpecificationSummaryView() {
        return travelSpecificationSummaryView;
    }

    /**
     * Legt den Wert der travelSpecificationSummaryView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelSpecificationSummaryViewStructure }
     *     
     */
    public void setTravelSpecificationSummaryView(TravelSpecificationSummaryViewStructure value) {
        this.travelSpecificationSummaryView = value;
    }

    /**
     * Ruft den Wert der travelSpecifications-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TravelSpecificationsRelStructure }
     *     
     */
    public TravelSpecificationsRelStructure getTravelSpecifications() {
        return travelSpecifications;
    }

    /**
     * Legt den Wert der travelSpecifications-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelSpecificationsRelStructure }
     *     
     */
    public void setTravelSpecifications(TravelSpecificationsRelStructure value) {
        this.travelSpecifications = value;
    }

    /**
     * Ruft den Wert der validityParameterAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPurchaseParameterAssignmentsRelStructure }
     *     
     */
    public CustomerPurchaseParameterAssignmentsRelStructure getValidityParameterAssignments() {
        return validityParameterAssignments;
    }

    /**
     * Legt den Wert der validityParameterAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPurchaseParameterAssignmentsRelStructure }
     *     
     */
    public void setValidityParameterAssignments(CustomerPurchaseParameterAssignmentsRelStructure value) {
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
     * Ruft den Wert der customerPurchasePackageElements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPurchasePackageElementsRelStructure }
     *     
     */
    public CustomerPurchasePackageElementsRelStructure getCustomerPurchasePackageElements() {
        return customerPurchasePackageElements;
    }

    /**
     * Legt den Wert der customerPurchasePackageElements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPurchasePackageElementsRelStructure }
     *     
     */
    public void setCustomerPurchasePackageElements(CustomerPurchasePackageElementsRelStructure value) {
        this.customerPurchasePackageElements = value;
    }

    /**
     * Ruft den Wert der salesTransactionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SalesTransactionRefStructure }
     *     
     */
    public SalesTransactionRefStructure getSalesTransactionRef() {
        return salesTransactionRef;
    }

    /**
     * Legt den Wert der salesTransactionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTransactionRefStructure }
     *     
     */
    public void setSalesTransactionRef(SalesTransactionRefStructure value) {
        this.salesTransactionRef = value;
    }

    /**
     * Ruft den Wert der salesTransactions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SalesTransactionRefsRelStructure }
     *     
     */
    public SalesTransactionRefsRelStructure getSalesTransactions() {
        return salesTransactions;
    }

    /**
     * Legt den Wert der salesTransactions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTransactionRefsRelStructure }
     *     
     */
    public void setSalesTransactions(SalesTransactionRefsRelStructure value) {
        this.salesTransactions = value;
    }

    /**
     * Ruft den Wert der prices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPurchasePackagePricesRelStructure }
     *     
     */
    public CustomerPurchasePackagePricesRelStructure getPrices() {
        return prices;
    }

    /**
     * Legt den Wert der prices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPurchasePackagePricesRelStructure }
     *     
     */
    public void setPrices(CustomerPurchasePackagePricesRelStructure value) {
        this.prices = value;
    }

    /**
     * Ruft den Wert der travelDocuments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TravelDocumentsRelStructure }
     *     
     */
    public TravelDocumentsRelStructure getTravelDocuments() {
        return travelDocuments;
    }

    /**
     * Legt den Wert der travelDocuments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelDocumentsRelStructure }
     *     
     */
    public void setTravelDocuments(TravelDocumentsRelStructure value) {
        this.travelDocuments = value;
    }

    /**
     * Ruft den Wert der mediumAccessDeviceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MobileDeviceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SmartcardRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EmvCardRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MediumAccessDeviceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends MediumAccessDeviceRefStructure> getMediumAccessDeviceRef() {
        return mediumAccessDeviceRef;
    }

    /**
     * Legt den Wert der mediumAccessDeviceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MobileDeviceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SmartcardRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EmvCardRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MediumAccessDeviceRefStructure }{@code >}
     *     
     */
    public void setMediumAccessDeviceRef(JAXBElement<? extends MediumAccessDeviceRefStructure> value) {
        this.mediumAccessDeviceRef = value;
    }

    /**
     * Ruft den Wert der mediumApplicationInstanceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MediumApplicationInstanceRefStructure }
     *     
     */
    public MediumApplicationInstanceRefStructure getMediumApplicationInstanceRef() {
        return mediumApplicationInstanceRef;
    }

    /**
     * Legt den Wert der mediumApplicationInstanceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MediumApplicationInstanceRefStructure }
     *     
     */
    public void setMediumApplicationInstanceRef(MediumApplicationInstanceRefStructure value) {
        this.mediumApplicationInstanceRef = value;
    }

    /**
     * Ruft den Wert der customerPurchasePackageEntries-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareContractEntriesRelStructure }
     *     
     */
    public FareContractEntriesRelStructure getCustomerPurchasePackageEntries() {
        return customerPurchasePackageEntries;
    }

    /**
     * Legt den Wert der customerPurchasePackageEntries-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareContractEntriesRelStructure }
     *     
     */
    public void setCustomerPurchasePackageEntries(FareContractEntriesRelStructure value) {
        this.customerPurchasePackageEntries = value;
    }

}
