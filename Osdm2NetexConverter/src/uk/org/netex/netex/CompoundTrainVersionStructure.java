//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for COMPOUND TRAIN.
 * 
 * <p>Java-Klasse f�r CompoundTrain_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CompoundTrain_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VehicleType_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}CompoundTrainGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompoundTrain_VersionStructure", propOrder = {
    "components"
})
@XmlSeeAlso({
    CompoundTrain.class
})
public class CompoundTrainVersionStructure
    extends VehicleTypeVersionStructure
{

    protected TrainsInCompoundTrainRelStructure components;

    /**
     * Ruft den Wert der components-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainsInCompoundTrainRelStructure }
     *     
     */
    public TrainsInCompoundTrainRelStructure getComponents() {
        return components;
    }

    /**
     * Legt den Wert der components-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainsInCompoundTrainRelStructure }
     *     
     */
    public void setComponents(TrainsInCompoundTrainRelStructure value) {
        this.components = value;
    }

}
