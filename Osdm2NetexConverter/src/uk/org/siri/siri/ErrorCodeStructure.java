//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.siri.siri;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for Error Code.
 * 
 * <p>Java-Klasse f�r ErrorCodeStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ErrorCodeStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorCodeStructure", propOrder = {
    "errorText"
})
@XmlSeeAlso({
    AllowedResourceUsageExceededErrorStructure.class,
    UnknownEndpointErrorStructure.class,
    ServiceNotAvailableErrorStructure.class,
    BeyondDataHorizonErrorStructure.class,
    UnknownSubscriptionErrorStructure.class,
    InvalidDataReferencesErrorStructure.class,
    EndpointDeniedAccessStructure.class,
    UnapprovedKeyAccessStructure.class,
    EndpointNotAvailableAccessStructure.class,
    CapabilityNotSupportedErrorStructure.class,
    UnknownExtensionsErrorStructure.class,
    UnknownParticipantErrorStructure.class,
    NoInfoForTopicErrorStructure.class,
    UnknownSubscriberErrorStructure.class,
    AccessNotAllowedErrorStructure.class,
    ParametersIgnoredErrorStructure.class,
    OtherErrorStructure.class
})
public class ErrorCodeStructure {

    @XmlElement(name = "ErrorText")
    protected String errorText;
    @XmlAttribute(name = "number")
    protected BigInteger number;

    /**
     * Ruft den Wert der errorText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * Legt den Wert der errorText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorText(String value) {
        this.errorText = value;
    }

    /**
     * Ruft den Wert der number-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Legt den Wert der number-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

}
