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
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for Fiexd Start WIndow.
 * 
 * <p>Java-Klasse f�r FixedStartWindowStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FixedStartWindowStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaximumServicesBefore" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="FlexiblePeriodBefore" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="MaximumServicesAfter" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="FlexiblePeriodAfter" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedStartWindowStructure", propOrder = {
    "maximumServicesBefore",
    "flexiblePeriodBefore",
    "maximumServicesAfter",
    "flexiblePeriodAfter"
})
public class FixedStartWindowStructure {

    @XmlElement(name = "MaximumServicesBefore")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumServicesBefore;
    @XmlElement(name = "FlexiblePeriodBefore")
    protected Duration flexiblePeriodBefore;
    @XmlElement(name = "MaximumServicesAfter")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumServicesAfter;
    @XmlElement(name = "FlexiblePeriodAfter")
    protected Duration flexiblePeriodAfter;

    /**
     * Ruft den Wert der maximumServicesBefore-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumServicesBefore() {
        return maximumServicesBefore;
    }

    /**
     * Legt den Wert der maximumServicesBefore-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumServicesBefore(BigInteger value) {
        this.maximumServicesBefore = value;
    }

    /**
     * Ruft den Wert der flexiblePeriodBefore-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getFlexiblePeriodBefore() {
        return flexiblePeriodBefore;
    }

    /**
     * Legt den Wert der flexiblePeriodBefore-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setFlexiblePeriodBefore(Duration value) {
        this.flexiblePeriodBefore = value;
    }

    /**
     * Ruft den Wert der maximumServicesAfter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumServicesAfter() {
        return maximumServicesAfter;
    }

    /**
     * Legt den Wert der maximumServicesAfter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumServicesAfter(BigInteger value) {
        this.maximumServicesAfter = value;
    }

    /**
     * Ruft den Wert der flexiblePeriodAfter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getFlexiblePeriodAfter() {
        return flexiblePeriodAfter;
    }

    /**
     * Legt den Wert der flexiblePeriodAfter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setFlexiblePeriodAfter(Duration value) {
        this.flexiblePeriodAfter = value;
    }

}
