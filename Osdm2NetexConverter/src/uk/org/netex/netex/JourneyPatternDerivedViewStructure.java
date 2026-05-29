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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for JOURNEY PATTERN VIEW.
 * 
 * <p>Java-Klasse f�r JourneyPattern_DerivedViewStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="JourneyPattern_DerivedViewStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DerivedViewStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}JourneyPatternRef" minOccurs="0"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}JourneyPatternProperties"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyPattern_DerivedViewStructure", propOrder = {
    "journeyPatternRef",
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
    "noticeAssignments"
})
public class JourneyPatternDerivedViewStructure
    extends DerivedViewStructure
{

    @XmlElementRef(name = "JourneyPatternRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends JourneyPatternRefStructure> journeyPatternRef;
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

    /**
     * Ruft den Wert der journeyPatternRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServicePatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyPatternRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends JourneyPatternRefStructure> getJourneyPatternRef() {
        return journeyPatternRef;
    }

    /**
     * Legt den Wert der journeyPatternRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServicePatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyPatternRefStructure }{@code >}
     *     
     */
    public void setJourneyPatternRef(JAXBElement<? extends JourneyPatternRefStructure> value) {
        this.journeyPatternRef = value;
    }

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

}
