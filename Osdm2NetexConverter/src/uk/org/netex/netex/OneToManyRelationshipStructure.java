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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for an Implementation of a one to many relationship . A one to many relationship from the source (one) to the target (many)
 * 
 * <p>Java-Klasse f�r oneToManyRelationshipStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="oneToManyRelationshipStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}relationshipStructure">
 *       &lt;attribute name="modificationSet" type="{http://www.netex.org.uk/netex}ModificationSetEnumeration" default="all" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oneToManyRelationshipStructure")
@XmlSeeAlso({
    PassengerCapacitiesRelStructure.class,
    ObjectRefsRelStructure.class,
    StopPlaceRefsRelStructure.class,
    ResidentialQualificationsRelStructure.class,
    TypeOfCustomerAccountRefsRelStructure.class,
    OpenTransportModeRefsRelStructure.class,
    TrainComponentStopAssignmentRefsRelStructure.class,
    CustomerPaymentMeanRefsRelStructure.class,
    TypeOfOrganisationRefsRelStructure.class,
    PriceUnitRefsRelStructure.class,
    PointInSingleJourneyPathRefsRelStructure.class,
    TypeOfAccessRightAssignmentRefsRelStructure.class,
    VehicleSharingPlaceAssignmentRefsRelStructure.class,
    TaxiServicePlaceAssignmentRefsRelStructure.class,
    MediumAccessDeviceSecurityListingRefsRelStructure.class,
    TransportTypeRefsRelStructure.class,
    DummyPlaceRefsRelStructure.class,
    RetailDeviceRefsRelStructure.class,
    TypeOfPricingRuleRefsRelStructure.class,
    CustomerRefsRelStructure.class,
    TypeOfEntityRefsRelStructure.class,
    TariffZoneRefsRelStructure.class,
    TypeOfWheelchairRefsRelStructure.class,
    TypeOfMachineReadabilityRefsRelStructure.class,
    StopAreaRefsRelStructure.class,
    FlexibleStopPlaceRefsRelStructure.class,
    OffSitePathLinkRefsRelStructure.class,
    IndividualPassengerInfoRefsRelStructure.class,
    SiteNavigationPathRefsRelStructure.class,
    GenericPathLinkRefsRelStructure.class,
    ContractRefsRelStructure.class,
    ScheduledStopPointRefsRelStructure.class,
    SecuritylistRefsRelStructure.class,
    UserProfileRefsRelStructure.class,
    EntitlementRequiredRefsRelStructure.class,
    DynamicVehicleMeetingPointAssignmentRefsRelStructure.class,
    FleetRefsRelStructure.class,
    LinkRefsRelStructure.class,
    OnlineServiceOperatorRefsRelStructure.class,
    FulfilmentMethodRefsRelStructure.class,
    SalesOfferPackageRefsRelStructure.class,
    DeckRefsRelStructure.class,
    IndividualTravellerRefsRelStructure.class,
    TypeOfFrameRefsRelStructure.class,
    DestinationDisplayVariantRefsRelStructure.class,
    ParkingBayRefsRelStructure.class,
    TopographicPlaceRefsRelStructure.class,
    GroupsOfOperatorsRefsRelStructure.class,
    ValidityConditionRefsRelStructure.class,
    ServiceAccessCodeRefsRelStructure.class,
    JourneyPatternRefsRelStructure.class,
    LinkSequenceRefsRelStructure.class,
    FareZoneRefsRelStructure.class,
    TypeOfPaymentMethodRefsRelStructure.class,
    RollingStockItemRefsRelStructure.class,
    FlexibleServicePropertiesRelStructure.class,
    PointOfInterestClassificationsViewsRelStructure.class,
    LinkTypeRefsRelStructure.class,
    TypeOfsalesOfferPackageRefsRelStructure.class,
    VehicleEquipmentProfileMemberRefsRelStructure.class,
    DeckPlanRefsRelStructure.class,
    TypeOfServiceFeatureRefsRelStructure.class,
    ComplexFeatureRefsRelStructure.class,
    DeckEntranceAssignmentRefsRelStructure.class,
    VehicleJourneyRefsRelStructure.class,
    VehiclePoolingDriverInfoRefsRelStructure.class,
    FareElementInSequenceRefsRelStructure.class,
    ParkingAreaRefsRelStructure.class,
    AmountOfPriceUnitRefsRelStructure.class,
    JourneyRefsRelStructure.class,
    MobilityServiceConstraintZoneRefsRelStructure.class,
    CodespacesRelStructure.class,
    FeatureTypeRefsRelStructure.class,
    AllowedLineDirectionRefsRelStructure.class,
    GarageRefsRelStructure.class,
    GroupOfcustomerPurchasePackageRefsRelStructure.class,
    VehicleJourneySpotAllocationRefsRelStructure.class,
    SecurityListingRefsRelStructure.class,
    SitePathLinkRefsRelStructure.class,
    DayTypeRefsRelStructure.class,
    EntranceRefsRelStructure.class,
    ModeRefsRelStructure.class,
    LocatableSpotRefsRelStructure.class,
    StandardFareTableRefsRelStructure.class,
    CustomerEligibilityRefsRelStructure.class,
    VehicleMeetingPointRefsRelStructure.class,
    RollingStockInventoryRefsRelStructure.class,
    VehicleTypeZoneRestrictionRefsRelStructure.class,
    TypeOfProductCategoryRefsRelStructure.class,
    LineRefsRelStructure.class,
    TimebandRefsRelStructure.class,
    TaxiRankRefsRelStructure.class,
    ActivationTypeRefsRelStructure.class,
    VehicleServicePlaceAssignmentRefsRelStructure.class,
    TypeOfZoneRefsRelStructure.class,
    ParkingComponentRefsRelStructure.class,
    GroupOfTariffZoneRefsRelStructure.class,
    VehicleRefsRelStructure.class,
    AccessRefsRelStructure.class,
    FareStructureElementRefsRelStructure.class,
    MediumApplicationInstanceRefsRelStructure.class,
    TypeOfSecurityListRefsRelStructure.class,
    OperationalContexRefsRelStructure.class,
    FlexibleLineRefsRelStructure.class,
    GroupOfDistanceMatrixElementsRefsRelStructure.class,
    ParkingRefsRelStructure.class,
    TypeOfRetailDeviceRefsRelStructure.class,
    OrganisationalUnitRefsRelStructure.class,
    PointOfInterestRefsRelStructure.class,
    JourneyPartRefsRelStructure.class,
    ServiceAccessRightRefsRelStructure.class,
    TemporalValidityParametersRelStructure.class,
    EntitlementGivenRefsRelStructure.class,
    DatedSpecialServiceRefsRelStructure.class,
    ClassesInRepositoryRelStructure.class,
    TimeDemandTypeRefsRelStructure.class,
    SingleJourneyRefsRelStructure.class,
    DistributionChannelRefsRelStructure.class,
    SeriesConstraintRefsRelStructure.class,
    ValidityRuleParameterRefsRelStructure.class,
    VehicleAccessCredentialsAssignmentRefsRelStructure.class,
    ThirdPartyProductRefsRelStructure.class,
    SiteStructureRefsRelStructure.class,
    BlockRefsRelStructure.class,
    CustomerPurchasePackageRefsRelStructure.class,
    GroupMembershipRefsRelStructure.class,
    TypeOfPlaceRefsRelStructure.class,
    RetailConsortiumRefsRelStructure.class,
    VehicleMeetingPointAssignmentRefsRelStructure.class,
    VehicleTypeRefsRelStructure.class,
    ClassInFrameRefsRelStructure.class,
    PoolOfVehiclesRefsRelStructure.class,
    TravelDocumentSecurityListingRefsRelStructure.class,
    PathLinksInSequenceRefsRelStructure.class,
    FareContractSecurityListingRefsRelStructure.class,
    TravelSpecificationRefsRelStructure.class,
    TypeOfFareContractRefsRelStructure.class,
    GenericNavigationPathRefsRelStructure.class,
    ValidityParametersRelStructure.class,
    GroupOfSalesOfferPackageRefsRelStructure.class,
    TransportOrganisationRefsRelStructure.class,
    TypeOfFareContractEntryRefsRelStructure.class,
    SpotAllocationMethodRefsRelStructure.class,
    TypeOfFacilityRefsRelStructure.class,
    TimingLinkRefsRelStructure.class,
    CommonVehicleServiceRefsRelStructure.class,
    CustomerAccountSecurityListingRefsRelStructure.class,
    DeckPlanAssignmentRefsRelStructure.class,
    TypesOfProofRefsRelStructure.class,
    FareDebitRefsRelStructure.class,
    PassengerSpotAllocationRefsRelStructure.class,
    BoardingPositionRefsRelStructure.class,
    TariffRefsRelStructure.class,
    DeckNavigationPathRefsRelStructure.class,
    PlaceRefsRelStructure.class,
    UsageParameterRefsRelStructure.class,
    SalesTransactionRefsRelStructure.class,
    WhitelistRefsRelStructure.class,
    OnlineServiceRefsRelStructure.class,
    SpotRowRefsRelStructure.class,
    DestinationDisplayRefsRelStructure.class,
    SpotColumnRefsRelStructure.class,
    CompanionProfilesRelStructure.class,
    BlacklistRefsRelStructure.class,
    DepartmentRefsRelStructure.class,
    UsedInRefsRelStructure.class,
    TypeOfServiceRefsRelStructure.class,
    AdministrativeZoneRefsRelStructure.class,
    ValidityTriggerRefsRelStructure.class,
    ClassRefsRelStructure.class,
    DistanceMatrixElementRefsRelStructure.class,
    PriceableObjectRefsRelStructure.class,
    ExplicitJourneyRefsRelStructure.class,
    TypesOfEquipmentRelStructure.class,
    ZoneRefsRelStructure.class,
    CustomerAccountRefsRelStructure.class,
    TypeOfTravelDocumentRefsRelStructure.class,
    TypeOfFareProductRefsRelStructure.class,
    CountryRefsRelStructure.class,
    FareProductRefsRelStructure.class,
    VehiclePoolingPlaceAssignmentRefsRelStructure.class,
    FareScheduledStopPointRefsRelStructure.class,
    PointRefsRelStructure.class,
    FareTableRefsRelStructure.class,
    MediumAccessDeviceRefsRelStructure.class,
    VersionFrameRefsRelStructure.class,
    SimpleVehicleTypeRefsRelStructure.class,
    RouteRefsRelStructure.class,
    QuayRefsRelStructure.class,
    RetailDeviceSecurityListingRefsRelStructure.class,
    CustomerSecurityListingRefsRelStructure.class,
    TrainComponentLabelAssignmentRefsRelStructure.class,
    GroupOfServicesRefsRelStructure.class,
    SiteRefsRelStructure.class,
    TypesOfFrameRelStructure.class,
    UsageParametersRelStructure.class,
    CustomerPurchasePackagesRelStructure.class,
    LayerRefsRelStructure.class,
    SingleJourneyPathRefsRelStructure.class,
    TravelSpecificationJourneyRefsRelStructure.class,
    TrainNumberRefsRelStructure.class,
    VehicleEquipmentProfileRefsRelStructure.class,
    ContactRefsRelStructure.class,
    DiscountRightRefsRelStructure.class,
    VehicleServicePlaceAssignmentsRelStructure.class,
    TransferRefsRelStructure.class,
    SpecialServiceRefsRelStructure.class,
    CustomerAccountStatusRefsRelStructure.class,
    TimeIntervalRefsRelStructure.class,
    OrganisationRefsRelStructure.class,
    TypeOfPointRefsRelStructure.class
})
public class OneToManyRelationshipStructure
    extends RelationshipStructure
{

    @XmlAttribute(name = "modificationSet")
    protected ModificationSetEnumeration modificationSet;

    /**
     * Ruft den Wert der modificationSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ModificationSetEnumeration }
     *     
     */
    public ModificationSetEnumeration getModificationSet() {
        if (modificationSet == null) {
            return ModificationSetEnumeration.ALL;
        } else {
            return modificationSet;
        }
    }

    /**
     * Legt den Wert der modificationSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationSetEnumeration }
     *     
     */
    public void setModificationSet(ModificationSetEnumeration value) {
        this.modificationSet = value;
    }

}
