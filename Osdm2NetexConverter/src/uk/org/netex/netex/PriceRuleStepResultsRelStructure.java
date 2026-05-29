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
 * Type for a list of rules step calculation results
 * 
 * <p>Java-Klasse f�r priceRuleStepResults_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="priceRuleStepResults_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}strictContainmentAggregationStructure">
 *       &lt;sequence>
 *         &lt;element name="RuleStepResult" type="{http://www.netex.org.uk/netex}PriceRuleStepResultStructure" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priceRuleStepResults_RelStructure", propOrder = {
    "ruleStepResult"
})
public class PriceRuleStepResultsRelStructure
    extends StrictContainmentAggregationStructure
{

    @XmlElement(name = "RuleStepResult", required = true)
    protected List<PriceRuleStepResultStructure> ruleStepResult;

    /**
     * Gets the value of the ruleStepResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleStepResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleStepResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceRuleStepResultStructure }
     * 
     * 
     */
    public List<PriceRuleStepResultStructure> getRuleStepResult() {
        if (ruleStepResult == null) {
            ruleStepResult = new ArrayList<PriceRuleStepResultStructure>();
        }
        return this.ruleStepResult;
    }

}
