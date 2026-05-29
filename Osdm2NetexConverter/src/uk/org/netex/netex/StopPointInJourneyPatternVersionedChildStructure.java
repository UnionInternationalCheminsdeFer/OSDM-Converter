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
import javax.xml.datatype.Duration;


/**
 * Type for a STOP POINT IN JOURNEY PATTERN.
 * 
 * <p>Java-Klasse f�r StopPointInJourneyPattern_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StopPointInJourneyPattern_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PointInLinkSequence_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}StopPointInJourneyPatternGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopPointInJourneyPattern_VersionedChildStructure", propOrder = {
    "scheduledStopPointRef",
    "onwardTimingLinkRef",
    "isWaitPoint",
    "waitTime",
    "waitTimes",
    "headways",
    "onwardServiceLinkRef",
    "forAlighting",
    "forBoarding",
    "alightingSideInDirectionOfTravel",
    "boardingSideInDirectionOfTravel",
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
    "dynamic"
})
@XmlSeeAlso({
    StopPointInJourneyPattern.class
})
public class StopPointInJourneyPatternVersionedChildStructure
    extends PointInLinkSequenceVersionedChildStructure
{

    @XmlElementRef(name = "ScheduledStopPointRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected JAXBElement<? extends ScheduledStopPointRefStructure> scheduledStopPointRef;
    @XmlElement(name = "OnwardTimingLinkRef")
    protected TimingLinkRefStructure onwardTimingLinkRef;
    @XmlElement(name = "IsWaitPoint", defaultValue = "false")
    protected Boolean isWaitPoint;
    @XmlElement(name = "WaitTime")
    protected Duration waitTime;
    protected JourneyPatternWaitTimesRelStructure waitTimes;
    protected JourneyPatternHeadwaysRelStructure headways;
    @XmlElement(name = "OnwardServiceLinkRef")
    protected ServiceLinkRefStructure onwardServiceLinkRef;
    @XmlElement(name = "ForAlighting", defaultValue = "true")
    protected Boolean forAlighting;
    @XmlElement(name = "ForBoarding", defaultValue = "true")
    protected Boolean forBoarding;
    @XmlElement(name = "AlightingSideInDirectionOfTravel")
    @XmlSchemaType(name = "NMTOKEN")
    protected SideInDirectionOfTravelEnumeration alightingSideInDirectionOfTravel;
    @XmlElement(name = "BoardingSideInDirectionOfTravel")
    @XmlSchemaType(name = "NMTOKEN")
    protected SideInDirectionOfTravelEnumeration boardingSideInDirectionOfTravel;
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
     * Ruft den Wert der onwardTimingLinkRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimingLinkRefStructure }
     *     
     */
    public TimingLinkRefStructure getOnwardTimingLinkRef() {
        return onwardTimingLinkRef;
    }

    /**
     * Legt den Wert der onwardTimingLinkRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingLinkRefStructure }
     *     
     */
    public void setOnwardTimingLinkRef(TimingLinkRefStructure value) {
        this.onwardTimingLinkRef = value;
    }

    /**
     * Ruft den Wert der isWaitPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWaitPoint() {
        return isWaitPoint;
    }

    /**
     * Legt den Wert der isWaitPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWaitPoint(Boolean value) {
        this.isWaitPoint = value;
    }

    /**
     * Ruft den Wert der waitTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getWaitTime() {
        return waitTime;
    }

    /**
     * Legt den Wert der waitTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setWaitTime(Duration value) {
        this.waitTime = value;
    }

    /**
     * Ruft den Wert der waitTimes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPatternWaitTimesRelStructure }
     *     
     */
    public JourneyPatternWaitTimesRelStructure getWaitTimes() {
        return waitTimes;
    }

    /**
     * Legt den Wert der waitTimes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPatternWaitTimesRelStructure }
     *     
     */
    public void setWaitTimes(JourneyPatternWaitTimesRelStructure value) {
        this.waitTimes = value;
    }

    /**
     * Ruft den Wert der headways-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPatternHeadwaysRelStructure }
     *     
     */
    public JourneyPatternHeadwaysRelStructure getHeadways() {
        return headways;
    }

    /**
     * Legt den Wert der headways-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPatternHeadwaysRelStructure }
     *     
     */
    public void setHeadways(JourneyPatternHeadwaysRelStructure value) {
        this.headways = value;
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
     * Ruft den Wert der forAlighting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForAlighting() {
        return forAlighting;
    }

    /**
     * Legt den Wert der forAlighting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForAlighting(Boolean value) {
        this.forAlighting = value;
    }

    /**
     * Ruft den Wert der forBoarding-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForBoarding() {
        return forBoarding;
    }

    /**
     * Legt den Wert der forBoarding-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForBoarding(Boolean value) {
        this.forBoarding = value;
    }

    /**
     * Ruft den Wert der alightingSideInDirectionOfTravel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SideInDirectionOfTravelEnumeration }
     *     
     */
    public SideInDirectionOfTravelEnumeration getAlightingSideInDirectionOfTravel() {
        return alightingSideInDirectionOfTravel;
    }

    /**
     * Legt den Wert der alightingSideInDirectionOfTravel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SideInDirectionOfTravelEnumeration }
     *     
     */
    public void setAlightingSideInDirectionOfTravel(SideInDirectionOfTravelEnumeration value) {
        this.alightingSideInDirectionOfTravel = value;
    }

    /**
     * Ruft den Wert der boardingSideInDirectionOfTravel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SideInDirectionOfTravelEnumeration }
     *     
     */
    public SideInDirectionOfTravelEnumeration getBoardingSideInDirectionOfTravel() {
        return boardingSideInDirectionOfTravel;
    }

    /**
     * Legt den Wert der boardingSideInDirectionOfTravel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SideInDirectionOfTravelEnumeration }
     *     
     */
    public void setBoardingSideInDirectionOfTravel(SideInDirectionOfTravelEnumeration value) {
        this.boardingSideInDirectionOfTravel = value;
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

}
