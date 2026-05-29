//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.siri.siri;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;

import uk.org.netex.netex.ExtensionsStructure;


/**
 * Type for Notification to terminate a subscription or subscriptions.
 * 
 * <p>Java-Klasse f�r SubscriptionTerminatedNotificationStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionTerminatedNotificationStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ProducerResponseStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SubscriptionIdentifierResourcePropertyGroup" maxOccurs="unbounded"/>
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}ErrorDescriptionStructure" minOccurs="0"/>
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
@XmlType(name = "SubscriptionTerminatedNotificationStructure", propOrder = {
    "subscriptionIdentifierResourcePropertyGroup",
    "description",
    "extensions"
})
public class SubscriptionTerminatedNotificationStructure
    extends ProducerResponseStructure
{

    @XmlElements({
        @XmlElement(name = "SubscriberRef", required = true, type = ParticipantRefStructure.class),
        @XmlElement(name = "SubscriptionFilterRef", required = true, type = SubscriptionFilterRefStructure.class),
        @XmlElement(name = "SubscriptionRef", required = true, type = SubscriptionQualifierStructure.class)
    })
    protected List<Object> subscriptionIdentifierResourcePropertyGroup;
    @XmlElement(name = "Description")
    protected ErrorDescriptionStructure description;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the subscriptionIdentifierResourcePropertyGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionIdentifierResourcePropertyGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionIdentifierResourcePropertyGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParticipantRefStructure }
     * {@link SubscriptionFilterRefStructure }
     * {@link SubscriptionQualifierStructure }
     * 
     * 
     */
    public List<Object> getSubscriptionIdentifierResourcePropertyGroup() {
        if (subscriptionIdentifierResourcePropertyGroup == null) {
            subscriptionIdentifierResourcePropertyGroup = new ArrayList<Object>();
        }
        return this.subscriptionIdentifierResourcePropertyGroup;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ErrorDescriptionStructure }
     *     
     */
    public ErrorDescriptionStructure getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorDescriptionStructure }
     *     
     */
    public void setDescription(ErrorDescriptionStructure value) {
        this.description = value;
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
