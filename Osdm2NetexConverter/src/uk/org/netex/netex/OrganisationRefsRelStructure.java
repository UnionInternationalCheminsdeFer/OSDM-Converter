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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a list of references to an ORGANISATION.
 * 
 * <p>Java-Klasse f�r organisationRefs_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="organisationRefs_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}OrganisationRef_Dummy" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organisationRefs_RelStructure", propOrder = {
    "organisationRefDummy"
})
@XmlSeeAlso({
    uk.org.netex.netex.ContractVersionStructure.Contractees.class
})
public class OrganisationRefsRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRef(name = "OrganisationRef_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends OrganisationRefStructure>> organisationRefDummy;

    /**
     * Gets the value of the organisationRefDummy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationRefDummy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationRefDummy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServicedOrganisationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TravelAgentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OnlineServiceOperatorRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OtherOrganisationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GeneralOrganisationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ManagementAgentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RetailConsortiumRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends OrganisationRefStructure>> getOrganisationRefDummy() {
        if (organisationRefDummy == null) {
            organisationRefDummy = new ArrayList<JAXBElement<? extends OrganisationRefStructure>>();
        }
        return this.organisationRefDummy;
    }

}
