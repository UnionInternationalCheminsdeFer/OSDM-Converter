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
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A collection of one or more VALIDITY CONDITIONs.
 * 
 * <p>Java-Klasse f�r validityConditions_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="validityConditions_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}ValidityConditionRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}ValidBetween"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}ValidityCondition_Dummy"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validityConditions_RelStructure", propOrder = {
    "validityConditionRefOrValidBetweenOrValidityConditionDummy"
})
public class ValidityConditionsRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "ValidBetween", namespace = "http://www.netex.org.uk/netex", type = ValidBetween.class, required = false),
        @XmlElementRef(name = "ValidityConditionRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ValidityCondition_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<Object> validityConditionRefOrValidBetweenOrValidityConditionDummy;

    /**
     * Gets the value of the validityConditionRefOrValidBetweenOrValidityConditionDummy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validityConditionRefOrValidBetweenOrValidityConditionDummy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidityConditionRefOrValidBetweenOrValidityConditionDummy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ValidityTriggerRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AvailabilityConditionRefStructure }{@code >}
     * {@link ValidBetween }
     * {@link JAXBElement }{@code <}{@link ValidityCondition }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidityConditionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidDuring }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AvailabilityCondition }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidityRuleParameterRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidityTrigger }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidityRuleParameter }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleAvailabilityCondition }{@code >}
     * 
     * 
     */
    public List<Object> getValidityConditionRefOrValidBetweenOrValidityConditionDummy() {
        if (validityConditionRefOrValidBetweenOrValidityConditionDummy == null) {
            validityConditionRefOrValidBetweenOrValidityConditionDummy = new ArrayList<Object>();
        }
        return this.validityConditionRefOrValidBetweenOrValidityConditionDummy;
    }

}
