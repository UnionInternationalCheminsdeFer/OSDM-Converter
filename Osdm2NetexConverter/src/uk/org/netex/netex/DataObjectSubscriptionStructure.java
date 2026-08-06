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
import uk.org.siri.siri.AbstractSubscriptionStructure;


/**
 * Data type for Subscription Request for NeTEx Data Object Service.
 * 
 * <p>Java-Klasse f�r DataObjectSubscriptionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DataObjectSubscriptionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSubscriptionStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}DataObjectRequest"/>
 *         &lt;element name="SubscriptionPolicy" type="{http://www.netex.org.uk/netex}NetworkFrameSubscriptionPolicyStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataObjectSubscriptionStructure", propOrder = {
    "dataObjectRequest",
    "subscriptionPolicy",
    "extensions"
})
public class DataObjectSubscriptionStructure
    extends AbstractSubscriptionStructure
{

    @XmlElement(name = "DataObjectRequest", required = true)
    protected DataObjectRequestStructure dataObjectRequest;
    @XmlElement(name = "SubscriptionPolicy")
    protected NetworkFrameSubscriptionPolicyStructure subscriptionPolicy;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der dataObjectRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectRequestStructure }
     *     
     */
    public DataObjectRequestStructure getDataObjectRequest() {
        return dataObjectRequest;
    }

    /**
     * Legt den Wert der dataObjectRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectRequestStructure }
     *     
     */
    public void setDataObjectRequest(DataObjectRequestStructure value) {
        this.dataObjectRequest = value;
    }

    /**
     * Ruft den Wert der subscriptionPolicy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NetworkFrameSubscriptionPolicyStructure }
     *     
     */
    public NetworkFrameSubscriptionPolicyStructure getSubscriptionPolicy() {
        return subscriptionPolicy;
    }

    /**
     * Legt den Wert der subscriptionPolicy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkFrameSubscriptionPolicyStructure }
     *     
     */
    public void setSubscriptionPolicy(NetworkFrameSubscriptionPolicyStructure value) {
        this.subscriptionPolicy = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

}
