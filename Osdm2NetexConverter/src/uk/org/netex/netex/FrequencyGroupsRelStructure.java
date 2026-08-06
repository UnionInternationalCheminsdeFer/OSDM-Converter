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
 * Type for a list of a VEHICLE JOURNEY FREQUENCies.
 * 
 * <p>Java-Klasse f�r frequencyGroups_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="frequencyGroups_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}HeadwayJourneyGroupRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}HeadwayJourneyGroup"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}RhythmicalJourneyGroupRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}RhythmicalJourneyGroup"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "frequencyGroups_RelStructure", propOrder = {
    "headwayJourneyGroupRefOrHeadwayJourneyGroupOrRhythmicalJourneyGroupRef"
})
public class FrequencyGroupsRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElements({
        @XmlElement(name = "HeadwayJourneyGroupRef", type = HeadwayJourneyGroupRefStructure.class),
        @XmlElement(name = "HeadwayJourneyGroup", type = HeadwayJourneyGroup.class),
        @XmlElement(name = "RhythmicalJourneyGroupRef", type = RhythmicalJourneyGroupRefStructure.class),
        @XmlElement(name = "RhythmicalJourneyGroup", type = RhythmicalJourneyGroup.class)
    })
    protected List<Object> headwayJourneyGroupRefOrHeadwayJourneyGroupOrRhythmicalJourneyGroupRef;

    /**
     * Gets the value of the headwayJourneyGroupRefOrHeadwayJourneyGroupOrRhythmicalJourneyGroupRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headwayJourneyGroupRefOrHeadwayJourneyGroupOrRhythmicalJourneyGroupRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeadwayJourneyGroupRefOrHeadwayJourneyGroupOrRhythmicalJourneyGroupRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeadwayJourneyGroupRefStructure }
     * {@link HeadwayJourneyGroup }
     * {@link RhythmicalJourneyGroupRefStructure }
     * {@link RhythmicalJourneyGroup }
     * 
     * 
     */
    public List<Object> getHeadwayJourneyGroupRefOrHeadwayJourneyGroupOrRhythmicalJourneyGroupRef() {
        if (headwayJourneyGroupRefOrHeadwayJourneyGroupOrRhythmicalJourneyGroupRef == null) {
            headwayJourneyGroupRefOrHeadwayJourneyGroupOrRhythmicalJourneyGroupRef = new ArrayList<Object>();
        }
        return this.headwayJourneyGroupRefOrHeadwayJourneyGroupOrRhythmicalJourneyGroupRef;
    }

}
