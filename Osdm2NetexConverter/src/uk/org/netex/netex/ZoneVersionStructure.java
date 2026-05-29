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
import net.opengis.gml._3.MultiSurfaceType;
import net.opengis.gml._3.PolygonType;


/**
 * Type for a ZONE.
 * 
 * <p>Java-Klasse f�r Zone_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Zone_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfPoints_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ZoneGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Zone_VersionStructure", propOrder = {
    "types",
    "centroid",
    "polygon",
    "multiSurface",
    "projections",
    "parentZoneRef"
})
@XmlSeeAlso({
    MobilityServiceConstraintZoneVersionStructure.class,
    GeneralZoneVersionStructure.class,
    AdministrativeZoneVersionStructure.class,
    RoutingConstraintZoneVersionStructure.class,
    TariffZoneVersionStructure.class,
    AccessZoneVersionStructure.class,
    DeckVersionStructure.class,
    OnboardSpaceVersionStructure.class,
    StopAreaVersionStructure.class,
    PlaceVersionStructure.class
})
public class ZoneVersionStructure
    extends GroupOfPointsVersionStructure
{

    protected TypeOfZoneRefsRelStructure types;
    @XmlElement(name = "Centroid")
    protected SimplePointVersionStructure centroid;
    @XmlElement(name = "Polygon", namespace = "http://www.opengis.net/gml/3.2")
    protected PolygonType polygon;
    @XmlElement(name = "MultiSurface", namespace = "http://www.opengis.net/gml/3.2")
    protected MultiSurfaceType multiSurface;
    protected ProjectionsRelStructure projections;
    @XmlElement(name = "ParentZoneRef")
    protected ZoneRefStructure parentZoneRef;

    /**
     * Ruft den Wert der types-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfZoneRefsRelStructure }
     *     
     */
    public TypeOfZoneRefsRelStructure getTypes() {
        return types;
    }

    /**
     * Legt den Wert der types-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfZoneRefsRelStructure }
     *     
     */
    public void setTypes(TypeOfZoneRefsRelStructure value) {
        this.types = value;
    }

    /**
     * Ruft den Wert der centroid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SimplePointVersionStructure }
     *     
     */
    public SimplePointVersionStructure getCentroid() {
        return centroid;
    }

    /**
     * Legt den Wert der centroid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SimplePointVersionStructure }
     *     
     */
    public void setCentroid(SimplePointVersionStructure value) {
        this.centroid = value;
    }

    /**
     * Ruft den Wert der polygon-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PolygonType }
     *     
     */
    public PolygonType getPolygon() {
        return polygon;
    }

    /**
     * Legt den Wert der polygon-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PolygonType }
     *     
     */
    public void setPolygon(PolygonType value) {
        this.polygon = value;
    }

    /**
     * Ruft den Wert der multiSurface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultiSurfaceType }
     *     
     */
    public MultiSurfaceType getMultiSurface() {
        return multiSurface;
    }

    /**
     * Legt den Wert der multiSurface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSurfaceType }
     *     
     */
    public void setMultiSurface(MultiSurfaceType value) {
        this.multiSurface = value;
    }

    /**
     * Ruft den Wert der projections-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProjectionsRelStructure }
     *     
     */
    public ProjectionsRelStructure getProjections() {
        return projections;
    }

    /**
     * Legt den Wert der projections-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectionsRelStructure }
     *     
     */
    public void setProjections(ProjectionsRelStructure value) {
        this.projections = value;
    }

    /**
     * Ruft den Wert der parentZoneRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ZoneRefStructure }
     *     
     */
    public ZoneRefStructure getParentZoneRef() {
        return parentZoneRef;
    }

    /**
     * Legt den Wert der parentZoneRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneRefStructure }
     *     
     */
    public void setParentZoneRef(ZoneRefStructure value) {
        this.parentZoneRef = value;
    }

}
