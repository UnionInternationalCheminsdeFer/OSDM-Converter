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
 * Type for containment in frame of ORGANISATION.
 * 
 * <p>Java-Klasse f�r organisationsInFrame_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="organisationsInFrame_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}Organisation_Dummy" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organisationsInFrame_RelStructure", propOrder = {
    "organisationDummy"
})
public class OrganisationsInFrameRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRef(name = "Organisation_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends DataManagedObjectStructure>> organisationDummy;

    /**
     * Gets the value of the organisationDummy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationDummy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationDummy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link GeneralOrganisation }{@code >}
     * {@link JAXBElement }{@code <}{@link Authority }{@code >}
     * {@link JAXBElement }{@code <}{@link RetailConsortium }{@code >}
     * {@link JAXBElement }{@code <}{@link ManagementAgent }{@code >}
     * {@link JAXBElement }{@code <}{@link Operator }{@code >}
     * {@link JAXBElement }{@code <}{@link TravelAgent }{@code >}
     * {@link JAXBElement }{@code <}{@link ServicedOrganisation }{@code >}
     * {@link JAXBElement }{@code <}{@link OnlineServiceOperator }{@code >}
     * {@link JAXBElement }{@code <}{@link TransportOrganisation }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Organisation }{@code >}
     * {@link JAXBElement }{@code <}{@link OtherOrganisation }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends DataManagedObjectStructure>> getOrganisationDummy() {
        if (organisationDummy == null) {
            organisationDummy = new ArrayList<JAXBElement<? extends DataManagedObjectStructure>>();
        }
        return this.organisationDummy;
    }

}
