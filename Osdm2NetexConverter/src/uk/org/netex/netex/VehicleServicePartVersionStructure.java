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
 * Type for VEHICLE SERVICE PART.
 * 
 * <p>Java-Klasse f�r VehicleServicePart_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleServicePart_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehicleServicePartGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleServicePart_VersionStructure", propOrder = {
    "name",
    "description",
    "vehicleServiceRef",
    "startPointRef",
    "endPointRef"
})
@XmlSeeAlso({
    VehicleServicePart.class
})
public class VehicleServicePartVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "VehicleServiceRef")
    protected VehicleServiceRefStructure vehicleServiceRef;
    @XmlElement(name = "StartPointRef")
    protected GaragePointRefStructure startPointRef;
    @XmlElement(name = "EndPointRef")
    protected GaragePointRefStructure endPointRef;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
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
     * Ruft den Wert der vehicleServiceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleServiceRefStructure }
     *     
     */
    public VehicleServiceRefStructure getVehicleServiceRef() {
        return vehicleServiceRef;
    }

    /**
     * Legt den Wert der vehicleServiceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleServiceRefStructure }
     *     
     */
    public void setVehicleServiceRef(VehicleServiceRefStructure value) {
        this.vehicleServiceRef = value;
    }

    /**
     * Ruft den Wert der startPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GaragePointRefStructure }
     *     
     */
    public GaragePointRefStructure getStartPointRef() {
        return startPointRef;
    }

    /**
     * Legt den Wert der startPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GaragePointRefStructure }
     *     
     */
    public void setStartPointRef(GaragePointRefStructure value) {
        this.startPointRef = value;
    }

    /**
     * Ruft den Wert der endPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GaragePointRefStructure }
     *     
     */
    public GaragePointRefStructure getEndPointRef() {
        return endPointRef;
    }

    /**
     * Legt den Wert der endPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GaragePointRefStructure }
     *     
     */
    public void setEndPointRef(GaragePointRefStructure value) {
        this.endPointRef = value;
    }

}
