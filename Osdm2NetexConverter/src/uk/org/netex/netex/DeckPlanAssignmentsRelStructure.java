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
 * Type for containment in frame of DECK PLAN ASSIGNMENTs
 * 
 * <p>Java-Klasse f�r deckPlanAssignments_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="deckPlanAssignments_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}DeckPlanAssignment" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deckPlanAssignments_RelStructure", propOrder = {
    "deckPlanAssignment"
})
public class DeckPlanAssignmentsRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElement(name = "DeckPlanAssignment", required = true)
    protected List<DeckPlanAssignment> deckPlanAssignment;

    /**
     * Gets the value of the deckPlanAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deckPlanAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeckPlanAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeckPlanAssignment }
     * 
     * 
     */
    public List<DeckPlanAssignment> getDeckPlanAssignment() {
        if (deckPlanAssignment == null) {
            deckPlanAssignment = new ArrayList<DeckPlanAssignment>();
        }
        return this.deckPlanAssignment;
    }

}
