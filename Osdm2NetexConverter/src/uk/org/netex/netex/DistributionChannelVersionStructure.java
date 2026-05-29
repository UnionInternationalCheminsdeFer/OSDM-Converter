//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for DISTRIBUTION CHANNEL.
 * 
 * <p>Java-Klasse f�r DistributionChannel_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DistributionChannel_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}TypeOfValue_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DistributionChannelGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionChannel_VersionStructure", propOrder = {
    "alternativeNames",
    "distributionChannelType",
    "isObligatory",
    "requiresEmailAddress",
    "contactDetails",
    "organisationRefDummy",
    "paymentMethods",
    "typesOfPaymentMethod",
    "distributionRights",
    "distributionPoints",
    "distributionGroupRef"
})
@XmlSeeAlso({
    DistributionChannel.class
})
public class DistributionChannelVersionStructure
    extends TypeOfValueVersionStructure
{

    protected AlternativeNamesRelStructure alternativeNames;
    @XmlElement(name = "DistributionChannelType")
    @XmlSchemaType(name = "normalizedString")
    protected DistributionChannelTypeEnumeration distributionChannelType;
    @XmlElement(name = "IsObligatory")
    protected Boolean isObligatory;
    @XmlElement(name = "RequiresEmailAddress")
    protected Boolean requiresEmailAddress;
    @XmlElement(name = "ContactDetails")
    protected ContactStructure contactDetails;
    @XmlElementRef(name = "OrganisationRef_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends OrganisationRefStructure> organisationRefDummy;
    @XmlList
    @XmlElement(name = "PaymentMethods")
    protected List<PaymentMethodEnumeration> paymentMethods;
    protected TypeOfPaymentMethodRefsRelStructure typesOfPaymentMethod;
    @XmlList
    @XmlElement(name = "DistributionRights")
    protected List<DistributionRightsEnumeration> distributionRights;
    protected PointRefsRelStructure distributionPoints;
    @XmlElement(name = "DistributionGroupRef")
    protected DistributionChannelVersionStructure.DistributionGroupRef distributionGroupRef;

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
     * Ruft den Wert der distributionChannelType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistributionChannelTypeEnumeration }
     *     
     */
    public DistributionChannelTypeEnumeration getDistributionChannelType() {
        return distributionChannelType;
    }

    /**
     * Legt den Wert der distributionChannelType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionChannelTypeEnumeration }
     *     
     */
    public void setDistributionChannelType(DistributionChannelTypeEnumeration value) {
        this.distributionChannelType = value;
    }

    /**
     * Ruft den Wert der isObligatory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsObligatory() {
        return isObligatory;
    }

    /**
     * Legt den Wert der isObligatory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsObligatory(Boolean value) {
        this.isObligatory = value;
    }

    /**
     * Ruft den Wert der requiresEmailAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiresEmailAddress() {
        return requiresEmailAddress;
    }

    /**
     * Legt den Wert der requiresEmailAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiresEmailAddress(Boolean value) {
        this.requiresEmailAddress = value;
    }

    /**
     * Ruft den Wert der contactDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContactStructure }
     *     
     */
    public ContactStructure getContactDetails() {
        return contactDetails;
    }

    /**
     * Legt den Wert der contactDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactStructure }
     *     
     */
    public void setContactDetails(ContactStructure value) {
        this.contactDetails = value;
    }

    /**
     * Ruft den Wert der organisationRefDummy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServicedOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelAgentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineServiceOperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManagementAgentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailConsortiumRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends OrganisationRefStructure> getOrganisationRefDummy() {
        return organisationRefDummy;
    }

    /**
     * Legt den Wert der organisationRefDummy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServicedOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelAgentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineServiceOperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManagementAgentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailConsortiumRefStructure }{@code >}
     *     
     */
    public void setOrganisationRefDummy(JAXBElement<? extends OrganisationRefStructure> value) {
        this.organisationRefDummy = value;
    }

    /**
     * Gets the value of the paymentMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMethodEnumeration }
     * 
     * 
     */
    public List<PaymentMethodEnumeration> getPaymentMethods() {
        if (paymentMethods == null) {
            paymentMethods = new ArrayList<PaymentMethodEnumeration>();
        }
        return this.paymentMethods;
    }

    /**
     * Ruft den Wert der typesOfPaymentMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPaymentMethodRefsRelStructure }
     *     
     */
    public TypeOfPaymentMethodRefsRelStructure getTypesOfPaymentMethod() {
        return typesOfPaymentMethod;
    }

    /**
     * Legt den Wert der typesOfPaymentMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPaymentMethodRefsRelStructure }
     *     
     */
    public void setTypesOfPaymentMethod(TypeOfPaymentMethodRefsRelStructure value) {
        this.typesOfPaymentMethod = value;
    }

    /**
     * Gets the value of the distributionRights property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionRights property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionRights().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributionRightsEnumeration }
     * 
     * 
     */
    public List<DistributionRightsEnumeration> getDistributionRights() {
        if (distributionRights == null) {
            distributionRights = new ArrayList<DistributionRightsEnumeration>();
        }
        return this.distributionRights;
    }

    /**
     * Ruft den Wert der distributionPoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointRefsRelStructure }
     *     
     */
    public PointRefsRelStructure getDistributionPoints() {
        return distributionPoints;
    }

    /**
     * Legt den Wert der distributionPoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointRefsRelStructure }
     *     
     */
    public void setDistributionPoints(PointRefsRelStructure value) {
        this.distributionPoints = value;
    }

    /**
     * Ruft den Wert der distributionGroupRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistributionChannelVersionStructure.DistributionGroupRef }
     *     
     */
    public DistributionChannelVersionStructure.DistributionGroupRef getDistributionGroupRef() {
        return distributionGroupRef;
    }

    /**
     * Legt den Wert der distributionGroupRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionChannelVersionStructure.DistributionGroupRef }
     *     
     */
    public void setDistributionGroupRef(DistributionChannelVersionStructure.DistributionGroupRef value) {
        this.distributionGroupRef = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;restriction base="&lt;http://www.netex.org.uk/netex>GeneralGroupOfEntitiesRefStructure">
     *       &lt;attGroup ref="{http://www.netex.org.uk/netex}ReferenceModificationDetailsGroup"/>
     *       &lt;attribute name="nameOfMemberClass" type="{http://www.netex.org.uk/netex}NameOfClass" />
     *       &lt;attribute name="nameOfRefClass" type="{http://www.netex.org.uk/netex}NameOfClassGeneralGroupOfEntitiesRefStructureType" />
     *       &lt;attribute name="modification" type="{http://www.netex.org.uk/netex}ModificationEnumeration" />
     *       &lt;attribute name="ref" use="required" type="{http://www.netex.org.uk/netex}GeneralGroupOfEntitiesIdType" />
     *       &lt;attribute name="versionRef" type="{http://www.netex.org.uk/netex}VersionIdType" />
     *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *     &lt;/restriction>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DistributionGroupRef
        extends GeneralGroupOfEntitiesRefStructure
    {


    }

}
