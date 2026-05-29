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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for STOP PLACE VIEW.
 * 
 * <p>Java-Klasse f�r StopPlace_DerivedViewStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StopPlace_DerivedViewStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DerivedViewStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}StopPlaceRef" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/>
 *         &lt;element name="placeTypes" type="{http://www.netex.org.uk/netex}typeOfPlaceRefs_RelStructure" minOccurs="0"/>
 *         &lt;element name="ShortName" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}StopIdentifierGroup"/>
 *         &lt;element name="StopPlaceType" type="{http://www.netex.org.uk/netex}StopTypeEnumeration" minOccurs="0"/>
 *         &lt;element name="TransportMode" type="{http://www.netex.org.uk/netex}AllPublicTransportModesEnumeration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopPlace_DerivedViewStructure", propOrder = {
    "stopPlaceRef",
    "name",
    "placeTypes",
    "shortName",
    "publicCode",
    "stopPlaceType",
    "transportMode"
})
@XmlSeeAlso({
    StopPlaceView.class
})
public class StopPlaceDerivedViewStructure
    extends DerivedViewStructure
{

    @XmlElementRef(name = "StopPlaceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends StopPlaceRefStructure> stopPlaceRef;
    @XmlElement(name = "Name")
    protected MultilingualString name;
    protected TypeOfPlaceRefsRelStructure placeTypes;
    @XmlElement(name = "ShortName")
    protected MultilingualString shortName;
    @XmlElement(name = "PublicCode")
    protected PublicCodeStructure publicCode;
    @XmlElement(name = "StopPlaceType")
    @XmlSchemaType(name = "string")
    protected StopTypeEnumeration stopPlaceType;
    @XmlElement(name = "TransportMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected AllPublicTransportModesEnumeration transportMode;

    /**
     * Ruft den Wert der stopPlaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxiRankRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends StopPlaceRefStructure> getStopPlaceRef() {
        return stopPlaceRef;
    }

    /**
     * Legt den Wert der stopPlaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxiRankRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     *     
     */
    public void setStopPlaceRef(JAXBElement<? extends StopPlaceRefStructure> value) {
        this.stopPlaceRef = value;
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
     * Ruft den Wert der placeTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPlaceRefsRelStructure }
     *     
     */
    public TypeOfPlaceRefsRelStructure getPlaceTypes() {
        return placeTypes;
    }

    /**
     * Legt den Wert der placeTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPlaceRefsRelStructure }
     *     
     */
    public void setPlaceTypes(TypeOfPlaceRefsRelStructure value) {
        this.placeTypes = value;
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
     * Ruft den Wert der stopPlaceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopTypeEnumeration }
     *     
     */
    public StopTypeEnumeration getStopPlaceType() {
        return stopPlaceType;
    }

    /**
     * Legt den Wert der stopPlaceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopTypeEnumeration }
     *     
     */
    public void setStopPlaceType(StopTypeEnumeration value) {
        this.stopPlaceType = value;
    }

    /**
     * Ruft den Wert der transportMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public AllPublicTransportModesEnumeration getTransportMode() {
        return transportMode;
    }

    /**
     * Legt den Wert der transportMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public void setTransportMode(AllPublicTransportModesEnumeration value) {
        this.transportMode = value;
    }

}
