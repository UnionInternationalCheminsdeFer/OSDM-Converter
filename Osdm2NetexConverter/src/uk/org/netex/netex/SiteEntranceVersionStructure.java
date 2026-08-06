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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for SITE ENTRANCe.
 * 
 * <p>Java-Klasse f�r SiteEntrance_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SiteEntrance_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}SiteComponent_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SiteEntranceGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ExternalEntranceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteEntrance_VersionStructure", propOrder = {
    "publicCode",
    "label",
    "entranceType",
    "entrancePurpose",
    "isExternal",
    "isEntry",
    "isExit",
    "width",
    "height",
    "droppedKerbOutside",
    "dropOffPointClose"
})
@XmlSeeAlso({
    PointOfInterestVehicleEntranceVersionStructure.class,
    ParkingEntranceForVehiclesVersionStructure.class,
    ParkingPassengerEntranceVersionStructure.class,
    StopPlaceEntranceVersionStructure.class,
    PointOfInterestEntranceVersionStructure.class,
    VehicleEntranceVersionStructure.class
})
public class SiteEntranceVersionStructure
    extends SiteComponentVersionStructure
{

    @XmlElement(name = "PublicCode")
    protected PublicCodeStructure publicCode;
    @XmlElement(name = "Label")
    protected MultilingualString label;
    @XmlElement(name = "EntranceType")
    @XmlSchemaType(name = "string")
    protected EntranceEnumeration entranceType;
    @XmlElement(name = "EntrancePurpose")
    @XmlSchemaType(name = "string")
    protected EntrancePurposeEnumeration entrancePurpose;
    @XmlElement(name = "IsExternal", defaultValue = "true")
    protected Boolean isExternal;
    @XmlElement(name = "IsEntry", defaultValue = "true")
    protected Boolean isEntry;
    @XmlElement(name = "IsExit", defaultValue = "true")
    protected Boolean isExit;
    @XmlElement(name = "Width")
    protected BigDecimal width;
    @XmlElement(name = "Height")
    protected BigDecimal height;
    @XmlElement(name = "DroppedKerbOutside")
    protected Boolean droppedKerbOutside;
    @XmlElement(name = "DropOffPointClose")
    protected Boolean dropOffPointClose;

    /**
     * Ruft den Wert der publicCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublicCodeStructure }
     *     
     */
    public PublicCodeStructure getPublicCode() {
        return publicCode;
    }

    /**
     * Legt den Wert der publicCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicCodeStructure }
     *     
     */
    public void setPublicCode(PublicCodeStructure value) {
        this.publicCode = value;
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
     * Ruft den Wert der entranceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EntranceEnumeration }
     *     
     */
    public EntranceEnumeration getEntranceType() {
        return entranceType;
    }

    /**
     * Legt den Wert der entranceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EntranceEnumeration }
     *     
     */
    public void setEntranceType(EntranceEnumeration value) {
        this.entranceType = value;
    }

    /**
     * Ruft den Wert der entrancePurpose-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EntrancePurposeEnumeration }
     *     
     */
    public EntrancePurposeEnumeration getEntrancePurpose() {
        return entrancePurpose;
    }

    /**
     * Legt den Wert der entrancePurpose-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EntrancePurposeEnumeration }
     *     
     */
    public void setEntrancePurpose(EntrancePurposeEnumeration value) {
        this.entrancePurpose = value;
    }

    /**
     * Ruft den Wert der isExternal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExternal() {
        return isExternal;
    }

    /**
     * Legt den Wert der isExternal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExternal(Boolean value) {
        this.isExternal = value;
    }

    /**
     * Ruft den Wert der isEntry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEntry() {
        return isEntry;
    }

    /**
     * Legt den Wert der isEntry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEntry(Boolean value) {
        this.isEntry = value;
    }

    /**
     * Ruft den Wert der isExit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExit() {
        return isExit;
    }

    /**
     * Legt den Wert der isExit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExit(Boolean value) {
        this.isExit = value;
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
     * Ruft den Wert der droppedKerbOutside-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDroppedKerbOutside() {
        return droppedKerbOutside;
    }

    /**
     * Legt den Wert der droppedKerbOutside-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDroppedKerbOutside(Boolean value) {
        this.droppedKerbOutside = value;
    }

    /**
     * Ruft den Wert der dropOffPointClose-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDropOffPointClose() {
        return dropOffPointClose;
    }

    /**
     * Legt den Wert der dropOffPointClose-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDropOffPointClose(Boolean value) {
        this.dropOffPointClose = value;
    }

}
