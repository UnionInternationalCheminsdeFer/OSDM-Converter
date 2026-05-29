//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Data type for CALL.
 * 
 * <p>Java-Klasse f�r Call_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Call_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CallGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="constrained" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Call_VersionedChildStructure", propOrder = {
    "visitNumber",
    "scheduledStopPointRef",
    "scheduledStopPointView",
    "onwardTimingLinkView",
    "onwardServiceLinkRef",
    "onwardServiceLinkView",
    "timingPointStatus",
    "serviceJourneyRef",
    "pointInJourneyPatternRef",
    "arrival",
    "departure",
    "frequency",
    "destinationDisplayRef",
    "destinationDisplayView",
    "vias",
    "flexiblePointProperties",
    "changeOfDestinationDisplay",
    "changeOfServiceRequirements",
    "noticeAssignments",
    "requestStop",
    "requestMethod",
    "boardingRequestMethod",
    "alightingRequestMethod",
    "stopUse",
    "bookingArrangements",
    "print",
    "dynamic",
    "passengerCarryingRequirementRef",
    "passengerCarryingRequirementsView",
    "trainSize",
    "equipments",
    "note"
})
@XmlSeeAlso({
    Call.class,
    PreviousCallVersionedChildStructure.class,
    MonitoredCallVersionedChildStructure.class,
    OnwardCallVersionedChildStructure.class
})
public class CallVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "VisitNumber", defaultValue = "1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger visitNumber;
    @XmlElementRef(name = "ScheduledStopPointRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ScheduledStopPointRefStructure> scheduledStopPointRef;
    @XmlElement(name = "ScheduledStopPointView")
    protected ScheduledStopPointDerivedViewStructure scheduledStopPointView;
    @XmlElement(name = "OnwardTimingLinkView")
    protected OnwardTimingLinkView onwardTimingLinkView;
    @XmlElement(name = "OnwardServiceLinkRef")
    protected ServiceLinkRefStructure onwardServiceLinkRef;
    @XmlElement(name = "OnwardServiceLinkView")
    protected OnwardServiceLinkView onwardServiceLinkView;
    @XmlElement(name = "TimingPointStatus")
    @XmlSchemaType(name = "normalizedString")
    protected TimingPointStatusEnumeration timingPointStatus;
    @XmlElementRef(name = "ServiceJourneyRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ServiceJourneyRefStructure> serviceJourneyRef;
    @XmlElement(name = "PointInJourneyPatternRef")
    protected PointInJourneyPatternRefStructure pointInJourneyPatternRef;
    @XmlElement(name = "Arrival")
    protected ArrivalStructure arrival;
    @XmlElement(name = "Departure")
    protected DepartureStructure departure;
    @XmlElement(name = "Frequency")
    protected FrequencyStructure frequency;
    @XmlElement(name = "DestinationDisplayRef")
    protected DestinationDisplayRefStructure destinationDisplayRef;
    @XmlElement(name = "DestinationDisplayView")
    protected DestinationDisplayView destinationDisplayView;
    protected ViasRelStructure vias;
    @XmlElement(name = "FlexiblePointProperties")
    protected FlexiblePointProperties flexiblePointProperties;
    @XmlElement(name = "ChangeOfDestinationDisplay")
    protected Boolean changeOfDestinationDisplay;
    @XmlElement(name = "ChangeOfServiceRequirements")
    protected Boolean changeOfServiceRequirements;
    protected CallVersionedChildStructure.NoticeAssignments noticeAssignments;
    @XmlElement(name = "RequestStop", defaultValue = "false")
    protected Boolean requestStop;
    @XmlElement(name = "RequestMethod", defaultValue = "noneRequired")
    @XmlSchemaType(name = "NMTOKEN")
    protected RequestMethodTypeEnumeration requestMethod;
    @XmlList
    @XmlElement(name = "BoardingRequestMethod", defaultValue = "noneRequired")
    protected List<RequestMethodTypeEnumeration> boardingRequestMethod;
    @XmlList
    @XmlElement(name = "AlightingRequestMethod", defaultValue = "noneRequired")
    protected List<RequestMethodTypeEnumeration> alightingRequestMethod;
    @XmlElement(name = "StopUse")
    @XmlSchemaType(name = "NMTOKEN")
    protected StopUseEnumeration stopUse;
    protected BookingArrangementsRelStructure bookingArrangements;
    @XmlElement(name = "Print", defaultValue = "true")
    protected Boolean print;
    @XmlElement(name = "Dynamic", defaultValue = "always")
    @XmlSchemaType(name = "NMTOKEN")
    protected DynamicAdvertisementEnumeration dynamic;
    @XmlElement(name = "PassengerCarryingRequirementRef")
    protected PassengerCarryingRequirementRefStructure passengerCarryingRequirementRef;
    @XmlElement(name = "PassengerCarryingRequirementsView")
    protected PassengerCarryingRequirementsView passengerCarryingRequirementsView;
    @XmlElement(name = "TrainSize")
    protected TrainSizeStructure trainSize;
    protected VehicleEquipmentsRelStructure equipments;
    @XmlElement(name = "Note")
    protected MultilingualString note;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;
    @XmlAttribute(name = "constrained")
    protected Boolean constrained;

    /**
     * Ruft den Wert der visitNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVisitNumber() {
        return visitNumber;
    }

    /**
     * Legt den Wert der visitNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVisitNumber(BigInteger value) {
        this.visitNumber = value;
    }

    /**
     * Ruft den Wert der scheduledStopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ScheduledStopPointRefStructure> getScheduledStopPointRef() {
        return scheduledStopPointRef;
    }

    /**
     * Legt den Wert der scheduledStopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     *     
     */
    public void setScheduledStopPointRef(JAXBElement<? extends ScheduledStopPointRefStructure> value) {
        this.scheduledStopPointRef = value;
    }

    /**
     * Ruft den Wert der scheduledStopPointView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointDerivedViewStructure }
     *     
     */
    public ScheduledStopPointDerivedViewStructure getScheduledStopPointView() {
        return scheduledStopPointView;
    }

    /**
     * Legt den Wert der scheduledStopPointView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointDerivedViewStructure }
     *     
     */
    public void setScheduledStopPointView(ScheduledStopPointDerivedViewStructure value) {
        this.scheduledStopPointView = value;
    }

    /**
     * Ruft den Wert der onwardTimingLinkView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OnwardTimingLinkView }
     *     
     */
    public OnwardTimingLinkView getOnwardTimingLinkView() {
        return onwardTimingLinkView;
    }

    /**
     * Legt den Wert der onwardTimingLinkView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OnwardTimingLinkView }
     *     
     */
    public void setOnwardTimingLinkView(OnwardTimingLinkView value) {
        this.onwardTimingLinkView = value;
    }

    /**
     * Ruft den Wert der onwardServiceLinkRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLinkRefStructure }
     *     
     */
    public ServiceLinkRefStructure getOnwardServiceLinkRef() {
        return onwardServiceLinkRef;
    }

    /**
     * Legt den Wert der onwardServiceLinkRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLinkRefStructure }
     *     
     */
    public void setOnwardServiceLinkRef(ServiceLinkRefStructure value) {
        this.onwardServiceLinkRef = value;
    }

    /**
     * Ruft den Wert der onwardServiceLinkView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OnwardServiceLinkView }
     *     
     */
    public OnwardServiceLinkView getOnwardServiceLinkView() {
        return onwardServiceLinkView;
    }

    /**
     * Legt den Wert der onwardServiceLinkView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OnwardServiceLinkView }
     *     
     */
    public void setOnwardServiceLinkView(OnwardServiceLinkView value) {
        this.onwardServiceLinkView = value;
    }

    /**
     * Ruft den Wert der timingPointStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimingPointStatusEnumeration }
     *     
     */
    public TimingPointStatusEnumeration getTimingPointStatus() {
        return timingPointStatus;
    }

    /**
     * Legt den Wert der timingPointStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingPointStatusEnumeration }
     *     
     */
    public void setTimingPointStatus(TimingPointStatusEnumeration value) {
        this.timingPointStatus = value;
    }

    /**
     * Ruft den Wert der serviceJourneyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ServiceJourneyRefStructure> getServiceJourneyRef() {
        return serviceJourneyRef;
    }

    /**
     * Legt den Wert der serviceJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     
     */
    public void setServiceJourneyRef(JAXBElement<? extends ServiceJourneyRefStructure> value) {
        this.serviceJourneyRef = value;
    }

    /**
     * Ruft den Wert der pointInJourneyPatternRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointInJourneyPatternRefStructure }
     *     
     */
    public PointInJourneyPatternRefStructure getPointInJourneyPatternRef() {
        return pointInJourneyPatternRef;
    }

    /**
     * Legt den Wert der pointInJourneyPatternRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointInJourneyPatternRefStructure }
     *     
     */
    public void setPointInJourneyPatternRef(PointInJourneyPatternRefStructure value) {
        this.pointInJourneyPatternRef = value;
    }

    /**
     * Ruft den Wert der arrival-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalStructure }
     *     
     */
    public ArrivalStructure getArrival() {
        return arrival;
    }

    /**
     * Legt den Wert der arrival-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalStructure }
     *     
     */
    public void setArrival(ArrivalStructure value) {
        this.arrival = value;
    }

    /**
     * Ruft den Wert der departure-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DepartureStructure }
     *     
     */
    public DepartureStructure getDeparture() {
        return departure;
    }

    /**
     * Legt den Wert der departure-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureStructure }
     *     
     */
    public void setDeparture(DepartureStructure value) {
        this.departure = value;
    }

    /**
     * Ruft den Wert der frequency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyStructure }
     *     
     */
    public FrequencyStructure getFrequency() {
        return frequency;
    }

    /**
     * Legt den Wert der frequency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyStructure }
     *     
     */
    public void setFrequency(FrequencyStructure value) {
        this.frequency = value;
    }

    /**
     * Ruft den Wert der destinationDisplayRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DestinationDisplayRefStructure }
     *     
     */
    public DestinationDisplayRefStructure getDestinationDisplayRef() {
        return destinationDisplayRef;
    }

    /**
     * Legt den Wert der destinationDisplayRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationDisplayRefStructure }
     *     
     */
    public void setDestinationDisplayRef(DestinationDisplayRefStructure value) {
        this.destinationDisplayRef = value;
    }

    /**
     * Ruft den Wert der destinationDisplayView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DestinationDisplayView }
     *     
     */
    public DestinationDisplayView getDestinationDisplayView() {
        return destinationDisplayView;
    }

    /**
     * Legt den Wert der destinationDisplayView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationDisplayView }
     *     
     */
    public void setDestinationDisplayView(DestinationDisplayView value) {
        this.destinationDisplayView = value;
    }

    /**
     * Ruft den Wert der vias-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ViasRelStructure }
     *     
     */
    public ViasRelStructure getVias() {
        return vias;
    }

    /**
     * Legt den Wert der vias-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ViasRelStructure }
     *     
     */
    public void setVias(ViasRelStructure value) {
        this.vias = value;
    }

    /**
     * Ruft den Wert der flexiblePointProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlexiblePointProperties }
     *     
     */
    public FlexiblePointProperties getFlexiblePointProperties() {
        return flexiblePointProperties;
    }

    /**
     * Legt den Wert der flexiblePointProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexiblePointProperties }
     *     
     */
    public void setFlexiblePointProperties(FlexiblePointProperties value) {
        this.flexiblePointProperties = value;
    }

    /**
     * Ruft den Wert der changeOfDestinationDisplay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeOfDestinationDisplay() {
        return changeOfDestinationDisplay;
    }

    /**
     * Legt den Wert der changeOfDestinationDisplay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeOfDestinationDisplay(Boolean value) {
        this.changeOfDestinationDisplay = value;
    }

    /**
     * Ruft den Wert der changeOfServiceRequirements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeOfServiceRequirements() {
        return changeOfServiceRequirements;
    }

    /**
     * Legt den Wert der changeOfServiceRequirements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeOfServiceRequirements(Boolean value) {
        this.changeOfServiceRequirements = value;
    }

    /**
     * Ruft den Wert der noticeAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallVersionedChildStructure.NoticeAssignments }
     *     
     */
    public CallVersionedChildStructure.NoticeAssignments getNoticeAssignments() {
        return noticeAssignments;
    }

    /**
     * Legt den Wert der noticeAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallVersionedChildStructure.NoticeAssignments }
     *     
     */
    public void setNoticeAssignments(CallVersionedChildStructure.NoticeAssignments value) {
        this.noticeAssignments = value;
    }

    /**
     * Ruft den Wert der requestStop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestStop() {
        return requestStop;
    }

    /**
     * Legt den Wert der requestStop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestStop(Boolean value) {
        this.requestStop = value;
    }

    /**
     * Ruft den Wert der requestMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RequestMethodTypeEnumeration }
     *     
     */
    public RequestMethodTypeEnumeration getRequestMethod() {
        return requestMethod;
    }

    /**
     * Legt den Wert der requestMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestMethodTypeEnumeration }
     *     
     */
    public void setRequestMethod(RequestMethodTypeEnumeration value) {
        this.requestMethod = value;
    }

    /**
     * Gets the value of the boardingRequestMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boardingRequestMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoardingRequestMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestMethodTypeEnumeration }
     * 
     * 
     */
    public List<RequestMethodTypeEnumeration> getBoardingRequestMethod() {
        if (boardingRequestMethod == null) {
            boardingRequestMethod = new ArrayList<RequestMethodTypeEnumeration>();
        }
        return this.boardingRequestMethod;
    }

    /**
     * Gets the value of the alightingRequestMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alightingRequestMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlightingRequestMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestMethodTypeEnumeration }
     * 
     * 
     */
    public List<RequestMethodTypeEnumeration> getAlightingRequestMethod() {
        if (alightingRequestMethod == null) {
            alightingRequestMethod = new ArrayList<RequestMethodTypeEnumeration>();
        }
        return this.alightingRequestMethod;
    }

    /**
     * Ruft den Wert der stopUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopUseEnumeration }
     *     
     */
    public StopUseEnumeration getStopUse() {
        return stopUse;
    }

    /**
     * Legt den Wert der stopUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopUseEnumeration }
     *     
     */
    public void setStopUse(StopUseEnumeration value) {
        this.stopUse = value;
    }

    /**
     * Ruft den Wert der bookingArrangements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BookingArrangementsRelStructure }
     *     
     */
    public BookingArrangementsRelStructure getBookingArrangements() {
        return bookingArrangements;
    }

    /**
     * Legt den Wert der bookingArrangements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingArrangementsRelStructure }
     *     
     */
    public void setBookingArrangements(BookingArrangementsRelStructure value) {
        this.bookingArrangements = value;
    }

    /**
     * Ruft den Wert der print-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrint() {
        return print;
    }

    /**
     * Legt den Wert der print-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrint(Boolean value) {
        this.print = value;
    }

    /**
     * Ruft den Wert der dynamic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DynamicAdvertisementEnumeration }
     *     
     */
    public DynamicAdvertisementEnumeration getDynamic() {
        return dynamic;
    }

    /**
     * Legt den Wert der dynamic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicAdvertisementEnumeration }
     *     
     */
    public void setDynamic(DynamicAdvertisementEnumeration value) {
        this.dynamic = value;
    }

    /**
     * Ruft den Wert der passengerCarryingRequirementRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PassengerCarryingRequirementRefStructure }
     *     
     */
    public PassengerCarryingRequirementRefStructure getPassengerCarryingRequirementRef() {
        return passengerCarryingRequirementRef;
    }

    /**
     * Legt den Wert der passengerCarryingRequirementRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerCarryingRequirementRefStructure }
     *     
     */
    public void setPassengerCarryingRequirementRef(PassengerCarryingRequirementRefStructure value) {
        this.passengerCarryingRequirementRef = value;
    }

    /**
     * Ruft den Wert der passengerCarryingRequirementsView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PassengerCarryingRequirementsView }
     *     
     */
    public PassengerCarryingRequirementsView getPassengerCarryingRequirementsView() {
        return passengerCarryingRequirementsView;
    }

    /**
     * Legt den Wert der passengerCarryingRequirementsView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerCarryingRequirementsView }
     *     
     */
    public void setPassengerCarryingRequirementsView(PassengerCarryingRequirementsView value) {
        this.passengerCarryingRequirementsView = value;
    }

    /**
     * Ruft den Wert der trainSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainSizeStructure }
     *     
     */
    public TrainSizeStructure getTrainSize() {
        return trainSize;
    }

    /**
     * Legt den Wert der trainSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainSizeStructure }
     *     
     */
    public void setTrainSize(TrainSizeStructure value) {
        this.trainSize = value;
    }

    /**
     * Ruft den Wert der equipments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleEquipmentsRelStructure }
     *     
     */
    public VehicleEquipmentsRelStructure getEquipments() {
        return equipments;
    }

    /**
     * Legt den Wert der equipments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleEquipmentsRelStructure }
     *     
     */
    public void setEquipments(VehicleEquipmentsRelStructure value) {
        this.equipments = value;
    }

    /**
     * Ruft den Wert der note-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getNote() {
        return note;
    }

    /**
     * Legt den Wert der note-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setNote(MultilingualString value) {
        this.note = value;
    }

    /**
     * Ruft den Wert der order-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Legt den Wert der order-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

    /**
     * Ruft den Wert der constrained-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConstrained() {
        return constrained;
    }

    /**
     * Legt den Wert der constrained-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConstrained(Boolean value) {
        this.constrained = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.netex.org.uk/netex}noticeAssignments_RelStructure">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NoticeAssignments
        extends NoticeAssignmentsRelStructure
    {


    }

}
