//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * Type for Attribute of Class of Entity.
 * 
 * <p>Java-Klasse f�r ClassAttributeInFrameStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ClassAttributeInFrameStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}QName" minOccurs="0"/>
 *         &lt;element name="Mandatory" type="{http://www.netex.org.uk/netex}MandatoryEnumeration" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassAttributeInFrameStructure", propOrder = {
    "type",
    "mandatory"
})
@XmlSeeAlso({
    ClassAttributeInFrame.class
})
public class ClassAttributeInFrameStructure {

    @XmlElement(name = "Type")
    protected QName type;
    @XmlElement(name = "Mandatory", defaultValue = "optional")
    @XmlSchemaType(name = "normalizedString")
    protected MandatoryEnumeration mandatory;
    @XmlAttribute(name = "name")
    protected QName name;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setType(QName value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der mandatory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryEnumeration }
     *     
     */
    public MandatoryEnumeration getMandatory() {
        return mandatory;
    }

    /**
     * Legt den Wert der mandatory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryEnumeration }
     *     
     */
    public void setMandatory(MandatoryEnumeration value) {
        this.mandatory = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setName(QName value) {
        this.name = value;
    }

}
