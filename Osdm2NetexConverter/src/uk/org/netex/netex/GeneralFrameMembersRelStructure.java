//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A collection of one or more VERSION FRAME MEMBERS.
 * 
 * <p>Java-Klasse f�r generalFrameMembers_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="generalFrameMembers_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}GeneralFrameMember"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}DataManagedObject"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}Entity_Entity"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generalFrameMembers_RelStructure", propOrder = {
    "generalFrameMemberOrDataManagedObjectOrEntityEntity"
})
@XmlSeeAlso({
    uk.org.netex.netex.GeneralVersionFrameStructure.Members.class
})
public class GeneralFrameMembersRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "DataManagedObject", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Entity_Entity", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GeneralFrameMember", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends EntityStructure>> generalFrameMemberOrDataManagedObjectOrEntityEntity;

    /**
     * Gets the value of the generalFrameMemberOrDataManagedObjectOrEntityEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalFrameMemberOrDataManagedObjectOrEntityEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralFrameMemberOrDataManagedObjectOrEntityEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link EntranceSensor }{@code >}
     * {@link JAXBElement }{@code <}{@link PlaceLighting }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerBeaconEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link BookingArrangement }{@code >}
     * {@link JAXBElement }{@code <}{@link InfrastructureLinkRestriction }{@code >}
     * {@link JAXBElement }{@code <}{@link StopPlaceSpaceVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link QueueingEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link PassingTimeView }{@code >}
     * {@link JAXBElement }{@code <}{@link DestinationDisplayVariant }{@code >}
     * {@link JAXBElement }{@code <}{@link Journey }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RefuellingEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link PricingParameterSet }{@code >}
     * {@link JAXBElement }{@code <}{@link JourneyMeeting }{@code >}
     * {@link JAXBElement }{@code <}{@link MobilityServiceVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkProjection }{@code >}
     * {@link JAXBElement }{@code <}{@link InfrastructureFrame }{@code >}
     * {@link JAXBElement }{@code <}{@link CheckConstraintDelay }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckComponentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleMeetingPointAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link EntranceEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleServicePlaceAssignmentDummy }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceJourneyPattern }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfJourneyPattern }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleRequirementVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesNoticeAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ManagementAgent }{@code >}
     * {@link JAXBElement }{@code <}{@link JourneyAccounting }{@code >}
     * {@link JAXBElement }{@code <}{@link FlexibleServiceProperties }{@code >}
     * {@link JAXBElement }{@code <}{@link TravelDocument }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleAvailabilityCondition }{@code >}
     * {@link JAXBElement }{@code <}{@link TravelatorEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfSites }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleRental }{@code >}
     * {@link JAXBElement }{@code <}{@link TicketValidatorEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityEntityStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FlexibleStopAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link TrailingRollingStockItem }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidityParameterAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link RechargingStation }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleAccessCredentialsAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link LuggageLockerEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link DriverScheduleFrame }{@code >}
     * {@link JAXBElement }{@code <}{@link MonthValidityOffset }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolingDriverInfo }{@code >}
     * {@link JAXBElement }{@code <}{@link HailAndRideArea }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfDeckEntrance }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleVehicleType }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleMeetingPlace }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFlexibleService }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfRetailDevice }{@code >}
     * {@link JAXBElement }{@code <}{@link BorderPoint }{@code >}
     * {@link JAXBElement }{@code <}{@link JourneyVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AccessVehicleEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectViewStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FlexibleArea }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolingParkingArea }{@code >}
     * {@link JAXBElement }{@code <}{@link GeographicalUnit }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerInformationEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteInstruction }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Vehicle }{@code >}
     * {@link JAXBElement }{@code <}{@link DatedVehicleJourney }{@code >}
     * {@link JAXBElement }{@code <}{@link Contract }{@code >}
     * {@link JAXBElement }{@code <}{@link HelpPointEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfConcession }{@code >}
     * {@link JAXBElement }{@code <}{@link Notice }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPoint }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPlace }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckComponentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ZoneProjection }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteComponentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CoupledJourney }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfSecurityList }{@code >}
     * {@link JAXBElement }{@code <}{@link FarePriceFrame }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteConnection }{@code >}
     * {@link JAXBElement }{@code <}{@link EntitlementProduct }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationDayType }{@code >}
     * {@link JAXBElement }{@code <}{@link TrainComponentStopAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link Fleet }{@code >}
     * {@link JAXBElement }{@code <}{@link LuggageService }{@code >}
     * {@link JAXBElement }{@code <}{@link DriverTrip }{@code >}
     * {@link JAXBElement }{@code <}{@link FareDemandFactor }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfEntitiesVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Parking }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeDemandProfile }{@code >}
     * {@link JAXBElement }{@code <}{@link Refunding }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SeatingEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckComponentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LiftEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleRentalService }{@code >}
     * {@link JAXBElement }{@code <}{@link FareContractEntry }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingEntranceForVehicles }{@code >}
     * {@link JAXBElement }{@code <}{@link StaircaseEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link DistributionAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link AddressablePlace }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicalDisplay }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerSafetyEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfMediumAccessDevice }{@code >}
     * {@link JAXBElement }{@code <}{@link MobilityServiceConstraintZone }{@code >}
     * {@link JAXBElement }{@code <}{@link Cancelling }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link ScheduledOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link PurposeOfEquipmentProfile }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiService }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckNavigationPath }{@code >}
     * {@link JAXBElement }{@code <}{@link LocatableSpotVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceFrame }{@code >}
     * {@link JAXBElement }{@code <}{@link BatteryEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleChargingEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link ChauffeuredVehicleService }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckPlanAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link Transferability }{@code >}
     * {@link JAXBElement }{@code <}{@link Contact }{@code >}
     * {@link JAXBElement }{@code <}{@link Exchanging }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkSequenceVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TrainElement }{@code >}
     * {@link JAXBElement }{@code <}{@link FareProductSaleDebit }{@code >}
     * {@link JAXBElement }{@code <}{@link JourneyVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PointOfInterestSpace }{@code >}
     * {@link JAXBElement }{@code <}{@link Country }{@code >}
     * {@link JAXBElement }{@code <}{@link GenericNavigationPath }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleJourneyStopAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link MeetingRestriction }{@code >}
     * {@link JAXBElement }{@code <}{@link SensorEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfNotice }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfLinks }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleSharingParkingArea }{@code >}
     * {@link JAXBElement }{@code <}{@link CompanionProfile }{@code >}
     * {@link JAXBElement }{@code <}{@link UserProfile }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleReleaseEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link RubbishDisposalEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link ReliefPointVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PricingService }{@code >}
     * {@link JAXBElement }{@code <}{@link Garage }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteFrame }{@code >}
     * {@link JAXBElement }{@code <}{@link CommonVehicleService }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceLink }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckSpace }{@code >}
     * {@link JAXBElement }{@code <}{@link RechargingPointAssignmentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfDeliveryVariant }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfMobilityService }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteEntranceVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ChargingMoment }{@code >}
     * {@link JAXBElement }{@code <}{@link TicketingService }{@code >}
     * {@link JAXBElement }{@code <}{@link Customer }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteComponentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfProductCategory }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteStructureVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Log }{@code >}
     * {@link JAXBElement }{@code <}{@link GeneralFrameMemberStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceExclusion }{@code >}
     * {@link JAXBElement }{@code <}{@link StepLimit }{@code >}
     * {@link JAXBElement }{@code <}{@link PointProjection }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomerAccountStatus }{@code >}
     * {@link JAXBElement }{@code <}{@link SingleJourneyPath }{@code >}
     * {@link JAXBElement }{@code <}{@link FareTable }{@code >}
     * {@link JAXBElement }{@code <}{@link GeographicalStructureFactor }{@code >}
     * {@link JAXBElement }{@code <}{@link PriceableObjectVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfRollingStockValueStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link WaitingEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link PointOfInterestComponentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SitePathJunction }{@code >}
     * {@link JAXBElement }{@code <}{@link Interchange }{@code >}
     * {@link JAXBElement }{@code <}{@link SpotEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfVersion }{@code >}
     * {@link JAXBElement }{@code <}{@link ZoneVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceSite }{@code >}
     * {@link JAXBElement }{@code <}{@link OvertakingPossibility }{@code >}
     * {@link JAXBElement }{@code <}{@link OfferedTravelSpecification }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfTravelDocument }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfOperators }{@code >}
     * {@link JAXBElement }{@code <}{@link AssistanceService }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleMeetingPointAssignmentDummy }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomerPurchasePackage }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TrainBlock }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfDriverPermit }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfUsageParameter }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfDistributionChannels }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfTariffZones }{@code >}
     * {@link JAXBElement }{@code <}{@link DatedServiceJourney }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerStopAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link NoticeAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link SensorEquipmentDummy }{@code >}
     * {@link JAXBElement }{@code <}{@link LogEntry }{@code >}
     * {@link JAXBElement }{@code <}{@link InterchangeRule }{@code >}
     * {@link JAXBElement }{@code <}{@link RoundTrip }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidityRuleParameter }{@code >}
     * {@link JAXBElement }{@code <}{@link WireJunction }{@code >}
     * {@link JAXBElement }{@code <}{@link LeftLuggageService }{@code >}
     * {@link JAXBElement }{@code <}{@link AccessZone }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleEntrance }{@code >}
     * {@link JAXBElement }{@code <}{@link CrossingEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Route }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleServicePlaceAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfCodespaceAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleTypeStopAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleEquipmentProfile }{@code >}
     * {@link JAXBElement }{@code <}{@link WaitingRoomEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link ModeRestrictionAssessment }{@code >}
     * {@link JAXBElement }{@code <}{@link DeadRun }{@code >}
     * {@link JAXBElement }{@code <}{@link SeatEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link CarPoolingService }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiServicePlaceAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link Direction }{@code >}
     * {@link JAXBElement }{@code <}{@link PoweredTrain }{@code >}
     * {@link JAXBElement }{@code <}{@link TractiveRollingStockItem }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageDiscountRight }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscountingRule }{@code >}
     * {@link JAXBElement }{@code <}{@link RailwayElement }{@code >}
     * {@link JAXBElement }{@code <}{@link SpotEquipmentDummy }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardFareTable }{@code >}
     * {@link JAXBElement }{@code <}{@link FlexibleQuay }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeDemandTypeAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link SecurityList }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOfferPackageSubstitution }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareStructureElement }{@code >}
     * {@link JAXBElement }{@code <}{@link TopographicProjection }{@code >}
     * {@link JAXBElement }{@code <}{@link MeetingPointService }{@code >}
     * {@link JAXBElement }{@code <}{@link DistributionChannel }{@code >}
     * {@link JAXBElement }{@code <}{@link ZoneVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DayTypeAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link FareProduct }{@code >}
     * {@link JAXBElement }{@code <}{@link GenericParameterAssignmentInContext }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFeature }{@code >}
     * {@link JAXBElement }{@code <}{@link NormalDatedVehicleJourney }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeInterval }{@code >}
     * {@link JAXBElement }{@code <}{@link TransportAdministrativeZone }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerSpace }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfPointsVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LuggageSpot }{@code >}
     * {@link JAXBElement }{@code <}{@link PlaceEquipmentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolingPlaceAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerBoardingPositionAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link CommonVersionFrameStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ShelterEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingPassengerEntrance }{@code >}
     * {@link JAXBElement }{@code <}{@link DynamicStopAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPlug }{@code >}
     * {@link JAXBElement }{@code <}{@link FareStructureElement }{@code >}
     * {@link JAXBElement }{@code <}{@link StopArea }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingBay }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFrame }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiParkingArea }{@code >}
     * {@link JAXBElement }{@code <}{@link TrolleyStandEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link PenaltyPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link RampEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link ScheduledStopPoint }{@code >}
     * {@link JAXBElement }{@code <}{@link TicketingEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleManoeuvringRequirement }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkSequenceVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CheckConstraintThroughput }{@code >}
     * {@link JAXBElement }{@code <}{@link JourneyPattern }{@code >}
     * {@link JAXBElement }{@code <}{@link MobilityServiceVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Timeband }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfTimingLinks }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentPosition }{@code >}
     * {@link JAXBElement }{@code <}{@link ZoneVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PoolOfVehicles }{@code >}
     * {@link JAXBElement }{@code <}{@link Blacklist }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageParameter }{@code >}
     * {@link JAXBElement }{@code <}{@link ModeOfOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link CheckConstraint }{@code >}
     * {@link JAXBElement }{@code <}{@link TrainElementTypeDummy }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleServicePart }{@code >}
     * {@link JAXBElement }{@code <}{@link SitePathLink }{@code >}
     * {@link JAXBElement }{@code <}{@link AccountableElement }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfProjection }{@code >}
     * {@link JAXBElement }{@code <}{@link PointVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PreassignedFareProduct }{@code >}
     * {@link JAXBElement }{@code <}{@link GaragePoint }{@code >}
     * {@link JAXBElement }{@code <}{@link MediumAccessDevice }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Level }{@code >}
     * {@link JAXBElement }{@code <}{@link Deck }{@code >}
     * {@link JAXBElement }{@code <}{@link BeaconPoint }{@code >}
     * {@link JAXBElement }{@code <}{@link SeriesConstraint }{@code >}
     * {@link JAXBElement }{@code <}{@link OnboardSpaceVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PersonalModeOfOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfParking }{@code >}
     * {@link JAXBElement }{@code <}{@link FulfilmentMethod }{@code >}
     * {@link JAXBElement }{@code <}{@link RoadElement }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkSequenceVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareContract }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleSharingParkingBay }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfCustomerAccount }{@code >}
     * {@link JAXBElement }{@code <}{@link GeneralZone }{@code >}
     * {@link JAXBElement }{@code <}{@link RoadJunction }{@code >}
     * {@link JAXBElement }{@code <}{@link AccessSpace }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteElementVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeUnit }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareProduct }{@code >}
     * {@link JAXBElement }{@code <}{@link RequestedTravelSpecification }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfLink }{@code >}
     * {@link JAXBElement }{@code <}{@link Version }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexFeatureProjection }{@code >}
     * {@link JAXBElement }{@code <}{@link DutyPart }{@code >}
     * {@link JAXBElement }{@code <}{@link ClassOfUse }{@code >}
     * {@link JAXBElement }{@code <}{@link RollingStockItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesTransaction }{@code >}
     * {@link JAXBElement }{@code <}{@link ConventionalModeOfOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link HeadingSign }{@code >}
     * {@link JAXBElement }{@code <}{@link TimingAlgorithmType }{@code >}
     * {@link JAXBElement }{@code <}{@link PointOfInterestVehicleEntrance }{@code >}
     * {@link JAXBElement }{@code <}{@link PurposeOfJourneyPartition }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfEntityVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareInterval }{@code >}
     * {@link JAXBElement }{@code <}{@link BoardingPosition }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationPart }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckPathJunction }{@code >}
     * {@link JAXBElement }{@code <}{@link RetailConsortium }{@code >}
     * {@link JAXBElement }{@code <}{@link UnpoweredTrain }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfTransfer }{@code >}
     * {@link JAXBElement }{@code <}{@link RailwayJunction }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidityTrigger }{@code >}
     * {@link JAXBElement }{@code <}{@link RentalAvailability }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponsibilitySet }{@code >}
     * {@link JAXBElement }{@code <}{@link WheelchairVehicleEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link InstalledEquipmentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CompoundBlock }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleMeetingLink }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationalUnit }{@code >}
     * {@link JAXBElement }{@code <}{@link StopPlaceEntrance }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeFrame }{@code >}
     * {@link JAXBElement }{@code <}{@link TravelSpecification }{@code >}
     * {@link JAXBElement }{@code <}{@link Whitelist }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfModeOfOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOfferPackage }{@code >}
     * {@link JAXBElement }{@code <}{@link PostalAddress }{@code >}
     * {@link JAXBElement }{@code <}{@link ServicePattern }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SpotAffinity }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfServices }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesTransactionFrame }{@code >}
     * {@link JAXBElement }{@code <}{@link TimetableFrame }{@code >}
     * {@link JAXBElement }{@code <}{@link IndividualTraveller }{@code >}
     * {@link JAXBElement }{@code <}{@link NavigationPath }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfPoints }{@code >}
     * {@link JAXBElement }{@code <}{@link MobileDevice }{@code >}
     * {@link JAXBElement }{@code <}{@link TransportType }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfLocatableSpot }{@code >}
     * {@link JAXBElement }{@code <}{@link TrainStopAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link AddressVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FacilityRequirement }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfCongestion }{@code >}
     * {@link JAXBElement }{@code <}{@link CrewBase }{@code >}
     * {@link JAXBElement }{@code <}{@link StopAssignmentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfLines }{@code >}
     * {@link JAXBElement }{@code <}{@link VersionFrameVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckEntranceAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link FareTableInContext }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfTariff }{@code >}
     * {@link JAXBElement }{@code <}{@link Network }{@code >}
     * {@link JAXBElement }{@code <}{@link ActualVehicleEquipmentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfDeckEntranceUsage }{@code >}
     * {@link JAXBElement }{@code <}{@link GenericPathJunction }{@code >}
     * {@link JAXBElement }{@code <}{@link MoneyService }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfZone }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponsibilityRole }{@code >}
     * {@link JAXBElement }{@code <}{@link EligibilityChangePolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link TrainComponent }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleJourneySpotAllocation }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleJourney }{@code >}
     * {@link JAXBElement }{@code <}{@link JourneyFrequencyGroupVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolingService }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link InfrastructureLink }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfLinkSequences }{@code >}
     * {@link JAXBElement }{@code <}{@link Access }{@code >}
     * {@link JAXBElement }{@code <}{@link ControlCentre }{@code >}
     * {@link JAXBElement }{@code <}{@link TransferVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PathLink }{@code >}
     * {@link JAXBElement }{@code <}{@link TimingPattern }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareStructureFactor }{@code >}
     * {@link JAXBElement }{@code <}{@link OperatingPeriod }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomerPurchasePackageElement }{@code >}
     * {@link JAXBElement }{@code <}{@link ActivationLink }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ReliefPoint }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomerAccount }{@code >}
     * {@link JAXBElement }{@code <}{@link ControllableElement }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteLink }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfTimeDemandType }{@code >}
     * {@link JAXBElement }{@code <}{@link RoughSurface }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkSequenceVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DeadRunJourneyPattern }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerBoardingPositionAssignmentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DestinationDisplay }{@code >}
     * {@link JAXBElement }{@code <}{@link FareUnit }{@code >}
     * {@link JAXBElement }{@code <}{@link CommunicationService }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialService }{@code >}
     * {@link JAXBElement }{@code <}{@link DynamicDistanceMatrixElement }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleSharing }{@code >}
     * {@link JAXBElement }{@code <}{@link NetworkRestrictionVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CappingRule }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleModelProfile }{@code >}
     * {@link JAXBElement }{@code <}{@link JourneyPart }{@code >}
     * {@link JAXBElement }{@code <}{@link BedEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link TrainBlockPart }{@code >}
     * {@link JAXBElement }{@code <}{@link AccessRightParameterAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link LuggageAllowance }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleModel }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfProof }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfServiceFeature }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolerProfile }{@code >}
     * {@link JAXBElement }{@code <}{@link RhythmicalJourneyGroup }{@code >}
     * {@link JAXBElement }{@code <}{@link CycleStorageEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link ActivationAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfActivation }{@code >}
     * {@link JAXBElement }{@code <}{@link LineNetwork }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfDistanceMatrixElements }{@code >}
     * {@link JAXBElement }{@code <}{@link SignEquipmentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CappedDiscountRight }{@code >}
     * {@link JAXBElement }{@code <}{@link TimingLink }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFleet }{@code >}
     * {@link JAXBElement }{@code <}{@link OnlineServiceOperator }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleStoppingPosition }{@code >}
     * {@link JAXBElement }{@code <}{@link DatedSpecialService }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolingParkingBay }{@code >}
     * {@link JAXBElement }{@code <}{@link PointOfInterestClassificationHierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link DefaultInterchange }{@code >}
     * {@link JAXBElement }{@code <}{@link ReliefOpportunity }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolingMeetingPlace }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfValueVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Block }{@code >}
     * {@link JAXBElement }{@code <}{@link WireElement }{@code >}
     * {@link JAXBElement }{@code <}{@link GeneralOrganisation }{@code >}
     * {@link JAXBElement }{@code <}{@link RentalOption }{@code >}
     * {@link JAXBElement }{@code <}{@link AdditionalDriverOption }{@code >}
     * {@link JAXBElement }{@code <}{@link DriverTripTime }{@code >}
     * {@link JAXBElement }{@code <}{@link UicOperatingPeriod }{@code >}
     * {@link JAXBElement }{@code <}{@link Reselling }{@code >}
     * {@link JAXBElement }{@code <}{@link GeneralFrame }{@code >}
     * {@link JAXBElement }{@code <}{@link LocalServiceVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AccessEquipmentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link EntitlementRequired }{@code >}
     * {@link JAXBElement }{@code <}{@link OperatingDepartment }{@code >}
     * {@link JAXBElement }{@code <}{@link SaleDiscountRight }{@code >}
     * {@link JAXBElement }{@code <}{@link Smartcard }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleSharingService }{@code >}
     * {@link JAXBElement }{@code <}{@link SchematicMap }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingBayStatus }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareContractEntry }{@code >}
     * {@link JAXBElement }{@code <}{@link LimitingRuleInContext }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GeographicalInterval }{@code >}
     * {@link JAXBElement }{@code <}{@link Organisation }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PurchaseWindow }{@code >}
     * {@link JAXBElement }{@code <}{@link PointVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareQuotaFactor }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerVehicleSpot }{@code >}
     * {@link JAXBElement }{@code <}{@link Quay }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link QualityStructureFactor }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingArea }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupTicket }{@code >}
     * {@link JAXBElement }{@code <}{@link Train }{@code >}
     * {@link JAXBElement }{@code <}{@link FareFrame }{@code >}
     * {@link JAXBElement }{@code <}{@link Interchanging }{@code >}
     * {@link JAXBElement }{@code <}{@link FareScheduledStopPoint }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFacility }{@code >}
     * {@link JAXBElement }{@code <}{@link CarModelProfile }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerSpot }{@code >}
     * {@link JAXBElement }{@code <}{@link TrainComponentLabelAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfValidity }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingBayCondition }{@code >}
     * {@link JAXBElement }{@code <}{@link SpotSensor }{@code >}
     * {@link JAXBElement }{@code <}{@link DisplayAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link Reserving }{@code >}
     * {@link JAXBElement }{@code <}{@link BlockPart }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckWindow }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleTypeAtPoint }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleStoppingPlace }{@code >}
     * {@link JAXBElement }{@code <}{@link PointOfInterestClassification }{@code >}
     * {@link JAXBElement }{@code <}{@link ValueSet }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfWheelchair }{@code >}
     * {@link JAXBElement }{@code <}{@link OtherDeckEntrance }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfService }{@code >}
     * {@link JAXBElement }{@code <}{@link ThirdPartyProduct }{@code >}
     * {@link JAXBElement }{@code <}{@link Replacing }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOfferPackageElement }{@code >}
     * {@link JAXBElement }{@code <}{@link StopPlaceVehicleEntrance }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceJourneyPatternInterchange }{@code >}
     * {@link JAXBElement }{@code <}{@link PricingRule }{@code >}
     * {@link JAXBElement }{@code <}{@link Authority }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplaintsService }{@code >}
     * {@link JAXBElement }{@code <}{@link GenericParameterAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfTimebands }{@code >}
     * {@link JAXBElement }{@code <}{@link Routing }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeDemandType }{@code >}
     * {@link JAXBElement }{@code <}{@link Layer }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleSharingPlaceAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfSingleJourneys }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfLine }{@code >}
     * {@link JAXBElement }{@code <}{@link JourneyPartCouple }{@code >}
     * {@link JAXBElement }{@code <}{@link AcceptedDriverPermit }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceAccessRight }{@code >}
     * {@link JAXBElement }{@code <}{@link TariffZone }{@code >}
     * {@link JAXBElement }{@code <}{@link TopographicPlace }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PurposeOfGrouping }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link FareDayType }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceJourneyInterchange }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfEntitiesVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingPoint }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfSalesOfferPackages }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerCarryingRequirement }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementRequired }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingTariff }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkSequenceProjection }{@code >}
     * {@link JAXBElement }{@code <}{@link OpenTransportMode }{@code >}
     * {@link JAXBElement }{@code <}{@link MobilityServiceFrame }{@code >}
     * {@link JAXBElement }{@code <}{@link Submode }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingComponent }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerEquipmentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareStructureFactor }{@code >}
     * {@link JAXBElement }{@code <}{@link AddressablePlaceVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GenericPathLink }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleMeetingPoint }{@code >}
     * {@link JAXBElement }{@code <}{@link RestrictedManoeuvre }{@code >}
     * {@link JAXBElement }{@code <}{@link Department }{@code >}
     * {@link JAXBElement }{@code <}{@link StopPlaceComponentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PriceableObjectVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Branding }{@code >}
     * {@link JAXBElement }{@code <}{@link LimitingRule }{@code >}
     * {@link JAXBElement }{@code <}{@link LuggageSpotEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link FareDebit }{@code >}
     * {@link JAXBElement }{@code <}{@link TransportOrganisation }{@code >}
     * {@link JAXBElement }{@code <}{@link MinimumStay }{@code >}
     * {@link JAXBElement }{@code <}{@link FlexibleRoute }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleScheduleFrame }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DefaultConnection }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AdministrativeZone }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageValidityPeriod }{@code >}
     * {@link JAXBElement }{@code <}{@link TrafficControlPoint }{@code >}
     * {@link JAXBElement }{@code <}{@link PlaceSign }{@code >}
     * {@link JAXBElement }{@code <}{@link BookingDebit }{@code >}
     * {@link JAXBElement }{@code <}{@link GeneralSign }{@code >}
     * {@link JAXBElement }{@code <}{@link BookingPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link TravelAgent }{@code >}
     * {@link JAXBElement }{@code <}{@link AvailabilityCondition }{@code >}
     * {@link JAXBElement }{@code <}{@link LineShape }{@code >}
     * {@link JAXBElement }{@code <}{@link FlexibleStopPlace }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfOrganisationPart }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidableElement }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfDeckSpace }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomerServiceVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OnlineService }{@code >}
     * {@link JAXBElement }{@code <}{@link SupplementProduct }{@code >}
     * {@link JAXBElement }{@code <}{@link OperatingDay }{@code >}
     * {@link JAXBElement }{@code <}{@link RoutePoint }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckPlan }{@code >}
     * {@link JAXBElement }{@code <}{@link DeliveryVariant }{@code >}
     * {@link JAXBElement }{@code <}{@link FareZone }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerEntrance }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckVehicleEntrance }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfOrganisation }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteComponentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiStand }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceBookingArrangement }{@code >}
     * {@link JAXBElement }{@code <}{@link AmountOfPriceUnitProduct }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleService }{@code >}
     * {@link JAXBElement }{@code <}{@link IndividualPassengerInfo }{@code >}
     * {@link JAXBElement }{@code <}{@link AssistanceBookingService }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfAccessRightAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link FlexibleOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiRank }{@code >}
     * {@link JAXBElement }{@code <}{@link Duty }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleType }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPaymentMethod }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfSalesOfferPackage }{@code >}
     * {@link JAXBElement }{@code <}{@link FrequencyOfUse }{@code >}
     * {@link JAXBElement }{@code <}{@link TripDebit }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidDuring }{@code >}
     * {@link JAXBElement }{@code <}{@link OffenceDebit }{@code >}
     * {@link JAXBElement }{@code <}{@link GeneralGroupOfEntities }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingChargeBand }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteEquipmentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TemplateServiceJourney }{@code >}
     * {@link JAXBElement }{@code <}{@link CompoundTrain }{@code >}
     * {@link JAXBElement }{@code <}{@link LostPropertyService }{@code >}
     * {@link JAXBElement }{@code <}{@link MonitoredVehicleSharingParkingBay }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareTable }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceCalendarFrame }{@code >}
     * {@link JAXBElement }{@code <}{@link RentalPenaltyPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link AlternativeModeOfOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link HeadwayJourneyGroup }{@code >}
     * {@link JAXBElement }{@code <}{@link CycleModelProfile }{@code >}
     * {@link JAXBElement }{@code <}{@link SanitaryEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link CateringService }{@code >}
     * {@link JAXBElement }{@code <}{@link Tariff }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceAccessCode }{@code >}
     * {@link JAXBElement }{@code <}{@link OtherDeckSpace }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomerPurchaseParameterAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link DistanceMatrixElement }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareContract }{@code >}
     * {@link JAXBElement }{@code <}{@link FlexibleLine }{@code >}
     * {@link JAXBElement }{@code <}{@link EntitlementGiven }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerCarryingRequirementsView }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidityCondition }{@code >}
     * {@link JAXBElement }{@code <}{@link Operator }{@code >}
     * {@link JAXBElement }{@code <}{@link TimingPointVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TransferRestriction }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexFeature }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceJourney }{@code >}
     * {@link JAXBElement }{@code <}{@link SingleJourney }{@code >}
     * {@link JAXBElement }{@code <}{@link AllowedLineDirection }{@code >}
     * {@link JAXBElement }{@code <}{@link NavigationPathAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link InfrastructurePointVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPassengerInformationEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPricingRule }{@code >}
     * {@link JAXBElement }{@code <}{@link PointOfInterest }{@code >}
     * {@link JAXBElement }{@code <}{@link CommercialProfile }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentPlace }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeStructureFactor }{@code >}
     * {@link JAXBElement }{@code <}{@link OperationalContext }{@code >}
     * {@link JAXBElement }{@code <}{@link PathJunction }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePooling }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckPathLink }{@code >}
     * {@link JAXBElement }{@code <}{@link ActivationPoint }{@code >}
     * {@link JAXBElement }{@code <}{@link DataSource }{@code >}
     * {@link JAXBElement }{@code <}{@link Suspending }{@code >}
     * {@link JAXBElement }{@code <}{@link Connection }{@code >}
     * {@link JAXBElement }{@code <}{@link TemplateVehicleJourney }{@code >}
     * {@link JAXBElement }{@code <}{@link ResourceFrame }{@code >}
     * {@link JAXBElement }{@code <}{@link ProjectionVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfMachineReadability }{@code >}
     * {@link JAXBElement }{@code <}{@link DayType }{@code >}
     * {@link JAXBElement }{@code <}{@link RechargingEquipmentProfile }{@code >}
     * {@link JAXBElement }{@code <}{@link EscalatorEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link OtherDebit }{@code >}
     * {@link JAXBElement }{@code <}{@link DynamicVehicleMeetingPointAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfBatteryChemistry }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckEntrance }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementGiven }{@code >}
     * {@link JAXBElement }{@code <}{@link TimingPoint }{@code >}
     * {@link JAXBElement }{@code <}{@link OffSitePathLink }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteNavigationPath }{@code >}
     * {@link JAXBElement }{@code <}{@link Subscribing }{@code >}
     * {@link JAXBElement }{@code <}{@link RoadAddress }{@code >}
     * {@link JAXBElement }{@code <}{@link TrainNumber }{@code >}
     * {@link JAXBElement }{@code <}{@link Line }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleFeature }{@code >}
     * {@link JAXBElement }{@code <}{@link LiftCallEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link RollingStockInventory }{@code >}
     * {@link JAXBElement }{@code <}{@link HireService }{@code >}
     * {@link JAXBElement }{@code <}{@link RoutingConstraintZone }{@code >}
     * {@link JAXBElement }{@code <}{@link RechargingBay }{@code >}
     * {@link JAXBElement }{@code <}{@link MobilityJourneyFrame }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfLinkSequence }{@code >}
     * {@link JAXBElement }{@code <}{@link PointVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PlaceVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OtherOrganisation }{@code >}
     * {@link JAXBElement }{@code <}{@link EmvCard }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RetailDevice }{@code >}
     * {@link JAXBElement }{@code <}{@link StairEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfPlaces }{@code >}
     * {@link JAXBElement }{@code <}{@link RetailService }{@code >}
     * {@link JAXBElement }{@code <}{@link Rounding }{@code >}
     * {@link JAXBElement }{@code <}{@link RechargingPlan }{@code >}
     * {@link JAXBElement }{@code <}{@link PriceUnit }{@code >}
     * {@link JAXBElement }{@code <}{@link ServicedOrganisation }{@code >}
     * {@link JAXBElement }{@code <}{@link StopPlace }{@code >}
     * {@link JAXBElement }{@code <}{@link ChargingPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link PriceGroup }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecificParameterAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link Assignment }{@code >}
     * {@link JAXBElement }{@code <}{@link PointOfInterestEntrance }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfResponsibilityRole }{@code >}
     * {@link JAXBElement }{@code <}{@link CourseOfJourneys }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfEntitiesVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckLevel }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends EntityStructure>> getGeneralFrameMemberOrDataManagedObjectOrEntityEntity() {
        if (generalFrameMemberOrDataManagedObjectOrEntityEntity == null) {
            generalFrameMemberOrDataManagedObjectOrEntityEntity = new ArrayList<JAXBElement<? extends EntityStructure>>();
        }
        return this.generalFrameMemberOrDataManagedObjectOrEntityEntity;
    }

}
