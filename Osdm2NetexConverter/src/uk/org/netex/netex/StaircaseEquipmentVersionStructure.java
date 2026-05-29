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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a STAIRCASE EQUIPMENT.
 * 
 * <p>Java-Klasse f�r StaircaseEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StaircaseEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}StairEquipment_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}StaircaseGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaircaseEquipment_VersionStructure", propOrder = {
    "continuousHandrail",
    "withoutRiser",
    "spiralStair",
    "numberOfFlights",
    "flights"
})
@XmlSeeAlso({
    StaircaseEquipment.class
})
public class StaircaseEquipmentVersionStructure
    extends StairEquipmentVersionStructure
{

    @XmlElement(name = "ContinuousHandrail")
    protected Boolean continuousHandrail;
    @XmlElement(name = "WithoutRiser")
    protected Boolean withoutRiser;
    @XmlElement(name = "SpiralStair")
    protected Boolean spiralStair;
    @XmlElement(name = "NumberOfFlights")
    protected BigInteger numberOfFlights;
    protected StairFlightsRelStructure flights;

    /**
     * Ruft den Wert der continuousHandrail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContinuousHandrail() {
        return continuousHandrail;
    }

    /**
     * Legt den Wert der continuousHandrail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContinuousHandrail(Boolean value) {
        this.continuousHandrail = value;
    }

    /**
     * Ruft den Wert der withoutRiser-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithoutRiser() {
        return withoutRiser;
    }

    /**
     * Legt den Wert der withoutRiser-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithoutRiser(Boolean value) {
        this.withoutRiser = value;
    }

    /**
     * Ruft den Wert der spiralStair-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpiralStair() {
        return spiralStair;
    }

    /**
     * Legt den Wert der spiralStair-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpiralStair(Boolean value) {
        this.spiralStair = value;
    }

    /**
     * Ruft den Wert der numberOfFlights-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfFlights() {
        return numberOfFlights;
    }

    /**
     * Legt den Wert der numberOfFlights-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfFlights(BigInteger value) {
        this.numberOfFlights = value;
    }

    /**
     * Ruft den Wert der flights-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StairFlightsRelStructure }
     *     
     */
    public StairFlightsRelStructure getFlights() {
        return flights;
    }

    /**
     * Legt den Wert der flights-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StairFlightsRelStructure }
     *     
     */
    public void setFlights(StairFlightsRelStructure value) {
        this.flights = value;
    }

}
