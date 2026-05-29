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
 * Type for a Luggage Locker.
 * 
 * <p>Java-Klasse f�r LuggageLockerEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LuggageLockerEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}SiteEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}LuggageLockerEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LuggageLockerEquipment_VersionStructure", propOrder = {
    "numberOfLockers",
    "lockerWidth",
    "lockerHeight",
    "lockerDepth",
    "lockerType",
    "lockingType",
    "wheelchairAccepted",
    "blindAccessible"
})
@XmlSeeAlso({
    LuggageLockerEquipment.class
})
public class LuggageLockerEquipmentVersionStructure
    extends SiteEquipmentVersionStructure
{

    @XmlElement(name = "NumberOfLockers")
    protected BigInteger numberOfLockers;
    @XmlElement(name = "LockerWidth")
    protected BigDecimal lockerWidth;
    @XmlElement(name = "LockerHeight")
    protected BigDecimal lockerHeight;
    @XmlElement(name = "LockerDepth")
    protected BigDecimal lockerDepth;
    @XmlElement(name = "LockerType")
    @XmlSchemaType(name = "normalizedString")
    protected LockerTypeEnumeration lockerType;
    @XmlElement(name = "LockingType")
    @XmlSchemaType(name = "normalizedString")
    protected LockingTypeEnumeration lockingType;
    @XmlElement(name = "WheelchairAccepted")
    protected Boolean wheelchairAccepted;
    @XmlElement(name = "BlindAccessible")
    protected Boolean blindAccessible;

    /**
     * Ruft den Wert der numberOfLockers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfLockers() {
        return numberOfLockers;
    }

    /**
     * Legt den Wert der numberOfLockers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfLockers(BigInteger value) {
        this.numberOfLockers = value;
    }

    /**
     * Ruft den Wert der lockerWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLockerWidth() {
        return lockerWidth;
    }

    /**
     * Legt den Wert der lockerWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLockerWidth(BigDecimal value) {
        this.lockerWidth = value;
    }

    /**
     * Ruft den Wert der lockerHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLockerHeight() {
        return lockerHeight;
    }

    /**
     * Legt den Wert der lockerHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLockerHeight(BigDecimal value) {
        this.lockerHeight = value;
    }

    /**
     * Ruft den Wert der lockerDepth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLockerDepth() {
        return lockerDepth;
    }

    /**
     * Legt den Wert der lockerDepth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLockerDepth(BigDecimal value) {
        this.lockerDepth = value;
    }

    /**
     * Ruft den Wert der lockerType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LockerTypeEnumeration }
     *     
     */
    public LockerTypeEnumeration getLockerType() {
        return lockerType;
    }

    /**
     * Legt den Wert der lockerType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LockerTypeEnumeration }
     *     
     */
    public void setLockerType(LockerTypeEnumeration value) {
        this.lockerType = value;
    }

    /**
     * Ruft den Wert der lockingType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LockingTypeEnumeration }
     *     
     */
    public LockingTypeEnumeration getLockingType() {
        return lockingType;
    }

    /**
     * Legt den Wert der lockingType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LockingTypeEnumeration }
     *     
     */
    public void setLockingType(LockingTypeEnumeration value) {
        this.lockingType = value;
    }

    /**
     * Ruft den Wert der wheelchairAccepted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWheelchairAccepted() {
        return wheelchairAccepted;
    }

    /**
     * Legt den Wert der wheelchairAccepted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWheelchairAccepted(Boolean value) {
        this.wheelchairAccepted = value;
    }

    /**
     * Ruft den Wert der blindAccessible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlindAccessible() {
        return blindAccessible;
    }

    /**
     * Legt den Wert der blindAccessible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlindAccessible(Boolean value) {
        this.blindAccessible = value;
    }

}
