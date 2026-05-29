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
 * Type for a HEADING SIGN.
 * 
 * <p>Java-Klasse f�r HeadingSignStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HeadingSignStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}SignEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}HeadingSignGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeadingSignStructure", propOrder = {
    "placeName",
    "lineRef",
    "lineName",
    "transportMode",
    "transportSubmode",
    "lineMap",
    "directionRef",
    "directionName",
    "destinationDisplayRef",
    "linePublicCode"
})
@XmlSeeAlso({
    HeadingSign.class
})
public class HeadingSignStructure
    extends SignEquipmentVersionStructure
{

    @XmlElement(name = "PlaceName")
    protected MultilingualString placeName;
    @XmlElementRef(name = "LineRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LineRefStructure> lineRef;
    @XmlElement(name = "LineName")
    protected MultilingualString lineName;
    @XmlElement(name = "TransportMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected AllPublicTransportModesEnumeration transportMode;
    @XmlElement(name = "TransportSubmode")
    protected TransportSubmodeStructure transportSubmode;
    @XmlElement(name = "LineMap")
    @XmlSchemaType(name = "anyURI")
    protected String lineMap;
    @XmlElement(name = "DirectionRef")
    protected DirectionRefStructure directionRef;
    @XmlElement(name = "DirectionName")
    protected MultilingualString directionName;
    @XmlElement(name = "DestinationDisplayRef")
    protected DestinationDisplayRefStructure destinationDisplayRef;
    @XmlElement(name = "LinePublicCode")
    protected PublicCodeStructure linePublicCode;

    /**
     * Ruft den Wert der placeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getPlaceName() {
        return placeName;
    }

    /**
     * Legt den Wert der placeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setPlaceName(MultilingualString value) {
        this.placeName = value;
    }

    /**
     * Ruft den Wert der lineRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LineRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleLineRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends LineRefStructure> getLineRef() {
        return lineRef;
    }

    /**
     * Legt den Wert der lineRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LineRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleLineRefStructure }{@code >}
     *     
     */
    public void setLineRef(JAXBElement<? extends LineRefStructure> value) {
        this.lineRef = value;
    }

    /**
     * Ruft den Wert der lineName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getLineName() {
        return lineName;
    }

    /**
     * Legt den Wert der lineName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setLineName(MultilingualString value) {
        this.lineName = value;
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

    /**
     * Ruft den Wert der transportSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransportSubmodeStructure }
     *     
     */
    public TransportSubmodeStructure getTransportSubmode() {
        return transportSubmode;
    }

    /**
     * Legt den Wert der transportSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportSubmodeStructure }
     *     
     */
    public void setTransportSubmode(TransportSubmodeStructure value) {
        this.transportSubmode = value;
    }

    /**
     * Ruft den Wert der lineMap-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineMap() {
        return lineMap;
    }

    /**
     * Legt den Wert der lineMap-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineMap(String value) {
        this.lineMap = value;
    }

    /**
     * Ruft den Wert der directionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectionRefStructure }
     *     
     */
    public DirectionRefStructure getDirectionRef() {
        return directionRef;
    }

    /**
     * Legt den Wert der directionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionRefStructure }
     *     
     */
    public void setDirectionRef(DirectionRefStructure value) {
        this.directionRef = value;
    }

    /**
     * Ruft den Wert der directionName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDirectionName() {
        return directionName;
    }

    /**
     * Legt den Wert der directionName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDirectionName(MultilingualString value) {
        this.directionName = value;
    }

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
     * Ruft den Wert der linePublicCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublicCodeStructure }
     *     
     */
    public PublicCodeStructure getLinePublicCode() {
        return linePublicCode;
    }

    /**
     * Legt den Wert der linePublicCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicCodeStructure }
     *     
     */
    public void setLinePublicCode(PublicCodeStructure value) {
        this.linePublicCode = value;
    }

}
