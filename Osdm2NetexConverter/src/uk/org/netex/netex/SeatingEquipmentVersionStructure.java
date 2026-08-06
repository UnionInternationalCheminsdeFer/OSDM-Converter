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
 * Type for a SEATING EQUIPMENT.
 * 
 * <p>Java-Klasse f�r SeatingEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SeatingEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}WaitingEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SeatingEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatingEquipment_VersionStructure", propOrder = {
    "armRest",
    "backRest",
    "seatHeight"
})
@XmlSeeAlso({
    SeatingEquipment.class
})
public class SeatingEquipmentVersionStructure
    extends WaitingEquipmentVersionStructure
{

    @XmlElement(name = "ArmRest")
    protected Boolean armRest;
    @XmlElement(name = "BackRest", defaultValue = "true")
    protected Boolean backRest;
    @XmlElement(name = "SeatHeight")
    protected BigDecimal seatHeight;

    /**
     * Ruft den Wert der armRest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArmRest() {
        return armRest;
    }

    /**
     * Legt den Wert der armRest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArmRest(Boolean value) {
        this.armRest = value;
    }

    /**
     * Ruft den Wert der backRest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBackRest() {
        return backRest;
    }

    /**
     * Legt den Wert der backRest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBackRest(Boolean value) {
        this.backRest = value;
    }

    /**
     * Ruft den Wert der seatHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeatHeight() {
        return seatHeight;
    }

    /**
     * Legt den Wert der seatHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeatHeight(BigDecimal value) {
        this.seatHeight = value;
    }

}
