//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for a VEHICLE.
 * 
 * <p>Java-Klasse f�r Vehicle_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Vehicle_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehicleGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle_VersionStructure", propOrder = {
    "name",
    "shortName",
    "description",
    "buildDate",
    "chassisNumber",
    "registrationNumber",
    "registrationDate",
    "operationalNumber",
    "privateCode",
    "transportOrganisationRef",
    "contactRef",
    "transportTypeRef",
    "vehicleModelRef",
    "equipmentProfiles",
    "vehicleModelProfileRef",
    "actualVehicleEquipments",
    "monitored"
})
@XmlSeeAlso({
    Vehicle.class,
    RollingStockItemVersionStructure.class
})
public class VehicleVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "ShortName")
    protected MultilingualString shortName;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "BuildDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar buildDate;
    @XmlElement(name = "ChassisNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String chassisNumber;
    @XmlElement(name = "RegistrationNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String registrationNumber;
    @XmlElement(name = "RegistrationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar registrationDate;
    @XmlElement(name = "OperationalNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String operationalNumber;
    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElementRef(name = "TransportOrganisationRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TransportOrganisationRefStructure> transportOrganisationRef;
    @XmlElement(name = "ContactRef")
    protected ContactRefStructure contactRef;
    @XmlElementRef(name = "TransportTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TransportTypeRefStructure> transportTypeRef;
    @XmlElement(name = "VehicleModelRef")
    protected VehicleModelRefStructure vehicleModelRef;
    protected VehicleEquipmentProfileRefsRelStructure equipmentProfiles;
    @XmlElementRef(name = "VehicleModelProfileRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends VehicleModelProfileRefStructure> vehicleModelProfileRef;
    protected EquipmentsRelStructure actualVehicleEquipments;
    @XmlElement(name = "Monitored")
    protected Boolean monitored;

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
     * Ruft den Wert der shortName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getShortName() {
        return shortName;
    }

    /**
     * Legt den Wert der shortName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setShortName(MultilingualString value) {
        this.shortName = value;
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
     * Ruft den Wert der buildDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBuildDate() {
        return buildDate;
    }

    /**
     * Legt den Wert der buildDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBuildDate(XMLGregorianCalendar value) {
        this.buildDate = value;
    }

    /**
     * Ruft den Wert der chassisNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChassisNumber() {
        return chassisNumber;
    }

    /**
     * Legt den Wert der chassisNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChassisNumber(String value) {
        this.chassisNumber = value;
    }

    /**
     * Ruft den Wert der registrationNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Legt den Wert der registrationNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

    /**
     * Ruft den Wert der registrationDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Legt den Wert der registrationDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationDate(XMLGregorianCalendar value) {
        this.registrationDate = value;
    }

    /**
     * Ruft den Wert der operationalNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationalNumber() {
        return operationalNumber;
    }

    /**
     * Legt den Wert der operationalNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationalNumber(String value) {
        this.operationalNumber = value;
    }

    /**
     * Private code of the vehicle. DEPRECATED - use privateCodes. -v2.0
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getPrivateCode() {
        return privateCode;
    }

    /**
     * Legt den Wert der privateCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setPrivateCode(PrivateCodeStructure value) {
        this.privateCode = value;
    }

    /**
     * Ruft den Wert der transportOrganisationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TransportOrganisationRefStructure> getTransportOrganisationRef() {
        return transportOrganisationRef;
    }

    /**
     * Legt den Wert der transportOrganisationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     
     */
    public void setTransportOrganisationRef(JAXBElement<? extends TransportOrganisationRefStructure> value) {
        this.transportOrganisationRef = value;
    }

    /**
     * Ruft den Wert der contactRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContactRefStructure }
     *     
     */
    public ContactRefStructure getContactRef() {
        return contactRef;
    }

    /**
     * Legt den Wert der contactRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactRefStructure }
     *     
     */
    public void setContactRef(ContactRefStructure value) {
        this.contactRef = value;
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
     * Ruft den Wert der vehicleModelRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleModelRefStructure }
     *     
     */
    public VehicleModelRefStructure getVehicleModelRef() {
        return vehicleModelRef;
    }

    /**
     * Legt den Wert der vehicleModelRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleModelRefStructure }
     *     
     */
    public void setVehicleModelRef(VehicleModelRefStructure value) {
        this.vehicleModelRef = value;
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
     * Ruft den Wert der actualVehicleEquipments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentsRelStructure }
     *     
     */
    public EquipmentsRelStructure getActualVehicleEquipments() {
        return actualVehicleEquipments;
    }

    /**
     * Legt den Wert der actualVehicleEquipments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentsRelStructure }
     *     
     */
    public void setActualVehicleEquipments(EquipmentsRelStructure value) {
        this.actualVehicleEquipments = value;
    }

    /**
     * Ruft den Wert der monitored-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonitored() {
        return monitored;
    }

    /**
     * Legt den Wert der monitored-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonitored(Boolean value) {
        this.monitored = value;
    }

}
