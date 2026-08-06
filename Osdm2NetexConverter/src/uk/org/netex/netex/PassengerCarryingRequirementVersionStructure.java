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
 * Type for a PASSENGER CARRYING REQUIREMENT.
 * 
 * <p>Java-Klasse f�r PassengerCarryingRequirement_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PassengerCarryingRequirement_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VehicleRequirement_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PassengerCarryingRequirementGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerCarryingRequirement_VersionStructure", propOrder = {
    "passengerCapacity",
    "lowFloor",
    "hasLiftOrRamp",
    "hasHoist",
    "hoistOperatingRadius",
    "boardingHeight",
    "gapToPlatform"
})
@XmlSeeAlso({
    PassengerCarryingRequirementsView.class,
    PassengerCarryingRequirement.class
})
public class PassengerCarryingRequirementVersionStructure
    extends VehicleRequirementVersionStructure
{

    @XmlElement(name = "PassengerCapacity")
    protected PassengerCapacity passengerCapacity;
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

    /**
     * Ruft den Wert der passengerCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PassengerCapacity }
     *     
     */
    public PassengerCapacity getPassengerCapacity() {
        return passengerCapacity;
    }

    /**
     * Legt den Wert der passengerCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerCapacity }
     *     
     */
    public void setPassengerCapacity(PassengerCapacity value) {
        this.passengerCapacity = value;
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

}
