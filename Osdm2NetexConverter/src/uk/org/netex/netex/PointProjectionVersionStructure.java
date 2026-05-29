//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a POINT PROJECTION.
 * 
 * <p>Java-Klasse f�r PointProjection_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PointProjection_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Projection_VersionStructure">
 *       &lt;sequence>
 *         &lt;element name="ProjectedPointRef" type="{http://www.netex.org.uk/netex}PointRefStructure" minOccurs="0"/>
 *         &lt;element name="ProjectToPointRef" type="{http://www.netex.org.uk/netex}PointRefStructure" minOccurs="0"/>
 *         &lt;element name="ProjectToLinkRef" type="{http://www.netex.org.uk/netex}LinkRefStructure" minOccurs="0"/>
 *         &lt;element name="Distance" type="{http://www.netex.org.uk/netex}LengthType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointProjection_VersionStructure", propOrder = {
    "projectedPointRef",
    "projectToPointRef",
    "projectToLinkRef",
    "distance"
})
@XmlSeeAlso({
    PointProjection.class
})
public class PointProjectionVersionStructure
    extends ProjectionVersionStructure
{

    @XmlElement(name = "ProjectedPointRef")
    protected PointRefStructure projectedPointRef;
    @XmlElement(name = "ProjectToPointRef")
    protected PointRefStructure projectToPointRef;
    @XmlElement(name = "ProjectToLinkRef")
    protected LinkRefStructure projectToLinkRef;
    @XmlElement(name = "Distance")
    protected BigDecimal distance;

    /**
     * Ruft den Wert der projectedPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointRefStructure }
     *     
     */
    public PointRefStructure getProjectedPointRef() {
        return projectedPointRef;
    }

    /**
     * Legt den Wert der projectedPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointRefStructure }
     *     
     */
    public void setProjectedPointRef(PointRefStructure value) {
        this.projectedPointRef = value;
    }

    /**
     * Ruft den Wert der projectToPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointRefStructure }
     *     
     */
    public PointRefStructure getProjectToPointRef() {
        return projectToPointRef;
    }

    /**
     * Legt den Wert der projectToPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointRefStructure }
     *     
     */
    public void setProjectToPointRef(PointRefStructure value) {
        this.projectToPointRef = value;
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
     * Ruft den Wert der distance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistance() {
        return distance;
    }

    /**
     * Legt den Wert der distance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistance(BigDecimal value) {
        this.distance = value;
    }

}
