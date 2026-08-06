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
 * Type for a LINK.
 * 
 * <p>Java-Klasse f�r Link_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Link_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}LinkGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Link_VersionStructure", propOrder = {
    "name",
    "distance",
    "types",
    "lineString",
    "projections",
    "passingThrough"
})
@XmlSeeAlso({
    RouteLinkVersionStructure.class,
    TimingLinkVersionStructure.class,
    VehicleMeetingLinkVersionStructure.class,
    ServiceLinkVersionStructure.class,
    GenericPathLinkVersionStructure.class,
    InfrastructureLinkVersionStructure.class,
    ActivationLinkVersionStructure.class
})
public abstract class LinkVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Distance")
    protected BigDecimal distance;
    protected LinkTypeRefsRelStructure types;
    @XmlElement(name = "LineString", namespace = "http://www.opengis.net/gml/3.2")
    protected LineStringType lineString;
    protected ProjectionsRelStructure projections;
    protected PointsOnLinkRelStructure passingThrough;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
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
     * Ruft den Wert der types-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinkTypeRefsRelStructure }
     *     
     */
    public LinkTypeRefsRelStructure getTypes() {
        return types;
    }

    /**
     * Legt den Wert der types-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkTypeRefsRelStructure }
     *     
     */
    public void setTypes(LinkTypeRefsRelStructure value) {
        this.types = value;
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
     * Ruft den Wert der passingThrough-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointsOnLinkRelStructure }
     *     
     */
    public PointsOnLinkRelStructure getPassingThrough() {
        return passingThrough;
    }

    /**
     * Legt den Wert der passingThrough-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointsOnLinkRelStructure }
     *     
     */
    public void setPassingThrough(PointsOnLinkRelStructure value) {
        this.passingThrough = value;
    }

}
