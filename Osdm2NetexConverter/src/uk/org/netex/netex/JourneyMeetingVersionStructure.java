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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for JOURNEY MEETING.
 * 
 * <p>Java-Klasse f�r JourneyMeeting_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="JourneyMeeting_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}JourneyMeetingGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyMeeting_VersionStructure", propOrder = {
    "name",
    "atStopPointRef",
    "fromJourneyRef",
    "toJourneyRef",
    "fromPointInJourneyPatternRef",
    "toPointInJourneyPatternRef",
    "fromServiceJourneyRef",
    "toServiceJourneyRef",
    "fromStopPointInJourneyPatternRef",
    "toStopPointInJourneyPatternRef",
    "description",
    "earliestTime",
    "earliestTimeDayOffset",
    "latestTime",
    "latestTimeDayOffset",
    "reason",
    "connectionRef",
    "connectingStopPointRef",
    "connectingStopPointName",
    "journeyRef",
    "connectingJourneyView",
    "lineRef",
    "connectingLineView"
})
@XmlSeeAlso({
    JourneyMeeting.class
})
public class JourneyMeetingVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "AtStopPointRef")
    protected ScheduledStopPointRefStructure atStopPointRef;
    @XmlElement(name = "FromJourneyRef")
    protected JourneyRefStructure fromJourneyRef;
    @XmlElement(name = "ToJourneyRef")
    protected JourneyRefStructure toJourneyRef;
    @XmlElement(name = "FromPointInJourneyPatternRef")
    protected PointInJourneyPatternRefStructure fromPointInJourneyPatternRef;
    @XmlElement(name = "ToPointInJourneyPatternRef")
    protected PointInJourneyPatternRefStructure toPointInJourneyPatternRef;
    @XmlElement(name = "FromServiceJourneyRef")
    protected ServiceJourneyRefStructure fromServiceJourneyRef;
    @XmlElement(name = "ToServiceJourneyRef")
    protected ServiceJourneyRefStructure toServiceJourneyRef;
    @XmlElement(name = "FromStopPointInJourneyPatternRef")
    protected StopPointInJourneyPatternRefStructure fromStopPointInJourneyPatternRef;
    @XmlElement(name = "ToStopPointInJourneyPatternRef")
    protected StopPointInJourneyPatternRefStructure toStopPointInJourneyPatternRef;
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
     * Ruft den Wert der atStopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getAtStopPointRef() {
        return atStopPointRef;
    }

    /**
     * Legt den Wert der atStopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setAtStopPointRef(ScheduledStopPointRefStructure value) {
        this.atStopPointRef = value;
    }

    /**
     * Ruft den Wert der fromJourneyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyRefStructure }
     *     
     */
    public JourneyRefStructure getFromJourneyRef() {
        return fromJourneyRef;
    }

    /**
     * Legt den Wert der fromJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyRefStructure }
     *     
     */
    public void setFromJourneyRef(JourneyRefStructure value) {
        this.fromJourneyRef = value;
    }

    /**
     * Ruft den Wert der toJourneyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyRefStructure }
     *     
     */
    public JourneyRefStructure getToJourneyRef() {
        return toJourneyRef;
    }

    /**
     * Legt den Wert der toJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyRefStructure }
     *     
     */
    public void setToJourneyRef(JourneyRefStructure value) {
        this.toJourneyRef = value;
    }

    /**
     * Ruft den Wert der fromPointInJourneyPatternRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointInJourneyPatternRefStructure }
     *     
     */
    public PointInJourneyPatternRefStructure getFromPointInJourneyPatternRef() {
        return fromPointInJourneyPatternRef;
    }

    /**
     * Legt den Wert der fromPointInJourneyPatternRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointInJourneyPatternRefStructure }
     *     
     */
    public void setFromPointInJourneyPatternRef(PointInJourneyPatternRefStructure value) {
        this.fromPointInJourneyPatternRef = value;
    }

    /**
     * Ruft den Wert der toPointInJourneyPatternRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointInJourneyPatternRefStructure }
     *     
     */
    public PointInJourneyPatternRefStructure getToPointInJourneyPatternRef() {
        return toPointInJourneyPatternRef;
    }

    /**
     * Legt den Wert der toPointInJourneyPatternRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointInJourneyPatternRefStructure }
     *     
     */
    public void setToPointInJourneyPatternRef(PointInJourneyPatternRefStructure value) {
        this.toPointInJourneyPatternRef = value;
    }

    /**
     * Ruft den Wert der fromServiceJourneyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceJourneyRefStructure }
     *     
     */
    public ServiceJourneyRefStructure getFromServiceJourneyRef() {
        return fromServiceJourneyRef;
    }

    /**
     * Legt den Wert der fromServiceJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceJourneyRefStructure }
     *     
     */
    public void setFromServiceJourneyRef(ServiceJourneyRefStructure value) {
        this.fromServiceJourneyRef = value;
    }

    /**
     * Ruft den Wert der toServiceJourneyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceJourneyRefStructure }
     *     
     */
    public ServiceJourneyRefStructure getToServiceJourneyRef() {
        return toServiceJourneyRef;
    }

    /**
     * Legt den Wert der toServiceJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceJourneyRefStructure }
     *     
     */
    public void setToServiceJourneyRef(ServiceJourneyRefStructure value) {
        this.toServiceJourneyRef = value;
    }

    /**
     * Ruft den Wert der fromStopPointInJourneyPatternRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPointInJourneyPatternRefStructure }
     *     
     */
    public StopPointInJourneyPatternRefStructure getFromStopPointInJourneyPatternRef() {
        return fromStopPointInJourneyPatternRef;
    }

    /**
     * Legt den Wert der fromStopPointInJourneyPatternRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointInJourneyPatternRefStructure }
     *     
     */
    public void setFromStopPointInJourneyPatternRef(StopPointInJourneyPatternRefStructure value) {
        this.fromStopPointInJourneyPatternRef = value;
    }

    /**
     * Ruft den Wert der toStopPointInJourneyPatternRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPointInJourneyPatternRefStructure }
     *     
     */
    public StopPointInJourneyPatternRefStructure getToStopPointInJourneyPatternRef() {
        return toStopPointInJourneyPatternRef;
    }

    /**
     * Legt den Wert der toStopPointInJourneyPatternRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointInJourneyPatternRefStructure }
     *     
     */
    public void setToStopPointInJourneyPatternRef(StopPointInJourneyPatternRefStructure value) {
        this.toStopPointInJourneyPatternRef = value;
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

}
