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
 * Type for a list of OPERATING PERIODs.
 * 
 * <p>Java-Klasse f�r operatingPeriods_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="operatingPeriods_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}OperatingPeriodRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}OperatingPeriod"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}UicOperatingPeriod"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operatingPeriods_RelStructure", propOrder = {
    "operatingPeriodRefOrOperatingPeriodOrUicOperatingPeriod"
})
public class OperatingPeriodsRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "OperatingPeriodRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UicOperatingPeriod", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OperatingPeriod", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> operatingPeriodRefOrOperatingPeriodOrUicOperatingPeriod;

    /**
     * Gets the value of the operatingPeriodRefOrOperatingPeriodOrUicOperatingPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatingPeriodRefOrOperatingPeriodOrUicOperatingPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatingPeriodRefOrOperatingPeriodOrUicOperatingPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link OperatingPeriodRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OperatingPeriod }{@code >}
     * {@link JAXBElement }{@code <}{@link OperatingPeriodRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link UicOperatingPeriod }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getOperatingPeriodRefOrOperatingPeriodOrUicOperatingPeriod() {
        if (operatingPeriodRefOrOperatingPeriodOrUicOperatingPeriod == null) {
            operatingPeriodRefOrOperatingPeriodOrUicOperatingPeriod = new ArrayList<JAXBElement<?>>();
        }
        return this.operatingPeriodRefOrOperatingPeriodOrUicOperatingPeriod;
    }

}
