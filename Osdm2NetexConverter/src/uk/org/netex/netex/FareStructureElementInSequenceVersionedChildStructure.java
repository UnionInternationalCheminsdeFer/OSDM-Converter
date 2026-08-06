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
 * Type for FARE STRUCTURE ELEMENT IN SEQUENCE.
 * 
 * <p>Java-Klasse f�r FareStructureElementInSequence_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FareStructureElementInSequence_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}FareElementInSequence_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}FareStructureElementInSequenceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareStructureElementInSequence_VersionedChildStructure", propOrder = {
    "fareStructureElementRef",
    "validableElementRef",
    "validityParameterAssignments",
    "genericParameterAssignment",
    "genericParameterAssignmentInContext"
})
@XmlSeeAlso({
    FareStructureElementInSequence.class
})
public class FareStructureElementInSequenceVersionedChildStructure
    extends FareElementInSequenceVersionedChildStructure
{

    @XmlElement(name = "FareStructureElementRef")
    protected FareStructureElementRefStructure fareStructureElementRef;
    @XmlElement(name = "ValidableElementRef")
    protected ValidableElementRefStructure validableElementRef;
    protected GenericParameterAssignmentsRelStructure validityParameterAssignments;
    @XmlElement(name = "GenericParameterAssignment")
    protected GenericParameterAssignment genericParameterAssignment;
    @XmlElement(name = "GenericParameterAssignmentInContext")
    protected GenericParameterAssignmentInContext genericParameterAssignmentInContext;

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
     * Ruft den Wert der validableElementRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidableElementRefStructure }
     *     
     */
    public ValidableElementRefStructure getValidableElementRef() {
        return validableElementRef;
    }

    /**
     * Legt den Wert der validableElementRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidableElementRefStructure }
     *     
     */
    public void setValidableElementRef(ValidableElementRefStructure value) {
        this.validableElementRef = value;
    }

    /**
     * Ruft den Wert der validityParameterAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GenericParameterAssignmentsRelStructure }
     *     
     */
    public GenericParameterAssignmentsRelStructure getValidityParameterAssignments() {
        return validityParameterAssignments;
    }

    /**
     * Legt den Wert der validityParameterAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericParameterAssignmentsRelStructure }
     *     
     */
    public void setValidityParameterAssignments(GenericParameterAssignmentsRelStructure value) {
        this.validityParameterAssignments = value;
    }

    /**
     * Optimisation: A single instance of a A VALIDITY PARAMETER ASSIGNMENT specifying practical parameters during a TRAVEL GenericATION, within a given fare structure (e.g. the origin or destination zone in a zone-counting system).
     * 
     * @return
     *     possible object is
     *     {@link GenericParameterAssignment }
     *     
     */
    public GenericParameterAssignment getGenericParameterAssignment() {
        return genericParameterAssignment;
    }

    /**
     * Legt den Wert der genericParameterAssignment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericParameterAssignment }
     *     
     */
    public void setGenericParameterAssignment(GenericParameterAssignment value) {
        this.genericParameterAssignment = value;
    }

    /**
     * Optimisation: Can be used without identity constraint A VALIDITY PARAMETER ASSIGNMENT specifying practical parameters during a TRAVEL GenericATION, within a given fare structure (e.g. the origin or destination zone in a zone-counting system).
     * 
     * @return
     *     possible object is
     *     {@link GenericParameterAssignmentInContext }
     *     
     */
    public GenericParameterAssignmentInContext getGenericParameterAssignmentInContext() {
        return genericParameterAssignmentInContext;
    }

    /**
     * Legt den Wert der genericParameterAssignmentInContext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericParameterAssignmentInContext }
     *     
     */
    public void setGenericParameterAssignmentInContext(GenericParameterAssignmentInContext value) {
        this.genericParameterAssignmentInContext = value;
    }

}
