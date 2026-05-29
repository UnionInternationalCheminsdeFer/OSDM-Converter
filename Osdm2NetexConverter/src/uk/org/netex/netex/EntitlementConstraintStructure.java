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
 * Entitlement constraints related product or offe. +v1.1.
 * 
 * <p>Java-Klasse f�r EntitlementConstraintStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EntitlementConstraintStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TimeRelativeConstraintGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}NetworkRelativeConstraintGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ServiceRelativeConstraintGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}EligibilityRelativeConstraintGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntitlementConstraintStructure", propOrder = {
    "periodConstraint",
    "originConstraint",
    "destinationConstraint",
    "tariffZoneConstraint",
    "routeConstraint",
    "directionConstraint",
    "operatorConstraint",
    "typeOfProductCategoryConstraint",
    "classOfUseConstraint",
    "typeOfTravelDocumentConstraint",
    "journeyConstraint",
    "userConstraint",
    "specificToProfiles"
})
public class EntitlementConstraintStructure {

    @XmlElement(name = "PeriodConstraint")
    @XmlSchemaType(name = "normalizedString")
    protected SamePeriodEnumeration periodConstraint;
    @XmlElement(name = "OriginConstraint")
    @XmlSchemaType(name = "normalizedString")
    protected SameStopEnumeration originConstraint;
    @XmlElement(name = "DestinationConstraint")
    @XmlSchemaType(name = "normalizedString")
    protected SameStopEnumeration destinationConstraint;
    @XmlElement(name = "TariffZoneConstraint")
    @XmlSchemaType(name = "normalizedString")
    protected SameZoneEnumeration tariffZoneConstraint;
    @XmlElement(name = "RouteConstraint")
    @XmlSchemaType(name = "normalizedString")
    protected SameRouteEnumeration routeConstraint;
    @XmlElement(name = "DirectionConstraint")
    @XmlSchemaType(name = "normalizedString")
    protected SameRouteEnumeration directionConstraint;
    @XmlElement(name = "OperatorConstraint", defaultValue = "participating")
    @XmlSchemaType(name = "normalizedString")
    protected SameOperatorEnumeration operatorConstraint;
    @XmlElement(name = "TypeOfProductCategoryConstraint", defaultValue = "sameOrEquivalent")
    @XmlSchemaType(name = "normalizedString")
    protected SameTypeOfProductCategoryEnumeration typeOfProductCategoryConstraint;
    @XmlElement(name = "ClassOfUseConstraint", defaultValue = "sameOrEquivalent")
    @XmlSchemaType(name = "normalizedString")
    protected SameClassOfUseEnumeration classOfUseConstraint;
    @XmlElement(name = "TypeOfTravelDocumentConstraint")
    @XmlSchemaType(name = "normalizedString")
    protected SameTypeOfTravelDocumentEnumeration typeOfTravelDocumentConstraint;
    @XmlElement(name = "JourneyConstraint", defaultValue = "same")
    @XmlSchemaType(name = "normalizedString")
    protected SameJourneyEnumeration journeyConstraint;
    @XmlElement(name = "UserConstraint", defaultValue = "samePerson")
    @XmlSchemaType(name = "normalizedString")
    protected SameUserEnumeration userConstraint;
    protected UserProfileRefsRelStructure specificToProfiles;

    /**
     * Ruft den Wert der periodConstraint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SamePeriodEnumeration }
     *     
     */
    public SamePeriodEnumeration getPeriodConstraint() {
        return periodConstraint;
    }

    /**
     * Legt den Wert der periodConstraint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SamePeriodEnumeration }
     *     
     */
    public void setPeriodConstraint(SamePeriodEnumeration value) {
        this.periodConstraint = value;
    }

    /**
     * Ruft den Wert der originConstraint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SameStopEnumeration }
     *     
     */
    public SameStopEnumeration getOriginConstraint() {
        return originConstraint;
    }

    /**
     * Legt den Wert der originConstraint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SameStopEnumeration }
     *     
     */
    public void setOriginConstraint(SameStopEnumeration value) {
        this.originConstraint = value;
    }

    /**
     * Ruft den Wert der destinationConstraint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SameStopEnumeration }
     *     
     */
    public SameStopEnumeration getDestinationConstraint() {
        return destinationConstraint;
    }

    /**
     * Legt den Wert der destinationConstraint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SameStopEnumeration }
     *     
     */
    public void setDestinationConstraint(SameStopEnumeration value) {
        this.destinationConstraint = value;
    }

