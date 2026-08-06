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
 * Type for a ZONE PROJECTION.
 * 
 * <p>Java-Klasse f�r ZoneProjection_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ZoneProjection_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Projection_VersionStructure">
 *       &lt;sequence>
 *         &lt;element name="ProjectedZoneRef" type="{http://www.netex.org.uk/netex}ZoneRefStructure"/>
 *         &lt;element name="ProjectToZoneRef" type="{http://www.netex.org.uk/netex}ZoneRefStructure" minOccurs="0"/>
 *         &lt;element name="ProjectToPointRef" type="{http://www.netex.org.uk/netex}PointRefStructure" minOccurs="0"/>
 *         &lt;element name="points" type="{http://www.netex.org.uk/netex}pointRefs_RelStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneProjection_VersionStructure", propOrder = {
    "projectedZoneRef",
    "projectToZoneRef",
    "projectToPointRef",
    "points"
})
@XmlSeeAlso({
    ZoneProjection.class
})
public class ZoneProjectionVersionStructure
    extends ProjectionVersionStructure
{

    @XmlElement(name = "ProjectedZoneRef", required = true)
    protected ZoneRefStructure projectedZoneRef;
    @XmlElement(name = "ProjectToZoneRef")
    protected ZoneRefStructure projectToZoneRef;
    @XmlElement(name = "ProjectToPointRef")
    protected PointRefStructure projectToPointRef;
    protected PointRefsRelStructure points;

    /**
     * Ruft den Wert der projectedZoneRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ZoneRefStructure }
     *     
     */
    public ZoneRefStructure getProjectedZoneRef() {
        return projectedZoneRef;
    }

    /**
     * Legt den Wert der projectedZoneRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneRefStructure }
     *     
     */
    public void setProjectedZoneRef(ZoneRefStructure value) {
        this.projectedZoneRef = value;
    }

    /**
     * Ruft den Wert der projectToZoneRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ZoneRefStructure }
     *     
     */
    public ZoneRefStructure getProjectToZoneRef() {
        return projectToZoneRef;
    }

    /**
     * Legt den Wert der projectToZoneRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneRefStructure }
     *     
     */
    public void setProjectToZoneRef(ZoneRefStructure value) {
        this.projectToZoneRef = value;
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

}
