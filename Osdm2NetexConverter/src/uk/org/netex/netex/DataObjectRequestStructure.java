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
import uk.org.siri.siri.AbstractFunctionalServiceRequestStructure;


/**
 * Type for Service Request Type for one or more NeTEx Data Objects,
 * 
 * <p>Java-Klasse f�r DataObjectRequestStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DataObjectRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractFunctionalServiceRequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DataObjectRequestGroup"/>
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
@XmlType(name = "DataObjectRequestStructure", propOrder = {
    "topics",
    "policy",
    "extensions"
})
public class DataObjectRequestStructure
    extends AbstractFunctionalServiceRequestStructure
{

    @XmlElement(required = true)
    protected DataObjectRequestStructure.Topics topics;
    @XmlElement(name = "Policy")
    protected NetworkFrameRequestPolicyStructure policy;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der topics-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectRequestStructure.Topics }
     *     
     */
    public DataObjectRequestStructure.Topics getTopics() {
        return topics;
    }

    /**
     * Legt den Wert der topics-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectRequestStructure.Topics }
     *     
     */
    public void setTopics(DataObjectRequestStructure.Topics value) {
        this.topics = value;
    }

    /**
     * Ruft den Wert der policy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NetworkFrameRequestPolicyStructure }
     *     
     */
    public NetworkFrameRequestPolicyStructure getPolicy() {
        return policy;
    }

    /**
     * Legt den Wert der policy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkFrameRequestPolicyStructure }
     *     
     */
    public void setPolicy(NetworkFrameRequestPolicyStructure value) {
        this.policy = value;
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


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.netex.org.uk/netex}NetworkFrameTopic"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "networkFrameTopic"
    })
    public static class Topics {

        @XmlElement(name = "NetworkFrameTopic", required = true)
        protected NetworkFrameTopic networkFrameTopic;

        /**
         * Ruft den Wert der networkFrameTopic-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link NetworkFrameTopic }
         *     
         */
        public NetworkFrameTopic getNetworkFrameTopic() {
            return networkFrameTopic;
        }

        /**
         * Legt den Wert der networkFrameTopic-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link NetworkFrameTopic }
         *     
         */
        public void setNetworkFrameTopic(NetworkFrameTopic value) {
            this.networkFrameTopic = value;
        }

    }

}
