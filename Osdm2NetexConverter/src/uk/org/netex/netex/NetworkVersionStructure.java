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
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a NETWORK.
 * 
 * <p>Java-Klasse f�r Network_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Network_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfLines_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}NetworkGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Network_VersionStructure", propOrder = {
    "transportOrganisationRef",
    "groupsOfOperators",
    "groupsOfLines",
    "tariffZones"
})
@XmlSeeAlso({
    Network.class
})
public class NetworkVersionStructure
    extends GroupOfLinesVersionStructure
{

    @XmlElementRef(name = "TransportOrganisationRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TransportOrganisationRefStructure> transportOrganisationRef;
    protected GroupsOfOperatorsRefsRelStructure groupsOfOperators;
    protected GroupsOfLinesInFrameRelStructure groupsOfLines;
    protected TariffZoneRefsRelStructure tariffZones;

    /**
     * Ruft den Wert der transportOrganisationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TransportOrganisationRefStructure> getTransportOrganisationRef() {
        return transportOrganisationRef;
    }

    /**
     * Legt den Wert der transportOrganisationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     
     */
    public void setTransportOrganisationRef(JAXBElement<? extends TransportOrganisationRefStructure> value) {
        this.transportOrganisationRef = value;
    }

    /**
     * Ruft den Wert der groupsOfOperators-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupsOfOperatorsRefsRelStructure }
     *     
     */
    public GroupsOfOperatorsRefsRelStructure getGroupsOfOperators() {
        return groupsOfOperators;
    }

    /**
     * Legt den Wert der groupsOfOperators-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupsOfOperatorsRefsRelStructure }
     *     
     */
    public void setGroupsOfOperators(GroupsOfOperatorsRefsRelStructure value) {
        this.groupsOfOperators = value;
    }

    /**
     * Ruft den Wert der groupsOfLines-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupsOfLinesInFrameRelStructure }
     *     
     */
    public GroupsOfLinesInFrameRelStructure getGroupsOfLines() {
        return groupsOfLines;
    }

    /**
     * Legt den Wert der groupsOfLines-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupsOfLinesInFrameRelStructure }
     *     
     */
    public void setGroupsOfLines(GroupsOfLinesInFrameRelStructure value) {
        this.groupsOfLines = value;
    }

    /**
     * Ruft den Wert der tariffZones-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TariffZoneRefsRelStructure }
     *     
     */
    public TariffZoneRefsRelStructure getTariffZones() {
        return tariffZones;
    }

    /**
     * Legt den Wert der tariffZones-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffZoneRefsRelStructure }
     *     
     */
    public void setTariffZones(TariffZoneRefsRelStructure value) {
        this.tariffZones = value;
    }

}
