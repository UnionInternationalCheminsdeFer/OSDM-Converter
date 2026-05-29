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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a Version of a STOP PLACE.
 * 
 * <p>Java-Klasse f�r StopPlace_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StopPlace_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Site_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}StopPlaceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopPlace_VersionStructure", propOrder = {
    "publicCode",
    "transportMode",
    "airSubmode",
    "busSubmode",
    "coachSubmode",
    "funicularSubmode",
    "metroSubmode",
    "tramSubmode",
    "telecabinSubmode",
    "railSubmode",
    "waterSubmode",
    "snowAndIceSubmode",
    "modeOfOperationRef",
    "otherTransportModes",
    "tariffZones",
    "stopPlaceType",
    "borderCrossing",
    "unlocalisedEquipments",
    "servedPlaces",
    "mainTerminusForPlaces",
    "limitedUse",
    "weighting",
    "stopPlaceWeight",
    "quays",
    "accessSpaces",
    "pathLinks",
    "pathJunctions",
    "accesses",
    "navigationPaths",
    "vehicleStoppingPlaces"
})
@XmlSeeAlso({
    StopPlace.class,
    TaxiRankVersionStructure.class
})
public class StopPlaceVersionStructure
    extends SiteVersionStructure
{

    @XmlElement(name = "PublicCode")
    protected PublicCodeStructure publicCode;
    @XmlElement(name = "TransportMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected AllPublicTransportModesEnumeration transportMode;
    @XmlElement(name = "AirSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected AirSubmodeEnumeration airSubmode;
    @XmlElement(name = "BusSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected BusSubmodeEnumeration busSubmode;
    @XmlElement(name = "CoachSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected CoachSubmodeEnumeration coachSubmode;
    @XmlElement(name = "FunicularSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected FunicularSubmodeEnumeration funicularSubmode;
    @XmlElement(name = "MetroSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected MetroSubmodeEnumeration metroSubmode;
    @XmlElement(name = "TramSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected TramSubmodeEnumeration tramSubmode;
    @XmlElement(name = "TelecabinSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected TelecabinSubmodeEnumeration telecabinSubmode;
    @XmlElement(name = "RailSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected RailSubmodeEnumeration railSubmode;
    @XmlElement(name = "WaterSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected WaterSubmodeEnumeration waterSubmode;
    @XmlElement(name = "SnowAndIceSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected SnowAndIceSubmodeEnumeration snowAndIceSubmode;
    @XmlElementRef(name = "ModeOfOperationRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ModeOfOperationRefStructure> modeOfOperationRef;
    @XmlList
    @XmlElement(name = "OtherTransportModes")
    protected List<AllPublicTransportModesEnumeration> otherTransportModes;
    protected TariffZoneRefsRelStructure tariffZones;
    @XmlElement(name = "StopPlaceType")
    @XmlSchemaType(name = "string")
    protected StopTypeEnumeration stopPlaceType;
    @XmlElement(name = "BorderCrossing", defaultValue = "false")
    protected Boolean borderCrossing;
    protected ExplicitEquipmentsRelStructure unlocalisedEquipments;
    protected TopographicPlaceRefsRelStructure servedPlaces;
    protected TopographicPlaceRefsRelStructure mainTerminusForPlaces;
    @XmlElement(name = "LimitedUse")
    @XmlSchemaType(name = "string")
    protected LimitedUseTypeEnumeration limitedUse;
    @XmlElement(name = "Weighting")
    @XmlSchemaType(name = "string")
    protected InterchangeWeightingEnumeration weighting;
    @XmlElement(name = "StopPlaceWeight")
    @XmlSchemaType(name = "string")
    protected StopPlaceWeightEnumeration stopPlaceWeight;
    protected QuaysRelStructure quays;
    protected AccessSpacesRelStructure accessSpaces;
    protected SitePathLinksRelStructure pathLinks;
    protected SitePathJunctionsRelStructure pathJunctions;
    protected AccessesRelStructure accesses;
    protected NavigationPathsRelStructure navigationPaths;
    protected VehicleStoppingPlacesRelStructure vehicleStoppingPlaces;

    /**
     * Ruft den Wert der publicCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublicCodeStructure }
     *     
     */
    public PublicCodeStructure getPublicCode() {
        return publicCode;
    }

    /**
     * Legt den Wert der publicCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicCodeStructure }
     *     
     */
    public void setPublicCode(PublicCodeStructure value) {
        this.publicCode = value;
    }

    /**
     * Ruft den Wert der transportMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public AllPublicTransportModesEnumeration getTransportMode() {
        return transportMode;
    }

    /**
     * Legt den Wert der transportMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public void setTransportMode(AllPublicTransportModesEnumeration value) {
        this.transportMode = value;
    }

    /**
     * Ruft den Wert der airSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AirSubmodeEnumeration }
     *     
     */
    public AirSubmodeEnumeration getAirSubmode() {
        return airSubmode;
    }

    /**
     * Legt den Wert der airSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSubmodeEnumeration }
     *     
     */
    public void setAirSubmode(AirSubmodeEnumeration value) {
        this.airSubmode = value;
    }

    /**
     * Ruft den Wert der busSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BusSubmodeEnumeration }
     *     
     */
    public BusSubmodeEnumeration getBusSubmode() {
        return busSubmode;
    }

    /**
     * Legt den Wert der busSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BusSubmodeEnumeration }
     *     
     */
    public void setBusSubmode(BusSubmodeEnumeration value) {
        this.busSubmode = value;
    }

    /**
     * Ruft den Wert der coachSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CoachSubmodeEnumeration }
     *     
     */
    public CoachSubmodeEnumeration getCoachSubmode() {
        return coachSubmode;
    }

    /**
     * Legt den Wert der coachSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CoachSubmodeEnumeration }
     *     
     */
    public void setCoachSubmode(CoachSubmodeEnumeration value) {
        this.coachSubmode = value;
    }

    /**
     * Ruft den Wert der funicularSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FunicularSubmodeEnumeration }
     *     
     */
    public FunicularSubmodeEnumeration getFunicularSubmode() {
        return funicularSubmode;
    }

    /**
     * Legt den Wert der funicularSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FunicularSubmodeEnumeration }
     *     
     */
    public void setFunicularSubmode(FunicularSubmodeEnumeration value) {
        this.funicularSubmode = value;
    }

    /**
     * Ruft den Wert der metroSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetroSubmodeEnumeration }
     *     
     */
    public MetroSubmodeEnumeration getMetroSubmode() {
        return metroSubmode;
    }

    /**
     * Legt den Wert der metroSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetroSubmodeEnumeration }
     *     
     */
    public void setMetroSubmode(MetroSubmodeEnumeration value) {
        this.metroSubmode = value;
    }

    /**
     * Ruft den Wert der tramSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TramSubmodeEnumeration }
     *     
     */
    public TramSubmodeEnumeration getTramSubmode() {
        return tramSubmode;
    }

    /**
     * Legt den Wert der tramSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TramSubmodeEnumeration }
     *     
     */
    public void setTramSubmode(TramSubmodeEnumeration value) {
        this.tramSubmode = value;
    }

    /**
     * Ruft den Wert der telecabinSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TelecabinSubmodeEnumeration }
     *     
     */
    public TelecabinSubmodeEnumeration getTelecabinSubmode() {
        return telecabinSubmode;
    }

    /**
     * Legt den Wert der telecabinSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecabinSubmodeEnumeration }
     *     
     */
    public void setTelecabinSubmode(TelecabinSubmodeEnumeration value) {
        this.telecabinSubmode = value;
    }

    /**
     * Ruft den Wert der railSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RailSubmodeEnumeration }
     *     
     */
    public RailSubmodeEnumeration getRailSubmode() {
        return railSubmode;
    }

    /**
     * Legt den Wert der railSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RailSubmodeEnumeration }
     *     
     */
    public void setRailSubmode(RailSubmodeEnumeration value) {
        this.railSubmode = value;
    }

    /**
     * Ruft den Wert der waterSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WaterSubmodeEnumeration }
     *     
     */
    public WaterSubmodeEnumeration getWaterSubmode() {
        return waterSubmode;
    }

    /**
     * Legt den Wert der waterSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterSubmodeEnumeration }
     *     
     */
    public void setWaterSubmode(WaterSubmodeEnumeration value) {
        this.waterSubmode = value;
    }

    /**
     * Extra: Snow and Ice Submode. +v1.1
     * 
     * @return
     *     possible object is
     *     {@link SnowAndIceSubmodeEnumeration }
     *     
     */
    public SnowAndIceSubmodeEnumeration getSnowAndIceSubmode() {
        return snowAndIceSubmode;
    }

    /**
     * Legt den Wert der snowAndIceSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SnowAndIceSubmodeEnumeration }
     *     
     */
    public void setSnowAndIceSubmode(SnowAndIceSubmodeEnumeration value) {
        this.snowAndIceSubmode = value;
    }

    /**
     * Ruft den Wert der modeOfOperationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlternativeModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConventionalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PersonalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledModeOfOperationRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ModeOfOperationRefStructure> getModeOfOperationRef() {
        return modeOfOperationRef;
    }

    /**
     * Legt den Wert der modeOfOperationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlternativeModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConventionalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PersonalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledModeOfOperationRefStructure }{@code >}
     *     
     */
    public void setModeOfOperationRef(JAXBElement<? extends ModeOfOperationRefStructure> value) {
        this.modeOfOperationRef = value;
    }

    /**
     * Gets the value of the otherTransportModes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherTransportModes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherTransportModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllPublicTransportModesEnumeration }
     * 
     * 
     */
    public List<AllPublicTransportModesEnumeration> getOtherTransportModes() {
        if (otherTransportModes == null) {
            otherTransportModes = new ArrayList<AllPublicTransportModesEnumeration>();
        }
        return this.otherTransportModes;
    }

    /**
     * Ruft den Wert der tariffZones-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TariffZoneRefsRelStructure }
     *     
     */
    public TariffZoneRefsRelStructure getTariffZones() {
        return tariffZones;
    }

    /**
     * Legt den Wert der tariffZones-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffZoneRefsRelStructure }
     *     
     */
    public void setTariffZones(TariffZoneRefsRelStructure value) {
        this.tariffZones = value;
    }

    /**
     * Ruft den Wert der stopPlaceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopTypeEnumeration }
     *     
     */
    public StopTypeEnumeration getStopPlaceType() {
        return stopPlaceType;
    }

    /**
     * Legt den Wert der stopPlaceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopTypeEnumeration }
     *     
     */
    public void setStopPlaceType(StopTypeEnumeration value) {
        this.stopPlaceType = value;
    }

    /**
     * Ruft den Wert der borderCrossing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBorderCrossing() {
        return borderCrossing;
    }

    /**
     * Legt den Wert der borderCrossing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBorderCrossing(Boolean value) {
        this.borderCrossing = value;
    }

    /**
     * Ruft den Wert der unlocalisedEquipments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExplicitEquipmentsRelStructure }
     *     
     */
    public ExplicitEquipmentsRelStructure getUnlocalisedEquipments() {
        return unlocalisedEquipments;
    }

    /**
     * Legt den Wert der unlocalisedEquipments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExplicitEquipmentsRelStructure }
     *     
     */
    public void setUnlocalisedEquipments(ExplicitEquipmentsRelStructure value) {
        this.unlocalisedEquipments = value;
    }

    /**
     * Ruft den Wert der servedPlaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceRefsRelStructure }
     *     
     */
    public TopographicPlaceRefsRelStructure getServedPlaces() {
        return servedPlaces;
    }

    /**
     * Legt den Wert der servedPlaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceRefsRelStructure }
     *     
     */
    public void setServedPlaces(TopographicPlaceRefsRelStructure value) {
        this.servedPlaces = value;
    }

    /**
     * Ruft den Wert der mainTerminusForPlaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceRefsRelStructure }
     *     
     */
    public TopographicPlaceRefsRelStructure getMainTerminusForPlaces() {
        return mainTerminusForPlaces;
    }

    /**
     * Legt den Wert der mainTerminusForPlaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceRefsRelStructure }
     *     
     */
    public void setMainTerminusForPlaces(TopographicPlaceRefsRelStructure value) {
        this.mainTerminusForPlaces = value;
    }

    /**
     * Ruft den Wert der limitedUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LimitedUseTypeEnumeration }
     *     
     */
    public LimitedUseTypeEnumeration getLimitedUse() {
        return limitedUse;
    }

    /**
     * Legt den Wert der limitedUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitedUseTypeEnumeration }
     *     
     */
    public void setLimitedUse(LimitedUseTypeEnumeration value) {
        this.limitedUse = value;
    }

    /**
     * Ruft den Wert der weighting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeWeightingEnumeration }
     *     
     */
    public InterchangeWeightingEnumeration getWeighting() {
        return weighting;
    }

    /**
     * Legt den Wert der weighting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeWeightingEnumeration }
     *     
     */
    public void setWeighting(InterchangeWeightingEnumeration value) {
        this.weighting = value;
    }

    /**
     * Ruft den Wert der stopPlaceWeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceWeightEnumeration }
     *     
     */
    public StopPlaceWeightEnumeration getStopPlaceWeight() {
        return stopPlaceWeight;
    }

    /**
     * Legt den Wert der stopPlaceWeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceWeightEnumeration }
     *     
     */
    public void setStopPlaceWeight(StopPlaceWeightEnumeration value) {
        this.stopPlaceWeight = value;
    }

    /**
     * Ruft den Wert der quays-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QuaysRelStructure }
     *     
     */
    public QuaysRelStructure getQuays() {
        return quays;
    }

    /**
     * Legt den Wert der quays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QuaysRelStructure }
     *     
     */
    public void setQuays(QuaysRelStructure value) {
        this.quays = value;
    }

    /**
     * Ruft den Wert der accessSpaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessSpacesRelStructure }
     *     
     */
    public AccessSpacesRelStructure getAccessSpaces() {
        return accessSpaces;
    }

    /**
     * Legt den Wert der accessSpaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessSpacesRelStructure }
     *     
     */
    public void setAccessSpaces(AccessSpacesRelStructure value) {
        this.accessSpaces = value;
    }

    /**
     * Ruft den Wert der pathLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SitePathLinksRelStructure }
     *     
     */
    public SitePathLinksRelStructure getPathLinks() {
        return pathLinks;
    }

    /**
     * Legt den Wert der pathLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SitePathLinksRelStructure }
     *     
     */
    public void setPathLinks(SitePathLinksRelStructure value) {
        this.pathLinks = value;
    }

    /**
     * Ruft den Wert der pathJunctions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SitePathJunctionsRelStructure }
     *     
     */
    public SitePathJunctionsRelStructure getPathJunctions() {
        return pathJunctions;
    }

    /**
     * Legt den Wert der pathJunctions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SitePathJunctionsRelStructure }
     *     
     */
    public void setPathJunctions(SitePathJunctionsRelStructure value) {
        this.pathJunctions = value;
    }

    /**
     * Ruft den Wert der accesses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessesRelStructure }
     *     
     */
    public AccessesRelStructure getAccesses() {
        return accesses;
    }

    /**
     * Legt den Wert der accesses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessesRelStructure }
     *     
     */
    public void setAccesses(AccessesRelStructure value) {
        this.accesses = value;
    }

    /**
     * Ruft den Wert der navigationPaths-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NavigationPathsRelStructure }
     *     
     */
    public NavigationPathsRelStructure getNavigationPaths() {
        return navigationPaths;
    }

    /**
     * Legt den Wert der navigationPaths-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NavigationPathsRelStructure }
     *     
     */
    public void setNavigationPaths(NavigationPathsRelStructure value) {
        this.navigationPaths = value;
    }

    /**
     * Ruft den Wert der vehicleStoppingPlaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleStoppingPlacesRelStructure }
     *     
     */
    public VehicleStoppingPlacesRelStructure getVehicleStoppingPlaces() {
        return vehicleStoppingPlaces;
    }

    /**
     * Legt den Wert der vehicleStoppingPlaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleStoppingPlacesRelStructure }
     *     
     */
    public void setVehicleStoppingPlaces(VehicleStoppingPlacesRelStructure value) {
        this.vehicleStoppingPlaces = value;
    }

}
