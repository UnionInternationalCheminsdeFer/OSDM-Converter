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
 * Type for ROUTE POINT.
 * 
 * <p>Java-Klasse f�r RoutePoint_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoutePoint_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Point_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}RoutePointGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePoint_VersionStructure", propOrder = {
    "viaFlag",
    "borderCrossing"
})
@XmlSeeAlso({
    RoutePoint.class
})
public class RoutePointVersionStructure
    extends PointVersionStructure
{

    @XmlElement(name = "ViaFlag", defaultValue = "false")
    protected Boolean viaFlag;
    @XmlElement(name = "BorderCrossing", defaultValue = "false")
    protected Boolean borderCrossing;

    /**
     * Ruft den Wert der viaFlag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViaFlag() {
        return viaFlag;
    }

    /**
     * Legt den Wert der viaFlag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViaFlag(Boolean value) {
        this.viaFlag = value;
    }

    /**
     * Ruft den Wert der borderCrossing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBorderCrossing() {
        return borderCrossing;
    }

    /**
     * Legt den Wert der borderCrossing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBorderCrossing(Boolean value) {
        this.borderCrossing = value;
    }

}
