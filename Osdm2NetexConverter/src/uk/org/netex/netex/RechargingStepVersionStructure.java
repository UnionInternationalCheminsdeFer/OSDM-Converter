//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
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
import javax.xml.datatype.Duration;


/**
 * Type for RECHARGING STEP.
 * 
 * <p>Java-Klasse f�r RechargingStep_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RechargingStep_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}RechargingStepGroup"/>
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RechargingStep_VersionStructure", propOrder = {
    "name",
    "description",
    "chargeEnergy",
    "targetEnergy",
    "preparationDuration",
    "chargingDuration",
    "finalisationDuration",
    "journeyRef",
    "pointInJourneyPatternRef",
    "vehicleChargingEquipmentRef",
    "rechargingEquipmentProfileRef",
    "vehicleTypes",
    "vehicles"
})
@XmlSeeAlso({
    RechargingStep.class
})
public class RechargingStepVersionStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "ChargeEnergy")
    protected BigDecimal chargeEnergy;
    @XmlElement(name = "TargetEnergy")
    protected BigDecimal targetEnergy;
    @XmlElement(name = "PreparationDuration")
    protected Duration preparationDuration;
    @XmlElement(name = "ChargingDuration")
    protected Duration chargingDuration;
    @XmlElement(name = "FinalisationDuration")
    protected Duration finalisationDuration;
    @XmlElementRef(name = "JourneyRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends JourneyRefStructure> journeyRef;
    @XmlElementRef(name = "PointInJourneyPatternRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends PointInJourneyPatternRefStructure> pointInJourneyPatternRef;
    @XmlElement(name = "VehicleChargingEquipmentRef")
    protected VehicleChargingEquipmentRefStructure vehicleChargingEquipmentRef;
    @XmlElement(name = "RechargingEquipmentProfileRef")
    protected RechargingEquipmentProfileRefStructure rechargingEquipmentProfileRef;
    protected VehicleTypeRefsRelStructure vehicleTypes;
    protected VehicleRefsRelStructure vehicles;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger order;

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
     * Ruft den Wert der chargeEnergy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargeEnergy() {
        return chargeEnergy;
    }

    /**
     * Legt den Wert der chargeEnergy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargeEnergy(BigDecimal value) {
        this.chargeEnergy = value;
    }

    /**
     * Ruft den Wert der targetEnergy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTargetEnergy() {
        return targetEnergy;
    }

    /**
     * Legt den Wert der targetEnergy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTargetEnergy(BigDecimal value) {
        this.targetEnergy = value;
    }

    /**
     * Ruft den Wert der preparationDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPreparationDuration() {
        return preparationDuration;
    }

    /**
     * Legt den Wert der preparationDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPreparationDuration(Duration value) {
        this.preparationDuration = value;
    }

    /**
     * Ruft den Wert der chargingDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getChargingDuration() {
        return chargingDuration;
    }

    /**
     * Legt den Wert der chargingDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setChargingDuration(Duration value) {
        this.chargingDuration = value;
    }

    /**
     * Ruft den Wert der finalisationDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getFinalisationDuration() {
        return finalisationDuration;
    }

    /**
     * Legt den Wert der finalisationDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setFinalisationDuration(Duration value) {
        this.finalisationDuration = value;
    }

    /**
     * Ruft den Wert der journeyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatedSpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SingleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends JourneyRefStructure> getJourneyRef() {
        return journeyRef;
    }

    /**
     * Legt den Wert der journeyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatedSpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SingleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     
     */
    public void setJourneyRef(JAXBElement<? extends JourneyRefStructure> value) {
        this.journeyRef = value;
    }

    /**
     * Ruft den Wert der pointInJourneyPatternRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopPointInJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingPointInJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointInJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FarePointInPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointInSingleJourneyPathRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends PointInJourneyPatternRefStructure> getPointInJourneyPatternRef() {
        return pointInJourneyPatternRef;
    }

    /**
     * Legt den Wert der pointInJourneyPatternRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopPointInJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingPointInJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointInJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FarePointInPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointInSingleJourneyPathRefStructure }{@code >}
     *     
     */
    public void setPointInJourneyPatternRef(JAXBElement<? extends PointInJourneyPatternRefStructure> value) {
        this.pointInJourneyPatternRef = value;
    }

    /**
     * Equipment used for charging
     * 
     * @return
     *     possible object is
     *     {@link VehicleChargingEquipmentRefStructure }
     *     
     */
    public VehicleChargingEquipmentRefStructure getVehicleChargingEquipmentRef() {
        return vehicleChargingEquipmentRef;
    }

    /**
     * Legt den Wert der vehicleChargingEquipmentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleChargingEquipmentRefStructure }
     *     
     */
    public void setVehicleChargingEquipmentRef(VehicleChargingEquipmentRefStructure value) {
        this.vehicleChargingEquipmentRef = value;
    }

    /**
     * Profile used for charging
     * 
     * @return
     *     possible object is
     *     {@link RechargingEquipmentProfileRefStructure }
     *     
     */
    public RechargingEquipmentProfileRefStructure getRechargingEquipmentProfileRef() {
        return rechargingEquipmentProfileRef;
    }

    /**
     * Legt den Wert der rechargingEquipmentProfileRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RechargingEquipmentProfileRefStructure }
     *     
     */
    public void setRechargingEquipmentProfileRef(RechargingEquipmentProfileRefStructure value) {
        this.rechargingEquipmentProfileRef = value;
    }

    /**
     * Ruft den Wert der vehicleTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTypeRefsRelStructure }
     *     
     */
    public VehicleTypeRefsRelStructure getVehicleTypes() {
        return vehicleTypes;
    }

    /**
     * Legt den Wert der vehicleTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTypeRefsRelStructure }
     *     
     */
    public void setVehicleTypes(VehicleTypeRefsRelStructure value) {
        this.vehicleTypes = value;
    }

    /**
     * Ruft den Wert der vehicles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRefsRelStructure }
     *     
     */
    public VehicleRefsRelStructure getVehicles() {
        return vehicles;
    }

    /**
     * Legt den Wert der vehicles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRefsRelStructure }
     *     
     */
    public void setVehicles(VehicleRefsRelStructure value) {
        this.vehicles = value;
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
