//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a FACILITY.
 * 
 * <p>Java-Klasse f�r FacilitySet_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FacilitySet_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}FacilitySetGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilitySet_VersionStructure", propOrder = {
    "providedByRef",
    "description",
    "typeOfFacilityRef",
    "otherFacilities",
    "accessibilityInfoFacilityList",
    "assistanceFacilityList",
    "accessibilityToolList",
    "carServiceFacilityList",
    "cateringFacilityList",
    "climateControlList",
    "familyFacilityList",
    "fareClasses",
    "genderLimitation",
    "lightingControlFacilityList",
    "mealFacilityList",
    "medicalFacilityList",
    "mobilityFacilityList",
    "nuisanceFacilityList",
    "passengerCommsFacilityList",
    "passengerInformationEquipmentList",
    "passengerInformationFacilityList",
    "retailFacilityList",
    "safetyFacilityList",
    "sanitaryFacilityList",
    "ticketingFacilityList",
    "ticketingServiceFacilityList"
})
@XmlSeeAlso({
    SiteFacilitySetStructure.class,
    ServiceFacilitySetVersionStructure.class
})
public class FacilitySetVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "ProvidedByRef")
    protected OrganisationRefStructure providedByRef;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "TypeOfFacilityRef")
    protected TypeOfFacilityRefStructure typeOfFacilityRef;
    protected TypesOfEquipmentRelStructure otherFacilities;
    @XmlList
    @XmlElement(name = "AccessibilityInfoFacilityList")
    protected List<AccessibilityInfoFacilityEnumeration> accessibilityInfoFacilityList;
    @XmlList
    @XmlElement(name = "AssistanceFacilityList")
    protected List<AssistanceFacilityEnumeration> assistanceFacilityList;
    @XmlList
    @XmlElement(name = "AccessibilityToolList")
    protected List<AccessibilityToolEnumeration> accessibilityToolList;
    @XmlList
    @XmlElement(name = "CarServiceFacilityList")
    protected List<CarServiceFacilityEnumeration> carServiceFacilityList;
    @XmlList
    @XmlElement(name = "CateringFacilityList")
    protected List<CateringFacilityEnumeration> cateringFacilityList;
    @XmlList
    @XmlElement(name = "ClimateControlList")
    protected List<ClimateControlEnumeration> climateControlList;
    @XmlList
    @XmlElement(name = "FamilyFacilityList")
    protected List<FamilyFacilityEnumeration> familyFacilityList;
    @XmlList
    @XmlElement(name = "FareClasses")
    protected List<FareClassEnumeration> fareClasses;
    @XmlElement(name = "GenderLimitation")
    @XmlSchemaType(name = "normalizedString")
    protected GenderLimitationEnumeration genderLimitation;
    @XmlList
    @XmlElement(name = "LightingControlFacilityList")
    protected List<LightingControlFacilityEnumeration> lightingControlFacilityList;
    @XmlList
    @XmlElement(name = "MealFacilityList")
    protected List<MealFacilityEnumeration> mealFacilityList;
    @XmlList
    @XmlElement(name = "MedicalFacilityList")
    protected List<MedicalFacilityEnumeration> medicalFacilityList;
    @XmlList
    @XmlElement(name = "MobilityFacilityList")
    protected List<MobilityFacilityEnumeration> mobilityFacilityList;
    @XmlList
    @XmlElement(name = "NuisanceFacilityList")
    protected List<NuisanceFacilityEnumeration> nuisanceFacilityList;
    @XmlList
    @XmlElement(name = "PassengerCommsFacilityList")
    protected List<PassengerCommsFacilityEnumeration> passengerCommsFacilityList;
    @XmlList
    @XmlElement(name = "PassengerInformationEquipmentList")
    protected List<PassengerInformationEquipmentEnumeration> passengerInformationEquipmentList;
    @XmlList
    @XmlElement(name = "PassengerInformationFacilityList")
    protected List<PassengerInformationFacilityEnumeration> passengerInformationFacilityList;
    @XmlList
    @XmlElement(name = "RetailFacilityList")
    protected List<RetailFacilityEnumeration> retailFacilityList;
    @XmlList
    @XmlElement(name = "SafetyFacilityList")
    protected List<SafetyFacilityEnumeration> safetyFacilityList;
    @XmlList
    @XmlElement(name = "SanitaryFacilityList")
    protected List<SanitaryFacilityEnumeration> sanitaryFacilityList;
    @XmlList
    @XmlElement(name = "TicketingFacilityList")
    protected List<TicketingFacilityEnumeration> ticketingFacilityList;
    @XmlList
    @XmlElement(name = "TicketingServiceFacilityList")
    protected List<TicketingServiceFacilityEnumeration> ticketingServiceFacilityList;

    /**
     * Ruft den Wert der providedByRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationRefStructure }
     *     
     */
    public OrganisationRefStructure getProvidedByRef() {
        return providedByRef;
    }

    /**
     * Legt den Wert der providedByRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationRefStructure }
     *     
     */
    public void setProvidedByRef(OrganisationRefStructure value) {
        this.providedByRef = value;
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
     * Ruft den Wert der typeOfFacilityRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfFacilityRefStructure }
     *     
     */
    public TypeOfFacilityRefStructure getTypeOfFacilityRef() {
        return typeOfFacilityRef;
    }

    /**
     * Legt den Wert der typeOfFacilityRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfFacilityRefStructure }
     *     
     */
    public void setTypeOfFacilityRef(TypeOfFacilityRefStructure value) {
        this.typeOfFacilityRef = value;
    }

    /**
     * Ruft den Wert der otherFacilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypesOfEquipmentRelStructure }
     *     
     */
    public TypesOfEquipmentRelStructure getOtherFacilities() {
        return otherFacilities;
    }

    /**
     * Legt den Wert der otherFacilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypesOfEquipmentRelStructure }
     *     
     */
    public void setOtherFacilities(TypesOfEquipmentRelStructure value) {
        this.otherFacilities = value;
    }

    /**
     * List of ACCESSIBILITY INFORMATION FACILITies.Gets the value of the accessibilityInfoFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessibilityInfoFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessibilityInfoFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessibilityInfoFacilityEnumeration }
     * 
     * 
     */
    public List<AccessibilityInfoFacilityEnumeration> getAccessibilityInfoFacilityList() {
        if (accessibilityInfoFacilityList == null) {
            accessibilityInfoFacilityList = new ArrayList<AccessibilityInfoFacilityEnumeration>();
        }
        return this.accessibilityInfoFacilityList;
    }

    /**
     * List of ASSISTANCE FACILITies.Gets the value of the assistanceFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assistanceFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssistanceFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssistanceFacilityEnumeration }
     * 
     * 
     */
    public List<AssistanceFacilityEnumeration> getAssistanceFacilityList() {
        if (assistanceFacilityList == null) {
            assistanceFacilityList = new ArrayList<AssistanceFacilityEnumeration>();
        }
        return this.assistanceFacilityList;
    }

    /**
     * List of TYPEs of ACCESSIBILITY TOOLs.Gets the value of the accessibilityToolList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessibilityToolList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessibilityToolList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessibilityToolEnumeration }
     * 
     * 
     */
    public List<AccessibilityToolEnumeration> getAccessibilityToolList() {
        if (accessibilityToolList == null) {
            accessibilityToolList = new ArrayList<AccessibilityToolEnumeration>();
        }
        return this.accessibilityToolList;
    }

    /**
     * Gets the value of the carServiceFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carServiceFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarServiceFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarServiceFacilityEnumeration }
     * 
     * 
     */
    public List<CarServiceFacilityEnumeration> getCarServiceFacilityList() {
        if (carServiceFacilityList == null) {
            carServiceFacilityList = new ArrayList<CarServiceFacilityEnumeration>();
        }
        return this.carServiceFacilityList;
    }

    /**
     * Gets the value of the cateringFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cateringFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCateringFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CateringFacilityEnumeration }
     * 
     * 
     */
    public List<CateringFacilityEnumeration> getCateringFacilityList() {
        if (cateringFacilityList == null) {
            cateringFacilityList = new ArrayList<CateringFacilityEnumeration>();
        }
        return this.cateringFacilityList;
    }

    /**
     * +v2.0 Gets the value of the climateControlList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the climateControlList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClimateControlList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClimateControlEnumeration }
     * 
     * 
     */
    public List<ClimateControlEnumeration> getClimateControlList() {
        if (climateControlList == null) {
            climateControlList = new ArrayList<ClimateControlEnumeration>();
        }
        return this.climateControlList;
    }

    /**
     * Gets the value of the familyFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the familyFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilyFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FamilyFacilityEnumeration }
     * 
     * 
     */
    public List<FamilyFacilityEnumeration> getFamilyFacilityList() {
        if (familyFacilityList == null) {
            familyFacilityList = new ArrayList<FamilyFacilityEnumeration>();
        }
        return this.familyFacilityList;
    }

    /**
     * List of Fare Classes.Gets the value of the fareClasses property.
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
     * Ruft den Wert der genderLimitation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GenderLimitationEnumeration }
     *     
     */
    public GenderLimitationEnumeration getGenderLimitation() {
        return genderLimitation;
    }

    /**
     * Legt den Wert der genderLimitation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderLimitationEnumeration }
     *     
     */
    public void setGenderLimitation(GenderLimitationEnumeration value) {
        this.genderLimitation = value;
    }

    /**
     * +v2.0 Gets the value of the lightingControlFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lightingControlFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLightingControlFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LightingControlFacilityEnumeration }
     * 
     * 
     */
    public List<LightingControlFacilityEnumeration> getLightingControlFacilityList() {
        if (lightingControlFacilityList == null) {
            lightingControlFacilityList = new ArrayList<LightingControlFacilityEnumeration>();
        }
        return this.lightingControlFacilityList;
    }

    /**
     * Gets the value of the mealFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mealFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMealFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MealFacilityEnumeration }
     * 
     * 
     */
    public List<MealFacilityEnumeration> getMealFacilityList() {
        if (mealFacilityList == null) {
            mealFacilityList = new ArrayList<MealFacilityEnumeration>();
        }
        return this.mealFacilityList;
    }

    /**
     * Gets the value of the medicalFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medicalFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedicalFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicalFacilityEnumeration }
     * 
     * 
     */
    public List<MedicalFacilityEnumeration> getMedicalFacilityList() {
        if (medicalFacilityList == null) {
            medicalFacilityList = new ArrayList<MedicalFacilityEnumeration>();
        }
        return this.medicalFacilityList;
    }

    /**
     * Gets the value of the mobilityFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobilityFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobilityFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MobilityFacilityEnumeration }
     * 
     * 
     */
    public List<MobilityFacilityEnumeration> getMobilityFacilityList() {
        if (mobilityFacilityList == null) {
            mobilityFacilityList = new ArrayList<MobilityFacilityEnumeration>();
        }
        return this.mobilityFacilityList;
    }

    /**
     * Gets the value of the nuisanceFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nuisanceFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNuisanceFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NuisanceFacilityEnumeration }
     * 
     * 
     */
    public List<NuisanceFacilityEnumeration> getNuisanceFacilityList() {
        if (nuisanceFacilityList == null) {
            nuisanceFacilityList = new ArrayList<NuisanceFacilityEnumeration>();
        }
        return this.nuisanceFacilityList;
    }

    /**
     * Gets the value of the passengerCommsFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerCommsFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerCommsFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerCommsFacilityEnumeration }
     * 
     * 
     */
    public List<PassengerCommsFacilityEnumeration> getPassengerCommsFacilityList() {
        if (passengerCommsFacilityList == null) {
            passengerCommsFacilityList = new ArrayList<PassengerCommsFacilityEnumeration>();
        }
        return this.passengerCommsFacilityList;
    }

    /**
     * Gets the value of the passengerInformationEquipmentList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerInformationEquipmentList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerInformationEquipmentList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerInformationEquipmentEnumeration }
     * 
     * 
     */
    public List<PassengerInformationEquipmentEnumeration> getPassengerInformationEquipmentList() {
        if (passengerInformationEquipmentList == null) {
            passengerInformationEquipmentList = new ArrayList<PassengerInformationEquipmentEnumeration>();
        }
        return this.passengerInformationEquipmentList;
    }

    /**
     * List of PASSENGER INFORMATION FACILITies.Gets the value of the passengerInformationFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerInformationFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerInformationFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerInformationFacilityEnumeration }
     * 
     * 
     */
    public List<PassengerInformationFacilityEnumeration> getPassengerInformationFacilityList() {
        if (passengerInformationFacilityList == null) {
            passengerInformationFacilityList = new ArrayList<PassengerInformationFacilityEnumeration>();
        }
        return this.passengerInformationFacilityList;
    }

    /**
     * Gets the value of the retailFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retailFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetailFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailFacilityEnumeration }
     * 
     * 
     */
    public List<RetailFacilityEnumeration> getRetailFacilityList() {
        if (retailFacilityList == null) {
            retailFacilityList = new ArrayList<RetailFacilityEnumeration>();
        }
        return this.retailFacilityList;
    }

    /**
     * Gets the value of the safetyFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the safetyFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSafetyFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SafetyFacilityEnumeration }
     * 
     * 
     */
    public List<SafetyFacilityEnumeration> getSafetyFacilityList() {
        if (safetyFacilityList == null) {
            safetyFacilityList = new ArrayList<SafetyFacilityEnumeration>();
        }
        return this.safetyFacilityList;
    }

    /**
     * Gets the value of the sanitaryFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sanitaryFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSanitaryFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SanitaryFacilityEnumeration }
     * 
     * 
     */
    public List<SanitaryFacilityEnumeration> getSanitaryFacilityList() {
        if (sanitaryFacilityList == null) {
            sanitaryFacilityList = new ArrayList<SanitaryFacilityEnumeration>();
        }
        return this.sanitaryFacilityList;
    }

    /**
     * Gets the value of the ticketingFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketingFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketingFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingFacilityEnumeration }
     * 
     * 
     */
    public List<TicketingFacilityEnumeration> getTicketingFacilityList() {
        if (ticketingFacilityList == null) {
            ticketingFacilityList = new ArrayList<TicketingFacilityEnumeration>();
        }
        return this.ticketingFacilityList;
    }

    /**
     * Gets the value of the ticketingServiceFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketingServiceFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketingServiceFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingServiceFacilityEnumeration }
     * 
     * 
     */
    public List<TicketingServiceFacilityEnumeration> getTicketingServiceFacilityList() {
        if (ticketingServiceFacilityList == null) {
            ticketingServiceFacilityList = new ArrayList<TicketingServiceFacilityEnumeration>();
        }
        return this.ticketingServiceFacilityList;
    }

}
