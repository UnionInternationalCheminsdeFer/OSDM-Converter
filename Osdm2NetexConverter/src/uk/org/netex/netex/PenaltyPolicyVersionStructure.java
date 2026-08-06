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
import javax.xml.datatype.Duration;


/**
 * Type for PENALTY POLICY.
 * 
 * <p>Java-Klasse f�r PenaltyPolicy_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PenaltyPolicy_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PenaltyPolicyGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyPolicy_VersionStructure", propOrder = {
    "penaltyPolicyType",
    "sameStationRentryPolicy",
    "minimumTimeBeforeReentry",
    "maximumNumberOfFailToCheckOutEvents"
})
@XmlSeeAlso({
    PenaltyPolicy.class
})
public class PenaltyPolicyVersionStructure
    extends UsageParameterVersionStructure
{

    @XmlElement(name = "PenaltyPolicyType")
    @XmlSchemaType(name = "normalizedString")
    protected PenaltyPolicyTypeEnumeration penaltyPolicyType;
    @XmlElement(name = "SameStationRentryPolicy")
    @XmlSchemaType(name = "normalizedString")
    protected SameStationReentryPolicyEnumeration sameStationRentryPolicy;
    @XmlElement(name = "MinimumTimeBeforeReentry")
    protected Duration minimumTimeBeforeReentry;
    @XmlElement(name = "MaximumNumberOfFailToCheckOutEvents")
    protected BigInteger maximumNumberOfFailToCheckOutEvents;

    /**
     * Ruft den Wert der penaltyPolicyType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyPolicyTypeEnumeration }
     *     
     */
    public PenaltyPolicyTypeEnumeration getPenaltyPolicyType() {
        return penaltyPolicyType;
    }

    /**
     * Legt den Wert der penaltyPolicyType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyPolicyTypeEnumeration }
     *     
     */
    public void setPenaltyPolicyType(PenaltyPolicyTypeEnumeration value) {
        this.penaltyPolicyType = value;
    }

    /**
     * Ruft den Wert der sameStationRentryPolicy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SameStationReentryPolicyEnumeration }
     *     
     */
    public SameStationReentryPolicyEnumeration getSameStationRentryPolicy() {
        return sameStationRentryPolicy;
    }

    /**
     * Legt den Wert der sameStationRentryPolicy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SameStationReentryPolicyEnumeration }
     *     
     */
    public void setSameStationRentryPolicy(SameStationReentryPolicyEnumeration value) {
        this.sameStationRentryPolicy = value;
    }

    /**
     * Ruft den Wert der minimumTimeBeforeReentry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumTimeBeforeReentry() {
        return minimumTimeBeforeReentry;
    }

    /**
     * Legt den Wert der minimumTimeBeforeReentry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumTimeBeforeReentry(Duration value) {
        this.minimumTimeBeforeReentry = value;
    }

    /**
     * Ruft den Wert der maximumNumberOfFailToCheckOutEvents-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfFailToCheckOutEvents() {
        return maximumNumberOfFailToCheckOutEvents;
    }

    /**
     * Legt den Wert der maximumNumberOfFailToCheckOutEvents-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfFailToCheckOutEvents(BigInteger value) {
        this.maximumNumberOfFailToCheckOutEvents = value;
    }

}
