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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a PASSENGER SPOT.
 * 
 * <p>Java-Klasse f�r PassengerSpot_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PassengerSpot_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}LocatableSpot_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PassengerSpotGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerSpot_VersionStructure", propOrder = {
    "tableType",
    "hasArmrest",
    "legSpace",
    "hasPower",
    "isByWindow",
    "isByAisle",
    "isBetweenSeats",
    "isInFrontRow",
    "isInEndRow",
    "isFacingWindow",
    "isFacingAisle"
})
@XmlSeeAlso({
    PassengerSpot.class
})
public class PassengerSpotVersionStructure
    extends LocatableSpotVersionStructure
{

    @XmlElement(name = "TableType")
    @XmlSchemaType(name = "normalizedString")
    protected TableTypeEnumeration tableType;
    @XmlElement(name = "HasArmrest")
    protected Boolean hasArmrest;
    @XmlElement(name = "LegSpace")
    protected BigDecimal legSpace;
    @XmlElement(name = "HasPower", defaultValue = "false")
    protected Boolean hasPower;
    @XmlElement(name = "IsByWindow", defaultValue = "false")
    protected Boolean isByWindow;
    @XmlElement(name = "IsByAisle", defaultValue = "false")
    protected Boolean isByAisle;
    @XmlElement(name = "IsBetweenSeats", defaultValue = "false")
    protected Boolean isBetweenSeats;
    @XmlElement(name = "IsInFrontRow", defaultValue = "false")
    protected Boolean isInFrontRow;
    @XmlElement(name = "IsInEndRow", defaultValue = "false")
    protected Boolean isInEndRow;
    @XmlElement(name = "IsFacingWindow", defaultValue = "false")
    protected Boolean isFacingWindow;
    @XmlElement(name = "IsFacingAisle", defaultValue = "false")
    protected Boolean isFacingAisle;

    /**
     * Ruft den Wert der tableType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TableTypeEnumeration }
     *     
     */
    public TableTypeEnumeration getTableType() {
        return tableType;
    }

    /**
     * Legt den Wert der tableType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TableTypeEnumeration }
     *     
     */
    public void setTableType(TableTypeEnumeration value) {
        this.tableType = value;
    }

    /**
     * Ruft den Wert der hasArmrest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasArmrest() {
        return hasArmrest;
    }

    /**
     * Legt den Wert der hasArmrest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasArmrest(Boolean value) {
        this.hasArmrest = value;
    }

    /**
     * Ruft den Wert der legSpace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLegSpace() {
        return legSpace;
    }

    /**
     * Legt den Wert der legSpace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLegSpace(BigDecimal value) {
        this.legSpace = value;
    }

    /**
     * Ruft den Wert der hasPower-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPower() {
        return hasPower;
    }

    /**
     * Legt den Wert der hasPower-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPower(Boolean value) {
        this.hasPower = value;
    }

    /**
     * Ruft den Wert der isByWindow-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsByWindow() {
        return isByWindow;
    }

    /**
     * Legt den Wert der isByWindow-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsByWindow(Boolean value) {
        this.isByWindow = value;
    }

    /**
     * Ruft den Wert der isByAisle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsByAisle() {
        return isByAisle;
    }

    /**
     * Legt den Wert der isByAisle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsByAisle(Boolean value) {
        this.isByAisle = value;
    }

    /**
     * Ruft den Wert der isBetweenSeats-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBetweenSeats() {
        return isBetweenSeats;
    }

    /**
     * Legt den Wert der isBetweenSeats-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBetweenSeats(Boolean value) {
        this.isBetweenSeats = value;
    }

    /**
     * Ruft den Wert der isInFrontRow-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInFrontRow() {
        return isInFrontRow;
    }

    /**
     * Legt den Wert der isInFrontRow-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInFrontRow(Boolean value) {
        this.isInFrontRow = value;
    }

    /**
     * Ruft den Wert der isInEndRow-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInEndRow() {
        return isInEndRow;
    }

    /**
     * Legt den Wert der isInEndRow-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInEndRow(Boolean value) {
        this.isInEndRow = value;
    }

    /**
     * Ruft den Wert der isFacingWindow-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFacingWindow() {
        return isFacingWindow;
    }

    /**
     * Legt den Wert der isFacingWindow-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFacingWindow(Boolean value) {
        this.isFacingWindow = value;
    }

    /**
     * Ruft den Wert der isFacingAisle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFacingAisle() {
        return isFacingAisle;
    }

    /**
     * Legt den Wert der isFacingAisle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFacingAisle(Boolean value) {
        this.isFacingAisle = value;
    }

}
