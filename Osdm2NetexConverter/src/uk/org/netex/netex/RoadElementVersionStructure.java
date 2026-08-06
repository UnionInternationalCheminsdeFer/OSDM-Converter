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
 * Type for ROAD ELEMENT.
 * 
 * <p>Java-Klasse f�r RoadElement_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoadElement_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}InfrastructureLink_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}RoadElementGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadElement_VersionStructure", propOrder = {
    "fromPointRef",
    "toPointRef"
})
@XmlSeeAlso({
    RoadElement.class
})
public class RoadElementVersionStructure
    extends InfrastructureLinkVersionStructure
{

    @XmlElement(name = "FromPointRef", required = true)
    protected RoadPointRefStructure fromPointRef;
    @XmlElement(name = "ToPointRef", required = true)
    protected RoadPointRefStructure toPointRef;

    /**
     * Ruft den Wert der fromPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoadPointRefStructure }
     *     
     */
    public RoadPointRefStructure getFromPointRef() {
        return fromPointRef;
    }

    /**
     * Legt den Wert der fromPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadPointRefStructure }
     *     
     */
    public void setFromPointRef(RoadPointRefStructure value) {
        this.fromPointRef = value;
    }

    /**
     * Ruft den Wert der toPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoadPointRefStructure }
     *     
     */
    public RoadPointRefStructure getToPointRef() {
        return toPointRef;
    }

    /**
     * Legt den Wert der toPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadPointRefStructure }
     *     
     */
    public void setToPointRef(RoadPointRefStructure value) {
        this.toPointRef = value;
    }

}
