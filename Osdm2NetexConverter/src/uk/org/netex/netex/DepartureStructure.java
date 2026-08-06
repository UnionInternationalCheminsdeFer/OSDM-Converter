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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Reorganisation of Passing times as Departure.
 * 
 * <p>Java-Klasse f�r DepartureStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DepartureStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="DayOffset" type="{http://www.netex.org.uk/netex}DayOffsetType" minOccurs="0"/>
 *         &lt;element name="ForBoarding" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsFlexible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WaitTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CallPartGroup"/>
 *         &lt;element name="occupancies" type="{http://www.netex.org.uk/netex}OccupancyView_RelStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepartureStructure", propOrder = {
    "time",
    "dayOffset",
    "forBoarding",
    "isFlexible",
    "waitTime",
    "journeyPartRef",
    "journeyMeetings",
    "interchanges",
    "interchangeRules",
    "timeDemandTypeRef",
    "timebandRef",
    "dutyPartRef",
    "passengerStopAssignmentRef",
    "quayAssignmentView",
    "dynamicStopAssignment",
    "accessibilityAssessment",
    "checkConstraint",
    "noticeAssignments",
    "passengerAtStopTimes",
    "occupancies"
})
public class DepartureStructure {

    @XmlElement(name = "Time")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar time;
    @XmlElement(name = "DayOffset", defaultValue = "0")
    protected BigInteger dayOffset;
    @XmlElement(name = "ForBoarding", defaultValue = "true")
    protected Boolean forBoarding;
    @XmlElement(name = "IsFlexible", defaultValue = "false")
    protected Boolean isFlexible;
    @XmlElement(name = "WaitTime")
    protected Duration waitTime;
    @XmlElement(name = "JourneyPartRef")
    protected JourneyPartRefStructure journeyPartRef;
    protected JourneyMeetingViewsRelStructure journeyMeetings;
    protected ServiceJourneyInterchangesRelStructure interchanges;
    protected InterchangeRulesRelStructure interchangeRules;
    @XmlElement(name = "TimeDemandTypeRef")
    protected TimeDemandTypeRefStructure timeDemandTypeRef;
    @XmlElement(name = "TimebandRef")
    protected TimebandRefStructure timebandRef;
    @XmlElement(name = "DutyPartRef")
    protected DutyPartRefStructure dutyPartRef;
    @XmlElementRef(name = "PassengerStopAssignmentRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends PassengerStopAssignmentRefStructure> passengerStopAssignmentRef;
    @XmlElement(name = "QuayAssignmentView")
    protected QuayAssignmentView quayAssignmentView;
    @XmlElement(name = "DynamicStopAssignment")
    protected DynamicStopAssignment dynamicStopAssignment;
    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessment accessibilityAssessment;
    @XmlElement(name = "CheckConstraint")
    protected CheckConstraint checkConstraint;
    protected NoticeAssignmentsRelStructure noticeAssignments;
    protected PassengerAtStopTimesRelStructure passengerAtStopTimes;
    protected OccupancyViewRelStructure occupancies;

    /**
     * Ruft den Wert der time-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Legt den Wert der time-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Ruft den Wert der dayOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDayOffset() {
        return dayOffset;
    }

    /**
     * Legt den Wert der dayOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDayOffset(BigInteger value) {
        this.dayOffset = value;
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
     * Ruft den Wert der isFlexible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFlexible() {
        return isFlexible;
    }

    /**
     * Legt den Wert der isFlexible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFlexible(Boolean value) {
        this.isFlexible = value;
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
     * Ruft den Wert der journeyPartRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPartRefStructure }
     *     
     */
    public JourneyPartRefStructure getJourneyPartRef() {
        return journeyPartRef;
    }

    /**
     * Legt den Wert der journeyPartRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPartRefStructure }
     *     
     */
    public void setJourneyPartRef(JourneyPartRefStructure value) {
        this.journeyPartRef = value;
    }

    /**
     * Ruft den Wert der journeyMeetings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyMeetingViewsRelStructure }
     *     
     */
    public JourneyMeetingViewsRelStructure getJourneyMeetings() {
        return journeyMeetings;
    }

    /**
     * Legt den Wert der journeyMeetings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyMeetingViewsRelStructure }
     *     
     */
    public void setJourneyMeetings(JourneyMeetingViewsRelStructure value) {
        this.journeyMeetings = value;
    }

    /**
     * Ruft den Wert der interchanges-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceJourneyInterchangesRelStructure }
     *     
     */
    public ServiceJourneyInterchangesRelStructure getInterchanges() {
        return interchanges;
    }

    /**
     * Legt den Wert der interchanges-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceJourneyInterchangesRelStructure }
     *     
     */
    public void setInterchanges(ServiceJourneyInterchangesRelStructure value) {
        this.interchanges = value;
    }

    /**
     * Ruft den Wert der interchangeRules-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeRulesRelStructure }
     *     
     */
    public InterchangeRulesRelStructure getInterchangeRules() {
        return interchangeRules;
    }

    /**
     * Legt den Wert der interchangeRules-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeRulesRelStructure }
     *     
     */
    public void setInterchangeRules(InterchangeRulesRelStructure value) {
        this.interchangeRules = value;
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
     * Ruft den Wert der dutyPartRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DutyPartRefStructure }
     *     
     */
    public DutyPartRefStructure getDutyPartRef() {
        return dutyPartRef;
    }

    /**
     * Legt den Wert der dutyPartRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DutyPartRefStructure }
     *     
     */
    public void setDutyPartRef(DutyPartRefStructure value) {
        this.dutyPartRef = value;
    }

    /**
     * Ruft den Wert der passengerStopAssignmentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DynamicStopAssignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyStopAssignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerStopAssignmentRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends PassengerStopAssignmentRefStructure> getPassengerStopAssignmentRef() {
        return passengerStopAssignmentRef;
    }

    /**
     * Legt den Wert der passengerStopAssignmentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DynamicStopAssignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyStopAssignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerStopAssignmentRefStructure }{@code >}
     *     
     */
    public void setPassengerStopAssignmentRef(JAXBElement<? extends PassengerStopAssignmentRefStructure> value) {
        this.passengerStopAssignmentRef = value;
    }

    /**
     * Ruft den Wert der quayAssignmentView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QuayAssignmentView }
     *     
     */
    public QuayAssignmentView getQuayAssignmentView() {
        return quayAssignmentView;
    }

    /**
     * Legt den Wert der quayAssignmentView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QuayAssignmentView }
     *     
     */
    public void setQuayAssignmentView(QuayAssignmentView value) {
        this.quayAssignmentView = value;
    }

    /**
     * Ruft den Wert der dynamicStopAssignment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DynamicStopAssignment }
     *     
     */
    public DynamicStopAssignment getDynamicStopAssignment() {
        return dynamicStopAssignment;
    }

    /**
     * Legt den Wert der dynamicStopAssignment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicStopAssignment }
     *     
     */
    public void setDynamicStopAssignment(DynamicStopAssignment value) {
        this.dynamicStopAssignment = value;
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
     * Ruft den Wert der checkConstraint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CheckConstraint }
     *     
     */
    public CheckConstraint getCheckConstraint() {
        return checkConstraint;
    }

    /**
     * Legt den Wert der checkConstraint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckConstraint }
     *     
     */
    public void setCheckConstraint(CheckConstraint value) {
        this.checkConstraint = value;
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

    /**
     * Ruft den Wert der passengerAtStopTimes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PassengerAtStopTimesRelStructure }
     *     
     */
    public PassengerAtStopTimesRelStructure getPassengerAtStopTimes() {
        return passengerAtStopTimes;
    }

    /**
     * Legt den Wert der passengerAtStopTimes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerAtStopTimesRelStructure }
     *     
     */
    public void setPassengerAtStopTimes(PassengerAtStopTimesRelStructure value) {
        this.passengerAtStopTimes = value;
    }

    /**
     * Ruft den Wert der occupancies-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OccupancyViewRelStructure }
     *     
     */
    public OccupancyViewRelStructure getOccupancies() {
        return occupancies;
    }

    /**
     * Legt den Wert der occupancies-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupancyViewRelStructure }
     *     
     */
    public void setOccupancies(OccupancyViewRelStructure value) {
        this.occupancies = value;
    }

}
