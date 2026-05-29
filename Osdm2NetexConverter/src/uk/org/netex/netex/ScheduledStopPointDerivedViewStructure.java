//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for SCHEDULED STOP POINT VIEW.
 * 
 * <p>Java-Klasse f�r ScheduledStopPoint_DerivedViewStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ScheduledStopPoint_DerivedViewStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DerivedViewStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}ScheduledStopPointRef" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}TypeOfPointRef" minOccurs="0"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}StopPointDescriptionGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledStopPoint_DerivedViewStructure", propOrder = {
    "scheduledStopPointRef",
    "name",
    "typeOfPointRef",
    "shortName",
    "nameSuffix",
    "description",
    "label",
    "shortStopCode",
    "publicCode",
    "privateCode",
    "externalStopPointRef",
    "url",
    "stopType",
    "compassBearing",
    "presentation"
})
public class ScheduledStopPointDerivedViewStructure
    extends DerivedViewStructure
{

    @XmlElementRef(name = "ScheduledStopPointRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ScheduledStopPointRefStructure> scheduledStopPointRef;
    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "TypeOfPointRef")
    protected TypeOfPointRefStructure typeOfPointRef;
    @XmlElement(name = "ShortName")
    protected MultilingualString shortName;
    @XmlElement(name = "NameSuffix")
    protected MultilingualString nameSuffix;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "Label")
    protected MultilingualString label;
    @XmlElement(name = "ShortStopCode")
    protected PrivateCodeStructure shortStopCode;
    @XmlElement(name = "PublicCode")
    protected PublicCodeStructure publicCode;
    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElement(name = "ExternalStopPointRef")
    protected ExternalObjectRefStructure externalStopPointRef;
    @XmlElement(name = "Url")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(name = "StopType")
    @XmlSchemaType(name = "string")
    protected StopTypeEnumeration stopType;
    @XmlElement(name = "CompassBearing")
    protected Float compassBearing;
    @XmlElement(name = "Presentation")
    protected PresentationStructure presentation;

    /**
     * Ruft den Wert der scheduledStopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ScheduledStopPointRefStructure> getScheduledStopPointRef() {
        return scheduledStopPointRef;
    }

    /**
     * Legt den Wert der scheduledStopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     *     
     */
    public void setScheduledStopPointRef(JAXBElement<? extends ScheduledStopPointRefStructure> value) {
        this.scheduledStopPointRef = value;
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
     * Ruft den Wert der typeOfPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPointRefStructure }
     *     
     */
    public TypeOfPointRefStructure getTypeOfPointRef() {
        return typeOfPointRef;
    }

    /**
     * Legt den Wert der typeOfPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPointRefStructure }
     *     
     */
    public void setTypeOfPointRef(TypeOfPointRefStructure value) {
        this.typeOfPointRef = value;
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
     * Ruft den Wert der nameSuffix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Legt den Wert der nameSuffix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setNameSuffix(MultilingualString value) {
        this.nameSuffix = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescription(MultilingualString value) {
        this.description = value;
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
     * Ruft den Wert der shortStopCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getShortStopCode() {
        return shortStopCode;
    }

    /**
     * Legt den Wert der shortStopCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setShortStopCode(PrivateCodeStructure value) {
        this.shortStopCode = value;
    }

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
     * DEPRECATED - use privateCodes. -v2.0
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getPrivateCode() {
        return privateCode;
    }

    /**
     * Legt den Wert der privateCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setPrivateCode(PrivateCodeStructure value) {
        this.privateCode = value;
    }

    /**
     * Ruft den Wert der externalStopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExternalObjectRefStructure }
     *     
     */
    public ExternalObjectRefStructure getExternalStopPointRef() {
        return externalStopPointRef;
    }

    /**
     * Legt den Wert der externalStopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalObjectRefStructure }
     *     
     */
    public void setExternalStopPointRef(ExternalObjectRefStructure value) {
        this.externalStopPointRef = value;
    }

    /**
     * Ruft den Wert der url-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Legt den Wert der url-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Ruft den Wert der stopType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopTypeEnumeration }
     *     
     */
    public StopTypeEnumeration getStopType() {
        return stopType;
    }

    /**
     * Legt den Wert der stopType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopTypeEnumeration }
     *     
     */
    public void setStopType(StopTypeEnumeration value) {
        this.stopType = value;
    }

    /**
     * Ruft den Wert der compassBearing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCompassBearing() {
        return compassBearing;
    }

    /**
     * Legt den Wert der compassBearing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCompassBearing(Float value) {
        this.compassBearing = value;
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

}
