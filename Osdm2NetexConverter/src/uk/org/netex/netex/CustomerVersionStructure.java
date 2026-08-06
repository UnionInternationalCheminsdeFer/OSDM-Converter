//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for CUSTOMER.
 * 
 * <p>Java-Klasse f�r Customer_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Customer_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CustomerGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer_VersionStructure", propOrder = {
    "surname",
    "firstName",
    "title",
    "dateOfBirth",
    "gender",
    "height",
    "photo",
    "smoker",
    "email",
    "emailVerified",
    "phone",
    "phoneVerified",
    "postalAddress",
    "identityDocumentRef",
    "customerEligibilities",
    "customerAccounts",
    "fareContracts"
})
@XmlSeeAlso({
    Customer.class
})
public class CustomerVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Surname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String surname;
    @XmlElement(name = "FirstName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String firstName;
    @XmlElement(name = "Title")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String title;
    @XmlElement(name = "DateOfBirth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "Gender")
    @XmlSchemaType(name = "string")
    protected GenderEnumeration gender;
    @XmlElement(name = "Height")
    protected BigDecimal height;
    @XmlElement(name = "Photo")
    @XmlSchemaType(name = "anyURI")
    protected String photo;
    @XmlElement(name = "Smoker")
    protected Boolean smoker;
    @XmlElement(name = "Email")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String email;
    @XmlElement(name = "EmailVerified")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar emailVerified;
    @XmlElement(name = "Phone")
    protected TelephoneContactStructure phone;
    @XmlElement(name = "PhoneVerified")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar phoneVerified;
    @XmlElement(name = "PostalAddress")
    protected PostalAddress postalAddress;
    @XmlElement(name = "IdentityDocumentRef")
    protected PrivateCodeStructure identityDocumentRef;
    protected CustomerEligibilitiesRelStructure customerEligibilities;
    protected CustomerAccountsRelStructure customerAccounts;
    protected FareContractsRelStructure fareContracts;

    /**
     * Ruft den Wert der surname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Legt den Wert der surname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Ruft den Wert der firstName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Legt den Wert der firstName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Ruft den Wert der title-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Legt den Wert der title-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Ruft den Wert der dateOfBirth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Legt den Wert der dateOfBirth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Ruft den Wert der gender-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GenderEnumeration }
     *     
     */
    public GenderEnumeration getGender() {
        return gender;
    }

    /**
     * Legt den Wert der gender-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderEnumeration }
     *     
     */
    public void setGender(GenderEnumeration value) {
        this.gender = value;
    }

    /**
     * Ruft den Wert der height-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * Legt den Wert der height-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeight(BigDecimal value) {
        this.height = value;
    }

    /**
     * Ruft den Wert der photo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * Legt den Wert der photo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoto(String value) {
        this.photo = value;
    }

    /**
     * Ruft den Wert der smoker-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmoker() {
        return smoker;
    }

    /**
     * Legt den Wert der smoker-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmoker(Boolean value) {
        this.smoker = value;
    }

    /**
     * Ruft den Wert der email-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Legt den Wert der email-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Ruft den Wert der emailVerified-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEmailVerified() {
        return emailVerified;
    }

    /**
     * Legt den Wert der emailVerified-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEmailVerified(XMLGregorianCalendar value) {
        this.emailVerified = value;
    }

    /**
     * Ruft den Wert der phone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneContactStructure }
     *     
     */
    public TelephoneContactStructure getPhone() {
        return phone;
    }

    /**
     * Legt den Wert der phone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneContactStructure }
     *     
     */
    public void setPhone(TelephoneContactStructure value) {
        this.phone = value;
    }

    /**
     * Ruft den Wert der phoneVerified-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPhoneVerified() {
        return phoneVerified;
    }

    /**
     * Legt den Wert der phoneVerified-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPhoneVerified(XMLGregorianCalendar value) {
        this.phoneVerified = value;
    }

    /**
     * Ruft den Wert der postalAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress }
     *     
     */
    public PostalAddress getPostalAddress() {
        return postalAddress;
    }

    /**
     * Legt den Wert der postalAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress }
     *     
     */
    public void setPostalAddress(PostalAddress value) {
        this.postalAddress = value;
    }

    /**
     * Ruft den Wert der identityDocumentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getIdentityDocumentRef() {
        return identityDocumentRef;
    }

    /**
     * Legt den Wert der identityDocumentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setIdentityDocumentRef(PrivateCodeStructure value) {
        this.identityDocumentRef = value;
    }

    /**
     * Ruft den Wert der customerEligibilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerEligibilitiesRelStructure }
     *     
     */
    public CustomerEligibilitiesRelStructure getCustomerEligibilities() {
        return customerEligibilities;
    }

    /**
     * Legt den Wert der customerEligibilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerEligibilitiesRelStructure }
     *     
     */
    public void setCustomerEligibilities(CustomerEligibilitiesRelStructure value) {
        this.customerEligibilities = value;
    }

    /**
     * Ruft den Wert der customerAccounts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccountsRelStructure }
     *     
     */
    public CustomerAccountsRelStructure getCustomerAccounts() {
        return customerAccounts;
    }

    /**
     * Legt den Wert der customerAccounts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccountsRelStructure }
     *     
     */
    public void setCustomerAccounts(CustomerAccountsRelStructure value) {
        this.customerAccounts = value;
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

}
