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
 * Type for a list of FARE STRUCTURE ELEMENT PRICEs.
 * 
 * <p>Java-Klasse f�r fareStructureElementsInSequence_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="fareStructureElementsInSequence_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}strictContainmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}FareStructureElementInSequence"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}ControllableElementInSequence"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fareStructureElementsInSequence_RelStructure", propOrder = {
    "fareStructureElementInSequenceOrControllableElementInSequence"
})
public class FareStructureElementsInSequenceRelStructure
    extends StrictContainmentAggregationStructure
{

    @XmlElements({
        @XmlElement(name = "FareStructureElementInSequence", type = FareStructureElementInSequence.class),
        @XmlElement(name = "ControllableElementInSequence", type = ControllableElementInSequence.class)
    })
    protected List<FareElementInSequenceVersionedChildStructure> fareStructureElementInSequenceOrControllableElementInSequence;

    /**
     * Gets the value of the fareStructureElementInSequenceOrControllableElementInSequence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareStructureElementInSequenceOrControllableElementInSequence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareStructureElementInSequenceOrControllableElementInSequence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareStructureElementInSequence }
     * {@link ControllableElementInSequence }
     * 
     * 
     */
    public List<FareElementInSequenceVersionedChildStructure> getFareStructureElementInSequenceOrControllableElementInSequence() {
        if (fareStructureElementInSequenceOrControllableElementInSequence == null) {
            fareStructureElementInSequenceOrControllableElementInSequence = new ArrayList<FareElementInSequenceVersionedChildStructure>();
        }
        return this.fareStructureElementInSequenceOrControllableElementInSequence;
    }

}
