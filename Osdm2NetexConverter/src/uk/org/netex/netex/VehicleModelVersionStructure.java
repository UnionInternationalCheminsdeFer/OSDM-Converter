//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a VEHICLE MODEL.
 * 
 * <p>Java-Klasse f�r VehicleModel_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleModel_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}VehicleModelGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleModel_VersionStructure", propOrder = {
    "name",
    "description",
    "manufacturer",
    "transportTypeRef",
    "range",
    "fullCharge",
    "equipmentProfiles",
    "vehicleModelProfileRef",
    "customerServiceContactDetails"
})
@XmlSeeAlso({
    VehicleModel.class
})
public class VehicleModelVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "Manufacturer")
    protected MultilingualString manufacturer;
    @XmlElementRef(name = "TransportTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TransportTypeRefStructure> transportTypeRef;
    @XmlElement(name = "Range")
    protected BigDecimal range;
    @XmlElement(name = "FullCharge")
    protected BigDecimal fullCharge;
    protected VehicleEquipmentProfileRefsRelStructure equipmentProfiles;
    @XmlElementRef(name = "VehicleModelProfileRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends VehicleModelProfileRefStructure> vehicleModelProfileRef;
    @XmlElement(name = "CustomerServiceContactDetails")
    protected ContactStructure customerServiceContactDetails;

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
     * Ruft den Wert der manufacturer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getManufacturer() {
        return manufacturer;
    }

    /**
     * Legt den Wert der manufacturer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setManufacturer(MultilingualString value) {
        this.manufacturer = value;
    }

    /**
     * Ruft den Wert der transportTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SimpleVehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TransportTypeRefStructure> getTransportTypeRef() {
        return transportTypeRef;
    }

    /**
     * Legt den Wert der transportTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SimpleVehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     
     */
    public void setTransportTypeRef(JAXBElement<? extends TransportTypeRefStructure> value) {
        this.transportTypeRef = value;
    }

    /**
     * Ruft den Wert der range-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRange() {
        return range;
    }

    /**
     * Legt den Wert der range-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRange(BigDecimal value) {
        this.range = value;
    }

    /**
     * Ruft den Wert der fullCharge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFullCharge() {
        return fullCharge;
    }

    /**
     * Legt den Wert der fullCharge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFullCharge(BigDecimal value) {
        this.fullCharge = value;
    }

    /**
     * Ruft den Wert der equipmentProfiles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleEquipmentProfileRefsRelStructure }
     *     
     */
    public VehicleEquipmentProfileRefsRelStructure getEquipmentProfiles() {
        return equipmentProfiles;
    }

    /**
     * Legt den Wert der equipmentProfiles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleEquipmentProfileRefsRelStructure }
     *     
     */
    public void setEquipmentProfiles(VehicleEquipmentProfileRefsRelStructure value) {
        this.equipmentProfiles = value;
    }

    /**
     * Ruft den Wert der vehicleModelProfileRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CarModelProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleModelProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CycleModelProfileRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends VehicleModelProfileRefStructure> getVehicleModelProfileRef() {
        return vehicleModelProfileRef;
    }

    /**
     * Legt den Wert der vehicleModelProfileRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CarModelProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleModelProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CycleModelProfileRefStructure }{@code >}
     *     
     */
    public void setVehicleModelProfileRef(JAXBElement<? extends VehicleModelProfileRefStructure> value) {
        this.vehicleModelProfileRef = value;
    }

    /**
     * Ruft den Wert der customerServiceContactDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContactStructure }
     *     
     */
    public ContactStructure getCustomerServiceContactDetails() {
        return customerServiceContactDetails;
    }

    /**
     * Legt den Wert der customerServiceContactDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactStructure }
     *     
     */
    public void setCustomerServiceContactDetails(ContactStructure value) {
        this.customerServiceContactDetails = value;
    }

}
