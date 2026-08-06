//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a CELL.
 * 
 * <p>Java-Klasse f�r Cell_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Cell_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CellGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cell_VersionedChildStructure", propOrder = {
    "name",
    "description",
    "cellPrice",
    "farePriceRef",
    "farePriceDummy",
    "priceGroupRef",
    "priceableObjectRef",
    "groupOfDistanceMatrixElementsRef",
    "directionType",
    "routingType",
    "transportOrganisationRef",
    "groupOfLinesRef",
    "lineRef",
    "siteRef",
    "vehicleMeetingPlaceRef",
    "typeOfParkingRef",
    "tariffZoneRef",
    "fareSectionRef",
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
    "transportTypeRef",
    "vehicleModelRef",
    "vehicleModelProfileRef",
    "equipmentRef",
    "typeOfFareProductRef",
    "distributionChannelRef",
    "groupOfDistributionChannelsRef",
    "paymentMethod",
    "typeOfPaymentMethodRef",
    "typeOfTravelDocumentRef",
    "fareTableRef",
    "columnRef",
    "rowRef",
    "noticeAssignments"
})
@XmlSeeAlso({
    Cell.class,
    uk.org.netex.netex.CellsRelStructure.CellInContext.class
})
public class CellVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "CellPrice")
    protected FarePriceVersionedChildStructure cellPrice;
    @XmlElementRef(name = "FarePriceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends FarePriceRefStructure> farePriceRef;
    @XmlElementRef(name = "FarePrice_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends VersionedChildStructure> farePriceDummy;
    @XmlElement(name = "PriceGroupRef")
    protected PriceGroupRefStructure priceGroupRef;
    @XmlElementRef(name = "PriceableObjectRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends PriceableObjectRefStructure>> priceableObjectRef;
    @XmlElement(name = "GroupOfDistanceMatrixElementsRef")
    protected GroupOfDistanceMatrixElementsRefStructureElement groupOfDistanceMatrixElementsRef;
    @XmlElement(name = "DirectionType", defaultValue = "both")
    @XmlSchemaType(name = "normalizedString")
    protected RelativeDirectionEnumeration directionType;
    @XmlElement(name = "RoutingType", defaultValue = "both")
    @XmlSchemaType(name = "normalizedString")
    protected RoutingTypeEnumeration routingType;
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
    @XmlElementRef(name = "TransportTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TransportTypeRefStructure> transportTypeRef;
    @XmlElement(name = "VehicleModelRef")
    protected VehicleModelRefStructure vehicleModelRef;
    @XmlElementRef(name = "VehicleModelProfileRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends VehicleModelProfileRefStructure> vehicleModelProfileRef;
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
    @XmlElementRef(name = "FareTableRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends FareTableRefStructure> fareTableRef;
    @XmlElement(name = "ColumnRef")
    protected FareTableColumnRefStructure columnRef;
    @XmlElement(name = "RowRef")
    protected FareTableRowRefStructure rowRef;
    protected NoticeAssignmentsRelStructure noticeAssignments;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;

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
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescription(MultilingualString value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der cellPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FarePriceVersionedChildStructure }
     *     
     */
    public FarePriceVersionedChildStructure getCellPrice() {
        return cellPrice;
    }

    /**
     * Legt den Wert der cellPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePriceVersionedChildStructure }
     *     
     */
    public void setCellPrice(FarePriceVersionedChildStructure value) {
        this.cellPrice = value;
    }

    /**
     * Ruft den Wert der farePriceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FarePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalUnitPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FulfilmentMethodPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalIntervalPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CappingRulePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValidableElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ControllableElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageParameterPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeriesConstraintPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityStructureFactorPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareStructureElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeUnitPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackagePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeIntervalPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerPurchasePackagePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceMatrixElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareProductPriceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends FarePriceRefStructure> getFarePriceRef() {
        return farePriceRef;
    }

    /**
     * Legt den Wert der farePriceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FarePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalUnitPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FulfilmentMethodPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalIntervalPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CappingRulePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValidableElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ControllableElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageParameterPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeriesConstraintPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityStructureFactorPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareStructureElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeUnitPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackagePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeIntervalPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerPurchasePackagePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceMatrixElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareProductPriceRefStructure }{@code >}
     *     
     */
    public void setFarePriceRef(JAXBElement<? extends FarePriceRefStructure> value) {
        this.farePriceRef = value;
    }

    /**
     * Ruft den Wert der farePriceDummy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VersionedChildStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValidableElementPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalIntervalPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerPurchasePackagePrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link ControllableElementPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeriesConstraintPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageParameterPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceMatrixElementPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeUnitPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link FulfilmentMethodPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityStructureFactorPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link CappingRulePrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeIntervalPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackagePrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link FarePrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareStructureElementPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalUnitPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareProductPrice }{@code >}
     *     
     */
    public JAXBElement<? extends VersionedChildStructure> getFarePriceDummy() {
        return farePriceDummy;
    }

    /**
     * Legt den Wert der farePriceDummy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VersionedChildStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValidableElementPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalIntervalPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerPurchasePackagePrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link ControllableElementPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeriesConstraintPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageParameterPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceMatrixElementPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeUnitPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link FulfilmentMethodPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityStructureFactorPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link CappingRulePrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeIntervalPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackagePrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link FarePrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareStructureElementPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalUnitPrice }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareProductPrice }{@code >}
     *     
     */
    public void setFarePriceDummy(JAXBElement<? extends VersionedChildStructure> value) {
        this.farePriceDummy = value;
    }

    /**
     * Ruft den Wert der priceGroupRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceGroupRefStructure }
     *     
     */
    public PriceGroupRefStructure getPriceGroupRef() {
        return priceGroupRef;
    }

    /**
     * Legt den Wert der priceGroupRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGroupRefStructure }
     *     
     */
    public void setPriceGroupRef(PriceGroupRefStructure value) {
        this.priceGroupRef = value;
    }

    /**
     * Gets the value of the priceableObjectRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceableObjectRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceableObjectRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link GeographicalIntervalRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link EntitlementRequiredRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RoundTripRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link EntitlementProductRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link MinimumStayRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link EligibilityChangePolicyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AdditionalDriverOptionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementRequiredRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ReplacingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOfferPackageElementRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RentalOptionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link InterchangingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ChargingPolicyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TransferabilityRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link StepLimitRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AmountOfPriceUnitProductRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CancellingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CappingRuleRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ResellingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageParameterRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ReservingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RoutingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomerPurchasePackageRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareStructureFactorRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DistanceMatrixElementRef }{@code >}
     * {@link JAXBElement }{@code <}{@link FareProductRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ThirdPartyProductRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementGivenRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SaleDiscountRightRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageParameterRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidableElementRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SubscribingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CompanionProfileRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GeographicalStructureFactorRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RentalPenaltyPolicyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PriceableObjectRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageDiscountRightRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link BookingPolicyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LuggageAllowanceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareStructureElementRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SuspendingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link QualityStructureFactorRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SeriesConstraintRef }{@code >}
     * {@link JAXBElement }{@code <}{@link FareDemandFactorRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PreassignedFareProductRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ControllableElementRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupTicketRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link EntitlementGivenRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingChargeBandRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SupplementProductRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeStructureFactorRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RefundingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageValidityPeriodRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareIntervalRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeIntervalRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomerPurchasePackageElementRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DistanceMatrixElementInverseRef }{@code >}
     * {@link JAXBElement }{@code <}{@link ExchangingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolerProfileRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOfferPackageRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PurchaseWindowRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link UserProfileRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareQuotaFactorRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FrequencyOfUseRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CappedDiscountRightRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PenaltyPolicyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceAccessRightRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CommercialProfileRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FulfilmentMethodRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends PriceableObjectRefStructure>> getPriceableObjectRef() {
        if (priceableObjectRef == null) {
            priceableObjectRef = new ArrayList<JAXBElement<? extends PriceableObjectRefStructure>>();
        }
        return this.priceableObjectRef;
    }

    /**
     * Ruft den Wert der groupOfDistanceMatrixElementsRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfDistanceMatrixElementsRefStructureElement }
     *     
     */
    public GroupOfDistanceMatrixElementsRefStructureElement getGroupOfDistanceMatrixElementsRef() {
        return groupOfDistanceMatrixElementsRef;
    }

    /**
     * Legt den Wert der groupOfDistanceMatrixElementsRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfDistanceMatrixElementsRefStructureElement }
     *     
     */
    public void setGroupOfDistanceMatrixElementsRef(GroupOfDistanceMatrixElementsRefStructureElement value) {
        this.groupOfDistanceMatrixElementsRef = value;
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
     * Ruft den Wert der transportTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SimpleVehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TransportTypeRefStructure> getTransportTypeRef() {
        return transportTypeRef;
    }

    /**
     * Legt den Wert der transportTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SimpleVehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     
     */
    public void setTransportTypeRef(JAXBElement<? extends TransportTypeRefStructure> value) {
        this.transportTypeRef = value;
    }

    /**
     * Ruft den Wert der vehicleModelRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleModelRefStructure }
     *     
     */
    public VehicleModelRefStructure getVehicleModelRef() {
        return vehicleModelRef;
    }

    /**
     * Legt den Wert der vehicleModelRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleModelRefStructure }
     *     
     */
    public void setVehicleModelRef(VehicleModelRefStructure value) {
        this.vehicleModelRef = value;
    }

    /**
     * Ruft den Wert der vehicleModelProfileRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CarModelProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleModelProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CycleModelProfileRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends VehicleModelProfileRefStructure> getVehicleModelProfileRef() {
        return vehicleModelProfileRef;
    }

    /**
     * Legt den Wert der vehicleModelProfileRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CarModelProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleModelProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CycleModelProfileRefStructure }{@code >}
     *     
     */
    public void setVehicleModelProfileRef(JAXBElement<? extends VehicleModelProfileRefStructure> value) {
        this.vehicleModelProfileRef = value;
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

    /**
     * Ruft den Wert der fareTableRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FareTableRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardFareTableRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends FareTableRefStructure> getFareTableRef() {
        return fareTableRef;
    }

    /**
     * Legt den Wert der fareTableRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FareTableRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardFareTableRefStructure }{@code >}
     *     
     */
    public void setFareTableRef(JAXBElement<? extends FareTableRefStructure> value) {
        this.fareTableRef = value;
    }

    /**
     * Ruft den Wert der columnRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareTableColumnRefStructure }
     *     
     */
    public FareTableColumnRefStructure getColumnRef() {
        return columnRef;
    }

    /**
     * Legt den Wert der columnRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTableColumnRefStructure }
     *     
     */
    public void setColumnRef(FareTableColumnRefStructure value) {
        this.columnRef = value;
    }

    /**
     * Ruft den Wert der rowRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareTableRowRefStructure }
     *     
     */
    public FareTableRowRefStructure getRowRef() {
        return rowRef;
    }

    /**
     * Legt den Wert der rowRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTableRowRefStructure }
     *     
     */
    public void setRowRef(FareTableRowRefStructure value) {
        this.rowRef = value;
    }

    /**
     * Ruft den Wert der noticeAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NoticeAssignmentsRelStructure }
     *     
     */
    public NoticeAssignmentsRelStructure getNoticeAssignments() {
        return noticeAssignments;
    }

    /**
     * Legt den Wert der noticeAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeAssignmentsRelStructure }
     *     
     */
    public void setNoticeAssignments(NoticeAssignmentsRelStructure value) {
        this.noticeAssignments = value;
    }

    /**
     * Ruft den Wert der order-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Legt den Wert der order-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

}
