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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for JOURNEY MEETING VIEW.
 * 
 * <p>Java-Klasse f�r JourneyMeeting_DerivedViewStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="JourneyMeeting_DerivedViewStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DerivedViewStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}JourneyMeetingRef" minOccurs="0"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}JourneyMeetingPropertiesGroup"/>
 *         &lt;sequence>
 *           &lt;element name="MaximumWaitTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}JourneyMeetingConnectionGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}InterchangePropertyGroup"/>
 *         &lt;element name="TransferDuration" type="{http://www.netex.org.uk/netex}TransferDurationStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyMeeting_DerivedViewStructure", propOrder = {
    "journeyMeetingRef",
    "description",
    "earliestTime",
    "earliestTimeDayOffset",
    "latestTime",
    "latestTimeDayOffset",
    "reason",
    "maximumWaitTime",
    "connectionRef",
    "connectingStopPointRef",
    "connectingStopPointName",
    "journeyRef",
    "connectingJourneyView",
    "lineRef",
    "connectingLineView",
    "staySeated",
    "crossBorder",
    "planned",
    "guaranteed",
    "advertised",
    "controlled",
    "connectionCertainty",
    "transferDuration"
})
public class JourneyMeetingDerivedViewStructure
    extends DerivedViewStructure
{

    @XmlElement(name = "JourneyMeetingRef")
    protected JourneyMeetingRefStructure journeyMeetingRef;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "EarliestTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar earliestTime;
    @XmlElement(name = "EarliestTimeDayOffset")
    protected BigInteger earliestTimeDayOffset;
    @XmlElement(name = "LatestTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar latestTime;
    @XmlElement(name = "LatestTimeDayOffset")
    protected BigInteger latestTimeDayOffset;
    @XmlElement(name = "Reason")
    @XmlSchemaType(name = "NMTOKEN")
    protected ReasonForMeetingEnumeration reason;
    @XmlElement(name = "MaximumWaitTime")
    protected Duration maximumWaitTime;
    @XmlElement(name = "ConnectionRef")
    protected ConnectionRefStructure connectionRef;
    @XmlElement(name = "ConnectingStopPointRef")
    protected List<ScheduledStopPointRefStructure> connectingStopPointRef;
    @XmlElement(name = "ConnectingStopPointName")
    protected List<MultilingualString> connectingStopPointName;
    @XmlElementRef(name = "JourneyRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends JourneyRefStructure> journeyRef;
    @XmlElement(name = "ConnectingJourneyView")
    protected ConnectingServiceJourneyDerivedViewStructure connectingJourneyView;
    @XmlElementRef(name = "LineRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LineRefStructure> lineRef;
    @XmlElement(name = "ConnectingLineView")
    protected LineDerivedViewStructure connectingLineView;
    @XmlElement(name = "StaySeated", defaultValue = "false")
    protected Boolean staySeated;
    @XmlElement(name = "CrossBorder", defaultValue = "false")
    protected Boolean crossBorder;
    @XmlElement(name = "Planned", defaultValue = "true")
    protected Boolean planned;
    @XmlElement(name = "Guaranteed", defaultValue = "false")
    protected Boolean guaranteed;
    @XmlElement(name = "Advertised", defaultValue = "true")
    protected Boolean advertised;
    @XmlElement(name = "Controlled", defaultValue = "true")
    protected Boolean controlled;
    @XmlElement(name = "ConnectionCertainty")
    @XmlSchemaType(name = "NMTOKEN")
    protected ConnectionCertaintyEnumeration connectionCertainty;
    @XmlElement(name = "TransferDuration")
    protected TransferDurationStructure transferDuration;

    /**
     * Ruft den Wert der journeyMeetingRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyMeetingRefStructure }
     *     
     */
    public JourneyMeetingRefStructure getJourneyMeetingRef() {
        return journeyMeetingRef;
    }

    /**
     * Legt den Wert der journeyMeetingRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyMeetingRefStructure }
     *     
     */
    public void setJourneyMeetingRef(JourneyMeetingRefStructure value) {
        this.journeyMeetingRef = value;
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
     * Ruft den Wert der earliestTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestTime() {
        return earliestTime;
    }

    /**
     * Legt den Wert der earliestTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestTime(XMLGregorianCalendar value) {
        this.earliestTime = value;
    }

    /**
     * Ruft den Wert der earliestTimeDayOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEarliestTimeDayOffset() {
        return earliestTimeDayOffset;
    }

    /**
     * Legt den Wert der earliestTimeDayOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEarliestTimeDayOffset(BigInteger value) {
        this.earliestTimeDayOffset = value;
    }

    /**
     * Ruft den Wert der latestTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestTime() {
        return latestTime;
    }

    /**
     * Legt den Wert der latestTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestTime(XMLGregorianCalendar value) {
        this.latestTime = value;
    }

    /**
     * Ruft den Wert der latestTimeDayOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLatestTimeDayOffset() {
        return latestTimeDayOffset;
    }

    /**
     * Legt den Wert der latestTimeDayOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLatestTimeDayOffset(BigInteger value) {
        this.latestTimeDayOffset = value;
    }

    /**
     * Ruft den Wert der reason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReasonForMeetingEnumeration }
     *     
     */
    public ReasonForMeetingEnumeration getReason() {
        return reason;
    }

    /**
     * Legt den Wert der reason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonForMeetingEnumeration }
     *     
     */
    public void setReason(ReasonForMeetingEnumeration value) {
        this.reason = value;
    }

    /**
     * Ruft den Wert der maximumWaitTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumWaitTime() {
        return maximumWaitTime;
    }

    /**
     * Legt den Wert der maximumWaitTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumWaitTime(Duration value) {
        this.maximumWaitTime = value;
    }

    /**
     * Ruft den Wert der connectionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionRefStructure }
     *     
     */
    public ConnectionRefStructure getConnectionRef() {
        return connectionRef;
    }

    /**
     * Legt den Wert der connectionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionRefStructure }
     *     
     */
    public void setConnectionRef(ConnectionRefStructure value) {
        this.connectionRef = value;
    }

    /**
     * Gets the value of the connectingStopPointRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectingStopPointRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectingStopPointRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduledStopPointRefStructure }
     * 
     * 
     */
    public List<ScheduledStopPointRefStructure> getConnectingStopPointRef() {
        if (connectingStopPointRef == null) {
            connectingStopPointRef = new ArrayList<ScheduledStopPointRefStructure>();
        }
        return this.connectingStopPointRef;
    }

    /**
     * Gets the value of the connectingStopPointName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectingStopPointName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectingStopPointName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultilingualString }
     * 
     * 
     */
    public List<MultilingualString> getConnectingStopPointName() {
        if (connectingStopPointName == null) {
            connectingStopPointName = new ArrayList<MultilingualString>();
        }
        return this.connectingStopPointName;
    }

    /**
     * Ruft den Wert der journeyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatedSpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SingleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends JourneyRefStructure> getJourneyRef() {
        return journeyRef;
    }

    /**
     * Legt den Wert der journeyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatedSpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SingleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     
     */
    public void setJourneyRef(JAXBElement<? extends JourneyRefStructure> value) {
        this.journeyRef = value;
    }

    /**
     * Ruft den Wert der connectingJourneyView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConnectingServiceJourneyDerivedViewStructure }
     *     
     */
    public ConnectingServiceJourneyDerivedViewStructure getConnectingJourneyView() {
        return connectingJourneyView;
    }

    /**
     * Legt den Wert der connectingJourneyView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectingServiceJourneyDerivedViewStructure }
     *     
     */
    public void setConnectingJourneyView(ConnectingServiceJourneyDerivedViewStructure value) {
        this.connectingJourneyView = value;
    }

    /**
     * Ruft den Wert der lineRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LineRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleLineRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends LineRefStructure> getLineRef() {
        return lineRef;
    }

    /**
     * Legt den Wert der lineRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LineRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleLineRefStructure }{@code >}
     *     
     */
    public void setLineRef(JAXBElement<? extends LineRefStructure> value) {
        this.lineRef = value;
    }

    /**
     * Ruft den Wert der connectingLineView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LineDerivedViewStructure }
     *     
     */
    public LineDerivedViewStructure getConnectingLineView() {
        return connectingLineView;
    }

    /**
     * Legt den Wert der connectingLineView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LineDerivedViewStructure }
     *     
     */
    public void setConnectingLineView(LineDerivedViewStructure value) {
        this.connectingLineView = value;
    }

    /**
     * Ruft den Wert der staySeated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStaySeated() {
        return staySeated;
    }

    /**
     * Legt den Wert der staySeated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStaySeated(Boolean value) {
        this.staySeated = value;
    }

    /**
     * Ruft den Wert der crossBorder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossBorder() {
        return crossBorder;
    }

    /**
     * Legt den Wert der crossBorder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossBorder(Boolean value) {
        this.crossBorder = value;
    }

    /**
     * Ruft den Wert der planned-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlanned() {
        return planned;
    }

    /**
     * Legt den Wert der planned-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlanned(Boolean value) {
        this.planned = value;
    }

    /**
     * Ruft den Wert der guaranteed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteed() {
        return guaranteed;
    }

    /**
     * Legt den Wert der guaranteed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteed(Boolean value) {
        this.guaranteed = value;
    }

    /**
     * Ruft den Wert der advertised-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvertised() {
        return advertised;
    }

    /**
     * Legt den Wert der advertised-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvertised(Boolean value) {
        this.advertised = value;
    }

    /**
     * Ruft den Wert der controlled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isControlled() {
        return controlled;
    }

    /**
     * Legt den Wert der controlled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setControlled(Boolean value) {
        this.controlled = value;
    }

    /**
     * Ruft den Wert der connectionCertainty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionCertaintyEnumeration }
     *     
     */
    public ConnectionCertaintyEnumeration getConnectionCertainty() {
        return connectionCertainty;
    }

    /**
     * Legt den Wert der connectionCertainty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionCertaintyEnumeration }
     *     
     */
    public void setConnectionCertainty(ConnectionCertaintyEnumeration value) {
        this.connectionCertainty = value;
    }

    /**
     * Ruft den Wert der transferDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransferDurationStructure }
     *     
     */
    public TransferDurationStructure getTransferDuration() {
        return transferDuration;
    }

    /**
     * Legt den Wert der transferDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferDurationStructure }
     *     
     */
    public void setTransferDuration(TransferDurationStructure value) {
        this.transferDuration = value;
    }

}
