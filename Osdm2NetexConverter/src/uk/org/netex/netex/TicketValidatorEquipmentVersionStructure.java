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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a TICKET VALIDATOR EQUIPMENT.
 * 
 * <p>Java-Klasse f�r TicketValidatorEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TicketValidatorEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PassengerEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TicketValidatorGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketValidatorEquipment_VersionStructure", propOrder = {
    "ticketValidatorType",
    "audioValidationFeedback",
    "visualValidationFeedback",
    "tactileValidationFeedback",
    "validationGuidance"
})
@XmlSeeAlso({
    TicketValidatorEquipment.class
})
public class TicketValidatorEquipmentVersionStructure
    extends PassengerEquipmentVersionStructure
{

    @XmlList
    @XmlElement(name = "TicketValidatorType")
    protected List<TicketValidatorEnumeration> ticketValidatorType;
    @XmlElement(name = "AudioValidationFeedback")
    protected Boolean audioValidationFeedback;
    @XmlElement(name = "VisualValidationFeedback")
    protected Boolean visualValidationFeedback;
    @XmlElement(name = "TactileValidationFeedback")
    protected Boolean tactileValidationFeedback;
    @XmlElement(name = "ValidationGuidance")
    protected MultilingualString validationGuidance;

    /**
     * Gets the value of the ticketValidatorType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketValidatorType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketValidatorType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketValidatorEnumeration }
     * 
     * 
     */
    public List<TicketValidatorEnumeration> getTicketValidatorType() {
        if (ticketValidatorType == null) {
            ticketValidatorType = new ArrayList<TicketValidatorEnumeration>();
        }
        return this.ticketValidatorType;
    }

    /**
     * Ruft den Wert der audioValidationFeedback-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAudioValidationFeedback() {
        return audioValidationFeedback;
    }

    /**
     * Legt den Wert der audioValidationFeedback-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAudioValidationFeedback(Boolean value) {
        this.audioValidationFeedback = value;
    }

    /**
     * Ruft den Wert der visualValidationFeedback-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisualValidationFeedback() {
        return visualValidationFeedback;
    }

    /**
     * Legt den Wert der visualValidationFeedback-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisualValidationFeedback(Boolean value) {
        this.visualValidationFeedback = value;
    }

    /**
     * Ruft den Wert der tactileValidationFeedback-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTactileValidationFeedback() {
        return tactileValidationFeedback;
    }

    /**
     * Legt den Wert der tactileValidationFeedback-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTactileValidationFeedback(Boolean value) {
        this.tactileValidationFeedback = value;
    }

    /**
     * Ruft den Wert der validationGuidance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getValidationGuidance() {
        return validationGuidance;
    }

    /**
     * Legt den Wert der validationGuidance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setValidationGuidance(MultilingualString value) {
        this.validationGuidance = value;
    }

}
