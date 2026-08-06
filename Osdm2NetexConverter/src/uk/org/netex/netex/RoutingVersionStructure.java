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
 * Type for ROUTING.
 * 
 * <p>Java-Klasse f�r Routing_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Routing_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}RoutingGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Routing_VersionStructure", propOrder = {
    "isRestricted",
    "returnRouteIdentical",
    "forwardsOnly",
    "crossBorder"
})
@XmlSeeAlso({
    Routing.class
})
public class RoutingVersionStructure
    extends UsageParameterVersionStructure
{

    @XmlElement(name = "IsRestricted")
    protected Boolean isRestricted;
    @XmlElement(name = "ReturnRouteIdentical")
    protected Boolean returnRouteIdentical;
    @XmlElement(name = "ForwardsOnly")
    protected Boolean forwardsOnly;
    @XmlElement(name = "CrossBorder")
    protected Boolean crossBorder;

    /**
     * Ruft den Wert der isRestricted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRestricted() {
        return isRestricted;
    }

    /**
     * Legt den Wert der isRestricted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRestricted(Boolean value) {
        this.isRestricted = value;
    }

    /**
     * Ruft den Wert der returnRouteIdentical-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnRouteIdentical() {
        return returnRouteIdentical;
    }

    /**
     * Legt den Wert der returnRouteIdentical-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnRouteIdentical(Boolean value) {
        this.returnRouteIdentical = value;
    }

    /**
     * Ruft den Wert der forwardsOnly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForwardsOnly() {
        return forwardsOnly;
    }

    /**
     * Legt den Wert der forwardsOnly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForwardsOnly(Boolean value) {
        this.forwardsOnly = value;
    }

    /**
     * Ruft den Wert der crossBorder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossBorder() {
        return crossBorder;
    }

    /**
     * Legt den Wert der crossBorder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossBorder(Boolean value) {
        this.crossBorder = value;
    }

}
