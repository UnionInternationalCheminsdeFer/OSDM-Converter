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
 * Type for a list of properties of DEFAULT SERVICE JOURNEY / RUN TIME.
 * 
 * <p>Java-Klasse f�r defaultServiceJourneyRunTimes_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="defaultServiceJourneyRunTimes_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}strictContainmentAggregationStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}DefaultServiceJourneyRunTime" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "defaultServiceJourneyRunTimes_RelStructure", propOrder = {
    "defaultServiceJourneyRunTime"
})
public class DefaultServiceJourneyRunTimesRelStructure
    extends StrictContainmentAggregationStructure
{

    @XmlElement(name = "DefaultServiceJourneyRunTime", required = true)
    protected List<DefaultServiceJourneyRunTime> defaultServiceJourneyRunTime;

    /**
     * DEFAULT SERVICE JOURNEY / RUN TIME for a specified TIME DEMAND TYPE.Gets the value of the defaultServiceJourneyRunTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultServiceJourneyRunTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefaultServiceJourneyRunTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefaultServiceJourneyRunTime }
     * 
     * 
     */
    public List<DefaultServiceJourneyRunTime> getDefaultServiceJourneyRunTime() {
        if (defaultServiceJourneyRunTime == null) {
            defaultServiceJourneyRunTime = new ArrayList<DefaultServiceJourneyRunTime>();
        }
        return this.defaultServiceJourneyRunTime;
    }

}
