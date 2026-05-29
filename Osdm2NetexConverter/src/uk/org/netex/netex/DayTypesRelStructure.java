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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a list of DAY TYPEs.
 * 
 * <p>Java-Klasse f�r dayTypes_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dayTypes_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}DayTypeRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}DayType_Dummy"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dayTypes_RelStructure", propOrder = {
    "dayTypeRefOrDayTypeDummy"
})
@XmlSeeAlso({
    uk.org.netex.netex.UsageValidityPeriodVersionStructure.StartOnlyOn.class
})
public class DayTypesRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "DayType_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DayTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> dayTypeRefOrDayTypeDummy;

    /**
     * Gets the value of the dayTypeRefOrDayTypeDummy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dayTypeRefOrDayTypeDummy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayTypeRefOrDayTypeDummy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DayType }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareDayTypeRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationDayType }{@code >}
     * {@link JAXBElement }{@code <}{@link FareDayType }{@code >}
     * {@link JAXBElement }{@code <}{@link DayTypeRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getDayTypeRefOrDayTypeDummy() {
        if (dayTypeRefOrDayTypeDummy == null) {
            dayTypeRefOrDayTypeDummy = new ArrayList<JAXBElement<?>>();
        }
        return this.dayTypeRefOrDayTypeDummy;
    }

}
