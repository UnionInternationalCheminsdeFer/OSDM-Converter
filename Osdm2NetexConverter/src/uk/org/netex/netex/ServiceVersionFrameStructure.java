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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a SERVICE FRAME.
 * 
 * <p>Java-Klasse f�r Service_VersionFrameStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Service_VersionFrameStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Common_VersionFrameStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ServiceFrameGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service_VersionFrameStructure", propOrder = {
    "network",
    "additionalNetworks",
    "directions",
    "routePoints",
    "routeLinks",
    "routes",
    "flexiblePointProperties",
    "flexibleLinkProperties",
    "commonSections",
    "generalSections",
    "projections",
    "groupsOfLinks",
    "groupsOfPoints",
    "lines",
    "groupsOfLines",
    "destinationDisplays",
    "lineNetworks",
    "scheduledStopPoints",
    "serviceLinks",
    "servicePatterns",
    "stopAreas",
    "connections",
    "tariffZones",
    "stopAssignments",
    "timingPoints",
    "timingLinks",
    "timingPatterns",
    "journeyPatterns",
    "transferRestrictions",
    "routingConstraintZones",
    "serviceExclusions",
    "timeDemandTypes",
    "timeDemandTypeAssignments",
    "timingLinkGroups",
    "notices",
    "noticeAssignments",
    "logicalDisplays",
    "displayAssignments",
    "passengerInformationEquipments"
})
@XmlSeeAlso({
    ServiceFrame.class
})
public class ServiceVersionFrameStructure
    extends CommonVersionFrameStructure
{

    @XmlElement(name = "Network")
    protected Network network;
    protected NetworksInFrameRelStructure additionalNetworks;
    protected DirectionsInFrameRelStructure directions;
    protected RoutePointsInFrameRelStructure routePoints;
    protected RouteLinksInFrameRelStructure routeLinks;
    protected RoutesInFrameRelStructure routes;
    protected FlexiblePointPropertiesRelStructure flexiblePointProperties;
    protected FlexibleLinkPropertiesRelStructure flexibleLinkProperties;
    protected CommonSectionsInFrameRelStructure commonSections;
    protected GeneralSectionsInFrameRelStructure generalSections;
    protected ProjectionsRelStructure projections;
    protected GroupOfLinksRelStructure groupsOfLinks;
    protected GroupOfPointsRelStructure groupsOfPoints;
    protected LinesInFrameRelStructure lines;
    protected GroupsOfLinesInFrameRelStructure groupsOfLines;
    protected DestinationDisplaysInFrameRelStructure destinationDisplays;
    protected LineNetworksInFrameRelStructure lineNetworks;
    protected ScheduledStopPointsInFrameRelStructure scheduledStopPoints;
    protected ServiceLinksInFrameRelStructure serviceLinks;
    protected ServicePatternsInFrameRelStructure servicePatterns;
    protected StopAreasInFrameRelStructure stopAreas;
    protected TransfersInFrameRelStructure connections;
    protected TariffZonesInFrameRelStructure tariffZones;
    protected StopAssignmentsInFrameRelStructure stopAssignments;
    protected TimingPointsInFrameRelStructure timingPoints;
    protected TimingLinksInFrameRelStructure timingLinks;
    protected TimingPatternsInFrameRelStructure timingPatterns;
    protected JourneyPatternsInFrameRelStructure journeyPatterns;
    protected TransferRestrictionsInFrameRelStructure transferRestrictions;
    protected RoutingConstraintZonesInFrameRelStructure routingConstraintZones;
    protected ServiceExclusionsInFrameRelStructure serviceExclusions;
    protected TimeDemandTypesInFrameRelStructure timeDemandTypes;
    protected TimeDemandTypeAssignmentsInFrameRelStructure timeDemandTypeAssignments;
    protected GroupOfLinksInFrameRelStructure timingLinkGroups;
    protected NoticesInFrameRelStructure notices;
    protected NoticeAssignmentsInFrameRelStructure noticeAssignments;
    protected LogicalDisplaysInFrameRelStructure logicalDisplays;
    protected DisplayAssignmentsInFrameRelStructure displayAssignments;
    protected PassengerInformationEquipmentsInFrameRelStructure passengerInformationEquipments;

    /**
     * Ruft den Wert der network-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Network }
     *     
     */
    public Network getNetwork() {
        return network;
    }

    /**
     * Legt den Wert der network-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Network }
     *     
     */
    public void setNetwork(Network value) {
        this.network = value;
    }

    /**
     * Ruft den Wert der additionalNetworks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NetworksInFrameRelStructure }
     *     
     */
    public NetworksInFrameRelStructure getAdditionalNetworks() {
        return additionalNetworks;
    }

    /**
     * Legt den Wert der additionalNetworks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworksInFrameRelStructure }
     *     
     */
    public void setAdditionalNetworks(NetworksInFrameRelStructure value) {
        this.additionalNetworks = value;
    }

    /**
     * Ruft den Wert der directions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectionsInFrameRelStructure }
     *     
     */
    public DirectionsInFrameRelStructure getDirections() {
        return directions;
    }

    /**
     * Legt den Wert der directions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionsInFrameRelStructure }
     *     
     */
    public void setDirections(DirectionsInFrameRelStructure value) {
        this.directions = value;
    }

    /**
     * Ruft den Wert der routePoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoutePointsInFrameRelStructure }
     *     
     */
    public RoutePointsInFrameRelStructure getRoutePoints() {
        return routePoints;
    }

    /**
     * Legt den Wert der routePoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePointsInFrameRelStructure }
     *     
     */
    public void setRoutePoints(RoutePointsInFrameRelStructure value) {
        this.routePoints = value;
    }

    /**
     * Ruft den Wert der routeLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RouteLinksInFrameRelStructure }
     *     
     */
    public RouteLinksInFrameRelStructure getRouteLinks() {
        return routeLinks;
    }

    /**
     * Legt den Wert der routeLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteLinksInFrameRelStructure }
     *     
     */
    public void setRouteLinks(RouteLinksInFrameRelStructure value) {
        this.routeLinks = value;
    }

    /**
     * Ruft den Wert der routes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoutesInFrameRelStructure }
     *     
     */
    public RoutesInFrameRelStructure getRoutes() {
        return routes;
    }

    /**
     * Legt den Wert der routes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutesInFrameRelStructure }
     *     
     */
    public void setRoutes(RoutesInFrameRelStructure value) {
        this.routes = value;
    }

    /**
     * Ruft den Wert der flexiblePointProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlexiblePointPropertiesRelStructure }
     *     
     */
    public FlexiblePointPropertiesRelStructure getFlexiblePointProperties() {
        return flexiblePointProperties;
    }

    /**
     * Legt den Wert der flexiblePointProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexiblePointPropertiesRelStructure }
     *     
     */
    public void setFlexiblePointProperties(FlexiblePointPropertiesRelStructure value) {
        this.flexiblePointProperties = value;
    }

    /**
     * Ruft den Wert der flexibleLinkProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleLinkPropertiesRelStructure }
     *     
     */
    public FlexibleLinkPropertiesRelStructure getFlexibleLinkProperties() {
        return flexibleLinkProperties;
    }

    /**
     * Legt den Wert der flexibleLinkProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleLinkPropertiesRelStructure }
     *     
     */
    public void setFlexibleLinkProperties(FlexibleLinkPropertiesRelStructure value) {
        this.flexibleLinkProperties = value;
    }

    /**
     * Ruft den Wert der commonSections-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CommonSectionsInFrameRelStructure }
     *     
     */
    public CommonSectionsInFrameRelStructure getCommonSections() {
        return commonSections;
    }

    /**
     * Legt den Wert der commonSections-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonSectionsInFrameRelStructure }
     *     
     */
    public void setCommonSections(CommonSectionsInFrameRelStructure value) {
        this.commonSections = value;
    }

    /**
     * Ruft den Wert der generalSections-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeneralSectionsInFrameRelStructure }
     *     
     */
    public GeneralSectionsInFrameRelStructure getGeneralSections() {
        return generalSections;
    }

    /**
     * Legt den Wert der generalSections-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralSectionsInFrameRelStructure }
     *     
     */
    public void setGeneralSections(GeneralSectionsInFrameRelStructure value) {
        this.generalSections = value;
    }

    /**
     * Ruft den Wert der projections-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProjectionsRelStructure }
     *     
     */
    public ProjectionsRelStructure getProjections() {
        return projections;
    }

    /**
     * Legt den Wert der projections-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectionsRelStructure }
     *     
     */
    public void setProjections(ProjectionsRelStructure value) {
        this.projections = value;
    }

    /**
     * Ruft den Wert der groupsOfLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLinksRelStructure }
     *     
     */
    public GroupOfLinksRelStructure getGroupsOfLinks() {
        return groupsOfLinks;
    }

    /**
     * Legt den Wert der groupsOfLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLinksRelStructure }
     *     
     */
    public void setGroupsOfLinks(GroupOfLinksRelStructure value) {
        this.groupsOfLinks = value;
    }

    /**
     * Ruft den Wert der groupsOfPoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfPointsRelStructure }
     *     
     */
    public GroupOfPointsRelStructure getGroupsOfPoints() {
        return groupsOfPoints;
    }

    /**
     * Legt den Wert der groupsOfPoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfPointsRelStructure }
     *     
     */
    public void setGroupsOfPoints(GroupOfPointsRelStructure value) {
        this.groupsOfPoints = value;
    }

    /**
     * Ruft den Wert der lines-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinesInFrameRelStructure }
     *     
     */
    public LinesInFrameRelStructure getLines() {
        return lines;
    }

    /**
     * Legt den Wert der lines-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinesInFrameRelStructure }
     *     
     */
    public void setLines(LinesInFrameRelStructure value) {
        this.lines = value;
    }

    /**
     * Ruft den Wert der groupsOfLines-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupsOfLinesInFrameRelStructure }
     *     
     */
    public GroupsOfLinesInFrameRelStructure getGroupsOfLines() {
        return groupsOfLines;
    }

    /**
     * Legt den Wert der groupsOfLines-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupsOfLinesInFrameRelStructure }
     *     
     */
    public void setGroupsOfLines(GroupsOfLinesInFrameRelStructure value) {
        this.groupsOfLines = value;
    }

    /**
     * Ruft den Wert der destinationDisplays-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DestinationDisplaysInFrameRelStructure }
     *     
     */
    public DestinationDisplaysInFrameRelStructure getDestinationDisplays() {
        return destinationDisplays;
    }

    /**
     * Legt den Wert der destinationDisplays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationDisplaysInFrameRelStructure }
     *     
     */
    public void setDestinationDisplays(DestinationDisplaysInFrameRelStructure value) {
        this.destinationDisplays = value;
    }

    /**
     * Ruft den Wert der lineNetworks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LineNetworksInFrameRelStructure }
     *     
     */
    public LineNetworksInFrameRelStructure getLineNetworks() {
        return lineNetworks;
    }

    /**
     * Legt den Wert der lineNetworks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LineNetworksInFrameRelStructure }
     *     
     */
    public void setLineNetworks(LineNetworksInFrameRelStructure value) {
        this.lineNetworks = value;
    }

    /**
     * Ruft den Wert der scheduledStopPoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointsInFrameRelStructure }
     *     
     */
    public ScheduledStopPointsInFrameRelStructure getScheduledStopPoints() {
        return scheduledStopPoints;
    }

    /**
     * Legt den Wert der scheduledStopPoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointsInFrameRelStructure }
     *     
     */
    public void setScheduledStopPoints(ScheduledStopPointsInFrameRelStructure value) {
        this.scheduledStopPoints = value;
    }

    /**
     * Ruft den Wert der serviceLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLinksInFrameRelStructure }
     *     
     */
    public ServiceLinksInFrameRelStructure getServiceLinks() {
        return serviceLinks;
    }

    /**
     * Legt den Wert der serviceLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLinksInFrameRelStructure }
     *     
     */
    public void setServiceLinks(ServiceLinksInFrameRelStructure value) {
        this.serviceLinks = value;
    }

    /**
     * Ruft den Wert der servicePatterns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServicePatternsInFrameRelStructure }
     *     
     */
    public ServicePatternsInFrameRelStructure getServicePatterns() {
        return servicePatterns;
    }

    /**
     * Legt den Wert der servicePatterns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePatternsInFrameRelStructure }
     *     
     */
    public void setServicePatterns(ServicePatternsInFrameRelStructure value) {
        this.servicePatterns = value;
    }

    /**
     * Ruft den Wert der stopAreas-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopAreasInFrameRelStructure }
     *     
     */
    public StopAreasInFrameRelStructure getStopAreas() {
        return stopAreas;
    }

    /**
     * Legt den Wert der stopAreas-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopAreasInFrameRelStructure }
     *     
     */
    public void setStopAreas(StopAreasInFrameRelStructure value) {
        this.stopAreas = value;
    }

    /**
     * Ruft den Wert der connections-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransfersInFrameRelStructure }
     *     
     */
    public TransfersInFrameRelStructure getConnections() {
        return connections;
    }

    /**
     * Legt den Wert der connections-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransfersInFrameRelStructure }
     *     
     */
    public void setConnections(TransfersInFrameRelStructure value) {
        this.connections = value;
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
     * Ruft den Wert der stopAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopAssignmentsInFrameRelStructure }
     *     
     */
    public StopAssignmentsInFrameRelStructure getStopAssignments() {
        return stopAssignments;
    }

    /**
     * Legt den Wert der stopAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopAssignmentsInFrameRelStructure }
     *     
     */
    public void setStopAssignments(StopAssignmentsInFrameRelStructure value) {
        this.stopAssignments = value;
    }

    /**
     * Ruft den Wert der timingPoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimingPointsInFrameRelStructure }
     *     
     */
    public TimingPointsInFrameRelStructure getTimingPoints() {
        return timingPoints;
    }

    /**
     * Legt den Wert der timingPoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingPointsInFrameRelStructure }
     *     
     */
    public void setTimingPoints(TimingPointsInFrameRelStructure value) {
        this.timingPoints = value;
    }

    /**
     * Ruft den Wert der timingLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimingLinksInFrameRelStructure }
     *     
     */
    public TimingLinksInFrameRelStructure getTimingLinks() {
        return timingLinks;
    }

    /**
     * Legt den Wert der timingLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingLinksInFrameRelStructure }
     *     
     */
    public void setTimingLinks(TimingLinksInFrameRelStructure value) {
        this.timingLinks = value;
    }

    /**
     * Ruft den Wert der timingPatterns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimingPatternsInFrameRelStructure }
     *     
     */
    public TimingPatternsInFrameRelStructure getTimingPatterns() {
        return timingPatterns;
    }

    /**
     * Legt den Wert der timingPatterns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingPatternsInFrameRelStructure }
     *     
     */
    public void setTimingPatterns(TimingPatternsInFrameRelStructure value) {
        this.timingPatterns = value;
    }

    /**
     * Ruft den Wert der journeyPatterns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPatternsInFrameRelStructure }
     *     
     */
    public JourneyPatternsInFrameRelStructure getJourneyPatterns() {
        return journeyPatterns;
    }

    /**
     * Legt den Wert der journeyPatterns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPatternsInFrameRelStructure }
     *     
     */
    public void setJourneyPatterns(JourneyPatternsInFrameRelStructure value) {
        this.journeyPatterns = value;
    }

    /**
     * Ruft den Wert der transferRestrictions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransferRestrictionsInFrameRelStructure }
     *     
     */
    public TransferRestrictionsInFrameRelStructure getTransferRestrictions() {
        return transferRestrictions;
    }

    /**
     * Legt den Wert der transferRestrictions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferRestrictionsInFrameRelStructure }
     *     
     */
    public void setTransferRestrictions(TransferRestrictionsInFrameRelStructure value) {
        this.transferRestrictions = value;
    }

    /**
     * Ruft den Wert der routingConstraintZones-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoutingConstraintZonesInFrameRelStructure }
     *     
     */
    public RoutingConstraintZonesInFrameRelStructure getRoutingConstraintZones() {
        return routingConstraintZones;
    }

    /**
     * Legt den Wert der routingConstraintZones-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingConstraintZonesInFrameRelStructure }
     *     
     */
    public void setRoutingConstraintZones(RoutingConstraintZonesInFrameRelStructure value) {
        this.routingConstraintZones = value;
    }

    /**
     * Ruft den Wert der serviceExclusions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceExclusionsInFrameRelStructure }
     *     
     */
    public ServiceExclusionsInFrameRelStructure getServiceExclusions() {
        return serviceExclusions;
    }

    /**
     * Legt den Wert der serviceExclusions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceExclusionsInFrameRelStructure }
     *     
     */
    public void setServiceExclusions(ServiceExclusionsInFrameRelStructure value) {
        this.serviceExclusions = value;
    }

    /**
     * Ruft den Wert der timeDemandTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeDemandTypesInFrameRelStructure }
     *     
     */
    public TimeDemandTypesInFrameRelStructure getTimeDemandTypes() {
        return timeDemandTypes;
    }

    /**
     * Legt den Wert der timeDemandTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDemandTypesInFrameRelStructure }
     *     
     */
    public void setTimeDemandTypes(TimeDemandTypesInFrameRelStructure value) {
        this.timeDemandTypes = value;
    }

    /**
     * Ruft den Wert der timeDemandTypeAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeDemandTypeAssignmentsInFrameRelStructure }
     *     
     */
    public TimeDemandTypeAssignmentsInFrameRelStructure getTimeDemandTypeAssignments() {
        return timeDemandTypeAssignments;
    }

    /**
     * Legt den Wert der timeDemandTypeAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDemandTypeAssignmentsInFrameRelStructure }
     *     
     */
    public void setTimeDemandTypeAssignments(TimeDemandTypeAssignmentsInFrameRelStructure value) {
        this.timeDemandTypeAssignments = value;
    }

    /**
     * Ruft den Wert der timingLinkGroups-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLinksInFrameRelStructure }
     *     
     */
    public GroupOfLinksInFrameRelStructure getTimingLinkGroups() {
        return timingLinkGroups;
    }

    /**
     * Legt den Wert der timingLinkGroups-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLinksInFrameRelStructure }
     *     
     */
    public void setTimingLinkGroups(GroupOfLinksInFrameRelStructure value) {
        this.timingLinkGroups = value;
    }

    /**
     * Ruft den Wert der notices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NoticesInFrameRelStructure }
     *     
     */
    public NoticesInFrameRelStructure getNotices() {
        return notices;
    }

    /**
     * Legt den Wert der notices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticesInFrameRelStructure }
     *     
     */
    public void setNotices(NoticesInFrameRelStructure value) {
        this.notices = value;
    }

    /**
     * Ruft den Wert der noticeAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NoticeAssignmentsInFrameRelStructure }
     *     
     */
    public NoticeAssignmentsInFrameRelStructure getNoticeAssignments() {
        return noticeAssignments;
    }

    /**
     * Legt den Wert der noticeAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeAssignmentsInFrameRelStructure }
     *     
     */
    public void setNoticeAssignments(NoticeAssignmentsInFrameRelStructure value) {
        this.noticeAssignments = value;
    }

    /**
     * Ruft den Wert der logicalDisplays-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LogicalDisplaysInFrameRelStructure }
     *     
     */
    public LogicalDisplaysInFrameRelStructure getLogicalDisplays() {
        return logicalDisplays;
    }

    /**
     * Legt den Wert der logicalDisplays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalDisplaysInFrameRelStructure }
     *     
     */
    public void setLogicalDisplays(LogicalDisplaysInFrameRelStructure value) {
        this.logicalDisplays = value;
    }

    /**
     * Ruft den Wert der displayAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DisplayAssignmentsInFrameRelStructure }
     *     
     */
    public DisplayAssignmentsInFrameRelStructure getDisplayAssignments() {
        return displayAssignments;
    }

    /**
     * Legt den Wert der displayAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayAssignmentsInFrameRelStructure }
     *     
     */
    public void setDisplayAssignments(DisplayAssignmentsInFrameRelStructure value) {
        this.displayAssignments = value;
    }

    /**
     * Ruft den Wert der passengerInformationEquipments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PassengerInformationEquipmentsInFrameRelStructure }
     *     
     */
    public PassengerInformationEquipmentsInFrameRelStructure getPassengerInformationEquipments() {
        return passengerInformationEquipments;
    }

    /**
     * Legt den Wert der passengerInformationEquipments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerInformationEquipmentsInFrameRelStructure }
     *     
     */
    public void setPassengerInformationEquipments(PassengerInformationEquipmentsInFrameRelStructure value) {
        this.passengerInformationEquipments = value;
    }

}
