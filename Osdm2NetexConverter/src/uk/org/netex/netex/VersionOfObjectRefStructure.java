//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for a versioned reference to a NeTEx Object.
 * 
 * <p>Java-Klasse f�r VersionOfObjectRefStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VersionOfObjectRefStructure">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.netex.org.uk/netex>ObjectIdType">
 *       &lt;attGroup ref="{http://www.netex.org.uk/netex}ReferenceModificationDetailsGroup"/>
 *       &lt;attribute name="nameOfRefClass" type="{http://www.netex.org.uk/netex}NameOfClass" />
 *       &lt;attribute name="modification" type="{http://www.netex.org.uk/netex}ModificationEnumeration" />
 *       &lt;attribute name="ref" use="required" type="{http://www.netex.org.uk/netex}ObjectIdType" />
 *       &lt;attribute name="versionRef" type="{http://www.netex.org.uk/netex}VersionIdType" />
 *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionOfObjectRefStructure", propOrder = {
    "value"
})
@XmlSeeAlso({
    PassengerCapacityRefStructure.class,
    TravelDocumentRefStructure.class,
    DeckRefStructure.class,
    RoundingStepRefStructure.class,
    OnboardStayRefStructure.class,
    TimebandRefStructure.class,
    ModeRestrictionAssessmentRefStructure.class,
    CellRefStructure.class,
    FlexibleServicePropertiesRefStructure.class,
    TariffRefStructure.class,
    DriverRefStructure.class,
    AccommodationRefStructure.class,
    IndividualPassengerInfoRefStructure.class,
    IndividualTravellerRefStructure.class,
    SensorInSpotRefStructure.class,
    LineRefStructure.class,
    VehicleEquipmentProfileRefStructure.class,
    FacilityRefStructure.class,
    SchematicMapMemberRefStructure.class,
    DayTypeRefStructure.class,
    ZoneInSeriesRefStructure.class,
    DestinationDisplayRefStructure.class,
    NoticeRefStructure.class,
    FareTableRowRefStructure.class,
    DataSourceRefStructure.class,
    CustomerAccountRefStructure.class,
    VehicleServiceRefStructure.class,
    DeckPlanRefStructure.class,
    ResponsibilitySetRefStructure.class,
    ResponsibilityRoleRefStructure.class,
    SpotColumnRefStructure.class,
    DestinationDisplayVariantRefStructure.class,
    AllowedLineDirectionRefStructure.class,
    ParkingPropertiesRefStructure.class,
    BookingArrangementRefStructure.class,
    PricingParameterSetRefStructure.class,
    AllOrganisationsRefStructure.class,
    OpenTransportModeRefStructure.class,
    JourneyMeetingRefStructure.class,
    PassengerSeatRefStructure.class,
    ResidentialQualificationRefStructure.class,
    AccountableElementRefStructure.class,
    VehicleProfileRefStructure.class,
    TrainElementTypeRefStructure.class,
    VehicleRequirementRefStructure.class,
    VehicleModelProfileRefStructure.class,
    FlexibleLinkPropertiesRefStructure.class,
    RechargingPlanRefStructure.class,
    SpotAffinityRefStructure.class,
    DeckSpaceCapacityRefStructure.class,
    TrainNumberRefStructure.class,
    FareTableColumnRefStructure.class,
    ContractRefStructure.class,
    FareContractRefStructure.class,
    CoupledJourneyRefStructure.class,
    PricingServiceRefStructure.class,
    InterchangeRefStructure.class,
    DriverTripRefStructure.class,
    MediumApplicationInstanceRefStructure.class,
    PassengerVehicleCapacityRefStructure.class,
    OperatingDayRefStructure.class,
    DeckEntranceUsageRefStructure.class,
    TimeDemandProfileRefStructure.class,
    VehicleServicePartRefStructure.class,
    SecurityListRefStructure.class,
    AlternativeNameRefStructure.class,
    LegRefStructure.class,
    FacilitySetRefStructure.class,
    SensorInEntranceRefStructure.class,
    JourneyPartCoupleRefStructure.class,
    DeliveryVariantRefStructure.class,
    VehiclePoolingDriverInfoRefStructure.class,
    SchematicMapRefStructure.class,
    TimeDemandTypeRefStructure.class,
    RoundingRefStructure.class,
    TrainInCompoundTrainRefStructure.class,
    CustomerRefStructure.class,
    LogicalDisplayRefStructure.class,
    VehicleJourneySpotAllocationRefStructure.class,
    CallRefStructure.class,
    MonthValidityOffsetRefStructure.class,
    SiteStructureRefStructure.class,
    TransferRefStructure.class,
    ContactRefStructure.class,
    SubmodeRefStructure.class,
    VehiclePositionAlignmentRefStructure.class,
    FlexiblePointPropertiesRefStructure.class,
    CustomerPaymentMeansRefStructure.class,
    ReliefOpportunityRefStructure.class,
    GeneralFrameMemberRefStructure.class,
    MediumAccessDeviceRefStructure.class,
    ProjectionRefStructure.class,
    BlockRefStructure.class,
    DriverTripTimeRefStructure.class,
    BlockPartRefStructure.class,
    AccessibilityAssessmentRefStructure.class,
    RollingStockInventoryRefStructure.class,
    OrganisationPartRefStructure.class,
    VehicleQuayAlignmentRefStructure.class,
    DeckLevelRefStructure.class,
    VehicleModelRefStructure.class,
    SecurityListingRefStructure.class,
    CustomerEligibilityRefStructure.class,
    LevelRefStructure.class,
    AlternativeTextRefStructure.class,
    CourseOfJourneysRefStructure.class,
    RouteInstructionRefStructure.class,
    VersionRefStructure.class,
    RidePartRefStructure.class,
    CompoundBlockRefStructure.class,
    OnboardSpaceRefStructure.class,
    DeckEntranceCoupleRefStructure.class,
    LevelInStructureRefStructure.class,
    LineNetworkRefStructure.class,
    DutyRefStructure.class,
    RechargingStepRefStructure.class,
    VehicleEquipmentProfileMemberRefStructure.class,
    SpotRowRefStructure.class,
    ServiceCalendarRefStructure.class,
    ValidityConditionRefStructure.class,
    LinkRefStructure.class,
    FarePriceRefStructure.class,
    VehicleRefStructure.class,
    OperationalContextRefStructure.class,
    ParkingCapacityRefStructure.class,
    PassengerInformationRequestRefStructure.class,
    PassengerSpotAllocationRefStructure.class,
    VersionFrameRefStructure.class,
    LimitationRefStructure.class,
    PointRefStructure.class,
    OrganisationRefStructure.class,
    StartTimeAtStopPointRefStructure.class,
    EntityInVersionInFrameRefStructure.class,
    TransportTypeRefStructure.class,
    OperatingPeriodRefStructure.class,
    CustomerPurchasePackageElementAccessRefStructure.class,
    PriceableObjectRefStructure.class,
    LogEntryRefStructure.class,
    JourneyTimingRefStructure.class,
    GroupOfEntitiesRefStructureDummy.class,
    OrderedVersionOfObjectRefStructure.class,
    RentalAvailabilityRefStructure.class,
    LinkSequenceRefStructure.class,
    OccupancyViewRefStructure.class,
    EquipmentRefStructure.class,
    TypeOfValueRefStructure.class
})
public class VersionOfObjectRefStructure {

    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "nameOfRefClass")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nameOfRefClass;
    @XmlAttribute(name = "modification")
    protected ModificationEnumeration modification;
    @XmlAttribute(name = "ref", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ref;
    @XmlAttribute(name = "versionRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String versionRef;
    @XmlAttribute(name = "uri")
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlAttribute(name = "created")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlAttribute(name = "changed")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changed;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String version;

    /**
     * Abstract Type for identifier of a NeTEx Object.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der nameOfRefClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfRefClass() {
        return nameOfRefClass;
    }

    /**
     * Legt den Wert der nameOfRefClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfRefClass(String value) {
        this.nameOfRefClass = value;
    }

    /**
     * Ruft den Wert der modification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ModificationEnumeration }
     *     
     */
    public ModificationEnumeration getModification() {
        return modification;
    }

    /**
     * Legt den Wert der modification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationEnumeration }
     *     
     */
    public void setModification(ModificationEnumeration value) {
        this.modification = value;
    }

    /**
     * Ruft den Wert der ref-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Legt den Wert der ref-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Ruft den Wert der versionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionRef() {
        return versionRef;
    }

    /**
     * Legt den Wert der versionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionRef(String value) {
        this.versionRef = value;
    }

    /**
     * Ruft den Wert der uri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Legt den Wert der uri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Ruft den Wert der created-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Legt den Wert der created-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Ruft den Wert der changed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChanged() {
        return changed;
    }

    /**
     * Legt den Wert der changed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChanged(XMLGregorianCalendar value) {
        this.changed = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
