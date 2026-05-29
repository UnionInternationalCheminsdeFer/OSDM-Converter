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
 * Type for ELIGIBILITY CHANGE POLICY.
 * 
 * <p>Java-Klasse f�r EligibilityChangePolicy_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EligibilityChangePolicy_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}EligibilityChangePolicyGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EligibilityChangePolicy_VersionStructure", propOrder = {
    "onBecomingEligiblePolicy",
    "onCeasingToBeEligiblePolicy"
})
@XmlSeeAlso({
    EligibilityChangePolicy.class
})
public class EligibilityChangePolicyVersionStructure
    extends UsageParameterVersionStructure
{

    @XmlElement(name = "OnBecomingEligiblePolicy", defaultValue = "noAction")
    @XmlSchemaType(name = "normalizedString")
    protected OnBecomingEnumeration onBecomingEligiblePolicy;
    @XmlElement(name = "OnCeasingToBeEligiblePolicy")
    @XmlSchemaType(name = "normalizedString")
    protected OnCeasingEnumeration onCeasingToBeEligiblePolicy;

    /**
     * Ruft den Wert der onBecomingEligiblePolicy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OnBecomingEnumeration }
     *     
     */
    public OnBecomingEnumeration getOnBecomingEligiblePolicy() {
        return onBecomingEligiblePolicy;
    }

    /**
     * Legt den Wert der onBecomingEligiblePolicy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OnBecomingEnumeration }
     *     
     */
    public void setOnBecomingEligiblePolicy(OnBecomingEnumeration value) {
        this.onBecomingEligiblePolicy = value;
    }

    /**
     * Ruft den Wert der onCeasingToBeEligiblePolicy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OnCeasingEnumeration }
     *     
     */
    public OnCeasingEnumeration getOnCeasingToBeEligiblePolicy() {
        return onCeasingToBeEligiblePolicy;
    }

    /**
     * Legt den Wert der onCeasingToBeEligiblePolicy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OnCeasingEnumeration }
     *     
     */
    public void setOnCeasingToBeEligiblePolicy(OnCeasingEnumeration value) {
        this.onCeasingToBeEligiblePolicy = value;
    }

}
