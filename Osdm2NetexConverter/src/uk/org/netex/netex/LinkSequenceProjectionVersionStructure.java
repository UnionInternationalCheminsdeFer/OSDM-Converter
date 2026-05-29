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
import net.opengis.gml._3.LineStringType;


/**
 * Type for a LINK SEQUENCE PROJECTION.
 * 
 * <p>Java-Klasse f�r LinkSequenceProjection_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LinkSequenceProjection_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Projection_VersionStructure">
 *       &lt;sequence>
 *         &lt;element name="ProjectedLinkSequenceRef" type="{http://www.netex.org.uk/netex}LinkSequenceRefStructure" minOccurs="0"/>
 *         &lt;element name="Distance" type="{http://www.netex.org.uk/netex}DistanceType" minOccurs="0"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}LinkSequenceProjectionGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkSequenceProjection_VersionStructure", propOrder = {
    "projectedLinkSequenceRef",
    "distance",
    "points",
    "lineString"
})
@XmlSeeAlso({
    LinkSequenceProjection.class
})
public class LinkSequenceProjectionVersionStructure
    extends ProjectionVersionStructure
{

    @XmlElement(name = "ProjectedLinkSequenceRef")
    protected LinkSequenceRefStructure projectedLinkSequenceRef;
    @XmlElement(name = "Distance")
    protected BigDecimal distance;
    protected PointRefsRelStructure points;
    @XmlElement(name = "LineString", namespace = "http://www.opengis.net/gml/3.2")
    protected LineStringType lineString;

    /**
     * Ruft den Wert der projectedLinkSequenceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinkSequenceRefStructure }
     *     
     */
    public LinkSequenceRefStructure getProjectedLinkSequenceRef() {
        return projectedLinkSequenceRef;
    }

    /**
     * Legt den Wert der projectedLinkSequenceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkSequenceRefStructure }
     *     
     */
    public void setProjectedLinkSequenceRef(LinkSequenceRefStructure value) {
        this.projectedLinkSequenceRef = value;
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

    /**
     * Ruft den Wert der points-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointRefsRelStructure }
     *     
     */
    public PointRefsRelStructure getPoints() {
        return points;
    }

    /**
     * Legt den Wert der points-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointRefsRelStructure }
     *     
     */
    public void setPoints(PointRefsRelStructure value) {
        this.points = value;
    }

    /**
     * Ruft den Wert der lineString-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LineStringType }
     *     
     */
    public LineStringType getLineString() {
        return lineString;
    }

    /**
     * Legt den Wert der lineString-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStringType }
     *     
     */
    public void setLineString(LineStringType value) {
        this.lineString = value;
    }

}
