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
 * Type for SIGN EQUIPMENT.
 * 
 * <p>Java-Klasse f�r SignEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SignEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PlaceEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SignEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignEquipment_VersionStructure", propOrder = {
    "height",
    "width",
    "heightFromFloor",
    "placement",
    "brandGraphic",
    "signGraphic",
    "machineReadable",
    "asBraille",
    "audioTriggerMethod",
    "printedPresentation",
    "contrast",
    "fontSize"
})
@XmlSeeAlso({
    HeadingSignStructure.class,
    PlaceSignStructure.class,
    GeneralSignStructure.class
})
public abstract class SignEquipmentVersionStructure
    extends PlaceEquipmentVersionStructure
{

    @XmlElement(name = "Height")
    protected BigDecimal height;
    @XmlElement(name = "Width")
    protected BigDecimal width;
    @XmlElement(name = "HeightFromFloor")
    protected BigDecimal heightFromFloor;
    @XmlElement(name = "Placement")
    protected MultilingualString placement;
    @XmlElement(name = "BrandGraphic")
    @XmlSchemaType(name = "anyURI")
    protected String brandGraphic;
    @XmlElement(name = "SignGraphic")
    @XmlSchemaType(name = "anyURI")
    protected String signGraphic;
    @XmlElement(name = "MachineReadable")
    protected Boolean machineReadable;
    @XmlElement(name = "AsBraille")
    protected Boolean asBraille;
    @XmlElement(name = "AudioTriggerMethod")
    @XmlSchemaType(name = "NMTOKEN")
    protected AudioTriggerMethodEnumeration audioTriggerMethod;
    @XmlElement(name = "PrintedPresentation")
    protected PrintPresentationStructure printedPresentation;
    @XmlElement(name = "Contrast")
    protected BigDecimal contrast;
    @XmlElement(name = "FontSize")
    @XmlSchemaType(name = "string")
    protected FontSizeEnumeration fontSize;

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
     * Ruft den Wert der heightFromFloor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeightFromFloor() {
        return heightFromFloor;
    }

    /**
     * Legt den Wert der heightFromFloor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeightFromFloor(BigDecimal value) {
        this.heightFromFloor = value;
    }

    /**
     * Ruft den Wert der placement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getPlacement() {
        return placement;
    }

    /**
     * Legt den Wert der placement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setPlacement(MultilingualString value) {
        this.placement = value;
    }

    /**
     * Ruft den Wert der brandGraphic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandGraphic() {
        return brandGraphic;
    }

    /**
     * Legt den Wert der brandGraphic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandGraphic(String value) {
        this.brandGraphic = value;
    }

    /**
     * Ruft den Wert der signGraphic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignGraphic() {
        return signGraphic;
    }

    /**
     * Legt den Wert der signGraphic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignGraphic(String value) {
        this.signGraphic = value;
    }

    /**
     * Ruft den Wert der machineReadable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMachineReadable() {
        return machineReadable;
    }

    /**
     * Legt den Wert der machineReadable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMachineReadable(Boolean value) {
        this.machineReadable = value;
    }

    /**
     * Ruft den Wert der asBraille-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAsBraille() {
        return asBraille;
    }

    /**
     * Legt den Wert der asBraille-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAsBraille(Boolean value) {
        this.asBraille = value;
    }

    /**
     * Ruft den Wert der audioTriggerMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AudioTriggerMethodEnumeration }
     *     
     */
    public AudioTriggerMethodEnumeration getAudioTriggerMethod() {
        return audioTriggerMethod;
    }

    /**
     * Legt den Wert der audioTriggerMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioTriggerMethodEnumeration }
     *     
     */
    public void setAudioTriggerMethod(AudioTriggerMethodEnumeration value) {
        this.audioTriggerMethod = value;
    }

    /**
     * Ruft den Wert der printedPresentation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PrintPresentationStructure }
     *     
     */
    public PrintPresentationStructure getPrintedPresentation() {
        return printedPresentation;
    }

    /**
     * Legt den Wert der printedPresentation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintPresentationStructure }
     *     
     */
    public void setPrintedPresentation(PrintPresentationStructure value) {
        this.printedPresentation = value;
    }

    /**
     * Ruft den Wert der contrast-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getContrast() {
        return contrast;
    }

    /**
     * Legt den Wert der contrast-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setContrast(BigDecimal value) {
        this.contrast = value;
    }

    /**
     * Ruft den Wert der fontSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FontSizeEnumeration }
     *     
     */
    public FontSizeEnumeration getFontSize() {
        return fontSize;
    }

    /**
     * Legt den Wert der fontSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FontSizeEnumeration }
     *     
     */
    public void setFontSize(FontSizeEnumeration value) {
        this.fontSize = value;
    }

}
