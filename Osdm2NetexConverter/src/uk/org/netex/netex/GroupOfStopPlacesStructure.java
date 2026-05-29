//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import net.opengis.gml._3.PolygonType;


/**
 * Type for GROUP of STOP PLACEs.
 * 
 * <p>Java-Klasse f�r GroupOfStopPlacesStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupOfStopPlacesStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfEntities_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}GroupOfStopPlacesGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfStopPlacesStructure", propOrder = {
    "publicCode",
    "members",
    "alternativeNames",
    "centroid",
    "polygon",
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
    "snowAndIceSubmode"
})
@XmlSeeAlso({
    GroupOfStopPlaces.class
})
public class GroupOfStopPlacesStructure
    extends GroupOfEntitiesVersionStructure
{

    @XmlElement(name = "PublicCode")
    protected PublicCodeStructure publicCode;
    protected StopPlaceRefsRelStructure members;
    protected AlternativeNamesRelStructure alternativeNames;
    @XmlElement(name = "Centroid")
    protected SimplePointVersionStructure centroid;
    @XmlElement(name = "Polygon", namespace = "http://www.opengis.net/gml/3.2")
    protected PolygonType polygon;
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
     * Ruft den Wert der members-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceRefsRelStructure }
     *     
     */
    public StopPlaceRefsRelStructure getMembers() {
        return members;
    }

    /**
     * Legt den Wert der members-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceRefsRelStructure }
     *     
     */
    public void setMembers(StopPlaceRefsRelStructure value) {
        this.members = value;
    }

    /**
     * Ruft den Wert der alternativeNames-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeNamesRelStructure }
     *     
     */
    public AlternativeNamesRelStructure getAlternativeNames() {
        return alternativeNames;
    }

    /**
     * Legt den Wert der alternativeNames-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeNamesRelStructure }
     *     
     */
    public void setAlternativeNames(AlternativeNamesRelStructure value) {
        this.alternativeNames = value;
    }

    /**
     * Ruft den Wert der centroid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SimplePointVersionStructure }
     *     
     */
    public SimplePointVersionStructure getCentroid() {
        return centroid;
    }

    /**
     * Legt den Wert der centroid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SimplePointVersionStructure }
     *     
     */
    public void setCentroid(SimplePointVersionStructure value) {
        this.centroid = value;
    }

    /**
     * Ruft den Wert der polygon-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PolygonType }
     *     
     */
    public PolygonType getPolygon() {
        return polygon;
    }

    /**
     * Legt den Wert der polygon-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PolygonType }
     *     
     */
    public void setPolygon(PolygonType value) {
        this.polygon = value;
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

}
