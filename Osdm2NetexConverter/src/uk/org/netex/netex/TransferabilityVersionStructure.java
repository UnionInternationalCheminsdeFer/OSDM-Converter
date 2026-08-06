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
 * Type for TRANSFERABILITY.
 * 
 * <p>Java-Klasse f�r Transferability_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Transferability_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TransferabilityGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transferability_VersionStructure", propOrder = {
    "canTransfer",
    "maximumNumberOfNamedTransferees",
    "hasTransferFee",
    "sharedUsage"
})
@XmlSeeAlso({
    Transferability.class
})
public class TransferabilityVersionStructure
    extends UsageParameterVersionStructure
{

    @XmlElement(name = "CanTransfer")
    protected Boolean canTransfer;
    @XmlElement(name = "MaximumNumberOfNamedTransferees")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumNumberOfNamedTransferees;
    @XmlElement(name = "HasTransferFee")
    protected Boolean hasTransferFee;
    @XmlElement(name = "SharedUsage")
    @XmlSchemaType(name = "normalizedString")
    protected SharedUsageEnumeration sharedUsage;

    /**
     * Ruft den Wert der canTransfer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanTransfer() {
        return canTransfer;
    }

    /**
     * Legt den Wert der canTransfer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanTransfer(Boolean value) {
        this.canTransfer = value;
    }

    /**
     * Ruft den Wert der maximumNumberOfNamedTransferees-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfNamedTransferees() {
        return maximumNumberOfNamedTransferees;
    }

    /**
     * Legt den Wert der maximumNumberOfNamedTransferees-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfNamedTransferees(BigInteger value) {
        this.maximumNumberOfNamedTransferees = value;
    }

    /**
     * Ruft den Wert der hasTransferFee-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasTransferFee() {
        return hasTransferFee;
    }

    /**
     * Legt den Wert der hasTransferFee-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasTransferFee(Boolean value) {
        this.hasTransferFee = value;
    }

    /**
     * Ruft den Wert der sharedUsage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SharedUsageEnumeration }
     *     
     */
    public SharedUsageEnumeration getSharedUsage() {
        return sharedUsage;
    }

    /**
     * Legt den Wert der sharedUsage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedUsageEnumeration }
     *     
     */
    public void setSharedUsage(SharedUsageEnumeration value) {
        this.sharedUsage = value;
    }

}
