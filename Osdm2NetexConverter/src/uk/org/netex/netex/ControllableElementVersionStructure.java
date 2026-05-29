//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for CONTROLLABLE ELEMENT.
 * 
 * <p>Java-Klasse f�r ControllableElement_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ControllableElement_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PriceableObject_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ControllableElementGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControllableElement_VersionStructure", propOrder = {
    "accessRightParameterAssignments",
    "controllableElementsInSequence",
    "prices"
})
@XmlSeeAlso({
    ControllableElement.class
})
public class ControllableElementVersionStructure
    extends PriceableObjectVersionStructure
{

    protected AccessRightParameterAssignmentsRelStructure accessRightParameterAssignments;
    protected ControllableElementsInSequenceRelStructure controllableElementsInSequence;
    protected ControllableElementPricesRelStructure prices;

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

    /**
     * Ruft den Wert der controllableElementsInSequence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ControllableElementsInSequenceRelStructure }
     *     
     */
    public ControllableElementsInSequenceRelStructure getControllableElementsInSequence() {
        return controllableElementsInSequence;
    }

    /**
     * Legt den Wert der controllableElementsInSequence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ControllableElementsInSequenceRelStructure }
     *     
     */
    public void setControllableElementsInSequence(ControllableElementsInSequenceRelStructure value) {
        this.controllableElementsInSequence = value;
    }

    /**
     * Ruft den Wert der prices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ControllableElementPricesRelStructure }
     *     
     */
    public ControllableElementPricesRelStructure getPrices() {
        return prices;
    }

    /**
     * Legt den Wert der prices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ControllableElementPricesRelStructure }
     *     
     */
    public void setPrices(ControllableElementPricesRelStructure value) {
        this.prices = value;
    }

}
