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
 * Type for CONTROLLABLE ELEMENT IN SEQUENCE.
 * 
 * <p>Java-Klasse f�r ControllableElementInSequence_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ControllableElementInSequence_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}FareElementInSequence_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ControllableElementInSequenceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControllableElementInSequence_VersionedChildStructure", propOrder = {
    "controllableElementRef",
    "fareStructureElementRef",
    "accessRightParameterAssignments"
})
@XmlSeeAlso({
    ControllableElementInSequence.class
})
public class ControllableElementInSequenceVersionedChildStructure
    extends FareElementInSequenceVersionedChildStructure
{

    @XmlElement(name = "ControllableElementRef")
    protected ControllableElementRefStructure controllableElementRef;
    @XmlElement(name = "FareStructureElementRef")
    protected FareStructureElementRefStructure fareStructureElementRef;
    protected AccessRightParameterAssignmentsRelStructure accessRightParameterAssignments;

    /**
     * Ruft den Wert der controllableElementRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ControllableElementRefStructure }
     *     
     */
    public ControllableElementRefStructure getControllableElementRef() {
        return controllableElementRef;
    }

    /**
     * Legt den Wert der controllableElementRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ControllableElementRefStructure }
     *     
     */
    public void setControllableElementRef(ControllableElementRefStructure value) {
        this.controllableElementRef = value;
    }

    /**
     * Ruft den Wert der fareStructureElementRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareStructureElementRefStructure }
     *     
     */
    public FareStructureElementRefStructure getFareStructureElementRef() {
        return fareStructureElementRef;
    }

    /**
     * Legt den Wert der fareStructureElementRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareStructureElementRefStructure }
     *     
     */
    public void setFareStructureElementRef(FareStructureElementRefStructure value) {
        this.fareStructureElementRef = value;
    }

    /**
     * Ruft den Wert der accessRightParameterAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessRightParameterAssignmentsRelStructure }
     *     
     */
    public AccessRightParameterAssignmentsRelStructure getAccessRightParameterAssignments() {
        return accessRightParameterAssignments;
    }

    /**
     * Legt den Wert der accessRightParameterAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessRightParameterAssignmentsRelStructure }
     *     
     */
    public void setAccessRightParameterAssignments(AccessRightParameterAssignmentsRelStructure value) {
        this.accessRightParameterAssignments = value;
    }

}
