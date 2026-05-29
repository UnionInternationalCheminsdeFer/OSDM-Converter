//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for GARAGE.
 * 
 * <p>Java-Klasse f�r Garage_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Garage_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}AddressablePlace_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}GarageGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Garage_VersionStructure", propOrder = {
    "contactDetails",
    "organisationRefDummy",
    "operators",
    "garagePoints",
    "crewBases"
})
@XmlSeeAlso({
    Garage.class
})
public class GarageVersionStructure
    extends AddressablePlaceVersionStructure
{

    @XmlElement(name = "ContactDetails")
    protected ContactStructure contactDetails;
    @XmlElementRef(name = "OrganisationRef_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends OrganisationRefStructure> organisationRefDummy;
    protected TransportOrganisationRefsRelStructure operators;
    protected GaragePointsRelStructure garagePoints;
    protected CrewBaseRefsRelStructure crewBases;

    /**
     * Ruft den Wert der contactDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContactStructure }
     *     
     */
    public ContactStructure getContactDetails() {
        return contactDetails;
    }

    /**
     * Legt den Wert der contactDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactStructure }
     *     
     */
    public void setContactDetails(ContactStructure value) {
        this.contactDetails = value;
    }

    /**
     * Ruft den Wert der organisationRefDummy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServicedOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelAgentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineServiceOperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManagementAgentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailConsortiumRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends OrganisationRefStructure> getOrganisationRefDummy() {
        return organisationRefDummy;
    }

    /**
     * Legt den Wert der organisationRefDummy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServicedOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelAgentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineServiceOperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManagementAgentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailConsortiumRefStructure }{@code >}
     *     
     */
    public void setOrganisationRefDummy(JAXBElement<? extends OrganisationRefStructure> value) {
        this.organisationRefDummy = value;
    }

    /**
     * Ruft den Wert der operators-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransportOrganisationRefsRelStructure }
     *     
     */
    public TransportOrganisationRefsRelStructure getOperators() {
        return operators;
    }

    /**
     * Legt den Wert der operators-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportOrganisationRefsRelStructure }
     *     
     */
    public void setOperators(TransportOrganisationRefsRelStructure value) {
        this.operators = value;
    }

    /**
     * Ruft den Wert der garagePoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GaragePointsRelStructure }
     *     
     */
    public GaragePointsRelStructure getGaragePoints() {
        return garagePoints;
    }

    /**
     * Legt den Wert der garagePoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GaragePointsRelStructure }
     *     
     */
    public void setGaragePoints(GaragePointsRelStructure value) {
        this.garagePoints = value;
    }

    /**
     * Ruft den Wert der crewBases-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CrewBaseRefsRelStructure }
     *     
     */
    public CrewBaseRefsRelStructure getCrewBases() {
        return crewBases;
    }

    /**
     * Legt den Wert der crewBases-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CrewBaseRefsRelStructure }
     *     
     */
    public void setCrewBases(CrewBaseRefsRelStructure value) {
        this.crewBases = value;
    }

}
