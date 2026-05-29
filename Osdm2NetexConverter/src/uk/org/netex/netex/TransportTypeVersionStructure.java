//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for a TRANSPORT TYPE.
 * 
 * <p>Java-Klasse f�r TransportType_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TransportType_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TransportTypeGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportType_VersionStructure", propOrder = {
    "name",
    "shortName",
    "description",
    "privateCode",
    "euroClass",
    "reversingDirection",
    "selfPropelled",
    "propulsionTypes",
    "propulsionType",
    "fuelTypes",
    "fuelType",
    "typeOfFuel",
    "maximumRange",
    "maximumVelocity",
    "transportMode",
    "passengerCapacity",
    "deckPlanRef"
})
@XmlSeeAlso({
    TransportType.class,
    SimpleVehicleTypeVersionStructure.class,
    VehicleTypeVersionStructure.class
})
public class TransportTypeVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "ShortName")
    protected MultilingualString shortName;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElement(name = "EuroClass")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String euroClass;
    @XmlElement(name = "ReversingDirection", defaultValue = "true")
    protected Boolean reversingDirection;
    @XmlElement(name = "SelfPropelled", defaultValue = "true")
    protected Boolean selfPropelled;
    @XmlList
    @XmlElement(name = "PropulsionTypes")
    protected List<PropulsionTypeEnumeration> propulsionTypes;
    @XmlElement(name = "PropulsionType")
    @XmlSchemaType(name = "normalizedString")
    protected PropulsionTypeEnumeration propulsionType;
    @XmlList
    @XmlElement(name = "FuelTypes")
    protected List<FuelTypeEnumeration> fuelTypes;
    @XmlElement(name = "FuelType")
    @XmlSchemaType(name = "normalizedString")
    protected FuelTypeEnumeration fuelType;
    @XmlElement(name = "TypeOfFuel")
    @XmlSchemaType(name = "normalizedString")
    protected FuelTypeEnumeration typeOfFuel;
    @XmlElement(name = "MaximumRange")
    protected BigDecimal maximumRange;
    @XmlElement(name = "MaximumVelocity")
    protected BigDecimal maximumVelocity;
    @XmlElement(name = "TransportMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected AllPublicTransportModesEnumeration transportMode;
    @XmlElement(name = "PassengerCapacity")
    protected PassengerCapacityStructure passengerCapacity;
    @XmlElement(name = "DeckPlanRef")
    protected DeckPlanRefStructure deckPlanRef;

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
     * DEPRECATED - use privateCodes. -v2.0
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
     * Ruft den Wert der euroClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuroClass() {
        return euroClass;
    }

    /**
     * Legt den Wert der euroClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuroClass(String value) {
        this.euroClass = value;
    }

    /**
     * Ruft den Wert der reversingDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReversingDirection() {
        return reversingDirection;
    }

    /**
     * Legt den Wert der reversingDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReversingDirection(Boolean value) {
        this.reversingDirection = value;
    }

    /**
     * Ruft den Wert der selfPropelled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelfPropelled() {
        return selfPropelled;
    }

    /**
     * Legt den Wert der selfPropelled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelfPropelled(Boolean value) {
        this.selfPropelled = value;
    }

    /**
     * Gets the value of the propulsionTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propulsionTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropulsionTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropulsionTypeEnumeration }
     * 
     * 
     */
    public List<PropulsionTypeEnumeration> getPropulsionTypes() {
        if (propulsionTypes == null) {
            propulsionTypes = new ArrayList<PropulsionTypeEnumeration>();
        }
        return this.propulsionTypes;
    }

    /**
     * Ruft den Wert der propulsionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PropulsionTypeEnumeration }
     *     
     */
    public PropulsionTypeEnumeration getPropulsionType() {
        return propulsionType;
    }

    /**
     * Legt den Wert der propulsionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PropulsionTypeEnumeration }
     *     
     */
    public void setPropulsionType(PropulsionTypeEnumeration value) {
        this.propulsionType = value;
    }

    /**
     * Gets the value of the fuelTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fuelTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFuelTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FuelTypeEnumeration }
     * 
     * 
     */
    public List<FuelTypeEnumeration> getFuelTypes() {
        if (fuelTypes == null) {
            fuelTypes = new ArrayList<FuelTypeEnumeration>();
        }
        return this.fuelTypes;
    }

    /**
     * Ruft den Wert der fuelType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FuelTypeEnumeration }
     *     
     */
    public FuelTypeEnumeration getFuelType() {
        return fuelType;
    }

    /**
     * Legt den Wert der fuelType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FuelTypeEnumeration }
     *     
     */
    public void setFuelType(FuelTypeEnumeration value) {
        this.fuelType = value;
    }

    /**
     * Ruft den Wert der typeOfFuel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FuelTypeEnumeration }
     *     
     */
    public FuelTypeEnumeration getTypeOfFuel() {
        return typeOfFuel;
    }

    /**
     * Legt den Wert der typeOfFuel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FuelTypeEnumeration }
     *     
     */
    public void setTypeOfFuel(FuelTypeEnumeration value) {
        this.typeOfFuel = value;
    }

    /**
     * Ruft den Wert der maximumRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumRange() {
        return maximumRange;
    }

    /**
     * Legt den Wert der maximumRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumRange(BigDecimal value) {
        this.maximumRange = value;
    }

    /**
     * Ruft den Wert der maximumVelocity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumVelocity() {
        return maximumVelocity;
    }

    /**
     * Legt den Wert der maximumVelocity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumVelocity(BigDecimal value) {
        this.maximumVelocity = value;
    }

    /**
     * Ruft den Wert der transportMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public AllPublicTransportModesEnumeration getTransportMode() {
        return transportMode;
    }

    /**
     * Legt den Wert der transportMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public void setTransportMode(AllPublicTransportModesEnumeration value) {
        this.transportMode = value;
    }

    /**
     * Ruft den Wert der passengerCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PassengerCapacityStructure }
     *     
     */
    public PassengerCapacityStructure getPassengerCapacity() {
        return passengerCapacity;
    }

    /**
     * Legt den Wert der passengerCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerCapacityStructure }
     *     
     */
    public void setPassengerCapacity(PassengerCapacityStructure value) {
        this.passengerCapacity = value;
    }

    /**
     * Ruft den Wert der deckPlanRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckPlanRefStructure }
     *     
     */
    public DeckPlanRefStructure getDeckPlanRef() {
        return deckPlanRef;
    }

    /**
     * Legt den Wert der deckPlanRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckPlanRefStructure }
     *     
     */
    public void setDeckPlanRef(DeckPlanRefStructure value) {
        this.deckPlanRef = value;
    }

}
