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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for JOURNEY PATTERN.
 * 
 * <p>Java-Klasse f�r JourneyPattern_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="JourneyPattern_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}LinkSequence_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}JourneyPatternGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyPattern_VersionStructure", propOrder = {
    "routeRef",
    "routeView",
    "directionType",
    "directionRef",
    "directionView",
    "destinationDisplayRef",
    "destinationDisplayView",
    "typeOfJourneyPatternRef",
    "operationalContextRef",
    "timingPatternRef",
    "bookingArrangements",
    "noticeAssignments",
    "runTimes",
    "waitTimes",
    "headways",
    "layovers",
    "pointsInSequence",
    "linksInSequence"
})
@XmlSeeAlso({
    JourneyPattern.class,
    ServiceJourneyPatternVersionStructure.class,
    DeadRunJourneyPatternVersionStructure.class
})
public abstract class JourneyPatternVersionStructure
    extends LinkSequenceVersionStructure
{

    @XmlElement(name = "RouteRef")
    protected RouteRefStructure routeRef;
    @XmlElement(name = "RouteView")
    protected RouteView routeView;
    @XmlElement(name = "DirectionType", defaultValue = "outbound")
    @XmlSchemaType(name = "normalizedString")
    protected DirectionTypeEnumeration directionType;
    @XmlElement(name = "DirectionRef")
    protected DirectionRefStructure directionRef;
    @XmlElement(name = "DirectionView")
    protected DirectionView directionView;
    @XmlElement(name = "DestinationDisplayRef")
    protected DestinationDisplayRefStructure destinationDisplayRef;
    @XmlElement(name = "DestinationDisplayView")
    protected DestinationDisplayView destinationDisplayView;
    @XmlElement(name = "TypeOfJourneyPatternRef")
    protected TypeOfJourneyPatternRefStructure typeOfJourneyPatternRef;
    @XmlElement(name = "OperationalContextRef")
    protected OperationalContextRefStructure operationalContextRef;
    @XmlElement(name = "TimingPatternRef")
    protected TimingPatternRefStructure timingPatternRef;
    protected BookingArrangementsRelStructure bookingArrangements;
    protected NoticeAssignmentsRelStructure noticeAssignments;
    protected JourneyPatternRunTimesRelStructure runTimes;
    protected JourneyPatternWaitTimesRelStructure waitTimes;
    protected JourneyPatternHeadwaysRelStructure headways;
    protected JourneyPatternLayoversRelStructure layovers;
    protected PointsInJourneyPatternRelStructure pointsInSequence;
    protected LinksInJourneyPatternRelStructure linksInSequence;

    /**
     * Ruft den Wert der routeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RouteRefStructure }
     *     
     */
    public RouteRefStructure getRouteRef() {
        return routeRef;
    }

    /**
     * Legt den Wert der routeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteRefStructure }
     *     
     */
    public void setRouteRef(RouteRefStructure value) {
        this.routeRef = value;
    }

    /**
     * Ruft den Wert der routeView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RouteView }
     *     
     */
    public RouteView getRouteView() {
        return routeView;
    }

    /**
     * Legt den Wert der routeView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteView }
     *     
     */
    public void setRouteView(RouteView value) {
        this.routeView = value;
    }

    /**
     * DIRECTION of JOURNEY PATTERN. Should be same as for ROUTE on which PATTERN is based.
     * 
     * @return
     *     possible object is
     *     {@link DirectionTypeEnumeration }
     *     
     */
    public DirectionTypeEnumeration getDirectionType() {
        return directionType;
    }

    /**
     * Legt den Wert der directionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionTypeEnumeration }
     *     
     */
    public void setDirectionType(DirectionTypeEnumeration value) {
        this.directionType = value;
    }

    /**
     * Ruft den Wert der directionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectionRefStructure }
     *     
     */
    public DirectionRefStructure getDirectionRef() {
        return directionRef;
    }

    /**
     * Legt den Wert der directionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionRefStructure }
     *     
     */
    public void setDirectionRef(DirectionRefStructure value) {
        this.directionRef = value;
    }

    /**
     * Ruft den Wert der directionView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectionView }
     *     
     */
    public DirectionView getDirectionView() {
        return directionView;
    }

    /**
     * Legt den Wert der directionView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionView }
     *     
     */
    public void setDirectionView(DirectionView value) {
        this.directionView = value;
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
     * Destination / Direction name for JOURNEY PATTERN.
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
     * Ruft den Wert der typeOfJourneyPatternRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfJourneyPatternRefStructure }
     *     
     */
    public TypeOfJourneyPatternRefStructure getTypeOfJourneyPatternRef() {
        return typeOfJourneyPatternRef;
    }

    /**
     * Legt den Wert der typeOfJourneyPatternRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfJourneyPatternRefStructure }
     *     
     */
    public void setTypeOfJourneyPatternRef(TypeOfJourneyPatternRefStructure value) {
        this.typeOfJourneyPatternRef = value;
    }

    /**
     * Ruft den Wert der operationalContextRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperationalContextRefStructure }
     *     
     */
    public OperationalContextRefStructure getOperationalContextRef() {
        return operationalContextRef;
    }

    /**
     * Legt den Wert der operationalContextRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalContextRefStructure }
     *     
     */
    public void setOperationalContextRef(OperationalContextRefStructure value) {
        this.operationalContextRef = value;
    }

    /**
     * Reference to a TIMING PATTERN.
     * 
     * @return
     *     possible object is
     *     {@link TimingPatternRefStructure }
     *     
     */
    public TimingPatternRefStructure getTimingPatternRef() {
        return timingPatternRef;
    }

    /**
     * Legt den Wert der timingPatternRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingPatternRefStructure }
     *     
     */
    public void setTimingPatternRef(TimingPatternRefStructure value) {
        this.timingPatternRef = value;
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
     * Ruft den Wert der runTimes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPatternRunTimesRelStructure }
     *     
     */
    public JourneyPatternRunTimesRelStructure getRunTimes() {
        return runTimes;
    }

    /**
     * Legt den Wert der runTimes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPatternRunTimesRelStructure }
     *     
     */
    public void setRunTimes(JourneyPatternRunTimesRelStructure value) {
        this.runTimes = value;
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
     * Ruft den Wert der layovers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPatternLayoversRelStructure }
     *     
     */
    public JourneyPatternLayoversRelStructure getLayovers() {
        return layovers;
    }

    /**
     * Legt den Wert der layovers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPatternLayoversRelStructure }
     *     
     */
    public void setLayovers(JourneyPatternLayoversRelStructure value) {
        this.layovers = value;
    }

    /**
     * Ruft den Wert der pointsInSequence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointsInJourneyPatternRelStructure }
     *     
     */
    public PointsInJourneyPatternRelStructure getPointsInSequence() {
        return pointsInSequence;
    }

    /**
     * Legt den Wert der pointsInSequence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointsInJourneyPatternRelStructure }
     *     
     */
    public void setPointsInSequence(PointsInJourneyPatternRelStructure value) {
        this.pointsInSequence = value;
    }

    /**
     * Ruft den Wert der linksInSequence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinksInJourneyPatternRelStructure }
     *     
     */
    public LinksInJourneyPatternRelStructure getLinksInSequence() {
        return linksInSequence;
    }

    /**
     * Legt den Wert der linksInSequence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinksInJourneyPatternRelStructure }
     *     
     */
    public void setLinksInSequence(LinksInJourneyPatternRelStructure value) {
        this.linksInSequence = value;
    }

}
