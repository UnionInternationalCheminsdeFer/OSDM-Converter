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
 * Type for an ADMINISTRATIVE ZONE.
 * 
 * <p>Java-Klasse f�r AdministrativeZone_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AdministrativeZone_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Zone_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}AdministrativeZoneGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdministrativeZone_VersionStructure", propOrder = {
    "publicCode",
    "organisationRefDummy",
    "responsibilities",
    "codespaceAssignments",
    "subzones"
})
@XmlSeeAlso({
    AdministrativeZone.class,
    TransportAdministrativeZoneVersionStructure.class
})
public class AdministrativeZoneVersionStructure
    extends ZoneVersionStructure
{

    @XmlElement(name = "PublicCode")
    protected PublicCodeStructure publicCode;
    @XmlElementRef(name = "OrganisationRef_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends OrganisationRefStructure> organisationRefDummy;
    protected ResponsibilitySetsRelStructure responsibilities;
    protected CodespaceAssignmentsRelStructure codespaceAssignments;
    protected AdministrativeZonesRelStructure subzones;

    /**
     * Ruft den Wert der publicCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublicCodeStructure }
     *     
     */
    public PublicCodeStructure getPublicCode() {
        return publicCode;
    }

    /**
     * Legt den Wert der publicCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicCodeStructure }
     *     
     */
    public void setPublicCode(PublicCodeStructure value) {
        this.publicCode = value;
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
     * Ruft den Wert der responsibilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponsibilitySetsRelStructure }
     *     
     */
    public ResponsibilitySetsRelStructure getResponsibilities() {
        return responsibilities;
    }

    /**
     * Legt den Wert der responsibilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsibilitySetsRelStructure }
     *     
     */
    public void setResponsibilities(ResponsibilitySetsRelStructure value) {
        this.responsibilities = value;
    }

    /**
     * Ruft den Wert der codespaceAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodespaceAssignmentsRelStructure }
     *     
     */
    public CodespaceAssignmentsRelStructure getCodespaceAssignments() {
        return codespaceAssignments;
    }

    /**
     * Legt den Wert der codespaceAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodespaceAssignmentsRelStructure }
     *     
     */
    public void setCodespaceAssignments(CodespaceAssignmentsRelStructure value) {
        this.codespaceAssignments = value;
    }

    /**
     * Ruft den Wert der subzones-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AdministrativeZonesRelStructure }
     *     
     */
    public AdministrativeZonesRelStructure getSubzones() {
        return subzones;
    }

    /**
     * Legt den Wert der subzones-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrativeZonesRelStructure }
     *     
     */
    public void setSubzones(AdministrativeZonesRelStructure value) {
        this.subzones = value;
    }

}
