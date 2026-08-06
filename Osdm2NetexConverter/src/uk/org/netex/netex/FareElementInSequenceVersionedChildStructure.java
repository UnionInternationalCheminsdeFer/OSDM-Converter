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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for FARE ELEMENT IN SEQUENCE.
 * 
 * <p>Java-Klasse f�r FareElementInSequence_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FareElementInSequence_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}FareElementInSequenceGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareElementInSequence_VersionedChildStructure", propOrder = {
    "name",
    "description",
    "isFirstInSequence",
    "isLastInSequence",
    "accessNumberIsLimited",
    "minimumAccess",
    "maximumAccess",
    "accessNumber"
})
@XmlSeeAlso({
    FareElementInSequence.class,
    AccessRightInProductVersionedChildStructure.class,
    ControllableElementInSequenceVersionedChildStructure.class,
    FareStructureElementInSequenceVersionedChildStructure.class
})
public class FareElementInSequenceVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "IsFirstInSequence", defaultValue = "false")
    protected Boolean isFirstInSequence;
    @XmlElement(name = "IsLastInSequence", defaultValue = "false")
    protected Boolean isLastInSequence;
    @XmlElement(name = "AccessNumberIsLimited")
    protected Boolean accessNumberIsLimited;
    @XmlElement(name = "MinimumAccess")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minimumAccess;
    @XmlElement(name = "MaximumAccess", defaultValue = "1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumAccess;
    @XmlElement(name = "AccessNumber")
    protected BigInteger accessNumber;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;

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
     * Ruft den Wert der isFirstInSequence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFirstInSequence() {
        return isFirstInSequence;
    }

    /**
     * Legt den Wert der isFirstInSequence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFirstInSequence(Boolean value) {
        this.isFirstInSequence = value;
    }

    /**
     * Ruft den Wert der isLastInSequence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLastInSequence() {
        return isLastInSequence;
    }

    /**
     * Legt den Wert der isLastInSequence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLastInSequence(Boolean value) {
        this.isLastInSequence = value;
    }

    /**
     * Ruft den Wert der accessNumberIsLimited-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccessNumberIsLimited() {
        return accessNumberIsLimited;
    }

    /**
     * Legt den Wert der accessNumberIsLimited-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccessNumberIsLimited(Boolean value) {
        this.accessNumberIsLimited = value;
    }

    /**
     * Ruft den Wert der minimumAccess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumAccess() {
        return minimumAccess;
    }

    /**
     * Legt den Wert der minimumAccess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumAccess(BigInteger value) {
        this.minimumAccess = value;
    }

    /**
     * Ruft den Wert der maximumAccess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumAccess() {
        return maximumAccess;
    }

    /**
     * Legt den Wert der maximumAccess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumAccess(BigInteger value) {
        this.maximumAccess = value;
    }

    /**
     * Ruft den Wert der accessNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccessNumber() {
        return accessNumber;
    }

    /**
     * Legt den Wert der accessNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccessNumber(BigInteger value) {
        this.accessNumber = value;
    }

    /**
     * Ruft den Wert der order-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Legt den Wert der order-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

}
