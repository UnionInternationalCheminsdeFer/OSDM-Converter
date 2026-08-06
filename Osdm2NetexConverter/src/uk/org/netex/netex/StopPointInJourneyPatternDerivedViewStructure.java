//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for STOP POINT IN JOURNEY PATTERN VIEW.
 * 
 * <p>Java-Klasse f�r StopPointInJourneyPattern_DerivedViewStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StopPointInJourneyPattern_DerivedViewStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DerivedViewStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}PointInJourneyPatternRef" minOccurs="0"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}StopPointInJourneyPatternViewPropertiesGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}StopPointInJourneyPatternViewTimingGroup"/>
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
@XmlType(name = "StopPointInJourneyPattern_DerivedViewStructure", propOrder = {
    "pointInJourneyPatternRef",
    "visitNumber",
    "scheduledStopPointRef",
    "scheduledStopPointView",
    "onwardTimingLinkView",
    "onwardServiceLinkRef",
    "onwardServiceLinkView",
    "timingPointStatus",
    "isWaitPoint",
    "timeDemandTypeRef",
    "timebandRef",
    "waitTime",
    "scheduledHeadwayInterval",
    "minimumHeadwayInterval",
    "maximumHeadwayInterval"
})
public class StopPointInJourneyPatternDerivedViewStructure
    extends DerivedViewStructure
{

    @XmlElementRef(name = "PointInJourneyPatternRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends PointInJourneyPatternRefStructure> pointInJourneyPatternRef;
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
    @XmlElement(name = "IsWaitPoint", defaultValue = "false")
    protected Boolean isWaitPoint;
    @XmlElement(name = "TimeDemandTypeRef")
    protected TimeDemandTypeRefStructure timeDemandTypeRef;
    @XmlElement(name = "TimebandRef")
    protected TimebandRefStructure timebandRef;
    @XmlElement(name = "WaitTime")
    protected Duration waitTime;
    @XmlElement(name = "ScheduledHeadwayInterval")
    protected Duration scheduledHeadwayInterval;
    @XmlElement(name = "MinimumHeadwayInterval")
    protected Duration minimumHeadwayInterval;
    @XmlElement(name = "MaximumHeadwayInterval")
    protected Duration maximumHeadwayInterval;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;

    /**
     * Ruft den Wert der pointInJourneyPatternRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopPointInJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingPointInJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointInJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FarePointInPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointInSingleJourneyPathRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends PointInJourneyPatternRefStructure> getPointInJourneyPatternRef() {
        return pointInJourneyPatternRef;
    }

    /**
     * Legt den Wert der pointInJourneyPatternRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopPointInJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingPointInJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointInJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FarePointInPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointInSingleJourneyPathRefStructure }{@code >}
     *     
     */
    public void setPointInJourneyPatternRef(JAXBElement<? extends PointInJourneyPatternRefStructure> value) {
        this.pointInJourneyPatternRef = value;
    }

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
     * Ruft den Wert der timeDemandTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeDemandTypeRefStructure }
     *     
     */
    public TimeDemandTypeRefStructure getTimeDemandTypeRef() {
        return timeDemandTypeRef;
    }

    /**
     * Legt den Wert der timeDemandTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDemandTypeRefStructure }
     *     
     */
    public void setTimeDemandTypeRef(TimeDemandTypeRefStructure value) {
        this.timeDemandTypeRef = value;
    }

    /**
     * Ruft den Wert der timebandRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimebandRefStructure }
     *     
     */
    public TimebandRefStructure getTimebandRef() {
        return timebandRef;
    }

    /**
     * Legt den Wert der timebandRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimebandRefStructure }
     *     
     */
    public void setTimebandRef(TimebandRefStructure value) {
        this.timebandRef = value;
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
     * Ruft den Wert der scheduledHeadwayInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getScheduledHeadwayInterval() {
        return scheduledHeadwayInterval;
    }

    /**
     * Legt den Wert der scheduledHeadwayInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setScheduledHeadwayInterval(Duration value) {
        this.scheduledHeadwayInterval = value;
    }

    /**
     * Ruft den Wert der minimumHeadwayInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumHeadwayInterval() {
        return minimumHeadwayInterval;
    }

    /**
     * Legt den Wert der minimumHeadwayInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumHeadwayInterval(Duration value) {
        this.minimumHeadwayInterval = value;
    }

    /**
     * Ruft den Wert der maximumHeadwayInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumHeadwayInterval() {
        return maximumHeadwayInterval;
    }

    /**
     * Legt den Wert der maximumHeadwayInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumHeadwayInterval(Duration value) {
        this.maximumHeadwayInterval = value;
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
