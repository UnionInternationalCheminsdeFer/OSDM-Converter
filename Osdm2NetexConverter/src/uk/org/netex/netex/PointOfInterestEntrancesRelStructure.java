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
 * Type for a list of POINT OF INTEREST ENTRANCEs.
 * 
 * <p>Java-Klasse f�r pointOfInterestEntrances_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="pointOfInterestEntrances_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="PointOfInterestEntranceRef" type="{http://www.netex.org.uk/netex}SiteComponentRefStructure"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}PointOfInterestEntrance"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pointOfInterestEntrances_RelStructure", propOrder = {
    "pointOfInterestEntranceRefOrPointOfInterestEntrance"
})
public class PointOfInterestEntrancesRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElements({
        @XmlElement(name = "PointOfInterestEntranceRef", type = SiteComponentRefStructure.class),
        @XmlElement(name = "PointOfInterestEntrance", type = PointOfInterestEntrance.class)
    })
    protected List<Object> pointOfInterestEntranceRefOrPointOfInterestEntrance;

    /**
     * Gets the value of the pointOfInterestEntranceRefOrPointOfInterestEntrance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOfInterestEntranceRefOrPointOfInterestEntrance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOfInterestEntranceRefOrPointOfInterestEntrance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteComponentRefStructure }
     * {@link PointOfInterestEntrance }
     * 
     * 
     */
    public List<Object> getPointOfInterestEntranceRefOrPointOfInterestEntrance() {
        if (pointOfInterestEntranceRefOrPointOfInterestEntrance == null) {
            pointOfInterestEntranceRefOrPointOfInterestEntrance = new ArrayList<Object>();
        }
        return this.pointOfInterestEntranceRefOrPointOfInterestEntrance;
    }

}