    /**
     * Ruft den Wert der tariffZoneConstraint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SameZoneEnumeration }
     *     
     */
    public SameZoneEnumeration getTariffZoneConstraint() {
        return tariffZoneConstraint;
    }

    /**
     * Legt den Wert der tariffZoneConstraint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SameZoneEnumeration }
     *     
     */
    public void setTariffZoneConstraint(SameZoneEnumeration value) {
        this.tariffZoneConstraint = value;
    }

    /**
     * Ruft den Wert der routeConstraint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SameRouteEnumeration }
     *     
     */
    public SameRouteEnumeration getRouteConstraint() {
        return routeConstraint;
    }

    /**
     * Legt den Wert der routeConstraint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SameRouteEnumeration }
     *     
     */
    public void setRouteConstraint(SameRouteEnumeration value) {
        this.routeConstraint = value;
    }

    /**
     * Ruft den Wert der directionConstraint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SameRouteEnumeration }
     *     
     */
    public SameRouteEnumeration getDirectionConstraint() {
        return directionConstraint;
    }

    /**
     * Legt den Wert der directionConstraint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SameRouteEnumeration }
     *     
     */
    public void setDirectionConstraint(SameRouteEnumeration value) {
        this.directionConstraint = value;
    }

    /**
     * Ruft den Wert der operatorConstraint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SameOperatorEnumeration }
     *     
     */
    public SameOperatorEnumeration getOperatorConstraint() {
        return operatorConstraint;
    }

    /**
     * Legt den Wert der operatorConstraint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SameOperatorEnumeration }
     *     
     */
    public void setOperatorConstraint(SameOperatorEnumeration value) {
        this.operatorConstraint = value;
    }

    /**
     * Ruft den Wert der typeOfProductCategoryConstraint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SameTypeOfProductCategoryEnumeration }
     *     
     */
    public SameTypeOfProductCategoryEnumeration getTypeOfProductCategoryConstraint() {
        return typeOfProductCategoryConstraint;
    }

    /**
     * Legt den Wert der typeOfProductCategoryConstraint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SameTypeOfProductCategoryEnumeration }
     *     
     */
    public void setTypeOfProductCategoryConstraint(SameTypeOfProductCategoryEnumeration value) {
        this.typeOfProductCategoryConstraint = value;
    }

    /**
     * Ruft den Wert der classOfUseConstraint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SameClassOfUseEnumeration }
     *     
     */
    public SameClassOfUseEnumeration getClassOfUseConstraint() {
        return classOfUseConstraint;
    }

    /**
     * Legt den Wert der classOfUseConstraint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SameClassOfUseEnumeration }
     *     
     */
    public void setClassOfUseConstraint(SameClassOfUseEnumeration value) {
        this.classOfUseConstraint = value;
    }

    /**
     * Ruft den Wert der typeOfTravelDocumentConstraint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SameTypeOfTravelDocumentEnumeration }
     *     
     */
    public SameTypeOfTravelDocumentEnumeration getTypeOfTravelDocumentConstraint() {
        return typeOfTravelDocumentConstraint;
    }

    /**
     * Legt den Wert der typeOfTravelDocumentConstraint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SameTypeOfTravelDocumentEnumeration }
     *     
     */
    public void setTypeOfTravelDocumentConstraint(SameTypeOfTravelDocumentEnumeration value) {
        this.typeOfTravelDocumentConstraint = value;
    }

    /**
     * Ruft den Wert der journeyConstraint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SameJourneyEnumeration }
     *     
     */
    public SameJourneyEnumeration getJourneyConstraint() {
        return journeyConstraint;
    }

    /**
     * Legt den Wert der journeyConstraint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SameJourneyEnumeration }
     *     
     */
    public void setJourneyConstraint(SameJourneyEnumeration value) {
        this.journeyConstraint = value;
    }

    /**
     * Ruft den Wert der userConstraint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SameUserEnumeration }
     *     
     */
    public SameUserEnumeration getUserConstraint() {
        return userConstraint;
    }

    /**
     * Legt den Wert der userConstraint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SameUserEnumeration }
     *     
     */
    public void setUserConstraint(SameUserEnumeration value) {
        this.userConstraint = value;
    }

    /**
     * Ruft den Wert der specificToProfiles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserProfileRefsRelStructure }
     *     
     */
    public UserProfileRefsRelStructure getSpecificToProfiles() {
        return specificToProfiles;
    }

    /**
     * Legt den Wert der specificToProfiles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserProfileRefsRelStructure }
     *     
     */
    public void setSpecificToProfiles(UserProfileRefsRelStructure value) {
        this.specificToProfiles = value;
    }

}
