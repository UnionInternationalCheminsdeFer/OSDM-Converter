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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for TIMING POINT IN JOURNEY PATTERN.
 * 
 * <p>Java-Klasse f�r TimingPointInJourneyPattern_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimingPointInJourneyPattern_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PointInLinkSequence_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TimingPointInJourneyPatternGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimingPointInJourneyPattern_VersionedChildStructure", propOrder = {
    "timingPointRef",
    "onwardTimingLinkRef",
    "isWaitPoint",
    "waitTime",
    "waitTimes",
    "headways",
    "noticeAssignments"
})
@XmlSeeAlso({
    TimingPointInJourneyPattern.class
})
public class TimingPointInJourneyPatternVersionedChildStructure
    extends PointInLinkSequenceVersionedChildStructure
{

    @XmlElementRef(name = "TimingPointRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected JAXBElement<? extends TimingPointRefStructure> timingPointRef;
    @XmlElement(name = "OnwardTimingLinkRef")
    protected TimingLinkRefStructure onwardTimingLinkRef;
    @XmlElement(name = "IsWaitPoint", defaultValue = "false")
    protected Boolean isWaitPoint;
    @XmlElement(name = "WaitTime")
    protected Duration waitTime;
    protected JourneyPatternWaitTimesRelStructure waitTimes;
    protected JourneyPatternHeadwaysRelStructure headways;
    protected NoticeAssignmentsRelStructure noticeAssignments;

    /**
     * Ruft den Wert der timingPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BorderPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GaragePointRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TimingPointRefStructure> getTimingPointRef() {
        return timingPointRef;
    }

    /**
     * Legt den Wert der timingPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BorderPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GaragePointRefStructure }{@code >}
     *     
     */
    public void setTimingPointRef(JAXBElement<? extends TimingPointRefStructure> value) {
        this.timingPointRef = value;
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
     * Ruft den Wert der noticeAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NoticeAssignmentsRelStructure }
     *     
     */
    public NoticeAssignmentsRelStructure getNoticeAssignments() {
        return noticeAssignments;
    }

    /**
     * Legt den Wert der noticeAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeAssignmentsRelStructure }
     *     
     */
    public void setNoticeAssignments(NoticeAssignmentsRelStructure value) {
        this.noticeAssignments = value;
    }

}
