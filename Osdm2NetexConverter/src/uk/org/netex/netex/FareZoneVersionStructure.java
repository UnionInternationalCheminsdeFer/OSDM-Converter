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
 * Type for a FARE ZONE.
 * 
 * <p>Java-Klasse f�r FareZone_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FareZone_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}TariffZone_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}FareZoneGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareZone_VersionStructure", propOrder = {
    "parentFareZoneRef",
    "zoneTopology",
    "scopingMethod",
    "transportOrganisationRef",
    "groupOfOperatorsRef",
    "fareSections",
    "contains",
    "neighbours"
})
@XmlSeeAlso({
    FareZone.class
})
public class FareZoneVersionStructure
    extends TariffZoneVersionStructure
{

    @XmlElement(name = "ParentFareZoneRef")
    protected FareZoneRefStructure parentFareZoneRef;
    @XmlElement(name = "ZoneTopology")
    @XmlSchemaType(name = "normalizedString")
    protected ZoneTopologyEnumeration zoneTopology;
    @XmlElement(name = "ScopingMethod", defaultValue = "explicitStops")
    @XmlSchemaType(name = "normalizedString")
    protected ScopingMethodEnumeration scopingMethod;
    @XmlElementRef(name = "TransportOrganisationRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TransportOrganisationRefStructure> transportOrganisationRef;
    @XmlElement(name = "GroupOfOperatorsRef")
    protected GroupOfOperatorsRefStructure groupOfOperatorsRef;
    protected FareSectionsRelStructure fareSections;
    protected TariffZoneRefsRelStructure contains;
    protected FareZoneRefsRelStructure neighbours;

    /**
     * Ruft den Wert der parentFareZoneRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareZoneRefStructure }
     *     
     */
    public FareZoneRefStructure getParentFareZoneRef() {
        return parentFareZoneRef;
    }

    /**
     * Legt den Wert der parentFareZoneRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareZoneRefStructure }
     *     
     */
    public void setParentFareZoneRef(FareZoneRefStructure value) {
        this.parentFareZoneRef = value;
    }

    /**
     * Ruft den Wert der zoneTopology-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ZoneTopologyEnumeration }
     *     
     */
    public ZoneTopologyEnumeration getZoneTopology() {
        return zoneTopology;
    }

    /**
     * Legt den Wert der zoneTopology-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneTopologyEnumeration }
     *     
     */
    public void setZoneTopology(ZoneTopologyEnumeration value) {
        this.zoneTopology = value;
    }

    /**
     * Ruft den Wert der scopingMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScopingMethodEnumeration }
     *     
     */
    public ScopingMethodEnumeration getScopingMethod() {
        return scopingMethod;
    }

    /**
     * Legt den Wert der scopingMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopingMethodEnumeration }
     *     
     */
    public void setScopingMethod(ScopingMethodEnumeration value) {
        this.scopingMethod = value;
    }

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
     * Ruft den Wert der groupOfOperatorsRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfOperatorsRefStructure }
     *     
     */
    public GroupOfOperatorsRefStructure getGroupOfOperatorsRef() {
        return groupOfOperatorsRef;
    }

    /**
     * Legt den Wert der groupOfOperatorsRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfOperatorsRefStructure }
     *     
     */
    public void setGroupOfOperatorsRef(GroupOfOperatorsRefStructure value) {
        this.groupOfOperatorsRef = value;
    }

    /**
     * Ruft den Wert der fareSections-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareSectionsRelStructure }
     *     
     */
    public FareSectionsRelStructure getFareSections() {
        return fareSections;
    }

    /**
     * Legt den Wert der fareSections-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareSectionsRelStructure }
     *     
     */
    public void setFareSections(FareSectionsRelStructure value) {
        this.fareSections = value;
    }

    /**
     * Ruft den Wert der contains-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TariffZoneRefsRelStructure }
     *     
     */
    public TariffZoneRefsRelStructure getContains() {
        return contains;
    }

    /**
     * Legt den Wert der contains-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffZoneRefsRelStructure }
     *     
     */
    public void setContains(TariffZoneRefsRelStructure value) {
        this.contains = value;
    }

    /**
     * Ruft den Wert der neighbours-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareZoneRefsRelStructure }
     *     
     */
    public FareZoneRefsRelStructure getNeighbours() {
        return neighbours;
    }

    /**
     * Legt den Wert der neighbours-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareZoneRefsRelStructure }
     *     
     */
    public void setNeighbours(FareZoneRefsRelStructure value) {
        this.neighbours = value;
    }

}
