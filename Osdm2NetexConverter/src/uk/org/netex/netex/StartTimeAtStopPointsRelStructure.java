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
 * Type for a list of START TIME AT STOP POINT.
 * 
 * <p>Java-Klasse f�r startTimeAtStopPoints_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="startTimeAtStopPoints_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}strictContainmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}StartTimeAtStopPointRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}StartTimeAtStopPoint"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "startTimeAtStopPoints_RelStructure", propOrder = {
    "startTimeAtStopPointRefOrStartTimeAtStopPoint"
})
public class StartTimeAtStopPointsRelStructure
    extends StrictContainmentAggregationStructure
{

    @XmlElements({
        @XmlElement(name = "StartTimeAtStopPointRef", type = VersionOfObjectRefStructure.class),
        @XmlElement(name = "StartTimeAtStopPoint", type = StartTimeAtStopPoint.class)
    })
    protected List<Object> startTimeAtStopPointRefOrStartTimeAtStopPoint;

    /**
     * Gets the value of the startTimeAtStopPointRefOrStartTimeAtStopPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startTimeAtStopPointRefOrStartTimeAtStopPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStartTimeAtStopPointRefOrStartTimeAtStopPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VersionOfObjectRefStructure }
     * {@link StartTimeAtStopPoint }
     * 
     * 
     */
    public List<Object> getStartTimeAtStopPointRefOrStartTimeAtStopPoint() {
        if (startTimeAtStopPointRefOrStartTimeAtStopPoint == null) {
            startTimeAtStopPointRefOrStartTimeAtStopPoint = new ArrayList<Object>();
        }
        return this.startTimeAtStopPointRefOrStartTimeAtStopPoint;
    }

}
