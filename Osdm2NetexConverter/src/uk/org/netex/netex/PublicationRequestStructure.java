//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for Publication Request.
 * 
 * <p>Java-Klasse f�r PublicationRequestStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PublicationRequestStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}ParticipantRef" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/>
 *         &lt;element name="topics" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NetworkFrameTopic" type="{http://www.netex.org.uk/netex}NetworkFrameTopicStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RequestPolicy" type="{http://www.netex.org.uk/netex}NetworkFrameRequestPolicyStructure" minOccurs="0"/>
 *         &lt;element name="SubscriptionPolicy" type="{http://www.netex.org.uk/netex}NetworkFrameSubscriptionPolicyStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="1.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicationRequestStructure", propOrder = {
    "requestTimestamp",
    "participantRef",
    "description",
    "topics",
    "requestPolicy",
    "subscriptionPolicy"
})
public class PublicationRequestStructure {

    @XmlElement(name = "RequestTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestTimestamp;
    @XmlElement(name = "ParticipantRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String participantRef;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    protected PublicationRequestStructure.RequestTopics topics;
    @XmlElement(name = "RequestPolicy")
    protected NetworkFrameRequestPolicyStructure requestPolicy;
    @XmlElement(name = "SubscriptionPolicy")
    protected NetworkFrameSubscriptionPolicyStructure subscriptionPolicy;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String version;

    /**
     * Ruft den Wert der requestTimestamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestTimestamp() {
        return requestTimestamp;
    }

    /**
     * Legt den Wert der requestTimestamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestTimestamp(XMLGregorianCalendar value) {
        this.requestTimestamp = value;
    }

    /**
     * Ruft den Wert der participantRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantRef() {
        return participantRef;
    }

    /**
     * Legt den Wert der participantRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantRef(String value) {
        this.participantRef = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescription(MultilingualString value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der topics-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublicationRequestStructure.Topics }
     *     
     */
    public PublicationRequestStructure.RequestTopics getTopics() {
        return topics;
    }

    /**
     * Legt den Wert der topics-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationRequestStructure.Topics }
     *     
     */
    public void setTopics(PublicationRequestStructure.RequestTopics value) {
        this.topics = value;
    }

    /**
     * Ruft den Wert der requestPolicy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NetworkFrameRequestPolicyStructure }
     *     
     */
    public NetworkFrameRequestPolicyStructure getRequestPolicy() {
        return requestPolicy;
    }

    /**
     * Legt den Wert der requestPolicy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkFrameRequestPolicyStructure }
     *     
     */
    public void setRequestPolicy(NetworkFrameRequestPolicyStructure value) {
        this.requestPolicy = value;
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
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
     *         &lt;element name="NetworkFrameTopic" type="{http://www.netex.org.uk/netex}NetworkFrameTopicStructure" maxOccurs="unbounded"/>
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
    public static class RequestTopics {

        @XmlElement(name = "NetworkFrameTopic", required = true)
        protected List<NetworkFrameTopicStructure> networkFrameTopic;

        /**
         * Gets the value of the networkFrameTopic property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the networkFrameTopic property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNetworkFrameTopic().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NetworkFrameTopicStructure }
         * 
         * 
         */
        public List<NetworkFrameTopicStructure> getNetworkFrameTopic() {
            if (networkFrameTopic == null) {
                networkFrameTopic = new ArrayList<NetworkFrameTopicStructure>();
            }
            return this.networkFrameTopic;
        }

    }

}
