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
 * Type for TIMETABLE FRAME.
 * 
 * <p>Java-Klasse f�r Timetable_VersionFrameStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Timetable_VersionFrameStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Common_VersionFrameStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TimetableFrameGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Timetable_VersionFrameStructure", propOrder = {
    "vehicleModes",
    "headwayService",
    "monitored",
    "networkView",
    "lineView",
    "operatorView",
    "serviceCalendarFrameRef",
    "defaultMode",
    "journeyAccountingRef",
    "bookingTimes",
    "accessibilityAssessment",
    "transportTypeRef",
    "timeDemandTypes",
    "timeDemandTypeAssignments",
    "timingLinkGroups",
    "vehicleJourneys",
    "frequencyGroups",
    "groupsOfServices",
    "trainNumbers",
    "journeyPartCouples",
    "coupledJourneys",
    "serviceFacilitySets",
    "restrictedServiceFacilitySets",
    "deckPlanAssignments",
    "typesOfService",
    "flexibleServiceProperties",
    "vehicleJourneyStopAssignments",
    "notices",
    "noticeAssignments",
    "journeyMeetings",
    "journeyInterchanges",
    "defaultInterchanges",
    "interchangeRules",
    "vehicleTypes",
    "journeyAccountings",
    "occupancies"
})
@XmlSeeAlso({
    TimetableFrame.class
})
public class TimetableVersionFrameStructure
    extends CommonVersionFrameStructure
{

    @XmlList
    @XmlElement(name = "VehicleModes")
    protected List<AllPublicTransportModesEnumeration> vehicleModes;
    @XmlElement(name = "HeadwayService")
    protected Boolean headwayService;
    @XmlElement(name = "Monitored", defaultValue = "true")
    protected Boolean monitored;
    @XmlElement(name = "NetworkView")
    protected NetworkView networkView;
    @XmlElement(name = "LineView")
    protected LineView lineView;
    @XmlElement(name = "OperatorView")
    protected OperatorView operatorView;
    @XmlElement(name = "ServiceCalendarFrameRef")
    protected ServiceCalendarFrameRef serviceCalendarFrameRef;
    @XmlElement(name = "DefaultMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected AllPublicTransportModesEnumeration defaultMode;
    @XmlElement(name = "JourneyAccountingRef")
    protected JourneyAccountingRefStructure journeyAccountingRef;
    protected ContainedAvailabilityConditionsRelStructure bookingTimes;
    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessment accessibilityAssessment;
    @XmlElementRef(name = "TransportTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TransportTypeRefStructure> transportTypeRef;
    protected TimeDemandTypesInFrameRelStructure timeDemandTypes;
    protected TimeDemandTypeAssignmentsInFrameRelStructure timeDemandTypeAssignments;
    protected GroupOfLinksInFrameRelStructure timingLinkGroups;
    protected JourneysInFrameRelStructure vehicleJourneys;
    protected FrequencyGroupsInFrameRelStructure frequencyGroups;
    protected GroupsOfServicesInFrameRelStructure groupsOfServices;
    protected TrainNumbersInFrameRelStructure trainNumbers;
    protected JourneyPartCouplesInFrameRelStructure journeyPartCouples;
    protected CoupledJourneysInFrameRelStructure coupledJourneys;
    protected ServiceFacilitySetsInFrameRelStructure serviceFacilitySets;
    protected RestrictedServiceFacilitySetsInFrameRelStructure restrictedServiceFacilitySets;
    protected DeckPlanAssignmentsRelStructure deckPlanAssignments;
    protected TypesOfServiceInFrameRelStructure typesOfService;
    protected FlexibleServicePropertiesInFrameRelStructure flexibleServiceProperties;
    protected VehicleJourneyStopAssignmentsInFrameRelStructure vehicleJourneyStopAssignments;
    protected NoticesInFrameRelStructure notices;
    protected NoticeAssignmentsInFrameRelStructure noticeAssignments;
    protected JourneyMeetingsInFrameRelStructure journeyMeetings;
    protected JourneyInterchangesInFrameRelStructure journeyInterchanges;
    protected DefaultInterchangesInFrameRelStructure defaultInterchanges;
    protected InterchangeRulesInFrameRelStructure interchangeRules;
    protected VehicleTypesInFrameRelStructure vehicleTypes;
    protected JourneyAccountingsInFrameRelStructure journeyAccountings;
    protected OccupancyViewInFrameRelStructure occupancies;

    /**
     * Gets the value of the vehicleModes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleModes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllPublicTransportModesEnumeration }
     * 
     * 
     */
    public List<AllPublicTransportModesEnumeration> getVehicleModes() {
        if (vehicleModes == null) {
            vehicleModes = new ArrayList<AllPublicTransportModesEnumeration>();
        }
        return this.vehicleModes;
    }

    /**
     * Ruft den Wert der headwayService-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeadwayService() {
        return headwayService;
    }

    /**
     * Legt den Wert der headwayService-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeadwayService(Boolean value) {
        this.headwayService = value;
    }

    /**
     * Ruft den Wert der monitored-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonitored() {
        return monitored;
    }

    /**
     * Legt den Wert der monitored-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonitored(Boolean value) {
        this.monitored = value;
    }

    /**
     * Ruft den Wert der networkView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NetworkView }
     *     
     */
    public NetworkView getNetworkView() {
        return networkView;
    }

    /**
     * Legt den Wert der networkView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkView }
     *     
     */
    public void setNetworkView(NetworkView value) {
        this.networkView = value;
    }

    /**
     * Ruft den Wert der lineView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LineView }
     *     
     */
    public LineView getLineView() {
        return lineView;
    }

    /**
     * Legt den Wert der lineView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LineView }
     *     
     */
    public void setLineView(LineView value) {
        this.lineView = value;
    }

    /**
     * Ruft den Wert der operatorView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatorView }
     *     
     */
    public OperatorView getOperatorView() {
        return operatorView;
    }

    /**
     * Legt den Wert der operatorView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorView }
     *     
     */
    public void setOperatorView(OperatorView value) {
        this.operatorView = value;
    }

    /**
     * Ruft den Wert der serviceCalendarFrameRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCalendarFrameRef }
     *     
     */
    public ServiceCalendarFrameRef getServiceCalendarFrameRef() {
        return serviceCalendarFrameRef;
    }

    /**
     * Legt den Wert der serviceCalendarFrameRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCalendarFrameRef }
     *     
     */
    public void setServiceCalendarFrameRef(ServiceCalendarFrameRef value) {
        this.serviceCalendarFrameRef = value;
    }

    /**
     * Ruft den Wert der defaultMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public AllPublicTransportModesEnumeration getDefaultMode() {
        return defaultMode;
    }

    /**
     * Legt den Wert der defaultMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public void setDefaultMode(AllPublicTransportModesEnumeration value) {
        this.defaultMode = value;
    }

    /**
     * Ruft den Wert der journeyAccountingRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyAccountingRefStructure }
     *     
     */
    public JourneyAccountingRefStructure getJourneyAccountingRef() {
        return journeyAccountingRef;
    }

    /**
     * Legt den Wert der journeyAccountingRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyAccountingRefStructure }
     *     
     */
    public void setJourneyAccountingRef(JourneyAccountingRefStructure value) {
        this.journeyAccountingRef = value;
    }

    /**
     * Ruft den Wert der bookingTimes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContainedAvailabilityConditionsRelStructure }
     *     
     */
    public ContainedAvailabilityConditionsRelStructure getBookingTimes() {
        return bookingTimes;
    }

    /**
     * Legt den Wert der bookingTimes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainedAvailabilityConditionsRelStructure }
     *     
     */
    public void setBookingTimes(ContainedAvailabilityConditionsRelStructure value) {
        this.bookingTimes = value;
    }

    /**
     * Ruft den Wert der accessibilityAssessment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityAssessment }
     *     
     */
    public AccessibilityAssessment getAccessibilityAssessment() {
        return accessibilityAssessment;
    }

    /**
     * Legt den Wert der accessibilityAssessment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityAssessment }
     *     
     */
    public void setAccessibilityAssessment(AccessibilityAssessment value) {
        this.accessibilityAssessment = value;
    }

    /**
     * Ruft den Wert der transportTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SimpleVehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TransportTypeRefStructure> getTransportTypeRef() {
        return transportTypeRef;
    }

    /**
     * Legt den Wert der transportTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SimpleVehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     
     */
    public void setTransportTypeRef(JAXBElement<? extends TransportTypeRefStructure> value) {
        this.transportTypeRef = value;
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
     * Ruft den Wert der vehicleJourneys-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneysInFrameRelStructure }
     *     
     */
    public JourneysInFrameRelStructure getVehicleJourneys() {
        return vehicleJourneys;
    }

    /**
     * Legt den Wert der vehicleJourneys-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneysInFrameRelStructure }
     *     
     */
    public void setVehicleJourneys(JourneysInFrameRelStructure value) {
        this.vehicleJourneys = value;
    }

    /**
     * Ruft den Wert der frequencyGroups-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyGroupsInFrameRelStructure }
     *     
     */
    public FrequencyGroupsInFrameRelStructure getFrequencyGroups() {
        return frequencyGroups;
    }

    /**
     * Legt den Wert der frequencyGroups-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyGroupsInFrameRelStructure }
     *     
     */
    public void setFrequencyGroups(FrequencyGroupsInFrameRelStructure value) {
        this.frequencyGroups = value;
    }

    /**
     * Ruft den Wert der groupsOfServices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupsOfServicesInFrameRelStructure }
     *     
     */
    public GroupsOfServicesInFrameRelStructure getGroupsOfServices() {
        return groupsOfServices;
    }

    /**
     * Legt den Wert der groupsOfServices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupsOfServicesInFrameRelStructure }
     *     
     */
    public void setGroupsOfServices(GroupsOfServicesInFrameRelStructure value) {
        this.groupsOfServices = value;
    }

    /**
     * Ruft den Wert der trainNumbers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainNumbersInFrameRelStructure }
     *     
     */
    public TrainNumbersInFrameRelStructure getTrainNumbers() {
        return trainNumbers;
    }

    /**
     * Legt den Wert der trainNumbers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainNumbersInFrameRelStructure }
     *     
     */
    public void setTrainNumbers(TrainNumbersInFrameRelStructure value) {
        this.trainNumbers = value;
    }

    /**
     * Ruft den Wert der journeyPartCouples-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPartCouplesInFrameRelStructure }
     *     
     */
    public JourneyPartCouplesInFrameRelStructure getJourneyPartCouples() {
        return journeyPartCouples;
    }

    /**
     * Legt den Wert der journeyPartCouples-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPartCouplesInFrameRelStructure }
     *     
     */
    public void setJourneyPartCouples(JourneyPartCouplesInFrameRelStructure value) {
        this.journeyPartCouples = value;
    }

    /**
     * Ruft den Wert der coupledJourneys-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CoupledJourneysInFrameRelStructure }
     *     
     */
    public CoupledJourneysInFrameRelStructure getCoupledJourneys() {
        return coupledJourneys;
    }

    /**
     * Legt den Wert der coupledJourneys-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CoupledJourneysInFrameRelStructure }
     *     
     */
    public void setCoupledJourneys(CoupledJourneysInFrameRelStructure value) {
        this.coupledJourneys = value;
    }

    /**
     * Ruft den Wert der serviceFacilitySets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFacilitySetsInFrameRelStructure }
     *     
     */
    public ServiceFacilitySetsInFrameRelStructure getServiceFacilitySets() {
        return serviceFacilitySets;
    }

    /**
     * Legt den Wert der serviceFacilitySets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFacilitySetsInFrameRelStructure }
     *     
     */
    public void setServiceFacilitySets(ServiceFacilitySetsInFrameRelStructure value) {
        this.serviceFacilitySets = value;
    }

    /**
     * Ruft den Wert der restrictedServiceFacilitySets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedServiceFacilitySetsInFrameRelStructure }
     *     
     */
    public RestrictedServiceFacilitySetsInFrameRelStructure getRestrictedServiceFacilitySets() {
        return restrictedServiceFacilitySets;
    }

    /**
     * Legt den Wert der restrictedServiceFacilitySets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedServiceFacilitySetsInFrameRelStructure }
     *     
     */
    public void setRestrictedServiceFacilitySets(RestrictedServiceFacilitySetsInFrameRelStructure value) {
        this.restrictedServiceFacilitySets = value;
    }

    /**
     * Ruft den Wert der deckPlanAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckPlanAssignmentsRelStructure }
     *     
     */
    public DeckPlanAssignmentsRelStructure getDeckPlanAssignments() {
        return deckPlanAssignments;
    }

    /**
     * Legt den Wert der deckPlanAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckPlanAssignmentsRelStructure }
     *     
     */
    public void setDeckPlanAssignments(DeckPlanAssignmentsRelStructure value) {
        this.deckPlanAssignments = value;
    }

    /**
     * Ruft den Wert der typesOfService-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypesOfServiceInFrameRelStructure }
     *     
     */
    public TypesOfServiceInFrameRelStructure getTypesOfService() {
        return typesOfService;
    }

    /**
     * Legt den Wert der typesOfService-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypesOfServiceInFrameRelStructure }
     *     
     */
    public void setTypesOfService(TypesOfServiceInFrameRelStructure value) {
        this.typesOfService = value;
    }

    /**
     * Ruft den Wert der flexibleServiceProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleServicePropertiesInFrameRelStructure }
     *     
     */
    public FlexibleServicePropertiesInFrameRelStructure getFlexibleServiceProperties() {
        return flexibleServiceProperties;
    }

    /**
     * Legt den Wert der flexibleServiceProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleServicePropertiesInFrameRelStructure }
     *     
     */
    public void setFlexibleServiceProperties(FlexibleServicePropertiesInFrameRelStructure value) {
        this.flexibleServiceProperties = value;
    }

    /**
     * Ruft den Wert der vehicleJourneyStopAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleJourneyStopAssignmentsInFrameRelStructure }
     *     
     */
    public VehicleJourneyStopAssignmentsInFrameRelStructure getVehicleJourneyStopAssignments() {
        return vehicleJourneyStopAssignments;
    }

    /**
     * Legt den Wert der vehicleJourneyStopAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleJourneyStopAssignmentsInFrameRelStructure }
     *     
     */
    public void setVehicleJourneyStopAssignments(VehicleJourneyStopAssignmentsInFrameRelStructure value) {
        this.vehicleJourneyStopAssignments = value;
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
     * Ruft den Wert der journeyMeetings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyMeetingsInFrameRelStructure }
     *     
     */
    public JourneyMeetingsInFrameRelStructure getJourneyMeetings() {
        return journeyMeetings;
    }

    /**
     * Legt den Wert der journeyMeetings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyMeetingsInFrameRelStructure }
     *     
     */
    public void setJourneyMeetings(JourneyMeetingsInFrameRelStructure value) {
        this.journeyMeetings = value;
    }

    /**
     * Ruft den Wert der journeyInterchanges-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyInterchangesInFrameRelStructure }
     *     
     */
    public JourneyInterchangesInFrameRelStructure getJourneyInterchanges() {
        return journeyInterchanges;
    }

    /**
     * Legt den Wert der journeyInterchanges-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyInterchangesInFrameRelStructure }
     *     
     */
    public void setJourneyInterchanges(JourneyInterchangesInFrameRelStructure value) {
        this.journeyInterchanges = value;
    }

    /**
     * Ruft den Wert der defaultInterchanges-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DefaultInterchangesInFrameRelStructure }
     *     
     */
    public DefaultInterchangesInFrameRelStructure getDefaultInterchanges() {
        return defaultInterchanges;
    }

    /**
     * Legt den Wert der defaultInterchanges-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultInterchangesInFrameRelStructure }
     *     
     */
    public void setDefaultInterchanges(DefaultInterchangesInFrameRelStructure value) {
        this.defaultInterchanges = value;
    }

    /**
     * Ruft den Wert der interchangeRules-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeRulesInFrameRelStructure }
     *     
     */
    public InterchangeRulesInFrameRelStructure getInterchangeRules() {
        return interchangeRules;
    }

    /**
     * Legt den Wert der interchangeRules-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeRulesInFrameRelStructure }
     *     
     */
    public void setInterchangeRules(InterchangeRulesInFrameRelStructure value) {
        this.interchangeRules = value;
    }

    /**
     * Ruft den Wert der vehicleTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTypesInFrameRelStructure }
     *     
     */
    public VehicleTypesInFrameRelStructure getVehicleTypes() {
        return vehicleTypes;
    }

    /**
     * Legt den Wert der vehicleTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTypesInFrameRelStructure }
     *     
     */
    public void setVehicleTypes(VehicleTypesInFrameRelStructure value) {
        this.vehicleTypes = value;
    }

    /**
     * Ruft den Wert der journeyAccountings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyAccountingsInFrameRelStructure }
     *     
     */
    public JourneyAccountingsInFrameRelStructure getJourneyAccountings() {
        return journeyAccountings;
    }

    /**
     * Legt den Wert der journeyAccountings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyAccountingsInFrameRelStructure }
     *     
     */
    public void setJourneyAccountings(JourneyAccountingsInFrameRelStructure value) {
        this.journeyAccountings = value;
    }

    /**
     * Ruft den Wert der occupancies-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OccupancyViewInFrameRelStructure }
     *     
     */
    public OccupancyViewInFrameRelStructure getOccupancies() {
        return occupancies;
    }

    /**
     * Legt den Wert der occupancies-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupancyViewInFrameRelStructure }
     *     
     */
    public void setOccupancies(OccupancyViewInFrameRelStructure value) {
        this.occupancies = value;
    }

}
