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
 * Type for a DISTANCE MATRIX ELEMENT PRICEs.
 * 
 * <p>Java-Klasse f�r DistanceMatrixElementPrice_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DistanceMatrixElementPrice_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}FarePrice_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DistanceMatrixElementPriceGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistanceMatrixElementPrice_VersionedChildStructure", propOrder = {
    "distanceMatrixElementRef",
    "groupOfDistanceMatrixElementsRef"
})
@XmlSeeAlso({
    DistanceMatrixElementPrice.class
})
public class DistanceMatrixElementPriceVersionedChildStructure
    extends FarePriceVersionedChildStructure
{

    @XmlElement(name = "DistanceMatrixElementRef")
    protected DistanceMatrixElementRef distanceMatrixElementRef;
    @XmlElement(name = "GroupOfDistanceMatrixElementsRef")
    protected GroupOfDistanceMatrixElementsRefStructureElement groupOfDistanceMatrixElementsRef;

    /**
     * Ruft den Wert der distanceMatrixElementRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistanceMatrixElementRef }
     *     
     */
    public DistanceMatrixElementRef getDistanceMatrixElementRef() {
        return distanceMatrixElementRef;
    }

    /**
     * Legt den Wert der distanceMatrixElementRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceMatrixElementRef }
     *     
     */
    public void setDistanceMatrixElementRef(DistanceMatrixElementRef value) {
        this.distanceMatrixElementRef = value;
    }

    /**
     * Ruft den Wert der groupOfDistanceMatrixElementsRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfDistanceMatrixElementsRefStructureElement }
     *     
     */
    public GroupOfDistanceMatrixElementsRefStructureElement getGroupOfDistanceMatrixElementsRef() {
        return groupOfDistanceMatrixElementsRef;
    }

    /**
     * Legt den Wert der groupOfDistanceMatrixElementsRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfDistanceMatrixElementsRefStructureElement }
     *     
     */
    public void setGroupOfDistanceMatrixElementsRef(GroupOfDistanceMatrixElementsRefStructureElement value) {
        this.groupOfDistanceMatrixElementsRef = value;
    }

}
