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
import jakarta.xml.bind.annotation.XmlType;


/**
 * End of Flight of stairs.
 * 
 * <p>Java-Klasse f�r StairEndStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StairEndStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContinuingHandrail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TexturedSurface" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VisualContrast" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StairEndStructure", propOrder = {
    "continuingHandrail",
    "texturedSurface",
    "visualContrast"
})
public class StairEndStructure {

    @XmlElement(name = "ContinuingHandrail")
    protected Boolean continuingHandrail;
    @XmlElement(name = "TexturedSurface")
    protected Boolean texturedSurface;
    @XmlElement(name = "VisualContrast")
    protected Boolean visualContrast;

    /**
     * Ruft den Wert der continuingHandrail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContinuingHandrail() {
        return continuingHandrail;
    }

    /**
     * Legt den Wert der continuingHandrail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContinuingHandrail(Boolean value) {
        this.continuingHandrail = value;
    }

    /**
     * Ruft den Wert der texturedSurface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTexturedSurface() {
        return texturedSurface;
    }

    /**
     * Legt den Wert der texturedSurface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTexturedSurface(Boolean value) {
        this.texturedSurface = value;
    }

    /**
     * Ruft den Wert der visualContrast-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisualContrast() {
        return visualContrast;
    }

    /**
     * Legt den Wert der visualContrast-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisualContrast(Boolean value) {
        this.visualContrast = value;
    }

}
