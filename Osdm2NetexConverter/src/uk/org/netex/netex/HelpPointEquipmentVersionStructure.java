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
import javax.xml.datatype.Duration;


/**
 * Type for a HELP POINT EQUIPMENT.
 * 
 * <p>Java-Klasse f�r HelpPointEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HelpPointEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PassengerEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}HelpPointEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HelpPointEquipment_VersionStructure", propOrder = {
    "accessibilityAssessment",
    "heightFromGround",
    "phone",
    "inductionLoop",
    "inductionLoopSign",
    "stopRequestButton",
    "stopRequestTimeout"
})
@XmlSeeAlso({
    HelpPointEquipment.class
})
public class HelpPointEquipmentVersionStructure
    extends PassengerEquipmentVersionStructure
{

    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessment accessibilityAssessment;
    @XmlElement(name = "HeightFromGround")
    protected BigDecimal heightFromGround;
    @XmlElement(name = "Phone")
    protected Boolean phone;
    @XmlElement(name = "InductionLoop")
    protected Boolean inductionLoop;
    @XmlElement(name = "InductionLoopSign")
    protected Boolean inductionLoopSign;
    @XmlElement(name = "StopRequestButton")
    protected Boolean stopRequestButton;
    @XmlElement(name = "StopRequestTimeout")
    protected Duration stopRequestTimeout;

    /**
     * Ruft den Wert der accessibilityAssessment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityAssessment }
     *     
     */
    public AccessibilityAssessment getAccessibilityAssessment() {
        return accessibilityAssessment;
    }

    /**
     * Legt den Wert der accessibilityAssessment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityAssessment }
     *     
     */
    public void setAccessibilityAssessment(AccessibilityAssessment value) {
        this.accessibilityAssessment = value;
    }

    /**
     * Ruft den Wert der heightFromGround-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeightFromGround() {
        return heightFromGround;
    }

    /**
     * Legt den Wert der heightFromGround-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeightFromGround(BigDecimal value) {
        this.heightFromGround = value;
    }

    /**
     * Ruft den Wert der phone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPhone() {
        return phone;
    }

    /**
     * Legt den Wert der phone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPhone(Boolean value) {
        this.phone = value;
    }

    /**
     * Ruft den Wert der inductionLoop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInductionLoop() {
        return inductionLoop;
    }

    /**
     * Legt den Wert der inductionLoop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInductionLoop(Boolean value) {
        this.inductionLoop = value;
    }

    /**
     * Ruft den Wert der inductionLoopSign-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInductionLoopSign() {
        return inductionLoopSign;
    }

    /**
     * Legt den Wert der inductionLoopSign-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInductionLoopSign(Boolean value) {
        this.inductionLoopSign = value;
    }

    /**
     * Ruft den Wert der stopRequestButton-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopRequestButton() {
        return stopRequestButton;
    }

    /**
     * Legt den Wert der stopRequestButton-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopRequestButton(Boolean value) {
        this.stopRequestButton = value;
    }

    /**
     * Ruft den Wert der stopRequestTimeout-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getStopRequestTimeout() {
        return stopRequestTimeout;
    }

    /**
     * Legt den Wert der stopRequestTimeout-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setStopRequestTimeout(Duration value) {
        this.stopRequestTimeout = value;
    }

}
