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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Data type for a planned VEHICLE JOURNEY (Production Timetable Service).
 * 
 * <p>Java-Klasse f�r ServiceJourney_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceJourney_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Journey_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}ServiceJourneyGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceJourney_VersionStructure", propOrder = {
    "serviceAlteration",
    "departureTime",
    "departureDayOffset",
    "frequency",
    "journeyDuration",
    "dayTypes",
    "routeRef",
    "journeyPatternRef",
    "timeDemandTypeRef",
    "timingAlgorithmTypeRef",
    "journeyFrequencyGroupRef",
    "vehicleTypeRef",
    "vehicleEquipmentProfileRef",
    "vehicleRef",
    "operationalContextRef",
    "blockRef",
    "courseOfJourneysRef",
    "publicCode",
    "operatorRef",
    "operatorView",
    "lineRef",
    "lineView",
    "flexibleLineView",
    "directionType",
    "journeyPatternView",
    "groupsOfServices",
    "timeDemandTypes",
    "trainNumbers",
    "origin",
    "destination",
    "print",
    "dynamic",
    "waitTimes",
    "runTimes",
    "layovers",
    "passingTimes",
    "passengerAtStopTimes",
    "parts",
    "calls",
    "facilities",
    "checkConstraints",
    "passengerCarryingRequirementRef",
    "passengerCarryingRequirementsView",
    "trainSize",
    "equipments",
    "flexibleServicePropertiesRef",
    "flexibleServiceProperties"
})
@XmlSeeAlso({
    ServiceJourney.class,
    DatedServiceJourneyVersionStructure.class,
    TemplateServiceJourneyVersionStructure.class
})
public class ServiceJourneyVersionStructure
    extends JourneyVersionStructure
{

    @XmlElement(name = "ServiceAlteration", defaultValue = "planned")
    @XmlSchemaType(name = "NMTOKEN")
    protected ServiceAlterationEnumeration serviceAlteration;
    @XmlElement(name = "DepartureTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar departureTime;
    @XmlElement(name = "DepartureDayOffset")
    protected BigInteger departureDayOffset;
    @XmlElement(name = "Frequency")
    protected FrequencyStructure frequency;
    @XmlElement(name = "JourneyDuration")
    protected Duration journeyDuration;
    protected DayTypeRefsRelStructure dayTypes;
    @XmlElement(name = "RouteRef")
    protected RouteRefStructure routeRef;
    @XmlElementRef(name = "JourneyPatternRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends JourneyPatternRefStructure> journeyPatternRef;
    @XmlElement(name = "TimeDemandTypeRef")
    protected TimeDemandTypeRefStructure timeDemandTypeRef;
    @XmlElement(name = "TimingAlgorithmTypeRef")
    protected TimingAlgorithmTypeRefStructure timingAlgorithmTypeRef;
    @XmlElementRef(name = "JourneyFrequencyGroupRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends JourneyFrequencyGroupRefStructure> journeyFrequencyGroupRef;
    @XmlElementRef(name = "VehicleTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends VehicleTypeRefStructure> vehicleTypeRef;
    @XmlElementRef(name = "VehicleEquipmentProfileRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends VehicleEquipmentProfileRefStructure> vehicleEquipmentProfileRef;
    @XmlElementRef(name = "VehicleRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends VehicleRefStructure> vehicleRef;
    @XmlElement(name = "OperationalContextRef")
    protected OperationalContextRefStructure operationalContextRef;
    @XmlElementRef(name = "BlockRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends BlockRefStructure> blockRef;
    @XmlElement(name = "CourseOfJourneysRef")
    protected CourseOfJourneysRefStructure courseOfJourneysRef;
    @XmlElement(name = "PublicCode")
    protected PublicCodeStructure publicCode;
    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    @XmlElement(name = "OperatorView")
    protected OperatorView operatorView;
    @XmlElementRef(name = "LineRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LineRefStructure> lineRef;
    @XmlElement(name = "LineView")
    protected LineView lineView;
    @XmlElement(name = "FlexibleLineView")
    protected FlexibleLineView flexibleLineView;
    @XmlElement(name = "DirectionType", defaultValue = "outbound")
    @XmlSchemaType(name = "normalizedString")
    protected DirectionTypeEnumeration directionType;
    @XmlElement(name = "JourneyPatternView")
    protected JourneyPatternDerivedViewStructure journeyPatternView;
    protected GroupOfServicesRefsRelStructure groupsOfServices;
    protected TimeDemandTypeRefsRelStructure timeDemandTypes;
    protected TrainNumberRefsRelStructure trainNumbers;
    @XmlElement(name = "Origin")
    protected JourneyEndpointStructure origin;
    @XmlElement(name = "Destination")
    protected JourneyEndpointStructure destination;
    @XmlElement(name = "Print", defaultValue = "true")
    protected Boolean print;
    @XmlElement(name = "Dynamic", defaultValue = "always")
    @XmlSchemaType(name = "NMTOKEN")
    protected DynamicAdvertisementEnumeration dynamic;
    protected VehicleJourneyWaitTimesRelStructure waitTimes;
    protected VehicleJourneyRunTimesRelStructure runTimes;
    protected VehicleJourneyLayoversRelStructure layovers;
    protected TimetabledPassingTimesRelStructure passingTimes;
    protected PassengerAtStopTimesRelStructure passengerAtStopTimes;
    protected JourneyPartsRelStructure parts;
    protected CallsRelStructure calls;
    protected ServiceFacilitySetsRelStructure facilities;
    protected CheckConstraintsRelStructure checkConstraints;
    @XmlElement(name = "PassengerCarryingRequirementRef")
    protected PassengerCarryingRequirementRefStructure passengerCarryingRequirementRef;
    @XmlElement(name = "PassengerCarryingRequirementsView")
    protected PassengerCarryingRequirementsView passengerCarryingRequirementsView;
    @XmlElement(name = "TrainSize")
    protected TrainSizeStructure trainSize;
    protected VehicleEquipmentsRelStructure equipments;
    @XmlElement(name = "FlexibleServicePropertiesRef")
    protected FlexibleServicePropertiesRefStructure flexibleServicePropertiesRef;
    @XmlElement(name = "FlexibleServiceProperties")
    protected FlexibleServiceProperties flexibleServiceProperties;

    /**
     * Ruft den Wert der serviceAlteration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAlterationEnumeration }
     *     
     */
    public ServiceAlterationEnumeration getServiceAlteration() {
        return serviceAlteration;
    }

    /**
     * Legt den Wert der serviceAlteration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAlterationEnumeration }
     *     
     */
    public void setServiceAlteration(ServiceAlterationEnumeration value) {
        this.serviceAlteration = value;
    }

    /**
     * Ruft den Wert der departureTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureTime() {
        return departureTime;
    }

    /**
     * Legt den Wert der departureTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureTime(XMLGregorianCalendar value) {
        this.departureTime = value;
    }

    /**
     * Ruft den Wert der departureDayOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDepartureDayOffset() {
        return departureDayOffset;
    }

    /**
     * Legt den Wert der departureDayOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDepartureDayOffset(BigInteger value) {
        this.departureDayOffset = value;
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
     * Ruft den Wert der journeyDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getJourneyDuration() {
        return journeyDuration;
    }

    /**
     * Legt den Wert der journeyDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setJourneyDuration(Duration value) {
        this.journeyDuration = value;
    }

    /**
     * Ruft den Wert der dayTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DayTypeRefsRelStructure }
     *     
     */
    public DayTypeRefsRelStructure getDayTypes() {
        return dayTypes;
    }

    /**
     * Legt den Wert der dayTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DayTypeRefsRelStructure }
     *     
     */
    public void setDayTypes(DayTypeRefsRelStructure value) {
        this.dayTypes = value;
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
     * Reference to a JOURNEY PATTERN.
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
     * Ruft den Wert der timingAlgorithmTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimingAlgorithmTypeRefStructure }
     *     
     */
    public TimingAlgorithmTypeRefStructure getTimingAlgorithmTypeRef() {
        return timingAlgorithmTypeRef;
    }

    /**
     * Legt den Wert der timingAlgorithmTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingAlgorithmTypeRefStructure }
     *     
     */
    public void setTimingAlgorithmTypeRef(TimingAlgorithmTypeRefStructure value) {
        this.timingAlgorithmTypeRef = value;
    }

    /**
     * Ruft den Wert der journeyFrequencyGroupRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link JourneyFrequencyGroupRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HeadwayJourneyGroupRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RhythmicalJourneyGroupRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends JourneyFrequencyGroupRefStructure> getJourneyFrequencyGroupRef() {
        return journeyFrequencyGroupRef;
    }

    /**
     * Legt den Wert der journeyFrequencyGroupRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link JourneyFrequencyGroupRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HeadwayJourneyGroupRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RhythmicalJourneyGroupRefStructure }{@code >}
     *     
     */
    public void setJourneyFrequencyGroupRef(JAXBElement<? extends JourneyFrequencyGroupRefStructure> value) {
        this.journeyFrequencyGroupRef = value;
    }

    /**
     * Ruft den Wert der vehicleTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends VehicleTypeRefStructure> getVehicleTypeRef() {
        return vehicleTypeRef;
    }

    /**
     * Legt den Wert der vehicleTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     
     */
    public void setVehicleTypeRef(JAXBElement<? extends VehicleTypeRefStructure> value) {
        this.vehicleTypeRef = value;
    }

    /**
     * Ruft den Wert der vehicleEquipmentProfileRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VehicleEquipmentProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingEquipmentProfileRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends VehicleEquipmentProfileRefStructure> getVehicleEquipmentProfileRef() {
        return vehicleEquipmentProfileRef;
    }

    /**
     * Legt den Wert der vehicleEquipmentProfileRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VehicleEquipmentProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingEquipmentProfileRefStructure }{@code >}
     *     
     */
    public void setVehicleEquipmentProfileRef(JAXBElement<? extends VehicleEquipmentProfileRefStructure> value) {
        this.vehicleEquipmentProfileRef = value;
    }

    /**
     * VehicleTypeRef is the normally used field, as in many cases only the VEHICLE TYPE is known in advance. VehicleRef is then the exception and used only when the concrete VEHICLE is known in advance. Then also only one vehicle is possible.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TractiveRollingStockItemRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrailingRollingStockItemRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RollingStockItemRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends VehicleRefStructure> getVehicleRef() {
        return vehicleRef;
    }

    /**
     * Legt den Wert der vehicleRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TractiveRollingStockItemRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrailingRollingStockItemRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RollingStockItemRefStructure }{@code >}
     *     
     */
    public void setVehicleRef(JAXBElement<? extends VehicleRefStructure> value) {
        this.vehicleRef = value;
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
     * Reference to a BLOCK.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrainBlockRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BlockRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends BlockRefStructure> getBlockRef() {
        return blockRef;
    }

    /**
     * Legt den Wert der blockRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrainBlockRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BlockRefStructure }{@code >}
     *     
     */
    public void setBlockRef(JAXBElement<? extends BlockRefStructure> value) {
        this.blockRef = value;
    }

    /**
     * Ruft den Wert der courseOfJourneysRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CourseOfJourneysRefStructure }
     *     
     */
    public CourseOfJourneysRefStructure getCourseOfJourneysRef() {
        return courseOfJourneysRef;
    }

    /**
     * Legt den Wert der courseOfJourneysRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseOfJourneysRefStructure }
     *     
     */
    public void setCourseOfJourneysRef(CourseOfJourneysRefStructure value) {
        this.courseOfJourneysRef = value;
    }

    /**
     * Ruft den Wert der publicCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublicCodeStructure }
     *     
     */
    public PublicCodeStructure getPublicCode() {
        return publicCode;
    }

    /**
     * Legt den Wert der publicCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicCodeStructure }
     *     
     */
    public void setPublicCode(PublicCodeStructure value) {
        this.publicCode = value;
    }

    /**
     * Ruft den Wert der operatorRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRefStructure }
     *     
     */
    public OperatorRefStructure getOperatorRef() {
        return operatorRef;
    }

    /**
     * Legt den Wert der operatorRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRefStructure }
     *     
     */
    public void setOperatorRef(OperatorRefStructure value) {
        this.operatorRef = value;
    }

    /**
     * Ruft den Wert der operatorView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatorView }
     *     
     */
    public OperatorView getOperatorView() {
        return operatorView;
    }

    /**
     * Legt den Wert der operatorView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorView }
     *     
     */
    public void setOperatorView(OperatorView value) {
        this.operatorView = value;
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
     * Ruft den Wert der lineView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LineView }
     *     
     */
    public LineView getLineView() {
        return lineView;
    }

    /**
     * Legt den Wert der lineView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LineView }
     *     
     */
    public void setLineView(LineView value) {
        this.lineView = value;
    }

    /**
     * Ruft den Wert der flexibleLineView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleLineView }
     *     
     */
    public FlexibleLineView getFlexibleLineView() {
        return flexibleLineView;
    }

    /**
     * Legt den Wert der flexibleLineView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleLineView }
     *     
     */
    public void setFlexibleLineView(FlexibleLineView value) {
        this.flexibleLineView = value;
    }

    /**
     * Ruft den Wert der directionType-Eigenschaft ab.
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
     * Ruft den Wert der journeyPatternView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPatternDerivedViewStructure }
     *     
     */
    public JourneyPatternDerivedViewStructure getJourneyPatternView() {
        return journeyPatternView;
    }

    /**
     * Legt den Wert der journeyPatternView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPatternDerivedViewStructure }
     *     
     */
    public void setJourneyPatternView(JourneyPatternDerivedViewStructure value) {
        this.journeyPatternView = value;
    }

    /**
     * Ruft den Wert der groupsOfServices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfServicesRefsRelStructure }
     *     
     */
    public GroupOfServicesRefsRelStructure getGroupsOfServices() {
        return groupsOfServices;
    }

    /**
     * Legt den Wert der groupsOfServices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfServicesRefsRelStructure }
     *     
     */
    public void setGroupsOfServices(GroupOfServicesRefsRelStructure value) {
        this.groupsOfServices = value;
    }

    /**
     * Ruft den Wert der timeDemandTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeDemandTypeRefsRelStructure }
     *     
     */
    public TimeDemandTypeRefsRelStructure getTimeDemandTypes() {
        return timeDemandTypes;
    }

    /**
     * Legt den Wert der timeDemandTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDemandTypeRefsRelStructure }
     *     
     */
    public void setTimeDemandTypes(TimeDemandTypeRefsRelStructure value) {
        this.timeDemandTypes = value;
    }

    /**
     * Ruft den Wert der trainNumbers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainNumberRefsRelStructure }
     *     
     */
    public TrainNumberRefsRelStructure getTrainNumbers() {
        return trainNumbers;
    }

    /**
     * Legt den Wert der trainNumbers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainNumberRefsRelStructure }
     *     
     */
    public void setTrainNumbers(TrainNumberRefsRelStructure value) {
        this.trainNumbers = value;
    }

    /**
     * Ruft den Wert der origin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyEndpointStructure }
     *     
     */
    public JourneyEndpointStructure getOrigin() {
        return origin;
    }

    /**
     * Legt den Wert der origin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyEndpointStructure }
     *     
     */
    public void setOrigin(JourneyEndpointStructure value) {
        this.origin = value;
    }

    /**
     * Ruft den Wert der destination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyEndpointStructure }
     *     
     */
    public JourneyEndpointStructure getDestination() {
        return destination;
    }

    /**
     * Legt den Wert der destination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyEndpointStructure }
     *     
     */
    public void setDestination(JourneyEndpointStructure value) {
        this.destination = value;
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
     * Ruft den Wert der waitTimes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleJourneyWaitTimesRelStructure }
     *     
     */
    public VehicleJourneyWaitTimesRelStructure getWaitTimes() {
        return waitTimes;
    }

    /**
     * Legt den Wert der waitTimes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleJourneyWaitTimesRelStructure }
     *     
     */
    public void setWaitTimes(VehicleJourneyWaitTimesRelStructure value) {
        this.waitTimes = value;
    }

    /**
     * Ruft den Wert der runTimes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleJourneyRunTimesRelStructure }
     *     
     */
    public VehicleJourneyRunTimesRelStructure getRunTimes() {
        return runTimes;
    }

    /**
     * Legt den Wert der runTimes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleJourneyRunTimesRelStructure }
     *     
     */
    public void setRunTimes(VehicleJourneyRunTimesRelStructure value) {
        this.runTimes = value;
    }

    /**
     * Ruft den Wert der layovers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleJourneyLayoversRelStructure }
     *     
     */
    public VehicleJourneyLayoversRelStructure getLayovers() {
        return layovers;
    }

    /**
     * Legt den Wert der layovers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleJourneyLayoversRelStructure }
     *     
     */
    public void setLayovers(VehicleJourneyLayoversRelStructure value) {
        this.layovers = value;
    }

    /**
     * Ruft den Wert der passingTimes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimetabledPassingTimesRelStructure }
     *     
     */
    public TimetabledPassingTimesRelStructure getPassingTimes() {
        return passingTimes;
    }

    /**
     * Legt den Wert der passingTimes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimetabledPassingTimesRelStructure }
     *     
     */
    public void setPassingTimes(TimetabledPassingTimesRelStructure value) {
        this.passingTimes = value;
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
     * Ruft den Wert der parts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPartsRelStructure }
     *     
     */
    public JourneyPartsRelStructure getParts() {
        return parts;
    }

    /**
     * Legt den Wert der parts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPartsRelStructure }
     *     
     */
    public void setParts(JourneyPartsRelStructure value) {
        this.parts = value;
    }

    /**
     * Ruft den Wert der calls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallsRelStructure }
     *     
     */
    public CallsRelStructure getCalls() {
        return calls;
    }

    /**
     * Legt den Wert der calls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallsRelStructure }
     *     
     */
    public void setCalls(CallsRelStructure value) {
        this.calls = value;
    }

    /**
     * Ruft den Wert der facilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFacilitySetsRelStructure }
     *     
     */
    public ServiceFacilitySetsRelStructure getFacilities() {
        return facilities;
    }

    /**
     * Legt den Wert der facilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFacilitySetsRelStructure }
     *     
     */
    public void setFacilities(ServiceFacilitySetsRelStructure value) {
        this.facilities = value;
    }

    /**
     * Ruft den Wert der checkConstraints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CheckConstraintsRelStructure }
     *     
     */
    public CheckConstraintsRelStructure getCheckConstraints() {
        return checkConstraints;
    }

    /**
     * Legt den Wert der checkConstraints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckConstraintsRelStructure }
     *     
     */
    public void setCheckConstraints(CheckConstraintsRelStructure value) {
        this.checkConstraints = value;
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
     * Ruft den Wert der flexibleServicePropertiesRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleServicePropertiesRefStructure }
     *     
     */
    public FlexibleServicePropertiesRefStructure getFlexibleServicePropertiesRef() {
        return flexibleServicePropertiesRef;
    }

    /**
     * Legt den Wert der flexibleServicePropertiesRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleServicePropertiesRefStructure }
     *     
     */
    public void setFlexibleServicePropertiesRef(FlexibleServicePropertiesRefStructure value) {
        this.flexibleServicePropertiesRef = value;
    }

    /**
     * Ruft den Wert der flexibleServiceProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleServiceProperties }
     *     
     */
    public FlexibleServiceProperties getFlexibleServiceProperties() {
        return flexibleServiceProperties;
    }

    /**
     * Legt den Wert der flexibleServiceProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleServiceProperties }
     *     
     */
    public void setFlexibleServiceProperties(FlexibleServiceProperties value) {
        this.flexibleServiceProperties = value;
    }

}
