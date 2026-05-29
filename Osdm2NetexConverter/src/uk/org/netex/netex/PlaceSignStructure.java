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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a PLACE SIGN.
 * 
 * <p>Java-Klasse f�r PlaceSignStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PlaceSignStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}SignEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;element name="PlaceName" type="{http://www.netex.org.uk/netex}MultilingualString"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}PlaceRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceSignStructure", propOrder = {
    "placeName",
    "placeRef"
})
@XmlSeeAlso({
    PlaceSign.class
})
public class PlaceSignStructure
    extends SignEquipmentVersionStructure
{

    @XmlElement(name = "PlaceName", required = true)
    protected MultilingualString placeName;
    @XmlElement(name = "PlaceRef")
    protected PlaceRef placeRef;

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
     * Ruft den Wert der placeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlaceRef }
     *     
     */
    public PlaceRef getPlaceRef() {
        return placeRef;
    }

    /**
     * Legt den Wert der placeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceRef }
     *     
     */
    public void setPlaceRef(PlaceRef value) {
        this.placeRef = value;
    }

}
