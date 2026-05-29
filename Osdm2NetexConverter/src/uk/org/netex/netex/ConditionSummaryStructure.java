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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for condition summary.
 * 
 * <p>Java-Klasse f�r ConditionSummaryStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConditionSummaryStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareStructureType" type="{http://www.netex.org.uk/netex}FareStructureTypeEnumeration" minOccurs="0"/>
 *         &lt;element name="TariffBasis" type="{http://www.netex.org.uk/netex}TariffBasisEnumeration" minOccurs="0"/>
 *         &lt;element name="HasNotices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ConditionSummaryCardGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ConditionSummaryEntitlementGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ConditionSummaryTravelGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ConditionSummaryCommercialGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ConditionSummaryReservationGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ConditionSummaryChargingGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ConditionSummaryRentalGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionSummaryStructure", propOrder = {
    "fareStructureType",
    "tariffBasis",
    "hasNotices",
    "providesCard",
    "goesOnCard",
    "isPersonal",
    "requiresPhoto",
    "mustCarry",
    "requiresAccount",
    "isSupplement",
    "requiresEntitlement",
    "givesEntitlement",
    "hasOperatorRestrictions",
    "hasTravelTimeRestrictions",
    "hasRouteRestrictions",
    "trainRestrictions",
    "hasZoneRestrictions",
    "canBreakJourney",
    "returnTripsOnly",
    "nightTrain",
    "canChangeClass",
    "isRefundable",
    "isExchangable",
    "hasExchangeFee",
    "hasDiscountedFares",
    "allowAdditionalDiscounts",
    "allowCompanionDiscounts",
    "hasMinimumPrice",
    "requiresPositiveBalance",
    "requiresDeposit",
    "noCashPayment",
    "hasPurchaseConditions",
    "hasDynamicPricing",
    "requiresReservation",
    "hasReservationFee",
    "hasQuota",
    "penaltyIfWithoutTicket",
    "availableOnSubscription",
    "unlimitedMileage",
    "likeForLikeRefuelling",
    "vehicleCollection"
})
public class ConditionSummaryStructure {

    @XmlElement(name = "FareStructureType")
    @XmlSchemaType(name = "normalizedString")
    protected FareStructureTypeEnumeration fareStructureType;
    @XmlElement(name = "TariffBasis")
    @XmlSchemaType(name = "normalizedString")
    protected TariffBasisEnumeration tariffBasis;
    @XmlElement(name = "HasNotices", defaultValue = "false")
    protected Boolean hasNotices;
    @XmlElement(name = "ProvidesCard", defaultValue = "false")
    protected Boolean providesCard;
    @XmlElement(name = "GoesOnCard", defaultValue = "false")
    protected Boolean goesOnCard;
    @XmlElement(name = "IsPersonal", defaultValue = "false")
    protected Boolean isPersonal;
    @XmlElement(name = "RequiresPhoto", defaultValue = "false")
    protected Boolean requiresPhoto;
    @XmlElement(name = "MustCarry", defaultValue = "false")
    protected Boolean mustCarry;
    @XmlElement(name = "RequiresAccount", defaultValue = "false")
    protected Boolean requiresAccount;
    @XmlElement(name = "IsSupplement", defaultValue = "false")
    protected Boolean isSupplement;
    @XmlElement(name = "RequiresEntitlement", defaultValue = "false")
    protected Boolean requiresEntitlement;
    @XmlElement(name = "GivesEntitlement", defaultValue = "false")
    protected Boolean givesEntitlement;
    @XmlElement(name = "HasOperatorRestrictions", defaultValue = "anyTrain")
    @XmlSchemaType(name = "normalizedString")
    protected OperatorRestrictionsEnumeration hasOperatorRestrictions;
    @XmlElement(name = "HasTravelTimeRestrictions", defaultValue = "false")
    protected Boolean hasTravelTimeRestrictions;
    @XmlElement(name = "HasRouteRestrictions", defaultValue = "false")
    protected Boolean hasRouteRestrictions;
    @XmlElement(name = "TrainRestrictions", defaultValue = "anyTrain")
    @XmlSchemaType(name = "normalizedString")
    protected TrainRestrictionsEnumeration trainRestrictions;
    @XmlElement(name = "HasZoneRestrictions", defaultValue = "false")
    protected Boolean hasZoneRestrictions;
    @XmlElement(name = "CanBreakJourney", defaultValue = "false")
    protected Boolean canBreakJourney;
    @XmlElement(name = "ReturnTripsOnly", defaultValue = "false")
    protected Boolean returnTripsOnly;
    @XmlElement(name = "NightTrain", defaultValue = "false")
    protected Boolean nightTrain;
    @XmlElement(name = "CanChangeClass", defaultValue = "false")
    protected Boolean canChangeClass;
    @XmlElement(name = "IsRefundable", defaultValue = "true")
    protected Boolean isRefundable;
    @XmlElement(name = "IsExchangable", defaultValue = "true")
    protected Boolean isExchangable;
    @XmlElement(name = "HasExchangeFee", defaultValue = "false")
    protected Boolean hasExchangeFee;
    @XmlElement(name = "HasDiscountedFares", defaultValue = "false")
    protected Boolean hasDiscountedFares;
    @XmlElement(name = "AllowAdditionalDiscounts", defaultValue = "false")
    protected Boolean allowAdditionalDiscounts;
    @XmlElement(name = "AllowCompanionDiscounts", defaultValue = "false")
    protected Boolean allowCompanionDiscounts;
    @XmlElement(name = "HasMinimumPrice", defaultValue = "false")
    protected Boolean hasMinimumPrice;
    @XmlElement(name = "RequiresPositiveBalance", defaultValue = "true")
    protected Boolean requiresPositiveBalance;
    @XmlElement(name = "RequiresDeposit", defaultValue = "true")
    protected Boolean requiresDeposit;
    @XmlElement(name = "NoCashPayment", defaultValue = "true")
    protected Boolean noCashPayment;
    @XmlElement(name = "HasPurchaseConditions", defaultValue = "false")
    protected Boolean hasPurchaseConditions;
    @XmlElement(name = "HasDynamicPricing", defaultValue = "false")
    protected Boolean hasDynamicPricing;
    @XmlElement(name = "RequiresReservation", defaultValue = "false")
    protected Boolean requiresReservation;
    @XmlElement(name = "HasReservationFee", defaultValue = "false")
    protected Boolean hasReservationFee;
    @XmlElement(name = "HasQuota", defaultValue = "false")
    protected Boolean hasQuota;
    @XmlElement(name = "PenaltyIfWithoutTicket", defaultValue = "false")
    protected Boolean penaltyIfWithoutTicket;
    @XmlElement(name = "AvailableOnSubscription", defaultValue = "false")
    protected Boolean availableOnSubscription;
    @XmlElement(name = "UnlimitedMileage", defaultValue = "true")
    protected Boolean unlimitedMileage;
    @XmlElement(name = "LikeForLikeRefuelling", defaultValue = "true")
    protected Boolean likeForLikeRefuelling;
    @XmlElement(name = "VehicleCollection")
    @XmlSchemaType(name = "normalizedString")
    protected VehicleCollectionEnumeration vehicleCollection;

