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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import uk.org.netex.netex.DataObjectServiceCapabilitiesStructure;


/**
 * Type for Capabilities of StopMonitopring Service.
 * 
 * <p>Java-Klasse f�r AbstractCapabilitiesStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractCapabilitiesStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeneralInteraction" type="{http://www.siri.org.uk/siri}CapabilityGeneralInteractionStructure" minOccurs="0"/>
 *         &lt;element name="TransportDescription" type="{http://www.siri.org.uk/siri}TransportDescriptionStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCapabilitiesStructure", propOrder = {
    "generalInteraction",
    "transportDescription"
})
@XmlSeeAlso({
    DataObjectServiceCapabilitiesStructure.class
})
public class AbstractCapabilitiesStructure {

    @XmlElement(name = "GeneralInteraction")
    protected CapabilityGeneralInteractionStructure generalInteraction;
    @XmlElement(name = "TransportDescription")
    protected TransportDescriptionStructure transportDescription;

    /**
     * Ruft den Wert der generalInteraction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityGeneralInteractionStructure }
     *     
     */
    public CapabilityGeneralInteractionStructure getGeneralInteraction() {
        return generalInteraction;
    }

    /**
     * Legt den Wert der generalInteraction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityGeneralInteractionStructure }
     *     
     */
    public void setGeneralInteraction(CapabilityGeneralInteractionStructure value) {
        this.generalInteraction = value;
    }

    /**
     * Ruft den Wert der transportDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransportDescriptionStructure }
     *     
     */
    public TransportDescriptionStructure getTransportDescription() {
        return transportDescription;
    }

    /**
     * Legt den Wert der transportDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportDescriptionStructure }
     *     
     */
    public void setTransportDescription(TransportDescriptionStructure value) {
        this.transportDescription = value;
    }

}
