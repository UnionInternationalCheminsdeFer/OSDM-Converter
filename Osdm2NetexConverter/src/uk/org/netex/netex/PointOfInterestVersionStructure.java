//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a POINT OF INTEREST.
 * 
 * <p>Java-Klasse f�r PointOfInterest_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PointOfInterest_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Site_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PointOfInterestGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInterest_VersionStructure", propOrder = {
    "classifications",
    "spaces",
    "nearTopographicPlaces",
    "pathLinks",
    "pathJunctions",
    "accesses",
    "navigationPaths"
})
@XmlSeeAlso({
    PointOfInterest.class
})
public class PointOfInterestVersionStructure
    extends SiteVersionStructure
{

    protected PointOfInterestClassificationsViewsRelStructure classifications;
    protected PointOfInterestSpacesRelStructure spaces;
    protected TopographicPlaceRefsRelStructure nearTopographicPlaces;
    protected SitePathLinksRelStructure pathLinks;
    protected SitePathJunctionsRelStructure pathJunctions;
    protected AccessesRelStructure accesses;
    protected NavigationPathsRelStructure navigationPaths;

    /**
     * Ruft den Wert der classifications-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInterestClassificationsViewsRelStructure }
     *     
     */
    public PointOfInterestClassificationsViewsRelStructure getClassifications() {
        return classifications;
    }

    /**
     * Legt den Wert der classifications-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInterestClassificationsViewsRelStructure }
     *     
     */
    public void setClassifications(PointOfInterestClassificationsViewsRelStructure value) {
        this.classifications = value;
    }

    /**
     * Ruft den Wert der spaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInterestSpacesRelStructure }
     *     
     */
    public PointOfInterestSpacesRelStructure getSpaces() {
        return spaces;
    }

    /**
     * Legt den Wert der spaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInterestSpacesRelStructure }
     *     
     */
    public void setSpaces(PointOfInterestSpacesRelStructure value) {
        this.spaces = value;
    }

    /**
     * Ruft den Wert der nearTopographicPlaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceRefsRelStructure }
     *     
     */
    public TopographicPlaceRefsRelStructure getNearTopographicPlaces() {
        return nearTopographicPlaces;
    }

    /**
     * Legt den Wert der nearTopographicPlaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceRefsRelStructure }
     *     
     */
    public void setNearTopographicPlaces(TopographicPlaceRefsRelStructure value) {
        this.nearTopographicPlaces = value;
    }

    /**
     * Ruft den Wert der pathLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SitePathLinksRelStructure }
     *     
     */
    public SitePathLinksRelStructure getPathLinks() {
        return pathLinks;
    }

    /**
     * Legt den Wert der pathLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SitePathLinksRelStructure }
     *     
     */
    public void setPathLinks(SitePathLinksRelStructure value) {
        this.pathLinks = value;
    }

    /**
     * Ruft den Wert der pathJunctions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SitePathJunctionsRelStructure }
     *     
     */
    public SitePathJunctionsRelStructure getPathJunctions() {
        return pathJunctions;
    }

    /**
     * Legt den Wert der pathJunctions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SitePathJunctionsRelStructure }
     *     
     */
    public void setPathJunctions(SitePathJunctionsRelStructure value) {
        this.pathJunctions = value;
    }

    /**
     * Ruft den Wert der accesses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessesRelStructure }
     *     
     */
    public AccessesRelStructure getAccesses() {
        return accesses;
    }

    /**
     * Legt den Wert der accesses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessesRelStructure }
     *     
     */
    public void setAccesses(AccessesRelStructure value) {
        this.accesses = value;
    }

    /**
     * Ruft den Wert der navigationPaths-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NavigationPathsRelStructure }
     *     
     */
    public NavigationPathsRelStructure getNavigationPaths() {
        return navigationPaths;
    }

    /**
     * Legt den Wert der navigationPaths-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NavigationPathsRelStructure }
     *     
     */
    public void setNavigationPaths(NavigationPathsRelStructure value) {
        this.navigationPaths = value;
    }

}
