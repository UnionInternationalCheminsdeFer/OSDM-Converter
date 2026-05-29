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
 * Type for an ADDRESSABLE PLACE.
 * 
 * <p>Java-Klasse f�r AddressablePlace_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AddressablePlace_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Place_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}AddressablePlaceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressablePlace_VersionStructure", propOrder = {
    "url",
    "image",
    "postalAddress",
    "roadAddress"
})
@XmlSeeAlso({
    AddressablePlace.class,
    VehicleMeetingPlaceVersionStructure.class,
    GarageVersionStructure.class,
    SiteElementVersionStructure.class
})
public class AddressablePlaceVersionStructure
    extends PlaceVersionStructure
{

    @XmlElement(name = "Url")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(name = "Image")
    @XmlSchemaType(name = "anyURI")
    protected String image;
    @XmlElement(name = "PostalAddress")
    protected PostalAddress postalAddress;
    @XmlElement(name = "RoadAddress")
    protected RoadAddress roadAddress;

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
     * Ruft den Wert der image-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * Legt den Wert der image-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
    }

    /**
     * Ruft den Wert der postalAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress }
     *     
     */
    public PostalAddress getPostalAddress() {
        return postalAddress;
    }

    /**
     * Legt den Wert der postalAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress }
     *     
     */
    public void setPostalAddress(PostalAddress value) {
        this.postalAddress = value;
    }

    /**
     * ADDRESS of a numbered building on a named road.
     * 
     * @return
     *     possible object is
     *     {@link RoadAddress }
     *     
     */
    public RoadAddress getRoadAddress() {
        return roadAddress;
    }

    /**
     * Legt den Wert der roadAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadAddress }
     *     
     */
    public void setRoadAddress(RoadAddress value) {
        this.roadAddress = value;
    }

}
