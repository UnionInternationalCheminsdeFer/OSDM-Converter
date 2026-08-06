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
 * Type for a TRAVELATOR EQUIPMENT.
 * 
 * <p>Java-Klasse f�r TravelatorEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TravelatorEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}AccessEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TravelatorGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelatorEquipment_VersionStructure", propOrder = {
    "tactileActuators",
    "energySaving",
    "speed",
    "length",
    "gradient",
    "integratesAnEscalatorPart"
})
@XmlSeeAlso({
    TravelatorEquipment.class
})
public class TravelatorEquipmentVersionStructure
    extends AccessEquipmentVersionStructure
{

    @XmlElement(name = "TactileActuators")
    protected Boolean tactileActuators;
    @XmlElement(name = "EnergySaving")
    protected Boolean energySaving;
    @XmlElement(name = "Speed")
    protected BigDecimal speed;
    @XmlElement(name = "Length")
    protected BigDecimal length;
    @XmlElement(name = "Gradient")
    protected BigDecimal gradient;
    @XmlElement(name = "IntegratesAnEscalatorPart")
    protected Boolean integratesAnEscalatorPart;

    /**
     * Ruft den Wert der tactileActuators-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTactileActuators() {
        return tactileActuators;
    }

    /**
     * Legt den Wert der tactileActuators-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTactileActuators(Boolean value) {
        this.tactileActuators = value;
    }

    /**
     * Ruft den Wert der energySaving-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnergySaving() {
        return energySaving;
    }

    /**
     * Legt den Wert der energySaving-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnergySaving(Boolean value) {
        this.energySaving = value;
    }

    /**
     * Ruft den Wert der speed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpeed() {
        return speed;
    }

    /**
     * Legt den Wert der speed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpeed(BigDecimal value) {
        this.speed = value;
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
     * Ruft den Wert der gradient-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGradient() {
        return gradient;
    }

    /**
     * Legt den Wert der gradient-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGradient(BigDecimal value) {
        this.gradient = value;
    }

    /**
     * Ruft den Wert der integratesAnEscalatorPart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegratesAnEscalatorPart() {
        return integratesAnEscalatorPart;
    }

    /**
     * Legt den Wert der integratesAnEscalatorPart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegratesAnEscalatorPart(Boolean value) {
        this.integratesAnEscalatorPart = value;
    }

}
