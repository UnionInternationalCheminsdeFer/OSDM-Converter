//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Type for Info Link.
 * 
 * <p>Java-Klasse f�r InfoLinkStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InfoLinkStructure">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
 *       &lt;attribute name="typeOfInfoLink">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.netex.org.uk/netex}TypeOfInfoLinkEnumeration" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="targetPlatform" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoLinkStructure", propOrder = {
    "value"
})
public class InfoLinkStructure {

    @XmlValue
    @XmlSchemaType(name = "anyURI")
    protected String value;
    @XmlAttribute(name = "typeOfInfoLink")
    protected List<TypeOfInfoLinkEnumeration> typeOfInfoLink;
    @XmlAttribute(name = "targetPlatform")
    @XmlSchemaType(name = "anySimpleType")
    protected String targetPlatform;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the typeOfInfoLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeOfInfoLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeOfInfoLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeOfInfoLinkEnumeration }
     * 
     * 
     */
    public List<TypeOfInfoLinkEnumeration> getTypeOfInfoLink() {
        if (typeOfInfoLink == null) {
            typeOfInfoLink = new ArrayList<TypeOfInfoLinkEnumeration>();
        }
        return this.typeOfInfoLink;
    }

    /**
     * Ruft den Wert der targetPlatform-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetPlatform() {
        return targetPlatform;
    }

    /**
     * Legt den Wert der targetPlatform-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetPlatform(String value) {
        this.targetPlatform = value;
    }

}
