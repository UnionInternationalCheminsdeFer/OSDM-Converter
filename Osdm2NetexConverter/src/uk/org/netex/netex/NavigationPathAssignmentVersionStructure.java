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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a NAVIGATION PATH ASSIGNMENT.
 * 
 * <p>Java-Klasse f�r NavigationPathAssignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NavigationPathAssignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}StopAssignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}NavigationPathAssignmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavigationPathAssignment_VersionStructure", propOrder = {
    "connectionRef",
    "siteRef",
    "siteNavigationPathRef",
    "navigationPathRef"
})
@XmlSeeAlso({
    NavigationPathAssignment.class
})
public class NavigationPathAssignmentVersionStructure
    extends StopAssignmentVersionStructure
{

    @XmlElementRef(name = "ConnectionRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ConnectionRefStructure> connectionRef;
    @XmlElementRef(name = "SiteRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends SiteRefStructure> siteRef;
    @XmlElement(name = "SiteNavigationPathRef")
    protected SiteNavigationPathRefStructure siteNavigationPathRef;
    @XmlElement(name = "NavigationPathRef")
    protected SiteNavigationPathRefStructure navigationPathRef;

    /**
     * Ruft den Wert der connectionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DefaultConnectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConnectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteConnectionRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ConnectionRefStructure> getConnectionRef() {
        return connectionRef;
    }

    /**
     * Legt den Wert der connectionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DefaultConnectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConnectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteConnectionRefStructure }{@code >}
     *     
     */
    public void setConnectionRef(JAXBElement<? extends ConnectionRefStructure> value) {
        this.connectionRef = value;
    }

    /**
     * Ruft den Wert der siteRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceSiteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiRankRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingStationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends SiteRefStructure> getSiteRef() {
        return siteRef;
    }

    /**
     * Legt den Wert der siteRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceSiteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiRankRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechargingStationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     *     
     */
    public void setSiteRef(JAXBElement<? extends SiteRefStructure> value) {
        this.siteRef = value;
    }

    /**
     * Ruft den Wert der siteNavigationPathRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SiteNavigationPathRefStructure }
     *     
     */
    public SiteNavigationPathRefStructure getSiteNavigationPathRef() {
        return siteNavigationPathRef;
    }

    /**
     * Legt den Wert der siteNavigationPathRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteNavigationPathRefStructure }
     *     
     */
    public void setSiteNavigationPathRef(SiteNavigationPathRefStructure value) {
        this.siteNavigationPathRef = value;
    }

    /**
     * Ruft den Wert der navigationPathRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SiteNavigationPathRefStructure }
     *     
     */
    public SiteNavigationPathRefStructure getNavigationPathRef() {
        return navigationPathRef;
    }

    /**
     * Legt den Wert der navigationPathRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteNavigationPathRefStructure }
     *     
     */
    public void setNavigationPathRef(SiteNavigationPathRefStructure value) {
        this.navigationPathRef = value;
    }

}
