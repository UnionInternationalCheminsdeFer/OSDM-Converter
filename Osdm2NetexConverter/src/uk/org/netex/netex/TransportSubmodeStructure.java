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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for Transport Sub mode.
 * 
 * <p>Java-Klasse f�r TransportSubmodeStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TransportSubmodeStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.netex.org.uk/netex}AllSubmodeChoiceGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportSubmodeStructure", propOrder = {
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
    "taxiSubmode",
    "selfDriveSubmode"
})
public class TransportSubmodeStructure {

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
    @XmlElement(name = "TaxiSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected TaxiSubmodeEnumeration taxiSubmode;
    @XmlElement(name = "SelfDriveSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected SelfDriveSubmodeEnumeration selfDriveSubmode;

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
     * Ruft den Wert der taxiSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TaxiSubmodeEnumeration }
     *     
     */
    public TaxiSubmodeEnumeration getTaxiSubmode() {
        return taxiSubmode;
    }

    /**
     * Legt den Wert der taxiSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxiSubmodeEnumeration }
     *     
     */
    public void setTaxiSubmode(TaxiSubmodeEnumeration value) {
        this.taxiSubmode = value;
    }

    /**
     * Ruft den Wert der selfDriveSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SelfDriveSubmodeEnumeration }
     *     
     */
    public SelfDriveSubmodeEnumeration getSelfDriveSubmode() {
        return selfDriveSubmode;
    }

    /**
     * Legt den Wert der selfDriveSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SelfDriveSubmodeEnumeration }
     *     
     */
    public void setSelfDriveSubmode(SelfDriveSubmodeEnumeration value) {
        this.selfDriveSubmode = value;
    }

}
