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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Data type for DEAD RUN CALL.
 * 
 * <p>Java-Klasse f�r DeadRunCall_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeadRunCall_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DeadRunCallGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeadRunCall_VersionedChildStructure", propOrder = {
    "pointRef",
    "scheduledStopPointView",
    "pointInJourneyPatternRef",
    "arrival",
    "departure",
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
    "note"
})
public class DeadRunCallVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElementRef(name = "PointRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends PointRefStructure> pointRef;
    @XmlElement(name = "ScheduledStopPointView")
    protected ScheduledStopPointDerivedViewStructure scheduledStopPointView;
    @XmlElement(name = "PointInJourneyPatternRef")
    protected PointInJourneyPatternRefStructure pointInJourneyPatternRef;
    @XmlElement(name = "Arrival")
    protected DeadRunCallPartStructure arrival;
    @XmlElement(name = "Departure")
    protected DeadRunCallPartStructure departure;
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
    protected uk.org.netex.netex.CallVersionedChildStructure.NoticeAssignments noticeAssignments;
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
    @XmlElement(name = "Note")
    protected MultilingualString note;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;

    /**
     * Ruft den Wert der pointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VehicleMeetingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrafficControlPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BeaconPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WirePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BorderPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoutePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivationPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOnLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructurePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GaragePointRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends PointRefStructure> getPointRef() {
        return pointRef;
    }

    /**
     * Legt den Wert der pointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VehicleMeetingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrafficControlPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BeaconPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WirePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BorderPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoutePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivationPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOnLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructurePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GaragePointRefStructure }{@code >}
     *     
     */
    public void setPointRef(JAXBElement<? extends PointRefStructure> value) {
        this.pointRef = value;
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
     *     {@link DeadRunCallPartStructure }
     *     
     */
    public DeadRunCallPartStructure getArrival() {
        return arrival;
    }

    /**
     * Legt den Wert der arrival-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeadRunCallPartStructure }
     *     
     */
    public void setArrival(DeadRunCallPartStructure value) {
        this.arrival = value;
    }

    /**
     * Ruft den Wert der departure-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeadRunCallPartStructure }
     *     
     */
    public DeadRunCallPartStructure getDeparture() {
        return departure;
    }

    /**
     * Legt den Wert der departure-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeadRunCallPartStructure }
     *     
     */
    public void setDeparture(DeadRunCallPartStructure value) {
        this.departure = value;
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
     *     {@link uk.org.netex.netex.CallVersionedChildStructure.NoticeAssignments }
     *     
     */
    public uk.org.netex.netex.CallVersionedChildStructure.NoticeAssignments getNoticeAssignments() {
        return noticeAssignments;
    }

    /**
     * Legt den Wert der noticeAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link uk.org.netex.netex.CallVersionedChildStructure.NoticeAssignments }
     *     
     */
    public void setNoticeAssignments(uk.org.netex.netex.CallVersionedChildStructure.NoticeAssignments value) {
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

}
