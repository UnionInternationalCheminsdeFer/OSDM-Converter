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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for PRICING SERVICE.
 * 
 * <p>Java-Klasse f�r PricingService_VersionedStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PricingService_VersionedStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PricingServiceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingService_VersionedStructure", propOrder = {
    "name",
    "organisationRefDummy",
    "url"
})
@XmlSeeAlso({
    PricingService.class
})
public class PricingServiceVersionedStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElementRef(name = "OrganisationRef_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends OrganisationRefStructure> organisationRefDummy;
    @XmlElement(name = "Url")
    @XmlSchemaType(name = "anyURI")
    protected String url;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
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
     * Ruft den Wert der url-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Legt den Wert der url-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

}
