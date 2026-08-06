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
 * Type for a PATH LINK VIEW.
 * 
 * <p>Java-Klasse f�r GenericPathLink_DerivedViewStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GenericPathLink_DerivedViewStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DerivedViewStructure">
 *       &lt;sequence>
 *         &lt;element name="HideLink" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HideDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowEntranceSeparately" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowExitSeparately" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowHeadingSeparately" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericPathLink_DerivedViewStructure", propOrder = {
    "hideLink",
    "hideDestination",
    "showEntranceSeparately",
    "showExitSeparately",
    "showHeadingSeparately"
})
@XmlSeeAlso({
    PathLinkView.class
})
public class GenericPathLinkDerivedViewStructure
    extends DerivedViewStructure
{

    @XmlElement(name = "HideLink")
    protected Boolean hideLink;
    @XmlElement(name = "HideDestination")
    protected Boolean hideDestination;
    @XmlElement(name = "ShowEntranceSeparately")
    protected Boolean showEntranceSeparately;
    @XmlElement(name = "ShowExitSeparately")
    protected Boolean showExitSeparately;
    @XmlElement(name = "ShowHeadingSeparately")
    protected Boolean showHeadingSeparately;

    /**
     * Ruft den Wert der hideLink-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideLink() {
        return hideLink;
    }

    /**
     * Legt den Wert der hideLink-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideLink(Boolean value) {
        this.hideLink = value;
    }

    /**
     * Ruft den Wert der hideDestination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideDestination() {
        return hideDestination;
    }

    /**
     * Legt den Wert der hideDestination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideDestination(Boolean value) {
        this.hideDestination = value;
    }

    /**
     * Ruft den Wert der showEntranceSeparately-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowEntranceSeparately() {
        return showEntranceSeparately;
    }

    /**
     * Legt den Wert der showEntranceSeparately-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowEntranceSeparately(Boolean value) {
        this.showEntranceSeparately = value;
    }

    /**
     * Ruft den Wert der showExitSeparately-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowExitSeparately() {
        return showExitSeparately;
    }

    /**
     * Legt den Wert der showExitSeparately-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowExitSeparately(Boolean value) {
        this.showExitSeparately = value;
    }

    /**
     * Ruft den Wert der showHeadingSeparately-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowHeadingSeparately() {
        return showHeadingSeparately;
    }

    /**
     * Legt den Wert der showHeadingSeparately-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowHeadingSeparately(Boolean value) {
        this.showHeadingSeparately = value;
    }

}
