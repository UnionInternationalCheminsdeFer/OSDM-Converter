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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for CustomerPurchase PARAMETER ASSIGNMENT.
 * 
 * <p>Java-Klasse f�r CustomerPurchaseParameterAssignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CustomerPurchaseParameterAssignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}ValidityParameterAssignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CustomerPurchaseParameterAssignmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerPurchaseParameterAssignment_VersionStructure", propOrder = {
    "individualTravellerRef",
    "vehiclePoolingDriverInfoRef",
    "tripPatternRef",
    "tripRef",
    "legRef",
    "ridePartRef"
})
@XmlSeeAlso({
    CustomerPurchaseParameterAssignment.class
})
public class CustomerPurchaseParameterAssignmentVersionStructure
    extends ValidityParameterAssignmentVersionStructure
{

    @XmlElement(name = "IndividualTravellerRef")
    protected IndividualTravellerRefStructure individualTravellerRef;
    @XmlElement(name = "VehiclePoolingDriverInfoRef")
    protected VehiclePoolingDriverInfoRefStructure vehiclePoolingDriverInfoRef;
    @XmlElement(name = "TripPatternRef")
    protected TripPatternRefStructure tripPatternRef;
    @XmlElement(name = "TripRef")
    protected TripRefStructure tripRef;
    @XmlElementRef(name = "LegRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LegRefStructure> legRef;
    @XmlElement(name = "RidePartRef")
    protected RidePartRefStructure ridePartRef;

    /**
     * +v1.2.2
     * 
     * @return
     *     possible object is
     *     {@link IndividualTravellerRefStructure }
     *     
     */
    public IndividualTravellerRefStructure getIndividualTravellerRef() {
        return individualTravellerRef;
    }

    /**
     * Legt den Wert der individualTravellerRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualTravellerRefStructure }
     *     
     */
    public void setIndividualTravellerRef(IndividualTravellerRefStructure value) {
        this.individualTravellerRef = value;
    }

    /**
     * +v1.2.2
     * 
     * @return
     *     possible object is
     *     {@link VehiclePoolingDriverInfoRefStructure }
     *     
     */
    public VehiclePoolingDriverInfoRefStructure getVehiclePoolingDriverInfoRef() {
        return vehiclePoolingDriverInfoRef;
    }

    /**
     * Legt den Wert der vehiclePoolingDriverInfoRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclePoolingDriverInfoRefStructure }
     *     
     */
    public void setVehiclePoolingDriverInfoRef(VehiclePoolingDriverInfoRefStructure value) {
        this.vehiclePoolingDriverInfoRef = value;
    }

    /**
     * Ruft den Wert der tripPatternRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TripPatternRefStructure }
     *     
     */
    public TripPatternRefStructure getTripPatternRef() {
        return tripPatternRef;
    }

    /**
     * Legt den Wert der tripPatternRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TripPatternRefStructure }
     *     
     */
    public void setTripPatternRef(TripPatternRefStructure value) {
        this.tripPatternRef = value;
    }

    /**
     * Ruft den Wert der tripRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TripRefStructure }
     *     
     */
    public TripRefStructure getTripRef() {
        return tripRef;
    }

    /**
     * Legt den Wert der tripRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TripRefStructure }
     *     
     */
    public void setTripRef(TripRefStructure value) {
        this.tripRef = value;
    }

    /**
     * Ruft den Wert der legRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PtRideLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PtRideLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrivateLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlternativeModeLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransferLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RideLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PtConnectionLegRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends LegRefStructure> getLegRef() {
        return legRef;
    }

    /**
     * Legt den Wert der legRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PtRideLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PtRideLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrivateLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlternativeModeLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransferLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RideLegRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PtConnectionLegRefStructure }{@code >}
     *     
     */
    public void setLegRef(JAXBElement<? extends LegRefStructure> value) {
        this.legRef = value;
    }

    /**
     * Ruft den Wert der ridePartRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RidePartRefStructure }
     *     
     */
    public RidePartRefStructure getRidePartRef() {
        return ridePartRef;
    }

    /**
     * Legt den Wert der ridePartRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RidePartRefStructure }
     *     
     */
    public void setRidePartRef(RidePartRefStructure value) {
        this.ridePartRef = value;
    }

}
