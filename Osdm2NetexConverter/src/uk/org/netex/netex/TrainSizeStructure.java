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


/**
 * Type for a TRAIN SIZE REQUIREMENT.
 * 
 * <p>Java-Klasse f�r TrainSizeStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TrainSizeStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberOfCars" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="TrainSizeType" type="{http://www.netex.org.uk/netex}TrainSizeEnumeration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainSizeStructure", propOrder = {
    "numberOfCars",
    "trainSizeType"
})
public class TrainSizeStructure {

    @XmlElement(name = "NumberOfCars")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfCars;
    @XmlElement(name = "TrainSizeType", defaultValue = "normal")
    @XmlSchemaType(name = "NMTOKEN")
    protected TrainSizeEnumeration trainSizeType;

    /**
     * Ruft den Wert der numberOfCars-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfCars() {
        return numberOfCars;
    }

    /**
     * Legt den Wert der numberOfCars-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfCars(BigInteger value) {
        this.numberOfCars = value;
    }

    /**
     * Ruft den Wert der trainSizeType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainSizeEnumeration }
     *     
     */
    public TrainSizeEnumeration getTrainSizeType() {
        return trainSizeType;
    }

    /**
     * Legt den Wert der trainSizeType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainSizeEnumeration }
     *     
     */
    public void setTrainSizeType(TrainSizeEnumeration value) {
        this.trainSizeType = value;
    }

}
