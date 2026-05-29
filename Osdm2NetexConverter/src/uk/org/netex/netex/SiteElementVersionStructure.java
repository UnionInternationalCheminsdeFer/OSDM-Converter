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
 * Type for a SITE ELEMENT.
 * 
 * <p>Java-Klasse f�r SiteElement_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SiteElement_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}AddressablePlace_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}SiteElementGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteElement_VersionStructure", propOrder = {
    "accessibilityAssessment",
    "accessModes",
    "nameSuffix",
    "alternativeNames",
    "crossRoad",
    "landmark",
    "publicUse",
    "covered",
    "gated",
    "lighting",
    "allAreasWheelchairAccessible",
    "personCapacity",
    "presentation",
    "facilities"
})
@XmlSeeAlso({
    EquipmentPlaceVersionStructure.class,
    SiteComponentVersionStructure.class,
    SiteVersionStructure.class
})
public abstract class SiteElementVersionStructure
    extends AddressablePlaceVersionStructure
{

    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessment accessibilityAssessment;
    @XmlList
    @XmlElement(name = "AccessModes")
    protected List<AccessModeEnumeration> accessModes;
    @XmlElement(name = "NameSuffix")
    protected MultilingualString nameSuffix;
    protected AlternativeNamesRelStructure alternativeNames;
    @XmlElement(name = "CrossRoad")
    protected MultilingualString crossRoad;
    @XmlElement(name = "Landmark")
    protected MultilingualString landmark;
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
     * Ruft den Wert der nameSuffix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Legt den Wert der nameSuffix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setNameSuffix(MultilingualString value) {
        this.nameSuffix = value;
    }

    /**
     * Ruft den Wert der alternativeNames-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeNamesRelStructure }
     *     
     */
    public AlternativeNamesRelStructure getAlternativeNames() {
        return alternativeNames;
    }

    /**
     * Legt den Wert der alternativeNames-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeNamesRelStructure }
     *     
     */
    public void setAlternativeNames(AlternativeNamesRelStructure value) {
        this.alternativeNames = value;
    }

    /**
     * Ruft den Wert der crossRoad-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getCrossRoad() {
        return crossRoad;
    }

    /**
     * Legt den Wert der crossRoad-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setCrossRoad(MultilingualString value) {
        this.crossRoad = value;
    }

    /**
     * Ruft den Wert der landmark-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getLandmark() {
        return landmark;
    }

    /**
     * Legt den Wert der landmark-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setLandmark(MultilingualString value) {
        this.landmark = value;
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

}
