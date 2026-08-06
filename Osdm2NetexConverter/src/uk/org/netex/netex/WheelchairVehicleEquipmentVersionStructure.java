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
 * Type for a WHEELCHAIR VEHICLE EQUIPMENT.
 * 
 * <p>Java-Klasse f�r WheelchairVehicleEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WheelchairVehicleEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}ActualVehicleEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}WheelchairVehicleEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WheelchairVehicleEquipment_VersionStructure", propOrder = {
    "hasWheelchairSpaces",
    "numberOfWheelchairAreas",
    "widthOfAccessArea",
    "lengthOfAccessArea",
    "heightOfAccessArea",
    "wheelchairTurningCircle",
    "companionSeat",
    "suitableFor"
})
@XmlSeeAlso({
    WheelchairVehicleEquipment.class
})
public class WheelchairVehicleEquipmentVersionStructure
    extends ActualVehicleEquipmentVersionStructure
{

    @XmlElement(name = "HasWheelchairSpaces")
    protected Boolean hasWheelchairSpaces;
    @XmlElement(name = "NumberOfWheelchairAreas")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfWheelchairAreas;
    @XmlElement(name = "WidthOfAccessArea")
    protected BigDecimal widthOfAccessArea;
    @XmlElement(name = "LengthOfAccessArea")
    protected BigDecimal lengthOfAccessArea;
    @XmlElement(name = "HeightOfAccessArea")
    protected BigDecimal heightOfAccessArea;
    @XmlElement(name = "WheelchairTurningCircle")
    protected BigDecimal wheelchairTurningCircle;
    @XmlElement(name = "CompanionSeat")
    protected Boolean companionSeat;
    protected TypeOfWheelchairRefsRelStructure suitableFor;

    /**
     * Ruft den Wert der hasWheelchairSpaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasWheelchairSpaces() {
        return hasWheelchairSpaces;
    }

    /**
     * Legt den Wert der hasWheelchairSpaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasWheelchairSpaces(Boolean value) {
        this.hasWheelchairSpaces = value;
    }

    /**
     * Ruft den Wert der numberOfWheelchairAreas-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfWheelchairAreas() {
        return numberOfWheelchairAreas;
    }

    /**
     * Legt den Wert der numberOfWheelchairAreas-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfWheelchairAreas(BigInteger value) {
        this.numberOfWheelchairAreas = value;
    }

    /**
     * Ruft den Wert der widthOfAccessArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWidthOfAccessArea() {
        return widthOfAccessArea;
    }

    /**
     * Legt den Wert der widthOfAccessArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWidthOfAccessArea(BigDecimal value) {
        this.widthOfAccessArea = value;
    }

    /**
     * Ruft den Wert der lengthOfAccessArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLengthOfAccessArea() {
        return lengthOfAccessArea;
    }

    /**
     * Legt den Wert der lengthOfAccessArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLengthOfAccessArea(BigDecimal value) {
        this.lengthOfAccessArea = value;
    }

    /**
     * Ruft den Wert der heightOfAccessArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeightOfAccessArea() {
        return heightOfAccessArea;
    }

    /**
     * Legt den Wert der heightOfAccessArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeightOfAccessArea(BigDecimal value) {
        this.heightOfAccessArea = value;
    }

    /**
     * Ruft den Wert der wheelchairTurningCircle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWheelchairTurningCircle() {
        return wheelchairTurningCircle;
    }

    /**
     * Legt den Wert der wheelchairTurningCircle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWheelchairTurningCircle(BigDecimal value) {
        this.wheelchairTurningCircle = value;
    }

    /**
     * Ruft den Wert der companionSeat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompanionSeat() {
        return companionSeat;
    }

    /**
     * Legt den Wert der companionSeat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompanionSeat(Boolean value) {
        this.companionSeat = value;
    }

    /**
     * Ruft den Wert der suitableFor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfWheelchairRefsRelStructure }
     *     
     */
    public TypeOfWheelchairRefsRelStructure getSuitableFor() {
        return suitableFor;
    }

    /**
     * Legt den Wert der suitableFor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfWheelchairRefsRelStructure }
     *     
     */
    public void setSuitableFor(TypeOfWheelchairRefsRelStructure value) {
        this.suitableFor = value;
    }

}
