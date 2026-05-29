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
 * Type for a list of FARE CONTRACT ENTRYs.
 * 
 * <p>Java-Klasse f�r fareContractEntries_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="fareContractEntries_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}FareContractEntryRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}FareContractEntry_Dummy"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fareContractEntries_RelStructure", propOrder = {
    "fareContractEntryRefOrFareContractEntryDummy"
})
public class FareContractEntriesRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "FareContractEntryRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FareContractEntry_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> fareContractEntryRefOrFareContractEntryDummy;

    /**
     * Gets the value of the fareContractEntryRefOrFareContractEntryDummy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareContractEntryRefOrFareContractEntryDummy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareContractEntryRefOrFareContractEntryDummy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OfferedTravelSpecification }{@code >}
     * {@link JAXBElement }{@code <}{@link FareContractEntry }{@code >}
     * {@link JAXBElement }{@code <}{@link FareContractEntryRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RequestedTravelSpecification }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesTransaction }{@code >}
     * {@link JAXBElement }{@code <}{@link TravelSpecificationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OfferedTravelSpecificationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TravelSpecification }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RequestedTravelSpecificationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesTransactionRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getFareContractEntryRefOrFareContractEntryDummy() {
        if (fareContractEntryRefOrFareContractEntryDummy == null) {
            fareContractEntryRefOrFareContractEntryDummy = new ArrayList<JAXBElement<?>>();
        }
        return this.fareContractEntryRefOrFareContractEntryDummy;
    }

}
