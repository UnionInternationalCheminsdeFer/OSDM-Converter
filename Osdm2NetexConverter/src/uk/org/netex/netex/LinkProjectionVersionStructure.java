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
 * Type for a LINK PROJECTION.
 * 
 * <p>Java-Klasse f�r LinkProjection_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LinkProjection_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Projection_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}LinkProjectionGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkProjection_VersionStructure", propOrder = {
    "projectedLinkRef",
    "projectToLinkRef",
    "startPointOnLinkRef",
    "startPointOnLinkByValue",
    "endPointOnLinkRef",
    "endPointOnLinkByValue"
})
@XmlSeeAlso({
    LinkProjection.class
})
public class LinkProjectionVersionStructure
    extends ProjectionVersionStructure
{

    @XmlElement(name = "ProjectedLinkRef")
    protected LinkRefStructure projectedLinkRef;
    @XmlElement(name = "ProjectToLinkRef")
    protected LinkRefStructure projectToLinkRef;
    @XmlElement(name = "StartPointOnLinkRef")
    protected PointOnLinkRefStructure startPointOnLinkRef;
    @XmlElement(name = "StartPointOnLinkByValue")
    protected PointOnLinkByValueStructure startPointOnLinkByValue;
    @XmlElement(name = "EndPointOnLinkRef")
    protected PointOnLinkRefStructure endPointOnLinkRef;
    @XmlElement(name = "EndPointOnLinkByValue")
    protected PointOnLinkByValueStructure endPointOnLinkByValue;

    /**
     * Ruft den Wert der projectedLinkRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinkRefStructure }
     *     
     */
    public LinkRefStructure getProjectedLinkRef() {
        return projectedLinkRef;
    }

    /**
     * Legt den Wert der projectedLinkRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkRefStructure }
     *     
     */
    public void setProjectedLinkRef(LinkRefStructure value) {
        this.projectedLinkRef = value;
    }

    /**
     * Ruft den Wert der projectToLinkRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinkRefStructure }
     *     
     */
    public LinkRefStructure getProjectToLinkRef() {
        return projectToLinkRef;
    }

    /**
     * Legt den Wert der projectToLinkRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkRefStructure }
     *     
     */
    public void setProjectToLinkRef(LinkRefStructure value) {
        this.projectToLinkRef = value;
    }

    /**
     * Ruft den Wert der startPointOnLinkRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointOnLinkRefStructure }
     *     
     */
    public PointOnLinkRefStructure getStartPointOnLinkRef() {
        return startPointOnLinkRef;
    }

    /**
     * Legt den Wert der startPointOnLinkRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOnLinkRefStructure }
     *     
     */
    public void setStartPointOnLinkRef(PointOnLinkRefStructure value) {
        this.startPointOnLinkRef = value;
    }

    /**
     * Ruft den Wert der startPointOnLinkByValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointOnLinkByValueStructure }
     *     
     */
    public PointOnLinkByValueStructure getStartPointOnLinkByValue() {
        return startPointOnLinkByValue;
    }

    /**
     * Legt den Wert der startPointOnLinkByValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOnLinkByValueStructure }
     *     
     */
    public void setStartPointOnLinkByValue(PointOnLinkByValueStructure value) {
        this.startPointOnLinkByValue = value;
    }

    /**
     * Ruft den Wert der endPointOnLinkRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointOnLinkRefStructure }
     *     
     */
    public PointOnLinkRefStructure getEndPointOnLinkRef() {
        return endPointOnLinkRef;
    }

    /**
     * Legt den Wert der endPointOnLinkRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOnLinkRefStructure }
     *     
     */
    public void setEndPointOnLinkRef(PointOnLinkRefStructure value) {
        this.endPointOnLinkRef = value;
    }

    /**
     * Ruft den Wert der endPointOnLinkByValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointOnLinkByValueStructure }
     *     
     */
    public PointOnLinkByValueStructure getEndPointOnLinkByValue() {
        return endPointOnLinkByValue;
    }

    /**
     * Legt den Wert der endPointOnLinkByValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOnLinkByValueStructure }
     *     
     */
    public void setEndPointOnLinkByValue(PointOnLinkByValueStructure value) {
        this.endPointOnLinkByValue = value;
    }

}
