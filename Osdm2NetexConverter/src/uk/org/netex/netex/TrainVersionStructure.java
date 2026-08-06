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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for TRAIN.
 * 
 * <p>Java-Klasse f�r Train_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Train_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VehicleType_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}TrainGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Train_VersionStructure", propOrder = {
    "trainSize",
    "components"
})
@XmlSeeAlso({
    Train.class,
    PoweredTrainVersionStructure.class,
    UnpoweredTrainVersionStructure.class
})
public class TrainVersionStructure
    extends VehicleTypeVersionStructure
{

    @XmlElement(name = "TrainSize")
    protected TrainSizeStructure trainSize;
    protected TrainComponentsRelStructure components;

    /**
     * Ruft den Wert der trainSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainSizeStructure }
     *     
     */
    public TrainSizeStructure getTrainSize() {
        return trainSize;
    }

    /**
     * Legt den Wert der trainSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainSizeStructure }
     *     
     */
    public void setTrainSize(TrainSizeStructure value) {
        this.trainSize = value;
    }

    /**
     * Ruft den Wert der components-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainComponentsRelStructure }
     *     
     */
    public TrainComponentsRelStructure getComponents() {
        return components;
    }

    /**
     * Legt den Wert der components-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainComponentsRelStructure }
     *     
     */
    public void setComponents(TrainComponentsRelStructure value) {
        this.components = value;
    }

}
