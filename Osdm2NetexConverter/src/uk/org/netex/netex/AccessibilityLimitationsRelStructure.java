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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a list of ACCESSIBILITY LIMITATIONs.
 * 
 * <p>Java-Klasse f�r accessibilityLimitations_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="accessibilityLimitations_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}strictContainmentAggregationStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}AccessibilityLimitation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accessibilityLimitations_RelStructure", propOrder = {
    "accessibilityLimitation"
})
public class AccessibilityLimitationsRelStructure
    extends StrictContainmentAggregationStructure
{

    @XmlElement(name = "AccessibilityLimitation", required = true)
    protected AccessibilityLimitation accessibilityLimitation;

    /**
     * Assessment of the accessibility of a SITE.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityLimitation }
     *     
     */
    public AccessibilityLimitation getAccessibilityLimitation() {
        return accessibilityLimitation;
    }

    /**
     * Legt den Wert der accessibilityLimitation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityLimitation }
     *     
     */
    public void setAccessibilityLimitation(AccessibilityLimitation value) {
        this.accessibilityLimitation = value;
    }

}
