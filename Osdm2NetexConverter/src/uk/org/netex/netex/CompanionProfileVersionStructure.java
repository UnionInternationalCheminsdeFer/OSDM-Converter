//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for COMPANION PROFILE.
 * 
 * <p>Java-Klasse f�r CompanionProfile_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CompanionProfile_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CompanionProfileGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanionProfile_VersionStructure", propOrder = {
    "parentRef",
    "userProfileRef",
    "companionRelationshipType",
    "minimumNumberOfPersons",
    "maximumNumberOfPersons",
    "discountBasis"
})
@XmlSeeAlso({
    CompanionProfile.class
})
public class CompanionProfileVersionStructure
    extends UsageParameterVersionStructure
{

    @XmlElement(name = "ParentRef")
    protected UsageParameterRefStructure parentRef;
    @XmlElementRef(name = "UserProfileRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends UserProfileRefStructure> userProfileRef;
    @XmlElement(name = "CompanionRelationshipType", defaultValue = "anyone")
    @XmlSchemaType(name = "normalizedString")
    protected CompanionRelationshipEnumeration companionRelationshipType;
    @XmlElement(name = "MinimumNumberOfPersons")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minimumNumberOfPersons;
    @XmlElement(name = "MaximumNumberOfPersons")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumNumberOfPersons;
    @XmlElement(name = "DiscountBasis")
    @XmlSchemaType(name = "normalizedString")
    protected DiscountBasisEnumeration discountBasis;

    /**
     * Ruft den Wert der parentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UsageParameterRefStructure }
     *     
     */
    public UsageParameterRefStructure getParentRef() {
        return parentRef;
    }

    /**
     * Legt den Wert der parentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageParameterRefStructure }
     *     
     */
    public void setParentRef(UsageParameterRefStructure value) {
        this.parentRef = value;
    }

    /**
     * Ruft den Wert der userProfileRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CompanionProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolerProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserProfileRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends UserProfileRefStructure> getUserProfileRef() {
        return userProfileRef;
    }

    /**
     * Legt den Wert der userProfileRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CompanionProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolerProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserProfileRefStructure }{@code >}
     *     
     */
    public void setUserProfileRef(JAXBElement<? extends UserProfileRefStructure> value) {
        this.userProfileRef = value;
    }

    /**
     * Ruft den Wert der companionRelationshipType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompanionRelationshipEnumeration }
     *     
     */
    public CompanionRelationshipEnumeration getCompanionRelationshipType() {
        return companionRelationshipType;
    }

    /**
     * Legt den Wert der companionRelationshipType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanionRelationshipEnumeration }
     *     
     */
    public void setCompanionRelationshipType(CompanionRelationshipEnumeration value) {
        this.companionRelationshipType = value;
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

}
