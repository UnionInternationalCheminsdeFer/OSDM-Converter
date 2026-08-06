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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specific references for FARE TABLE
 * 
 * <p>Java-Klasse f�r FareTableSpecificsStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FareTableSpecificsStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CellSpecificNetworkGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CellSpecificRoutingGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CellSpecificServiceGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CellSpecificEquipmentGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CellSpecificDistributionGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareTableSpecificsStructure", propOrder = {
    "transportOrganisationRef",
    "groupOfLinesRef",
    "lineRef",
    "siteRef",
    "vehicleMeetingPlaceRef",
    "typeOfParkingRef",
    "tariffZoneRef",
    "fareSectionRef",
    "directionType",
    "routingType",
    "fareClass",
    "classOfUseRef",
    "facilitySetRef",
    "typeOfProductCategoryRef",
    "typeOfServiceRef",
    "serviceJourneyRef",
    "singleJourneyRef",
    "trainNumberRef",
    "groupOfServicesRef",
    "groupOfSingleJourneysRef",
    "equipmentRef",
    "typeOfFareProductRef",
    "distributionChannelRef",
    "groupOfDistributionChannelsRef",
    "paymentMethod",
    "typeOfPaymentMethodRef",
    "typeOfTravelDocumentRef"
})
@XmlSeeAlso({
    uk.org.netex.netex.FareTableVersionStructure.Specifics.class
})
public class FareTableSpecificsStructure {

