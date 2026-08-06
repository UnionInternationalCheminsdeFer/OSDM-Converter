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


/**
 * Type for DELIVERY VARIANT.
 * 
 * <p>Java-Klasse f�r DeliveryVariant_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeliveryVariant_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DeliveryVariantGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryVariant_VersionStructure", propOrder = {
    "parentRef",
    "deliveryVariantMediaType",
    "typeOfDeliveryVariantRef",
    "variantText"
})
@XmlSeeAlso({
    DeliveryVariant.class
})
public class DeliveryVariantVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "ParentRef")
    protected VersionOfObjectRefStructure parentRef;
    @XmlElement(name = "DeliveryVariantMediaType", defaultValue = "other")
    @XmlSchemaType(name = "normalizedString")
    protected DeliveryVariantTypeEnumeration deliveryVariantMediaType;
    @XmlElement(name = "TypeOfDeliveryVariantRef")
    protected TypeOfDeliveryVariantRefStructure typeOfDeliveryVariantRef;
    @XmlElement(name = "VariantText")
    protected MultilingualString variantText;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;

    /**
     * Ruft den Wert der parentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public VersionOfObjectRefStructure getParentRef() {
        return parentRef;
    }

    /**
     * Legt den Wert der parentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public void setParentRef(VersionOfObjectRefStructure value) {
        this.parentRef = value;
    }

    /**
     * Ruft den Wert der deliveryVariantMediaType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryVariantTypeEnumeration }
     *     
     */
    public DeliveryVariantTypeEnumeration getDeliveryVariantMediaType() {
        return deliveryVariantMediaType;
    }

    /**
     * Legt den Wert der deliveryVariantMediaType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryVariantTypeEnumeration }
     *     
     */
    public void setDeliveryVariantMediaType(DeliveryVariantTypeEnumeration value) {
        this.deliveryVariantMediaType = value;
    }

    /**
     * Ruft den Wert der typeOfDeliveryVariantRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfDeliveryVariantRefStructure }
     *     
     */
    public TypeOfDeliveryVariantRefStructure getTypeOfDeliveryVariantRef() {
        return typeOfDeliveryVariantRef;
    }

    /**
     * Legt den Wert der typeOfDeliveryVariantRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfDeliveryVariantRefStructure }
     *     
     */
    public void setTypeOfDeliveryVariantRef(TypeOfDeliveryVariantRefStructure value) {
        this.typeOfDeliveryVariantRef = value;
    }

    /**
     * Ruft den Wert der variantText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getVariantText() {
        return variantText;
    }

    /**
     * Legt den Wert der variantText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setVariantText(MultilingualString value) {
        this.variantText = value;
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
