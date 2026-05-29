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
 * Type for a SITE CONNECTION.
 * 
 * <p>Java-Klasse f�r SiteConnection_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SiteConnection_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Transfer_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SiteConnectionGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteConnection_VersionStructure", propOrder = {
    "from",
    "to",
    "navigationPaths"
})
@XmlSeeAlso({
    SiteConnection.class
})
public class SiteConnectionVersionStructure
    extends TransferVersionStructure
{

    @XmlElement(name = "From")
    protected SiteConnectionEndStructure from;
    @XmlElement(name = "To")
    protected SiteConnectionEndStructure to;
    protected NavigationPathsRelStructure navigationPaths;

    /**
     * Ruft den Wert der from-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SiteConnectionEndStructure }
     *     
     */
    public SiteConnectionEndStructure getFrom() {
        return from;
    }

    /**
     * Legt den Wert der from-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteConnectionEndStructure }
     *     
     */
    public void setFrom(SiteConnectionEndStructure value) {
        this.from = value;
    }

    /**
     * Ruft den Wert der to-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SiteConnectionEndStructure }
     *     
     */
    public SiteConnectionEndStructure getTo() {
        return to;
    }

    /**
     * Legt den Wert der to-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteConnectionEndStructure }
     *     
     */
    public void setTo(SiteConnectionEndStructure value) {
        this.to = value;
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