    /**
     * Ruft den Wert der fareStructureType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareStructureTypeEnumeration }
     *     
     */
    public FareStructureTypeEnumeration getFareStructureType() {
        return fareStructureType;
    }

    /**
     * Legt den Wert der fareStructureType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareStructureTypeEnumeration }
     *     
     */
    public void setFareStructureType(FareStructureTypeEnumeration value) {
        this.fareStructureType = value;
    }

    /**
     * Ruft den Wert der tariffBasis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TariffBasisEnumeration }
     *     
     */
    public TariffBasisEnumeration getTariffBasis() {
        return tariffBasis;
    }

    /**
     * Legt den Wert der tariffBasis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffBasisEnumeration }
     *     
     */
    public void setTariffBasis(TariffBasisEnumeration value) {
        this.tariffBasis = value;
    }

    /**
     * Ruft den Wert der hasNotices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasNotices() {
        return hasNotices;
    }

    /**
     * Legt den Wert der hasNotices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasNotices(Boolean value) {
        this.hasNotices = value;
    }

    /**
     * Ruft den Wert der providesCard-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProvidesCard() {
        return providesCard;
    }

    /**
     * Legt den Wert der providesCard-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProvidesCard(Boolean value) {
        this.providesCard = value;
    }

    /**
     * Ruft den Wert der goesOnCard-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGoesOnCard() {
        return goesOnCard;
    }

    /**
     * Legt den Wert der goesOnCard-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGoesOnCard(Boolean value) {
        this.goesOnCard = value;
    }

    /**
     * Ruft den Wert der isPersonal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPersonal() {
        return isPersonal;
    }

    /**
     * Legt den Wert der isPersonal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPersonal(Boolean value) {
        this.isPersonal = value;
    }

    /**
     * Ruft den Wert der requiresPhoto-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiresPhoto() {
        return requiresPhoto;
    }

    /**
     * Legt den Wert der requiresPhoto-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiresPhoto(Boolean value) {
        this.requiresPhoto = value;
    }

    /**
     * Ruft den Wert der mustCarry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMustCarry() {
        return mustCarry;
    }

    /**
     * Legt den Wert der mustCarry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMustCarry(Boolean value) {
        this.mustCarry = value;
    }

    /**
     * Ruft den Wert der requiresAccount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiresAccount() {
        return requiresAccount;
    }

    /**
     * Legt den Wert der requiresAccount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiresAccount(Boolean value) {
        this.requiresAccount = value;
    }

    /**
     * Ruft den Wert der isSupplement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSupplement() {
        return isSupplement;
    }

    /**
     * Legt den Wert der isSupplement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSupplement(Boolean value) {
        this.isSupplement = value;
    }

    /**
     * Ruft den Wert der requiresEntitlement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiresEntitlement() {
        return requiresEntitlement;
    }

    /**
     * Legt den Wert der requiresEntitlement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiresEntitlement(Boolean value) {
        this.requiresEntitlement = value;
    }

    /**
     * Ruft den Wert der givesEntitlement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGivesEntitlement() {
        return givesEntitlement;
    }

    /**
     * Legt den Wert der givesEntitlement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGivesEntitlement(Boolean value) {
        this.givesEntitlement = value;
    }

    /**
     * Ruft den Wert der hasOperatorRestrictions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRestrictionsEnumeration }
     *     
     */
    public OperatorRestrictionsEnumeration getHasOperatorRestrictions() {
        return hasOperatorRestrictions;
    }

