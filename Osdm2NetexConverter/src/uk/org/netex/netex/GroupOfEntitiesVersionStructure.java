//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a GROUP OF ENTITies.
 * 
 * <p>Java-Klasse f�r GroupOfEntities_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupOfEntities_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}GroupOfEntitiesGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfEntities_VersionStructure", propOrder = {
    "name",
    "shortName",
    "description",
    "purposeOfGroupingRef",
    "privateCode",
    "infoLinks"
})
@XmlSeeAlso({
    PriceGroupVersionStructure.class,
    StandardFareTableVersionStructure.class,
    FareTableVersionStructure.class,
    GeneralGroupOfEntitiesVersionStructure.class,
    GroupOfTariffZonesVersionStructure.class,
    GroupOfTimebandsVersionedChildStructure.class,
    CrewBaseVersionStructure.class,
    GroupOfDistributionChannelsVersionStructure.class,
    GroupOfLinksVersionStructure.class,
    GroupOfSitesVersionStructure.class,
    GroupOfSingleJourneysVersionStructure.class,
    PoolOfVehiclesVersionStructure.class,
    PointOfInterestClassificationHierarchyVersionStructure.class,
    LogVersionStructure.class,
    GroupOfDistanceMatrixElementsVersionStructure.class,
    GroupOfLinkSequencesVersionStructure.class,
    GroupOfOperatorsStructure.class,
    GroupOfLinesVersionStructure.class,
    JourneyFrequencyGroupVersionStructure.class,
    FleetVersionStructure.class,
    GroupOfSalesOfferPackagesVersionStructure.class,
    GroupOfPlacesVersionStructure.class,
    GroupOfTimingLinksRelStructure.class,
    LayerVersionStructure.class,
    GroupOfServicesVersionStructure.class,
    GroupOfPointsVersionStructure.class,
    GroupOfStopPlacesStructure.class
})
public abstract class GroupOfEntitiesVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "ShortName")
    protected MultilingualString shortName;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "PurposeOfGroupingRef")
    protected PurposeOfGroupingRefStructure purposeOfGroupingRef;
    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    protected GroupOfEntitiesVersionStructure.InfoLinks infoLinks;

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
     * Ruft den Wert der shortName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getShortName() {
        return shortName;
    }

    /**
     * Legt den Wert der shortName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setShortName(MultilingualString value) {
        this.shortName = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescription(MultilingualString value) {
        this.description = value;
    }

    /**
     * Reference to a PURPOSE OF GROUPING.
     * 
     * @return
     *     possible object is
     *     {@link PurposeOfGroupingRefStructure }
     *     
     */
    public PurposeOfGroupingRefStructure getPurposeOfGroupingRef() {
        return purposeOfGroupingRef;
    }

    /**
     * Legt den Wert der purposeOfGroupingRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PurposeOfGroupingRefStructure }
     *     
     */
    public void setPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        this.purposeOfGroupingRef = value;
    }

    /**
     * DEPRECATED - use privateCodes. -v2.0
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getPrivateCode() {
        return privateCode;
    }

    /**
     * Legt den Wert der privateCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setPrivateCode(PrivateCodeStructure value) {
        this.privateCode = value;
    }

    /**
     * Ruft den Wert der infoLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfEntitiesVersionStructure.InfoLinks }
     *     
     */
    public GroupOfEntitiesVersionStructure.InfoLinks getInfoLinks() {
        return infoLinks;
    }

    /**
     * Legt den Wert der infoLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfEntitiesVersionStructure.InfoLinks }
     *     
     */
    public void setInfoLinks(GroupOfEntitiesVersionStructure.InfoLinks value) {
        this.infoLinks = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.netex.org.uk/netex}infoLinks_RelStructure">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class InfoLinks
        extends InfoLinksRelStructure
    {


    }

}
