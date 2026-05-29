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
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for PURCHASE WINDOW.
 * 
 * <p>Java-Klasse f�r PurchaseWindow_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PurchaseWindow_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PurchaseWindowGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseWindow_VersionStructure", propOrder = {
    "purchaseAction",
    "purchaseWhen",
    "latestTime",
    "minimumPeriodBeforeDeparture",
    "minimumPeriodIntervalRef",
    "maximumPeriodBeforeDeparture",
    "maximumPeriodIntervalRef",
    "purchaseMoment"
})
@XmlSeeAlso({
    PurchaseWindow.class
})
public class PurchaseWindowVersionStructure
    extends UsageParameterVersionStructure
{

    @XmlElement(name = "PurchaseAction")
    @XmlSchemaType(name = "normalizedString")
    protected PurchaseActionEnumeration purchaseAction;
    @XmlElement(name = "PurchaseWhen", defaultValue = "advanceAndDayOfTravel")
    @XmlSchemaType(name = "normalizedString")
    protected PurchaseWhenEnumeration purchaseWhen;
    @XmlElement(name = "LatestTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar latestTime;
    @XmlElement(name = "MinimumPeriodBeforeDeparture")
    protected Duration minimumPeriodBeforeDeparture;
    @XmlElement(name = "MinimumPeriodIntervalRef")
    protected TimeIntervalRefStructure minimumPeriodIntervalRef;
    @XmlElement(name = "MaximumPeriodBeforeDeparture")
    protected Duration maximumPeriodBeforeDeparture;
    @XmlElement(name = "MaximumPeriodIntervalRef")
    protected TimeIntervalRefStructure maximumPeriodIntervalRef;
    @XmlList
    @XmlElement(name = "PurchaseMoment")
    protected List<PurchaseMomentEnumeration> purchaseMoment;

    /**
     * Ruft den Wert der purchaseAction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseActionEnumeration }
     *     
     */
    public PurchaseActionEnumeration getPurchaseAction() {
        return purchaseAction;
    }

    /**
     * Legt den Wert der purchaseAction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseActionEnumeration }
     *     
     */
    public void setPurchaseAction(PurchaseActionEnumeration value) {
        this.purchaseAction = value;
    }

    /**
     * Ruft den Wert der purchaseWhen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseWhenEnumeration }
     *     
     */
    public PurchaseWhenEnumeration getPurchaseWhen() {
        return purchaseWhen;
    }

    /**
     * Legt den Wert der purchaseWhen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseWhenEnumeration }
     *     
     */
    public void setPurchaseWhen(PurchaseWhenEnumeration value) {
        this.purchaseWhen = value;
    }

    /**
     * Ruft den Wert der latestTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestTime() {
        return latestTime;
    }

    /**
     * Legt den Wert der latestTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestTime(XMLGregorianCalendar value) {
        this.latestTime = value;
    }

    /**
     * Ruft den Wert der minimumPeriodBeforeDeparture-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumPeriodBeforeDeparture() {
        return minimumPeriodBeforeDeparture;
    }

    /**
     * Legt den Wert der minimumPeriodBeforeDeparture-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumPeriodBeforeDeparture(Duration value) {
        this.minimumPeriodBeforeDeparture = value;
    }

    /**
     * Ruft den Wert der minimumPeriodIntervalRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalRefStructure }
     *     
     */
    public TimeIntervalRefStructure getMinimumPeriodIntervalRef() {
        return minimumPeriodIntervalRef;
    }

    /**
     * Legt den Wert der minimumPeriodIntervalRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalRefStructure }
     *     
     */
    public void setMinimumPeriodIntervalRef(TimeIntervalRefStructure value) {
        this.minimumPeriodIntervalRef = value;
    }

    /**
     * Ruft den Wert der maximumPeriodBeforeDeparture-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumPeriodBeforeDeparture() {
        return maximumPeriodBeforeDeparture;
    }

    /**
     * Legt den Wert der maximumPeriodBeforeDeparture-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumPeriodBeforeDeparture(Duration value) {
        this.maximumPeriodBeforeDeparture = value;
    }

    /**
     * Ruft den Wert der maximumPeriodIntervalRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalRefStructure }
     *     
     */
    public TimeIntervalRefStructure getMaximumPeriodIntervalRef() {
        return maximumPeriodIntervalRef;
    }

    /**
     * Legt den Wert der maximumPeriodIntervalRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalRefStructure }
     *     
     */
    public void setMaximumPeriodIntervalRef(TimeIntervalRefStructure value) {
        this.maximumPeriodIntervalRef = value;
    }

    /**
     * Gets the value of the purchaseMoment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseMoment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseMoment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaseMomentEnumeration }
     * 
     * 
     */
    public List<PurchaseMomentEnumeration> getPurchaseMoment() {
        if (purchaseMoment == null) {
            purchaseMoment = new ArrayList<PurchaseMomentEnumeration>();
        }
        return this.purchaseMoment;
    }

}
