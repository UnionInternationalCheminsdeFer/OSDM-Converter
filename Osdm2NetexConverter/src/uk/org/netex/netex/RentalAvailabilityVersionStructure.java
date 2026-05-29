//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a RENTAL AVAILABILITY.
 * 
 * <p>Java-Klasse f�r RentalAvailability_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RentalAvailability_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}LogEntry_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}RentalAvailabilityGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RentalAvailability_VersionStructure", propOrder = {
    "parkingRef",
    "isOperational",
    "isRenting",
    "isAcceptingReturns",
    "availableVehicles",
    "disabledVehicles",
    "availableDocks",
    "disabledDocks"
})
@XmlSeeAlso({
    RentalAvailability.class
})
public class RentalAvailabilityVersionStructure
    extends LogEntryVersionStructure
{

    @XmlElementRef(name = "ParkingRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected JAXBElement<? extends ParkingRefStructure> parkingRef;
    @XmlElement(name = "IsOperational")
    protected Boolean isOperational;
    @XmlElement(name = "IsRenting")
    protected Boolean isRenting;
    @XmlElement(name = "IsAcceptingReturns")
    protected Boolean isAcceptingReturns;
    @XmlElement(name = "AvailableVehicles")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger availableVehicles;
    @XmlElement(name = "DisabledVehicles")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger disabledVehicles;
    @XmlElement(name = "AvailableDocks")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger availableDocks;
    @XmlElement(name = "DisabledDocks")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger disabledDocks;

    /**
     * Ruft den Wert der parkingRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RechargingStationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ParkingRefStructure> getParkingRef() {
        return parkingRef;
    }

    /**
     * Legt den Wert der parkingRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RechargingStationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingRefStructure }{@code >}
     *     
     */
    public void setParkingRef(JAXBElement<? extends ParkingRefStructure> value) {
        this.parkingRef = value;
    }

    /**
     * Ruft den Wert der isOperational-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOperational() {
        return isOperational;
    }

    /**
     * Legt den Wert der isOperational-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOperational(Boolean value) {
        this.isOperational = value;
    }

    /**
     * Ruft den Wert der isRenting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRenting() {
        return isRenting;
    }

    /**
     * Legt den Wert der isRenting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRenting(Boolean value) {
        this.isRenting = value;
    }

    /**
     * Ruft den Wert der isAcceptingReturns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAcceptingReturns() {
        return isAcceptingReturns;
    }

    /**
     * Legt den Wert der isAcceptingReturns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAcceptingReturns(Boolean value) {
        this.isAcceptingReturns = value;
    }

    /**
     * Ruft den Wert der availableVehicles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvailableVehicles() {
        return availableVehicles;
    }

    /**
     * Legt den Wert der availableVehicles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvailableVehicles(BigInteger value) {
        this.availableVehicles = value;
    }

    /**
     * Ruft den Wert der disabledVehicles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDisabledVehicles() {
        return disabledVehicles;
    }

    /**
     * Legt den Wert der disabledVehicles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDisabledVehicles(BigInteger value) {
        this.disabledVehicles = value;
    }

    /**
     * Ruft den Wert der availableDocks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvailableDocks() {
        return availableDocks;
    }

    /**
     * Legt den Wert der availableDocks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvailableDocks(BigInteger value) {
        this.availableDocks = value;
    }

    /**
     * Ruft den Wert der disabledDocks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDisabledDocks() {
        return disabledDocks;
    }

    /**
     * Legt den Wert der disabledDocks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDisabledDocks(BigInteger value) {
        this.disabledDocks = value;
    }

}
