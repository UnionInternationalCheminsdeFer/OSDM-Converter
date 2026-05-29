//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a list of FARE ACCESS RIGHT PARAMETERs.
 * 
 * <p>Java-Klasse f�r accessRightParameterAssignments_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="accessRightParameterAssignments_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}AccessRightParameterAssignment_Dummy" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accessRightParameterAssignments_RelStructure", propOrder = {
    "accessRightParameterAssignmentDummy"
})
public class AccessRightParameterAssignmentsRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRef(name = "AccessRightParameterAssignment_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends DataManagedObjectStructure>> accessRightParameterAssignmentDummy;

    /**
     * A sequence or set of CONTROLLABLE ELEMENTs to which rules for limitation of access rights and calculation of prices (fare structure) are applied.Gets the value of the accessRightParameterAssignmentDummy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessRightParameterAssignmentDummy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessRightParameterAssignmentDummy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link SpecificParameterAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link GenericParameterAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link GenericParameterAssignmentInContext }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidityParameterAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link AccessRightParameterAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomerPurchaseParameterAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends DataManagedObjectStructure>> getAccessRightParameterAssignmentDummy() {
        if (accessRightParameterAssignmentDummy == null) {
            accessRightParameterAssignmentDummy = new ArrayList<JAXBElement<? extends DataManagedObjectStructure>>();
        }
        return this.accessRightParameterAssignmentDummy;
    }

}
