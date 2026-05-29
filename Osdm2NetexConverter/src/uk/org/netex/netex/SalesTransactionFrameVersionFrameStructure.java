//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a SALES TRANSACTION FRAME.
 * 
 * <p>Java-Klasse f�r SalesTransactionFrame_VersionFrameStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SalesTransactionFrame_VersionFrameStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Common_VersionFrameStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SalesTransactionFrameGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesTransactionFrame_VersionFrameStructure", propOrder = {
    "typesOfRetailDevice",
    "retailConsortiums",
    "retailDevices",
    "customers",
    "customerAccounts",
    "fareContracts",
    "mediumAccessDevices",
    "blacklists",
    "whitelists",
    "travelSpecifications",
    "salesTransactions",
    "typesOfTravelDocuments",
    "travelDocuments",
    "customerPurchasePackages",
    "vehicleJourneySpotAllocations"
})
@XmlSeeAlso({
    SalesTransactionFrame.class
})
public class SalesTransactionFrameVersionFrameStructure
    extends CommonVersionFrameStructure
{

    protected TypesOfRetailDeviceRelStructure typesOfRetailDevice;
    protected RetailConsortiumsInFrameRelStructure retailConsortiums;
    protected RetailDevicesInFrameRelStructure retailDevices;
    protected CustomersInFrameRelStructure customers;
    protected CustomerAccountsInFrameRelStructure customerAccounts;
    protected FareContractsInFrameRelStructure fareContracts;
    protected MediumAccessDevicesInFrameRelStructure mediumAccessDevices;
    protected BlacklistsInFrameRelStructure blacklists;
    protected WhitelistsInFrameRelStructure whitelists;
    protected TravelSpecificationsInFrameRelStructure travelSpecifications;
    protected SalesTransactionsInFrameRelStructure salesTransactions;
    protected TypesOfTravelDocumentInFrameRelStructure typesOfTravelDocuments;
    protected TravelDocumentsInFrameRelStructure travelDocuments;
    protected CustomerPurchasePackagesInFrameRelStructure customerPurchasePackages;
    protected VehicleJourneySpotAllocationsRelStructure vehicleJourneySpotAllocations;

    /**
     * Ruft den Wert der typesOfRetailDevice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypesOfRetailDeviceRelStructure }
     *     
     */
    public TypesOfRetailDeviceRelStructure getTypesOfRetailDevice() {
        return typesOfRetailDevice;
    }

    /**
     * Legt den Wert der typesOfRetailDevice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypesOfRetailDeviceRelStructure }
     *     
     */
    public void setTypesOfRetailDevice(TypesOfRetailDeviceRelStructure value) {
        this.typesOfRetailDevice = value;
    }

    /**
     * Ruft den Wert der retailConsortiums-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RetailConsortiumsInFrameRelStructure }
     *     
     */
    public RetailConsortiumsInFrameRelStructure getRetailConsortiums() {
        return retailConsortiums;
    }

    /**
     * Legt den Wert der retailConsortiums-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailConsortiumsInFrameRelStructure }
     *     
     */
    public void setRetailConsortiums(RetailConsortiumsInFrameRelStructure value) {
        this.retailConsortiums = value;
    }

    /**
     * Ruft den Wert der retailDevices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RetailDevicesInFrameRelStructure }
     *     
     */
    public RetailDevicesInFrameRelStructure getRetailDevices() {
        return retailDevices;
    }

    /**
     * Legt den Wert der retailDevices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailDevicesInFrameRelStructure }
     *     
     */
    public void setRetailDevices(RetailDevicesInFrameRelStructure value) {
        this.retailDevices = value;
    }

    /**
     * Ruft den Wert der customers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomersInFrameRelStructure }
     *     
     */
    public CustomersInFrameRelStructure getCustomers() {
        return customers;
    }

    /**
     * Legt den Wert der customers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomersInFrameRelStructure }
     *     
     */
    public void setCustomers(CustomersInFrameRelStructure value) {
        this.customers = value;
    }

    /**
     * Ruft den Wert der customerAccounts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccountsInFrameRelStructure }
     *     
     */
    public CustomerAccountsInFrameRelStructure getCustomerAccounts() {
        return customerAccounts;
    }

    /**
     * Legt den Wert der customerAccounts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccountsInFrameRelStructure }
     *     
     */
    public void setCustomerAccounts(CustomerAccountsInFrameRelStructure value) {
        this.customerAccounts = value;
    }

    /**
     * Ruft den Wert der fareContracts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareContractsInFrameRelStructure }
     *     
     */
    public FareContractsInFrameRelStructure getFareContracts() {
        return fareContracts;
    }

    /**
     * Legt den Wert der fareContracts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareContractsInFrameRelStructure }
     *     
     */
    public void setFareContracts(FareContractsInFrameRelStructure value) {
        this.fareContracts = value;
    }

    /**
     * Ruft den Wert der mediumAccessDevices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MediumAccessDevicesInFrameRelStructure }
     *     
     */
    public MediumAccessDevicesInFrameRelStructure getMediumAccessDevices() {
        return mediumAccessDevices;
    }

    /**
     * Legt den Wert der mediumAccessDevices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MediumAccessDevicesInFrameRelStructure }
     *     
     */
    public void setMediumAccessDevices(MediumAccessDevicesInFrameRelStructure value) {
        this.mediumAccessDevices = value;
    }

    /**
     * Ruft den Wert der blacklists-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BlacklistsInFrameRelStructure }
     *     
     */
    public BlacklistsInFrameRelStructure getBlacklists() {
        return blacklists;
    }

    /**
     * Legt den Wert der blacklists-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BlacklistsInFrameRelStructure }
     *     
     */
    public void setBlacklists(BlacklistsInFrameRelStructure value) {
        this.blacklists = value;
    }

    /**
     * Ruft den Wert der whitelists-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WhitelistsInFrameRelStructure }
     *     
     */
    public WhitelistsInFrameRelStructure getWhitelists() {
        return whitelists;
    }

    /**
     * Legt den Wert der whitelists-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WhitelistsInFrameRelStructure }
     *     
     */
    public void setWhitelists(WhitelistsInFrameRelStructure value) {
        this.whitelists = value;
    }

    /**
     * Ruft den Wert der travelSpecifications-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TravelSpecificationsInFrameRelStructure }
     *     
     */
    public TravelSpecificationsInFrameRelStructure getTravelSpecifications() {
        return travelSpecifications;
    }

    /**
     * Legt den Wert der travelSpecifications-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelSpecificationsInFrameRelStructure }
     *     
     */
    public void setTravelSpecifications(TravelSpecificationsInFrameRelStructure value) {
        this.travelSpecifications = value;
    }

    /**
     * Ruft den Wert der salesTransactions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SalesTransactionsInFrameRelStructure }
     *     
     */
    public SalesTransactionsInFrameRelStructure getSalesTransactions() {
        return salesTransactions;
    }

    /**
     * Legt den Wert der salesTransactions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTransactionsInFrameRelStructure }
     *     
     */
    public void setSalesTransactions(SalesTransactionsInFrameRelStructure value) {
        this.salesTransactions = value;
    }

    /**
     * Ruft den Wert der typesOfTravelDocuments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypesOfTravelDocumentInFrameRelStructure }
     *     
     */
    public TypesOfTravelDocumentInFrameRelStructure getTypesOfTravelDocuments() {
        return typesOfTravelDocuments;
    }

    /**
     * Legt den Wert der typesOfTravelDocuments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypesOfTravelDocumentInFrameRelStructure }
     *     
     */
    public void setTypesOfTravelDocuments(TypesOfTravelDocumentInFrameRelStructure value) {
        this.typesOfTravelDocuments = value;
    }

    /**
     * Ruft den Wert der travelDocuments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TravelDocumentsInFrameRelStructure }
     *     
     */
    public TravelDocumentsInFrameRelStructure getTravelDocuments() {
        return travelDocuments;
    }

    /**
     * Legt den Wert der travelDocuments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelDocumentsInFrameRelStructure }
     *     
     */
    public void setTravelDocuments(TravelDocumentsInFrameRelStructure value) {
        this.travelDocuments = value;
    }

    /**
     * Ruft den Wert der customerPurchasePackages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPurchasePackagesInFrameRelStructure }
     *     
     */
    public CustomerPurchasePackagesInFrameRelStructure getCustomerPurchasePackages() {
        return customerPurchasePackages;
    }

    /**
     * Legt den Wert der customerPurchasePackages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPurchasePackagesInFrameRelStructure }
     *     
     */
    public void setCustomerPurchasePackages(CustomerPurchasePackagesInFrameRelStructure value) {
        this.customerPurchasePackages = value;
    }

    /**
     * Ruft den Wert der vehicleJourneySpotAllocations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleJourneySpotAllocationsRelStructure }
     *     
     */
    public VehicleJourneySpotAllocationsRelStructure getVehicleJourneySpotAllocations() {
        return vehicleJourneySpotAllocations;
    }

    /**
     * Legt den Wert der vehicleJourneySpotAllocations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleJourneySpotAllocationsRelStructure }
     *     
     */
    public void setVehicleJourneySpotAllocations(VehicleJourneySpotAllocationsRelStructure value) {
        this.vehicleJourneySpotAllocations = value;
    }

}
