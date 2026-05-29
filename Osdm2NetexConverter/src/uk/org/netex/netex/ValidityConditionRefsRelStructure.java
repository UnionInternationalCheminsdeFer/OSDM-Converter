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
 * A collection of one or more VALIDITY CONDITIONs.
 * 
 * <p>Java-Klasse f�r validityConditionRefs_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="validityConditionRefs_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}ValidityConditionRef" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validityConditionRefs_RelStructure", propOrder = {
    "validityConditionRef"
})
public class ValidityConditionRefsRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRef(name = "ValidityConditionRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends ValidityConditionRefStructure>> validityConditionRef;

    /**
     * Gets the value of the validityConditionRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validityConditionRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidityConditionRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ValidityTriggerRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidityConditionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AvailabilityConditionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidityRuleParameterRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends ValidityConditionRefStructure>> getValidityConditionRef() {
        if (validityConditionRef == null) {
            validityConditionRef = new ArrayList<JAXBElement<? extends ValidityConditionRefStructure>>();
        }
        return this.validityConditionRef;
    }

}
