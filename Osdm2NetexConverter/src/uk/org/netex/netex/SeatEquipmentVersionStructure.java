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
 * Type for a SEAT EQUIPMENT.
 * 
 * <p>Java-Klasse f�r SeatEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SeatEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}SpotEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SeatEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatEquipment_VersionStructure", propOrder = {
    "seatBackHeight",
    "seatDepth",
    "isFoldup",
    "isReclining",
    "maximumRecline",
    "isReversible",
    "canRotate"
})
@XmlSeeAlso({
    SeatEquipment.class
})
public class SeatEquipmentVersionStructure
    extends SpotEquipmentVersionStructure
{

    @XmlElement(name = "SeatBackHeight")
    protected BigDecimal seatBackHeight;
    @XmlElement(name = "SeatDepth")
    protected BigDecimal seatDepth;
    @XmlElement(name = "IsFoldup", defaultValue = "false")
    protected Boolean isFoldup;
    @XmlElement(name = "IsReclining", defaultValue = "false")
    protected Boolean isReclining;
    @XmlElement(name = "MaximumRecline")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumRecline;
    @XmlElement(name = "IsReversible", defaultValue = "false")
    protected Boolean isReversible;
    @XmlElement(defaultValue = "false")
    protected Boolean canRotate;

    /**
     * Ruft den Wert der seatBackHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeatBackHeight() {
        return seatBackHeight;
    }

    /**
     * Legt den Wert der seatBackHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeatBackHeight(BigDecimal value) {
        this.seatBackHeight = value;
    }

    /**
     * Ruft den Wert der seatDepth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeatDepth() {
        return seatDepth;
    }

    /**
     * Legt den Wert der seatDepth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeatDepth(BigDecimal value) {
        this.seatDepth = value;
    }

    /**
     * Ruft den Wert der isFoldup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFoldup() {
        return isFoldup;
    }

    /**
     * Legt den Wert der isFoldup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFoldup(Boolean value) {
        this.isFoldup = value;
    }

    /**
     * Ruft den Wert der isReclining-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReclining() {
        return isReclining;
    }

    /**
     * Legt den Wert der isReclining-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReclining(Boolean value) {
        this.isReclining = value;
    }

    /**
     * Ruft den Wert der maximumRecline-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumRecline() {
        return maximumRecline;
    }

    /**
     * Legt den Wert der maximumRecline-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumRecline(BigInteger value) {
        this.maximumRecline = value;
    }

    /**
     * Ruft den Wert der isReversible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReversible() {
        return isReversible;
    }

    /**
     * Legt den Wert der isReversible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReversible(Boolean value) {
        this.isReversible = value;
    }

    /**
     * Ruft den Wert der canRotate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanRotate() {
        return canRotate;
    }

    /**
     * Legt den Wert der canRotate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanRotate(Boolean value) {
        this.canRotate = value;
    }

}
