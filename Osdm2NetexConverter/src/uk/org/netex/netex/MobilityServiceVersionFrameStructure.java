//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a MOBILITY SERVICE FRAME.
 * 
 * <p>Java-Klasse f�r MobilityService_VersionFrameStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MobilityService_VersionFrameStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Common_VersionFrameStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}MobilityServiceFrameGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityService_VersionFrameStructure", propOrder = {
    "fleets",
    "poolsOfVehicles",
    "modesOfOperation",
    "mobilityServices",
    "onlineServices",
    "vehicleMeetingPoints",
    "vehicleMeetingLinks",
    "vehicleMeetingPointAssignments",
    "vehicleMeetingPlaces",
    "vehicleMeetingPlaceAssignments",
    "mobilityServiceConstraintZones"
})
@XmlSeeAlso({
    MobilityServiceFrame.class
})
public class MobilityServiceVersionFrameStructure
    extends CommonVersionFrameStructure
{

    protected FleetsRelStructure fleets;
    protected PoolOfVehiclesRelStructure poolsOfVehicles;
    protected ModesOfOperationRelStructure modesOfOperation;
    protected MobilityServicesRelStructure mobilityServices;
    protected OnlineServicesRelStructure onlineServices;
    protected VehicleMeetingPointsInFrameRelStructure vehicleMeetingPoints;
    protected VehicleMeetingLinksInFrameRelStructure vehicleMeetingLinks;
    protected VehicleMeetingPointAssignmentsInFrameRelStructure vehicleMeetingPointAssignments;
    protected VehicleMeetingPlacesRelStructure vehicleMeetingPlaces;
    protected VehicleServicePlaceAssignmentsRelStructure vehicleMeetingPlaceAssignments;
    protected MobilityServiceConstraintZonesInFrameRelStructure mobilityServiceConstraintZones;

    /**
     * Ruft den Wert der fleets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FleetsRelStructure }
     *     
     */
    public FleetsRelStructure getFleets() {
        return fleets;
    }

    /**
     * Legt den Wert der fleets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FleetsRelStructure }
     *     
     */
    public void setFleets(FleetsRelStructure value) {
        this.fleets = value;
    }

    /**
     * Ruft den Wert der poolsOfVehicles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PoolOfVehiclesRelStructure }
     *     
     */
    public PoolOfVehiclesRelStructure getPoolsOfVehicles() {
        return poolsOfVehicles;
    }

    /**
     * Legt den Wert der poolsOfVehicles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PoolOfVehiclesRelStructure }
     *     
     */
    public void setPoolsOfVehicles(PoolOfVehiclesRelStructure value) {
        this.poolsOfVehicles = value;
    }

    /**
     * Ruft den Wert der modesOfOperation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ModesOfOperationRelStructure }
     *     
     */
    public ModesOfOperationRelStructure getModesOfOperation() {
        return modesOfOperation;
    }

    /**
     * Legt den Wert der modesOfOperation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ModesOfOperationRelStructure }
     *     
     */
    public void setModesOfOperation(ModesOfOperationRelStructure value) {
        this.modesOfOperation = value;
    }

    /**
     * Ruft den Wert der mobilityServices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MobilityServicesRelStructure }
     *     
     */
    public MobilityServicesRelStructure getMobilityServices() {
        return mobilityServices;
    }

    /**
     * Legt den Wert der mobilityServices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityServicesRelStructure }
     *     
     */
    public void setMobilityServices(MobilityServicesRelStructure value) {
        this.mobilityServices = value;
    }

    /**
     * Ruft den Wert der onlineServices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OnlineServicesRelStructure }
     *     
     */
    public OnlineServicesRelStructure getOnlineServices() {
        return onlineServices;
    }

    /**
     * Legt den Wert der onlineServices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineServicesRelStructure }
     *     
     */
    public void setOnlineServices(OnlineServicesRelStructure value) {
        this.onlineServices = value;
    }

    /**
     * Ruft den Wert der vehicleMeetingPoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMeetingPointsInFrameRelStructure }
     *     
     */
    public VehicleMeetingPointsInFrameRelStructure getVehicleMeetingPoints() {
        return vehicleMeetingPoints;
    }

    /**
     * Legt den Wert der vehicleMeetingPoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMeetingPointsInFrameRelStructure }
     *     
     */
    public void setVehicleMeetingPoints(VehicleMeetingPointsInFrameRelStructure value) {
        this.vehicleMeetingPoints = value;
    }

    /**
     * Ruft den Wert der vehicleMeetingLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMeetingLinksInFrameRelStructure }
     *     
     */
    public VehicleMeetingLinksInFrameRelStructure getVehicleMeetingLinks() {
        return vehicleMeetingLinks;
    }

    /**
     * Legt den Wert der vehicleMeetingLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMeetingLinksInFrameRelStructure }
     *     
     */
    public void setVehicleMeetingLinks(VehicleMeetingLinksInFrameRelStructure value) {
        this.vehicleMeetingLinks = value;
    }

    /**
     * Ruft den Wert der vehicleMeetingPointAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMeetingPointAssignmentsInFrameRelStructure }
     *     
     */
    public VehicleMeetingPointAssignmentsInFrameRelStructure getVehicleMeetingPointAssignments() {
        return vehicleMeetingPointAssignments;
    }

    /**
     * Legt den Wert der vehicleMeetingPointAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMeetingPointAssignmentsInFrameRelStructure }
     *     
     */
    public void setVehicleMeetingPointAssignments(VehicleMeetingPointAssignmentsInFrameRelStructure value) {
        this.vehicleMeetingPointAssignments = value;
    }

    /**
     * Ruft den Wert der vehicleMeetingPlaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMeetingPlacesRelStructure }
     *     
     */
    public VehicleMeetingPlacesRelStructure getVehicleMeetingPlaces() {
        return vehicleMeetingPlaces;
    }

    /**
     * Legt den Wert der vehicleMeetingPlaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMeetingPlacesRelStructure }
     *     
     */
    public void setVehicleMeetingPlaces(VehicleMeetingPlacesRelStructure value) {
        this.vehicleMeetingPlaces = value;
    }

    /**
     * Ruft den Wert der vehicleMeetingPlaceAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleServicePlaceAssignmentsRelStructure }
     *     
     */
    public VehicleServicePlaceAssignmentsRelStructure getVehicleMeetingPlaceAssignments() {
        return vehicleMeetingPlaceAssignments;
    }

    /**
     * Legt den Wert der vehicleMeetingPlaceAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleServicePlaceAssignmentsRelStructure }
     *     
     */
    public void setVehicleMeetingPlaceAssignments(VehicleServicePlaceAssignmentsRelStructure value) {
        this.vehicleMeetingPlaceAssignments = value;
    }

    /**
     * Ruft den Wert der mobilityServiceConstraintZones-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MobilityServiceConstraintZonesInFrameRelStructure }
     *     
     */
    public MobilityServiceConstraintZonesInFrameRelStructure getMobilityServiceConstraintZones() {
        return mobilityServiceConstraintZones;
    }

    /**
     * Legt den Wert der mobilityServiceConstraintZones-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityServiceConstraintZonesInFrameRelStructure }
     *     
     */
    public void setMobilityServiceConstraintZones(MobilityServiceConstraintZonesInFrameRelStructure value) {
        this.mobilityServiceConstraintZones = value;
    }

}
