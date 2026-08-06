//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a TRANSFER.
 * 
 * <p>Java-Klasse f�r Transfer_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Transfer_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TransferGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transfer_VersionStructure", propOrder = {
    "name",
    "typeOfTransferRef",
    "description",
    "distance",
    "transferDuration",
    "walkTransferDuration",
    "bothWays",
    "transferMode"
})
@XmlSeeAlso({
    AccessVersionStructure.class,
    DefaultConnectionVersionStructure.class,
    SiteConnectionVersionStructure.class,
    ConnectionVersionStructure.class
})
public abstract class TransferVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "TypeOfTransferRef")
    protected TypeOfTransferRefStructure typeOfTransferRef;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "Distance")
    protected BigDecimal distance;
    @XmlElement(name = "TransferDuration")
    protected TransferDurationStructure transferDuration;
    @XmlElement(name = "WalkTransferDuration")
    protected TransferDurationStructure walkTransferDuration;
    @XmlElement(name = "BothWays", defaultValue = "true")
    protected Boolean bothWays;
    @XmlElement(name = "TransferMode")
    @XmlSchemaType(name = "string")
    protected AccessModeEnumeration transferMode;

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
     * Ruft den Wert der typeOfTransferRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTransferRefStructure }
     *     
     */
    public TypeOfTransferRefStructure getTypeOfTransferRef() {
        return typeOfTransferRef;
    }

    /**
     * Legt den Wert der typeOfTransferRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTransferRefStructure }
     *     
     */
    public void setTypeOfTransferRef(TypeOfTransferRefStructure value) {
        this.typeOfTransferRef = value;
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
     * Ruft den Wert der distance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistance() {
        return distance;
    }

    /**
     * Legt den Wert der distance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistance(BigDecimal value) {
        this.distance = value;
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
     * Ruft den Wert der walkTransferDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransferDurationStructure }
     *     
     */
    public TransferDurationStructure getWalkTransferDuration() {
        return walkTransferDuration;
    }

    /**
     * Legt den Wert der walkTransferDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferDurationStructure }
     *     
     */
    public void setWalkTransferDuration(TransferDurationStructure value) {
        this.walkTransferDuration = value;
    }

    /**
     * Ruft den Wert der bothWays-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBothWays() {
        return bothWays;
    }

    /**
     * Legt den Wert der bothWays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBothWays(Boolean value) {
        this.bothWays = value;
    }

    /**
     * Ruft den Wert der transferMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessModeEnumeration }
     *     
     */
    public AccessModeEnumeration getTransferMode() {
        return transferMode;
    }

    /**
     * Legt den Wert der transferMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessModeEnumeration }
     *     
     */
    public void setTransferMode(AccessModeEnumeration value) {
        this.transferMode = value;
    }

}
