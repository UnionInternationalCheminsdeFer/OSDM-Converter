//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for an Implementation of a strict aggregate relationship by value, where the contained element is a child of the parent. A one to many relationship from the source, the containing parent, to the child instance.
 * 
 * <p>Java-Klasse f�r strictContainmentAggregationStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="strictContainmentAggregationStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}relationshipStructure">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "strictContainmentAggregationStructure")
@XmlSeeAlso({
    AlternativeTextsRelStructure.class,
    FareTableRowsRelStructure.class,
    ViasRelStructure.class,
    FareTableColumnsRelStructure.class,
    PreviousCallsRelStructure.class,
    OnwardCallsRelStructure.class,
    AlternativeNamesRelStructure.class,
    AccessRightsInProductRelStructure.class,
    TimingLinksRelStructure.class,
    VehicleJourneyHeadwaysRelStructure.class,
    FulfilmentMethodPricesRelStructure.class,
    DeckEntranceCouplesRelStructure.class,
    DeckPathJunctionRefsRelStructure.class,
    EstimatedPassingTimesRelStructure.class,
    VehicleJourneyLayoversRelStructure.class,
    PointsOnSectionRelStructure.class,
    RoundingStepsRelStructure.class,
    FareQuotaFactorsRelStructure.class,
    QualityStructureFactorPricesRelStructure.class,
    FareProductPricesRelStructure.class,
    GroupOfLinksRelStructure.class,
    JourneyPatternRunTimesRelStructure.class,
    CheckConstraintThroughputsRelStructure.class,
    PropertiesOfDayRelStructure.class,
    StairFlightsRelStructure.class,
    CustomerPurchasePackagePricesRelStructure.class,
    FarePricesRelStructure.class,
    PointOfInterestClassificationHierarchyMembersRelStructure.class,
    JourneyPatternWaitTimesRelStructure.class,
    ControllableElementsRelStructure.class,
    PricingServicesRelStructure.class,
    LinksInJourneyPatternRelStructure.class,
    TargetPassingTimesRelStructure.class,
    AccessibilityLimitationsRelStructure.class,
    PriceRuleStepResultsRelStructure.class,
    VehicleJourneyRunTimesRelStructure.class,
    ServiceJourneyInterchangesRelStructure.class,
    CappingRulesRelStructure.class,
    VehicleJourneyWaitTimesRelStructure.class,
    CrewBaseRefsRelStructure.class,
    CompositePricesRelStructure.class,
    EquipmentPositionsRelStructure.class,
    TimeDemandProfileMembersRelStructure.class,
    GroupOfPointsRelStructure.class,
    PointsInJourneyPatternRelStructure.class,
    QualityStructureFactorsRelStructure.class,
    DefaultDeadRunRunTimesRelStructure.class,
    DefaultServiceJourneyRunTimesRelStructure.class,
    TurnaroundTimeLimitTimesRelStructure.class,
    PassengerAtStopTimesRelStructure.class,
    StopPointsInJourneyPatternRelStructure.class,
    RechargingStepsRelStructure.class,
    GaragePointsRelStructure.class,
    ZonesInSeriesRelStructure.class,
    JourneyRunTimesRelStructure.class,
    TimingPointsInJourneyPatternRelStructure.class,
    FareTablesRelStructure.class,
    PlacesInSequenceRelStructure.class,
    CommonSectionPointMembersRelStructure.class,
    TimetabledPassingTimesRelStructure.class,
    DeadRunCallsRelStructure.class,
    SensorsInEntranceRelStructure.class,
    TypesOfValueRelStructure.class,
    ValidableElementPricesRelStructure.class,
    ControllableElementsInSequenceRelStructure.class,
    VehicleTypePreferencesRelStructure.class,
    ParkingPropertiesRelStructure.class,
    DeliveryVariantsRelStructure.class,
    GeographicalIntervalPricesRelStructure.class,
    DeckSpaceCapacitiesRelStructure.class,
    ObservedPassingTimesRelStructure.class,
    SensorsInSpotRelStructure.class,
    DestinationDisplayVariantsRelStructure.class,
    PriceGroupsRelStructure.class,
    CellRefsRelStructure.class,
    ValidableElementsRelStructure.class,
    TrainsInCompoundTrainRelStructure.class,
    RouteInstructionsRelStructure.class,
    SeriesConstraintPricesRelStructure.class,
    TimeStructureFactorsRelStructure.class,
    CellsRelStructure.class,
    UsageParameterPriceRefsRelStructure.class,
    ResponsibilityRoleAssignmentsRelStructure.class,
    MonitoredCallsRelStructure.class,
    LogEntriesRelStructure.class,
    LinksOnSectionRelStructure.class,
    DeckPlacesInSequenceRelStructure.class,
    DeckEntranceUsagesRelStructure.class,
    FareDemandFactorsRelStructure.class,
    PointsOnRouteRelStructure.class,
    GroupOfServicesMembersRelStructure.class,
    TimeUnitPricesRelStructure.class,
    MonthValidityOffsetsRelStructure.class,
    AccessibilityAssessmentsRelStructure.class,
    JourneyMeetingViewsRelStructure.class,
    CappingRulePricesRelStructure.class,
    SchematicMapMembersRelStructure.class,
    ClassificationDescriptorsRelStructure.class,
    StartTimeAtStopPointsRelStructure.class,
    DeckNavigationPathsRelStructure.class,
    SectionsInSequenceRelStructure.class,
    PathLinksInSequenceRelStructure.class,
    JourneyWaitTimesRelStructure.class,
    JourneyLayoversRelStructure.class,
    UsageParameterPricesRelStructure.class,
    VehicleEquipmentProfileMembersRelStructure.class,
    SalesOfferPackagePricesRelStructure.class,
    AccessSummariesRelStructure.class,
    GeographicalUnitPricesRelStructure.class,
    CallsRelStructure.class,
    ControllableElementPricesRelStructure.class,
    PointsOnLinkRelStructure.class,
    CheckConstraintDelaysRelStructure.class,
    TopographicPlaceDescriptorsRelStructure.class,
    TimeIntervalPricesRelStructure.class,
    FareStructureElementsInSequenceRelStructure.class,
    DistanceMatrixElementPricesRelStructure.class,
    JourneyPatternLayoversRelStructure.class,
    ServiceLinksInJourneyPatternRelStructure.class,
    CodespaceAssignmentsRelStructure.class,
    FareStructureElementPricesRelStructure.class,
    ParkingPricesRelStructure.class,
    DayTypeAssignmentsRelStructure.class,
    SuitabilitiesRelStructure.class,
    CustomerPurchasePackageElementAccessesRelStructure.class,
    JourneyPatternHeadwaysRelStructure.class,
    GroupOfLinkSequencesRelStructure.class,
    GeographicalStructureFactorsRelStructure.class,
    JourneyHeadwaysRelStructure.class
})
public class StrictContainmentAggregationStructure
    extends RelationshipStructure
{


}
