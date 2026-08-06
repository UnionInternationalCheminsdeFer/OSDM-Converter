//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Parameters that affect the request processing. Mostly act to reduce the number of stops returned.
 * 
 * <p>Java-Klasse f�r NetworkFrameRequestPolicyStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NetworkFrameRequestPolicyStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaximumNumberOfElements" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="IncludeDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Urgency" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="MustHaveBy" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}language" minOccurs="0"/>
 *         &lt;element name="RequestDetail" type="{http://www.netex.org.uk/netex}OutputDetailListOfEnumerations" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkFrameRequestPolicyStructure", propOrder = {
    "maximumNumberOfElements",
    "includeDeleted",
    "urgency",
    "mustHaveBy",
    "language",
    "requestDetail"
})
public class NetworkFrameRequestPolicyStructure {

    @XmlElement(name = "MaximumNumberOfElements")
    protected BigInteger maximumNumberOfElements;
    @XmlElement(name = "IncludeDeleted", defaultValue = "false")
    protected Boolean includeDeleted;
    @XmlElement(name = "Urgency")
    protected Duration urgency;
    @XmlElement(name = "MustHaveBy")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mustHaveBy;
    @XmlElement(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlList
    @XmlElement(name = "RequestDetail")
    protected List<OutputDetailEnumeration> requestDetail;

    /**
     * Ruft den Wert der maximumNumberOfElements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfElements() {
        return maximumNumberOfElements;
    }

    /**
     * Legt den Wert der maximumNumberOfElements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfElements(BigInteger value) {
        this.maximumNumberOfElements = value;
    }

    /**
     * Ruft den Wert der includeDeleted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeDeleted() {
        return includeDeleted;
    }

    /**
     * Legt den Wert der includeDeleted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeDeleted(Boolean value) {
        this.includeDeleted = value;
    }

    /**
     * Ruft den Wert der urgency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getUrgency() {
        return urgency;
    }

    /**
     * Legt den Wert der urgency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setUrgency(Duration value) {
        this.urgency = value;
    }

    /**
     * Ruft den Wert der mustHaveBy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMustHaveBy() {
        return mustHaveBy;
    }

    /**
     * Legt den Wert der mustHaveBy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMustHaveBy(XMLGregorianCalendar value) {
        this.mustHaveBy = value;
    }

    /**
     * Ruft den Wert der language-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Legt den Wert der language-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the requestDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputDetailEnumeration }
     * 
     * 
     */
    public List<OutputDetailEnumeration> getRequestDetail() {
        if (requestDetail == null) {
            requestDetail = new ArrayList<OutputDetailEnumeration>();
        }
        return this.requestDetail;
    }

}
