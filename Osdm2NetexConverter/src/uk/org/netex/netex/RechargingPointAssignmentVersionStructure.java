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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a RECHARGING POINT ASSIGNMENT.
 * 
 * <p>Java-Klasse f�r RechargingPointAssignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RechargingPointAssignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Assignment_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}RechargingPointAssignmentGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RechargingPointAssignment_VersionStructure", propOrder = {
    "siteComponentRef",
    "equipmentPlaceRef",
    "vehicleChargingEquipmentRef",
    "servedScheduledStopPoints"
})
public class RechargingPointAssignmentVersionStructure
    extends AssignmentVersionStructure
{

    @XmlElementRef(name = "SiteComponentRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends SiteComponentRefStructure> siteComponentRef;
    @XmlElement(name = "EquipmentPlaceRef")
    protected EquipmentPlaceRefStructure equipmentPlaceRef;
    @XmlElement(name = "VehicleChargingEquipmentRef")
    protected VehicleChargingEquipmentRefStructure vehicleChargingEquipmentRef;
    protected ScheduledStopPointRefsRelStructure servedScheduledStopPoints;

    /**
     * Ruft den Wert der siteComponentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoardingPositionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingEntranceForVehiclesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleStoppingPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MonitoredVehicleSharingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPassengerEntranceRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiStandRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteComponentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleStoppingPositionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestVehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceVehicleEntranceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends SiteComponentRefStructure> getSiteComponentRef() {
        return siteComponentRef;
    }

    /**
     * Legt den Wert der siteComponentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoardingPositionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingEntranceForVehiclesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceSpaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleStoppingPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MonitoredVehicleSharingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPassengerEntranceRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingParkingBayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiStandRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteComponentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleStoppingPositionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestVehicleEntranceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingParkingAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceVehicleEntranceRefStructure }{@code >}
     *     
     */
    public void setSiteComponentRef(JAXBElement<? extends SiteComponentRefStructure> value) {
        this.siteComponentRef = value;
    }

    /**
     * Ruft den Wert der equipmentPlaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentPlaceRefStructure }
     *     
     */
    public EquipmentPlaceRefStructure getEquipmentPlaceRef() {
        return equipmentPlaceRef;
    }

    /**
     * Legt den Wert der equipmentPlaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentPlaceRefStructure }
     *     
     */
    public void setEquipmentPlaceRef(EquipmentPlaceRefStructure value) {
        this.equipmentPlaceRef = value;
    }

    /**
     * Ruft den Wert der vehicleChargingEquipmentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleChargingEquipmentRefStructure }
     *     
     */
    public VehicleChargingEquipmentRefStructure getVehicleChargingEquipmentRef() {
        return vehicleChargingEquipmentRef;
    }

    /**
     * Legt den Wert der vehicleChargingEquipmentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleChargingEquipmentRefStructure }
     *     
     */
    public void setVehicleChargingEquipmentRef(VehicleChargingEquipmentRefStructure value) {
        this.vehicleChargingEquipmentRef = value;
    }

    /**
     * Ruft den Wert der servedScheduledStopPoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefsRelStructure }
     *     
     */
    public ScheduledStopPointRefsRelStructure getServedScheduledStopPoints() {
        return servedScheduledStopPoints;
    }

    /**
     * Legt den Wert der servedScheduledStopPoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefsRelStructure }
     *     
     */
    public void setServedScheduledStopPoints(ScheduledStopPointRefsRelStructure value) {
        this.servedScheduledStopPoints = value;
    }

}