    @XmlElementRef(name = "TransportOrganisationRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TransportOrganisationRefStructure> transportOrganisationRef;
    @XmlElementRef(name = "GroupOfLinesRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends GroupOfLinesRefStructure> groupOfLinesRef;
    @XmlElementRef(name = "LineRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LineRefStructure> lineRef;
    @XmlElementRef(name = "SiteRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends SiteRefStructure> siteRef;
    @XmlElementRef(name = "VehicleMeetingPlaceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends VehicleMeetingPlaceRefStructure> vehicleMeetingPlaceRef;
    @XmlElement(name = "TypeOfParkingRef")
    protected TypeOfParkingRefStructure typeOfParkingRef;
    @XmlElement(name = "TariffZoneRef")
    protected TariffZoneRef tariffZoneRef;
    @XmlElement(name = "FareSectionRef")
    protected FareSectionRefStructure fareSectionRef;
    @XmlElement(name = "DirectionType", defaultValue = "both")
    @XmlSchemaType(name = "normalizedString")
    protected RelativeDirectionEnumeration directionType;
    @XmlElement(name = "RoutingType", defaultValue = "both")
    @XmlSchemaType(name = "normalizedString")
    protected RoutingTypeEnumeration routingType;
    @XmlElement(name = "FareClass", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected FareClassEnumeration fareClass;
    @XmlElement(name = "ClassOfUseRef")
    protected ClassOfUseRef classOfUseRef;
    @XmlElementRef(name = "FacilitySetRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends FacilitySetRefStructure> facilitySetRef;
    @XmlElement(name = "TypeOfProductCategoryRef")
    protected TypeOfProductCategoryRefStructure typeOfProductCategoryRef;
    @XmlElement(name = "TypeOfServiceRef")
    protected TypeOfServiceRefStructure typeOfServiceRef;
    @XmlElementRef(name = "ServiceJourneyRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ServiceJourneyRefStructure> serviceJourneyRef;
    @XmlElement(name = "SingleJourneyRef")
    protected SingleJourneyRefStructure singleJourneyRef;
    @XmlElement(name = "TrainNumberRef")
    protected TrainNumberRefStructure trainNumberRef;
    @XmlElement(name = "GroupOfServicesRef")
    protected GroupOfServicesRefStructure groupOfServicesRef;
    @XmlElement(name = "GroupOfSingleJourneysRef")
    protected GroupOfSingleJourneysRefStructure groupOfSingleJourneysRef;
    @XmlElementRef(name = "EquipmentRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends EquipmentRefStructure> equipmentRef;
    @XmlElement(name = "TypeOfFareProductRef")
    protected TypeOfFareProductRefStructure typeOfFareProductRef;
    @XmlElement(name = "DistributionChannelRef")
    protected DistributionChannelRefStructureElement distributionChannelRef;
    @XmlElement(name = "GroupOfDistributionChannelsRef")
    protected GroupOfDistributionChannelsRefStructure groupOfDistributionChannelsRef;
    @XmlElement(name = "PaymentMethod")
    @XmlSchemaType(name = "normalizedString")
    protected PaymentMethodEnumeration paymentMethod;
    @XmlElement(name = "TypeOfPaymentMethodRef")
    protected TypeOfPaymentMethodRef typeOfPaymentMethodRef;
    @XmlElement(name = "TypeOfTravelDocumentRef")
    protected TypeOfTravelDocumentRefStructure typeOfTravelDocumentRef;

    /**
     * A TRANSPORT ORGANISATION for which the CELL provides a price. +v1.2.2
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TransportOrganisationRefStructure> getTransportOrganisationRef() {
        return transportOrganisationRef;
    }

    /**
     * Legt den Wert der transportOrganisationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     
     */
    public void setTransportOrganisationRef(JAXBElement<? extends TransportOrganisationRefStructure> value) {
        this.transportOrganisationRef = value;
    }

    /**
     * Ruft den Wert der groupOfLinesRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfLinesRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends GroupOfLinesRefStructure> getGroupOfLinesRef() {
        return groupOfLinesRef;
    }

    /**
     * Legt den Wert der groupOfLinesRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfLinesRefStructure }{@code >}
     *     
     */
    public void setGroupOfLinesRef(JAXBElement<? extends GroupOfLinesRefStructure> value) {
        this.groupOfLinesRef = value;
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
     * Ruft den Wert der siteRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceSiteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiRankRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingStationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends SiteRefStructure> getSiteRef() {
        return siteRef;
    }

    /**
     * Legt den Wert der siteRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceSiteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiRankRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingStationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     *     
     */
    public void setSiteRef(JAXBElement<? extends SiteRefStructure> value) {
        this.siteRef = value;
    }

    /**
     * A VEHICLE MEETING PLACE for which the CELL provides a price. +v1.2.2
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingMeetingPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleMeetingPlaceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends VehicleMeetingPlaceRefStructure> getVehicleMeetingPlaceRef() {
        return vehicleMeetingPlaceRef;
    }

    /**
     * Legt den Wert der vehicleMeetingPlaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingMeetingPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleMeetingPlaceRefStructure }{@code >}
     *     
     */
    public void setVehicleMeetingPlaceRef(JAXBElement<? extends VehicleMeetingPlaceRefStructure> value) {
        this.vehicleMeetingPlaceRef = value;
    }

    /**
     * A TYPE of PARKING for which the CELL provides a price. +v1.2.2
     * 
     * @return
     *     possible object is
     *     {@link TypeOfParkingRefStructure }
     *     
     */
    public TypeOfParkingRefStructure getTypeOfParkingRef() {
        return typeOfParkingRef;
    }

    /**
     * Legt den Wert der typeOfParkingRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfParkingRefStructure }
     *     
     */
    public void setTypeOfParkingRef(TypeOfParkingRefStructure value) {
        this.typeOfParkingRef = value;
    }

    /**
     * Ruft den Wert der tariffZoneRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TariffZoneRef }
     *     
     */
    public TariffZoneRef getTariffZoneRef() {
        return tariffZoneRef;
    }

    /**
     * Legt den Wert der tariffZoneRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffZoneRef }
     *     
     */
    public void setTariffZoneRef(TariffZoneRef value) {
        this.tariffZoneRef = value;
    }

    /**
     * Ruft den Wert der fareSectionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareSectionRefStructure }
     *     
     */
    public FareSectionRefStructure getFareSectionRef() {
        return fareSectionRef;
    }

    /**
     * Legt den Wert der fareSectionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareSectionRefStructure }
     *     
     */
    public void setFareSectionRef(FareSectionRefStructure value) {
        this.fareSectionRef = value;
    }

    /**
     * Ruft den Wert der directionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RelativeDirectionEnumeration }
     *     
     */
    public RelativeDirectionEnumeration getDirectionType() {
        return directionType;
    }

    /**
     * Legt den Wert der directionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeDirectionEnumeration }
     *     
     */
    public void setDirectionType(RelativeDirectionEnumeration value) {
        this.directionType = value;
    }

    /**
     * Ruft den Wert der routingType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoutingTypeEnumeration }
     *     
     */
    public RoutingTypeEnumeration getRoutingType() {
        return routingType;
    }

    /**
     * Legt den Wert der routingType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingTypeEnumeration }
     *     
     */
    public void setRoutingType(RoutingTypeEnumeration value) {
        this.routingType = value;
    }

    /**
     * Ruft den Wert der fareClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareClassEnumeration }
     *     
     */
    public FareClassEnumeration getFareClass() {
        return fareClass;
    }

    /**
     * Legt den Wert der fareClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareClassEnumeration }
     *     
     */
    public void setFareClass(FareClassEnumeration value) {
        this.fareClass = value;
    }

    /**
     * Ruft den Wert der classOfUseRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClassOfUseRef }
     *     
     */
    public ClassOfUseRef getClassOfUseRef() {
        return classOfUseRef;
    }

    /**
     * Legt den Wert der classOfUseRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassOfUseRef }
     *     
     */
    public void setClassOfUseRef(ClassOfUseRef value) {
        this.classOfUseRef = value;
    }

    /**
     * Ruft den Wert der facilitySetRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SiteFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RestrictedServiceFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FacilitySetRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends FacilitySetRefStructure> getFacilitySetRef() {
        return facilitySetRef;
    }

    /**
     * Legt den Wert der facilitySetRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SiteFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RestrictedServiceFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FacilitySetRefStructure }{@code >}
     *     
     */
    public void setFacilitySetRef(JAXBElement<? extends FacilitySetRefStructure> value) {
        this.facilitySetRef = value;
    }

    /**
     * Ruft den Wert der typeOfProductCategoryRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfProductCategoryRefStructure }
     *     
     */
    public TypeOfProductCategoryRefStructure getTypeOfProductCategoryRef() {
        return typeOfProductCategoryRef;
    }

    /**
     * Legt den Wert der typeOfProductCategoryRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfProductCategoryRefStructure }
     *     
     */
    public void setTypeOfProductCategoryRef(TypeOfProductCategoryRefStructure value) {
        this.typeOfProductCategoryRef = value;
    }

    /**
     * Ruft den Wert der typeOfServiceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfServiceRefStructure }
     *     
     */
    public TypeOfServiceRefStructure getTypeOfServiceRef() {
        return typeOfServiceRef;
    }

    /**
     * Legt den Wert der typeOfServiceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfServiceRefStructure }
     *     
     */
    public void setTypeOfServiceRef(TypeOfServiceRefStructure value) {
        this.typeOfServiceRef = value;
    }

    /**
     * Ruft den Wert der serviceJourneyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ServiceJourneyRefStructure> getServiceJourneyRef() {
        return serviceJourneyRef;
    }

    /**
     * Legt den Wert der serviceJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     
     */
    public void setServiceJourneyRef(JAXBElement<? extends ServiceJourneyRefStructure> value) {
        this.serviceJourneyRef = value;
    }

    /**
     * A SINGLE JOURNEY for which the CELL provides a price. +v1.2.2
     * 
     * @return
     *     possible object is
     *     {@link SingleJourneyRefStructure }
     *     
     */
    public SingleJourneyRefStructure getSingleJourneyRef() {
        return singleJourneyRef;
    }

    /**
     * Legt den Wert der singleJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleJourneyRefStructure }
     *     
     */
    public void setSingleJourneyRef(SingleJourneyRefStructure value) {
        this.singleJourneyRef = value;
    }

    /**
     * Ruft den Wert der trainNumberRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainNumberRefStructure }
     *     
     */
    public TrainNumberRefStructure getTrainNumberRef() {
        return trainNumberRef;
    }

    /**
     * Legt den Wert der trainNumberRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainNumberRefStructure }
     *     
     */
    public void setTrainNumberRef(TrainNumberRefStructure value) {
        this.trainNumberRef = value;
    }

    /**
     * Ruft den Wert der groupOfServicesRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfServicesRefStructure }
     *     
     */
    public GroupOfServicesRefStructure getGroupOfServicesRef() {
        return groupOfServicesRef;
    }

    /**
     * Legt den Wert der groupOfServicesRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfServicesRefStructure }
     *     
     */
    public void setGroupOfServicesRef(GroupOfServicesRefStructure value) {
        this.groupOfServicesRef = value;
    }

    /**
     * A GROUP of SINGLE JOURNEYs for which the CELL provides a price. +v1.2.2
     * 
     * @return
     *     possible object is
     *     {@link GroupOfSingleJourneysRefStructure }
     *     
     */
    public GroupOfSingleJourneysRefStructure getGroupOfSingleJourneysRef() {
        return groupOfSingleJourneysRef;
    }

    /**
     * Legt den Wert der groupOfSingleJourneysRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfSingleJourneysRefStructure }
     *     
     */
    public void setGroupOfSingleJourneysRef(GroupOfSingleJourneysRefStructure value) {
        this.groupOfSingleJourneysRef = value;
    }

    /**
     * Ruft den Wert der equipmentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeetingPointServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShelterEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TicketingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AssistanceServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlaceSignRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BedEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CycleStorageEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RubbishDisposalEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HelpPointEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SensorEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SanitaryEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntranceEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageSpotEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpotEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleChargingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StaircaseEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MobilityServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TicketValidatorEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WheelchairVehicleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaitingRoomEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpotSensorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstalledEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntranceSensorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LostPropertyServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleReleaseEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChauffeuredVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerSafetyEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelatorEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoughSurfaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeatingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageLockerEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstalledEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlaceEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RefuellingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CateringServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LeftLuggageServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailDeviceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HireServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AssistanceBookingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HeadingSignRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivatedEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerBeaconEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessVehicleEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralSignRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WheelchairVehicleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerInformationEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CarPoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BatteryEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommunicationServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaitingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ComplaintsServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TicketingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeatEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrolleyStandEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MoneyServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlaceEquipmentRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends EquipmentRefStructure> getEquipmentRef() {
        return equipmentRef;
    }

    /**
     * Legt den Wert der equipmentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeetingPointServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShelterEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TicketingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AssistanceServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlaceSignRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BedEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CycleStorageEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RubbishDisposalEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HelpPointEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SensorEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SanitaryEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntranceEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageSpotEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpotEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleChargingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StaircaseEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MobilityServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TicketValidatorEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WheelchairVehicleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaitingRoomEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpotSensorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstalledEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntranceSensorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LostPropertyServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleReleaseEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChauffeuredVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerSafetyEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelatorEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoughSurfaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeatingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageLockerEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstalledEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlaceEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RefuellingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CateringServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LeftLuggageServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailDeviceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HireServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AssistanceBookingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HeadingSignRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivatedEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerBeaconEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessVehicleEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralSignRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WheelchairVehicleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerInformationEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CarPoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BatteryEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommunicationServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaitingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ComplaintsServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TicketingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeatEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrolleyStandEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MoneyServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlaceEquipmentRefStructure }{@code >}
     *     
     */
    public void setEquipmentRef(JAXBElement<? extends EquipmentRefStructure> value) {
        this.equipmentRef = value;
    }

    /**
     * Ruft den Wert der typeOfFareProductRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfFareProductRefStructure }
     *     
     */
    public TypeOfFareProductRefStructure getTypeOfFareProductRef() {
        return typeOfFareProductRef;
    }

    /**
     * Legt den Wert der typeOfFareProductRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfFareProductRefStructure }
     *     
     */
    public void setTypeOfFareProductRef(TypeOfFareProductRefStructure value) {
        this.typeOfFareProductRef = value;
    }

    /**
     * Ruft den Wert der distributionChannelRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistributionChannelRefStructureElement }
     *     
     */
    public DistributionChannelRefStructureElement getDistributionChannelRef() {
        return distributionChannelRef;
    }

    /**
     * Legt den Wert der distributionChannelRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionChannelRefStructureElement }
     *     
     */
    public void setDistributionChannelRef(DistributionChannelRefStructureElement value) {
        this.distributionChannelRef = value;
    }

    /**
     * Ruft den Wert der groupOfDistributionChannelsRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfDistributionChannelsRefStructure }
     *     
     */
    public GroupOfDistributionChannelsRefStructure getGroupOfDistributionChannelsRef() {
        return groupOfDistributionChannelsRef;
    }

    /**
     * Legt den Wert der groupOfDistributionChannelsRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfDistributionChannelsRefStructure }
     *     
     */
    public void setGroupOfDistributionChannelsRef(GroupOfDistributionChannelsRefStructure value) {
        this.groupOfDistributionChannelsRef = value;
    }

    /**
     * Ruft den Wert der paymentMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodEnumeration }
     *     
     */
    public PaymentMethodEnumeration getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Legt den Wert der paymentMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodEnumeration }
     *     
     */
    public void setPaymentMethod(PaymentMethodEnumeration value) {
        this.paymentMethod = value;
    }

    /**
     * Ruft den Wert der typeOfPaymentMethodRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPaymentMethodRef }
     *     
     */
    public TypeOfPaymentMethodRef getTypeOfPaymentMethodRef() {
        return typeOfPaymentMethodRef;
    }

    /**
     * Legt den Wert der typeOfPaymentMethodRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPaymentMethodRef }
     *     
     */
    public void setTypeOfPaymentMethodRef(TypeOfPaymentMethodRef value) {
        this.typeOfPaymentMethodRef = value;
    }

    /**
     * Ruft den Wert der typeOfTravelDocumentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTravelDocumentRefStructure }
     *     
     */
    public TypeOfTravelDocumentRefStructure getTypeOfTravelDocumentRef() {
        return typeOfTravelDocumentRef;
    }

    /**
     * Legt den Wert der typeOfTravelDocumentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTravelDocumentRefStructure }
     *     
     */
    public void setTypeOfTravelDocumentRef(TypeOfTravelDocumentRefStructure value) {
        this.typeOfTravelDocumentRef = value;
    }

}
