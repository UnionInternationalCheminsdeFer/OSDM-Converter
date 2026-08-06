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
 * Type for a list of TIMING POINTs.
 * 
 * <p>Java-Klasse f�r timingPoints_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="timingPoints_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}TimingPoint_Dummy" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timingPoints_RelStructure", propOrder = {
    "timingPointDummy"
})
public class TimingPointsRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRef(name = "TimingPoint_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends PointVersionStructure>> timingPointDummy;

    /**
     * TIMING POINT.Gets the value of the timingPointDummy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timingPointDummy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimingPointDummy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PointVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ReliefPointVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GaragePoint }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingPoint }{@code >}
     * {@link JAXBElement }{@code <}{@link TimingPoint }{@code >}
     * {@link JAXBElement }{@code <}{@link TimingPointVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ReliefPoint }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends PointVersionStructure>> getTimingPointDummy() {
        if (timingPointDummy == null) {
            timingPointDummy = new ArrayList<JAXBElement<? extends PointVersionStructure>>();
        }
        return this.timingPointDummy;
    }

}
