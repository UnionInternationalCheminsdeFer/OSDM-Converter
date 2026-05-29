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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for containment in frame of GROUP OF ENTITIes.
 * 
 * <p>Java-Klasse f�r groupOfEntitiesInFrame_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="groupOfEntitiesInFrame_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}GroupOfEntities" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "groupOfEntitiesInFrame_RelStructure", propOrder = {
    "groupOfEntities"
})
public class GroupOfEntitiesInFrameRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRef(name = "GroupOfEntities", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends GroupOfEntitiesVersionStructure>> groupOfEntities;

    /**
     * Gets the value of the groupOfEntities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupOfEntities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupOfEntities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link GroupOfServices }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfOperators }{@code >}
     * {@link JAXBElement }{@code <}{@link StopPlaceSpaceVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfPoints }{@code >}
     * {@link JAXBElement }{@code <}{@link StopPlaceComponentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AddressVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfDistributionChannels }{@code >}
     * {@link JAXBElement }{@code <}{@link CrewBase }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfTariffZones }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfLines }{@code >}
     * {@link JAXBElement }{@code <}{@link FareTableInContext }{@code >}
     * {@link JAXBElement }{@code <}{@link Network }{@code >}
     * {@link JAXBElement }{@code <}{@link AccessZone }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckComponentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleEntrance }{@code >}
     * {@link JAXBElement }{@code <}{@link AdministrativeZone }{@code >}
     * {@link JAXBElement }{@code <}{@link JourneyFrequencyGroupVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FlexibleStopPlace }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfLinkSequences }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfSites }{@code >}
     * {@link JAXBElement }{@code <}{@link FareZone }{@code >}
     * {@link JAXBElement }{@code <}{@link RechargingStation }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerEntrance }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckVehicleEntrance }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteComponentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link HailAndRideArea }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiStand }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleMeetingPlace }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardFareTable }{@code >}
     * {@link JAXBElement }{@code <}{@link FlexibleQuay }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiRank }{@code >}
     * {@link JAXBElement }{@code <}{@link ZoneVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FlexibleArea }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolingParkingArea }{@code >}
     * {@link JAXBElement }{@code <}{@link GeneralGroupOfEntities }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TransportAdministrativeZone }{@code >}
     * {@link JAXBElement }{@code <}{@link RhythmicalJourneyGroup }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerSpace }{@code >}
     * {@link JAXBElement }{@code <}{@link MonitoredVehicleSharingParkingBay }{@code >}
     * {@link JAXBElement }{@code <}{@link LuggageSpot }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfDistanceMatrixElements }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingPassengerEntrance }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckComponentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link HeadwayJourneyGroup }{@code >}
     * {@link JAXBElement }{@code <}{@link StopArea }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingBay }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteComponentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiParkingArea }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleStoppingPosition }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolingParkingBay }{@code >}
     * {@link JAXBElement }{@code <}{@link OtherDeckSpace }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolingMeetingPlace }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfEntitiesVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Parking }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfTimingLinks }{@code >}
     * {@link JAXBElement }{@code <}{@link ZoneVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PoolOfVehicles }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckComponentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingEntranceForVehicles }{@code >}
     * {@link JAXBElement }{@code <}{@link AddressablePlace }{@code >}
     * {@link JAXBElement }{@code <}{@link MobilityServiceConstraintZone }{@code >}
     * {@link JAXBElement }{@code <}{@link PointOfInterest }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentPlace }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerVehicleSpot }{@code >}
     * {@link JAXBElement }{@code <}{@link LocatableSpotVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Quay }{@code >}
     * {@link JAXBElement }{@code <}{@link Deck }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingArea }{@code >}
     * {@link JAXBElement }{@code <}{@link OnboardSpaceVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerSpot }{@code >}
     * {@link JAXBElement }{@code <}{@link PointOfInterestSpace }{@code >}
     * {@link JAXBElement }{@code <}{@link Country }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckWindow }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleSharingParkingBay }{@code >}
     * {@link JAXBElement }{@code <}{@link GeneralZone }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleStoppingPlace }{@code >}
     * {@link JAXBElement }{@code <}{@link OtherDeckEntrance }{@code >}
     * {@link JAXBElement }{@code <}{@link AccessSpace }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteElementVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link StopPlaceVehicleEntrance }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfLinks }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckEntrance }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleSharingParkingArea }{@code >}
     * {@link JAXBElement }{@code <}{@link Layer }{@code >}
     * {@link JAXBElement }{@code <}{@link RoadAddress }{@code >}
     * {@link JAXBElement }{@code <}{@link Garage }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfSingleJourneys }{@code >}
     * {@link JAXBElement }{@code <}{@link RoutingConstraintZone }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckSpace }{@code >}
     * {@link JAXBElement }{@code <}{@link TariffZone }{@code >}
     * {@link JAXBElement }{@code <}{@link TopographicPlace }{@code >}
     * {@link JAXBElement }{@code <}{@link RechargingBay }{@code >}
     * {@link JAXBElement }{@code <}{@link PointOfInterestVehicleEntrance }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteEntranceVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link BoardingPosition }{@code >}
     * {@link JAXBElement }{@code <}{@link PlaceVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfEntitiesVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteComponentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfPlaces }{@code >}
     * {@link JAXBElement }{@code <}{@link StopPlace }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingComponent }{@code >}
     * {@link JAXBElement }{@code <}{@link FareTable }{@code >}
     * {@link JAXBElement }{@code <}{@link PriceGroup }{@code >}
     * {@link JAXBElement }{@code <}{@link AddressablePlaceVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link StopPlaceEntrance }{@code >}
     * {@link JAXBElement }{@code <}{@link PointOfInterestEntrance }{@code >}
     * {@link JAXBElement }{@code <}{@link PointOfInterestComponentVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PostalAddress }{@code >}
     * {@link JAXBElement }{@code <}{@link ZoneVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceSite }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfEntitiesVersionStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends GroupOfEntitiesVersionStructure>> getGroupOfEntities() {
        if (groupOfEntities == null) {
            groupOfEntities = new ArrayList<JAXBElement<? extends GroupOfEntitiesVersionStructure>>();
        }
        return this.groupOfEntities;
    }

}
