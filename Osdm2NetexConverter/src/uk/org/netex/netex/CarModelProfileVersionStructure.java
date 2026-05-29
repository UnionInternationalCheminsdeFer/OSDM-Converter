//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a CAR MODEL PROFILE.
 * 
 * <p>Java-Klasse f�r CarModelProfile_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CarModelProfile_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VehicleModelProfile_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CarModelProfileGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarModelProfile_VersionStructure", propOrder = {
    "seats",
    "doors",
    "transmission",
    "cruiseControl",
    "satNav",
    "airConditioning",
    "convertible",
    "usbPowerSockets",
    "winterTyres",
    "chains",
    "trailerHitch",
    "roofRack",
    "cycleRack",
    "skiRack"
})
@XmlSeeAlso({
    CarModelProfile.class
})
public class CarModelProfileVersionStructure
    extends VehicleModelProfileVersionStructure
{

    @XmlElement(name = "Seats")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger seats;
    @XmlElement(name = "Doors")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger doors;
    @XmlElement(name = "Transmission")
    @XmlSchemaType(name = "normalizedString")
    protected TransmissionEnumeration transmission;
    @XmlElement(name = "CruiseControl")
    protected Boolean cruiseControl;
    @XmlElement(name = "SatNav")
    protected Boolean satNav;
    @XmlElement(name = "AirConditioning")
    protected Boolean airConditioning;
    @XmlElement(name = "Convertible")
    protected Boolean convertible;
    @XmlElement(name = "UsbPowerSockets")
    protected Boolean usbPowerSockets;
    @XmlElement(name = "WinterTyres", defaultValue = "false")
    protected Boolean winterTyres;
    @XmlElement(name = "Chains", defaultValue = "false")
    protected Boolean chains;
    @XmlElement(name = "TrailerHitch", defaultValue = "false")
    protected Boolean trailerHitch;
    @XmlElement(name = "RoofRack", defaultValue = "false")
    protected Boolean roofRack;
    @XmlElement(name = "CycleRack", defaultValue = "false")
    protected Boolean cycleRack;
    @XmlElement(name = "SkiRack", defaultValue = "false")
    protected Boolean skiRack;

    /**
     * Ruft den Wert der seats-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeats() {
        return seats;
    }

    /**
     * Legt den Wert der seats-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeats(BigInteger value) {
        this.seats = value;
    }

    /**
     * Ruft den Wert der doors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDoors() {
        return doors;
    }

    /**
     * Legt den Wert der doors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDoors(BigInteger value) {
        this.doors = value;
    }

    /**
     * Ruft den Wert der transmission-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransmissionEnumeration }
     *     
     */
    public TransmissionEnumeration getTransmission() {
        return transmission;
    }

    /**
     * Legt den Wert der transmission-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransmissionEnumeration }
     *     
     */
    public void setTransmission(TransmissionEnumeration value) {
        this.transmission = value;
    }

    /**
     * Ruft den Wert der cruiseControl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCruiseControl() {
        return cruiseControl;
    }

    /**
     * Legt den Wert der cruiseControl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCruiseControl(Boolean value) {
        this.cruiseControl = value;
    }

    /**
     * Ruft den Wert der satNav-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSatNav() {
        return satNav;
    }

    /**
     * Legt den Wert der satNav-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSatNav(Boolean value) {
        this.satNav = value;
    }

    /**
     * Ruft den Wert der airConditioning-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAirConditioning() {
        return airConditioning;
    }

    /**
     * Legt den Wert der airConditioning-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAirConditioning(Boolean value) {
        this.airConditioning = value;
    }

    /**
     * Ruft den Wert der convertible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConvertible() {
        return convertible;
    }

    /**
     * Legt den Wert der convertible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConvertible(Boolean value) {
        this.convertible = value;
    }

    /**
     * Ruft den Wert der usbPowerSockets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsbPowerSockets() {
        return usbPowerSockets;
    }

    /**
     * Legt den Wert der usbPowerSockets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsbPowerSockets(Boolean value) {
        this.usbPowerSockets = value;
    }

    /**
     * Ruft den Wert der winterTyres-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWinterTyres() {
        return winterTyres;
    }

    /**
     * Legt den Wert der winterTyres-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWinterTyres(Boolean value) {
        this.winterTyres = value;
    }

    /**
     * Ruft den Wert der chains-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChains() {
        return chains;
    }

    /**
     * Legt den Wert der chains-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChains(Boolean value) {
        this.chains = value;
    }

    /**
     * Ruft den Wert der trailerHitch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrailerHitch() {
        return trailerHitch;
    }

    /**
     * Legt den Wert der trailerHitch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrailerHitch(Boolean value) {
        this.trailerHitch = value;
    }

    /**
     * Ruft den Wert der roofRack-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoofRack() {
        return roofRack;
    }

    /**
     * Legt den Wert der roofRack-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoofRack(Boolean value) {
        this.roofRack = value;
    }

    /**
     * Ruft den Wert der cycleRack-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCycleRack() {
        return cycleRack;
    }

    /**
     * Legt den Wert der cycleRack-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCycleRack(Boolean value) {
        this.cycleRack = value;
    }

    /**
     * Ruft den Wert der skiRack-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkiRack() {
        return skiRack;
    }

    /**
     * Legt den Wert der skiRack-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkiRack(Boolean value) {
        this.skiRack = value;
    }

}
