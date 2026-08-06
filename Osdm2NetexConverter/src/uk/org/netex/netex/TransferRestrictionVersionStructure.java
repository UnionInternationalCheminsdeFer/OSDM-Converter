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
 * Type for TRANSFER RESTRICTION.
 * 
 * <p>Java-Klasse f�r TransferRestriction_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TransferRestriction_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Assignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TransferRestrictionGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferRestriction_VersionStructure", propOrder = {
    "typeOfTransferRef",
    "bothWays",
    "restrictionType",
    "fromPointRef",
    "toPointRef"
})
@XmlSeeAlso({
    TransferRestriction.class
})
public class TransferRestrictionVersionStructure
    extends AssignmentVersionStructure
{

    @XmlElement(name = "TypeOfTransferRef")
    protected TypeOfTransferRefStructure typeOfTransferRef;
    @XmlElement(name = "BothWays", defaultValue = "true")
    protected Boolean bothWays;
    @XmlElement(name = "RestrictionType", required = true)
    @XmlSchemaType(name = "string")
    protected TransferConstraintTypeEnumeration restrictionType;
    @XmlElement(name = "FromPointRef")
    protected ScheduledStopPointRefStructure fromPointRef;
    @XmlElement(name = "ToPointRef")
    protected ScheduledStopPointRefStructure toPointRef;

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
     * Ruft den Wert der restrictionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransferConstraintTypeEnumeration }
     *     
     */
    public TransferConstraintTypeEnumeration getRestrictionType() {
        return restrictionType;
    }

    /**
     * Legt den Wert der restrictionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferConstraintTypeEnumeration }
     *     
     */
    public void setRestrictionType(TransferConstraintTypeEnumeration value) {
        this.restrictionType = value;
    }

    /**
     * Ruft den Wert der fromPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getFromPointRef() {
        return fromPointRef;
    }

    /**
     * Legt den Wert der fromPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setFromPointRef(ScheduledStopPointRefStructure value) {
        this.fromPointRef = value;
    }

    /**
     * Ruft den Wert der toPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getToPointRef() {
        return toPointRef;
    }

    /**
     * Legt den Wert der toPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setToPointRef(ScheduledStopPointRefStructure value) {
        this.toPointRef = value;
    }

}
