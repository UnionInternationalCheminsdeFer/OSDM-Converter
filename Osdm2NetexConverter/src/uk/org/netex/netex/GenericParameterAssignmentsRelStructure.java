//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a list of FARE ACCESS RIGHT PARAMETERs.
 * 
 * <p>Java-Klasse f�r genericParameterAssignments_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="genericParameterAssignments_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}GenericParameterAssignment"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}GenericParameterAssignmentInContext"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genericParameterAssignments_RelStructure", propOrder = {
    "genericParameterAssignmentOrGenericParameterAssignmentInContext"
})
public class GenericParameterAssignmentsRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElements({
        @XmlElement(name = "GenericParameterAssignment", type = GenericParameterAssignment.class),
        @XmlElement(name = "GenericParameterAssignmentInContext", type = GenericParameterAssignmentInContext.class)
    })
    protected List<GenericParameterAssignmentVersionStructure> genericParameterAssignmentOrGenericParameterAssignmentInContext;

    /**
     * Gets the value of the genericParameterAssignmentOrGenericParameterAssignmentInContext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericParameterAssignmentOrGenericParameterAssignmentInContext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericParameterAssignmentOrGenericParameterAssignmentInContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericParameterAssignment }
     * {@link GenericParameterAssignmentInContext }
     * 
     * 
     */
    public List<GenericParameterAssignmentVersionStructure> getGenericParameterAssignmentOrGenericParameterAssignmentInContext() {
        if (genericParameterAssignmentOrGenericParameterAssignmentInContext == null) {
            genericParameterAssignmentOrGenericParameterAssignmentInContext = new ArrayList<GenericParameterAssignmentVersionStructure>();
        }
        return this.genericParameterAssignmentOrGenericParameterAssignmentInContext;
    }

}
