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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for containment in FRAME of OCCUPANCYs.
 * 
 * <p>Java-Klasse f�r OccupancyViewInFrame_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OccupancyViewInFrame_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;sequence>
 *         &lt;element name="OccupancyView" type="{http://www.netex.org.uk/netex}OccupancyView_VersionStructure"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OccupancyViewInFrame_RelStructure", propOrder = {
    "occupancyView"
})
public class OccupancyViewInFrameRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElement(name = "OccupancyView", required = true)
    protected OccupancyViewVersionStructure occupancyView;

    /**
     * Ruft den Wert der occupancyView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OccupancyViewVersionStructure }
     *     
     */
    public OccupancyViewVersionStructure getOccupancyView() {
        return occupancyView;
    }

    /**
     * Legt den Wert der occupancyView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupancyViewVersionStructure }
     *     
     */
    public void setOccupancyView(OccupancyViewVersionStructure value) {
        this.occupancyView = value;
    }

}
