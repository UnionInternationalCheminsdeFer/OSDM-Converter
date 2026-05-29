//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

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


/**
 * Type for MINIMUM STAY.
 * 
 * <p>Java-Klasse f�r MinimumStay_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MinimumStay_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}MinimumStayGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MinimumStay_VersionStructure", propOrder = {
    "minimumStayType",
    "requiresNightsAway",
    "minimumNumberOfNightsAway",
    "maximumNumberOfNightsAway"
})
@XmlSeeAlso({
    MinimumStay.class
})
public class MinimumStayVersionStructure
    extends UsageParameterVersionStructure
{

    @XmlElement(name = "MinimumStayType")
    @XmlSchemaType(name = "normalizedString")
    protected MinimumStayTypeEnumeration minimumStayType;
    @XmlList
    @XmlElement(name = "RequiresNightsAway")
    protected List<DayOfWeekEnumeration> requiresNightsAway;
    @XmlElement(name = "MinimumNumberOfNightsAway")
    protected BigInteger minimumNumberOfNightsAway;
    @XmlElement(name = "MaximumNumberOfNightsAway")
    protected BigInteger maximumNumberOfNightsAway;

    /**
     * Ruft den Wert der minimumStayType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MinimumStayTypeEnumeration }
     *     
     */
    public MinimumStayTypeEnumeration getMinimumStayType() {
        return minimumStayType;
    }

    /**
     * Legt den Wert der minimumStayType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumStayTypeEnumeration }
     *     
     */
    public void setMinimumStayType(MinimumStayTypeEnumeration value) {
        this.minimumStayType = value;
    }

    /**
     * Gets the value of the requiresNightsAway property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiresNightsAway property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiresNightsAway().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayOfWeekEnumeration }
     * 
     * 
     */
    public List<DayOfWeekEnumeration> getRequiresNightsAway() {
        if (requiresNightsAway == null) {
            requiresNightsAway = new ArrayList<DayOfWeekEnumeration>();
        }
        return this.requiresNightsAway;
    }

    /**
     * Ruft den Wert der minimumNumberOfNightsAway-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumNumberOfNightsAway() {
        return minimumNumberOfNightsAway;
    }

    /**
     * Legt den Wert der minimumNumberOfNightsAway-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumNumberOfNightsAway(BigInteger value) {
        this.minimumNumberOfNightsAway = value;
    }

    /**
     * Ruft den Wert der maximumNumberOfNightsAway-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfNightsAway() {
        return maximumNumberOfNightsAway;
    }

    /**
     * Legt den Wert der maximumNumberOfNightsAway-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfNightsAway(BigInteger value) {
        this.maximumNumberOfNightsAway = value;
    }

}
