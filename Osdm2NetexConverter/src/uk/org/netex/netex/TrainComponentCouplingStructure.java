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


/**
 * Type for a TRAIN COMPONENT COUPLING.
 * 
 * <p>Java-Klasse f�r TrainComponentCouplingStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TrainComponentCouplingStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Splittable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ThroughAccess" type="{http://www.netex.org.uk/netex}ThroughAccessEnumeration"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainComponentCouplingStructure", propOrder = {
    "splittable",
    "throughAccess"
})
public class TrainComponentCouplingStructure {

    @XmlElement(name = "Splittable")
    protected Boolean splittable;
    @XmlElement(name = "ThroughAccess", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected ThroughAccessEnumeration throughAccess;

    /**
     * Ruft den Wert der splittable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSplittable() {
        return splittable;
    }

    /**
     * Legt den Wert der splittable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSplittable(Boolean value) {
        this.splittable = value;
    }

    /**
     * Ruft den Wert der throughAccess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ThroughAccessEnumeration }
     *     
     */
    public ThroughAccessEnumeration getThroughAccess() {
        return throughAccess;
    }

    /**
     * Legt den Wert der throughAccess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ThroughAccessEnumeration }
     *     
     */
    public void setThroughAccess(ThroughAccessEnumeration value) {
        this.throughAccess = value;
    }

}
