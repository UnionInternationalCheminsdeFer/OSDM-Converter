//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for a SANITARY FACILITY EQUIPMENT.
 * 
 * <p>Java-Klasse f�r SanitaryEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SanitaryEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PassengerEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SanitaryEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SanitaryEquipment_VersionStructure", propOrder = {
    "accessibilityAssessment",
    "gender",
    "sanitaryFacilityList",
    "numberOfToilets",
    "freeToUse",
    "charge",
    "currency",
    "paymentMethods",
    "changeAvailable",
    "wheelchairTurningCircle",
    "supportBarHeight",
    "callButtonAvailable",
    "sharpsDisposal",
    "staffing",
    "lockedAccess",
    "keyScheme",
    "handWashing",
    "drinkingWater",
    "toiletsType"
})
@XmlSeeAlso({
    SanitaryEquipment.class
})
public class SanitaryEquipmentVersionStructure
    extends PassengerEquipmentVersionStructure
{

    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessment accessibilityAssessment;
    @XmlElement(name = "Gender")
    @XmlSchemaType(name = "normalizedString")
    protected GenderLimitationEnumeration gender;
    @XmlList
    @XmlElement(name = "SanitaryFacilityList")
    protected List<SanitaryFacilityEnumeration> sanitaryFacilityList;
    @XmlElement(name = "NumberOfToilets")
    protected BigInteger numberOfToilets;
    @XmlElement(name = "FreeToUse")
    protected Boolean freeToUse;
    @XmlElement(name = "Charge")
    protected BigDecimal charge;
    @XmlElement(name = "Currency")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String currency;
    @XmlList
    @XmlElement(name = "PaymentMethods")
    protected List<PaymentMethodEnumeration> paymentMethods;
    @XmlElement(name = "ChangeAvailable")
    protected Boolean changeAvailable;
    @XmlElement(name = "WheelchairTurningCircle")
    protected BigDecimal wheelchairTurningCircle;
    @XmlElement(name = "SupportBarHeight")
    protected BigDecimal supportBarHeight;
    @XmlElement(name = "CallButtonAvailable")
    protected Boolean callButtonAvailable;
    @XmlElement(name = "SharpsDisposal")
    protected Boolean sharpsDisposal;
    @XmlElement(name = "Staffing")
    @XmlSchemaType(name = "normalizedString")
    protected StaffingEnumeration staffing;
    @XmlElement(name = "LockedAccess")
    protected Boolean lockedAccess;
    @XmlElement(name = "KeyScheme")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String keyScheme;
    @XmlElement(name = "HandWashing", defaultValue = "true")
    protected Boolean handWashing;
    @XmlElement(name = "DrinkingWater", defaultValue = "true")
    protected Boolean drinkingWater;
    @XmlElement(name = "ToiletsType")
    @XmlSchemaType(name = "NMTOKEN")
    protected ToiletsTypeEnumeration toiletsType;

    /**
     * Ruft den Wert der accessibilityAssessment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityAssessment }
     *     
     */
    public AccessibilityAssessment getAccessibilityAssessment() {
        return accessibilityAssessment;
    }

    /**
     * Legt den Wert der accessibilityAssessment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityAssessment }
     *     
     */
    public void setAccessibilityAssessment(AccessibilityAssessment value) {
        this.accessibilityAssessment = value;
    }

    /**
     * Ruft den Wert der gender-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GenderLimitationEnumeration }
     *     
     */
    public GenderLimitationEnumeration getGender() {
        return gender;
    }

    /**
     * Legt den Wert der gender-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderLimitationEnumeration }
     *     
     */
    public void setGender(GenderLimitationEnumeration value) {
        this.gender = value;
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
     * Ruft den Wert der numberOfToilets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfToilets() {
        return numberOfToilets;
    }

    /**
     * Legt den Wert der numberOfToilets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfToilets(BigInteger value) {
        this.numberOfToilets = value;
    }

    /**
     * Ruft den Wert der freeToUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFreeToUse() {
        return freeToUse;
    }

    /**
     * Legt den Wert der freeToUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFreeToUse(Boolean value) {
        this.freeToUse = value;
    }

    /**
     * Ruft den Wert der charge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCharge() {
        return charge;
    }

    /**
     * Legt den Wert der charge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCharge(BigDecimal value) {
        this.charge = value;
    }

    /**
     * Ruft den Wert der currency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Legt den Wert der currency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the paymentMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMethodEnumeration }
     * 
     * 
     */
    public List<PaymentMethodEnumeration> getPaymentMethods() {
        if (paymentMethods == null) {
            paymentMethods = new ArrayList<PaymentMethodEnumeration>();
        }
        return this.paymentMethods;
    }

    /**
     * Ruft den Wert der changeAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeAvailable() {
        return changeAvailable;
    }

    /**
     * Legt den Wert der changeAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeAvailable(Boolean value) {
        this.changeAvailable = value;
    }

    /**
     * Ruft den Wert der wheelchairTurningCircle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWheelchairTurningCircle() {
        return wheelchairTurningCircle;
    }

    /**
     * Legt den Wert der wheelchairTurningCircle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWheelchairTurningCircle(BigDecimal value) {
        this.wheelchairTurningCircle = value;
    }

    /**
     * Ruft den Wert der supportBarHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSupportBarHeight() {
        return supportBarHeight;
    }

    /**
     * Legt den Wert der supportBarHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSupportBarHeight(BigDecimal value) {
        this.supportBarHeight = value;
    }

    /**
     * Ruft den Wert der callButtonAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCallButtonAvailable() {
        return callButtonAvailable;
    }

    /**
     * Legt den Wert der callButtonAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCallButtonAvailable(Boolean value) {
        this.callButtonAvailable = value;
    }

    /**
     * Ruft den Wert der sharpsDisposal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSharpsDisposal() {
        return sharpsDisposal;
    }

    /**
     * Legt den Wert der sharpsDisposal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSharpsDisposal(Boolean value) {
        this.sharpsDisposal = value;
    }

    /**
     * Ruft den Wert der staffing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StaffingEnumeration }
     *     
     */
    public StaffingEnumeration getStaffing() {
        return staffing;
    }

    /**
     * Legt den Wert der staffing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffingEnumeration }
     *     
     */
    public void setStaffing(StaffingEnumeration value) {
        this.staffing = value;
    }

    /**
     * Ruft den Wert der lockedAccess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockedAccess() {
        return lockedAccess;
    }

    /**
     * Legt den Wert der lockedAccess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockedAccess(Boolean value) {
        this.lockedAccess = value;
    }

    /**
     * Ruft den Wert der keyScheme-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyScheme() {
        return keyScheme;
    }

    /**
     * Legt den Wert der keyScheme-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyScheme(String value) {
        this.keyScheme = value;
    }

    /**
     * Ruft den Wert der handWashing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHandWashing() {
        return handWashing;
    }

    /**
     * Legt den Wert der handWashing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHandWashing(Boolean value) {
        this.handWashing = value;
    }

    /**
     * Ruft den Wert der drinkingWater-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDrinkingWater() {
        return drinkingWater;
    }

    /**
     * Legt den Wert der drinkingWater-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDrinkingWater(Boolean value) {
        this.drinkingWater = value;
    }

    /**
     * Ruft den Wert der toiletsType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ToiletsTypeEnumeration }
     *     
     */
    public ToiletsTypeEnumeration getToiletsType() {
        return toiletsType;
    }

    /**
     * Legt den Wert der toiletsType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ToiletsTypeEnumeration }
     *     
     */
    public void setToiletsType(ToiletsTypeEnumeration value) {
        this.toiletsType = value;
    }

}
