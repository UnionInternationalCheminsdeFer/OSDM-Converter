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
 * Type for an ORGANISATION PART.
 * 
 * <p>Java-Klasse f�r OrganisationPart_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OrganisationPart_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}OrganisationPartGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationPart_VersionStructure", propOrder = {
    "name",
    "shortName",
    "description",
    "publicCode",
    "privateCode",
    "contactDetails",
    "location",
    "organisationRefDummy",
    "typeOfOrganisationPartRef",
    "administrativeZones",
    "ownResponsibilitySets",
    "delegatedResponsibilitySets",
    "delegatedFrom"
})
@XmlSeeAlso({
    OrganisationPart.class,
    DepartmentVersionStructure.class,
    ControlCentreVersionStructure.class,
    OrganisationalUnitVersionStructure.class
})
public class OrganisationPartVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "ShortName")
    protected MultilingualString shortName;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "PublicCode")
    protected PublicCodeStructure publicCode;
    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElement(name = "ContactDetails")
    protected ContactStructure contactDetails;
    @XmlElement(name = "Location")
    protected LocationStructure location;
    @XmlElementRef(name = "OrganisationRef_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends OrganisationRefStructure> organisationRefDummy;
    @XmlElement(name = "TypeOfOrganisationPartRef")
    protected TypeOfOrganisationPartRef typeOfOrganisationPartRef;
    protected AdministrativeZonesRelStructure administrativeZones;
    protected ResponsibilitySetsRelStructure ownResponsibilitySets;
    protected ResponsibilitySetsRelStructure delegatedResponsibilitySets;
    protected OrganisationRefsRelStructure delegatedFrom;

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
     * Ruft den Wert der shortName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getShortName() {
        return shortName;
    }

    /**
     * Legt den Wert der shortName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setShortName(MultilingualString value) {
        this.shortName = value;
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
     * Ruft den Wert der publicCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublicCodeStructure }
     *     
     */
    public PublicCodeStructure getPublicCode() {
        return publicCode;
    }

    /**
     * Legt den Wert der publicCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicCodeStructure }
     *     
     */
    public void setPublicCode(PublicCodeStructure value) {
        this.publicCode = value;
    }

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
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setLocation(LocationStructure value) {
        this.location = value;
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
     * Ruft den Wert der typeOfOrganisationPartRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfOrganisationPartRef }
     *     
     */
    public TypeOfOrganisationPartRef getTypeOfOrganisationPartRef() {
        return typeOfOrganisationPartRef;
    }

    /**
     * Legt den Wert der typeOfOrganisationPartRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfOrganisationPartRef }
     *     
     */
    public void setTypeOfOrganisationPartRef(TypeOfOrganisationPartRef value) {
        this.typeOfOrganisationPartRef = value;
    }

    /**
     * Ruft den Wert der administrativeZones-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AdministrativeZonesRelStructure }
     *     
     */
    public AdministrativeZonesRelStructure getAdministrativeZones() {
        return administrativeZones;
    }

    /**
     * Legt den Wert der administrativeZones-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrativeZonesRelStructure }
     *     
     */
    public void setAdministrativeZones(AdministrativeZonesRelStructure value) {
        this.administrativeZones = value;
    }

    /**
     * Ruft den Wert der ownResponsibilitySets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponsibilitySetsRelStructure }
     *     
     */
    public ResponsibilitySetsRelStructure getOwnResponsibilitySets() {
        return ownResponsibilitySets;
    }

    /**
     * Legt den Wert der ownResponsibilitySets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsibilitySetsRelStructure }
     *     
     */
    public void setOwnResponsibilitySets(ResponsibilitySetsRelStructure value) {
        this.ownResponsibilitySets = value;
    }

    /**
     * Ruft den Wert der delegatedResponsibilitySets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponsibilitySetsRelStructure }
     *     
     */
    public ResponsibilitySetsRelStructure getDelegatedResponsibilitySets() {
        return delegatedResponsibilitySets;
    }

    /**
     * Legt den Wert der delegatedResponsibilitySets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsibilitySetsRelStructure }
     *     
     */
    public void setDelegatedResponsibilitySets(ResponsibilitySetsRelStructure value) {
        this.delegatedResponsibilitySets = value;
    }

    /**
     * Ruft den Wert der delegatedFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationRefsRelStructure }
     *     
     */
    public OrganisationRefsRelStructure getDelegatedFrom() {
        return delegatedFrom;
    }

    /**
     * Legt den Wert der delegatedFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationRefsRelStructure }
     *     
     */
    public void setDelegatedFrom(OrganisationRefsRelStructure value) {
        this.delegatedFrom = value;
    }

}
