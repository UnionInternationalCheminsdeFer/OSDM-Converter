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
 * Type for an identified and data managed element making up a STOP PLACE.
 * 
 * <p>Java-Klasse f�r Site_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Site_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}SiteElement_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SiteGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Site_VersionStructure", propOrder = {
    "topographicPlaceRef",
    "topographicPlaceView",
    "additionalTopographicPlaces",
    "siteType",
    "atCentre",
    "locale",
    "organisationRefDummy",
    "operatingOrganisationView",
    "parentSiteRef",
    "adjacentSites",
    "containedInPlaceRef",
    "levels",
    "entrances",
    "siteStructures",
    "equipmentPlaces",
    "placeEquipments",
    "localServices"
})
@XmlSeeAlso({
    StopPlaceVersionStructure.class,
    ServiceSiteVersionStructure.class,
    ParkingVersionStructure.class,
    PointOfInterestVersionStructure.class
})
public abstract class SiteVersionStructure
    extends SiteElementVersionStructure
{

    @XmlElement(name = "TopographicPlaceRef")
    protected TopographicPlaceRefStructure topographicPlaceRef;
    @XmlElement(name = "TopographicPlaceView")
    protected TopographicPlaceView topographicPlaceView;
    protected TopographicPlaceRefsRelStructure additionalTopographicPlaces;
    @XmlElement(name = "SiteType")
    @XmlSchemaType(name = "string")
    protected SiteTypeEnumeration siteType;
    @XmlElement(name = "AtCentre")
    protected Boolean atCentre;
    @XmlElement(name = "Locale")
    protected LocaleStructure locale;
    @XmlElementRef(name = "OrganisationRef_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends OrganisationRefStructure> organisationRefDummy;
    @XmlElement(name = "OperatingOrganisationView")
    protected OrganisationDerivedViewStructure operatingOrganisationView;
    @XmlElement(name = "ParentSiteRef")
    protected SiteRefStructure parentSiteRef;
    protected SiteRefsRelStructure adjacentSites;
    @XmlElement(name = "ContainedInPlaceRef")
    protected TopographicPlaceRefStructure containedInPlaceRef;
    protected LevelsRelStructure levels;
    protected SiteEntrancesRelStructure entrances;
    protected SiteStructuresRelStructure siteStructures;
    protected EquipmentPlacesRelStructure equipmentPlaces;
    protected PlaceEquipmentsRelStructure placeEquipments;
    protected LocalServicesRelStructure localServices;

    /**
     * Ruft den Wert der topographicPlaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public TopographicPlaceRefStructure getTopographicPlaceRef() {
        return topographicPlaceRef;
    }

    /**
     * Legt den Wert der topographicPlaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public void setTopographicPlaceRef(TopographicPlaceRefStructure value) {
        this.topographicPlaceRef = value;
    }

    /**
     * Ruft den Wert der topographicPlaceView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceView }
     *     
     */
    public TopographicPlaceView getTopographicPlaceView() {
        return topographicPlaceView;
    }

    /**
     * Legt den Wert der topographicPlaceView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceView }
     *     
     */
    public void setTopographicPlaceView(TopographicPlaceView value) {
        this.topographicPlaceView = value;
    }

    /**
     * Ruft den Wert der additionalTopographicPlaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceRefsRelStructure }
     *     
     */
    public TopographicPlaceRefsRelStructure getAdditionalTopographicPlaces() {
        return additionalTopographicPlaces;
    }

    /**
     * Legt den Wert der additionalTopographicPlaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceRefsRelStructure }
     *     
     */
    public void setAdditionalTopographicPlaces(TopographicPlaceRefsRelStructure value) {
        this.additionalTopographicPlaces = value;
    }

    /**
     * Ruft den Wert der siteType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SiteTypeEnumeration }
     *     
     */
    public SiteTypeEnumeration getSiteType() {
        return siteType;
    }

    /**
     * Legt den Wert der siteType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteTypeEnumeration }
     *     
     */
    public void setSiteType(SiteTypeEnumeration value) {
        this.siteType = value;
    }

    /**
     * Ruft den Wert der atCentre-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAtCentre() {
        return atCentre;
    }

    /**
     * Legt den Wert der atCentre-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAtCentre(Boolean value) {
        this.atCentre = value;
    }

    /**
     * Ruft den Wert der locale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocaleStructure }
     *     
     */
    public LocaleStructure getLocale() {
        return locale;
    }

    /**
     * Legt den Wert der locale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocaleStructure }
     *     
     */
    public void setLocale(LocaleStructure value) {
        this.locale = value;
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
     * Ruft den Wert der operatingOrganisationView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationDerivedViewStructure }
     *     
     */
    public OrganisationDerivedViewStructure getOperatingOrganisationView() {
        return operatingOrganisationView;
    }

    /**
     * Legt den Wert der operatingOrganisationView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationDerivedViewStructure }
     *     
     */
    public void setOperatingOrganisationView(OrganisationDerivedViewStructure value) {
        this.operatingOrganisationView = value;
    }

    /**
     * Ruft den Wert der parentSiteRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SiteRefStructure }
     *     
     */
    public SiteRefStructure getParentSiteRef() {
        return parentSiteRef;
    }

    /**
     * Legt den Wert der parentSiteRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteRefStructure }
     *     
     */
    public void setParentSiteRef(SiteRefStructure value) {
        this.parentSiteRef = value;
    }

    /**
     * Ruft den Wert der adjacentSites-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SiteRefsRelStructure }
     *     
     */
    public SiteRefsRelStructure getAdjacentSites() {
        return adjacentSites;
    }

    /**
     * Legt den Wert der adjacentSites-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteRefsRelStructure }
     *     
     */
    public void setAdjacentSites(SiteRefsRelStructure value) {
        this.adjacentSites = value;
    }

    /**
     * Ruft den Wert der containedInPlaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public TopographicPlaceRefStructure getContainedInPlaceRef() {
        return containedInPlaceRef;
    }

    /**
     * Legt den Wert der containedInPlaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public void setContainedInPlaceRef(TopographicPlaceRefStructure value) {
        this.containedInPlaceRef = value;
    }

    /**
     * Ruft den Wert der levels-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LevelsRelStructure }
     *     
     */
    public LevelsRelStructure getLevels() {
        return levels;
    }

    /**
     * Legt den Wert der levels-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelsRelStructure }
     *     
     */
    public void setLevels(LevelsRelStructure value) {
        this.levels = value;
    }

    /**
     * Ruft den Wert der entrances-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SiteEntrancesRelStructure }
     *     
     */
    public SiteEntrancesRelStructure getEntrances() {
        return entrances;
    }

    /**
     * Legt den Wert der entrances-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteEntrancesRelStructure }
     *     
     */
    public void setEntrances(SiteEntrancesRelStructure value) {
        this.entrances = value;
    }

    /**
     * Ruft den Wert der siteStructures-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SiteStructuresRelStructure }
     *     
     */
    public SiteStructuresRelStructure getSiteStructures() {
        return siteStructures;
    }

    /**
     * Legt den Wert der siteStructures-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteStructuresRelStructure }
     *     
     */
    public void setSiteStructures(SiteStructuresRelStructure value) {
        this.siteStructures = value;
    }

    /**
     * Ruft den Wert der equipmentPlaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentPlacesRelStructure }
     *     
     */
    public EquipmentPlacesRelStructure getEquipmentPlaces() {
        return equipmentPlaces;
    }

    /**
     * Legt den Wert der equipmentPlaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentPlacesRelStructure }
     *     
     */
    public void setEquipmentPlaces(EquipmentPlacesRelStructure value) {
        this.equipmentPlaces = value;
    }

    /**
     * Ruft den Wert der placeEquipments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlaceEquipmentsRelStructure }
     *     
     */
    public PlaceEquipmentsRelStructure getPlaceEquipments() {
        return placeEquipments;
    }

    /**
     * Legt den Wert der placeEquipments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceEquipmentsRelStructure }
     *     
     */
    public void setPlaceEquipments(PlaceEquipmentsRelStructure value) {
        this.placeEquipments = value;
    }

    /**
     * Ruft den Wert der localServices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocalServicesRelStructure }
     *     
     */
    public LocalServicesRelStructure getLocalServices() {
        return localServices;
    }

    /**
     * Legt den Wert der localServices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalServicesRelStructure }
     *     
     */
    public void setLocalServices(LocalServicesRelStructure value) {
        this.localServices = value;
    }

}
