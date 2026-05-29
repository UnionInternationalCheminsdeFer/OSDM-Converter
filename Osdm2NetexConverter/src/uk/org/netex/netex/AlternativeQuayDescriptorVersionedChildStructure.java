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
 * Type for a STOP PLACE COMPONENT.
 * 
 * <p>Java-Klasse f�r AlternativeQuayDescriptor_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AlternativeQuayDescriptor_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}AlternativeName_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}RelativeLocationGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternativeQuayDescriptor_VersionedChildStructure", propOrder = {
    "crossRoad",
    "landmark"
})
@XmlSeeAlso({
    AlternativeQuayDescriptor.class
})
public class AlternativeQuayDescriptorVersionedChildStructure
    extends AlternativeNameVersionedChildStructure
{

    @XmlElement(name = "CrossRoad")
    protected MultilingualString crossRoad;
    @XmlElement(name = "Landmark")
    protected MultilingualString landmark;

    /**
     * Ruft den Wert der crossRoad-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getCrossRoad() {
        return crossRoad;
    }

    /**
     * Legt den Wert der crossRoad-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setCrossRoad(MultilingualString value) {
        this.crossRoad = value;
    }

    /**
     * Ruft den Wert der landmark-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getLandmark() {
        return landmark;
    }

    /**
     * Legt den Wert der landmark-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setLandmark(MultilingualString value) {
        this.landmark = value;
    }

}
