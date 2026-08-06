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
 * Type for a FARE FRAME.
 * 
 * <p>Java-Klasse f�r FareFrame_VersionFrameStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FareFrame_VersionFrameStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Common_VersionFrameStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}FareFrameGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareFrame_VersionFrameStructure", propOrder = {
    "mode",
    "transportOrganisationRef",
    "pricingParameterSet",
    "notices",
    "noticeAssignments",
    "borderPoints",
    "fareScheduledStopPoints",
    "fareZones",
    "fareSections",
    "seriesConstraints",
    "geographicalUnits",
    "geographicalIntervals",
    "geographicalStructureFactors",
    "timeUnits",
    "timeIntervals",
    "timeStructureFactors",
    "qualityStructureFactors",
    "distanceMatrixElements",
    "groupsOfDistanceMatrixElements",
    "fareStructureElements",
    "tariffs",
    "validableElements",
    "controllableElements",
    "usageParameters",
    "accessRightParameterAssignments",
    "fareProducts",
    "priceGroups",
    "fareTables",
    "distributionChannels",
    "groupsOfDistributionChannels",
    "fulfilmentMethods",
    "typesOfTravelDocuments",
    "salesOfferPackages",
    "salesOfferPackageElements",
    "salesOfferPackageSubstitutions",
    "groupsOfSalesOfferPackages",
    "distributionAssignments",
    "parkingTariffs"
})
@XmlSeeAlso({
    FareFrame.class
})
public class FareFrameVersionFrameStructure
    extends CommonVersionFrameStructure
{

    @XmlElement(name = "Mode")
    @XmlSchemaType(name = "NMTOKEN")
    protected AllPublicTransportModesEnumeration mode;
    @XmlElementRef(name = "TransportOrganisationRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TransportOrganisationRefStructure> transportOrganisationRef;
    @XmlElement(name = "PricingParameterSet")
    protected PricingParameterSet pricingParameterSet;
    protected NoticesInFrameRelStructure notices;
    protected NoticeAssignmentsInFrameRelStructure noticeAssignments;
    protected BorderPointsInFrameRelStructure borderPoints;
    protected FareScheduledStopPointsInFrameRelStructure fareScheduledStopPoints;
    protected FareZonesInFrameRelStructure fareZones;
    protected FareSectionsInFrameRelStructure fareSections;
    protected FareSeriesInFrameRelStructure seriesConstraints;
    protected GeographicalUnitsRelStructure geographicalUnits;
    protected GeographicalIntervalsRelStructure geographicalIntervals;
    protected GeographicalStructureFactorsRelStructure geographicalStructureFactors;
    protected TimeUnitsRelStructure timeUnits;
    protected TimeIntervalsRelStructure timeIntervals;
    protected TimeStructureFactorsRelStructure timeStructureFactors;
    protected QualityStructureFactorsRelStructure qualityStructureFactors;
    protected DistanceMatrixElementsRelStructure distanceMatrixElements;
    protected GroupsOfDistanceMatrixElementsRelStructure groupsOfDistanceMatrixElements;
    protected FareStructureElementsInFrameRelStructure fareStructureElements;
    protected TariffsInFrameRelStructure tariffs;
    protected ValidableElementsInFrameRelStructure validableElements;
    protected ControllableElementsInFrameRelStructure controllableElements;
    protected UsageParametersInFrameRelStructure usageParameters;
    protected AccessRightParameterAssignmentsInFrameRelStructure accessRightParameterAssignments;
    protected FareProductsInFrameRelStructure fareProducts;
    protected FarePricesInFrameRelStructure priceGroups;
    protected FareTablesInFrameRelStructure fareTables;
    protected DistributionChannelsInFrameRelStructure distributionChannels;
    protected GroupsOfDistributionChannelsInFrameRelStructure groupsOfDistributionChannels;
    protected FulfilmentMethodsInFrameRelStructure fulfilmentMethods;
    protected TypesOfTravelDocumentInFrameRelStructure typesOfTravelDocuments;
    protected SalesOfferPackagesInFrameRelStructure salesOfferPackages;
    protected SalesOfferPackageElementsInFrameRelStructure salesOfferPackageElements;
    protected SalesOfferPackageSubstitutionsInFrameRelStructure salesOfferPackageSubstitutions;
    protected GroupsOfSalesOfferPackagesInFrameRelStructure groupsOfSalesOfferPackages;
    protected DistributionAssignmentsInFrameRelStructure distributionAssignments;
    protected FareFrameVersionFrameStructure.ParkingTariffs parkingTariffs;

    /**
     * Ruft den Wert der mode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public AllPublicTransportModesEnumeration getMode() {
        return mode;
    }

    /**
     * Legt den Wert der mode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public void setMode(AllPublicTransportModesEnumeration value) {
        this.mode = value;
    }

    /**
     * Ruft den Wert der transportOrganisationRef-Eigenschaft ab.
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
     * Ruft den Wert der pricingParameterSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PricingParameterSet }
     *     
     */
    public PricingParameterSet getPricingParameterSet() {
        return pricingParameterSet;
    }

    /**
     * Legt den Wert der pricingParameterSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingParameterSet }
     *     
     */
    public void setPricingParameterSet(PricingParameterSet value) {
        this.pricingParameterSet = value;
    }

    /**
     * Ruft den Wert der notices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NoticesInFrameRelStructure }
     *     
     */
    public NoticesInFrameRelStructure getNotices() {
        return notices;
    }

    /**
     * Legt den Wert der notices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticesInFrameRelStructure }
     *     
     */
    public void setNotices(NoticesInFrameRelStructure value) {
        this.notices = value;
    }

    /**
     * Ruft den Wert der noticeAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NoticeAssignmentsInFrameRelStructure }
     *     
     */
    public NoticeAssignmentsInFrameRelStructure getNoticeAssignments() {
        return noticeAssignments;
    }

    /**
     * Legt den Wert der noticeAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeAssignmentsInFrameRelStructure }
     *     
     */
    public void setNoticeAssignments(NoticeAssignmentsInFrameRelStructure value) {
        this.noticeAssignments = value;
    }

    /**
     * Ruft den Wert der borderPoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BorderPointsInFrameRelStructure }
     *     
     */
    public BorderPointsInFrameRelStructure getBorderPoints() {
        return borderPoints;
    }

    /**
     * Legt den Wert der borderPoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BorderPointsInFrameRelStructure }
     *     
     */
    public void setBorderPoints(BorderPointsInFrameRelStructure value) {
        this.borderPoints = value;
    }

    /**
     * Ruft den Wert der fareScheduledStopPoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareScheduledStopPointsInFrameRelStructure }
     *     
     */
    public FareScheduledStopPointsInFrameRelStructure getFareScheduledStopPoints() {
        return fareScheduledStopPoints;
    }

    /**
     * Legt den Wert der fareScheduledStopPoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareScheduledStopPointsInFrameRelStructure }
     *     
     */
    public void setFareScheduledStopPoints(FareScheduledStopPointsInFrameRelStructure value) {
        this.fareScheduledStopPoints = value;
    }

    /**
     * Ruft den Wert der fareZones-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareZonesInFrameRelStructure }
     *     
     */
    public FareZonesInFrameRelStructure getFareZones() {
        return fareZones;
    }

    /**
     * Legt den Wert der fareZones-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareZonesInFrameRelStructure }
     *     
     */
    public void setFareZones(FareZonesInFrameRelStructure value) {
        this.fareZones = value;
    }

    /**
     * Ruft den Wert der fareSections-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareSectionsInFrameRelStructure }
     *     
     */
    public FareSectionsInFrameRelStructure getFareSections() {
        return fareSections;
    }

    /**
     * Legt den Wert der fareSections-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareSectionsInFrameRelStructure }
     *     
     */
    public void setFareSections(FareSectionsInFrameRelStructure value) {
        this.fareSections = value;
    }

    /**
     * Ruft den Wert der seriesConstraints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareSeriesInFrameRelStructure }
     *     
     */
    public FareSeriesInFrameRelStructure getSeriesConstraints() {
        return seriesConstraints;
    }

    /**
     * Legt den Wert der seriesConstraints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareSeriesInFrameRelStructure }
     *     
     */
    public void setSeriesConstraints(FareSeriesInFrameRelStructure value) {
        this.seriesConstraints = value;
    }

    /**
     * Ruft den Wert der geographicalUnits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeographicalUnitsRelStructure }
     *     
     */
    public GeographicalUnitsRelStructure getGeographicalUnits() {
        return geographicalUnits;
    }

    /**
     * Legt den Wert der geographicalUnits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicalUnitsRelStructure }
     *     
     */
    public void setGeographicalUnits(GeographicalUnitsRelStructure value) {
        this.geographicalUnits = value;
    }

    /**
     * Ruft den Wert der geographicalIntervals-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeographicalIntervalsRelStructure }
     *     
     */
    public GeographicalIntervalsRelStructure getGeographicalIntervals() {
        return geographicalIntervals;
    }

    /**
     * Legt den Wert der geographicalIntervals-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicalIntervalsRelStructure }
     *     
     */
    public void setGeographicalIntervals(GeographicalIntervalsRelStructure value) {
        this.geographicalIntervals = value;
    }

    /**
     * Ruft den Wert der geographicalStructureFactors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeographicalStructureFactorsRelStructure }
     *     
     */
    public GeographicalStructureFactorsRelStructure getGeographicalStructureFactors() {
        return geographicalStructureFactors;
    }

    /**
     * Legt den Wert der geographicalStructureFactors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicalStructureFactorsRelStructure }
     *     
     */
    public void setGeographicalStructureFactors(GeographicalStructureFactorsRelStructure value) {
        this.geographicalStructureFactors = value;
    }

    /**
     * Ruft den Wert der timeUnits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnitsRelStructure }
     *     
     */
    public TimeUnitsRelStructure getTimeUnits() {
        return timeUnits;
    }

    /**
     * Legt den Wert der timeUnits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnitsRelStructure }
     *     
     */
    public void setTimeUnits(TimeUnitsRelStructure value) {
        this.timeUnits = value;
    }

    /**
     * Ruft den Wert der timeIntervals-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalsRelStructure }
     *     
     */
    public TimeIntervalsRelStructure getTimeIntervals() {
        return timeIntervals;
    }

    /**
     * Legt den Wert der timeIntervals-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalsRelStructure }
     *     
     */
    public void setTimeIntervals(TimeIntervalsRelStructure value) {
        this.timeIntervals = value;
    }

    /**
     * Ruft den Wert der timeStructureFactors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeStructureFactorsRelStructure }
     *     
     */
    public TimeStructureFactorsRelStructure getTimeStructureFactors() {
        return timeStructureFactors;
    }

    /**
     * Legt den Wert der timeStructureFactors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeStructureFactorsRelStructure }
     *     
     */
    public void setTimeStructureFactors(TimeStructureFactorsRelStructure value) {
        this.timeStructureFactors = value;
    }

    /**
     * Ruft den Wert der qualityStructureFactors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QualityStructureFactorsRelStructure }
     *     
     */
    public QualityStructureFactorsRelStructure getQualityStructureFactors() {
        return qualityStructureFactors;
    }

    /**
     * Legt den Wert der qualityStructureFactors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityStructureFactorsRelStructure }
     *     
     */
    public void setQualityStructureFactors(QualityStructureFactorsRelStructure value) {
        this.qualityStructureFactors = value;
    }

    /**
     * Ruft den Wert der distanceMatrixElements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistanceMatrixElementsRelStructure }
     *     
     */
    public DistanceMatrixElementsRelStructure getDistanceMatrixElements() {
        return distanceMatrixElements;
    }

    /**
     * Legt den Wert der distanceMatrixElements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceMatrixElementsRelStructure }
     *     
     */
    public void setDistanceMatrixElements(DistanceMatrixElementsRelStructure value) {
        this.distanceMatrixElements = value;
    }

    /**
     * Ruft den Wert der groupsOfDistanceMatrixElements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupsOfDistanceMatrixElementsRelStructure }
     *     
     */
    public GroupsOfDistanceMatrixElementsRelStructure getGroupsOfDistanceMatrixElements() {
        return groupsOfDistanceMatrixElements;
    }

    /**
     * Legt den Wert der groupsOfDistanceMatrixElements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupsOfDistanceMatrixElementsRelStructure }
     *     
     */
    public void setGroupsOfDistanceMatrixElements(GroupsOfDistanceMatrixElementsRelStructure value) {
        this.groupsOfDistanceMatrixElements = value;
    }

    /**
     * Ruft den Wert der fareStructureElements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareStructureElementsInFrameRelStructure }
     *     
     */
    public FareStructureElementsInFrameRelStructure getFareStructureElements() {
        return fareStructureElements;
    }

    /**
     * Legt den Wert der fareStructureElements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareStructureElementsInFrameRelStructure }
     *     
     */
    public void setFareStructureElements(FareStructureElementsInFrameRelStructure value) {
        this.fareStructureElements = value;
    }

    /**
     * Ruft den Wert der tariffs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TariffsInFrameRelStructure }
     *     
     */
    public TariffsInFrameRelStructure getTariffs() {
        return tariffs;
    }

    /**
     * Legt den Wert der tariffs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffsInFrameRelStructure }
     *     
     */
    public void setTariffs(TariffsInFrameRelStructure value) {
        this.tariffs = value;
    }

    /**
     * Ruft den Wert der validableElements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidableElementsInFrameRelStructure }
     *     
     */
    public ValidableElementsInFrameRelStructure getValidableElements() {
        return validableElements;
    }

    /**
     * Legt den Wert der validableElements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidableElementsInFrameRelStructure }
     *     
     */
    public void setValidableElements(ValidableElementsInFrameRelStructure value) {
        this.validableElements = value;
    }

    /**
     * Ruft den Wert der controllableElements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ControllableElementsInFrameRelStructure }
     *     
     */
    public ControllableElementsInFrameRelStructure getControllableElements() {
        return controllableElements;
    }

    /**
     * Legt den Wert der controllableElements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ControllableElementsInFrameRelStructure }
     *     
     */
    public void setControllableElements(ControllableElementsInFrameRelStructure value) {
        this.controllableElements = value;
    }

    /**
     * Ruft den Wert der usageParameters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UsageParametersInFrameRelStructure }
     *     
     */
    public UsageParametersInFrameRelStructure getUsageParameters() {
        return usageParameters;
    }

    /**
     * Legt den Wert der usageParameters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageParametersInFrameRelStructure }
     *     
     */
    public void setUsageParameters(UsageParametersInFrameRelStructure value) {
        this.usageParameters = value;
    }

    /**
     * Ruft den Wert der accessRightParameterAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessRightParameterAssignmentsInFrameRelStructure }
     *     
     */
    public AccessRightParameterAssignmentsInFrameRelStructure getAccessRightParameterAssignments() {
        return accessRightParameterAssignments;
    }

    /**
     * Legt den Wert der accessRightParameterAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessRightParameterAssignmentsInFrameRelStructure }
     *     
     */
    public void setAccessRightParameterAssignments(AccessRightParameterAssignmentsInFrameRelStructure value) {
        this.accessRightParameterAssignments = value;
    }

    /**
     * Ruft den Wert der fareProducts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareProductsInFrameRelStructure }
     *     
     */
    public FareProductsInFrameRelStructure getFareProducts() {
        return fareProducts;
    }

    /**
     * Legt den Wert der fareProducts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareProductsInFrameRelStructure }
     *     
     */
    public void setFareProducts(FareProductsInFrameRelStructure value) {
        this.fareProducts = value;
    }

    /**
     * Ruft den Wert der priceGroups-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FarePricesInFrameRelStructure }
     *     
     */
    public FarePricesInFrameRelStructure getPriceGroups() {
        return priceGroups;
    }

    /**
     * Legt den Wert der priceGroups-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePricesInFrameRelStructure }
     *     
     */
    public void setPriceGroups(FarePricesInFrameRelStructure value) {
        this.priceGroups = value;
    }

    /**
     * Ruft den Wert der fareTables-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareTablesInFrameRelStructure }
     *     
     */
    public FareTablesInFrameRelStructure getFareTables() {
        return fareTables;
    }

    /**
     * Legt den Wert der fareTables-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTablesInFrameRelStructure }
     *     
     */
    public void setFareTables(FareTablesInFrameRelStructure value) {
        this.fareTables = value;
    }

    /**
     * Ruft den Wert der distributionChannels-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistributionChannelsInFrameRelStructure }
     *     
     */
    public DistributionChannelsInFrameRelStructure getDistributionChannels() {
        return distributionChannels;
    }

    /**
     * Legt den Wert der distributionChannels-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionChannelsInFrameRelStructure }
     *     
     */
    public void setDistributionChannels(DistributionChannelsInFrameRelStructure value) {
        this.distributionChannels = value;
    }

    /**
     * Ruft den Wert der groupsOfDistributionChannels-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupsOfDistributionChannelsInFrameRelStructure }
     *     
     */
    public GroupsOfDistributionChannelsInFrameRelStructure getGroupsOfDistributionChannels() {
        return groupsOfDistributionChannels;
    }

    /**
     * Legt den Wert der groupsOfDistributionChannels-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupsOfDistributionChannelsInFrameRelStructure }
     *     
     */
    public void setGroupsOfDistributionChannels(GroupsOfDistributionChannelsInFrameRelStructure value) {
        this.groupsOfDistributionChannels = value;
    }

    /**
     * Ruft den Wert der fulfilmentMethods-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FulfilmentMethodsInFrameRelStructure }
     *     
     */
    public FulfilmentMethodsInFrameRelStructure getFulfilmentMethods() {
        return fulfilmentMethods;
    }

    /**
     * Legt den Wert der fulfilmentMethods-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfilmentMethodsInFrameRelStructure }
     *     
     */
    public void setFulfilmentMethods(FulfilmentMethodsInFrameRelStructure value) {
        this.fulfilmentMethods = value;
    }

    /**
     * Ruft den Wert der typesOfTravelDocuments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypesOfTravelDocumentInFrameRelStructure }
     *     
     */
    public TypesOfTravelDocumentInFrameRelStructure getTypesOfTravelDocuments() {
        return typesOfTravelDocuments;
    }

    /**
     * Legt den Wert der typesOfTravelDocuments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypesOfTravelDocumentInFrameRelStructure }
     *     
     */
    public void setTypesOfTravelDocuments(TypesOfTravelDocumentInFrameRelStructure value) {
        this.typesOfTravelDocuments = value;
    }

    /**
     * Ruft den Wert der salesOfferPackages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SalesOfferPackagesInFrameRelStructure }
     *     
     */
    public SalesOfferPackagesInFrameRelStructure getSalesOfferPackages() {
        return salesOfferPackages;
    }

    /**
     * Legt den Wert der salesOfferPackages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOfferPackagesInFrameRelStructure }
     *     
     */
    public void setSalesOfferPackages(SalesOfferPackagesInFrameRelStructure value) {
        this.salesOfferPackages = value;
    }

    /**
     * Ruft den Wert der salesOfferPackageElements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SalesOfferPackageElementsInFrameRelStructure }
     *     
     */
    public SalesOfferPackageElementsInFrameRelStructure getSalesOfferPackageElements() {
        return salesOfferPackageElements;
    }

    /**
     * Legt den Wert der salesOfferPackageElements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOfferPackageElementsInFrameRelStructure }
     *     
     */
    public void setSalesOfferPackageElements(SalesOfferPackageElementsInFrameRelStructure value) {
        this.salesOfferPackageElements = value;
    }

    /**
     * Ruft den Wert der salesOfferPackageSubstitutions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SalesOfferPackageSubstitutionsInFrameRelStructure }
     *     
     */
    public SalesOfferPackageSubstitutionsInFrameRelStructure getSalesOfferPackageSubstitutions() {
        return salesOfferPackageSubstitutions;
    }

    /**
     * Legt den Wert der salesOfferPackageSubstitutions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOfferPackageSubstitutionsInFrameRelStructure }
     *     
     */
    public void setSalesOfferPackageSubstitutions(SalesOfferPackageSubstitutionsInFrameRelStructure value) {
        this.salesOfferPackageSubstitutions = value;
    }

    /**
     * Ruft den Wert der groupsOfSalesOfferPackages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupsOfSalesOfferPackagesInFrameRelStructure }
     *     
     */
    public GroupsOfSalesOfferPackagesInFrameRelStructure getGroupsOfSalesOfferPackages() {
        return groupsOfSalesOfferPackages;
    }

    /**
     * Legt den Wert der groupsOfSalesOfferPackages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupsOfSalesOfferPackagesInFrameRelStructure }
     *     
     */
    public void setGroupsOfSalesOfferPackages(GroupsOfSalesOfferPackagesInFrameRelStructure value) {
        this.groupsOfSalesOfferPackages = value;
    }

    /**
     * Ruft den Wert der distributionAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistributionAssignmentsInFrameRelStructure }
     *     
     */
    public DistributionAssignmentsInFrameRelStructure getDistributionAssignments() {
        return distributionAssignments;
    }

    /**
     * Legt den Wert der distributionAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionAssignmentsInFrameRelStructure }
     *     
     */
    public void setDistributionAssignments(DistributionAssignmentsInFrameRelStructure value) {
        this.distributionAssignments = value;
    }

    /**
     * Ruft den Wert der parkingTariffs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareFrameVersionFrameStructure.ParkingTariffs }
     *     
     */
    public FareFrameVersionFrameStructure.ParkingTariffs getParkingTariffs() {
        return parkingTariffs;
    }

    /**
     * Legt den Wert der parkingTariffs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareFrameVersionFrameStructure.ParkingTariffs }
     *     
     */
    public void setParkingTariffs(FareFrameVersionFrameStructure.ParkingTariffs value) {
        this.parkingTariffs = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.netex.org.uk/netex}parkingTariffsInFrame_RelStructure">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ParkingTariffs
        extends ParkingTariffsInFrameRelStructure
    {


    }

}
