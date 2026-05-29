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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for COmmon Subscription Request.
 * 
 * <p>Java-Klasse f�r AbstractSubscriptionRequestStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractSubscriptionRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}RequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SubscriberEndpointGroup"/>
 *         &lt;element name="SubscriptionContext" type="{http://www.siri.org.uk/siri}SubscriptionContextStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractSubscriptionRequestStructure", propOrder = {
    "consumerAddress",
    "subscriptionFilterIdentifier",
    "subscriptionContext"
})
@XmlSeeAlso({
    SubscriptionRequestStructure.class
})
public abstract class AbstractSubscriptionRequestStructure
    extends RequestStructure
{

    @XmlElement(name = "ConsumerAddress")
    @XmlSchemaType(name = "anyURI")
    protected String consumerAddress;
    @XmlElement(name = "SubscriptionFilterIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String subscriptionFilterIdentifier;
    @XmlElement(name = "SubscriptionContext")
    protected SubscriptionContextStructure subscriptionContext;

    /**
     * Ruft den Wert der consumerAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerAddress() {
        return consumerAddress;
    }

    /**
     * Legt den Wert der consumerAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerAddress(String value) {
        this.consumerAddress = value;
    }

    /**
     * Ruft den Wert der subscriptionFilterIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionFilterIdentifier() {
        return subscriptionFilterIdentifier;
    }

    /**
     * Legt den Wert der subscriptionFilterIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionFilterIdentifier(String value) {
        this.subscriptionFilterIdentifier = value;
    }

    /**
     * Ruft den Wert der subscriptionContext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionContextStructure }
     *     
     */
    public SubscriptionContextStructure getSubscriptionContext() {
        return subscriptionContext;
    }

    /**
     * Legt den Wert der subscriptionContext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionContextStructure }
     *     
     */
    public void setSubscriptionContext(SubscriptionContextStructure value) {
        this.subscriptionContext = value;
    }

}
