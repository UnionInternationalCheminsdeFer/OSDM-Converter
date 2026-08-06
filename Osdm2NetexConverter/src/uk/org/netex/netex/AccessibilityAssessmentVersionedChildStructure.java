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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for ACCESSIBILITY ASSESSMENT.
 * 
 * <p>Java-Klasse f�r AccessibilityAssessment_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AccessibilityAssessment_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}AccessibilityAssessmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessibilityAssessment_VersionedChildStructure", propOrder = {
    "mobilityImpairedAccess",
    "limitations",
    "suitabilities",
    "comment"
})
@XmlSeeAlso({
    AccessibilityAssessment.class
})
public class AccessibilityAssessmentVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "MobilityImpairedAccess", required = true)
    @XmlSchemaType(name = "string")
    protected LimitationStatusEnumeration mobilityImpairedAccess;
    protected AccessibilityLimitationsRelStructure limitations;
    protected SuitabilitiesRelStructure suitabilities;
    @XmlElement(name = "Comment")
    protected MultilingualString comment;

    /**
     * Ruft den Wert der mobilityImpairedAccess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LimitationStatusEnumeration }
     *     
     */
    public LimitationStatusEnumeration getMobilityImpairedAccess() {
        return mobilityImpairedAccess;
    }

    /**
     * Legt den Wert der mobilityImpairedAccess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitationStatusEnumeration }
     *     
     */
    public void setMobilityImpairedAccess(LimitationStatusEnumeration value) {
        this.mobilityImpairedAccess = value;
    }

    /**
     * Ruft den Wert der limitations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityLimitationsRelStructure }
     *     
     */
    public AccessibilityLimitationsRelStructure getLimitations() {
        return limitations;
    }

    /**
     * Legt den Wert der limitations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityLimitationsRelStructure }
     *     
     */
    public void setLimitations(AccessibilityLimitationsRelStructure value) {
        this.limitations = value;
    }

    /**
     * Ruft den Wert der suitabilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SuitabilitiesRelStructure }
     *     
     */
    public SuitabilitiesRelStructure getSuitabilities() {
        return suitabilities;
    }

    /**
     * Legt den Wert der suitabilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SuitabilitiesRelStructure }
     *     
     */
    public void setSuitabilities(SuitabilitiesRelStructure value) {
        this.suitabilities = value;
    }

    /**
     * Ruft den Wert der comment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getComment() {
        return comment;
    }

    /**
     * Legt den Wert der comment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setComment(MultilingualString value) {
        this.comment = value;
    }

}
