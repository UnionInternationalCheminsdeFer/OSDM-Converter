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
 * Type for a DECK WINDOW.
 * 
 * <p>Java-Klasse f�r DeckWindow_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeckWindow_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DeckComponent_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DeckWindowGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeckWindow_VersionStructure", propOrder = {
    "sequenceFromFront",
    "distanceFromFront",
    "heightFromFloor",
    "vehicleSide",
    "deckWindowType",
    "hasBlind",
    "canBeOpened"
})
@XmlSeeAlso({
    DeckWindow.class
})
public class DeckWindowVersionStructure
    extends DeckComponentVersionStructure
{

    @XmlElement(name = "SequenceFromFront")
    protected BigInteger sequenceFromFront;
    @XmlElement(name = "DistanceFromFront")
    protected BigDecimal distanceFromFront;
    @XmlElement(name = "HeightFromFloor")
    protected BigDecimal heightFromFloor;
    @XmlElement(name = "VehicleSide")
    @XmlSchemaType(name = "string")
    protected VehicleSideEnumeration vehicleSide;
    @XmlElement(name = "DeckWindowType")
    @XmlSchemaType(name = "normalizedString")
    protected DeckWindowTypeEnumeration deckWindowType;
    @XmlElement(name = "HasBlind")
    protected Boolean hasBlind;
    @XmlElement(name = "CanBeOpened")
    protected Boolean canBeOpened;

    /**
     * Ruft den Wert der sequenceFromFront-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceFromFront() {
        return sequenceFromFront;
    }

    /**
     * Legt den Wert der sequenceFromFront-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceFromFront(BigInteger value) {
        this.sequenceFromFront = value;
    }

    /**
     * Ruft den Wert der distanceFromFront-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistanceFromFront() {
        return distanceFromFront;
    }

    /**
     * Legt den Wert der distanceFromFront-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistanceFromFront(BigDecimal value) {
        this.distanceFromFront = value;
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
     * Ruft den Wert der vehicleSide-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSideEnumeration }
     *     
     */
    public VehicleSideEnumeration getVehicleSide() {
        return vehicleSide;
    }

    /**
     * Legt den Wert der vehicleSide-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSideEnumeration }
     *     
     */
    public void setVehicleSide(VehicleSideEnumeration value) {
        this.vehicleSide = value;
    }

    /**
     * Ruft den Wert der deckWindowType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckWindowTypeEnumeration }
     *     
     */
    public DeckWindowTypeEnumeration getDeckWindowType() {
        return deckWindowType;
    }

    /**
     * Legt den Wert der deckWindowType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckWindowTypeEnumeration }
     *     
     */
    public void setDeckWindowType(DeckWindowTypeEnumeration value) {
        this.deckWindowType = value;
    }

    /**
     * Ruft den Wert der hasBlind-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBlind() {
        return hasBlind;
    }

    /**
     * Legt den Wert der hasBlind-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBlind(Boolean value) {
        this.hasBlind = value;
    }

    /**
     * Ruft den Wert der canBeOpened-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanBeOpened() {
        return canBeOpened;
    }

    /**
     * Legt den Wert der canBeOpened-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanBeOpened(Boolean value) {
        this.canBeOpened = value;
    }

}
