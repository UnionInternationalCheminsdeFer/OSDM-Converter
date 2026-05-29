//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for GROUP TICKET.
 * 
 * <p>Java-Klasse f�r GroupTicket_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupTicket_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}GroupTicketGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupTicket_VersionStructure", propOrder = {
    "typeOfConcessionRef",
    "minimumNumberOfPersons",
    "maximumNumberOfPersons",
    "minimumNumberOfCardHolders",
    "companionProfiles",
    "pricingBasis",
    "maximumPersonsFree",
    "maximumPersonsDiscounted",
    "discountOnlyForFirstPerson",
    "oneForNPersons",
    "groupSizeChanges",
    "ticketing",
    "jointCheckIn",
    "groupBookingFacility"
})
@XmlSeeAlso({
    GroupTicket.class
})
public class GroupTicketVersionStructure
    extends UsageParameterVersionStructure
{

    @XmlElement(name = "TypeOfConcessionRef")
    protected TypeOfConcessionRefStructure typeOfConcessionRef;
    @XmlElement(name = "MinimumNumberOfPersons")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minimumNumberOfPersons;
    @XmlElement(name = "MaximumNumberOfPersons")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumNumberOfPersons;
    @XmlElement(name = "MinimumNumberOfCardHolders")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minimumNumberOfCardHolders;
    protected CompanionProfilesRelStructure companionProfiles;
    @XmlElement(name = "PricingBasis")
    @XmlSchemaType(name = "normalizedString")
    protected PerBasisEnumeration pricingBasis;
    @XmlElement(name = "MaximumPersonsFree")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumPersonsFree;
    @XmlElement(name = "MaximumPersonsDiscounted")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumPersonsDiscounted;
    @XmlElement(name = "DiscountOnlyForFirstPerson")
    protected Boolean discountOnlyForFirstPerson;
    @XmlElement(name = "OneForNPersons")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger oneForNPersons;
    @XmlElement(name = "GroupSizeChanges")
    @XmlSchemaType(name = "normalizedString")
    protected GroupSizeChangesEnumeration groupSizeChanges;
    @XmlElement(name = "Ticketing")
    @XmlSchemaType(name = "normalizedString")
    protected GroupTicketingEnumeration ticketing;
    @XmlElement(name = "JointCheckIn")
    @XmlSchemaType(name = "normalizedString")
    protected GroupCheckInEnumeration jointCheckIn;
    @XmlElement(name = "GroupBookingFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "normalizedString")
    protected GroupBookingEnumeration groupBookingFacility;

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
     * Ruft den Wert der minimumNumberOfPersons-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumNumberOfPersons() {
        return minimumNumberOfPersons;
    }

    /**
     * Legt den Wert der minimumNumberOfPersons-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumNumberOfPersons(BigInteger value) {
        this.minimumNumberOfPersons = value;
    }

    /**
     * Ruft den Wert der maximumNumberOfPersons-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfPersons() {
        return maximumNumberOfPersons;
    }

    /**
     * Legt den Wert der maximumNumberOfPersons-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfPersons(BigInteger value) {
        this.maximumNumberOfPersons = value;
    }

    /**
     * Ruft den Wert der minimumNumberOfCardHolders-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumNumberOfCardHolders() {
        return minimumNumberOfCardHolders;
    }

    /**
     * Legt den Wert der minimumNumberOfCardHolders-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumNumberOfCardHolders(BigInteger value) {
        this.minimumNumberOfCardHolders = value;
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

    /**
     * Ruft den Wert der pricingBasis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PerBasisEnumeration }
     *     
     */
    public PerBasisEnumeration getPricingBasis() {
        return pricingBasis;
    }

    /**
     * Legt den Wert der pricingBasis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PerBasisEnumeration }
     *     
     */
    public void setPricingBasis(PerBasisEnumeration value) {
        this.pricingBasis = value;
    }

    /**
     * Ruft den Wert der maximumPersonsFree-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumPersonsFree() {
        return maximumPersonsFree;
    }

    /**
     * Legt den Wert der maximumPersonsFree-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumPersonsFree(BigInteger value) {
        this.maximumPersonsFree = value;
    }

    /**
     * Ruft den Wert der maximumPersonsDiscounted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumPersonsDiscounted() {
        return maximumPersonsDiscounted;
    }

    /**
     * Legt den Wert der maximumPersonsDiscounted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumPersonsDiscounted(BigInteger value) {
        this.maximumPersonsDiscounted = value;
    }

    /**
     * Ruft den Wert der discountOnlyForFirstPerson-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiscountOnlyForFirstPerson() {
        return discountOnlyForFirstPerson;
    }

    /**
     * Legt den Wert der discountOnlyForFirstPerson-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscountOnlyForFirstPerson(Boolean value) {
        this.discountOnlyForFirstPerson = value;
    }

    /**
     * Ruft den Wert der oneForNPersons-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOneForNPersons() {
        return oneForNPersons;
    }

    /**
     * Legt den Wert der oneForNPersons-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOneForNPersons(BigInteger value) {
        this.oneForNPersons = value;
    }

    /**
     * Ruft den Wert der groupSizeChanges-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupSizeChangesEnumeration }
     *     
     */
    public GroupSizeChangesEnumeration getGroupSizeChanges() {
        return groupSizeChanges;
    }

    /**
     * Legt den Wert der groupSizeChanges-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupSizeChangesEnumeration }
     *     
     */
    public void setGroupSizeChanges(GroupSizeChangesEnumeration value) {
        this.groupSizeChanges = value;
    }

    /**
     * Ruft den Wert der ticketing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupTicketingEnumeration }
     *     
     */
    public GroupTicketingEnumeration getTicketing() {
        return ticketing;
    }

    /**
     * Legt den Wert der ticketing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupTicketingEnumeration }
     *     
     */
    public void setTicketing(GroupTicketingEnumeration value) {
        this.ticketing = value;
    }

    /**
     * Ruft den Wert der jointCheckIn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupCheckInEnumeration }
     *     
     */
    public GroupCheckInEnumeration getJointCheckIn() {
        return jointCheckIn;
    }

    /**
     * Legt den Wert der jointCheckIn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupCheckInEnumeration }
     *     
     */
    public void setJointCheckIn(GroupCheckInEnumeration value) {
        this.jointCheckIn = value;
    }

    /**
     * Ruft den Wert der groupBookingFacility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupBookingEnumeration }
     *     
     */
    public GroupBookingEnumeration getGroupBookingFacility() {
        return groupBookingFacility;
    }

    /**
     * Legt den Wert der groupBookingFacility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupBookingEnumeration }
     *     
     */
    public void setGroupBookingFacility(GroupBookingEnumeration value) {
        this.groupBookingFacility = value;
    }

}
