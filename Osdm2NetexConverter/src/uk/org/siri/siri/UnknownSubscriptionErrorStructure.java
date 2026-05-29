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
 * Type for Error: Subscription not found.
 * 
 * <p>Java-Klasse f�r UnknownSubscriptionErrorStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UnknownSubscriptionErrorStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ErrorCodeStructure">
 *       &lt;sequence>
 *         &lt;element name="SubscriptionCode" type="{http://www.siri.org.uk/siri}SubscriptionQualifierStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnknownSubscriptionErrorStructure", propOrder = {
    "subscriptionCode"
})
public class UnknownSubscriptionErrorStructure
    extends ErrorCodeStructure
{

    @XmlElement(name = "SubscriptionCode")
    protected SubscriptionQualifierStructure subscriptionCode;

    /**
     * Ruft den Wert der subscriptionCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionQualifierStructure }
     *     
     */
    public SubscriptionQualifierStructure getSubscriptionCode() {
        return subscriptionCode;
    }

    /**
     * Legt den Wert der subscriptionCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionQualifierStructure }
     *     
     */
    public void setSubscriptionCode(SubscriptionQualifierStructure value) {
        this.subscriptionCode = value;
    }

}
