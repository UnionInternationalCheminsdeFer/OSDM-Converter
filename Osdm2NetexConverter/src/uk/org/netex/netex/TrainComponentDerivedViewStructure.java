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
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for TRAIN COMPONENT VIEW.
 * 
 * <p>Java-Klasse f�r TrainComponent_DerivedViewStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TrainComponent_DerivedViewStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DerivedViewStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TrainComponentViewGroup"/>
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
@XmlType(name = "TrainComponent_DerivedViewStructure", propOrder = {
    "trainComponentRef",
    "label",
    "description",
    "trainElementTypeRef",
    "trainElementRef",
    "fareClasses",
    "trainElementTypeType",
    "trainElementType"
})
@XmlSeeAlso({
    TrainComponentView.class
})
public class TrainComponentDerivedViewStructure
    extends DerivedViewStructure
{

    @XmlElement(name = "TrainComponentRef")
    protected TrainComponentRefStructure trainComponentRef;
    @XmlElement(name = "Label")
    protected MultilingualString label;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElementRef(name = "TrainElementTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TrainElementTypeRefStructure> trainElementTypeRef;
    @XmlElement(name = "TrainElementRef")
    protected TrainElementTypeRefStructure trainElementRef;
    @XmlList
    @XmlElement(name = "FareClasses")
    protected List<FareClassEnumeration> fareClasses;
    @XmlElement(name = "TrainElementTypeType")
    @XmlSchemaType(name = "NMTOKEN")
    protected TrainElementTypeTypeEnumeration trainElementTypeType;
    @XmlElement(name = "TrainElementType")
    @XmlSchemaType(name = "NMTOKEN")
    protected TrainElementTypeTypeEnumeration trainElementType;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;

    /**
     * Ruft den Wert der trainComponentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainComponentRefStructure }
     *     
     */
    public TrainComponentRefStructure getTrainComponentRef() {
        return trainComponentRef;
    }

    /**
     * Legt den Wert der trainComponentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainComponentRefStructure }
     *     
     */
    public void setTrainComponentRef(TrainComponentRefStructure value) {
        this.trainComponentRef = value;
    }

    /**
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setLabel(MultilingualString value) {
        this.label = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescription(MultilingualString value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der trainElementTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TractiveElementTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainElementTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrailingElementTypeRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TrainElementTypeRefStructure> getTrainElementTypeRef() {
        return trainElementTypeRef;
    }

    /**
     * Legt den Wert der trainElementTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TractiveElementTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainElementTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrailingElementTypeRefStructure }{@code >}
     *     
     */
    public void setTrainElementTypeRef(JAXBElement<? extends TrainElementTypeRefStructure> value) {
        this.trainElementTypeRef = value;
    }

    /**
     * Reference to a TRAIN ELEMENT.
     * 
     * @return
     *     possible object is
     *     {@link TrainElementTypeRefStructure }
     *     
     */
    public TrainElementTypeRefStructure getTrainElementRef() {
        return trainElementRef;
    }

    /**
     * Legt den Wert der trainElementRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainElementTypeRefStructure }
     *     
     */
    public void setTrainElementRef(TrainElementTypeRefStructure value) {
        this.trainElementRef = value;
    }

    /**
     * Gets the value of the fareClasses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareClasses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareClasses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareClassEnumeration }
     * 
     * 
     */
    public List<FareClassEnumeration> getFareClasses() {
        if (fareClasses == null) {
            fareClasses = new ArrayList<FareClassEnumeration>();
        }
        return this.fareClasses;
    }

    /**
     * Ruft den Wert der trainElementTypeType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainElementTypeTypeEnumeration }
     *     
     */
    public TrainElementTypeTypeEnumeration getTrainElementTypeType() {
        return trainElementTypeType;
    }

    /**
     * Legt den Wert der trainElementTypeType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainElementTypeTypeEnumeration }
     *     
     */
    public void setTrainElementTypeType(TrainElementTypeTypeEnumeration value) {
        this.trainElementTypeType = value;
    }

    /**
     * Ruft den Wert der trainElementType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainElementTypeTypeEnumeration }
     *     
     */
    public TrainElementTypeTypeEnumeration getTrainElementType() {
        return trainElementType;
    }

    /**
     * Legt den Wert der trainElementType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainElementTypeTypeEnumeration }
     *     
     */
    public void setTrainElementType(TrainElementTypeTypeEnumeration value) {
        this.trainElementType = value;
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
