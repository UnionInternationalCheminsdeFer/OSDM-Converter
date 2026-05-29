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
 * Type for a STOP PLACE SPACE.
 * 
 * <p>Java-Klasse f�r StopPlaceSpace_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StopPlaceSpace_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}StopPlaceComponent_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}StopPlaceSpaceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopPlaceSpace_VersionStructure", propOrder = {
    "boardingUse",
    "alightingUse",
    "label",
    "entrances",
    "length",
    "width"
})
@XmlSeeAlso({
    VehicleStoppingPlaceVersionStructure.class,
    BoardingPositionVersionStructure.class,
    QuayVersionStructure.class,
    AccessSpaceVersionStructure.class
})
public abstract class StopPlaceSpaceVersionStructure
    extends StopPlaceComponentVersionStructure
{

    @XmlElement(name = "BoardingUse", defaultValue = "true")
    protected Boolean boardingUse;
    @XmlElement(name = "AlightingUse", defaultValue = "true")
    protected Boolean alightingUse;
    @XmlElement(name = "Label")
    protected MultilingualString label;
    protected SiteEntrancesRelStructure entrances;
    @XmlElement(name = "Length")
    protected BigDecimal length;
    @XmlElement(name = "Width")
    protected BigDecimal width;

    /**
     * Ruft den Wert der boardingUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBoardingUse() {
        return boardingUse;
    }

    /**
     * Legt den Wert der boardingUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBoardingUse(Boolean value) {
        this.boardingUse = value;
    }

    /**
     * Ruft den Wert der alightingUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlightingUse() {
        return alightingUse;
    }

    /**
     * Legt den Wert der alightingUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlightingUse(Boolean value) {
        this.alightingUse = value;
    }

    /**
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setLabel(MultilingualString value) {
        this.label = value;
    }

    /**
     * Ruft den Wert der entrances-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SiteEntrancesRelStructure }
     *     
     */
    public SiteEntrancesRelStructure getEntrances() {
        return entrances;
    }

    /**
     * Legt den Wert der entrances-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteEntrancesRelStructure }
     *     
     */
    public void setEntrances(SiteEntrancesRelStructure value) {
        this.entrances = value;
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

}
