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
 * Type for RENTAL PENALTY POLICY.
 * 
 * <p>Java-Klasse f�r RentalPenaltyPolicy_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RentalPenaltyPolicy_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}RentalPenaltyPolicyGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RentalPenaltyPolicy_VersionStructure", propOrder = {
    "rentalPenaltyPolicyType",
    "penaltyFee",
    "immobilisation",
    "disbarring",
    "suspension"
})
@XmlSeeAlso({
    RentalPenaltyPolicy.class
})
public class RentalPenaltyPolicyVersionStructure
    extends UsageParameterVersionStructure
{

    @XmlElement(name = "RentalPenaltyPolicyType")
    @XmlSchemaType(name = "normalizedString")
    protected RentalPenaltyPolicyTypeEnumeration rentalPenaltyPolicyType;
    @XmlElement(name = "PenaltyFee")
    protected Boolean penaltyFee;
    @XmlElement(name = "Immobilisation")
    protected Boolean immobilisation;
    @XmlElement(name = "Disbarring")
    protected Boolean disbarring;
    @XmlElement(name = "Suspension")
    protected Boolean suspension;

    /**
     * Ruft den Wert der rentalPenaltyPolicyType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RentalPenaltyPolicyTypeEnumeration }
     *     
     */
    public RentalPenaltyPolicyTypeEnumeration getRentalPenaltyPolicyType() {
        return rentalPenaltyPolicyType;
    }

    /**
     * Legt den Wert der rentalPenaltyPolicyType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RentalPenaltyPolicyTypeEnumeration }
     *     
     */
    public void setRentalPenaltyPolicyType(RentalPenaltyPolicyTypeEnumeration value) {
        this.rentalPenaltyPolicyType = value;
    }

    /**
     * Ruft den Wert der penaltyFee-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPenaltyFee() {
        return penaltyFee;
    }

    /**
     * Legt den Wert der penaltyFee-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPenaltyFee(Boolean value) {
        this.penaltyFee = value;
    }

    /**
     * Ruft den Wert der immobilisation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImmobilisation() {
        return immobilisation;
    }

    /**
     * Legt den Wert der immobilisation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImmobilisation(Boolean value) {
        this.immobilisation = value;
    }

    /**
     * Ruft den Wert der disbarring-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisbarring() {
        return disbarring;
    }

    /**
     * Legt den Wert der disbarring-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisbarring(Boolean value) {
        this.disbarring = value;
    }

    /**
     * Ruft den Wert der suspension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuspension() {
        return suspension;
    }

    /**
     * Legt den Wert der suspension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuspension(Boolean value) {
        this.suspension = value;
    }

}
