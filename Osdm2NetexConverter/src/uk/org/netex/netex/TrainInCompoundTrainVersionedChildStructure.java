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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a TRAIN IN COMPOUND TRAIN.
 * 
 * <p>Java-Klasse f�r TrainInCompoundTrain_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TrainInCompoundTrain_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}TrainInCompoundTrainGroup"/>
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainInCompoundTrain_VersionedChildStructure", propOrder = {
    "description",
    "compoundTrainRef",
    "trainRef",
    "trainDummy",
    "trainElementTypeDummy",
    "label",
    "operationalOrientation",
    "reversedOrientation"
})
public class TrainInCompoundTrainVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "CompoundTrainRef")
    protected CompoundTrainRef compoundTrainRef;
    @XmlElementRef(name = "TrainRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TrainRefStructure> trainRef;
    @XmlElementRef(name = "Train_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends DataManagedObjectStructure> trainDummy;
    @XmlElement(name = "TrainElementType_Dummy")
    protected TrainElementTypeDummy trainElementTypeDummy;
    @XmlElement(name = "Label")
    protected MultilingualString label;
    @XmlElement(name = "OperationalOrientation", defaultValue = "forwards")
    @XmlSchemaType(name = "normalizedString")
    protected VehicleOrientationEnumeration operationalOrientation;
    @XmlElement(name = "ReversedOrientation", defaultValue = "false")
    protected Boolean reversedOrientation;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;

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
     * Reference to a TRAIN ELEMENT.
     * 
     * @return
     *     possible object is
     *     {@link CompoundTrainRef }
     *     
     */
    public CompoundTrainRef getCompoundTrainRef() {
        return compoundTrainRef;
    }

    /**
     * Legt den Wert der compoundTrainRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundTrainRef }
     *     
     */
    public void setCompoundTrainRef(CompoundTrainRef value) {
        this.compoundTrainRef = value;
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
     * Ruft den Wert der trainDummy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PoweredTrain }{@code >}
     *     {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrain }{@code >}
     *     {@link JAXBElement }{@code <}{@link Train }{@code >}
     *     
     */
    public JAXBElement<? extends DataManagedObjectStructure> getTrainDummy() {
        return trainDummy;
    }

    /**
     * Legt den Wert der trainDummy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PoweredTrain }{@code >}
     *     {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrain }{@code >}
     *     {@link JAXBElement }{@code <}{@link Train }{@code >}
     *     
     */
    public void setTrainDummy(JAXBElement<? extends DataManagedObjectStructure> value) {
        this.trainDummy = value;
    }

    /**
     * Ruft den Wert der trainElementTypeDummy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainElementTypeDummy }
     *     
     */
    public TrainElementTypeDummy getTrainElementTypeDummy() {
        return trainElementTypeDummy;
    }

    /**
     * Legt den Wert der trainElementTypeDummy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainElementTypeDummy }
     *     
     */
    public void setTrainElementTypeDummy(TrainElementTypeDummy value) {
        this.trainElementTypeDummy = value;
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
     * Ruft den Wert der reversedOrientation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReversedOrientation() {
        return reversedOrientation;
    }

    /**
     * Legt den Wert der reversedOrientation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReversedOrientation(Boolean value) {
        this.reversedOrientation = value;
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
