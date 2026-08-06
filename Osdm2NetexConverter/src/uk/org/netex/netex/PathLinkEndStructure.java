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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a PATH LINK END.
 * 
 * <p>Java-Klasse f�r PathLinkEndStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PathLinkEndStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="PlaceRef" type="{http://www.netex.org.uk/netex}PlaceRefStructure"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}GenericPathJunctionRef"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PathLinkEndStructure", propOrder = {
    "placeRef",
    "genericPathJunctionRef"
})
public class PathLinkEndStructure {

    @XmlElement(name = "PlaceRef")
    protected PlaceRefStructure placeRef;
    @XmlElementRef(name = "GenericPathJunctionRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends GenericPathJunctionRefStructure> genericPathJunctionRef;

    /**
     * Ruft den Wert der placeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlaceRefStructure }
     *     
     */
    public PlaceRefStructure getPlaceRef() {
        return placeRef;
    }

    /**
     * Legt den Wert der placeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceRefStructure }
     *     
     */
    public void setPlaceRef(PlaceRefStructure value) {
        this.placeRef = value;
    }

    /**
     * Ruft den Wert der genericPathJunctionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GenericPathJunctionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericPathJunctionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathJunctionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathJunctionRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends GenericPathJunctionRefStructure> getGenericPathJunctionRef() {
        return genericPathJunctionRef;
    }

    /**
     * Legt den Wert der genericPathJunctionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GenericPathJunctionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericPathJunctionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathJunctionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathJunctionRefStructure }{@code >}
     *     
     */
    public void setGenericPathJunctionRef(JAXBElement<? extends GenericPathJunctionRefStructure> value) {
        this.genericPathJunctionRef = value;
    }

}
