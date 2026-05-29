//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a TRAIN COMPONENT.
 * 
 * <p>Java-Klasse f�r TrainComponent_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TrainComponent_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}TrainComponentGroup"/>
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainComponent_VersionStructure", propOrder = {
    "label",
    "description",
    "trainRef",
    "trainElementTypeRef",
    "trainElementRef",
    "trainElement",
    "operationalOrientation",
    "forwardCoupling"
})
@XmlSeeAlso({
    TrainComponent.class
})
public class TrainComponentVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Label")
    protected MultilingualString label;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElementRef(name = "TrainRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TrainRefStructure> trainRef;
    @XmlElementRef(name = "TrainElementTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TrainElementTypeRefStructure> trainElementTypeRef;
    @XmlElement(name = "TrainElementRef")
    protected TrainElementTypeRefStructure trainElementRef;
    @XmlElement(name = "TrainElement")
    protected TrainElement trainElement;
    @XmlElement(name = "OperationalOrientation", defaultValue = "forwards")
    @XmlSchemaType(name = "normalizedString")
    protected VehicleOrientationEnumeration operationalOrientation;
    @XmlElement(name = "ForwardCoupling")
    protected TrainComponentCouplingStructure forwardCoupling;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;

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
     * Reference to a TRAIN.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TrainRefStructure> getTrainRef() {
        return trainRef;
    }

    /**
     * Legt den Wert der trainRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     
     */
    public void setTrainRef(JAXBElement<? extends TrainRefStructure> value) {
        this.trainRef = value;
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
     * Ruft den Wert der trainElementRef-Eigenschaft ab.
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
     * Ruft den Wert der trainElement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainElement }
     *     
     */
    public TrainElement getTrainElement() {
        return trainElement;
    }

    /**
     * Legt den Wert der trainElement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainElement }
     *     
     */
    public void setTrainElement(TrainElement value) {
        this.trainElement = value;
    }

    /**
     * Ruft den Wert der operationalOrientation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleOrientationEnumeration }
     *     
     */
    public VehicleOrientationEnumeration getOperationalOrientation() {
        return operationalOrientation;
    }

    /**
     * Legt den Wert der operationalOrientation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleOrientationEnumeration }
     *     
     */
    public void setOperationalOrientation(VehicleOrientationEnumeration value) {
        this.operationalOrientation = value;
    }

    /**
     * Ruft den Wert der forwardCoupling-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainComponentCouplingStructure }
     *     
     */
    public TrainComponentCouplingStructure getForwardCoupling() {
        return forwardCoupling;
    }

    /**
     * Legt den Wert der forwardCoupling-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainComponentCouplingStructure }
     *     
     */
    public void setForwardCoupling(TrainComponentCouplingStructure value) {
        this.forwardCoupling = value;
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
