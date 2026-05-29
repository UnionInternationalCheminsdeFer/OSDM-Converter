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
 * Type for POOL OF VEHICLEs restricts id.
 * 
 * <p>Java-Klasse f�r PoolOfVehicles_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PoolOfVehicles_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfEntities_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PoolOfVehiclesGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoolOfVehicles_VersionStructure", propOrder = {
    "mobilityServiceRef",
    "mobilityServiceConstraintZoneRef",
    "parkingRef",
    "parkingComponents",
    "mustReturnToSameBay",
    "vehicles"
})
@XmlSeeAlso({
    PoolOfVehicles.class
})
public class PoolOfVehiclesVersionStructure
    extends GroupOfEntitiesVersionStructure
{

    @XmlElementRef(name = "MobilityServiceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends MobilityServiceRefStructure> mobilityServiceRef;
    @XmlElement(name = "MobilityServiceConstraintZoneRef")
    protected MobilityServiceConstraintZoneRef mobilityServiceConstraintZoneRef;
    @XmlElementRef(name = "ParkingRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ParkingRefStructure> parkingRef;
    protected ParkingComponentRefsRelStructure parkingComponents;
    @XmlElement(name = "MustReturnToSameBay")
    protected Boolean mustReturnToSameBay;
    protected VehicleRefsRelStructure vehicles;

    /**
     * Ruft den Wert der mobilityServiceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MobilityServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChauffeuredVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CarPoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiServiceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends MobilityServiceRefStructure> getMobilityServiceRef() {
        return mobilityServiceRef;
    }

    /**
     * Legt den Wert der mobilityServiceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MobilityServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChauffeuredVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CarPoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiServiceRefStructure }{@code >}
     *     
     */
    public void setMobilityServiceRef(JAXBElement<? extends MobilityServiceRefStructure> value) {
        this.mobilityServiceRef = value;
    }

    /**
     * Ruft den Wert der mobilityServiceConstraintZoneRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MobilityServiceConstraintZoneRef }
     *     
     */
    public MobilityServiceConstraintZoneRef getMobilityServiceConstraintZoneRef() {
        return mobilityServiceConstraintZoneRef;
    }

    /**
     * Legt den Wert der mobilityServiceConstraintZoneRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityServiceConstraintZoneRef }
     *     
     */
    public void setMobilityServiceConstraintZoneRef(MobilityServiceConstraintZoneRef value) {
        this.mobilityServiceConstraintZoneRef = value;
    }

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
     * Ruft den Wert der parkingComponents-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingComponentRefsRelStructure }
     *     
     */
    public ParkingComponentRefsRelStructure getParkingComponents() {
        return parkingComponents;
    }

    /**
     * Legt den Wert der parkingComponents-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingComponentRefsRelStructure }
     *     
     */
    public void setParkingComponents(ParkingComponentRefsRelStructure value) {
        this.parkingComponents = value;
    }

    /**
     * Ruft den Wert der mustReturnToSameBay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMustReturnToSameBay() {
        return mustReturnToSameBay;
    }

    /**
     * Legt den Wert der mustReturnToSameBay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMustReturnToSameBay(Boolean value) {
        this.mustReturnToSameBay = value;
    }

    /**
     * Ruft den Wert der vehicles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRefsRelStructure }
     *     
     */
    public VehicleRefsRelStructure getVehicles() {
        return vehicles;
    }

    /**
     * Legt den Wert der vehicles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRefsRelStructure }
     *     
     */
    public void setVehicles(VehicleRefsRelStructure value) {
        this.vehicles = value;
    }

}
