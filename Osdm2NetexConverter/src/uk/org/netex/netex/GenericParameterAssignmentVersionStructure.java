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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for Generic PARAMETER ASSIGNMENT.
 * 
 * <p>Java-Klasse f�r GenericParameterAssignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GenericParameterAssignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}ValidityParameterAssignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}GenericParameterAssignmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericParameterAssignment_VersionStructure", propOrder = {
    "includesGroupingType",
    "includes"
})
@XmlSeeAlso({
    GenericParameterAssignment.class,
    GenericParameterAssignmentInContext.class
})
public class GenericParameterAssignmentVersionStructure
    extends ValidityParameterAssignmentVersionStructure
{

    @XmlElement(name = "IncludesGroupingType", defaultValue = "OR")
    @XmlSchemaType(name = "NMTOKEN")
    protected LogicalOperationEnumeration includesGroupingType;
    protected GenericParameterAssignmentsRelStructure includes;

    /**
     * Ruft den Wert der includesGroupingType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LogicalOperationEnumeration }
     *     
     */
    public LogicalOperationEnumeration getIncludesGroupingType() {
        return includesGroupingType;
    }

    /**
     * Legt den Wert der includesGroupingType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalOperationEnumeration }
     *     
     */
    public void setIncludesGroupingType(LogicalOperationEnumeration value) {
        this.includesGroupingType = value;
    }

    /**
     * Ruft den Wert der includes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GenericParameterAssignmentsRelStructure }
     *     
     */
    public GenericParameterAssignmentsRelStructure getIncludes() {
        return includes;
    }

    /**
     * Legt den Wert der includes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericParameterAssignmentsRelStructure }
     *     
     */
    public void setIncludes(GenericParameterAssignmentsRelStructure value) {
        this.includes = value;
    }

}
