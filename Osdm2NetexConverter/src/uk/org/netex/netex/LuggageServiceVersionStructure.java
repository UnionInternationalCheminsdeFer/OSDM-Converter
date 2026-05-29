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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for LUGGAGE SERVICE.
 * 
 * <p>Java-Klasse f�r LuggageService_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LuggageService_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}LocalService_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}LuggageServiceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LuggageService_VersionStructure", propOrder = {
    "luggageServiceFacilityList",
    "luggageTrolleys",
    "wheelchairLuggageTrolleys",
    "freeToUse",
    "maximumBagWidth",
    "maximumBagHeight",
    "maximumBagDepth",
    "maximumBagWeight",
    "luggageMaximalWeigth"
})
@XmlSeeAlso({
    LuggageService.class
})
public class LuggageServiceVersionStructure
    extends LocalServiceVersionStructure
{

    @XmlList
    @XmlElement(name = "LuggageServiceFacilityList")
    protected List<LuggageServiceFacilityEnumeration> luggageServiceFacilityList;
    @XmlElement(name = "LuggageTrolleys")
    protected Boolean luggageTrolleys;
    @XmlElement(name = "WheelchairLuggageTrolleys")
    protected Boolean wheelchairLuggageTrolleys;
    @XmlElement(name = "FreeToUse")
    protected Boolean freeToUse;
    @XmlElement(name = "MaximumBagWidth")
    protected BigDecimal maximumBagWidth;
    @XmlElement(name = "MaximumBagHeight")
    protected BigDecimal maximumBagHeight;
    @XmlElement(name = "MaximumBagDepth")
    protected BigDecimal maximumBagDepth;
    @XmlElement(name = "MaximumBagWeight")
    protected BigDecimal maximumBagWeight;
    @XmlElement(name = "LuggageMaximalWeigth")
    protected BigDecimal luggageMaximalWeigth;

    /**
     * Gets the value of the luggageServiceFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the luggageServiceFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLuggageServiceFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LuggageServiceFacilityEnumeration }
     * 
     * 
     */
    public List<LuggageServiceFacilityEnumeration> getLuggageServiceFacilityList() {
        if (luggageServiceFacilityList == null) {
            luggageServiceFacilityList = new ArrayList<LuggageServiceFacilityEnumeration>();
        }
        return this.luggageServiceFacilityList;
    }

    /**
     * Ruft den Wert der luggageTrolleys-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLuggageTrolleys() {
        return luggageTrolleys;
    }

    /**
     * Legt den Wert der luggageTrolleys-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLuggageTrolleys(Boolean value) {
        this.luggageTrolleys = value;
    }

    /**
     * Ruft den Wert der wheelchairLuggageTrolleys-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWheelchairLuggageTrolleys() {
        return wheelchairLuggageTrolleys;
    }

    /**
     * Legt den Wert der wheelchairLuggageTrolleys-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWheelchairLuggageTrolleys(Boolean value) {
        this.wheelchairLuggageTrolleys = value;
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
     * Ruft den Wert der maximumBagWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumBagWidth() {
        return maximumBagWidth;
    }

    /**
     * Legt den Wert der maximumBagWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumBagWidth(BigDecimal value) {
        this.maximumBagWidth = value;
    }

    /**
     * Ruft den Wert der maximumBagHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumBagHeight() {
        return maximumBagHeight;
    }

    /**
     * Legt den Wert der maximumBagHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumBagHeight(BigDecimal value) {
        this.maximumBagHeight = value;
    }

    /**
     * Ruft den Wert der maximumBagDepth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumBagDepth() {
        return maximumBagDepth;
    }

    /**
     * Legt den Wert der maximumBagDepth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumBagDepth(BigDecimal value) {
        this.maximumBagDepth = value;
    }

    /**
     * Ruft den Wert der maximumBagWeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumBagWeight() {
        return maximumBagWeight;
    }

    /**
     * Legt den Wert der maximumBagWeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumBagWeight(BigDecimal value) {
        this.maximumBagWeight = value;
    }

    /**
     * Ruft den Wert der luggageMaximalWeigth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLuggageMaximalWeigth() {
        return luggageMaximalWeigth;
    }

    /**
     * Legt den Wert der luggageMaximalWeigth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLuggageMaximalWeigth(BigDecimal value) {
        this.luggageMaximalWeigth = value;
    }

}
