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
 * Type for VEHICLE MEETING LINK.
 * 
 * <p>Java-Klasse f�r VehicleMeetingLink_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleMeetingLink_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Link_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehicleMeetingLinkGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleMeetingLink_VersionStructure", propOrder = {
    "fromPointRef",
    "toPointRef"
})
@XmlSeeAlso({
    VehicleMeetingLink.class
})
public class VehicleMeetingLinkVersionStructure
    extends LinkVersionStructure
{

    @XmlElement(name = "FromPointRef", required = true)
    protected VehicleMeetingPointRefStructure fromPointRef;
    @XmlElement(name = "ToPointRef", required = true)
    protected VehicleMeetingPointRefStructure toPointRef;

    /**
     * Ruft den Wert der fromPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMeetingPointRefStructure }
     *     
     */
    public VehicleMeetingPointRefStructure getFromPointRef() {
        return fromPointRef;
    }

    /**
     * Legt den Wert der fromPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMeetingPointRefStructure }
     *     
     */
    public void setFromPointRef(VehicleMeetingPointRefStructure value) {
        this.fromPointRef = value;
    }

    /**
     * Ruft den Wert der toPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMeetingPointRefStructure }
     *     
     */
    public VehicleMeetingPointRefStructure getToPointRef() {
        return toPointRef;
    }

    /**
     * Legt den Wert der toPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMeetingPointRefStructure }
     *     
     */
    public void setToPointRef(VehicleMeetingPointRefStructure value) {
        this.toPointRef = value;
    }

}
