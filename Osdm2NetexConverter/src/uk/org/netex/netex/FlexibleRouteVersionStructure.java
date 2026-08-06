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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a FLEXIBLE ROUTE.
 * 
 * <p>Java-Klasse f�r FlexibleRoute_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FlexibleRoute_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Route_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}FlexibleRouteGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexibleRoute_VersionStructure", propOrder = {
    "flexibleRouteType"
})
@XmlSeeAlso({
    FlexibleRoute.class
})
public class FlexibleRouteVersionStructure
    extends RouteVersionStructure
{

    @XmlElement(name = "FlexibleRouteType")
    @XmlSchemaType(name = "string")
    protected FlexibleRouteTypeEnumeration flexibleRouteType;

    /**
     * Ruft den Wert der flexibleRouteType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleRouteTypeEnumeration }
     *     
     */
    public FlexibleRouteTypeEnumeration getFlexibleRouteType() {
        return flexibleRouteType;
    }

    /**
     * Legt den Wert der flexibleRouteType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleRouteTypeEnumeration }
     *     
     */
    public void setFlexibleRouteType(FlexibleRouteTypeEnumeration value) {
        this.flexibleRouteType = value;
    }

}
