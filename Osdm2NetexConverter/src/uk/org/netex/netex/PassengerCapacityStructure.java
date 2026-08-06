//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a PASSENGER CAPACITY.
 * 
 * <p>Java-Klasse f�r PassengerCapacityStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PassengerCapacityStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PassengerCapacityGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerCapacityStructure", propOrder = {
    "fareClass",
    "totalCapacity",
    "seatingCapacity",
    "standingCapacity",
    "specialPlaceCapacity",
    "pushchairCapacity",
    "wheelchairPlaceCapacity",
    "pramPlaceCapacity",
    "bicycleRackCapacity"
})
@XmlSeeAlso({
    PassengerCapacity.class
})
public class PassengerCapacityStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "FareClass", defaultValue = "any")
    @XmlSchemaType(name = "NMTOKEN")
    protected FareClassEnumeration fareClass;
    @XmlElement(name = "TotalCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalCapacity;
    @XmlElement(name = "SeatingCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger seatingCapacity;
    @XmlElement(name = "StandingCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger standingCapacity;
    @XmlElement(name = "SpecialPlaceCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger specialPlaceCapacity;
    @XmlElement(name = "PushchairCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pushchairCapacity;
    @XmlElement(name = "WheelchairPlaceCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger wheelchairPlaceCapacity;
    @XmlElement(name = "PramPlaceCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pramPlaceCapacity;
    @XmlElement(name = "BicycleRackCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger bicycleRackCapacity;

    /**
     * Ruft den Wert der fareClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareClassEnumeration }
     *     
     */
    public FareClassEnumeration getFareClass() {
        return fareClass;
    }

    /**
     * Legt den Wert der fareClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareClassEnumeration }
     *     
     */
    public void setFareClass(FareClassEnumeration value) {
        this.fareClass = value;
    }

    /**
     * Ruft den Wert der totalCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCapacity() {
        return totalCapacity;
    }

    /**
     * Legt den Wert der totalCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCapacity(BigInteger value) {
        this.totalCapacity = value;
    }

    /**
     * Ruft den Wert der seatingCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeatingCapacity() {
        return seatingCapacity;
    }

    /**
     * Legt den Wert der seatingCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeatingCapacity(BigInteger value) {
        this.seatingCapacity = value;
    }

    /**
     * Ruft den Wert der standingCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStandingCapacity() {
        return standingCapacity;
    }

    /**
     * Legt den Wert der standingCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStandingCapacity(BigInteger value) {
        this.standingCapacity = value;
    }

    /**
     * Ruft den Wert der specialPlaceCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpecialPlaceCapacity() {
        return specialPlaceCapacity;
    }

    /**
     * Legt den Wert der specialPlaceCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpecialPlaceCapacity(BigInteger value) {
        this.specialPlaceCapacity = value;
    }

    /**
     * Ruft den Wert der pushchairCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPushchairCapacity() {
        return pushchairCapacity;
    }

    /**
     * Legt den Wert der pushchairCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPushchairCapacity(BigInteger value) {
        this.pushchairCapacity = value;
    }

    /**
     * Ruft den Wert der wheelchairPlaceCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWheelchairPlaceCapacity() {
        return wheelchairPlaceCapacity;
    }

    /**
     * Legt den Wert der wheelchairPlaceCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWheelchairPlaceCapacity(BigInteger value) {
        this.wheelchairPlaceCapacity = value;
    }

    /**
     * Ruft den Wert der pramPlaceCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPramPlaceCapacity() {
        return pramPlaceCapacity;
    }

    /**
     * Legt den Wert der pramPlaceCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPramPlaceCapacity(BigInteger value) {
        this.pramPlaceCapacity = value;
    }

    /**
     * Ruft den Wert der bicycleRackCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBicycleRackCapacity() {
        return bicycleRackCapacity;
    }

    /**
     * Legt den Wert der bicycleRackCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBicycleRackCapacity(BigInteger value) {
        this.bicycleRackCapacity = value;
    }

}
