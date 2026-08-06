//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a VEHICLE TYPE.
 * 
 * <p>Java-Klasse f�r VehicleType_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleType_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}TransportType_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehicleTypeGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleType_VersionStructure", propOrder = {
    "capacities",
    "lowFloor",
    "hasLiftOrRamp",
    "hasHoist",
    "hoistOperatingRadius",
    "boardingHeight",
    "gapToPlatform",
    "length",
    "width",
    "height",
    "weight",
    "firstAxleHeight",
    "monitored",
    "includedIn",
    "classifiedAsRef",
    "facilities",
    "canCarry",
    "canManoeuvre",
    "satisfiesFacilityRequirements"
})
@XmlSeeAlso({
    VehicleType.class,
    TrainVersionStructure.class,
    CompoundTrainVersionStructure.class
})
public class VehicleTypeVersionStructure
    extends TransportTypeVersionStructure
{

    protected PassengerCapacitiesRelStructure capacities;
    @XmlElement(name = "LowFloor")
    protected Boolean lowFloor;
    @XmlElement(name = "HasLiftOrRamp")
    protected Boolean hasLiftOrRamp;
    @XmlElement(name = "HasHoist")
    protected Boolean hasHoist;
    @XmlElement(name = "HoistOperatingRadius")
    protected BigDecimal hoistOperatingRadius;
    @XmlElement(name = "BoardingHeight")
    protected BigDecimal boardingHeight;
    @XmlElement(name = "GapToPlatform")
    protected BigDecimal gapToPlatform;
    @XmlElement(name = "Length")
    protected BigDecimal length;
    @XmlElement(name = "Width")
    protected BigDecimal width;
    @XmlElement(name = "Height")
    protected BigDecimal height;
    @XmlElement(name = "Weight")
    protected BigDecimal weight;
    @XmlElement(name = "FirstAxleHeight")
    protected BigDecimal firstAxleHeight;
    @XmlElement(name = "Monitored")
    protected Boolean monitored;
    @XmlElement(name = "IncludedIn")
    protected VehicleTypeRefStructure includedIn;
    @XmlElement(name = "ClassifiedAsRef")
    protected VehicleModelRefStructure classifiedAsRef;
    protected ServiceFacilitySetsRelStructure facilities;
    protected PassengerCarryingRequirementsRelStructure canCarry;
    protected VehicleManoeuvringRequirementsRelStructure canManoeuvre;
    protected FacilityRequirementsRelStructure satisfiesFacilityRequirements;

    /**
     * Ruft den Wert der capacities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PassengerCapacitiesRelStructure }
     *     
     */
    public PassengerCapacitiesRelStructure getCapacities() {
        return capacities;
    }

    /**
     * Legt den Wert der capacities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerCapacitiesRelStructure }
     *     
     */
    public void setCapacities(PassengerCapacitiesRelStructure value) {
        this.capacities = value;
    }

    /**
     * Ruft den Wert der lowFloor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLowFloor() {
        return lowFloor;
    }

    /**
     * Legt den Wert der lowFloor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLowFloor(Boolean value) {
        this.lowFloor = value;
    }

    /**
     * Ruft den Wert der hasLiftOrRamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasLiftOrRamp() {
        return hasLiftOrRamp;
    }

    /**
     * Legt den Wert der hasLiftOrRamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasLiftOrRamp(Boolean value) {
        this.hasLiftOrRamp = value;
    }

    /**
     * Ruft den Wert der hasHoist-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasHoist() {
        return hasHoist;
    }

    /**
     * Legt den Wert der hasHoist-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasHoist(Boolean value) {
        this.hasHoist = value;
    }

    /**
     * Ruft den Wert der hoistOperatingRadius-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHoistOperatingRadius() {
        return hoistOperatingRadius;
    }

    /**
     * Legt den Wert der hoistOperatingRadius-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHoistOperatingRadius(BigDecimal value) {
        this.hoistOperatingRadius = value;
    }

    /**
     * Ruft den Wert der boardingHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBoardingHeight() {
        return boardingHeight;
    }

    /**
     * Legt den Wert der boardingHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBoardingHeight(BigDecimal value) {
        this.boardingHeight = value;
    }

    /**
     * Ruft den Wert der gapToPlatform-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGapToPlatform() {
        return gapToPlatform;
    }

    /**
     * Legt den Wert der gapToPlatform-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGapToPlatform(BigDecimal value) {
        this.gapToPlatform = value;
    }

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLength(BigDecimal value) {
        this.length = value;
    }

    /**
     * Ruft den Wert der width-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * Legt den Wert der width-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWidth(BigDecimal value) {
        this.width = value;
    }

    /**
     * Ruft den Wert der height-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * Legt den Wert der height-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeight(BigDecimal value) {
        this.height = value;
    }

    /**
     * Ruft den Wert der weight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Legt den Wert der weight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
    }

    /**
     * Ruft den Wert der firstAxleHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstAxleHeight() {
        return firstAxleHeight;
    }

    /**
     * Legt den Wert der firstAxleHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstAxleHeight(BigDecimal value) {
        this.firstAxleHeight = value;
    }

    /**
     * Ruft den Wert der monitored-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonitored() {
        return monitored;
    }

    /**
     * Legt den Wert der monitored-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonitored(Boolean value) {
        this.monitored = value;
    }

    /**
     * Ruft den Wert der includedIn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTypeRefStructure }
     *     
     */
    public VehicleTypeRefStructure getIncludedIn() {
        return includedIn;
    }

    /**
     * Legt den Wert der includedIn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTypeRefStructure }
     *     
     */
    public void setIncludedIn(VehicleTypeRefStructure value) {
        this.includedIn = value;
    }

    /**
     * Ruft den Wert der classifiedAsRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleModelRefStructure }
     *     
     */
    public VehicleModelRefStructure getClassifiedAsRef() {
        return classifiedAsRef;
    }

    /**
     * Legt den Wert der classifiedAsRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleModelRefStructure }
     *     
     */
    public void setClassifiedAsRef(VehicleModelRefStructure value) {
        this.classifiedAsRef = value;
    }

    /**
     * Ruft den Wert der facilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFacilitySetsRelStructure }
     *     
     */
    public ServiceFacilitySetsRelStructure getFacilities() {
        return facilities;
    }

    /**
     * Legt den Wert der facilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFacilitySetsRelStructure }
     *     
     */
    public void setFacilities(ServiceFacilitySetsRelStructure value) {
        this.facilities = value;
    }

    /**
     * Ruft den Wert der canCarry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PassengerCarryingRequirementsRelStructure }
     *     
     */
    public PassengerCarryingRequirementsRelStructure getCanCarry() {
        return canCarry;
    }

    /**
     * Legt den Wert der canCarry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerCarryingRequirementsRelStructure }
     *     
     */
    public void setCanCarry(PassengerCarryingRequirementsRelStructure value) {
        this.canCarry = value;
    }

    /**
     * Ruft den Wert der canManoeuvre-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleManoeuvringRequirementsRelStructure }
     *     
     */
    public VehicleManoeuvringRequirementsRelStructure getCanManoeuvre() {
        return canManoeuvre;
    }

    /**
     * Legt den Wert der canManoeuvre-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleManoeuvringRequirementsRelStructure }
     *     
     */
    public void setCanManoeuvre(VehicleManoeuvringRequirementsRelStructure value) {
        this.canManoeuvre = value;
    }

    /**
     * Ruft den Wert der satisfiesFacilityRequirements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FacilityRequirementsRelStructure }
     *     
     */
    public FacilityRequirementsRelStructure getSatisfiesFacilityRequirements() {
        return satisfiesFacilityRequirements;
    }

    /**
     * Legt den Wert der satisfiesFacilityRequirements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityRequirementsRelStructure }
     *     
     */
    public void setSatisfiesFacilityRequirements(FacilityRequirementsRelStructure value) {
        this.satisfiesFacilityRequirements = value;
    }

}
