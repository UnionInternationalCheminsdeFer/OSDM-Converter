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
 * Type for a SPOT EQUIPMENT.
 * 
 * <p>Java-Klasse f�r SpotEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SpotEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}InstalledEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SpotEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpotEquipment_VersionStructure", propOrder = {
    "width",
    "length",
    "height",
    "heightFromFloor",
    "hasPowerSupply",
    "hasUsbPowerSocket"
})
@XmlSeeAlso({
    SpotEquipment.class,
    LuggageSpotEquipmentVersionStructure.class,
    SeatEquipmentVersionStructure.class,
    BedEquipmentVersionStructure.class
})
public class SpotEquipmentVersionStructure
    extends InstalledEquipmentVersionStructure
{

    @XmlElement(name = "Width")
    protected BigDecimal width;
    @XmlElement(name = "Length")
    protected BigDecimal length;
    @XmlElement(name = "Height")
    protected BigDecimal height;
    @XmlElement(name = "HeightFromFloor")
    protected BigDecimal heightFromFloor;
    @XmlElement(name = "HasPowerSupply")
    protected Boolean hasPowerSupply;
    @XmlElement(name = "HasUsbPowerSocket")
    protected Boolean hasUsbPowerSocket;

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
     * Ruft den Wert der heightFromFloor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeightFromFloor() {
        return heightFromFloor;
    }

    /**
     * Legt den Wert der heightFromFloor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeightFromFloor(BigDecimal value) {
        this.heightFromFloor = value;
    }

    /**
     * Ruft den Wert der hasPowerSupply-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPowerSupply() {
        return hasPowerSupply;
    }

    /**
     * Legt den Wert der hasPowerSupply-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPowerSupply(Boolean value) {
        this.hasPowerSupply = value;
    }

    /**
     * Ruft den Wert der hasUsbPowerSocket-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasUsbPowerSocket() {
        return hasUsbPowerSocket;
    }

    /**
     * Legt den Wert der hasUsbPowerSocket-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasUsbPowerSocket(Boolean value) {
        this.hasUsbPowerSocket = value;
    }

}
