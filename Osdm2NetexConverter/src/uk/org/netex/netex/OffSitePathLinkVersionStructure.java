//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for an OFF SITE PATH LINK.
 * 
 * <p>Java-Klasse f�r OffSitePathLink_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OffSitePathLink_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}GenericPathLink_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}OffSitePathLinkGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffSitePathLink_VersionStructure", propOrder = {
    "from",
    "to",
    "description",
    "accessibilityAssessmentRef",
    "accessibilityAssessment",
    "publicUse",
    "covered",
    "gated",
    "lighting",
    "allAreasWheelchairAccessible",
    "personCapacity",
    "towards",
    "back",
    "numberOfSteps",
    "minimumHeight",
    "minimumWidth",
    "allowedUse",
    "transition",
    "gradient",
    "gradientType",
    "tiltAngle",
    "tiltType",
    "accessFeatureType",
    "passageType",
    "flooringType",
    "flooringStatus",
    "rightSideBorder",
    "leftSideBorder",
    "tactileWarningStrip",
    "tactileWarningStripContrast",
    "tactileGuidingStrip",
    "tactileGuidingStripStatus",
    "maximumFlowPerMinute",
    "transferDuration"
})
@XmlSeeAlso({
    OffSitePathLink.class
})
public class OffSitePathLinkVersionStructure
    extends GenericPathLinkVersionStructure
{

    @XmlElement(name = "From", required = true)
    protected SitePathLinkEndStructure from;
    @XmlElement(name = "To", required = true)
    protected SitePathLinkEndStructure to;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "AccessibilityAssessmentRef")
    protected AccessibilityAssessmentRefStructure accessibilityAssessmentRef;
    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessment accessibilityAssessment;
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
    @XmlElement(name = "Towards")
    protected MultilingualString towards;
    @XmlElement(name = "Back")
    protected MultilingualString back;
    @XmlElement(name = "NumberOfSteps")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfSteps;
    @XmlElement(name = "MinimumHeight")
    protected BigDecimal minimumHeight;
    @XmlElement(name = "MinimumWidth")
    protected BigDecimal minimumWidth;
    @XmlElement(name = "AllowedUse")
    @XmlSchemaType(name = "NMTOKEN")
    protected PathDirectionEnumeration allowedUse;
    @XmlElement(name = "Transition")
    @XmlSchemaType(name = "NMTOKEN")
    protected TransitionEnumeration transition;
    @XmlElement(name = "Gradient")
    protected BigInteger gradient;
    @XmlElement(name = "GradientType")
    @XmlSchemaType(name = "string")
    protected GradientEnumeration gradientType;
    @XmlElement(name = "TiltAngle")
    protected BigInteger tiltAngle;
    @XmlElement(name = "TiltType")
    @XmlSchemaType(name = "NMTOKEN")
    protected TiltTypeEnumeration tiltType;
    @XmlElement(name = "AccessFeatureType")
    @XmlSchemaType(name = "string")
    protected AccessFeatureEnumeration accessFeatureType;
    @XmlElement(name = "PassageType")
    @XmlSchemaType(name = "string")
    protected PassageTypeEnumeration passageType;
    @XmlElement(name = "FlooringType")
    @XmlSchemaType(name = "NMTOKEN")
    protected FlooringTypeEnumeration flooringType;
    @XmlElement(name = "FlooringStatus")
    @XmlSchemaType(name = "NMTOKEN")
    protected FlooringStatusEnumeration flooringStatus;
    @XmlElement(name = "RightSideBorder")
    @XmlSchemaType(name = "NMTOKEN")
    protected BorderTypeEnumeration rightSideBorder;
    @XmlElement(name = "LeftSideBorder")
    @XmlSchemaType(name = "NMTOKEN")
    protected BorderTypeEnumeration leftSideBorder;
    @XmlElement(name = "TactileWarningStrip")
    @XmlSchemaType(name = "NMTOKEN")
    protected TactileWarningStripEnumeration tactileWarningStrip;
    @XmlElement(name = "TactileWarningStripContrast", defaultValue = "true")
    protected Boolean tactileWarningStripContrast;
    @XmlElement(name = "TactileGuidingStrip")
    protected Boolean tactileGuidingStrip;
    @XmlElement(name = "TactileGuidingStripStatus", defaultValue = "goodAndContrasted")
    @XmlSchemaType(name = "NMTOKEN")
    protected TactileGuidingStripStatusEnumeration tactileGuidingStripStatus;
    @XmlElement(name = "MaximumFlowPerMinute")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumFlowPerMinute;
    @XmlElement(name = "TransferDuration")
    protected TransferDurationStructure transferDuration;

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
     * Ruft den Wert der accessibilityAssessmentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityAssessmentRefStructure }
     *     
     */
    public AccessibilityAssessmentRefStructure getAccessibilityAssessmentRef() {
        return accessibilityAssessmentRef;
    }

    /**
     * Legt den Wert der accessibilityAssessmentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityAssessmentRefStructure }
     *     
     */
    public void setAccessibilityAssessmentRef(AccessibilityAssessmentRefStructure value) {
        this.accessibilityAssessmentRef = value;
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
     * Ruft den Wert der towards-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getTowards() {
        return towards;
    }

    /**
     * Legt den Wert der towards-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setTowards(MultilingualString value) {
        this.towards = value;
    }

    /**
     * Ruft den Wert der back-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getBack() {
        return back;
    }

    /**
     * Legt den Wert der back-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setBack(MultilingualString value) {
        this.back = value;
    }

    /**
     * Ruft den Wert der numberOfSteps-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSteps() {
        return numberOfSteps;
    }

    /**
     * Legt den Wert der numberOfSteps-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSteps(BigInteger value) {
        this.numberOfSteps = value;
    }

    /**
     * Ruft den Wert der minimumHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumHeight() {
        return minimumHeight;
    }

    /**
     * Legt den Wert der minimumHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumHeight(BigDecimal value) {
        this.minimumHeight = value;
    }

    /**
     * Ruft den Wert der minimumWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumWidth() {
        return minimumWidth;
    }

    /**
     * Legt den Wert der minimumWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumWidth(BigDecimal value) {
        this.minimumWidth = value;
    }

    /**
     * Ruft den Wert der allowedUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PathDirectionEnumeration }
     *     
     */
    public PathDirectionEnumeration getAllowedUse() {
        return allowedUse;
    }

    /**
     * Legt den Wert der allowedUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PathDirectionEnumeration }
     *     
     */
    public void setAllowedUse(PathDirectionEnumeration value) {
        this.allowedUse = value;
    }

    /**
     * Ruft den Wert der transition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransitionEnumeration }
     *     
     */
    public TransitionEnumeration getTransition() {
        return transition;
    }

    /**
     * Legt den Wert der transition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitionEnumeration }
     *     
     */
    public void setTransition(TransitionEnumeration value) {
        this.transition = value;
    }

    /**
     * Ruft den Wert der gradient-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGradient() {
        return gradient;
    }

    /**
     * Legt den Wert der gradient-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGradient(BigInteger value) {
        this.gradient = value;
    }

    /**
     * Ruft den Wert der gradientType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GradientEnumeration }
     *     
     */
    public GradientEnumeration getGradientType() {
        return gradientType;
    }

    /**
     * Legt den Wert der gradientType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GradientEnumeration }
     *     
     */
    public void setGradientType(GradientEnumeration value) {
        this.gradientType = value;
    }

    /**
     * Ruft den Wert der tiltAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTiltAngle() {
        return tiltAngle;
    }

    /**
     * Legt den Wert der tiltAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTiltAngle(BigInteger value) {
        this.tiltAngle = value;
    }

    /**
     * Ruft den Wert der tiltType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TiltTypeEnumeration }
     *     
     */
    public TiltTypeEnumeration getTiltType() {
        return tiltType;
    }

    /**
     * Legt den Wert der tiltType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TiltTypeEnumeration }
     *     
     */
    public void setTiltType(TiltTypeEnumeration value) {
        this.tiltType = value;
    }

    /**
     * Ruft den Wert der accessFeatureType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessFeatureEnumeration }
     *     
     */
    public AccessFeatureEnumeration getAccessFeatureType() {
        return accessFeatureType;
    }

    /**
     * Legt den Wert der accessFeatureType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessFeatureEnumeration }
     *     
     */
    public void setAccessFeatureType(AccessFeatureEnumeration value) {
        this.accessFeatureType = value;
    }

    /**
     * Ruft den Wert der passageType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PassageTypeEnumeration }
     *     
     */
    public PassageTypeEnumeration getPassageType() {
        return passageType;
    }

    /**
     * Legt den Wert der passageType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PassageTypeEnumeration }
     *     
     */
    public void setPassageType(PassageTypeEnumeration value) {
        this.passageType = value;
    }

    /**
     * Ruft den Wert der flooringType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlooringTypeEnumeration }
     *     
     */
    public FlooringTypeEnumeration getFlooringType() {
        return flooringType;
    }

    /**
     * Legt den Wert der flooringType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlooringTypeEnumeration }
     *     
     */
    public void setFlooringType(FlooringTypeEnumeration value) {
        this.flooringType = value;
    }

    /**
     * Ruft den Wert der flooringStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlooringStatusEnumeration }
     *     
     */
    public FlooringStatusEnumeration getFlooringStatus() {
        return flooringStatus;
    }

    /**
     * Legt den Wert der flooringStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlooringStatusEnumeration }
     *     
     */
    public void setFlooringStatus(FlooringStatusEnumeration value) {
        this.flooringStatus = value;
    }

    /**
     * Ruft den Wert der rightSideBorder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BorderTypeEnumeration }
     *     
     */
    public BorderTypeEnumeration getRightSideBorder() {
        return rightSideBorder;
    }

    /**
     * Legt den Wert der rightSideBorder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BorderTypeEnumeration }
     *     
     */
    public void setRightSideBorder(BorderTypeEnumeration value) {
        this.rightSideBorder = value;
    }

    /**
     * Ruft den Wert der leftSideBorder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BorderTypeEnumeration }
     *     
     */
    public BorderTypeEnumeration getLeftSideBorder() {
        return leftSideBorder;
    }

    /**
     * Legt den Wert der leftSideBorder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BorderTypeEnumeration }
     *     
     */
    public void setLeftSideBorder(BorderTypeEnumeration value) {
        this.leftSideBorder = value;
    }

    /**
     * Ruft den Wert der tactileWarningStrip-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TactileWarningStripEnumeration }
     *     
     */
    public TactileWarningStripEnumeration getTactileWarningStrip() {
        return tactileWarningStrip;
    }

    /**
     * Legt den Wert der tactileWarningStrip-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TactileWarningStripEnumeration }
     *     
     */
    public void setTactileWarningStrip(TactileWarningStripEnumeration value) {
        this.tactileWarningStrip = value;
    }

    /**
     * Ruft den Wert der tactileWarningStripContrast-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTactileWarningStripContrast() {
        return tactileWarningStripContrast;
    }

    /**
     * Legt den Wert der tactileWarningStripContrast-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTactileWarningStripContrast(Boolean value) {
        this.tactileWarningStripContrast = value;
    }

    /**
     * Ruft den Wert der tactileGuidingStrip-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTactileGuidingStrip() {
        return tactileGuidingStrip;
    }

    /**
     * Legt den Wert der tactileGuidingStrip-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTactileGuidingStrip(Boolean value) {
        this.tactileGuidingStrip = value;
    }

    /**
     * Ruft den Wert der tactileGuidingStripStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TactileGuidingStripStatusEnumeration }
     *     
     */
    public TactileGuidingStripStatusEnumeration getTactileGuidingStripStatus() {
        return tactileGuidingStripStatus;
    }

    /**
     * Legt den Wert der tactileGuidingStripStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TactileGuidingStripStatusEnumeration }
     *     
     */
    public void setTactileGuidingStripStatus(TactileGuidingStripStatusEnumeration value) {
        this.tactileGuidingStripStatus = value;
    }

    /**
     * Ruft den Wert der maximumFlowPerMinute-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumFlowPerMinute() {
        return maximumFlowPerMinute;
    }

    /**
     * Legt den Wert der maximumFlowPerMinute-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumFlowPerMinute(BigInteger value) {
        this.maximumFlowPerMinute = value;
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

}
