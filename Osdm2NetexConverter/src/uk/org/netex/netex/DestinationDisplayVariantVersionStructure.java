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
 * Type for DESTINATION DISPLAY VARIANT.
 * 
 * <p>Java-Klasse f�r DestinationDisplayVariant_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DestinationDisplayVariant_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DestinationDisplayVariantGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestinationDisplayVariant_VersionStructure", propOrder = {
    "destinationDisplayRef",
    "destinationDisplayContext",
    "destinationDisplayVariantMediaType",
    "name",
    "shortName",
    "sideText",
    "frontText",
    "driverDisplayText",
    "presentation",
    "vias"
})
@XmlSeeAlso({
    DestinationDisplayVariant.class
})
public class DestinationDisplayVariantVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "DestinationDisplayRef")
    protected DestinationDisplayRefStructure destinationDisplayRef;
    @XmlElement(name = "DestinationDisplayContext", defaultValue = "any")
    @XmlSchemaType(name = "string")
    protected DestinationDisplayContextEnumeration destinationDisplayContext;
    @XmlElement(name = "DestinationDisplayVariantMediaType", required = true, defaultValue = "any")
    @XmlSchemaType(name = "normalizedString")
    protected DeliveryVariantTypeEnumeration destinationDisplayVariantMediaType;
    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "ShortName")
    protected MultilingualString shortName;
    @XmlElement(name = "SideText")
    protected MultilingualString sideText;
    @XmlElement(name = "FrontText")
    protected MultilingualString frontText;
    @XmlElement(name = "DriverDisplayText")
    protected MultilingualString driverDisplayText;
    @XmlElement(name = "Presentation")
    protected PresentationStructure presentation;
    protected ViasRelStructure vias;

    /**
     * Ruft den Wert der destinationDisplayRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DestinationDisplayRefStructure }
     *     
     */
    public DestinationDisplayRefStructure getDestinationDisplayRef() {
        return destinationDisplayRef;
    }

    /**
     * Legt den Wert der destinationDisplayRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationDisplayRefStructure }
     *     
     */
    public void setDestinationDisplayRef(DestinationDisplayRefStructure value) {
        this.destinationDisplayRef = value;
    }

    /**
     * Ruft den Wert der destinationDisplayContext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DestinationDisplayContextEnumeration }
     *     
     */
    public DestinationDisplayContextEnumeration getDestinationDisplayContext() {
        return destinationDisplayContext;
    }

    /**
     * Legt den Wert der destinationDisplayContext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationDisplayContextEnumeration }
     *     
     */
    public void setDestinationDisplayContext(DestinationDisplayContextEnumeration value) {
        this.destinationDisplayContext = value;
    }

    /**
     * Ruft den Wert der destinationDisplayVariantMediaType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryVariantTypeEnumeration }
     *     
     */
    public DeliveryVariantTypeEnumeration getDestinationDisplayVariantMediaType() {
        return destinationDisplayVariantMediaType;
    }

    /**
     * Legt den Wert der destinationDisplayVariantMediaType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryVariantTypeEnumeration }
     *     
     */
    public void setDestinationDisplayVariantMediaType(DeliveryVariantTypeEnumeration value) {
        this.destinationDisplayVariantMediaType = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der shortName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getShortName() {
        return shortName;
    }

    /**
     * Legt den Wert der shortName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setShortName(MultilingualString value) {
        this.shortName = value;
    }

    /**
     * Ruft den Wert der sideText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getSideText() {
        return sideText;
    }

    /**
     * Legt den Wert der sideText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setSideText(MultilingualString value) {
        this.sideText = value;
    }

    /**
     * Ruft den Wert der frontText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getFrontText() {
        return frontText;
    }

    /**
     * Legt den Wert der frontText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setFrontText(MultilingualString value) {
        this.frontText = value;
    }

    /**
     * Ruft den Wert der driverDisplayText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDriverDisplayText() {
        return driverDisplayText;
    }

    /**
     * Legt den Wert der driverDisplayText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDriverDisplayText(MultilingualString value) {
        this.driverDisplayText = value;
    }

    /**
     * Ruft den Wert der presentation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PresentationStructure }
     *     
     */
    public PresentationStructure getPresentation() {
        return presentation;
    }

    /**
     * Legt den Wert der presentation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationStructure }
     *     
     */
    public void setPresentation(PresentationStructure value) {
        this.presentation = value;
    }

    /**
     * Ruft den Wert der vias-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ViasRelStructure }
     *     
     */
    public ViasRelStructure getVias() {
        return vias;
    }

    /**
     * Legt den Wert der vias-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ViasRelStructure }
     *     
     */
    public void setVias(ViasRelStructure value) {
        this.vias = value;
    }

}
