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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Payment By Mobile details.
 * 
 * <p>Java-Klasse f�r PaymentByMobileStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PaymentByMobileStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PhoneNumberToPay" type="{http://www.netex.org.uk/netex}PhoneType" minOccurs="0"/>
 *         &lt;element name="SupportPhoneNumber" type="{http://www.netex.org.uk/netex}PhoneType" minOccurs="0"/>
 *         &lt;element name="PaymentUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="PaymentAppDownloadUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentByMobileStructure", propOrder = {
    "phoneNumberToPay",
    "supportPhoneNumber",
    "paymentUrl",
    "paymentAppDownloadUrl"
})
public class PaymentByMobileStructure {

    @XmlElement(name = "PhoneNumberToPay")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String phoneNumberToPay;
    @XmlElement(name = "SupportPhoneNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String supportPhoneNumber;
    @XmlElement(name = "PaymentUrl")
    @XmlSchemaType(name = "anyURI")
    protected String paymentUrl;
    @XmlElement(name = "PaymentAppDownloadUrl")
    @XmlSchemaType(name = "anyURI")
    protected String paymentAppDownloadUrl;

    /**
     * Ruft den Wert der phoneNumberToPay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberToPay() {
        return phoneNumberToPay;
    }

    /**
     * Legt den Wert der phoneNumberToPay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberToPay(String value) {
        this.phoneNumberToPay = value;
    }

    /**
     * Ruft den Wert der supportPhoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportPhoneNumber() {
        return supportPhoneNumber;
    }

    /**
     * Legt den Wert der supportPhoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportPhoneNumber(String value) {
        this.supportPhoneNumber = value;
    }

    /**
     * Ruft den Wert der paymentUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentUrl() {
        return paymentUrl;
    }

    /**
     * Legt den Wert der paymentUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentUrl(String value) {
        this.paymentUrl = value;
    }

    /**
     * Ruft den Wert der paymentAppDownloadUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAppDownloadUrl() {
        return paymentAppDownloadUrl;
    }

    /**
     * Legt den Wert der paymentAppDownloadUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAppDownloadUrl(String value) {
        this.paymentAppDownloadUrl = value;
    }

}
