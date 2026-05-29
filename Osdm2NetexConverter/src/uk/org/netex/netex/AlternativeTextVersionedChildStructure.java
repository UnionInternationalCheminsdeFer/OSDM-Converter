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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for ALTERNATIVE TEXT.
 * 
 * <p>Java-Klasse f�r AlternativeText_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AlternativeText_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;element name="DataManagedObjectRef" type="{http://www.netex.org.uk/netex}VersionOfObjectRefStructure" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.netex.org.uk/netex}MultilingualString"/>
 *       &lt;/sequence>
 *       &lt;attribute name="attributeName" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="useForLanguage" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternativeText_VersionedChildStructure", propOrder = {
    "dataManagedObjectRef",
    "text"
})
@XmlSeeAlso({
    AlternativeText.class
})
public class AlternativeTextVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "DataManagedObjectRef")
    protected VersionOfObjectRefStructure dataManagedObjectRef;
    @XmlElement(name = "Text", required = true)
    protected MultilingualString text;
    @XmlAttribute(name = "attributeName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String attributeName;
    @XmlAttribute(name = "useForLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String useForLanguage;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;

    /**
     * Ruft den Wert der dataManagedObjectRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public VersionOfObjectRefStructure getDataManagedObjectRef() {
        return dataManagedObjectRef;
    }

    /**
     * Legt den Wert der dataManagedObjectRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public void setDataManagedObjectRef(VersionOfObjectRefStructure value) {
        this.dataManagedObjectRef = value;
    }

    /**
     * Ruft den Wert der text-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getText() {
        return text;
    }

    /**
     * Legt den Wert der text-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setText(MultilingualString value) {
        this.text = value;
    }

    /**
     * Ruft den Wert der attributeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * Legt den Wert der attributeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeName(String value) {
        this.attributeName = value;
    }

    /**
     * Ruft den Wert der useForLanguage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseForLanguage() {
        return useForLanguage;
    }

    /**
     * Legt den Wert der useForLanguage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseForLanguage(String value) {
        this.useForLanguage = value;
    }

    /**
     * Ruft den Wert der order-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Legt den Wert der order-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

}
