//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for containment in frame of SITE PATH JUNCTIONs.
 * 
 * <p>Java-Klasse f�r sitePathJunctionsInFrame_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="sitePathJunctionsInFrame_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}SitePathJunction"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}PathJunction"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sitePathJunctionsInFrame_RelStructure", propOrder = {
    "sitePathJunctionOrPathJunction"
})
public class SitePathJunctionsInFrameRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElements({
        @XmlElement(name = "SitePathJunction", type = SitePathJunction.class),
        @XmlElement(name = "PathJunction", type = PathJunction.class)
    })
    protected List<SitePathJunctionVersionStructure> sitePathJunctionOrPathJunction;

    /**
     * Gets the value of the sitePathJunctionOrPathJunction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sitePathJunctionOrPathJunction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSitePathJunctionOrPathJunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SitePathJunction }
     * {@link PathJunction }
     * 
     * 
     */
    public List<SitePathJunctionVersionStructure> getSitePathJunctionOrPathJunction() {
        if (sitePathJunctionOrPathJunction == null) {
            sitePathJunctionOrPathJunction = new ArrayList<SitePathJunctionVersionStructure>();
        }
        return this.sitePathJunctionOrPathJunction;
    }

}
