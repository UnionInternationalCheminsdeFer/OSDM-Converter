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
 * Type for an ACCESS EQUIPMENT.
 * 
 * <p>Java-Klasse f�r AccessEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AccessEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PlaceEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}AccessEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessEquipment_VersionStructure", propOrder = {
    "width",
    "height",
    "directionOfUse",
    "passengersPerMinute",
    "relativeWeighting",
    "safeForGuideDog"
})
@XmlSeeAlso({
    LiftEquipmentVersionStructure.class,
    RoughSurfaceStructure.class,
    LiftCallEquipmentVersionStructure.class,
    QueueingEquipmentVersionStructure.class,
    CrossingEquipmentVersionStructure.class,
    TravelatorEquipmentVersionStructure.class,
    PlaceLightingVersionStructure.class,
    StairEquipmentVersionStructure.class,
    RampEquipmentVersionStructure.class,
    EntranceEquipmentVersionStructure.class
})
public abstract class AccessEquipmentVersionStructure
    extends PlaceEquipmentVersionStructure
{

    @XmlElement(name = "Width")
    protected BigDecimal width;
    @XmlElement(name = "Height")
    protected BigDecimal height;
    @XmlElement(name = "DirectionOfUse", defaultValue = "both")
    @XmlSchemaType(name = "string")
    protected DirectionOfUseEnumeration directionOfUse;
    @XmlElement(name = "PassengersPerMinute")
    protected BigInteger passengersPerMinute;
    @XmlElement(name = "RelativeWeighting")
    protected BigInteger relativeWeighting;
    @XmlElement(name = "SafeForGuideDog")
    protected Boolean safeForGuideDog;

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
     * Ruft den Wert der directionOfUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectionOfUseEnumeration }
     *     
     */
    public DirectionOfUseEnumeration getDirectionOfUse() {
        return directionOfUse;
    }

    /**
     * Legt den Wert der directionOfUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionOfUseEnumeration }
     *     
     */
    public void setDirectionOfUse(DirectionOfUseEnumeration value) {
        this.directionOfUse = value;
    }

    /**
     * Ruft den Wert der passengersPerMinute-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPassengersPerMinute() {
        return passengersPerMinute;
    }

    /**
     * Legt den Wert der passengersPerMinute-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPassengersPerMinute(BigInteger value) {
        this.passengersPerMinute = value;
    }

    /**
     * Ruft den Wert der relativeWeighting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRelativeWeighting() {
        return relativeWeighting;
    }

    /**
     * Legt den Wert der relativeWeighting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRelativeWeighting(BigInteger value) {
        this.relativeWeighting = value;
    }

    /**
     * Ruft den Wert der safeForGuideDog-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSafeForGuideDog() {
        return safeForGuideDog;
    }

    /**
     * Legt den Wert der safeForGuideDog-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSafeForGuideDog(Boolean value) {
        this.safeForGuideDog = value;
    }

}
