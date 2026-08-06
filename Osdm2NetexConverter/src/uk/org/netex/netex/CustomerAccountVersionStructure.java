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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for CUSTOMER ACCOUNT.
 * 
 * <p>Java-Klasse f�r CustomerAccount_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CustomerAccount_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CustomerAccountGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAccount_VersionStructure", propOrder = {
    "name",
    "description",
    "startDate",
    "endDate",
    "customerRef",
    "typeOfCustomerAccountRef",
    "customerAccountStatusRef",
    "customerAccountStatusType",
    "fareContracts",
    "customerAccountEntries",
    "customerPurchasePackages",
    "customerPaymentMeansRef",
    "paymentMeans",
    "mediumAccessDevices"
})
@XmlSeeAlso({
    CustomerAccount.class
})
public class CustomerAccountVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "CustomerRef")
    protected CustomerRefStructure customerRef;
    @XmlElement(name = "TypeOfCustomerAccountRef")
    protected TypeOfCustomerAccountRefStructure typeOfCustomerAccountRef;
    @XmlElement(name = "CustomerAccountStatusRef")
    protected CustomerAccountStatusRefStructure customerAccountStatusRef;
    @XmlElement(name = "CustomerAccountStatusType")
    @XmlSchemaType(name = "normalizedString")
    protected AccountStatusTypeEnumeration customerAccountStatusType;
    protected FareContractsRelStructure fareContracts;
    protected FareContractEntriesRelStructure customerAccountEntries;
    protected CustomerPurchasePackageRefsRelStructure customerPurchasePackages;
    @XmlElement(name = "CustomerPaymentMeansRef")
    protected CustomerPaymentMeansRefStructure customerPaymentMeansRef;
    protected CustomerPaymentMeansRelStructure paymentMeans;
    protected MediumAccessDeviceRefsRelStructure mediumAccessDevices;

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
     * Ruft den Wert der typeOfCustomerAccountRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfCustomerAccountRefStructure }
     *     
     */
    public TypeOfCustomerAccountRefStructure getTypeOfCustomerAccountRef() {
        return typeOfCustomerAccountRef;
    }

    /**
     * Legt den Wert der typeOfCustomerAccountRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfCustomerAccountRefStructure }
     *     
     */
    public void setTypeOfCustomerAccountRef(TypeOfCustomerAccountRefStructure value) {
        this.typeOfCustomerAccountRef = value;
    }

    /**
     * Ruft den Wert der customerAccountStatusRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccountStatusRefStructure }
     *     
     */
    public CustomerAccountStatusRefStructure getCustomerAccountStatusRef() {
        return customerAccountStatusRef;
    }

    /**
     * Legt den Wert der customerAccountStatusRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccountStatusRefStructure }
     *     
     */
    public void setCustomerAccountStatusRef(CustomerAccountStatusRefStructure value) {
        this.customerAccountStatusRef = value;
    }

    /**
     * Ruft den Wert der customerAccountStatusType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatusTypeEnumeration }
     *     
     */
    public AccountStatusTypeEnumeration getCustomerAccountStatusType() {
        return customerAccountStatusType;
    }

    /**
     * Legt den Wert der customerAccountStatusType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatusTypeEnumeration }
     *     
     */
    public void setCustomerAccountStatusType(AccountStatusTypeEnumeration value) {
        this.customerAccountStatusType = value;
    }

    /**
     * Ruft den Wert der fareContracts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareContractsRelStructure }
     *     
     */
    public FareContractsRelStructure getFareContracts() {
        return fareContracts;
    }

    /**
     * Legt den Wert der fareContracts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareContractsRelStructure }
     *     
     */
    public void setFareContracts(FareContractsRelStructure value) {
        this.fareContracts = value;
    }

    /**
     * Ruft den Wert der customerAccountEntries-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareContractEntriesRelStructure }
     *     
     */
    public FareContractEntriesRelStructure getCustomerAccountEntries() {
        return customerAccountEntries;
    }

    /**
     * Legt den Wert der customerAccountEntries-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareContractEntriesRelStructure }
     *     
     */
    public void setCustomerAccountEntries(FareContractEntriesRelStructure value) {
        this.customerAccountEntries = value;
    }

    /**
     * Ruft den Wert der customerPurchasePackages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPurchasePackageRefsRelStructure }
     *     
     */
    public CustomerPurchasePackageRefsRelStructure getCustomerPurchasePackages() {
        return customerPurchasePackages;
    }

    /**
     * Legt den Wert der customerPurchasePackages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPurchasePackageRefsRelStructure }
     *     
     */
    public void setCustomerPurchasePackages(CustomerPurchasePackageRefsRelStructure value) {
        this.customerPurchasePackages = value;
    }

    /**
     * Ruft den Wert der customerPaymentMeansRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPaymentMeansRefStructure }
     *     
     */
    public CustomerPaymentMeansRefStructure getCustomerPaymentMeansRef() {
        return customerPaymentMeansRef;
    }

    /**
     * Legt den Wert der customerPaymentMeansRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPaymentMeansRefStructure }
     *     
     */
    public void setCustomerPaymentMeansRef(CustomerPaymentMeansRefStructure value) {
        this.customerPaymentMeansRef = value;
    }

    /**
     * Ruft den Wert der paymentMeans-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPaymentMeansRelStructure }
     *     
     */
    public CustomerPaymentMeansRelStructure getPaymentMeans() {
        return paymentMeans;
    }

    /**
     * Legt den Wert der paymentMeans-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPaymentMeansRelStructure }
     *     
     */
    public void setPaymentMeans(CustomerPaymentMeansRelStructure value) {
        this.paymentMeans = value;
    }

    /**
     * Ruft den Wert der mediumAccessDevices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MediumAccessDeviceRefsRelStructure }
     *     
     */
    public MediumAccessDeviceRefsRelStructure getMediumAccessDevices() {
        return mediumAccessDevices;
    }

    /**
     * Legt den Wert der mediumAccessDevices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MediumAccessDeviceRefsRelStructure }
     *     
     */
    public void setMediumAccessDevices(MediumAccessDeviceRefsRelStructure value) {
        this.mediumAccessDevices = value;
    }

}
