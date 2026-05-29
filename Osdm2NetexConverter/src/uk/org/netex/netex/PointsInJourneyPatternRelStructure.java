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
 * Type for POINT IN JOURNEY PATTERN.
 * 
 * <p>Java-Klasse f�r pointsInJourneyPattern_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="pointsInJourneyPattern_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}strictContainmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded" minOccurs="2">
 *         &lt;element ref="{http://www.netex.org.uk/netex}PointInJourneyPattern"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}StopPointInJourneyPattern"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}TimingPointInJourneyPattern"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pointsInJourneyPattern_RelStructure", propOrder = {
    "pointInJourneyPatternOrStopPointInJourneyPatternOrTimingPointInJourneyPattern"
})
public class PointsInJourneyPatternRelStructure
    extends StrictContainmentAggregationStructure
{

    @XmlElements({
        @XmlElement(name = "PointInJourneyPattern", type = PointInJourneyPattern.class),
        @XmlElement(name = "StopPointInJourneyPattern", type = StopPointInJourneyPattern.class),
        @XmlElement(name = "TimingPointInJourneyPattern", type = TimingPointInJourneyPattern.class)
    })
    protected List<PointInLinkSequenceVersionedChildStructure> pointInJourneyPatternOrStopPointInJourneyPatternOrTimingPointInJourneyPattern;

    /**
     * Gets the value of the pointInJourneyPatternOrStopPointInJourneyPatternOrTimingPointInJourneyPattern property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointInJourneyPatternOrStopPointInJourneyPatternOrTimingPointInJourneyPattern property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointInJourneyPatternOrStopPointInJourneyPatternOrTimingPointInJourneyPattern().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointInJourneyPattern }
     * {@link StopPointInJourneyPattern }
     * {@link TimingPointInJourneyPattern }
     * 
     * 
     */
    public List<PointInLinkSequenceVersionedChildStructure> getPointInJourneyPatternOrStopPointInJourneyPatternOrTimingPointInJourneyPattern() {
        if (pointInJourneyPatternOrStopPointInJourneyPatternOrTimingPointInJourneyPattern == null) {
            pointInJourneyPatternOrStopPointInJourneyPatternOrTimingPointInJourneyPattern = new ArrayList<PointInLinkSequenceVersionedChildStructure>();
        }
        return this.pointInJourneyPatternOrStopPointInJourneyPatternOrTimingPointInJourneyPattern;
    }

}