    /**
     * Legt den Wert der hasOperatorRestrictions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRestrictionsEnumeration }
     *     
     */
    public void setHasOperatorRestrictions(OperatorRestrictionsEnumeration value) {
        this.hasOperatorRestrictions = value;
    }

    /**
     * Ruft den Wert der hasTravelTimeRestrictions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasTravelTimeRestrictions() {
        return hasTravelTimeRestrictions;
    }

    /**
     * Legt den Wert der hasTravelTimeRestrictions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasTravelTimeRestrictions(Boolean value) {
        this.hasTravelTimeRestrictions = value;
    }

    /**
     * Ruft den Wert der hasRouteRestrictions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasRouteRestrictions() {
        return hasRouteRestrictions;
    }

    /**
     * Legt den Wert der hasRouteRestrictions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasRouteRestrictions(Boolean value) {
        this.hasRouteRestrictions = value;
    }

    /**
     * Ruft den Wert der trainRestrictions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainRestrictionsEnumeration }
     *     
     */
    public TrainRestrictionsEnumeration getTrainRestrictions() {
        return trainRestrictions;
    }

    /**
     * Legt den Wert der trainRestrictions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainRestrictionsEnumeration }
     *     
     */
    public void setTrainRestrictions(TrainRestrictionsEnumeration value) {
        this.trainRestrictions = value;
    }

