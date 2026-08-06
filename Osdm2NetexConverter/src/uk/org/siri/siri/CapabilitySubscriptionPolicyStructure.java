//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for Common Subscription capabilities.
 * 
 * <p>Java-Klasse f�r CapabilitySubscriptionPolicyStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CapabilitySubscriptionPolicyStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HasIncrementalUpdates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasChangeSensitivity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitySubscriptionPolicyStructure", propOrder = {
    "hasIncrementalUpdates",
    "hasChangeSensitivity"
})
public class CapabilitySubscriptionPolicyStructure {

    @XmlElement(name = "HasIncrementalUpdates", defaultValue = "true")
    protected Boolean hasIncrementalUpdates;
    @XmlElement(name = "HasChangeSensitivity", defaultValue = "true")
    protected Boolean hasChangeSensitivity;

    /**
     * Ruft den Wert der hasIncrementalUpdates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasIncrementalUpdates() {
        return hasIncrementalUpdates;
    }

    /**
     * Legt den Wert der hasIncrementalUpdates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasIncrementalUpdates(Boolean value) {
        this.hasIncrementalUpdates = value;
    }

    /**
     * Ruft den Wert der hasChangeSensitivity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasChangeSensitivity() {
        return hasChangeSensitivity;
    }

    /**
     * Legt den Wert der hasChangeSensitivity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasChangeSensitivity(Boolean value) {
        this.hasChangeSensitivity = value;
    }

}
