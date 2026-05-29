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
 * Type for a SITE FRAME.
 * 
 * <p>Java-Klasse f�r Site_VersionFrameStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Site_VersionFrameStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Common_VersionFrameStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SiteFrameGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Site_VersionFrameStructure", propOrder = {
    "countries",
    "topographicPlaces",
    "addresses",
    "accesses",
    "groupsOfSites",
    "groupsOfStopPlaces",
    "stopPlaces",
    "flexibleStopPlaces",
    "taxiRanks",
    "pointsOfInterest",
    "parkings",
    "navigationPaths",
    "pathLinks",
    "pathJunctions",
    "checkConstraints",
    "checkConstraintDelays",
    "checkConstraintThroughputs",
    "pointOfInterestClassifications",
    "pointOfInterestClassificationHierarchies",
    "tariffZones",
    "groupsOfTariffZones",
    "siteFacilitySets",
    "rechargingPointAssignments"
})
@XmlSeeAlso({
    SiteFrame.class
})
public class SiteVersionFrameStructure
    extends CommonVersionFrameStructure
{

    protected CountriesInFrameRelStructure countries;
    protected TopographicPlacesInFrameRelStructure topographicPlaces;
    protected AddressesInFrameRelStructure addresses;
    protected AccessesInFrameRelStructure accesses;
    protected GroupsOfSitesRelStructure groupsOfSites;
    protected GroupsOfStopPlacesInFrameRelStructure groupsOfStopPlaces;
    protected StopPlacesInFrameRelStructure stopPlaces;
    protected FlexibleStopPlacesInFrameRelStructure flexibleStopPlaces;
    protected TaxiRanksInFrameRelStructure taxiRanks;
    protected PointsOfInterestInFrameRelStructure pointsOfInterest;
    protected ParkingsInFrameRelStructure parkings;
    protected NavigationPathsInFrameRelStructure navigationPaths;
    protected SitePathLinksInFrameRelStructure pathLinks;
    protected SitePathJunctionsInFrameRelStructure pathJunctions;
    protected CheckConstraintInFrameRelStructure checkConstraints;
    protected CheckConstraintDelaysInFrameRelStructure checkConstraintDelays;
    protected CheckConstraintThroughputsInFrameRelStructure checkConstraintThroughputs;
    protected SiteVersionFrameStructure.PointOfInterestClassifications pointOfInterestClassifications;
    protected PointOfInterestClassificationHierarchiesInFrameRelStructure pointOfInterestClassificationHierarchies;
    protected TariffZonesInFrameRelStructure tariffZones;
    protected GroupsOfTariffZonesInFrameRelStructure groupsOfTariffZones;
    protected SiteFacilitySetsInFrameRelStructure siteFacilitySets;
    protected RechargingPointAssignmentsRelStructure rechargingPointAssignments;

    /**
     * Ruft den Wert der countries-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountriesInFrameRelStructure }
     *     
     */
    public CountriesInFrameRelStructure getCountries() {
        return countries;
    }

    /**
     * Legt den Wert der countries-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountriesInFrameRelStructure }
     *     
     */
    public void setCountries(CountriesInFrameRelStructure value) {
        this.countries = value;
    }

    /**
     * Ruft den Wert der topographicPlaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlacesInFrameRelStructure }
     *     
     */
    public TopographicPlacesInFrameRelStructure getTopographicPlaces() {
        return topographicPlaces;
    }

    /**
     * Legt den Wert der topographicPlaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlacesInFrameRelStructure }
     *     
     */
    public void setTopographicPlaces(TopographicPlacesInFrameRelStructure value) {
        this.topographicPlaces = value;
    }

    /**
     * Ruft den Wert der addresses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AddressesInFrameRelStructure }
     *     
     */
    public AddressesInFrameRelStructure getAddresses() {
        return addresses;
    }

    /**
     * Legt den Wert der addresses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressesInFrameRelStructure }
     *     
     */
    public void setAddresses(AddressesInFrameRelStructure value) {
        this.addresses = value;
    }

    /**
     * Ruft den Wert der accesses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessesInFrameRelStructure }
     *     
     */
    public AccessesInFrameRelStructure getAccesses() {
        return accesses;
    }

    /**
     * Legt den Wert der accesses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessesInFrameRelStructure }
     *     
     */
    public void setAccesses(AccessesInFrameRelStructure value) {
        this.accesses = value;
    }

    /**
     * Ruft den Wert der groupsOfSites-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupsOfSitesRelStructure }
     *     
     */
    public GroupsOfSitesRelStructure getGroupsOfSites() {
        return groupsOfSites;
    }

    /**
     * Legt den Wert der groupsOfSites-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupsOfSitesRelStructure }
     *     
     */
    public void setGroupsOfSites(GroupsOfSitesRelStructure value) {
        this.groupsOfSites = value;
    }

    /**
     * Ruft den Wert der groupsOfStopPlaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupsOfStopPlacesInFrameRelStructure }
     *     
     */
    public GroupsOfStopPlacesInFrameRelStructure getGroupsOfStopPlaces() {
        return groupsOfStopPlaces;
    }

    /**
     * Legt den Wert der groupsOfStopPlaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupsOfStopPlacesInFrameRelStructure }
     *     
     */
    public void setGroupsOfStopPlaces(GroupsOfStopPlacesInFrameRelStructure value) {
        this.groupsOfStopPlaces = value;
    }

    /**
     * Ruft den Wert der stopPlaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPlacesInFrameRelStructure }
     *     
     */
    public StopPlacesInFrameRelStructure getStopPlaces() {
        return stopPlaces;
    }

    /**
     * Legt den Wert der stopPlaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlacesInFrameRelStructure }
     *     
     */
    public void setStopPlaces(StopPlacesInFrameRelStructure value) {
        this.stopPlaces = value;
    }

    /**
     * Ruft den Wert der flexibleStopPlaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleStopPlacesInFrameRelStructure }
     *     
     */
    public FlexibleStopPlacesInFrameRelStructure getFlexibleStopPlaces() {
        return flexibleStopPlaces;
    }

    /**
     * Legt den Wert der flexibleStopPlaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleStopPlacesInFrameRelStructure }
     *     
     */
    public void setFlexibleStopPlaces(FlexibleStopPlacesInFrameRelStructure value) {
        this.flexibleStopPlaces = value;
    }

    /**
     * Ruft den Wert der taxiRanks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TaxiRanksInFrameRelStructure }
     *     
     */
    public TaxiRanksInFrameRelStructure getTaxiRanks() {
        return taxiRanks;
    }

    /**
     * Legt den Wert der taxiRanks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxiRanksInFrameRelStructure }
     *     
     */
    public void setTaxiRanks(TaxiRanksInFrameRelStructure value) {
        this.taxiRanks = value;
    }

    /**
     * Ruft den Wert der pointsOfInterest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointsOfInterestInFrameRelStructure }
     *     
     */
    public PointsOfInterestInFrameRelStructure getPointsOfInterest() {
        return pointsOfInterest;
    }

    /**
     * Legt den Wert der pointsOfInterest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointsOfInterestInFrameRelStructure }
     *     
     */
    public void setPointsOfInterest(PointsOfInterestInFrameRelStructure value) {
        this.pointsOfInterest = value;
    }

    /**
     * Ruft den Wert der parkings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingsInFrameRelStructure }
     *     
     */
    public ParkingsInFrameRelStructure getParkings() {
        return parkings;
    }

    /**
     * Legt den Wert der parkings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingsInFrameRelStructure }
     *     
     */
    public void setParkings(ParkingsInFrameRelStructure value) {
        this.parkings = value;
    }

    /**
     * Ruft den Wert der navigationPaths-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NavigationPathsInFrameRelStructure }
     *     
     */
    public NavigationPathsInFrameRelStructure getNavigationPaths() {
        return navigationPaths;
    }

    /**
     * Legt den Wert der navigationPaths-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NavigationPathsInFrameRelStructure }
     *     
     */
    public void setNavigationPaths(NavigationPathsInFrameRelStructure value) {
        this.navigationPaths = value;
    }

    /**
     * Ruft den Wert der pathLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SitePathLinksInFrameRelStructure }
     *     
     */
    public SitePathLinksInFrameRelStructure getPathLinks() {
        return pathLinks;
    }

    /**
     * Legt den Wert der pathLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SitePathLinksInFrameRelStructure }
     *     
     */
    public void setPathLinks(SitePathLinksInFrameRelStructure value) {
        this.pathLinks = value;
    }

    /**
     * Ruft den Wert der pathJunctions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SitePathJunctionsInFrameRelStructure }
     *     
     */
    public SitePathJunctionsInFrameRelStructure getPathJunctions() {
        return pathJunctions;
    }

    /**
     * Legt den Wert der pathJunctions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SitePathJunctionsInFrameRelStructure }
     *     
     */
    public void setPathJunctions(SitePathJunctionsInFrameRelStructure value) {
        this.pathJunctions = value;
    }

    /**
     * Ruft den Wert der checkConstraints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CheckConstraintInFrameRelStructure }
     *     
     */
    public CheckConstraintInFrameRelStructure getCheckConstraints() {
        return checkConstraints;
    }

    /**
     * Legt den Wert der checkConstraints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckConstraintInFrameRelStructure }
     *     
     */
    public void setCheckConstraints(CheckConstraintInFrameRelStructure value) {
        this.checkConstraints = value;
    }

    /**
     * Ruft den Wert der checkConstraintDelays-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CheckConstraintDelaysInFrameRelStructure }
     *     
     */
    public CheckConstraintDelaysInFrameRelStructure getCheckConstraintDelays() {
        return checkConstraintDelays;
    }

    /**
     * Legt den Wert der checkConstraintDelays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckConstraintDelaysInFrameRelStructure }
     *     
     */
    public void setCheckConstraintDelays(CheckConstraintDelaysInFrameRelStructure value) {
        this.checkConstraintDelays = value;
    }

    /**
     * Ruft den Wert der checkConstraintThroughputs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CheckConstraintThroughputsInFrameRelStructure }
     *     
     */
    public CheckConstraintThroughputsInFrameRelStructure getCheckConstraintThroughputs() {
        return checkConstraintThroughputs;
    }

    /**
     * Legt den Wert der checkConstraintThroughputs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckConstraintThroughputsInFrameRelStructure }
     *     
     */
    public void setCheckConstraintThroughputs(CheckConstraintThroughputsInFrameRelStructure value) {
        this.checkConstraintThroughputs = value;
    }

    /**
     * Ruft den Wert der pointOfInterestClassifications-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SiteVersionFrameStructure.PointOfInterestClassifications }
     *     
     */
    public SiteVersionFrameStructure.PointOfInterestClassifications getPointOfInterestClassifications() {
        return pointOfInterestClassifications;
    }

    /**
     * Legt den Wert der pointOfInterestClassifications-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteVersionFrameStructure.PointOfInterestClassifications }
     *     
     */
    public void setPointOfInterestClassifications(SiteVersionFrameStructure.PointOfInterestClassifications value) {
        this.pointOfInterestClassifications = value;
    }

    /**
     * Ruft den Wert der pointOfInterestClassificationHierarchies-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInterestClassificationHierarchiesInFrameRelStructure }
     *     
     */
    public PointOfInterestClassificationHierarchiesInFrameRelStructure getPointOfInterestClassificationHierarchies() {
        return pointOfInterestClassificationHierarchies;
    }

    /**
     * Legt den Wert der pointOfInterestClassificationHierarchies-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInterestClassificationHierarchiesInFrameRelStructure }
     *     
     */
    public void setPointOfInterestClassificationHierarchies(PointOfInterestClassificationHierarchiesInFrameRelStructure value) {
        this.pointOfInterestClassificationHierarchies = value;
    }

    /**
     * Ruft den Wert der tariffZones-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TariffZonesInFrameRelStructure }
     *     
     */
    public TariffZonesInFrameRelStructure getTariffZones() {
        return tariffZones;
    }

    /**
     * Legt den Wert der tariffZones-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffZonesInFrameRelStructure }
     *     
     */
    public void setTariffZones(TariffZonesInFrameRelStructure value) {
        this.tariffZones = value;
    }

    /**
     * Ruft den Wert der groupsOfTariffZones-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupsOfTariffZonesInFrameRelStructure }
     *     
     */
    public GroupsOfTariffZonesInFrameRelStructure getGroupsOfTariffZones() {
        return groupsOfTariffZones;
    }

    /**
     * Legt den Wert der groupsOfTariffZones-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupsOfTariffZonesInFrameRelStructure }
     *     
     */
    public void setGroupsOfTariffZones(GroupsOfTariffZonesInFrameRelStructure value) {
        this.groupsOfTariffZones = value;
    }

    /**
     * Ruft den Wert der siteFacilitySets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SiteFacilitySetsInFrameRelStructure }
     *     
     */
    public SiteFacilitySetsInFrameRelStructure getSiteFacilitySets() {
        return siteFacilitySets;
    }

    /**
     * Legt den Wert der siteFacilitySets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteFacilitySetsInFrameRelStructure }
     *     
     */
    public void setSiteFacilitySets(SiteFacilitySetsInFrameRelStructure value) {
        this.siteFacilitySets = value;
    }

    /**
     * Ruft den Wert der rechargingPointAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RechargingPointAssignmentsRelStructure }
     *     
     */
    public RechargingPointAssignmentsRelStructure getRechargingPointAssignments() {
        return rechargingPointAssignments;
    }

    /**
     * Legt den Wert der rechargingPointAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RechargingPointAssignmentsRelStructure }
     *     
     */
    public void setRechargingPointAssignments(RechargingPointAssignmentsRelStructure value) {
        this.rechargingPointAssignments = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.netex.org.uk/netex}pointOfInterestClassificationsInFrame_RelStructure">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PointOfInterestClassifications
        extends PointOfInterestClassificationsInFrameRelStructure
    {


    }

}
