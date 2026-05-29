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
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for RESERVING.
 * 
 * <p>Java-Klasse f�r Reserving_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Reserving_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}BookingPolicy_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ReservingGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reserving_VersionStructure", propOrder = {
    "reservingRequirements",
    "minimumNumberToReserve",
    "maximumNumberToReserve",
    "mustReserveWholeCompartment",
    "reservationChargeType",
    "feeBasis",
    "hasFreeConnectingReservations",
    "numberOfFreeConnectingReservations",
    "isFeeRefundable",
    "bookingArrangements",
    "seatAllocationMethod",
    "reservationExpiryPeriod"
})
@XmlSeeAlso({
    Reserving.class
})
public class ReservingVersionStructure
    extends BookingPolicyVersionStructure
{

    @XmlList
    @XmlElement(name = "ReservingRequirements")
    protected List<ReservationEnumeration> reservingRequirements;
    @XmlElement(name = "MinimumNumberToReserve")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minimumNumberToReserve;
    @XmlElement(name = "MaximumNumberToReserve")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumNumberToReserve;
    @XmlElement(name = "MustReserveWholeCompartment", defaultValue = "false")
    protected Boolean mustReserveWholeCompartment;
    @XmlElement(name = "ReservationChargeType")
    @XmlSchemaType(name = "normalizedString")
    protected ReservationChargeTypeEnumeration reservationChargeType;
    @XmlElement(name = "FeeBasis")
    @XmlSchemaType(name = "normalizedString")
    protected PerBasisEnumeration feeBasis;
    @XmlElement(name = "HasFreeConnectingReservations")
    protected Boolean hasFreeConnectingReservations;
    @XmlElement(name = "NumberOfFreeConnectingReservations")
    protected BigInteger numberOfFreeConnectingReservations;
    @XmlElement(name = "IsFeeRefundable", defaultValue = "false")
    protected Boolean isFeeRefundable;
    protected BookingArrangementsRelStructure bookingArrangements;
    @XmlElement(name = "SeatAllocationMethod")
    @XmlSchemaType(name = "normalizedString")
    protected SeatAllocationMethodEnumeration seatAllocationMethod;
    @XmlElement(name = "ReservationExpiryPeriod")
    protected Duration reservationExpiryPeriod;

    /**
     * Gets the value of the reservingRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservingRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservingRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservationEnumeration }
     * 
     * 
     */
    public List<ReservationEnumeration> getReservingRequirements() {
        if (reservingRequirements == null) {
            reservingRequirements = new ArrayList<ReservationEnumeration>();
        }
        return this.reservingRequirements;
    }

    /**
     * Ruft den Wert der minimumNumberToReserve-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumNumberToReserve() {
        return minimumNumberToReserve;
    }

    /**
     * Legt den Wert der minimumNumberToReserve-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumNumberToReserve(BigInteger value) {
        this.minimumNumberToReserve = value;
    }

    /**
     * Ruft den Wert der maximumNumberToReserve-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberToReserve() {
        return maximumNumberToReserve;
    }

    /**
     * Legt den Wert der maximumNumberToReserve-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberToReserve(BigInteger value) {
        this.maximumNumberToReserve = value;
    }

    /**
     * Ruft den Wert der mustReserveWholeCompartment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMustReserveWholeCompartment() {
        return mustReserveWholeCompartment;
    }

    /**
     * Legt den Wert der mustReserveWholeCompartment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMustReserveWholeCompartment(Boolean value) {
        this.mustReserveWholeCompartment = value;
    }

    /**
     * Ruft den Wert der reservationChargeType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReservationChargeTypeEnumeration }
     *     
     */
    public ReservationChargeTypeEnumeration getReservationChargeType() {
        return reservationChargeType;
    }

    /**
     * Legt den Wert der reservationChargeType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationChargeTypeEnumeration }
     *     
     */
    public void setReservationChargeType(ReservationChargeTypeEnumeration value) {
        this.reservationChargeType = value;
    }

    /**
     * Ruft den Wert der feeBasis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PerBasisEnumeration }
     *     
     */
    public PerBasisEnumeration getFeeBasis() {
        return feeBasis;
    }

    /**
     * Legt den Wert der feeBasis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PerBasisEnumeration }
     *     
     */
    public void setFeeBasis(PerBasisEnumeration value) {
        this.feeBasis = value;
    }

    /**
     * Ruft den Wert der hasFreeConnectingReservations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasFreeConnectingReservations() {
        return hasFreeConnectingReservations;
    }

    /**
     * Legt den Wert der hasFreeConnectingReservations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasFreeConnectingReservations(Boolean value) {
        this.hasFreeConnectingReservations = value;
    }

    /**
     * Ruft den Wert der numberOfFreeConnectingReservations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfFreeConnectingReservations() {
        return numberOfFreeConnectingReservations;
    }

    /**
     * Legt den Wert der numberOfFreeConnectingReservations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfFreeConnectingReservations(BigInteger value) {
        this.numberOfFreeConnectingReservations = value;
    }

    /**
     * Ruft den Wert der isFeeRefundable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFeeRefundable() {
        return isFeeRefundable;
    }

    /**
     * Legt den Wert der isFeeRefundable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFeeRefundable(Boolean value) {
        this.isFeeRefundable = value;
    }

    /**
     * Ruft den Wert der bookingArrangements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BookingArrangementsRelStructure }
     *     
     */
    public BookingArrangementsRelStructure getBookingArrangements() {
        return bookingArrangements;
    }

    /**
     * Legt den Wert der bookingArrangements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingArrangementsRelStructure }
     *     
     */
    public void setBookingArrangements(BookingArrangementsRelStructure value) {
        this.bookingArrangements = value;
    }

    /**
     * Ruft den Wert der seatAllocationMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SeatAllocationMethodEnumeration }
     *     
     */
    public SeatAllocationMethodEnumeration getSeatAllocationMethod() {
        return seatAllocationMethod;
    }

    /**
     * Legt den Wert der seatAllocationMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAllocationMethodEnumeration }
     *     
     */
    public void setSeatAllocationMethod(SeatAllocationMethodEnumeration value) {
        this.seatAllocationMethod = value;
    }

    /**
     * Ruft den Wert der reservationExpiryPeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getReservationExpiryPeriod() {
        return reservationExpiryPeriod;
    }

    /**
     * Legt den Wert der reservationExpiryPeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setReservationExpiryPeriod(Duration value) {
        this.reservationExpiryPeriod = value;
    }

}
