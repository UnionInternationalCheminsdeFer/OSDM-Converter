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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for USAGE VALIDITY PERIOD.
 * 
 * <p>Java-Klasse f�r UsageValidityPeriod_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UsageValidityPeriod_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}UsageValidityPeriodGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageValidityPeriod_VersionStructure", propOrder = {
    "validityPeriodType",
    "usageTrigger",
    "usageEnd",
    "standardDuration",
    "activationMeans",
    "startDate",
    "startTime",
    "endDate",
    "endTime",
    "usageStartConstraintType",
    "startOnlyOn",
    "fixedStartWindow",
    "blackoutUse"
})
@XmlSeeAlso({
    UsageValidityPeriod.class
})
public class UsageValidityPeriodVersionStructure
    extends UsageParameterVersionStructure
{

    @XmlElement(name = "ValidityPeriodType")
    @XmlSchemaType(name = "normalizedString")
    protected UsageValidityTypeEnumeration validityPeriodType;
    @XmlElement(name = "UsageTrigger")
    @XmlSchemaType(name = "normalizedString")
    protected UsageTriggerEnumeration usageTrigger;
    @XmlElement(name = "UsageEnd")
    @XmlSchemaType(name = "normalizedString")
    protected UsageEndEnumeration usageEnd;
    @XmlElement(name = "StandardDuration")
    protected Duration standardDuration;
    @XmlElement(name = "ActivationMeans")
    @XmlSchemaType(name = "normalizedString")
    protected ActivationMeansEnumeration activationMeans;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "EndTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "UsageStartConstraintType", defaultValue = "variable")
    @XmlSchemaType(name = "normalizedString")
    protected UsageStartConstraintTypeEnumeration usageStartConstraintType;
    protected UsageValidityPeriodVersionStructure.StartOnlyOn startOnlyOn;
    @XmlElement(name = "FixedStartWindow")
    protected FixedStartWindowStructure fixedStartWindow;
    @XmlElement(name = "BlackoutUse")
    @XmlSchemaType(name = "normalizedString")
    protected BlackoutStartEnumeration blackoutUse;

    /**
     * Ruft den Wert der validityPeriodType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UsageValidityTypeEnumeration }
     *     
     */
    public UsageValidityTypeEnumeration getValidityPeriodType() {
        return validityPeriodType;
    }

    /**
     * Legt den Wert der validityPeriodType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageValidityTypeEnumeration }
     *     
     */
    public void setValidityPeriodType(UsageValidityTypeEnumeration value) {
        this.validityPeriodType = value;
    }

    /**
     * Ruft den Wert der usageTrigger-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UsageTriggerEnumeration }
     *     
     */
    public UsageTriggerEnumeration getUsageTrigger() {
        return usageTrigger;
    }

    /**
     * Legt den Wert der usageTrigger-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageTriggerEnumeration }
     *     
     */
    public void setUsageTrigger(UsageTriggerEnumeration value) {
        this.usageTrigger = value;
    }

    /**
     * Ruft den Wert der usageEnd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UsageEndEnumeration }
     *     
     */
    public UsageEndEnumeration getUsageEnd() {
        return usageEnd;
    }

    /**
     * Legt den Wert der usageEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageEndEnumeration }
     *     
     */
    public void setUsageEnd(UsageEndEnumeration value) {
        this.usageEnd = value;
    }

    /**
     * Ruft den Wert der standardDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getStandardDuration() {
        return standardDuration;
    }

    /**
     * Legt den Wert der standardDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setStandardDuration(Duration value) {
        this.standardDuration = value;
    }

    /**
     * Ruft den Wert der activationMeans-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActivationMeansEnumeration }
     *     
     */
    public ActivationMeansEnumeration getActivationMeans() {
        return activationMeans;
    }

    /**
     * Legt den Wert der activationMeans-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationMeansEnumeration }
     *     
     */
    public void setActivationMeans(ActivationMeansEnumeration value) {
        this.activationMeans = value;
    }

    /**
     * Ruft den Wert der startDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Legt den Wert der startDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Ruft den Wert der startTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Legt den Wert der startTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Ruft den Wert der endDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Legt den Wert der endDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Ruft den Wert der endTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Legt den Wert der endTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Ruft den Wert der usageStartConstraintType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UsageStartConstraintTypeEnumeration }
     *     
     */
    public UsageStartConstraintTypeEnumeration getUsageStartConstraintType() {
        return usageStartConstraintType;
    }

    /**
     * Legt den Wert der usageStartConstraintType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageStartConstraintTypeEnumeration }
     *     
     */
    public void setUsageStartConstraintType(UsageStartConstraintTypeEnumeration value) {
        this.usageStartConstraintType = value;
    }

    /**
     * Ruft den Wert der startOnlyOn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UsageValidityPeriodVersionStructure.StartOnlyOn }
     *     
     */
    public UsageValidityPeriodVersionStructure.StartOnlyOn getStartOnlyOn() {
        return startOnlyOn;
    }

    /**
     * Legt den Wert der startOnlyOn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageValidityPeriodVersionStructure.StartOnlyOn }
     *     
     */
    public void setStartOnlyOn(UsageValidityPeriodVersionStructure.StartOnlyOn value) {
        this.startOnlyOn = value;
    }

    /**
     * Ruft den Wert der fixedStartWindow-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FixedStartWindowStructure }
     *     
     */
    public FixedStartWindowStructure getFixedStartWindow() {
        return fixedStartWindow;
    }

    /**
     * Legt den Wert der fixedStartWindow-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedStartWindowStructure }
     *     
     */
    public void setFixedStartWindow(FixedStartWindowStructure value) {
        this.fixedStartWindow = value;
    }

    /**
     * Ruft den Wert der blackoutUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BlackoutStartEnumeration }
     *     
     */
    public BlackoutStartEnumeration getBlackoutUse() {
        return blackoutUse;
    }

    /**
     * Legt den Wert der blackoutUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BlackoutStartEnumeration }
     *     
     */
    public void setBlackoutUse(BlackoutStartEnumeration value) {
        this.blackoutUse = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.netex.org.uk/netex}dayTypes_RelStructure">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StartOnlyOn
        extends DayTypesRelStructure
    {


    }

}
