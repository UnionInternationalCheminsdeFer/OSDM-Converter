//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for an OVERTAKING POSSIBILITY.
 * 
 * <p>Java-Klasse f�r OvertakingPossibility_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OvertakingPossibility_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}NetworkRestriction_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}OvertakingPossibilityGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvertakingPossibility_VersionStructure", propOrder = {
    "overtakingWidth",
    "overtakingOnLinkRef",
    "overtakingAtPointRef",
    "overtakingVehicleTypeRef",
    "overtakenVehicleTypeRef"
})
@XmlSeeAlso({
    OvertakingPossibility.class
})
public class OvertakingPossibilityVersionStructure
    extends NetworkRestrictionVersionStructure
{

    @XmlElement(name = "OvertakingWidth")
    protected BigDecimal overtakingWidth;
    @XmlElement(name = "OvertakingOnLinkRef", required = true)
    protected LinkRefStructure overtakingOnLinkRef;
    @XmlElement(name = "OvertakingAtPointRef")
    protected PointRefStructure overtakingAtPointRef;
    @XmlElement(name = "OvertakingVehicleTypeRef")
    protected TransportTypeRefStructure overtakingVehicleTypeRef;
    @XmlElement(name = "OvertakenVehicleTypeRef")
    protected TransportTypeRefStructure overtakenVehicleTypeRef;

    /**
     * Ruft den Wert der overtakingWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOvertakingWidth() {
        return overtakingWidth;
    }

    /**
     * Legt den Wert der overtakingWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOvertakingWidth(BigDecimal value) {
        this.overtakingWidth = value;
    }

    /**
     * Ruft den Wert der overtakingOnLinkRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinkRefStructure }
     *     
     */
    public LinkRefStructure getOvertakingOnLinkRef() {
        return overtakingOnLinkRef;
    }

    /**
     * Legt den Wert der overtakingOnLinkRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkRefStructure }
     *     
     */
    public void setOvertakingOnLinkRef(LinkRefStructure value) {
        this.overtakingOnLinkRef = value;
    }

    /**
     * Ruft den Wert der overtakingAtPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointRefStructure }
     *     
     */
    public PointRefStructure getOvertakingAtPointRef() {
        return overtakingAtPointRef;
    }

    /**
     * Legt den Wert der overtakingAtPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointRefStructure }
     *     
     */
    public void setOvertakingAtPointRef(PointRefStructure value) {
        this.overtakingAtPointRef = value;
    }

    /**
     * Ruft den Wert der overtakingVehicleTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransportTypeRefStructure }
     *     
     */
    public TransportTypeRefStructure getOvertakingVehicleTypeRef() {
        return overtakingVehicleTypeRef;
    }

    /**
     * Legt den Wert der overtakingVehicleTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportTypeRefStructure }
     *     
     */
    public void setOvertakingVehicleTypeRef(TransportTypeRefStructure value) {
        this.overtakingVehicleTypeRef = value;
    }

    /**
     * Ruft den Wert der overtakenVehicleTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransportTypeRefStructure }
     *     
     */
    public TransportTypeRefStructure getOvertakenVehicleTypeRef() {
        return overtakenVehicleTypeRef;
    }

    /**
     * Legt den Wert der overtakenVehicleTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportTypeRefStructure }
     *     
     */
    public void setOvertakenVehicleTypeRef(TransportTypeRefStructure value) {
        this.overtakenVehicleTypeRef = value;
    }

}
