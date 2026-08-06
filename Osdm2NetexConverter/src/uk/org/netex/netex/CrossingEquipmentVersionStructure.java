//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a CROSSING EQUIPMENT.
 * 
 * <p>Java-Klasse f�r CrossingEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CrossingEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}AccessEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CrossingEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossingEquipment_VersionStructure", propOrder = {
    "crossingType",
    "zebraCrossing",
    "pedestrianLights",
    "acousticDeviceSensors",
    "acousticCrossingAids",
    "tactileGuidanceStrips",
    "tactileWarningStrip",
    "visualGuidanceBands",
    "droppedKerb",
    "suitableForCycles",
    "markingStatus",
    "vibratingCrossingAids",
    "bumpCrossing",
    "visualObstacle",
    "bollardCrossing"
})
@XmlSeeAlso({
    CrossingEquipment.class
})
public class CrossingEquipmentVersionStructure
    extends AccessEquipmentVersionStructure
{

    @XmlElement(name = "CrossingType")
    protected CrossingTypeEnumeration crossingType;
    @XmlElement(name = "ZebraCrossing")
    protected Boolean zebraCrossing;
    @XmlElement(name = "PedestrianLights", defaultValue = "false")
    protected Boolean pedestrianLights;
    @XmlElement(name = "AcousticDeviceSensors", defaultValue = "false")
    protected Boolean acousticDeviceSensors;
    @XmlElement(name = "AcousticCrossingAids", defaultValue = "false")
    protected Boolean acousticCrossingAids;
    @XmlElement(name = "TactileGuidanceStrips", defaultValue = "false")
    protected Boolean tactileGuidanceStrips;
    @XmlElement(name = "TactileWarningStrip")
    @XmlSchemaType(name = "NMTOKEN")
    protected TactileWarningStripEnumeration tactileWarningStrip;
    @XmlElement(name = "VisualGuidanceBands", defaultValue = "false")
    protected Boolean visualGuidanceBands;
    @XmlElement(name = "DroppedKerb")
    protected Boolean droppedKerb;
    @XmlElement(name = "SuitableForCycles")
    protected Boolean suitableForCycles;
    @XmlElement(name = "MarkingStatus", defaultValue = "good")
    @XmlSchemaType(name = "NMTOKEN")
    protected MarkingStatusEnumeration markingStatus;
    @XmlElement(name = "VibratingCrossingAids")
    protected Boolean vibratingCrossingAids;
    @XmlElement(name = "BumpCrossing")
    protected Boolean bumpCrossing;
    @XmlElement(name = "VisualObstacle")
    @XmlSchemaType(name = "NMTOKEN")
    protected VisualObstacleEnumeration visualObstacle;
    @XmlElement(name = "BollardCrossing")
    @XmlSchemaType(name = "NMTOKEN")
    protected BollardCrossingEnumeration bollardCrossing;

    /**
     * Ruft den Wert der crossingType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CrossingTypeEnumeration }
     *     
     */
    public CrossingTypeEnumeration getCrossingType() {
        return crossingType;
    }

    /**
     * Legt den Wert der crossingType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossingTypeEnumeration }
     *     
     */
    public void setCrossingType(CrossingTypeEnumeration value) {
        this.crossingType = value;
    }

    /**
     * Ruft den Wert der zebraCrossing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZebraCrossing() {
        return zebraCrossing;
    }

    /**
     * Legt den Wert der zebraCrossing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZebraCrossing(Boolean value) {
        this.zebraCrossing = value;
    }

    /**
     * Ruft den Wert der pedestrianLights-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPedestrianLights() {
        return pedestrianLights;
    }

    /**
     * Legt den Wert der pedestrianLights-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPedestrianLights(Boolean value) {
        this.pedestrianLights = value;
    }

    /**
     * Ruft den Wert der acousticDeviceSensors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcousticDeviceSensors() {
        return acousticDeviceSensors;
    }

    /**
     * Legt den Wert der acousticDeviceSensors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcousticDeviceSensors(Boolean value) {
        this.acousticDeviceSensors = value;
    }

    /**
     * Ruft den Wert der acousticCrossingAids-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcousticCrossingAids() {
        return acousticCrossingAids;
    }

    /**
     * Legt den Wert der acousticCrossingAids-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcousticCrossingAids(Boolean value) {
        this.acousticCrossingAids = value;
    }

    /**
     * Ruft den Wert der tactileGuidanceStrips-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTactileGuidanceStrips() {
        return tactileGuidanceStrips;
    }

    /**
     * Legt den Wert der tactileGuidanceStrips-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTactileGuidanceStrips(Boolean value) {
        this.tactileGuidanceStrips = value;
    }

    /**
     * Ruft den Wert der tactileWarningStrip-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TactileWarningStripEnumeration }
     *     
     */
    public TactileWarningStripEnumeration getTactileWarningStrip() {
        return tactileWarningStrip;
    }

    /**
     * Legt den Wert der tactileWarningStrip-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TactileWarningStripEnumeration }
     *     
     */
    public void setTactileWarningStrip(TactileWarningStripEnumeration value) {
        this.tactileWarningStrip = value;
    }

    /**
     * Ruft den Wert der visualGuidanceBands-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisualGuidanceBands() {
        return visualGuidanceBands;
    }

    /**
     * Legt den Wert der visualGuidanceBands-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisualGuidanceBands(Boolean value) {
        this.visualGuidanceBands = value;
    }

    /**
     * Ruft den Wert der droppedKerb-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDroppedKerb() {
        return droppedKerb;
    }

    /**
     * Legt den Wert der droppedKerb-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDroppedKerb(Boolean value) {
        this.droppedKerb = value;
    }

    /**
     * Ruft den Wert der suitableForCycles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuitableForCycles() {
        return suitableForCycles;
    }

    /**
     * Legt den Wert der suitableForCycles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuitableForCycles(Boolean value) {
        this.suitableForCycles = value;
    }

    /**
     * Ruft den Wert der markingStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MarkingStatusEnumeration }
     *     
     */
    public MarkingStatusEnumeration getMarkingStatus() {
        return markingStatus;
    }

    /**
     * Legt den Wert der markingStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkingStatusEnumeration }
     *     
     */
    public void setMarkingStatus(MarkingStatusEnumeration value) {
        this.markingStatus = value;
    }

    /**
     * Ruft den Wert der vibratingCrossingAids-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVibratingCrossingAids() {
        return vibratingCrossingAids;
    }

    /**
     * Legt den Wert der vibratingCrossingAids-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVibratingCrossingAids(Boolean value) {
        this.vibratingCrossingAids = value;
    }

    /**
     * Ruft den Wert der bumpCrossing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBumpCrossing() {
        return bumpCrossing;
    }

    /**
     * Legt den Wert der bumpCrossing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBumpCrossing(Boolean value) {
        this.bumpCrossing = value;
    }

    /**
     * Ruft den Wert der visualObstacle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VisualObstacleEnumeration }
     *     
     */
    public VisualObstacleEnumeration getVisualObstacle() {
        return visualObstacle;
    }

    /**
     * Legt den Wert der visualObstacle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VisualObstacleEnumeration }
     *     
     */
    public void setVisualObstacle(VisualObstacleEnumeration value) {
        this.visualObstacle = value;
    }

    /**
     * Ruft den Wert der bollardCrossing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BollardCrossingEnumeration }
     *     
     */
    public BollardCrossingEnumeration getBollardCrossing() {
        return bollardCrossing;
    }

    /**
     * Legt den Wert der bollardCrossing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BollardCrossingEnumeration }
     *     
     */
    public void setBollardCrossing(BollardCrossingEnumeration value) {
        this.bollardCrossing = value;
    }

}
