//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for USER PROFILE.
 * 
 * <p>Java-Klasse f�r UserProfile_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UserProfile_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}UserProfileGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserProfile_VersionStructure", propOrder = {
    "baseUserProfileRef",
    "typeOfConcessionRef",
    "userType",
    "minimumAge",
    "maximumAge",
    "monthDayOnWhichAgeApplies",
    "minimumHeight",
    "maximumHeight",
    "localResident",
    "resides",
    "genderLimitation",
    "proofRequired",
    "typesOfProofRequiredRef",
    "typesOfProofAcceptedRef",
    "discountBasis",
    "companionProfiles"
})
@XmlSeeAlso({
    UserProfile.class,
    VehiclePoolerProfileVersionStructure.class
})
public class UserProfileVersionStructure
    extends UsageParameterVersionStructure
{

    @XmlElement(name = "BaseUserProfileRef")
    protected UserProfileRefStructure baseUserProfileRef;
    @XmlElement(name = "TypeOfConcessionRef")
    protected TypeOfConcessionRefStructure typeOfConcessionRef;
    @XmlElement(name = "UserType")
    protected UserTypeEnumeration userType;
    @XmlElement(name = "MinimumAge")
    protected BigInteger minimumAge;
    @XmlElement(name = "MaximumAge")
    protected BigInteger maximumAge;
    @XmlElement(name = "MonthDayOnWhichAgeApplies")
    @XmlSchemaType(name = "gMonthDay")
    protected XMLGregorianCalendar monthDayOnWhichAgeApplies;
    @XmlElement(name = "MinimumHeight")
    protected BigDecimal minimumHeight;
    @XmlElement(name = "MaximumHeight")
    protected BigDecimal maximumHeight;
    @XmlElement(name = "LocalResident")
    protected Boolean localResident;
    protected ResidentialQualificationsRelStructure resides;
    @XmlElement(name = "GenderLimitation")
    @XmlSchemaType(name = "normalizedString")
    protected GenderLimitationEnumeration genderLimitation;
    @XmlList
    @XmlElement(name = "ProofRequired")
    protected List<ProofOfIdentityEnumeration> proofRequired;
    protected TypesOfProofRefsRelStructure typesOfProofRequiredRef;
    protected TypesOfProofRefsRelStructure typesOfProofAcceptedRef;
    @XmlElement(name = "DiscountBasis")
    @XmlSchemaType(name = "normalizedString")
    protected DiscountBasisEnumeration discountBasis;
    protected CompanionProfilesRelStructure companionProfiles;

    /**
     * Ruft den Wert der baseUserProfileRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserProfileRefStructure }
     *     
     */
    public UserProfileRefStructure getBaseUserProfileRef() {
        return baseUserProfileRef;
    }

    /**
     * Legt den Wert der baseUserProfileRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserProfileRefStructure }
     *     
     */
    public void setBaseUserProfileRef(UserProfileRefStructure value) {
        this.baseUserProfileRef = value;
    }

    /**
     * Ruft den Wert der typeOfConcessionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfConcessionRefStructure }
     *     
     */
    public TypeOfConcessionRefStructure getTypeOfConcessionRef() {
        return typeOfConcessionRef;
    }

    /**
     * Legt den Wert der typeOfConcessionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfConcessionRefStructure }
     *     
     */
    public void setTypeOfConcessionRef(TypeOfConcessionRefStructure value) {
        this.typeOfConcessionRef = value;
    }

    /**
     * Ruft den Wert der userType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserTypeEnumeration }
     *     
     */
    public UserTypeEnumeration getUserType() {
        return userType;
    }

    /**
     * Legt den Wert der userType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserTypeEnumeration }
     *     
     */
    public void setUserType(UserTypeEnumeration value) {
        this.userType = value;
    }

    /**
     * Ruft den Wert der minimumAge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumAge() {
        return minimumAge;
    }

    /**
     * Legt den Wert der minimumAge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumAge(BigInteger value) {
        this.minimumAge = value;
    }

    /**
     * Ruft den Wert der maximumAge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumAge() {
        return maximumAge;
    }

    /**
     * Legt den Wert der maximumAge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumAge(BigInteger value) {
        this.maximumAge = value;
    }

    /**
     * Ruft den Wert der monthDayOnWhichAgeApplies-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMonthDayOnWhichAgeApplies() {
        return monthDayOnWhichAgeApplies;
    }

    /**
     * Legt den Wert der monthDayOnWhichAgeApplies-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMonthDayOnWhichAgeApplies(XMLGregorianCalendar value) {
        this.monthDayOnWhichAgeApplies = value;
    }

    /**
     * Ruft den Wert der minimumHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumHeight() {
        return minimumHeight;
    }

    /**
     * Legt den Wert der minimumHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumHeight(BigDecimal value) {
        this.minimumHeight = value;
    }

    /**
     * Ruft den Wert der maximumHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumHeight() {
        return maximumHeight;
    }

    /**
     * Legt den Wert der maximumHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumHeight(BigDecimal value) {
        this.maximumHeight = value;
    }

    /**
     * Ruft den Wert der localResident-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalResident() {
        return localResident;
    }

    /**
     * Legt den Wert der localResident-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalResident(Boolean value) {
        this.localResident = value;
    }

    /**
     * Ruft den Wert der resides-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResidentialQualificationsRelStructure }
     *     
     */
    public ResidentialQualificationsRelStructure getResides() {
        return resides;
    }

    /**
     * Legt den Wert der resides-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidentialQualificationsRelStructure }
     *     
     */
    public void setResides(ResidentialQualificationsRelStructure value) {
        this.resides = value;
    }

    /**
     * Ruft den Wert der genderLimitation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GenderLimitationEnumeration }
     *     
     */
    public GenderLimitationEnumeration getGenderLimitation() {
        return genderLimitation;
    }

    /**
     * Legt den Wert der genderLimitation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderLimitationEnumeration }
     *     
     */
    public void setGenderLimitation(GenderLimitationEnumeration value) {
        this.genderLimitation = value;
    }

    /**
     * Gets the value of the proofRequired property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proofRequired property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProofRequired().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProofOfIdentityEnumeration }
     * 
     * 
     */
    public List<ProofOfIdentityEnumeration> getProofRequired() {
        if (proofRequired == null) {
            proofRequired = new ArrayList<ProofOfIdentityEnumeration>();
        }
        return this.proofRequired;
    }

    /**
     * Ruft den Wert der typesOfProofRequiredRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypesOfProofRefsRelStructure }
     *     
     */
    public TypesOfProofRefsRelStructure getTypesOfProofRequiredRef() {
        return typesOfProofRequiredRef;
    }

    /**
     * Legt den Wert der typesOfProofRequiredRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypesOfProofRefsRelStructure }
     *     
     */
    public void setTypesOfProofRequiredRef(TypesOfProofRefsRelStructure value) {
        this.typesOfProofRequiredRef = value;
    }

    /**
     * Ruft den Wert der typesOfProofAcceptedRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypesOfProofRefsRelStructure }
     *     
     */
    public TypesOfProofRefsRelStructure getTypesOfProofAcceptedRef() {
        return typesOfProofAcceptedRef;
    }

    /**
     * Legt den Wert der typesOfProofAcceptedRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypesOfProofRefsRelStructure }
     *     
     */
    public void setTypesOfProofAcceptedRef(TypesOfProofRefsRelStructure value) {
        this.typesOfProofAcceptedRef = value;
    }

    /**
     * Ruft den Wert der discountBasis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DiscountBasisEnumeration }
     *     
     */
    public DiscountBasisEnumeration getDiscountBasis() {
        return discountBasis;
    }

    /**
     * Legt den Wert der discountBasis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountBasisEnumeration }
     *     
     */
    public void setDiscountBasis(DiscountBasisEnumeration value) {
        this.discountBasis = value;
    }

    /**
     * Ruft den Wert der companionProfiles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompanionProfilesRelStructure }
     *     
     */
    public CompanionProfilesRelStructure getCompanionProfiles() {
        return companionProfiles;
    }

    /**
     * Legt den Wert der companionProfiles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanionProfilesRelStructure }
     *     
     */
    public void setCompanionProfiles(CompanionProfilesRelStructure value) {
        this.companionProfiles = value;
    }

}
