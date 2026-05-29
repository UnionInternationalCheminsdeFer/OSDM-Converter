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
import javax.xml.datatype.Duration;


/**
 * Type for TRANSFER DURATION.
 * 
 * <p>Java-Klasse f�r TransferDurationStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TransferDurationStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DefaultDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="FrequentTravellerDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="OccasionalTravellerDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="MobilityRestrictedTravellerDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferDurationStructure", propOrder = {
    "defaultDuration",
    "frequentTravellerDuration",
    "occasionalTravellerDuration",
    "mobilityRestrictedTravellerDuration"
})
public class TransferDurationStructure {

    @XmlElement(name = "DefaultDuration")
    protected Duration defaultDuration;
    @XmlElement(name = "FrequentTravellerDuration")
    protected Duration frequentTravellerDuration;
    @XmlElement(name = "OccasionalTravellerDuration")
    protected Duration occasionalTravellerDuration;
    @XmlElement(name = "MobilityRestrictedTravellerDuration")
    protected Duration mobilityRestrictedTravellerDuration;

    /**
     * Ruft den Wert der defaultDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDefaultDuration() {
        return defaultDuration;
    }

    /**
     * Legt den Wert der defaultDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDefaultDuration(Duration value) {
        this.defaultDuration = value;
    }

    /**
     * Ruft den Wert der frequentTravellerDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getFrequentTravellerDuration() {
        return frequentTravellerDuration;
    }

    /**
     * Legt den Wert der frequentTravellerDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setFrequentTravellerDuration(Duration value) {
        this.frequentTravellerDuration = value;
    }

    /**
     * Ruft den Wert der occasionalTravellerDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOccasionalTravellerDuration() {
        return occasionalTravellerDuration;
    }

    /**
     * Legt den Wert der occasionalTravellerDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOccasionalTravellerDuration(Duration value) {
        this.occasionalTravellerDuration = value;
    }

    /**
     * Ruft den Wert der mobilityRestrictedTravellerDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMobilityRestrictedTravellerDuration() {
        return mobilityRestrictedTravellerDuration;
    }

    /**
     * Legt den Wert der mobilityRestrictedTravellerDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMobilityRestrictedTravellerDuration(Duration value) {
        this.mobilityRestrictedTravellerDuration = value;
    }

}
