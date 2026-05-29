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
 * Type for VEHICLE POOLING PLACE ASSIGNMENT restricts id.
 * 
 * <p>Java-Klasse f�r VehiclePoolingPlaceAssignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehiclePoolingPlaceAssignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VehicleServicePlaceAssignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehiclePoolingPlaceAssignmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehiclePoolingPlaceAssignment_VersionStructure", propOrder = {
    "vehiclePoolingServiceRef",
    "vehiclePoolingMeetingPlaceRef",
    "vehiclePoolingParkingAreaRef",
    "parkingBayRef"
})
@XmlSeeAlso({
    VehiclePoolingPlaceAssignment.class
})
public class VehiclePoolingPlaceAssignmentVersionStructure
    extends VehicleServicePlaceAssignmentVersionStructure
{

    @XmlElementRef(name = "VehiclePoolingServiceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected JAXBElement<? extends VehiclePoolingServiceRefStructure> vehiclePoolingServiceRef;
    @XmlElement(name = "VehiclePoolingMeetingPlaceRef")
    protected VehiclePoolingMeetingPlaceRefStructure vehiclePoolingMeetingPlaceRef;
    @XmlElement(name = "VehiclePoolingParkingAreaRef")
    protected VehiclePoolingParkingAreaRefStructure vehiclePoolingParkingAreaRef;
    @XmlElementRef(name = "ParkingBayRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ParkingBayRefStructure> parkingBayRef;

    /**
     * Ruft den Wert der vehiclePoolingServiceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CarPoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChauffeuredVehicleServiceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends VehiclePoolingServiceRefStructure> getVehiclePoolingServiceRef() {
        return vehiclePoolingServiceRef;
    }

    /**
     * Legt den Wert der vehiclePoolingServiceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CarPoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChauffeuredVehicleServiceRefStructure }{@code >}
     *     
     */
    public void setVehiclePoolingServiceRef(JAXBElement<? extends VehiclePoolingServiceRefStructure> value) {
        this.vehiclePoolingServiceRef = value;
    }

    /**
     * Ruft den Wert der vehiclePoolingMeetingPlaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehiclePoolingMeetingPlaceRefStructure }
     *     
     */
    public VehiclePoolingMeetingPlaceRefStructure getVehiclePoolingMeetingPlaceRef() {
        return vehiclePoolingMeetingPlaceRef;
    }

    /**
     * Legt den Wert der vehiclePoolingMeetingPlaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclePoolingMeetingPlaceRefStructure }
     *     
     */
    public void setVehiclePoolingMeetingPlaceRef(VehiclePoolingMeetingPlaceRefStructure value) {
        this.vehiclePoolingMeetingPlaceRef = value;
    }

    /**
     * Ruft den Wert der vehiclePoolingParkingAreaRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehiclePoolingParkingAreaRefStructure }
     *     
     */
    public VehiclePoolingParkingAreaRefStructure getVehiclePoolingParkingAreaRef() {
        return vehiclePoolingParkingAreaRef;
    }

    /**
     * Legt den Wert der vehiclePoolingParkingAreaRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclePoolingParkingAreaRefStructure }
     *     
     */
    public void setVehiclePoolingParkingAreaRef(VehiclePoolingParkingAreaRefStructure value) {
        this.vehiclePoolingParkingAreaRef = value;
    }

    /**
     * Ruft den Wert der parkingBayRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonitoredVehicleSharingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingBayRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ParkingBayRefStructure> getParkingBayRef() {
        return parkingBayRef;
    }

    /**
     * Legt den Wert der parkingBayRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonitoredVehicleSharingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingBayRefStructure }{@code >}
     *     
     */
    public void setParkingBayRef(JAXBElement<? extends ParkingBayRefStructure> value) {
        this.parkingBayRef = value;
    }

}