    /**
     * Ruft den Wert der hasZoneRestrictions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasZoneRestrictions() {
        return hasZoneRestrictions;
    }

    /**
     * Legt den Wert der hasZoneRestrictions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasZoneRestrictions(Boolean value) {
        this.hasZoneRestrictions = value;
    }

    /**
     * Ruft den Wert der canBreakJourney-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanBreakJourney() {
        return canBreakJourney;
    }

    /**
     * Legt den Wert der canBreakJourney-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanBreakJourney(Boolean value) {
        this.canBreakJourney = value;
    }

    /**
     * Ruft den Wert der returnTripsOnly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnTripsOnly() {
        return returnTripsOnly;
    }

    /**
     * Legt den Wert der returnTripsOnly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnTripsOnly(Boolean value) {
        this.returnTripsOnly = value;
    }

    /**
     * Ruft den Wert der nightTrain-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNightTrain() {
        return nightTrain;
    }

    /**
     * Legt den Wert der nightTrain-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNightTrain(Boolean value) {
        this.nightTrain = value;
    }

    /**
     * Ruft den Wert der canChangeClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanChangeClass() {
        return canChangeClass;
    }

    /**
     * Legt den Wert der canChangeClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanChangeClass(Boolean value) {
        this.canChangeClass = value;
    }

    /**
     * Ruft den Wert der isRefundable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRefundable() {
        return isRefundable;
    }

    /**
     * Legt den Wert der isRefundable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRefundable(Boolean value) {
        this.isRefundable = value;
    }

    /**
     * Ruft den Wert der isExchangable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExchangable() {
        return isExchangable;
    }

    /**
     * Legt den Wert der isExchangable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExchangable(Boolean value) {
        this.isExchangable = value;
    }

    /**
     * Ruft den Wert der hasExchangeFee-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasExchangeFee() {
        return hasExchangeFee;
    }

    /**
     * Legt den Wert der hasExchangeFee-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasExchangeFee(Boolean value) {
        this.hasExchangeFee = value;
    }

    /**
     * Ruft den Wert der hasDiscountedFares-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasDiscountedFares() {
        return hasDiscountedFares;
    }

    /**
     * Legt den Wert der hasDiscountedFares-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasDiscountedFares(Boolean value) {
        this.hasDiscountedFares = value;
    }

    /**
     * Ruft den Wert der allowAdditionalDiscounts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowAdditionalDiscounts() {
        return allowAdditionalDiscounts;
    }

    /**
     * Legt den Wert der allowAdditionalDiscounts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowAdditionalDiscounts(Boolean value) {
        this.allowAdditionalDiscounts = value;
    }

    /**
     * Ruft den Wert der allowCompanionDiscounts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowCompanionDiscounts() {
        return allowCompanionDiscounts;
    }

    /**
     * Legt den Wert der allowCompanionDiscounts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowCompanionDiscounts(Boolean value) {
        this.allowCompanionDiscounts = value;
    }

    /**
     * Ruft den Wert der hasMinimumPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMinimumPrice() {
        return hasMinimumPrice;
    }

    /**
     * Legt den Wert der hasMinimumPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMinimumPrice(Boolean value) {
        this.hasMinimumPrice = value;
    }

    /**
     * Ruft den Wert der requiresPositiveBalance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiresPositiveBalance() {
        return requiresPositiveBalance;
    }

    /**
     * Legt den Wert der requiresPositiveBalance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiresPositiveBalance(Boolean value) {
        this.requiresPositiveBalance = value;
    }

    /**
     * Ruft den Wert der requiresDeposit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiresDeposit() {
        return requiresDeposit;
    }

    /**
     * Legt den Wert der requiresDeposit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiresDeposit(Boolean value) {
        this.requiresDeposit = value;
    }

    /**
     * Ruft den Wert der noCashPayment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoCashPayment() {
        return noCashPayment;
    }

    /**
     * Legt den Wert der noCashPayment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoCashPayment(Boolean value) {
        this.noCashPayment = value;
    }

    /**
     * Ruft den Wert der hasPurchaseConditions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPurchaseConditions() {
        return hasPurchaseConditions;
    }

    /**
     * Legt den Wert der hasPurchaseConditions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPurchaseConditions(Boolean value) {
        this.hasPurchaseConditions = value;
    }

    /**
     * Ruft den Wert der hasDynamicPricing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasDynamicPricing() {
        return hasDynamicPricing;
    }

    /**
     * Legt den Wert der hasDynamicPricing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasDynamicPricing(Boolean value) {
        this.hasDynamicPricing = value;
    }

    /**
     * Ruft den Wert der requiresReservation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiresReservation() {
        return requiresReservation;
    }

    /**
     * Legt den Wert der requiresReservation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiresReservation(Boolean value) {
        this.requiresReservation = value;
    }

    /**
     * Ruft den Wert der hasReservationFee-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasReservationFee() {
        return hasReservationFee;
    }

    /**
     * Legt den Wert der hasReservationFee-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasReservationFee(Boolean value) {
        this.hasReservationFee = value;
    }

    /**
     * Ruft den Wert der hasQuota-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasQuota() {
        return hasQuota;
    }

    /**
     * Legt den Wert der hasQuota-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasQuota(Boolean value) {
        this.hasQuota = value;
    }

    /**
     * Ruft den Wert der penaltyIfWithoutTicket-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPenaltyIfWithoutTicket() {
        return penaltyIfWithoutTicket;
    }

    /**
     * Legt den Wert der penaltyIfWithoutTicket-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPenaltyIfWithoutTicket(Boolean value) {
        this.penaltyIfWithoutTicket = value;
    }

    /**
     * Ruft den Wert der availableOnSubscription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailableOnSubscription() {
        return availableOnSubscription;
    }

    /**
     * Legt den Wert der availableOnSubscription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailableOnSubscription(Boolean value) {
        this.availableOnSubscription = value;
    }

    /**
     * Ruft den Wert der unlimitedMileage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnlimitedMileage() {
        return unlimitedMileage;
    }

    /**
     * Legt den Wert der unlimitedMileage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnlimitedMileage(Boolean value) {
        this.unlimitedMileage = value;
    }

    /**
     * Ruft den Wert der likeForLikeRefuelling-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLikeForLikeRefuelling() {
        return likeForLikeRefuelling;
    }

    /**
     * Legt den Wert der likeForLikeRefuelling-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLikeForLikeRefuelling(Boolean value) {
        this.likeForLikeRefuelling = value;
    }

    /**
     * Ruft den Wert der vehicleCollection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCollectionEnumeration }
     *     
     */
    public VehicleCollectionEnumeration getVehicleCollection() {
        return vehicleCollection;
    }

    /**
     * Legt den Wert der vehicleCollection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCollectionEnumeration }
     *     
     */
    public void setVehicleCollection(VehicleCollectionEnumeration value) {
        this.vehicleCollection = value;
    }

}
