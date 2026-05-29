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


/**
 * A telephone number, using GovTalk constructs.
 * 
 * <p>Java-Klasse f�r TelephoneContactStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TelephoneContactStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TelNationalNumber" type="{http://www.netex.org.uk/netex}TelephoneNumberType"/>
 *         &lt;element name="TelExtensionNumber" type="{http://www.netex.org.uk/netex}TelephoneExtensionType" minOccurs="0"/>
 *         &lt;element name="TelCountryCode" type="{http://www.netex.org.uk/netex}TelCountryCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneContactStructure", propOrder = {
    "telNationalNumber",
    "telExtensionNumber",
    "telCountryCode"
})
public class TelephoneContactStructure {

    @XmlElement(name = "TelNationalNumber", required = true)
    protected String telNationalNumber;
    @XmlElement(name = "TelExtensionNumber")
    protected String telExtensionNumber;
    @XmlElement(name = "TelCountryCode")
    protected String telCountryCode;

    /**
     * Ruft den Wert der telNationalNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelNationalNumber() {
        return telNationalNumber;
    }

    /**
     * Legt den Wert der telNationalNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelNationalNumber(String value) {
        this.telNationalNumber = value;
    }

    /**
     * Ruft den Wert der telExtensionNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelExtensionNumber() {
        return telExtensionNumber;
    }

    /**
     * Legt den Wert der telExtensionNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelExtensionNumber(String value) {
        this.telExtensionNumber = value;
    }

    /**
     * Ruft den Wert der telCountryCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelCountryCode() {
        return telCountryCode;
    }

    /**
     * Legt den Wert der telCountryCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelCountryCode(String value) {
        this.telCountryCode = value;
    }

}
