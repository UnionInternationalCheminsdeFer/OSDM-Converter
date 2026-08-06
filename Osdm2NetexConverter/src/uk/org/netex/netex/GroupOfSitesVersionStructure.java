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
import net.opengis.gml._3.PolygonType;


/**
 * Type for GROUP OF SITES.
 * 
 * <p>Java-Klasse f�r GroupOfSites_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupOfSites_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfEntities_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}GroupOfSitesGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfSites_VersionStructure", propOrder = {
    "centroid",
    "polygon",
    "projections",
    "alternativeNames",
    "publicCode",
    "members"
})
@XmlSeeAlso({
    GroupOfSites.class
})
public class GroupOfSitesVersionStructure
    extends GroupOfEntitiesVersionStructure
{

    @XmlElement(name = "Centroid")
    protected SimplePointVersionStructure centroid;
    @XmlElement(name = "Polygon", namespace = "http://www.opengis.net/gml/3.2")
    protected PolygonType polygon;
    protected ProjectionsRelStructure projections;
    protected AlternativeNamesRelStructure alternativeNames;
    @XmlElement(name = "PublicCode")
    protected PublicCodeStructure publicCode;
    protected SiteRefsRelStructure members;

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
     * Ruft den Wert der alternativeNames-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeNamesRelStructure }
     *     
     */
    public AlternativeNamesRelStructure getAlternativeNames() {
        return alternativeNames;
    }

    /**
     * Legt den Wert der alternativeNames-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeNamesRelStructure }
     *     
     */
    public void setAlternativeNames(AlternativeNamesRelStructure value) {
        this.alternativeNames = value;
    }

    /**
     * Ruft den Wert der publicCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublicCodeStructure }
     *     
     */
    public PublicCodeStructure getPublicCode() {
        return publicCode;
    }

    /**
     * Legt den Wert der publicCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicCodeStructure }
     *     
     */
    public void setPublicCode(PublicCodeStructure value) {
        this.publicCode = value;
    }

    /**
     * Ruft den Wert der members-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SiteRefsRelStructure }
     *     
     */
    public SiteRefsRelStructure getMembers() {
        return members;
    }

    /**
     * Legt den Wert der members-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteRefsRelStructure }
     *     
     */
    public void setMembers(SiteRefsRelStructure value) {
        this.members = value;
    }

}
