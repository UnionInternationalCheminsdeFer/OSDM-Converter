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
 * Type for an ACTIVATION ASSIGNMENT.
 * 
 * <p>Java-Klasse f�r ActivationAssignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ActivationAssignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Assignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ActivationAssignmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivationAssignment_VersionStructure", propOrder = {
    "equipmentRef",
    "linkRef",
    "pointRef"
})
@XmlSeeAlso({
    ActivationAssignment.class
})
public class ActivationAssignmentVersionStructure
    extends AssignmentVersionStructure
{

    @XmlElement(name = "EquipmentRef")
    protected ActivatedEquipmentRefStructure equipmentRef;
    @XmlElement(name = "LinkRef")
    protected ActivationLinkRefStructure linkRef;
    @XmlElement(name = "PointRef")
    protected ActivationPointRefStructure pointRef;

    /**
     * Ruft den Wert der equipmentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActivatedEquipmentRefStructure }
     *     
     */
    public ActivatedEquipmentRefStructure getEquipmentRef() {
        return equipmentRef;
    }

    /**
     * Legt den Wert der equipmentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivatedEquipmentRefStructure }
     *     
     */
    public void setEquipmentRef(ActivatedEquipmentRefStructure value) {
        this.equipmentRef = value;
    }

    /**
     * Ruft den Wert der linkRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActivationLinkRefStructure }
     *     
     */
    public ActivationLinkRefStructure getLinkRef() {
        return linkRef;
    }

    /**
     * Legt den Wert der linkRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationLinkRefStructure }
     *     
     */
    public void setLinkRef(ActivationLinkRefStructure value) {
        this.linkRef = value;
    }

    /**
     * Ruft den Wert der pointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActivationPointRefStructure }
     *     
     */
    public ActivationPointRefStructure getPointRef() {
        return pointRef;
    }

    /**
     * Legt den Wert der pointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationPointRefStructure }
     *     
     */
    public void setPointRef(ActivationPointRefStructure value) {
        this.pointRef = value;
    }

}
