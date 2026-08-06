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
 * Type for VEHICLE SHARING PLACE ASSIGNMENT restricts id.
 * 
 * <p>Java-Klasse f�r VehicleSharingPlaceAssignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleSharingPlaceAssignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VehicleServicePlaceAssignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehicleSharingPlaceAssignmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleSharingPlaceAssignment_VersionStructure", propOrder = {
    "commonVehicleServiceRef",
    "vehicleSharingParkingAreaRef",
    "parkingBayRef"
})
@XmlSeeAlso({
    VehicleSharingPlaceAssignment.class
})
public class VehicleSharingPlaceAssignmentVersionStructure
    extends VehicleServicePlaceAssignmentVersionStructure
{

    @XmlElementRef(name = "CommonVehicleServiceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected JAXBElement<? extends CommonVehicleServiceRefStructure> commonVehicleServiceRef;
    @XmlElement(name = "VehicleSharingParkingAreaRef", required = true)
    protected VehicleSharingParkingAreaRefStructure vehicleSharingParkingAreaRef;
    @XmlElementRef(name = "ParkingBayRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ParkingBayRefStructure> parkingBayRef;

    /**
     * Ruft den Wert der commonVehicleServiceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VehicleSharingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChauffeuredVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CarPoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiServiceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends CommonVehicleServiceRefStructure> getCommonVehicleServiceRef() {
        return commonVehicleServiceRef;
    }

    /**
     * Legt den Wert der commonVehicleServiceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VehicleSharingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChauffeuredVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CarPoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiServiceRefStructure }{@code >}
     *     
     */
    public void setCommonVehicleServiceRef(JAXBElement<? extends CommonVehicleServiceRefStructure> value) {
        this.commonVehicleServiceRef = value;
    }

    /**
     * Ruft den Wert der vehicleSharingParkingAreaRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSharingParkingAreaRefStructure }
     *     
     */
    public VehicleSharingParkingAreaRefStructure getVehicleSharingParkingAreaRef() {
        return vehicleSharingParkingAreaRef;
    }

    /**
     * Legt den Wert der vehicleSharingParkingAreaRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSharingParkingAreaRefStructure }
     *     
     */
    public void setVehicleSharingParkingAreaRef(VehicleSharingParkingAreaRefStructure value) {
        this.vehicleSharingParkingAreaRef = value;
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
