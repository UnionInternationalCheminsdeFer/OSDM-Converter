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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Abstract Type for a MANAGED OBJECT.
 * 
 * <p>Java-Klasse f�r DataManagedObjectStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DataManagedObjectStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}EntityInVersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="responsibilitySetRef" type="{http://www.netex.org.uk/netex}ResponsibilitySetIdType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataManagedObjectStructure", propOrder = {
    "keyList",
    "privateCodes",
    "extensions",
    "brandingRef"
})
@XmlSeeAlso({
    TrainElementTypeDummy.class,
    SiteStructureVersionStructure.class,
    VehicleServiceVersionStructure.class,
    LineShapeStructure.class,
    CustomerAccountVersionStructure.class,
    PricingServiceVersionedStructure.class,
    JourneyPartCoupleVersionStructure.class,
    FlexibleServicePropertiesVersionStructure.class,
    CustomerVersionStructure.class,
    ReliefOpportunityVersionStructure.class,
    RollingStockInventoryVersionStructure.class,
    TimeDemandProfileVersionStructure.class,
    LevelVersionStructure.class,
    DriverTripVersionStructure.class,
    DutyVersionStructure.class,
    IndividualTravellerVersionStructure.class,
    DefaultInterchangeVersionStructure.class,
    RechargingPlanVersionStructure.class,
    ValueSetVersionStructure.class,
    TimeDemandTypeVersionStructure.class,
    TrainNumberVersionStructure.class,
    VehicleServicePartVersionStructure.class,
    RouteInstructionVersionStructure.class,
    VehicleModelVersionStructure.class,
    JourneyMeetingVersionStructure.class,
    OperationalContextVersionStructure.class,
    SecurityListVersionStructure.class,
    AllowedLineDirectionVersionStructure.class,
    VersionVersionStructure.class,
    FareContractVersionStructure.class,
    VehicleEquipmentProfileVersionStructure.class,
    JourneyPartVersionStructure.class,
    MonthValidityOffsetVersionedStructure.class,
    AcceptedDriverPermitVersionStructure.class,
    CoupledJourneyVersionStructure.class,
    InterchangeVersionStructure.class,
    VehicleJourneySpotAllocationVersionStructure.class,
    BlockVersionStructure.class,
    LineVersionStructure.class,
    DeliveryVariantVersionStructure.class,
    LineNetworkVersionStructure.class,
    LogicalDisplayVersionStructure.class,
    OperatingDayVersionStructure.class,
    DeckPlanVersionStructure.class,
    DestinationDisplayVersionStructure.class,
    DriverTripTimeVersionStructure.class,
    SpotAffinityVersionStructure.class,
    CourseOfJourneysVersionStructure.class,
    AccountableElementStructure.class,
    FacilitySetVersionStructure.class,
    RoundingVersionedStructure.class,
    EquipmentPositionStructure.class,
    TransferVersionStructure.class,
    TariffVersionStructure.class,
    DayTypeVersionStructure.class,
    VehicleRequirementVersionStructure.class,
    OperatingPeriodVersionStructure.class,
    PricingParameterSetVersionedStructure.class,
    DestinationDisplayVariantVersionStructure.class,
    VehicleVersionStructure.class,
    ResponsibilitySetVersionStructure.class,
    CompoundBlockStructure.class,
    IndividualPassengerInfoVersionStructure.class,
    NoticeVersionStructure.class,
    TrainComponentVersionStructure.class,
    MediumAccessDeviceVersionStructure.class,
    BlockPartVersionStructure.class,
    ServiceCalendarVersionStructure.class,
    ParkingTariffVersionStructure.class,
    TravelDocumentVersionStructure.class,
    DeckLevelVersionStructure.class,
    TimebandVersionedChildStructure.class,
    ProjectionVersionStructure.class,
    SchematicMapVersionStructure.class,
    BookingArrangementVersionStructure.class,
    OrganisationVersionStructure.class,
    VehiclePoolingDriverInfoVersionStructure.class,
    VehicleModelProfileVersionStructure.class,
    ResponsibilityRoleVersionStructure.class,
    ContactVersionStructure.class,
    LinkSequenceVersionStructure.class,
    TypeOfValueVersionStructure.class,
    LogEntryVersionStructure.class,
    TransportTypeVersionStructure.class,
    PricingRuleVersionedStructure.class,
    LinkVersionStructure.class,
    PointVersionStructure.class,
    ContractVersionStructure.class,
    PriceableObjectVersionStructure.class,
    OrganisationPartVersionStructure.class,
    AssignmentVersionStructureDummy.class,
    VersionFrameVersionStructure.class,
    GroupOfEntitiesVersionStructure.class,
    MediumAccessDeviceDummy.class,
    PassengerCapacityStructure.class,
    DataManagedObjectViewStructure.class,
    EquipmentVersionStructure.class,
    TrainElementTypeVersionStructure.class,
    OccupancyViewVersionStructure.class,
    PassengerVehicleCapacityStructure.class,
    ValidityConditionVersionStructure.class
})
public abstract class DataManagedObjectStructure
    extends EntityInVersionStructure
{

    protected KeyListStructure keyList;
    protected PrivateCodesStructure privateCodes;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlElement(name = "BrandingRef")
    protected BrandingRefStructure brandingRef;
    @XmlAttribute(name = "responsibilitySetRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String responsibilitySetRef;

    /**
     * A list of alternative Key values for an element.
     * 
     * @return
     *     possible object is
     *     {@link KeyListStructure }
     *     
     */
    public KeyListStructure getKeyList() {
        return keyList;
    }

    /**
     * Legt den Wert der keyList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyListStructure }
     *     
     */
    public void setKeyList(KeyListStructure value) {
        this.keyList = value;
    }

    /**
     * A list of private codes that uniquely identifiy the element. May be used for inter-operating with other (legacy) systems. +v2.0
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodesStructure }
     *     
     */
    public PrivateCodesStructure getPrivateCodes() {
        return privateCodes;
    }

    /**
     * Legt den Wert der privateCodes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodesStructure }
     *     
     */
    public void setPrivateCodes(PrivateCodesStructure value) {
        this.privateCodes = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    /**
     * Ruft den Wert der brandingRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BrandingRefStructure }
     *     
     */
    public BrandingRefStructure getBrandingRef() {
        return brandingRef;
    }

    /**
     * Legt den Wert der brandingRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandingRefStructure }
     *     
     */
    public void setBrandingRef(BrandingRefStructure value) {
        this.brandingRef = value;
    }

    /**
     * Ruft den Wert der responsibilitySetRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibilitySetRef() {
        return responsibilitySetRef;
    }

    /**
     * Legt den Wert der responsibilitySetRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibilitySetRef(String value) {
        this.responsibilitySetRef = value;
    }

}
