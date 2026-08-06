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
import jakarta.xml.bind.annotation.XmlType;


/**
 * A collection of one or more VALIDITY TRIGGERs.
 * 
 * <p>Java-Klasse f�r complexFeatureMembers_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="complexFeatureMembers_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;sequence>
 *         &lt;element name="ComplexFeatureMember" type="{http://www.netex.org.uk/netex}ComplexFeatureMember_VersionedChildStructure" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complexFeatureMembers_RelStructure", propOrder = {
    "complexFeatureMember"
})
public class ComplexFeatureMembersRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElement(name = "ComplexFeatureMember", required = true)
    protected List<ComplexFeatureMemberVersionedChildStructure> complexFeatureMember;

    /**
     * Gets the value of the complexFeatureMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complexFeatureMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplexFeatureMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComplexFeatureMemberVersionedChildStructure }
     * 
     * 
     */
    public List<ComplexFeatureMemberVersionedChildStructure> getComplexFeatureMember() {
        if (complexFeatureMember == null) {
            complexFeatureMember = new ArrayList<ComplexFeatureMemberVersionedChildStructure>();
        }
        return this.complexFeatureMember;
    }

}
