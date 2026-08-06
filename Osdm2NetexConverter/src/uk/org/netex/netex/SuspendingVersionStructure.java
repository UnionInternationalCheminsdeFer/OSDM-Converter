//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for SUSPENDING
 * 
 * <p>Java-Klasse f�r Suspending_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Suspending_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SuspendingGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Suspending_VersionStructure", propOrder = {
    "suspensionPolicy",
    "qualificationPeriod",
    "qualificationPercent",
    "minimumSuspensionPeriod",
    "maximumSuspensionPeriod",
    "maximumNumberOfSuspensionsPerTerm"
})
@XmlSeeAlso({
    Suspending.class
})
public class SuspendingVersionStructure
    extends UsageParameterVersionStructure
{

    @XmlList
    @XmlElement(name = "SuspensionPolicy")
    protected List<SuspensionPolicyEnumeration> suspensionPolicy;
    @XmlElement(name = "QualificationPeriod")
    protected Duration qualificationPeriod;
    @XmlElement(name = "QualificationPercent")
    protected BigDecimal qualificationPercent;
    @XmlElement(name = "MinimumSuspensionPeriod")
    protected Duration minimumSuspensionPeriod;
    @XmlElement(name = "MaximumSuspensionPeriod")
    protected Duration maximumSuspensionPeriod;
    @XmlElement(name = "MaximumNumberOfSuspensionsPerTerm")
    protected BigInteger maximumNumberOfSuspensionsPerTerm;

    /**
     * Gets the value of the suspensionPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suspensionPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuspensionPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuspensionPolicyEnumeration }
     * 
     * 
     */
    public List<SuspensionPolicyEnumeration> getSuspensionPolicy() {
        if (suspensionPolicy == null) {
            suspensionPolicy = new ArrayList<SuspensionPolicyEnumeration>();
        }
        return this.suspensionPolicy;
    }

    /**
     * Ruft den Wert der qualificationPeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getQualificationPeriod() {
        return qualificationPeriod;
    }

    /**
     * Legt den Wert der qualificationPeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setQualificationPeriod(Duration value) {
        this.qualificationPeriod = value;
    }

    /**
     * Ruft den Wert der qualificationPercent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQualificationPercent() {
        return qualificationPercent;
    }

    /**
     * Legt den Wert der qualificationPercent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQualificationPercent(BigDecimal value) {
        this.qualificationPercent = value;
    }

    /**
     * Ruft den Wert der minimumSuspensionPeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumSuspensionPeriod() {
        return minimumSuspensionPeriod;
    }

    /**
     * Legt den Wert der minimumSuspensionPeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumSuspensionPeriod(Duration value) {
        this.minimumSuspensionPeriod = value;
    }

    /**
     * Ruft den Wert der maximumSuspensionPeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumSuspensionPeriod() {
        return maximumSuspensionPeriod;
    }

    /**
     * Legt den Wert der maximumSuspensionPeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumSuspensionPeriod(Duration value) {
        this.maximumSuspensionPeriod = value;
    }

    /**
     * Ruft den Wert der maximumNumberOfSuspensionsPerTerm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfSuspensionsPerTerm() {
        return maximumNumberOfSuspensionsPerTerm;
    }

    /**
     * Legt den Wert der maximumNumberOfSuspensionsPerTerm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfSuspensionsPerTerm(BigInteger value) {
        this.maximumNumberOfSuspensionsPerTerm = value;
    }

}
