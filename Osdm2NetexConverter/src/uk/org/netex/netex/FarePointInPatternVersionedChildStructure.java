//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for FARE POINT IN JOURNEY PATTERN.
 * 
 * <p>Java-Klasse f�r FarePointInPattern_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FarePointInPattern_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PointInJourneyPattern_VersionedChildStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}FarePointInPatternGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FarePointInPattern_VersionedChildStructure", propOrder = {
    "scheduledStopPointView",
    "abridgementRanking",
    "presentationPosition",
    "isForbidden",
    "interchangeAllowed",
    "isFareStage"
})
@XmlSeeAlso({
    FarePointInPattern.class
})
public class FarePointInPatternVersionedChildStructure
    extends PointInJourneyPatternVersionedChildStructure
{

    @XmlElement(name = "ScheduledStopPointView")
    protected ScheduledStopPointDerivedViewStructure scheduledStopPointView;
    @XmlElement(name = "AbridgementRanking")
    protected BigInteger abridgementRanking;
    @XmlElement(name = "PresentationPosition")
    @XmlSchemaType(name = "normalizedString")
    protected SeriesPresentationEnumeration presentationPosition;
    @XmlElement(name = "IsForbidden", defaultValue = "false")
    protected Boolean isForbidden;
    @XmlElement(name = "InterchangeAllowed", defaultValue = "true")
    protected Boolean interchangeAllowed;
    @XmlElement(name = "IsFareStage", defaultValue = "true")
    protected Boolean isFareStage;

    /**
     * Ruft den Wert der scheduledStopPointView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointDerivedViewStructure }
     *     
     */
    public ScheduledStopPointDerivedViewStructure getScheduledStopPointView() {
        return scheduledStopPointView;
    }

    /**
     * Legt den Wert der scheduledStopPointView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointDerivedViewStructure }
     *     
     */
    public void setScheduledStopPointView(ScheduledStopPointDerivedViewStructure value) {
        this.scheduledStopPointView = value;
    }

    /**
     * Ruft den Wert der abridgementRanking-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAbridgementRanking() {
        return abridgementRanking;
    }

    /**
     * Legt den Wert der abridgementRanking-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAbridgementRanking(BigInteger value) {
        this.abridgementRanking = value;
    }

    /**
     * Ruft den Wert der presentationPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SeriesPresentationEnumeration }
     *     
     */
    public SeriesPresentationEnumeration getPresentationPosition() {
        return presentationPosition;
    }

    /**
     * Legt den Wert der presentationPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SeriesPresentationEnumeration }
     *     
     */
    public void setPresentationPosition(SeriesPresentationEnumeration value) {
        this.presentationPosition = value;
    }

    /**
     * Ruft den Wert der isForbidden-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsForbidden() {
        return isForbidden;
    }

    /**
     * Legt den Wert der isForbidden-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsForbidden(Boolean value) {
        this.isForbidden = value;
    }

    /**
     * Ruft den Wert der interchangeAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterchangeAllowed() {
        return interchangeAllowed;
    }

    /**
     * Legt den Wert der interchangeAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterchangeAllowed(Boolean value) {
        this.interchangeAllowed = value;
    }

    /**
     * Ruft den Wert der isFareStage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFareStage() {
        return isFareStage;
    }

    /**
     * Legt den Wert der isFareStage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFareStage(Boolean value) {
        this.isFareStage = value;
    }

}
