//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for Waiting EQUIPMENT.
 * 
 * <p>Java-Klasse f�r WaitingEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WaitingEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}SiteEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}WaitingEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaitingEquipment_VersionStructure", propOrder = {
    "seats",
    "width",
    "length",
    "height",
    "stepFree",
    "wheelchairAreaWidth",
    "wheelchairAreaLength",
    "smokingAllowed",
    "heated",
    "airConditioned"
})
@XmlSeeAlso({
    WaitingEquipment.class,
    SeatingEquipmentVersionStructure.class,
    WaitingRoomEquipmentVersionStructure.class,
    ShelterEquipmentVersionStructure.class
})
public abstract class WaitingEquipmentVersionStructure
    extends SiteEquipmentVersionStructure
{

    @XmlElement(name = "Seats")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger seats;
    @XmlElement(name = "Width")
    protected BigDecimal width;
    @XmlElement(name = "Length")
    protected BigDecimal length;
    @XmlElement(name = "Height")
    protected BigDecimal height;
    @XmlElement(name = "StepFree")
    protected Boolean stepFree;
    @XmlElement(name = "WheelchairAreaWidth")
    protected BigDecimal wheelchairAreaWidth;
    @XmlElement(name = "WheelchairAreaLength")
    protected BigDecimal wheelchairAreaLength;
    @XmlElement(name = "SmokingAllowed")
    protected Boolean smokingAllowed;
    @XmlElement(name = "Heated", defaultValue = "false")
    protected Boolean heated;
    @XmlElement(name = "AirConditioned", defaultValue = "false")
    protected Boolean airConditioned;

    /**
     * Ruft den Wert der seats-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeats() {
        return seats;
    }

    /**
     * Legt den Wert der seats-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeats(BigInteger value) {
        this.seats = value;
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
     * Ruft den Wert der stepFree-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStepFree() {
        return stepFree;
    }

    /**
     * Legt den Wert der stepFree-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStepFree(Boolean value) {
        this.stepFree = value;
    }

    /**
     * Ruft den Wert der wheelchairAreaWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWheelchairAreaWidth() {
        return wheelchairAreaWidth;
    }

    /**
     * Legt den Wert der wheelchairAreaWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWheelchairAreaWidth(BigDecimal value) {
        this.wheelchairAreaWidth = value;
    }

    /**
     * Ruft den Wert der wheelchairAreaLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWheelchairAreaLength() {
        return wheelchairAreaLength;
    }

    /**
     * Legt den Wert der wheelchairAreaLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWheelchairAreaLength(BigDecimal value) {
        this.wheelchairAreaLength = value;
    }

    /**
     * Ruft den Wert der smokingAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmokingAllowed() {
        return smokingAllowed;
    }

    /**
     * Legt den Wert der smokingAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokingAllowed(Boolean value) {
        this.smokingAllowed = value;
    }

    /**
     * Ruft den Wert der heated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeated() {
        return heated;
    }

    /**
     * Legt den Wert der heated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeated(Boolean value) {
        this.heated = value;
    }

    /**
     * Ruft den Wert der airConditioned-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAirConditioned() {
        return airConditioned;
    }

    /**
     * Legt den Wert der airConditioned-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAirConditioned(Boolean value) {
        this.airConditioned = value;
    }

}
