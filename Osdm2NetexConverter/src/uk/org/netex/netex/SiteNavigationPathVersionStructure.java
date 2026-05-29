//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for NAVIGATION PATH.
 * 
 * <p>Java-Klasse f�r SiteNavigationPath_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SiteNavigationPath_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}GenericNavigationPath_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SiteNavigationPathGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteNavigationPath_VersionStructure", propOrder = {
    "from",
    "to",
    "accessibilityAssessment",
    "accessModes",
    "summaries",
    "transferDuration",
    "publicUse",
    "covered",
    "gated",
    "lighting",
    "allAreasWheelchairAccessible",
    "personCapacity",
    "presentation",
    "facilities",
    "accessFeatureList",
    "navigationType",
    "placesInSequence",
    "pathLinksInSequence",
    "transfers"
})
@XmlSeeAlso({
    NavigationPath.class,
    SiteNavigationPath.class
})
public class SiteNavigationPathVersionStructure
    extends GenericNavigationPathVersionStructure
{

    @XmlElement(name = "From")
    protected SitePathLinkEndStructure from;
    @XmlElement(name = "To")
    protected SitePathLinkEndStructure to;
    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessment accessibilityAssessment;
    @XmlList
    @XmlElement(name = "AccessModes")
    protected List<AccessModeEnumeration> accessModes;
    protected AccessSummariesRelStructure summaries;
    @XmlElement(name = "TransferDuration")
    protected TransferDurationStructure transferDuration;
    @XmlElement(name = "PublicUse", defaultValue = "all")
    @XmlSchemaType(name = "string")
    protected PublicUseEnumeration publicUse;
    @XmlElement(name = "Covered", defaultValue = "indoors")
    @XmlSchemaType(name = "string")
    protected CoveredEnumeration covered;
    @XmlElement(name = "Gated")
    @XmlSchemaType(name = "string")
    protected GatedEnumeration gated;
    @XmlElement(name = "Lighting", defaultValue = "wellLit")
    @XmlSchemaType(name = "normalizedString")
    protected LightingEnumeration lighting;
    @XmlElement(name = "AllAreasWheelchairAccessible", defaultValue = "true")
    protected Boolean allAreasWheelchairAccessible;
    @XmlElement(name = "PersonCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personCapacity;
    @XmlElement(name = "Presentation")
    protected PresentationStructure presentation;
    protected SiteFacilitySetsRelStructure facilities;
    @XmlList
    @XmlElement(name = "AccessFeatureList")
    protected List<AccessFeatureEnumeration> accessFeatureList;
    @XmlElement(name = "NavigationType")
    @XmlSchemaType(name = "NMTOKEN")
    protected NavigationTypeEnumeration navigationType;
    protected PlacesInSequenceRelStructure placesInSequence;
    protected PathLinksInSequenceRelStructure pathLinksInSequence;
    protected TransferRefsRelStructure transfers;

    /**
     * Ruft den Wert der from-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SitePathLinkEndStructure }
     *     
     */
    public SitePathLinkEndStructure getFrom() {
        return from;
    }

    /**
     * Legt den Wert der from-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SitePathLinkEndStructure }
     *     
     */
    public void setFrom(SitePathLinkEndStructure value) {
        this.from = value;
    }

    /**
     * Ruft den Wert der to-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SitePathLinkEndStructure }
     *     
     */
    public SitePathLinkEndStructure getTo() {
        return to;
    }

    /**
     * Legt den Wert der to-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SitePathLinkEndStructure }
     *     
     */
    public void setTo(SitePathLinkEndStructure value) {
        this.to = value;
    }

    /**
     * Ruft den Wert der accessibilityAssessment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityAssessment }
     *     
     */
    public AccessibilityAssessment getAccessibilityAssessment() {
        return accessibilityAssessment;
    }

    /**
     * Legt den Wert der accessibilityAssessment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityAssessment }
     *     
     */
    public void setAccessibilityAssessment(AccessibilityAssessment value) {
        this.accessibilityAssessment = value;
    }

    /**
     * Gets the value of the accessModes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessModes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessModeEnumeration }
     * 
     * 
     */
    public List<AccessModeEnumeration> getAccessModes() {
        if (accessModes == null) {
            accessModes = new ArrayList<AccessModeEnumeration>();
        }
        return this.accessModes;
    }

    /**
     * Ruft den Wert der summaries-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessSummariesRelStructure }
     *     
     */
    public AccessSummariesRelStructure getSummaries() {
        return summaries;
    }

    /**
     * Legt den Wert der summaries-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessSummariesRelStructure }
     *     
     */
    public void setSummaries(AccessSummariesRelStructure value) {
        this.summaries = value;
    }

    /**
     * Ruft den Wert der transferDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransferDurationStructure }
     *     
     */
    public TransferDurationStructure getTransferDuration() {
        return transferDuration;
    }

    /**
     * Legt den Wert der transferDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferDurationStructure }
     *     
     */
    public void setTransferDuration(TransferDurationStructure value) {
        this.transferDuration = value;
    }

    /**
     * Ruft den Wert der publicUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublicUseEnumeration }
     *     
     */
    public PublicUseEnumeration getPublicUse() {
        return publicUse;
    }

    /**
     * Legt den Wert der publicUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicUseEnumeration }
     *     
     */
    public void setPublicUse(PublicUseEnumeration value) {
        this.publicUse = value;
    }

    /**
     * Ruft den Wert der covered-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CoveredEnumeration }
     *     
     */
    public CoveredEnumeration getCovered() {
        return covered;
    }

    /**
     * Legt den Wert der covered-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CoveredEnumeration }
     *     
     */
    public void setCovered(CoveredEnumeration value) {
        this.covered = value;
    }

    /**
     * Ruft den Wert der gated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GatedEnumeration }
     *     
     */
    public GatedEnumeration getGated() {
        return gated;
    }

    /**
     * Legt den Wert der gated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GatedEnumeration }
     *     
     */
    public void setGated(GatedEnumeration value) {
        this.gated = value;
    }

    /**
     * Ruft den Wert der lighting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LightingEnumeration }
     *     
     */
    public LightingEnumeration getLighting() {
        return lighting;
    }

    /**
     * Legt den Wert der lighting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LightingEnumeration }
     *     
     */
    public void setLighting(LightingEnumeration value) {
        this.lighting = value;
    }

    /**
     * Ruft den Wert der allAreasWheelchairAccessible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllAreasWheelchairAccessible() {
        return allAreasWheelchairAccessible;
    }

    /**
     * Legt den Wert der allAreasWheelchairAccessible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllAreasWheelchairAccessible(Boolean value) {
        this.allAreasWheelchairAccessible = value;
    }

    /**
     * Ruft den Wert der personCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPersonCapacity() {
        return personCapacity;
    }

    /**
     * Legt den Wert der personCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPersonCapacity(BigInteger value) {
        this.personCapacity = value;
    }

    /**
     * Ruft den Wert der presentation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PresentationStructure }
     *     
     */
    public PresentationStructure getPresentation() {
        return presentation;
    }

    /**
     * Legt den Wert der presentation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationStructure }
     *     
     */
    public void setPresentation(PresentationStructure value) {
        this.presentation = value;
    }

    /**
     * Ruft den Wert der facilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SiteFacilitySetsRelStructure }
     *     
     */
    public SiteFacilitySetsRelStructure getFacilities() {
        return facilities;
    }

    /**
     * Legt den Wert der facilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteFacilitySetsRelStructure }
     *     
     */
    public void setFacilities(SiteFacilitySetsRelStructure value) {
        this.facilities = value;
    }

    /**
     * Gets the value of the accessFeatureList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessFeatureList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessFeatureList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessFeatureEnumeration }
     * 
     * 
     */
    public List<AccessFeatureEnumeration> getAccessFeatureList() {
        if (accessFeatureList == null) {
            accessFeatureList = new ArrayList<AccessFeatureEnumeration>();
        }
        return this.accessFeatureList;
    }

    /**
     * Ruft den Wert der navigationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NavigationTypeEnumeration }
     *     
     */
    public NavigationTypeEnumeration getNavigationType() {
        return navigationType;
    }

    /**
     * Legt den Wert der navigationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NavigationTypeEnumeration }
     *     
     */
    public void setNavigationType(NavigationTypeEnumeration value) {
        this.navigationType = value;
    }

    /**
     * Ruft den Wert der placesInSequence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlacesInSequenceRelStructure }
     *     
     */
    public PlacesInSequenceRelStructure getPlacesInSequence() {
        return placesInSequence;
    }

    /**
     * Legt den Wert der placesInSequence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacesInSequenceRelStructure }
     *     
     */
    public void setPlacesInSequence(PlacesInSequenceRelStructure value) {
        this.placesInSequence = value;
    }

    /**
     * Ruft den Wert der pathLinksInSequence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PathLinksInSequenceRelStructure }
     *     
     */
    public PathLinksInSequenceRelStructure getPathLinksInSequence() {
        return pathLinksInSequence;
    }

    /**
     * Legt den Wert der pathLinksInSequence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PathLinksInSequenceRelStructure }
     *     
     */
    public void setPathLinksInSequence(PathLinksInSequenceRelStructure value) {
        this.pathLinksInSequence = value;
    }

    /**
     * Ruft den Wert der transfers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransferRefsRelStructure }
     *     
     */
    public TransferRefsRelStructure getTransfers() {
        return transfers;
    }

    /**
     * Legt den Wert der transfers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferRefsRelStructure }
     *     
     */
    public void setTransfers(TransferRefsRelStructure value) {
        this.transfers = value;
    }

}
