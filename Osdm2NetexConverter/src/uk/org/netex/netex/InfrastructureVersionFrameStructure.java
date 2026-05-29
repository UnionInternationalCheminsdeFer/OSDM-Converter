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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for an INFRASTRUCTURE FRAME.
 * 
 * <p>Java-Klasse f�r Infrastructure_VersionFrameStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Infrastructure_VersionFrameStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Common_VersionFrameStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}InfrastructureFrameGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Infrastructure_VersionFrameStructure", propOrder = {
    "meetingsRestricted",
    "restrictedManoeuvres",
    "overtakingPossibilitiesRestricted",
    "spatialFeatures",
    "junctions",
    "elements",
    "restrictions",
    "crewBases",
    "garages",
    "vehicleAndCrewPoints",
    "trafficControlPoints",
    "activationPoints",
    "activationLinks",
    "activatedEquipments",
    "vehicleTypes"
})
@XmlSeeAlso({
    InfrastructureFrame.class
})
public class InfrastructureVersionFrameStructure
    extends CommonVersionFrameStructure
{

    @XmlElement(name = "MeetingsRestricted", defaultValue = "false")
    protected Boolean meetingsRestricted;
    @XmlElement(name = "RestrictedManoeuvres", defaultValue = "false")
    protected Boolean restrictedManoeuvres;
    @XmlElement(name = "OvertakingPossibilitiesRestricted", defaultValue = "false")
    protected Boolean overtakingPossibilitiesRestricted;
    protected SpatialFeaturesInFrameRelStructure spatialFeatures;
    protected InfrastructureJunctionsInFrameRelStructure junctions;
    protected InfrastructureElementsInFrameRelStructure elements;
    protected NetworkRestrictionsInFrameRelStructure restrictions;
    protected CrewBasesInFrameRelStructure crewBases;
    protected GaragesInFrameRelStructure garages;
    protected ReliefPointsInFrameRelStructure vehicleAndCrewPoints;
    protected TrafficControlPointsInFrameRelStructure trafficControlPoints;
    protected ActivationPointsInFrameRelStructure activationPoints;
    protected ActivationLinksInFrameRelStructure activationLinks;
    protected ActivatedEquipmentsInFrameRelStructure activatedEquipments;
    protected VehicleTypesInFrameRelStructure vehicleTypes;

    /**
     * Ruft den Wert der meetingsRestricted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMeetingsRestricted() {
        return meetingsRestricted;
    }

    /**
     * Legt den Wert der meetingsRestricted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMeetingsRestricted(Boolean value) {
        this.meetingsRestricted = value;
    }

    /**
     * Ruft den Wert der restrictedManoeuvres-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedManoeuvres() {
        return restrictedManoeuvres;
    }

    /**
     * Legt den Wert der restrictedManoeuvres-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedManoeuvres(Boolean value) {
        this.restrictedManoeuvres = value;
    }

    /**
     * Ruft den Wert der overtakingPossibilitiesRestricted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOvertakingPossibilitiesRestricted() {
        return overtakingPossibilitiesRestricted;
    }

    /**
     * Legt den Wert der overtakingPossibilitiesRestricted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOvertakingPossibilitiesRestricted(Boolean value) {
        this.overtakingPossibilitiesRestricted = value;
    }

    /**
     * Ruft den Wert der spatialFeatures-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SpatialFeaturesInFrameRelStructure }
     *     
     */
    public SpatialFeaturesInFrameRelStructure getSpatialFeatures() {
        return spatialFeatures;
    }

    /**
     * Legt den Wert der spatialFeatures-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialFeaturesInFrameRelStructure }
     *     
     */
    public void setSpatialFeatures(SpatialFeaturesInFrameRelStructure value) {
        this.spatialFeatures = value;
    }

    /**
     * Ruft den Wert der junctions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InfrastructureJunctionsInFrameRelStructure }
     *     
     */
    public InfrastructureJunctionsInFrameRelStructure getJunctions() {
        return junctions;
    }

    /**
     * Legt den Wert der junctions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InfrastructureJunctionsInFrameRelStructure }
     *     
     */
    public void setJunctions(InfrastructureJunctionsInFrameRelStructure value) {
        this.junctions = value;
    }

    /**
     * Ruft den Wert der elements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InfrastructureElementsInFrameRelStructure }
     *     
     */
    public InfrastructureElementsInFrameRelStructure getElements() {
        return elements;
    }

    /**
     * Legt den Wert der elements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InfrastructureElementsInFrameRelStructure }
     *     
     */
    public void setElements(InfrastructureElementsInFrameRelStructure value) {
        this.elements = value;
    }

    /**
     * Ruft den Wert der restrictions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NetworkRestrictionsInFrameRelStructure }
     *     
     */
    public NetworkRestrictionsInFrameRelStructure getRestrictions() {
        return restrictions;
    }

    /**
     * Legt den Wert der restrictions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkRestrictionsInFrameRelStructure }
     *     
     */
    public void setRestrictions(NetworkRestrictionsInFrameRelStructure value) {
        this.restrictions = value;
    }

    /**
     * Ruft den Wert der crewBases-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CrewBasesInFrameRelStructure }
     *     
     */
    public CrewBasesInFrameRelStructure getCrewBases() {
        return crewBases;
    }

    /**
     * Legt den Wert der crewBases-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CrewBasesInFrameRelStructure }
     *     
     */
    public void setCrewBases(CrewBasesInFrameRelStructure value) {
        this.crewBases = value;
    }

    /**
     * Ruft den Wert der garages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GaragesInFrameRelStructure }
     *     
     */
    public GaragesInFrameRelStructure getGarages() {
        return garages;
    }

    /**
     * Legt den Wert der garages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GaragesInFrameRelStructure }
     *     
     */
    public void setGarages(GaragesInFrameRelStructure value) {
        this.garages = value;
    }

    /**
     * Ruft den Wert der vehicleAndCrewPoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReliefPointsInFrameRelStructure }
     *     
     */
    public ReliefPointsInFrameRelStructure getVehicleAndCrewPoints() {
        return vehicleAndCrewPoints;
    }

    /**
     * Legt den Wert der vehicleAndCrewPoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReliefPointsInFrameRelStructure }
     *     
     */
    public void setVehicleAndCrewPoints(ReliefPointsInFrameRelStructure value) {
        this.vehicleAndCrewPoints = value;
    }

    /**
     * Ruft den Wert der trafficControlPoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrafficControlPointsInFrameRelStructure }
     *     
     */
    public TrafficControlPointsInFrameRelStructure getTrafficControlPoints() {
        return trafficControlPoints;
    }

    /**
     * Legt den Wert der trafficControlPoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficControlPointsInFrameRelStructure }
     *     
     */
    public void setTrafficControlPoints(TrafficControlPointsInFrameRelStructure value) {
        this.trafficControlPoints = value;
    }

    /**
     * Ruft den Wert der activationPoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActivationPointsInFrameRelStructure }
     *     
     */
    public ActivationPointsInFrameRelStructure getActivationPoints() {
        return activationPoints;
    }

    /**
     * Legt den Wert der activationPoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationPointsInFrameRelStructure }
     *     
     */
    public void setActivationPoints(ActivationPointsInFrameRelStructure value) {
        this.activationPoints = value;
    }

    /**
     * Ruft den Wert der activationLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActivationLinksInFrameRelStructure }
     *     
     */
    public ActivationLinksInFrameRelStructure getActivationLinks() {
        return activationLinks;
    }

    /**
     * Legt den Wert der activationLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationLinksInFrameRelStructure }
     *     
     */
    public void setActivationLinks(ActivationLinksInFrameRelStructure value) {
        this.activationLinks = value;
    }

    /**
     * Ruft den Wert der activatedEquipments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActivatedEquipmentsInFrameRelStructure }
     *     
     */
    public ActivatedEquipmentsInFrameRelStructure getActivatedEquipments() {
        return activatedEquipments;
    }

    /**
     * Legt den Wert der activatedEquipments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivatedEquipmentsInFrameRelStructure }
     *     
     */
    public void setActivatedEquipments(ActivatedEquipmentsInFrameRelStructure value) {
        this.activatedEquipments = value;
    }

    /**
     * Ruft den Wert der vehicleTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTypesInFrameRelStructure }
     *     
     */
    public VehicleTypesInFrameRelStructure getVehicleTypes() {
        return vehicleTypes;
    }

    /**
     * Legt den Wert der vehicleTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTypesInFrameRelStructure }
     *     
     */
    public void setVehicleTypes(VehicleTypesInFrameRelStructure value) {
        this.vehicleTypes = value;
    }

}
