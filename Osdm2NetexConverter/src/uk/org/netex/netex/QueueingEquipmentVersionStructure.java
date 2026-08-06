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


/**
 * Type for a QUEUEING EQUIPMENT.
 * 
 * <p>Java-Klasse f�r QueueingEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="QueueingEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}AccessEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}QueueingEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueueingEquipment_VersionStructure", propOrder = {
    "numberOfServers",
    "railedQueue",
    "ticketedQueue",
    "disabledPriority",
    "queuingSeatedPossible"
})
@XmlSeeAlso({
    QueueingEquipment.class
})
public class QueueingEquipmentVersionStructure
    extends AccessEquipmentVersionStructure
{

    @XmlElement(name = "NumberOfServers")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfServers;
    @XmlElement(name = "RailedQueue")
    protected Boolean railedQueue;
    @XmlElement(name = "TicketedQueue")
    protected Boolean ticketedQueue;
    @XmlElement(name = "DisabledPriority")
    protected Boolean disabledPriority;
    @XmlElement(name = "QueuingSeatedPossible")
    protected Boolean queuingSeatedPossible;

    /**
     * Ruft den Wert der numberOfServers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfServers() {
        return numberOfServers;
    }

    /**
     * Legt den Wert der numberOfServers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfServers(BigInteger value) {
        this.numberOfServers = value;
    }

    /**
     * Ruft den Wert der railedQueue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRailedQueue() {
        return railedQueue;
    }

    /**
     * Legt den Wert der railedQueue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRailedQueue(Boolean value) {
        this.railedQueue = value;
    }

    /**
     * Ruft den Wert der ticketedQueue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTicketedQueue() {
        return ticketedQueue;
    }

    /**
     * Legt den Wert der ticketedQueue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTicketedQueue(Boolean value) {
        this.ticketedQueue = value;
    }

    /**
     * Ruft den Wert der disabledPriority-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabledPriority() {
        return disabledPriority;
    }

    /**
     * Legt den Wert der disabledPriority-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabledPriority(Boolean value) {
        this.disabledPriority = value;
    }

    /**
     * Ruft den Wert der queuingSeatedPossible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQueuingSeatedPossible() {
        return queuingSeatedPossible;
    }

    /**
     * Legt den Wert der queuingSeatedPossible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQueuingSeatedPossible(Boolean value) {
        this.queuingSeatedPossible = value;
    }

}
