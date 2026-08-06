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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a SCHEMATIC MAP MEMBER.
 * 
 * <p>Java-Klasse f�r SchematicMapMember_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SchematicMapMember_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SchematicMapMemberGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchematicMapMember_VersionedChildStructure", propOrder = {
    "name",
    "versionOfObjectRef",
    "hide",
    "displayAsIcon",
    "infoLink",
    "x",
    "y",
    "projection"
})
public class SchematicMapMemberVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElementRef(name = "VersionOfObjectRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends VersionOfObjectRefStructure> versionOfObjectRef;
    @XmlElement(name = "Hide")
    protected Boolean hide;
    @XmlElement(name = "DisplayAsIcon")
    protected Boolean displayAsIcon;
    @XmlElement(name = "InfoLink")
    protected InfoLinkStructure infoLink;
    protected Float x;
    protected Float y;
    @XmlElementRef(name = "Projection", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ProjectionVersionStructure> projection;

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
     * Ruft den Wert der versionOfObjectRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WireLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FleetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfLinkSequenceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntitlementRequiredRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingBayStatusRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReplacingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckEntranceUsageRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareProductSaleDebitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BrandingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingCapacityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LogRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericNavigationPathRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LogicalDisplayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EquipmentPositionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimetabledPassingTimeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteNavigationPathRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AmountOfPriceUnitProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MobilityServiceFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfCustomerPurchasePackagesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RollingStockInventoryRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MonitoredVehicleSharingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfPlacesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfSalesOfferPackagesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ModeRestrictionAssessmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfPointsRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfAccessRightAssignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleMeetingPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteNavigationPathRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainInCompoundTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MonthValidityOffsetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DatedSpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageParameterRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PtRideLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduleRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericPathJunctionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MediumAccessDeviceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareTableRowRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrailingRollingStockItemRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndividualTravellerRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfEntitiesRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneySpotAllocationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareZoneRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HailAndRideAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ControllableElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserProfileEligibilityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareStructureElementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkProjectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SuspendingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValidityRuleParameterRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeriesConstraintRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfProjectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerVehicleSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupTicketRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TariffZoneRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfDeckEntranceUsageRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingStationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FacilityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckWindowRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DriverTripTimeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareIntervalRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfValueRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SingleJourneyPathRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationPartRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfDistanceMatrixElementsRefStructureElement }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfServiceFeatureRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolerProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainBlockRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OpenTransportModeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AcceptedDriverPermitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DriverRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpotColumnRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PenaltyPolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerPaymentMeansRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerAccountSecurityListingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessRightInProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainElementTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelAgentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link BookingDebitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link NetworkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneProjectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfPaymentMethodRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link CellRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RentalOptionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckSpaceCapacityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralGroupOfEntitiesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnboardSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DefaultServiceJourneyTimeRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfStopPlacesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SingleTripFareRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleMeetingLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyInterchangeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteConnectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllOperatorsRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineServiceOperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PurposeOfGroupingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerAccountStatusRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFleetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfDeckSpaceProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllowedLineDirectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerCapacityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalStructureFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TripPlanRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerAccountRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ControlCentreRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalIntervalPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfTariffZonesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValidityConditionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfActivationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LevelInStructureRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AdministrativeZoneRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfOperatorsRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyFrequencyGroupRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimetableFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SmartcardRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherDebitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingBayStatusRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValidableElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingAlgorithmTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointProjectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefOpportunityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SensorInSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeZoneRestrictionRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link EmvCardRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfCustomerAccountRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfDriverPermitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleStoppingPositionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlaceRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationalUnitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RhythmicalJourneyGroupRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalIntervalRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexiblePointPropertiesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareDebitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteInstructionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFacilityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckNavigationPathRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GarageRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackageElementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopFinderRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResidentialQualificationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfSingleJourneysRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfEntitiesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfNoticeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TractiveElementTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TurnaroundTimeLimitTimeRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingBayStatusRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityListRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoupledJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareStructureFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfTimebandsRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllAuthoritiesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SaleDiscountRightRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingStepRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OfferedTravelSpecificationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFareStructureFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ControllableElementInSequenceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfLinesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleMeetingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRequirementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoardingPositionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrafficControlPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailConsortiumRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleModelRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfResponsibilityRoleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructureFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerSpotAllocationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntitlementGivenRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeIntervalPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SupplementProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FacilityRequirementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RefundingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllDistributionChannelsRefStructureElement }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfValidityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SensorInEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CourseOfJourneysRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyPatternLayoverRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WhitelistRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareQuotaFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainComponentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BlockPartRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherDeckEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CappedDiscountRightRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FulfilmentMethodRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DataSourceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareStructureElementInSequenceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DefaultConnectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SimpleVehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfMobilityServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterchangingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistributionChannelRefStructureElement }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareUnitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BorderPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructurePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfDeliveryVariantRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleMeetingLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CycleModelProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResidentialQualificationEligibilityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfSitesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalUnitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HeadwayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link NoticeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlternativeModeLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchematicMapMemberRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FarePriceFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyPartCoupleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleQuayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MobilityJourneyFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfPlugRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestVehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AddressablePlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneInSeriesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceVehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceSiteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteStructureRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LayerRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckLevelRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePositionAlignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfTransferRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerSeatRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerCarryingRequirementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfPricingRuleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValidityTriggerRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfLineRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ObservedPassingTimeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingPlanRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocatableSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VersionFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyPatternRunTimeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllPublicTransportOrganisationsRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerAtStopTimeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfPassengerInformationEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FarePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfLocatableSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceAccessCodeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VersionOfObjectRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerPurchasePackageElementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericPathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VersionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesTransactionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeDemandTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WirePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleLineRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EquipmentPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OffenceDebitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceMatrixElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassingTimeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfUsageParameterRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfDistributionChannelsRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CappingRulePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundBlockRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OffSitePathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EligibilityChangePolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccommodationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VersionOfObjectRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFeatureRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PurposeOfJourneyPartitionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardFareTableRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StepLimitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleEquipmentProfileMemberRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportAdministrativeZoneRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link CappingRuleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfTimingLinksRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerEligibilityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProjectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfRollingStockRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ModeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReservingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoutingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DriverScheduleFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VersionOfObjectRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructureLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckVehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiStandRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfValueRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BlockRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleScheduleFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PurposeOfEquipmentProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfCodespaceAssignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoutePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivationPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChargingMomentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompanionProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GaragePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoutingConstraintZoneRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyTimingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeliveryVariantRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MobileDeviceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareTableRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfRetailDeviceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoundingStepRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingEntranceForVehiclesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpotAllocationMethodRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfSalesOfferPackageRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreassignedFareProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PricingParameterSetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DutyPartRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AddressRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingChargeBandRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleManoeuvringRequirementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageValidityPeriodRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfTariffRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfMachineReadabilityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeIntervalRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResponsibilityRoleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiRankRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityListingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineNetworkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RequestedTravelSpecificationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestHierarchyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackageRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareDayTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FrequencyOfUseRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrivateLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfZoneRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerSecurityListingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareContractSecurityListingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceCalendarFrameRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumStayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DefaultInterchangeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfEntitiesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementRequiredRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatingPeriodRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransferRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransferabilityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareTableColumnRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericPathJunctionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainBlockPartRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfDeckEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterchangeRuleTimingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResellingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VersionOfObjectRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageParameterRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPassengerEntranceRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CarModelProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerPurchasePackageRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterchangeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TopographicProjectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeUnitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementGivenRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BeaconPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TripPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeUnitPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkSequenceProjectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlternativeTextRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConnectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyMeetingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SubscribingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleModelProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckPlanRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PricingRuleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageDiscountRightRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadAddressRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivationLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageParameterPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfProofRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DepartmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServicedOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopEventRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingEquipmentProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackagePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeStructureFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerVehicleCapacityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PtConnectionLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpotRowRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TractiveRollingStockItemRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SubmodeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyPartRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfProductCategoryRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteComponentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlternativeModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchematicMapRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfParkingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConventionalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerPurchasePackagePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndividualPassengerInfoRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RollingStockItemRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VersionOfObjectRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RepeatedTripFareRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfBatteryChemistryRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckPathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimebandRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PathInstructionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntitlementProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestClassificationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleQuayAlignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AdditionalDriverOptionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpotAffinityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleEquipmentProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFareContractRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathJunctionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LimitingRuleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfServicesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LogEntryRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResponsibilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOnLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CancellingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResourceFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleServicePropertiesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleServicePartRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareContractEntryRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalUnitPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerInformationRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceMatrixElementRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfWheelchairRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityStructureFactorPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckComponentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFareStructureElementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TopographicPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DutyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DestinationDisplayVariantRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfMediumAccessDeviceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EstimatedPassingTimeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link QuayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfOrganisationPartRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriceableObjectRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MediumAccessDeviceSecurityListingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelSpecificationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BookingPolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFareContractEntryRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfTravelDocumentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllTransportOrganisationsRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityStructureFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareDemandFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ComplexFeatureProjectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RestrictedServiceFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VersionOfObjectRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoundingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathJunctionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TargetPassingTimeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleStoppingPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TariffRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleLinkPropertiesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainElementTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrailingElementTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceMatrixElementInverseRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link LevelRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyPatternInterchangeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterchangeRuleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PostalAddressRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PurchaseWindowRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServicePatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriceUnitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MobilityServiceConstraintZoneRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfSecurityListRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleStopPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BlacklistRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteElementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelDocumentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RidePartRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceAccessRightRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CrewBaseRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatingDepartmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompositeFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainNumberRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessZoneRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfCongestionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FulfilmentMethodPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoundTripRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TripDebitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ClassOfUseRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeDemandProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFareTableRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransferLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriceGroupRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChargingPolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyPatternRunTimeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyPatternRunTimeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PersonalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DestinationDisplayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MediumApplicationInstanceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFlexibleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatingPeriodRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatingDayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkSequenceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscountingRuleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingMeetingPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeriesConstraintPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareStructureElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ThirdPartyProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValidableElementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesTransactionFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceCalendarRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommercialProfileEligibilityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SingleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlternativeNameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypePreferenceRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailDeviceSecurityListingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RideLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RentalPenaltyPolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingDriverInfoRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DriverTripRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PricingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckEntranceCoupleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageAllowanceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfTimeDemandTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelDocumentSecurityListingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TripRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HeadwayJourneyGroupRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareElementInSequenceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManagementAgentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPropertiesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DefaultDeadRunRunTimeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllOrganisationsRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoolOfVehiclesRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link ControllableElementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareContractRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PtRideLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AvailabilityConditionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherDeckSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContactRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingTariffRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFareProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccountableElementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnboardStayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfConcessionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperationalContextRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommercialProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DayTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareProductPriceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends VersionOfObjectRefStructure> getVersionOfObjectRef() {
        return versionOfObjectRef;
    }

    /**
     * Legt den Wert der versionOfObjectRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WireLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FleetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfLinkSequenceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntitlementRequiredRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingBayStatusRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReplacingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckEntranceUsageRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareProductSaleDebitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BrandingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingCapacityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LogRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericNavigationPathRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LogicalDisplayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EquipmentPositionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimetabledPassingTimeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteNavigationPathRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AmountOfPriceUnitProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MobilityServiceFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfCustomerPurchasePackagesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RollingStockInventoryRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MonitoredVehicleSharingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfPlacesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfSalesOfferPackagesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ModeRestrictionAssessmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfPointsRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfAccessRightAssignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleMeetingPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteNavigationPathRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainInCompoundTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MonthValidityOffsetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DatedSpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageParameterRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PtRideLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduleRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericPathJunctionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MediumAccessDeviceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareTableRowRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrailingRollingStockItemRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndividualTravellerRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfEntitiesRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneySpotAllocationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareZoneRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HailAndRideAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ControllableElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserProfileEligibilityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareStructureElementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkProjectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SuspendingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValidityRuleParameterRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeriesConstraintRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfProjectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerVehicleSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupTicketRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TariffZoneRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfDeckEntranceUsageRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingStationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FacilityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckWindowRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DriverTripTimeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareIntervalRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfValueRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SingleJourneyPathRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationPartRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfDistanceMatrixElementsRefStructureElement }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfServiceFeatureRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolerProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainBlockRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OpenTransportModeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AcceptedDriverPermitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DriverRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpotColumnRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PenaltyPolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerPaymentMeansRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerAccountSecurityListingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessRightInProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainElementTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelAgentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link BookingDebitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link NetworkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneProjectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfPaymentMethodRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link CellRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RentalOptionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckSpaceCapacityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralGroupOfEntitiesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnboardSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DefaultServiceJourneyTimeRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfStopPlacesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SingleTripFareRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleMeetingLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyInterchangeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteConnectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllOperatorsRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineServiceOperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PurposeOfGroupingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerAccountStatusRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFleetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfDeckSpaceProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllowedLineDirectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerCapacityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalStructureFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TripPlanRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerAccountRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ControlCentreRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalIntervalPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfTariffZonesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValidityConditionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfActivationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LevelInStructureRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AdministrativeZoneRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfOperatorsRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyFrequencyGroupRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimetableFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SmartcardRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherDebitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingBayStatusRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValidableElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingAlgorithmTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointProjectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefOpportunityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SensorInSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeZoneRestrictionRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link EmvCardRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfCustomerAccountRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfDriverPermitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleStoppingPositionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlaceRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationalUnitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RhythmicalJourneyGroupRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalIntervalRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexiblePointPropertiesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareDebitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteInstructionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFacilityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckNavigationPathRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GarageRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackageElementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopFinderRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResidentialQualificationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfSingleJourneysRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfEntitiesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfNoticeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TractiveElementTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TurnaroundTimeLimitTimeRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingBayStatusRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityListRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoupledJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareStructureFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfTimebandsRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllAuthoritiesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SaleDiscountRightRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingStepRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OfferedTravelSpecificationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFareStructureFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ControllableElementInSequenceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfLinesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleMeetingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRequirementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoardingPositionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrafficControlPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailConsortiumRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleModelRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfResponsibilityRoleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructureFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerSpotAllocationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntitlementGivenRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeIntervalPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SupplementProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FacilityRequirementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RefundingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllDistributionChannelsRefStructureElement }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfValidityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SensorInEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CourseOfJourneysRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyPatternLayoverRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WhitelistRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareQuotaFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainComponentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BlockPartRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherDeckEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CappedDiscountRightRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FulfilmentMethodRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DataSourceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareStructureElementInSequenceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DefaultConnectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SimpleVehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfMobilityServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterchangingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistributionChannelRefStructureElement }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareUnitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BorderPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructurePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfDeliveryVariantRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleMeetingLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CycleModelProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResidentialQualificationEligibilityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfSitesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalUnitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HeadwayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link NoticeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlternativeModeLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchematicMapMemberRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FarePriceFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyPartCoupleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleQuayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MobilityJourneyFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfPlugRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestVehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AddressablePlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneInSeriesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceVehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceSiteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteStructureRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LayerRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckLevelRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePositionAlignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfTransferRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerSeatRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerCarryingRequirementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfPricingRuleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValidityTriggerRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfLineRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ObservedPassingTimeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingPlanRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocatableSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VersionFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyPatternRunTimeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllPublicTransportOrganisationsRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerAtStopTimeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfPassengerInformationEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FarePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfLocatableSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceAccessCodeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VersionOfObjectRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerPurchasePackageElementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericPathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VersionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesTransactionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeDemandTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WirePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleLineRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EquipmentPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OffenceDebitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceMatrixElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassingTimeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfUsageParameterRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfDistributionChannelsRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CappingRulePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundBlockRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OffSitePathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EligibilityChangePolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccommodationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VersionOfObjectRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFeatureRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PurposeOfJourneyPartitionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardFareTableRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StepLimitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleEquipmentProfileMemberRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportAdministrativeZoneRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link CappingRuleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfTimingLinksRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerEligibilityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProjectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfRollingStockRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ModeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReservingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoutingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DriverScheduleFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VersionOfObjectRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructureLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckVehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiStandRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfValueRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BlockRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleScheduleFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PurposeOfEquipmentProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfCodespaceAssignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoutePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivationPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChargingMomentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompanionProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GaragePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoutingConstraintZoneRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyTimingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeliveryVariantRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MobileDeviceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareTableRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfRetailDeviceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoundingStepRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingEntranceForVehiclesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpotAllocationMethodRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfSalesOfferPackageRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreassignedFareProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PricingParameterSetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DutyPartRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AddressRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingChargeBandRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleManoeuvringRequirementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageValidityPeriodRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfTariffRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfMachineReadabilityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeIntervalRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResponsibilityRoleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiRankRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityListingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineNetworkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RequestedTravelSpecificationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestHierarchyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackageRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareDayTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FrequencyOfUseRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrivateLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfZoneRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerSecurityListingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareContractSecurityListingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceCalendarFrameRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumStayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DefaultInterchangeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfEntitiesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementRequiredRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatingPeriodRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransferRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransferabilityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareTableColumnRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericPathJunctionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainBlockPartRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfDeckEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterchangeRuleTimingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResellingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VersionOfObjectRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageParameterRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPassengerEntranceRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CarModelProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerPurchasePackageRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterchangeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TopographicProjectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeUnitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementGivenRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BeaconPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TripPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeUnitPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkSequenceProjectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlternativeTextRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConnectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyMeetingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SubscribingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleModelProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckPlanRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PricingRuleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageDiscountRightRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadAddressRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivationLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageParameterPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfProofRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DepartmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServicedOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopEventRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingEquipmentProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackagePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeStructureFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerVehicleCapacityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PtConnectionLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpotRowRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TractiveRollingStockItemRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SubmodeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyPartRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfProductCategoryRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteComponentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlternativeModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchematicMapRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfParkingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConventionalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerPurchasePackagePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndividualPassengerInfoRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RollingStockItemRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VersionOfObjectRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RepeatedTripFareRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfBatteryChemistryRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckPathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimebandRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PathInstructionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntitlementProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestClassificationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleQuayAlignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AdditionalDriverOptionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpotAffinityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleEquipmentProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFareContractRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathJunctionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LimitingRuleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfServicesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LogEntryRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResponsibilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOnLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CancellingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResourceFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleServicePropertiesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleServicePartRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareContractEntryRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalUnitPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerInformationRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceMatrixElementRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfWheelchairRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityStructureFactorPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckComponentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFareStructureElementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TopographicPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DutyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DestinationDisplayVariantRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfMediumAccessDeviceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EstimatedPassingTimeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link QuayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfOrganisationPartRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriceableObjectRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MediumAccessDeviceSecurityListingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelSpecificationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BookingPolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFareContractEntryRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfTravelDocumentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllTransportOrganisationsRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityStructureFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareDemandFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareRequestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ComplexFeatureProjectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RestrictedServiceFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VersionOfObjectRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoundingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathJunctionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TargetPassingTimeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleStoppingPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TariffRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleLinkPropertiesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainElementTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrailingElementTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceMatrixElementInverseRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link LevelRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyPatternInterchangeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterchangeRuleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PostalAddressRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PurchaseWindowRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServicePatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriceUnitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MobilityServiceConstraintZoneRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfSecurityListRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleStopPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BlacklistRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteElementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelDocumentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RidePartRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceAccessRightRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CrewBaseRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatingDepartmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompositeFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainNumberRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessZoneRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfCongestionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FulfilmentMethodPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoundTripRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TripDebitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ClassOfUseRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeDemandProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFareTableRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransferLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriceGroupRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageSpotRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChargingPolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyPatternRunTimeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyPatternRunTimeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PersonalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DestinationDisplayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MediumApplicationInstanceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFlexibleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatingPeriodRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatingDayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkSequenceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscountingRuleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingMeetingPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeriesConstraintPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareStructureElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ThirdPartyProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValidableElementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesTransactionFrameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceCalendarRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommercialProfileEligibilityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SingleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlternativeNameRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypePreferenceRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailDeviceSecurityListingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RideLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RentalPenaltyPolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingDriverInfoRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DriverTripRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PricingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckEntranceCoupleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageAllowanceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfTimeDemandTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelDocumentSecurityListingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TripRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HeadwayJourneyGroupRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareElementInSequenceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManagementAgentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPropertiesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DefaultDeadRunRunTimeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllOrganisationsRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoolOfVehiclesRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link ControllableElementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareContractRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PtRideLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AvailabilityConditionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherDeckSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContactRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingTariffRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFareProductRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccountableElementRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnboardStayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfConcessionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperationalContextRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommercialProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DayTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareProductPriceRefStructure }{@code >}
     *     
     */
    public void setVersionOfObjectRef(JAXBElement<? extends VersionOfObjectRefStructure> value) {
        this.versionOfObjectRef = value;
    }

    /**
     * Ruft den Wert der hide-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHide() {
        return hide;
    }

    /**
     * Legt den Wert der hide-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHide(Boolean value) {
        this.hide = value;
    }

    /**
     * Ruft den Wert der displayAsIcon-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayAsIcon() {
        return displayAsIcon;
    }

    /**
     * Legt den Wert der displayAsIcon-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayAsIcon(Boolean value) {
        this.displayAsIcon = value;
    }

    /**
     * Ruft den Wert der infoLink-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InfoLinkStructure }
     *     
     */
    public InfoLinkStructure getInfoLink() {
        return infoLink;
    }

    /**
     * Legt den Wert der infoLink-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoLinkStructure }
     *     
     */
    public void setInfoLink(InfoLinkStructure value) {
        this.infoLink = value;
    }

    /**
     * Ruft den Wert der x-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getX() {
        return x;
    }

    /**
     * Legt den Wert der x-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setX(Float value) {
        this.x = value;
    }

    /**
     * Ruft den Wert der y-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getY() {
        return y;
    }

    /**
     * Legt den Wert der y-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setY(Float value) {
        this.y = value;
    }

    /**
     * Ruft den Wert der projection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TopographicProjection }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneProjection }{@code >}
     *     {@link JAXBElement }{@code <}{@link ComplexFeatureProjection }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProjectionVersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointProjection }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkProjection }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkSequenceProjection }{@code >}
     *     
     */
    public JAXBElement<? extends ProjectionVersionStructure> getProjection() {
        return projection;
    }

    /**
     * Legt den Wert der projection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TopographicProjection }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneProjection }{@code >}
     *     {@link JAXBElement }{@code <}{@link ComplexFeatureProjection }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProjectionVersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointProjection }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkProjection }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkSequenceProjection }{@code >}
     *     
     */
    public void setProjection(JAXBElement<? extends ProjectionVersionStructure> value) {
        this.projection = value;
    }

}
