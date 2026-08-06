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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for implementation structure.
 * 
 * <p>Java-Klasse f�r TransportDescriptionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TransportDescriptionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommunicationsTransportMethod" type="{http://www.siri.org.uk/siri}CommunicationsTransportMethodEnumeration"/>
 *         &lt;element name="CompressionMethod" type="{http://www.siri.org.uk/siri}CompressionMethodEnumeration"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportDescriptionStructure", propOrder = {
    "communicationsTransportMethod",
    "compressionMethod"
})
public class TransportDescriptionStructure {

    @XmlElement(name = "CommunicationsTransportMethod", required = true, defaultValue = "httpPost")
    @XmlSchemaType(name = "NMTOKEN")
    protected CommunicationsTransportMethodEnumeration communicationsTransportMethod;
    @XmlElement(name = "CompressionMethod", required = true, defaultValue = "none")
    @XmlSchemaType(name = "NMTOKEN")
    protected CompressionMethodEnumeration compressionMethod;

    /**
     * Ruft den Wert der communicationsTransportMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationsTransportMethodEnumeration }
     *     
     */
    public CommunicationsTransportMethodEnumeration getCommunicationsTransportMethod() {
        return communicationsTransportMethod;
    }

    /**
     * Legt den Wert der communicationsTransportMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationsTransportMethodEnumeration }
     *     
     */
    public void setCommunicationsTransportMethod(CommunicationsTransportMethodEnumeration value) {
        this.communicationsTransportMethod = value;
    }

    /**
     * Ruft den Wert der compressionMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompressionMethodEnumeration }
     *     
     */
    public CompressionMethodEnumeration getCompressionMethod() {
        return compressionMethod;
    }

    /**
     * Legt den Wert der compressionMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompressionMethodEnumeration }
     *     
     */
    public void setCompressionMethod(CompressionMethodEnumeration value) {
        this.compressionMethod = value;
    }

}
