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
import jakarta.xml.bind.annotation.XmlType;


/**
 * One to many Relationship for scoping validity parameters.
 * 
 * <p>Java-Klasse f�r validityParameters_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="validityParameters_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;group ref="{http://www.netex.org.uk/netex}ScopingValidityParametersGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validityParameters_RelStructure", propOrder = {
    "vehicleModesOrTransportModesAndTransportSubmode"
})
public class ValidityParametersRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "VehicleModes", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TrainNumberRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TrainElementTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RoutingType", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ModeOfOperationRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ChargingMomentType", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfUsageParameterRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GroupOfDistributionChannelsRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TrainComponentLabelAssignmentRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PointOfInterestClassificationRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ClassOfUseRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfPaymentMethodRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfServiceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DeckRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GroupOfServicesRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DistributionChannelRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GroupOfSingleJourneysRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SaleDiscountRightType", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OrganisationRef_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BorderPointRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ScheduledStopPointRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ServiceJourneyPatternRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TransportModes", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ServiceJourneyRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VehicleMeetingLinkRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MobilityServiceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DeckSpaceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GroupOfSitesRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VehicleRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SpecialServiceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VehicleMeetingPlaceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NormalDatedVehicleJourneyRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Directions", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfFareStructureElementRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PlaceUse", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TransferRestrictionRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PreassignedFareProductType", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TopographicPlaceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LocalServiceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ChargingMomentRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfMediumAccessDeviceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GroupOfLinesRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfFareStructureFactorRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SingleJourneyRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VehicleModelProfileRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AmountOfPriceUnitType", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DeckPlanRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FareClass", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VehicleMeetingPointRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RoutingConstraintZoneRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PricingRuleRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LineRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PaymentMethod", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FareZoneRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FacilitySetRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GroupOfTariffZonesRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfTravelDocumentRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PassengerSeatRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SeriesConstraintRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfProofRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AllOrganisationsRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfSalesOfferPackageRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VehicleModelRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfPricingRuleRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SupplementProductType", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfLineRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GroupOfOperatorsRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TariffZoneRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AddressRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TariffRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LocatableSpotRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfTariffRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfMachineReadabilityRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SpotRowRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfLocatableSpotRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SingleJourneyPathRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TrainElementRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TransportSubmode", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UsageDiscountRightType", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DistributionChannelType", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LevelRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ServiceExclusionRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfFareProductRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfProductCategoryRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TransportTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DatedVehicleJourneyRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TrainComponentRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MobilityServiceConstraintZoneRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SpotColumnRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfConcessionRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SiteElementRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FareSectionRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FulfilmentMethodType", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "typesOfProofAcceptedRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FulfilmentMethodRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> vehicleModesOrTransportModesAndTransportSubmode;

    /**
     * Gets the value of the vehicleModesOrTransportModesAndTransportSubmode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleModesOrTransportModesAndTransportSubmode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleModesOrTransportModesAndTransportSubmode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ModeOfOperationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link MeetingPointServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfUsageParameterRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfDistributionChannelsRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolingModeOfOperationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomerServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ScheduledModeOfOperationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GeneralOrganisationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link MonitoredVehicleSharingParkingBayRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiStandRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleMeetingPlaceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerSpaceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DatedSpecialServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TransferRestrictionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LocalServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ChargingMomentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleRentalModeOfOperationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AmountOfPriceUnitEnumeration }{@code >}
     * {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TrailingRollingStockItemRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RoutingConstraintZoneRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareZoneRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CommonVehicleServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CateringServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AssistanceBookingServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SeriesConstraintRef }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingEntranceForVehiclesRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfSalesOfferPackageRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerVehicleSpotRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TariffZoneRef }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleSharingModeOfOperationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AddressRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CarPoolingServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RechargingStationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfTariffRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfMachineReadabilityRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SingleJourneyPathRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageDiscountRightEnumeration }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiRankRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link StopPlaceEntranceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceExclusionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TransportTypeRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SpotColumnRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceFacilitySetRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link FulfilmentMethodTypeEnumeration }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleSharingParkingAreaRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link AllPublicTransportModesEnumeration }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link TrainElementTypeRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RoutingTypeEnumeration }{@code >}
     * {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TravelAgentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolingParkingBayRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     * {@link JAXBElement }{@code <}{@link NetworkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AccessSpaceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingAreaRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPaymentMethodRef }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PointOfInterestSpaceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RechargingBayRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link StopPlaceSpaceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SaleDiscountRightEnumeration }{@code >}
     * {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OtherOrganisationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingPassengerEntranceRef }{@code >}
     * {@link JAXBElement }{@code <}{@link PointOfInterestRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CarModelProfileRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AllOperatorsRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerSpotRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OnlineServiceOperatorRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RetailServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteFacilitySetRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleModelProfileRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckPlanRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PricingRuleRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RoadAddressRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FacilitySetRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfTariffZonesRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfProofRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServicedOrganisationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfOperatorsRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FlexibleModeOfOperationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CommunicationServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SpotRowRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiParkingAreaRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TransportSubmodeStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TractiveRollingStockItemRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DistributionChannelTypeEnumeration }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfProductCategoryRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteComponentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AlternativeModeOfOperationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OnlineServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleStoppingPositionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ConventionalModeOfOperationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RollingStockItemRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ChargingMomentEnumeration }{@code >}
     * {@link JAXBElement }{@code <}{@link PointOfInterestClassificationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link EntranceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LimitingRuleRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfServicesRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfSingleJourneysRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TractiveElementTypeRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceJourneyPatternRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link MobilityServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleSharingParkingBayRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RelativeDirectionEnumeration }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareStructureElementRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AllAuthoritiesRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PlaceUseEnumeration }{@code >}
     * {@link JAXBElement }{@code <}{@link PreassignedFareProductEnumeration }{@code >}
     * {@link JAXBElement }{@code <}{@link TopographicPlaceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleEntranceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfMediumAccessDeviceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfLinesRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareStructureFactorRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleMeetingPointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link QuayRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link BoardingPositionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PaymentMethodEnumeration }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfTravelDocumentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LeftLuggageServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link HireServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AllTransportOrganisationsRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RetailConsortiumRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LuggageServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleModelRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RestrictedServiceFacilitySetRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleStoppingPlaceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TariffRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolingParkingAreaRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleSharingServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TrainElementTypeRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TrailingElementTypeRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LevelRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplaintsServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PostalAddressRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TrainComponentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link MobilityServiceConstraintZoneRef }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteElementRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypesOfProofRefsRelStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FulfilmentMethodRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TrainNumberRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AssistanceServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TrainComponentLabelAssignmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleVehicleTypeRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ClassOfUseRef }{@code >}
     * {@link JAXBElement }{@code <}{@link LuggageSpotRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DistributionChannelRefStructureElement }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingEntranceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link BorderPointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleRentalServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PersonalModeOfOperationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link AllModesEnumeration }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleMeetingLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CycleModelProfileRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckSpaceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfSitesRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscountingRuleRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolingMeetingPlaceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PointOfInterestEntranceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LostPropertyServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ChauffeuredVehicleServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PointOfInterestVehicleEntranceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SingleJourneyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareClassEnumeration }{@code >}
     * {@link JAXBElement }{@code <}{@link StopPlaceVehicleEntranceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceSiteRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LineRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerSeatRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ManagementAgentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AllOrganisationsRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPricingRuleRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SupplementProductEnumeration }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfLineRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LocatableSpotRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AllPublicTransportOrganisationsRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfLocatableSpotRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OtherDeckSpaceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingBayRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TicketingServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingTariffRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareProductRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link MoneyServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FlexibleLineRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolingServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfConcessionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareSectionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getVehicleModesOrTransportModesAndTransportSubmode() {
        if (vehicleModesOrTransportModesAndTransportSubmode == null) {
            vehicleModesOrTransportModesAndTransportSubmode = new ArrayList<JAXBElement<?>>();
        }
        return this.vehicleModesOrTransportModesAndTransportSubmode;
    }

}
